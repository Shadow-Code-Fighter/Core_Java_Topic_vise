package Functional_Interface;

import java.util.function.Predicate;

//Predicate Functional Interface:- Predicate is a functional inteface that takes 
//input and produces a boolean result.
public class PredicateFI {
    public static void main(String[] args) {
        Predicate<Integer> val = x->x%2==0;//reutrn given no is even or no
        boolean result = val.test(10);//In predicate has test method.
        System.out.println(result);

        Predicate<Integer> val1 = x->x%2!=0;//reutrn given no is even or no
        boolean result1 = val1.test(13);
        System.out.println(result1);

        Predicate<String> str = x->x.equals("mike");
        boolean result2 = str.test("stallin");
        System.out.println(result2);

    }
}
