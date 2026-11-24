package smartroom.factory;

import smartroom.model.Auditorio;
import smartroom.model.Sala;

/** Fábrica concreta responsável por criar Auditorio. */
public class AuditorioFactory extends SalaFactory {
    @Override
    public Sala criarSala(String codigo) {
        return new Auditorio(codigo);
    }
}
