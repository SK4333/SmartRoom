package smartroom.model;

public class Laboratorio extends Sala {
    private int quantidadeComputadores;

    public Laboratorio(String codigo) {
        super(codigo, 30, 180.00, true);
        this.quantidadeComputadores = 30;
    }

    public int getQuantidadeComputadores() {
        return quantidadeComputadores;
    }

    @Override
    public String getDescricaoBase() {
        return "Laboratório " + codigo + " - " + capacidade
                + " lugares e " + quantidadeComputadores + " computadores";
    }
}
