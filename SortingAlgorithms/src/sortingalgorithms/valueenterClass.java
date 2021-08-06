package sortingalgorithms;

import java.util.Scanner;

public class valueenterClass extends ArrayCreator {

    public void valueenter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Value to search : ");
        if (input.hasNextInt()) {
            value = input.nextInt();
        } else {
            System.out.println("Invalid entry, Value must be int, try again");
            valueenter();
        }

        if (value > valueprops.max) {
            System.out.println("value must be smaller or equal to Maximum number, try again");
            valueenter();
        }

        if (value < valueprops.min) {
            System.out.println("value must be larger or equal to Minumum number, try again");
            valueenter();
        }
    }

    public int returnValue() {
        return value;
    }

}
