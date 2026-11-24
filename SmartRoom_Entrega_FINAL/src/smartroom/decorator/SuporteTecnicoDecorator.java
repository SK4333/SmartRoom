package smartroom.decorator;
import smartroom.decorator.ReservaDecorator;
import smartroom.decorator.ComponenteReserva;

public class SuporteTecnicoDecorator extends ReservaDecorator {
    public SuporteTecnicoDecorator(ComponenteReserva reserva) {
        super(reserva);
    }

    @Override
    public String getDescricao() {
        return reserva.getDescricao() + " + Suporte Técnico";
    }

    @Override
    public double getCusto() {
        return reserva.getCusto() + 60.00;
    }
}
