public class Principal {

    public static void main (String args[]) {

        Horista horista1 = new Horista("hor", "ista1", 80.0,20.0);
        Horista horista2 = new Horista("hori", "sta2", 100.0,15.0);
        Administrador administrador1 = new Administrador("ad","iministrador1",2500.00);
        Administrador administrador2 = new Administrador("adi","ministrador2",3000.00);
        Administrador administrador3 = new Administrador("adim","inistrador3",3500.00);
        Administrador administrador4 = new Administrador("adimi","nistrador4",4000.00);
        Comissionado comissionado1 = new Comissionado("com","issionado1",1200.00,
                15000.00,0.05);
        Comissionado comissionado2 = new Comissionado("comi","ssionado2",1400.00,
                20000.00,0.04);
        Comissionado comissionado3 = new Comissionado("comis","sionado3",1600.00,
                25000.00,0.03);
        Gerente gerente1 = new Gerente("ger","ente1",3500.00,500.00);

        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = horista1;
        funcionarios[1] = horista2;
        funcionarios[2] = administrador1;
        funcionarios[3] = administrador2;
        funcionarios[4] = administrador3;
        funcionarios[5] = administrador4;
        funcionarios[6] = comissionado1;
        funcionarios[7] = comissionado2;
        funcionarios[8] = comissionado3;
        funcionarios[9] = gerente1;

        for (int i = 0; i < 10; i++) {
            System.out.println("funcionario: " + funcionarios[i].toString());
            System.out.println("salario" + String.format("%.2f",funcionarios[i].calcularSalario()));
        }
    }
}
