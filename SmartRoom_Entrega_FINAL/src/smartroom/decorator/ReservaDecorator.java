package smartroom.decorator;
import smartroom.decorator.ComponenteReserva;

public abstract class ReservaDecorator implements ComponenteReserva {
    protected ComponenteReserva reserva;

    public ReservaDecorator(ComponenteReserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String getDescricao() {
        return reserva.getDescricao();
    }

    @Override
    public double getCusto() {
        return reserva.getCusto();
    }
}
