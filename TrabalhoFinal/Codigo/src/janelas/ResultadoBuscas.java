package janelas;

import modelo.Carro;
import modelo.Locadora;

import javax.swing.*;
import java.util.List;

public class ResultadoBuscas {

    public static void mostrarResultadoCarros(List<Carro> carros) {
        JOptionPane.showMessageDialog(null, carros.toArray());
        JanelaPrincipal.obtemInstancia().menuPrincipal();
    }

    public static void mostrarResultadoLocadoras(List<Locadora> locadoras) {
        JOptionPane.showMessageDialog(null, locadoras.toArray());
        JanelaPrincipal.obtemInstancia().menuPrincipal();
    }
}
