package smartroom.factory;

import smartroom.model.SalaAula;
import smartroom.model.Sala;

/** Fábrica concreta responsável por criar SalaAula. */
public class SalaAulaFactory extends SalaFactory {
    @Override
    public Sala criarSala(String codigo) {
        return new SalaAula(codigo);
    }
}
