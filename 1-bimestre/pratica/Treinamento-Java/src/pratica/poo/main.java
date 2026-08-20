package pratica.poo;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // we create an object from the ArrayList class named integers
        ArrayList<Integer> integers = new ArrayList<>();

// let's add the values 15, 34, 65, 111 to the integers object
        integers.add(15);
        integers.add(34);
        integers.add(65);
        integers.add(111);

// we print the size of the integers object
        System.out.println(integers.size());

    }
}
