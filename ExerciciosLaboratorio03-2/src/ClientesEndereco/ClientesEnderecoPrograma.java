package ClientesEndereco;

public class ClientesEnderecoPrograma {
    public static void main (String args[]) {
        Endereco endereco1 = new Endereco("cazalbe",30,"Qd 42 Lt 6","81234-607",
                "Tiradentes","Sao FransTokyo","PR");
        Cliente cliente1 = new Cliente("Jonathan Joestar","123543543654",endereco1);

        Endereco endereco2 = new Endereco("32 pes",1,"sem","43567-123",
                "Samambaia","Venetia","FT");
        Cliente cliente2 = new Cliente("Diego Silva","321454365442",endereco2);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
