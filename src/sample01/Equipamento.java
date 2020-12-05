package sample01;

public class Equipamento implements Ligavel {
    private boolean ligado;

    @Override
    public void liga() {
        if (ligado) return;
        ligado = true;
    }

    @Override
    public void desliga() {
        if (!ligado) return;
        ligado = false;
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    void inverte() {
        ligado = !ligado;
    }
}

interface Ligavel {
    void liga();
    void desliga();
    boolean estaLigado();
}