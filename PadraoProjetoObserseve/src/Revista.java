import java.util.ArrayList;
import java.util.List;

public abstract class Revista {

    private List<Assinante> assinantes = new ArrayList();

    public void registrarAssinante (Assinante assinante) {
        assinantes.add(assinante);
    }

    public void removerAssinante (Assinante assinante) {
        assinantes.remove(assinante);
    }

    public void notificaAssinantes () {
        for (Assinante assinante : assinantes) {
            assinante.update();
        }
    }
}
