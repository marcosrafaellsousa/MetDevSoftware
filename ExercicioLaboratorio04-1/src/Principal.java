import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList <ProgramaTV>();

        ProgramaTV p = new ProgramaTV("O outro lado do paraíso","Novela");
        p.diretor = new Pessoa("Diretor 1", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Orgulho e Paixão","Novela");
        p.diretor = new Pessoa("Diretor 2", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Marley e eu","Filme");
        p.diretor = new Pessoa("Diretor 3", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Show Ivete Sangalo","Show");
        p.diretor = new Pessoa("Diretor 4", "Brasileiro");
        p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
        programas.add(p);

        p = new Serie("Smallvile","Serie",10,100);
        p.diretor = new Pessoa("Robin Williams","Americano");
        p.setArtistas(new Pessoa("Ator  Smallvile","Americano"));
        p.setArtistas(new Pessoa("Outro Ator","Canadense"));
        programas.add(p);

        p = new Serie("Supernatural","Serie",19,190);
        p.diretor = new Pessoa("John Who","Americano");
        p.setArtistas(new Pessoa("Primeiro Irmao","Ingles"));
        p.setArtistas(new Pessoa("Segundo Irmao","Americano"));
        programas.add(p);

        for (int i=0;i<programas.size();i++) {
            System.out.println(programas.get(i));
        }
    }
}
