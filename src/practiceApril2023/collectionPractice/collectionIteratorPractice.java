package practiceApril2023.collectionPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class collectionIteratorPractice {

    public static void main(String[] args){
        setDemo();
        mapDemo();
    }
    public static void setDemo(){

    Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        ///Iterator options

        var it = fruit.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String item: fruit){
            System.out.println(item);
        }

        fruit.forEach(x -> System.out.println(x));

    }
    public static void mapDemo(){
        Map<String, Integer> fruitCal = new HashMap();
        fruitCal.put("apple", 95);
        fruitCal.put("lemon", 20);
        fruitCal.put("banana", 105);
        fruitCal.put("orange", 45);
        fruitCal.put("lemon", 17);

        System.out.println(fruitCal.size());
        System.out.println(fruitCal);

        for(var entry: fruitCal.entrySet()){
            System.out.println(entry.getValue());
        }
        fruitCal.forEach((k,v)
                -> System.out.println("Fruit: " + k + ", " +
                "Calories: " + v));

    }
    }


