package Exercises;

import java.util.HashSet;

public class HashSetExercise {
    public static void main(String[] args) {
        var firstSet = new HashSet<String>();
        firstSet.add("apple");
        firstSet.add("orange");
        firstSet.add("grapes");

        var secondSet = new HashSet<String>();
        secondSet.add("pineapple");
        secondSet.add("orange");
        secondSet.add("banana");

//        var result = firstSet.retainAll(secondSet);
        firstSet.retainAll(secondSet);

        if(!firstSet.isEmpty()){
            System.out.println("Common elements: " + firstSet);
        } else {
            System.out.println("there are not common elements");
        }
    }
}
