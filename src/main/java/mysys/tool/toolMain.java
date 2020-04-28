package mysys.tool;

import java.util.Arrays;

public class toolMain {

    public static final String OPEN="(";
    public static final String CLOSE=")";

    public static void main(String args[]) {
        System.out.println("start");

        toolMain a = new toolMain();

        final String input = "()))";
        System.out.println(String.format("output: [%d]", a.calcParentheses(input)));
        System.out.println("done!");
    }

    public int calcParentheses(String a) {

        int rtnValue=0;
        final int intMax = a.length();

        for (int i=0; i < intMax; i++) {
            String aChar = a.substring(i, i+1);
            if (OPEN.equals(aChar)) {
                rtnValue++;
            } else if (CLOSE.equals(aChar)) {
                rtnValue--;
            }

        }

        return rtnValue*-1;
    }



    public void testSorting() {

        String[] cities = {"Bangalore", "Pune", "San Francisco", "New York City"};

        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println((Arrays.binarySearch(cities, "New York City")));
    }



//     static class MySort implements Comparator{
//
//         @Override
//         public int compare(Object a, Object b) {
//             return b.compareTo(a) ;
//         }
//     }

    public void testObject() {
        B b = new B();


        System.out.println(String.format("question 1 [%s]", (b instanceof B)));
        System.out.println(String.format("question 2 [%s]", (b instanceof A)));
        System.out.println(String.format("question 3 [%s]", (b instanceof C)));


    }
}
