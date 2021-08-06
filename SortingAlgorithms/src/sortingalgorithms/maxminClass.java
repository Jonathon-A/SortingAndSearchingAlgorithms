package sortingalgorithms;

import java.util.Scanner;

public class maxminClass extends ArrayCreator {

    public void maxmin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Maximum number (-999 - 999): ");
        if (input.hasNextInt()) {
            max = input.nextInt();
        } else {
            System.out.println("Invalid entry, Maximum number must be int, try again");
            maxmin();
        }

        System.out.println("Minumum number (-999 - 999): ");
        if (input.hasNextInt()) {
            min = input.nextInt();
        } else {
            System.out.println("Invalid entry, Minumum number must be int, try again");
            maxmin();
        }
        if (min > 999 || min < -999) {
            System.out.println("Maximum and Minumum numbers must be in range (-999 - 999)");
            maxmin();

        }
        if (max > 999 || max < -999) {
            System.out.println("Maximum and Minumum numbers must be in range (-999 - 999)");
            maxmin();

        }

        if (min >= max) {
            System.out.println("Maximum(" + max + ") number must be greater than Minumum number(" + min + ")");
            maxmin();

        }

    }

    public int returnMax() {

        return max;
    }

    public int returnMin() {

        return min;
    }

}
