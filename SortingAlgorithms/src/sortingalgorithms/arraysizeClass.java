package sortingalgorithms;

import java.util.Scanner;

public class arraysizeClass extends ArrayCreator {

    public void arraysize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of array (1 - 999): ");
        if (input.hasNextInt()) {
            length = input.nextInt();
        } else {
            System.out.println("Invalid entry, try again");
            arraysize();
        }

        if (length > 999 || length <= 0) {
            System.out.println("Invalid entry, length must be in range (1 - 999)");
            arraysize();

        }

    }

    public int returnarray() {
        return length;

    }
}
