package smartroom.model;

public class SalaAula extends Sala {
    public SalaAula(String codigo) {
        super(codigo, 40, 100.00, false);
    }

    @Override
    public String getDescricaoBase() {
        return "Sala de aula " + codigo + " - " + capacidade + " lugares";
    }
}
