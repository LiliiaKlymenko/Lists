package JDBC;

import java.util.List;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public abstract class AbstractDAO<K, T extends  Entity> {
    public  abstract List<T> findAll();
    public  abstract T findEntityById(K id);
    public abstract boolean delete(K Id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);

}
