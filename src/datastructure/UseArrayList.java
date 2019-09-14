package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> name = new ArrayList<String>();
        LinkedList linkedList = new LinkedList();
        // adding names
        name.add("jakir");
        name.add("jamil");
        name.add("khoyer");
        name.add("hussain");
        name.add("Hisham");
        name.add("jason");


        for (int i = 0; i < name.size(); i++) {
            //System.out.println(name);
            System.out.println(name.get(i));
        }
        System.out.println("*****REMOVE INDEX*****");

        name.remove(2);
        for (int j = 0; j < name.size(); j++) {
            System.out.println(name.get(j));
        }
        System.out.println("***********GET PEEK & GET ELEMENT*********");

        linkedList.add("Mr a");
        linkedList.add("Mr x");
        linkedList.add("Mr z");

        //for (int k = 0; k < linkedList.size(); k++) {

        Iterator iterator = linkedList.iterator();

        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());

       while (iterator.hasNext())
           System.out.print(iterator.next()+  " ");
        System.out.println();


        }
}



