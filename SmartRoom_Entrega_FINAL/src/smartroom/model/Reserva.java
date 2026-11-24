package smartroom.model;
import smartroom.decorator.ComponenteReserva;
import smartroom.observer.ReservaObserver;
import smartroom.model.Usuario;
import smartroom.model.Sala;
import smartroom.model.StatusReserva;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva implements ComponenteReserva {
    private Usuario solicitante;
    private Sala sala;
    private LocalDateTime dataHora;
    private StatusReserva status;
    private List<ReservaObserver> observadores;

    public Reserva(Usuario solicitante, Sala sala, LocalDateTime dataHora) {
        this.solicitante = solicitante;
        this.sala = sala;
        this.dataHora = dataHora;
        this.status = StatusReserva.PENDENTE;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(ReservaObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(ReservaObserver observador) {
        observadores.remove(observador);
    }

    public void alterarStatus(StatusReserva novoStatus) {
        status = novoStatus;
        System.out.println("\nStatus alterado para: " + status);
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ReservaObserver observador : observadores) {
            observador.atualizar(status, this);
        }
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public Sala getSala() {
        return sala;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public StatusReserva getStatus() {
        return status;
    }

    @Override
    public String getDescricao() {
        return "Reserva de " + solicitante.getNome() + " - "
                + sala.getDescricaoBase() + " - " + dataHora;
    }

    @Override
    public double getCusto() {
        return sala.getValorBase();
    }
}
