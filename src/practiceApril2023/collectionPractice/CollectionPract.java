package practiceApril2023.collectionPractice;

import practiceApril2023.interfacesPractice.Book;
import practiceApril2023.interfacesPractice.Product;

import java.util.*;

public class CollectionPract {
    public static void main(String[] args) {

        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);


        List ftr = new ArrayList();
        ftr.add("apple");
        ftr.add("lemon");
        ftr.add("banana");
        ftr.add("orange");
        ftr.add("lemon");

        System.out.println(ftr.get(2));
        System.out.println(ftr.size());
        System.out.println(ftr);


        Queue ftrl = new LinkedList();
        ftrl.add("apple");
        ftrl.add("lemon");
        ftrl.add("banana");
        ftrl.add("orange");
        ftrl.add("lemon");

        System.out.println(ftrl.size());
        System.out.println(ftrl);

        ftrl.remove();
        System.out.println(ftrl);
        System.out.println(ftrl.peek());

        Queue ftrl2 = new LinkedList();
        System.out.println(ftrl2.size());
        System.out.println(ftrl2);
        System.out.println(ftrl2.peek());

        System.out.println(ftrl2.poll());
        System.out.println(ftrl2.remove());  //retrieve errors

        Map fruitCal = new HashMap();
        fruitCal.put("apple", 95);
        fruitCal.put("lemon", 20);
        fruitCal.put("banana", 105);
        fruitCal.put("orange", 45);
        fruitCal.put("lemon", 17);


        System.out.println(fruitCal.size());
        System.out.println(fruitCal);

        System.out.println(fruitCal.get("lemon"));

        System.out.println(fruitCal.entrySet());

        fruitCal.remove("orange");
        System.out.println(fruitCal);

        List unchangeableList = List.of("uno", "dos", "tres");
        System.out.println(unchangeableList.size());
        System.out.println(unchangeableList);
        unchangeableList.add("cuatro"); //retrieves error
        unchangeableList.remove(2); //retrieve error
    }
}
