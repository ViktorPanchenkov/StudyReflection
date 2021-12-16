package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionLern {



    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Vasia");
        Person person2 = new Person("Kolia");

        list.add(person1);
        list.add(person2);

        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);

        list.remove(person1);

        System.out.println(person1FromCollection);
        System.out.println(person2FromCollection);
    }
}
