package EmpregadoEmpresa;

public class EmpregadoEmpresaPrograma {
    public static void main (String args[]){

        Endereco endereco1 = new Endereco("cazalbe",30,"Qd 42 Lt 6","81234-607",
                "Tiradentes","Sao FransTokyo","PR");

        Endereco endereco2 = new Endereco("32 pes",1,"sem","43567-123",
                "Samambaia","Venetia","FT");

        Empresa empresa1 = new Empresa("314324325","Fanta(sia)",endereco1);
        Empresa empresa2 = new Empresa("123214354","O Mundo",endereco2);

        Empregado empregado1 = new Empregado("Kenshiro","0001",empresa1);
        Empregado empregado2 = new Empregado("Savio dos Santos","1054",empresa1);
        Empregado empregado3 = new Empregado("Alela Moreiroa","1123",empresa2);
        Empregado empregado4 = new Empregado("Tarzan","4452",empresa2);
        Empregado empregado5 = new Empregado("Liza Liza","3214",empresa2);

        System.out.println(empresa1);
        System.out.println();
        System.out.println(empresa2);
        System.out.println();
        System.out.println(empregado1);
        System.out.println();
        System.out.println(empregado2);
        System.out.println();
        System.out.println(empregado3);
        System.out.println();
        System.out.println(empregado4);
        System.out.println();
        System.out.println(empregado5);
        System.out.println();
    }
}
