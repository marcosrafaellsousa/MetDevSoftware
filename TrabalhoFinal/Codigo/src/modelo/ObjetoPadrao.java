package modelo;

public abstract class ObjetoPadrao {

    private final long id;
    private static long ultimoId = 0;

    public ObjetoPadrao() {
        this.id = ultimoId;
        ultimoId++;
    }

    public long getId() {
        return id;
    }

}
