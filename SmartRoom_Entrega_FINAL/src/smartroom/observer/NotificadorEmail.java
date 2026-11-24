package smartroom.observer;
import smartroom.model.StatusReserva;
import smartroom.model.Reserva;

public class NotificadorEmail implements ReservaObserver {
    @Override
    public void atualizar(StatusReserva status, Reserva reserva) {
        System.out.println("E-mail simulado para "
                + reserva.getSolicitante().getEmail()
                + ": reserva " + status);
    }
}
