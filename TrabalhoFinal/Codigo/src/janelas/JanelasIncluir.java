package janelas;

import modelo.Carro;
import modelo.Categoria;
import modelo.Locadora;
import modelo.Localizacao;
import repositorio.RepoCarro;
import repositorio.RepoLocadora;

import javax.swing.*;
import java.util.List;

public class JanelasIncluir {

    public static void inclurCarro() {

        JComboBox<Locadora> campoLocadoras = new JComboBox<>();
        List<Locadora> locadoraList = RepoLocadora.obtemInstancia().lista();
        String[] array = new String[locadoraList.size()];
        for(int i = 0; i < array.length; i++) {
            Locadora objeto = locadoraList.get(i);
            array[i] = objeto.getNome() + " - Id: " + objeto.getId();
        }
        campoLocadoras.setModel(new DefaultComboBoxModel(array));
        JTextField campoMarca = new JTextField(10);
        JTextField campoModelo = new JTextField(10);
        JTextField campoAno = new JTextField(5);
        JTextField campoAcessorios = new JTextField(10);
        JTextField campoPreco = new JTextField(10);
        JComboBox<Categoria> campoCategoria = new JComboBox<>();
        campoCategoria.setModel(new DefaultComboBoxModel<>(Categoria.values()));

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Locadora:"));
        myPanel.add(campoLocadoras);
        myPanel.add(new JLabel("marca:"));
        myPanel.add(campoMarca);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("modelo:"));
        myPanel.add(campoModelo);
        myPanel.add(new JLabel("ano:"));
        myPanel.add(campoAno);
        myPanel.add(new JLabel("acessórios:"));
        myPanel.add(campoAcessorios);
        myPanel.add(new JLabel("preço:"));
        myPanel.add(campoPreco);
        myPanel.add(new JLabel("categoria:"));
        myPanel.add(campoCategoria);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Registrar um novo carro", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                Carro carro = new Carro();
                carro.setMarca(campoMarca.getText());
                carro.setModelo(campoModelo.getText());
                carro.setAno(Integer.parseInt(campoAno.getText()));
                carro.setAcessorios(campoAcessorios.getText());
                carro.setPreco(Double.parseDouble(campoPreco.getText()));
                carro.setCategoria((Categoria) campoCategoria.getSelectedItem());

                String opcaoLocadora = (String)campoLocadoras.getSelectedItem();
                String[] partes = (opcaoLocadora).split(" - Id: ");

                RepoLocadora repoLocadora = RepoLocadora.obtemInstancia();
                Locadora locadora = repoLocadora.buscarPorId(Long.parseLong(partes[1]));
                locadora.getCarrosList().add(carro);
                repoLocadora.salvarNoArquivo();
                RepoCarro.obtemInstancia().incluir(carro);
                JanelaPrincipal.obtemInstancia().menuPrincipal();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel criar o carro, campos inválidos!");
                JanelaPrincipal.obtemInstancia().menuPrincipal();
            }
        } else {
            JanelaPrincipal.obtemInstancia().menuPrincipal();
        }
    }

    public static void incluirLocadora() {
        JTextField campoNome = new JTextField(10);
        JTextField campoCnpj = new JTextField(10);
        JTextField campoTelefone = new JTextField(10);
        JTextField campoEndereco = new JTextField(10);
        JTextField campoBairro = new JTextField(10);
        JTextField campoCidade = new JTextField(10);
        JTextField campoEstado = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Nome:"));
        myPanel.add(campoNome);
        myPanel.add(new JLabel("Cnpj:"));
        myPanel.add(campoCnpj);
        myPanel.add(new JLabel("Telefone:"));
        myPanel.add(campoTelefone);
        myPanel.add(new JLabel("Endereco:"));
        myPanel.add(campoEndereco);
        myPanel.add(new JLabel("Bairro:"));
        myPanel.add(campoBairro);
        myPanel.add(new JLabel("Cidade:"));
        myPanel.add(campoCidade);
        myPanel.add(new JLabel("Estado:"));
        myPanel.add(campoEstado);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Registrar uma nova Locadora", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                Locadora locadora = new Locadora();
                locadora.setNome(campoNome.getText());
                locadora.setCnpj(campoCnpj.getText());
                locadora.setTelefone(campoTelefone.getText());
                Localizacao localizacao = new Localizacao();
                localizacao.setEndereco(campoEndereco.getText());
                localizacao.setBairro(campoBairro.getText());
                localizacao.setCidade(campoCidade.getText());
                localizacao.setEstado(campoEstado.getText());
                locadora.setLocalizacao(localizacao);
                RepoLocadora.obtemInstancia().incluir(locadora);
                JanelaPrincipal.obtemInstancia().menuPrincipal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar a nova locadora, campos inválidos!");
                JanelaPrincipal.obtemInstancia().menuPrincipal();
            }
        } else {
            JanelaPrincipal.obtemInstancia().menuPrincipal();
        }
    }
}
