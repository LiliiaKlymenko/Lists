package lab;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
@FunctionalInterface
public interface PersonFactory<P extends Person>  {
    P create(String firstname, String secondname);
}
