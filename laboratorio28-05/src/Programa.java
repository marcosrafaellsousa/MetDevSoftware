import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String args[]) {
        String fileSeparator = System.getProperty("file.separator");
        String fileName = "funcionarios.txt";
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        try {
            InputStream inputStream = new FileInputStream("src" + fileSeparator + "resources" + fileSeparator + fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                String[] campos = linha.split("#");
                Funcionario funcionario = new Funcionario(campos[0], campos[1].charAt(0), Double.parseDouble(campos[2]), Integer.parseInt(campos[3]));
                listaFuncionarios.add(funcionario);
            }

            double impostoRendaM = 0.0;
            double impostoRendaF = 0.0;

            for (Funcionario funcionario : listaFuncionarios) {
                System.out.println(funcionario.mostraFuncionario());
                if (funcionario.getSexo() == 'M') {
                    impostoRendaM += funcionario.impostoRenda();
                } else if (funcionario.getSexo() == 'F') {
                    impostoRendaF += funcionario.impostoRenda();
                }
            }

            System.out.println(String.format("Imposto de renda total do sexo feminino: %.2f", impostoRendaF ));
            System.out.println(String.format("Imposto de renda total do sexo masculino: %.2f", impostoRendaM ));
            System.out.println(String.format("Imposto de renda total: %.2f", (impostoRendaF + impostoRendaM) ));

        } catch (FileNotFoundException e) {
            System.out.println("o arquivo " + fileName + " nao foi encontrado na pasta resources");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
