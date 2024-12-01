package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class CarRunner {
    public static void main(String[] args) {
        
        List<Car> li = new ArrayList<>();

        li.add(new Car("Maruthi Suzuki", "Suzuki", 100000));
        li.add(new Car("Tata Hariear", "TATA", 4000000));
        li.add(new Car("Hyundai Alcazar", "Hyundai",5000000));
        li.add(new Car("Fourtuner", "Toyota", 7000000));
        li.add(new Car("Curbb","TATA", 200000));

        System.out.println("Iterator");
        Iterator<Car> i = li.iterator();
        li.stream().forEach(ref->System.out.println(ref));

        System.out.println("------------------------------------");

        while (i.hasNext()) {
            Car car = i.next();
            System.out.println(car);
        }

        System.out.println("------------------------------------");

        System.out.println("List Iterator");

        ListIterator<Car> lI = li.listIterator();
        li.stream().sorted((ref1, ref2)-> ref2.getName().compareTo(ref1.getName())).forEach(ref->System.out.println(ref));

        System.out.println(li.equals(lI));

        li.stream().filter(ref->ref.getName()
        .startsWith("M")).forEach(ref->System.out.println(ref));

        System.out.println("-----------------------------------------");

        li.stream().sorted((ref1, ref2)->Double.compare(ref2.getPrice(), ref1.getPrice()))
        .forEach(ref->System.out.println(ref));

        System.out.println("-----------------------------------------");


        //List allow duplicates
        li.add(new Car("Fourtuner", "Toyota", 7000000));
        li.stream().forEach(ref->System.out.println(ref));

        System.out.println("-----------------------------------------");

        Set<Car> set = new HashSet<>();
        set.add(new Car("Nano", "TATA", 200000));
        set.add(new Car("Vitara Breza", "Suzuki", 1400000));

        set.stream().forEach(ref->System.out.println(ref));

        System.out.println("-----------------------------------------");

        set.add(new Car("Nano", "TATA", 200000));
        set.stream().forEach(ref->System.out.println(ref));

        System.out.println(set.hashCode());

        System.out.println("-----------------------------------------");

        System.out.println("This is linked ist");
        List<Car> li1 = new LinkedList<>();

        li1.add(new Car("Gloster", "MG", 4700000));
        li1.add(new Car("I20", "Hyundai", 1100000));

        
        li1.stream().forEach(ref->System.out.println(ref));
        System.out.println("Total elements in set are: "+li1.size());

        System.out.println("-----------------------------------------");

        Set<Car> set1 = new HashSet<>();
        set1.add(new Car("BMWX4", "BMW", 10000000));
        set1.add(new Car("Supra", "Toyota", 9999999));
        set1.add(new Car("Supra", "Toyota", 9999999));

        set1.stream().forEach(ref->System.out.println(ref));
        System.out.println("Total size of Set is: "+set1.size());

        System.out.println("-----------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(20);
        set2.add(20);
        System.out.println("The size of set is: "+set2.size());

        System.out.println("-----------------------------------------");

        List<Integer> li2 = new LinkedList<>();
        li2.add(20);
        li2.add(20);
        System.out.println("The size of list is: "+li2.size());

        System.out.println("-----------------------------------------");

        Car car1 = new Car("THAR", "Mahindra", 2200000);
        Car car2 = new Car("Tata Punch", "TATA", 1200000);

        Car car3 = new Car("Tata Punch", "TATA", 1200000);

        Set<Car> set3 = new LinkedHashSet<>();
        set3.add(car1);
        set3.add(car2);
        set3.add(car3);

        set3.stream().forEach(ref->System.out.println(ref));
        System.err.println("The size is: "+set3.size());

        set3.stream().forEach(ref->System.out.println(ref.hashCode()));

        


    }
}
