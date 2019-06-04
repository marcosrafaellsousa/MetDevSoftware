import javax.swing.*;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class Principal {

    public static void main(String[] args) {

        DecimalFormat dc = new DecimalFormat("0,00");
        Calc c = new Calc();


        boolean continuar = true;

        while (continuar == true) {
            try {

                int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Entre com o primeiro número:"));
                if (n1 < 0) {
                    throw new NumeroNegativo();
                }
                c.n1 = n1;

                int  n2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Entre com o segundo número:"));
                if (n2 < 0) {
                    throw new NumeroNegativo();
                }
                c.n2 = n2;

                double soma = c.somar();
                double subtracao = c.diminuir();
                double multiplicacao = c.multiplicar();
                double divisao = c.dividir();

                JOptionPane.showMessageDialog(null,
                        "Soma : " + dc.format(soma));
                JOptionPane.showMessageDialog(null,
                        "Subtração : " + dc.format(subtracao));
                JOptionPane.showMessageDialog(null,
                        "Multiplicação : " + dc.format(multiplicacao));
                JOptionPane.showMessageDialog(null,
                        "Divisão : " + dc.format(divisao));

                continuar = false;
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null,
                        "Entrada de dados inválida! Digite novamente");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Valor inválido! Digite novamente");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        "O segundo numero não pode ser zero! Digite novamente");
            } catch (NumeroNegativo e) {
                JOptionPane.showMessageDialog(null,
                        "Os numeros não podem ser negativos! Digite novamente");
            }
        }
    }
}
