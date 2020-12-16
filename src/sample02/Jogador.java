package sample02;

public class Jogador {
    int forca;
    int nivel;
    int pontosAtuais;

    public Jogador(int forca, int nivel, int pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    int ataque() {
        return forca * nivel;
    }

    void atacar(Jogador alvo) {
        alvo.pontosAtuais -= this.ataque();
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "forca=" + forca +
                ", nivel=" + nivel +
                ", pontosAtuais=" + pontosAtuais +
                '}';
    }
}
