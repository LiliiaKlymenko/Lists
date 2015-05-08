package JDBC;

import java.io.Serializable;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public abstract class Entity implements  Cloneable, Serializable {
    private int id;
    public Entity(){}

    public Entity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
