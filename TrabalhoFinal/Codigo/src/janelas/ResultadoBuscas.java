package janelas;

import modelo.Carro;
import modelo.Locadora;

import javax.swing.*;
import java.util.List;

public class ResultadoBuscas {

    public static void mostrarResultadoCarros(List<Carro> carros) {
        if (carros.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nao existe nenhum carro cadastrado");
        } else {
            JOptionPane.showMessageDialog(null, carros.toArray());
        }

        JanelaPrincipal.obtemInstancia().menuPrincipal();
    }

    public static void mostrarResultadoLocadoras(List<Locadora> locadoras) {
        if (locadoras.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nao existe nenhuma locadora cadastrada");
        } else {
            JOptionPane.showMessageDialog(null, locadoras.toArray());
        }
        JanelaPrincipal.obtemInstancia().menuPrincipal();
    }
}
