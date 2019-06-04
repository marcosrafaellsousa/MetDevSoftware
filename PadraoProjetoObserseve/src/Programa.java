public class Programa {

    public static void main (String args []) {
        Assinante assinante1 = new AssinanteAnual("Joao");
        Assinante assinante2 = new AssinanteMensal("Maria");

        RevistaVeja revistaVeja = new RevistaVeja("Arnold Schwarzenegger leva voadora", "1.0");
        revistaVeja.registrarAssinante(assinante1);
        revistaVeja.registrarAssinante(assinante2);

        revistaVeja.setEdicao("1.1");

        revistaVeja.setEdicao("1.2");
    }
}
