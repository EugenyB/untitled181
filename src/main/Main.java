package main;

import animals.Dog;
import cars.Car;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//	    Dog d = null;
//	    int a = d.LEGS;
//        System.out.println("a = " + a);
//        d = new Dog();
//        d.setAge(5);
//        System.out.println(d);
//        System.out.println(Integer.toHexString(d.hashCode()));
        new Main().run();
    }

    private void run() {
        List<Integer> list = new ArrayList<>(List.of(1, 6, 8, 3, 5, 7, 2));
        System.out.println(list);
//        for (Integer e : list) {
//            if (e % 2 == 0) list.remove(e);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                list.remove(i);
//            }
//        }
        list.removeIf(t -> t % 2 == 0);
//        list.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer t) {
//                return t % 2 == 0;
//            }
//        });
        System.out.println(list);
    }

    private void run3() {
        Running[] r = new Running[3];
        r[0] = new Car(100, "Ferrari");
        r[1] = new Car(70, "Ford");
        r[2] = new Dog("Tuzik", 20, 3);

        Iterator iterator = Arrays.asList(r).iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }

    private void run2() {
        Dog d1 = new Dog("Tuzik", 20, 3);
        Dog d2 = new Dog("Tuzik", 20, 3);
        Dog d3 = new Dog("Barbos", 10, 9);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));

        Set<Integer> set = new HashSet<>(8, 0.75f);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(8);
        set.add(20);
        set.add(17);
        set.add(16);
//        set.add(0);

        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); ) {
            Integer el = iterator.next();
            System.out.print(el+" ");
        }
        System.out.println();

        System.out.println(set);
    }
}

class MyP implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return t % 2 == 0;
    }
}