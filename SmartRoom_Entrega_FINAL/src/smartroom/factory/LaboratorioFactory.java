package smartroom.factory;

import smartroom.model.Laboratorio;
import smartroom.model.Sala;

/** Fábrica concreta responsável por criar Laboratorio. */
public class LaboratorioFactory extends SalaFactory {
    @Override
    public Sala criarSala(String codigo) {
        return new Laboratorio(codigo);
    }
}
