package sample05;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String indice;
    private List<Conta> contas = new ArrayList<>();

    @Nullable
    private Conta consultar(String indice) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(indice)) {
                return conta;
            }
        }
        return null;
    }
}
