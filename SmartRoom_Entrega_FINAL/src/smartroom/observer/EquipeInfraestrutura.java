package smartroom.observer;
import smartroom.model.StatusReserva;
import smartroom.model.Reserva;

public class EquipeInfraestrutura implements ReservaObserver {
    @Override
    public void atualizar(StatusReserva status, Reserva reserva) {
        System.out.println("Infraestrutura avisada: sala "
                + reserva.getSala().getCodigo() + " - " + status);
    }
}
