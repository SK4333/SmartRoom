package smartroom.observer;
import smartroom.model.StatusReserva;
import smartroom.model.Reserva;

public class LogAuditoria implements ReservaObserver {
    @Override
    public void atualizar(StatusReserva status, Reserva reserva) {
        System.out.println("Auditoria: mudança registrada para "
                + reserva.getSolicitante().getNome() + " - " + status);
    }
}
