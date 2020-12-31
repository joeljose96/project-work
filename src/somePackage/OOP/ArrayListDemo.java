package somePackage.OOP;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // create an empty arraylist with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(20);
        arrlist.add(25);
        arrlist.add(22);
        arrlist.remove("22");
        arrlist.add(77);
        arrlist.add(45);
        System.out.print(arrlist);


        // let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

        // this will print the size of this list
        int retval = arrlist.size();
        System.out.println("Size of list = " + retval);

        //Print an element of the array:
        System.out.println(arrlist.get(3));

        //loop through arrayList

        for (int i = 0; i < arrlist.size(); i++) {
            System.out.println("2 times array obejxts are:" + arrlist.get(i)*2);
        }
    }
}
