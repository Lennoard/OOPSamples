package sample08.contas;

import javax.swing.text.NumberFormatter;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class TesteConta {
    public static void main(String[] args) {
        List<ContaCorrente> contas = contas();
        List<SeguroDeVida> seguros = seguros();
        AuditoriaInterna auditoria = new AuditoriaInterna();

        contas.forEach(auditoria::adicionar);
        seguros.forEach(auditoria::adicionar);

        String tributos = NumberFormat.getCurrencyInstance().format(auditoria.calcularTributos());
        System.out.println("Trubutos: " + tributos);
    }

    private static List<ContaCorrente> contas() {
        List<ContaCorrente> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            lista.add(
                new ContaCorrente(
                    UUID.randomUUID().toString(),
                    Conta.MIN_SALDO + (Conta.MAX_SALDO - Conta.MIN_SALDO) * random.nextDouble()
                )
            );
        }
        return lista;
    }

    private static List<SeguroDeVida> seguros() {
        List<SeguroDeVida> lista = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            lista.add(new SeguroDeVida());
        }
        return lista;
    }
}
