package smartroom;
import smartroom.factory.SalaAulaFactory;
import smartroom.factory.LaboratorioFactory;
import smartroom.model.Sala;
import smartroom.model.Usuario;
import smartroom.model.Reserva;
import smartroom.model.StatusReserva;
import smartroom.decorator.ComponenteReserva;
import smartroom.decorator.ProjetorDecorator;
import smartroom.decorator.CoffeeBreakDecorator;
import smartroom.decorator.SuporteTecnicoDecorator;
import smartroom.observer.NotificadorEmail;
import smartroom.observer.EquipeInfraestrutura;
import smartroom.observer.LogAuditoria;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 1. Criar duas salas usando somente a SalaFactory.
        Sala salaAula = new SalaAulaFactory().criarSala("A101");
        Sala laboratorio = new LaboratorioFactory().criarSala("L202");

        System.out.println("=== SALAS ===");
        mostrarSala(salaAula);
        mostrarSala(laboratorio);

        // 2. Criar usuário e reserva.
        Usuario usuario = new Usuario("João Silva", "joao@email.com");
        Reserva reserva = new Reserva(
                usuario,
                salaAula,
                LocalDateTime.of(2026, 12, 10, 14, 0)
        );

        // 3. Cadastrar os observadores.
        reserva.adicionarObservador(new NotificadorEmail());
        reserva.adicionarObservador(new EquipeInfraestrutura());
        reserva.adicionarObservador(new LogAuditoria());

        // 4. Adicionar recursos extras com Decorator.
        ComponenteReserva reservaCompleta = reserva;
        reservaCompleta = new ProjetorDecorator(reservaCompleta);
        reservaCompleta = new CoffeeBreakDecorator(reservaCompleta);
        reservaCompleta = new SuporteTecnicoDecorator(reservaCompleta);

        System.out.println("\n=== RESUMO DA RESERVA ===");
        System.out.println("Solicitante: " + usuario.getNome());
        System.out.println("Descrição: " + reservaCompleta.getDescricao());
        System.out.printf("Valor total: R$ %.2f%n", reservaCompleta.getCusto());

        // 5. Alterar o status para disparar as notificações.
        reserva.alterarStatus(StatusReserva.CONFIRMADA);
        reserva.alterarStatus(StatusReserva.CANCELADA);
    }

    private static void mostrarSala(Sala sala) {
        System.out.println(sala.getDescricaoBase()
                + " | Valor base: R$ " + String.format("%.2f", sala.getValorBase())
                + " | Aprovação de TI: "
                + (sala.isRequerAprovacaoTI() ? "Sim" : "Não"));
    }
}
