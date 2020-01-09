package Week3;

import java.util.ArrayList;

public class Exercise64 {
    public static double average(ArrayList<Integer> list) {
        double sumOfNumbers = 0;
        double averageOfNumbers = 0;
        for (int number : list) {
            sumOfNumbers = (sumOfNumbers + number);
            averageOfNumbers = sumOfNumbers / (double) list.size();
        }
        return averageOfNumbers;
    }

    public static void main(String[] args) {
        //Exercise 64: Average of numbers

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
