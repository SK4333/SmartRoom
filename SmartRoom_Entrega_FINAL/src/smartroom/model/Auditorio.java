package smartroom.model;

public class Auditorio extends Sala {
    private boolean possuiSistemaSom;

    public Auditorio(String codigo) {
        super(codigo, 120, 300.00, false);
        this.possuiSistemaSom = true;
    }

    public boolean isPossuiSistemaSom() {
        return possuiSistemaSom;
    }

    @Override
    public String getDescricaoBase() {
        return "Auditório " + codigo + " - " + capacidade
                + " lugares, com sistema de som";
    }
}
