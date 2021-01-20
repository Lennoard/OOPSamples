package sample05;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void printHora() {
        System.out.println(String.format("%s:%s:%s", normalizar(hora), normalizar(minutos), normalizar(segundos)));
    }

    public String normalizar(int i) {
        if (i < 10) return "0" + i;
        return String.valueOf(i);
    }
}
