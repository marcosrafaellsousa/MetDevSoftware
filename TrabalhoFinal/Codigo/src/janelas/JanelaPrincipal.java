package janelas;

import repositorio.RepoCarro;
import repositorio.RepoLocadora;

import javax.swing.*;

public final class JanelaPrincipal {

    private static JanelaPrincipal instancia;

    private JanelaPrincipal () {
    }

    public static JanelaPrincipal obtemInstancia () {
        if (instancia == null) {
            instancia = new JanelaPrincipal();
        }
        return instancia;
    }

    public void menuPrincipal () {
        String [] escolha={"Visualizar carros",
                "Visualizar Locadoras","Incluir novo carro", "Incluir nova locadora", "Sair"};
        int resp;
        resp= JOptionPane.showOptionDialog(null, "Trabalho Final",
                "Idade", 0,
                JOptionPane.INFORMATION_MESSAGE, null,
                escolha, escolha[0]);
        switch (resp) {
            case 0:
                ResultadoBuscas.mostrarResultadoCarros(RepoCarro.obtemInstancia().lista());
                break;
            case 1:
                ResultadoBuscas.mostrarResultadoLocadoras(RepoLocadora.obtemInstancia().lista());
                break;
            case 2:
                JanelasIncluir.inclurCarro();
                break;
            case 3:
                JanelasIncluir.incluirLocadora();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
