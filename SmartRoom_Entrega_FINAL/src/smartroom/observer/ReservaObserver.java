package smartroom.observer;
import smartroom.model.StatusReserva;
import smartroom.model.Reserva;

public interface ReservaObserver {
    void atualizar(StatusReserva novoStatus, Reserva reserva);
}
