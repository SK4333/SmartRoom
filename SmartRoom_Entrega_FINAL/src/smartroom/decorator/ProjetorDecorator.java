package smartroom.decorator;
import smartroom.decorator.ReservaDecorator;
import smartroom.decorator.ComponenteReserva;

public class ProjetorDecorator extends ReservaDecorator {
    public ProjetorDecorator(ComponenteReserva reserva) {
        super(reserva);
    }

    @Override
    public String getDescricao() {
        return reserva.getDescricao() + " + Projetor 4K";
    }

    @Override
    public double getCusto() {
        return reserva.getCusto() + 50.00;
    }
}
