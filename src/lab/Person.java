package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class Person {
    String firstname;
    String secondname;

    public Person(String firstname, String secondname) {
        this.firstname = firstname;
        this.secondname = secondname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }

    public static void main(String[] args) {

                System.out.println("\n-- Constructor References --");
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Alexander", "Barchuk");
        System.out.println(person);

        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Person> nonNull = Objects::nonNull;
        Predicate<Person> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        Predicate<Person> isNull_p = Objects::isNull;

        System.out.println(isNull.test(person));
        System.out.println(nonNull.test(person));


        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.add("We love");
        strings.add("Java 8");



        strings

                .stream()
               // .sorted()
                .filter(s -> s.contains("o"))
                .forEach(System.out::println);

    }


}
