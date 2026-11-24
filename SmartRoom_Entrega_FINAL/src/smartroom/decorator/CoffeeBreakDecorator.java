package smartroom.decorator;
import smartroom.decorator.ReservaDecorator;
import smartroom.decorator.ComponenteReserva;

public class CoffeeBreakDecorator extends ReservaDecorator {
    public CoffeeBreakDecorator(ComponenteReserva reserva) {
        super(reserva);
    }

    @Override
    public String getDescricao() {
        return reserva.getDescricao() + " + Coffee Break";
    }

    @Override
    public double getCusto() {
        return reserva.getCusto() + 80.00;
    }
}
