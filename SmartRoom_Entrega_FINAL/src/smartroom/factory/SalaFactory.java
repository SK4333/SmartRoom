package smartroom.factory;

import smartroom.model.Sala;

/** Criador abstrato: define o Factory Method para criar uma sala. */
public abstract class SalaFactory {
    public abstract Sala criarSala(String codigo);
}
