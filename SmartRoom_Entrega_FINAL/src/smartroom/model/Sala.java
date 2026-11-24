package smartroom.model;

public abstract class Sala {
    protected String codigo;
    protected int capacidade;
    protected double valorBase;
    protected boolean requerAprovacaoTI;

    public Sala(String codigo, int capacidade, double valorBase,
                boolean requerAprovacaoTI) {
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.valorBase = valorBase;
        this.requerAprovacaoTI = requerAprovacaoTI;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getValorBase() {
        return valorBase;
    }

    public boolean isRequerAprovacaoTI() {
        return requerAprovacaoTI;
    }

    public abstract String getDescricaoBase();
}
