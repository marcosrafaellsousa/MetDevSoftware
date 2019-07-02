package modelo;

import java.io.Serializable;

public abstract class ObjetoPadrao implements Serializable {

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
