package sample08.contas;

import java.util.ArrayList;
import java.util.List;

public class AuditoriaInterna {
    private final List<Tributavel> tributaveis = new ArrayList<>();

    public void adicionar(Tributavel t) {
        tributaveis.add(t);
    }

    public double calcularTributos() {
        return tributaveis
                .stream()
                .mapToDouble(Tributavel::calcularTributos)
                .sum();
    }
}
