package sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingAlgorithms {

    public ArrayList<Integer> myarray = new ArrayList<>();
    public int value;
    public int length;
    public int max;
    public int min;
    public boolean check1 = false;
    public boolean check2 = false;
    public boolean edited = false;
    Scanner input = new Scanner(System.in);
    ArrayCreator SubClass = new ArrayCreator();

    public static void main(String[] args) {

        SortingAlgorithms MainClass = new SortingAlgorithms();
        MainClass.main2();

    }

    public void main2() {
        ArrayCreator SubClass = new ArrayCreator();

        int choose;
        System.out.println("");
        System.out.println("Please choose one from the following:");
        System.out.println("1: Create/edit array properties");
        System.out.println("2: Linear array search");
        System.out.println("3: Binary array search");
        System.out.println("4: Bubble array sort");
        System.out.println("5: Insertion array sort");

        if (input.hasNextInt()) {
            choose = input.nextInt();
        } else {
            choose = 100;
        }

        System.out.println("");
        switch (choose) {
            case (1):
                editor();
                main2();
                break;
            case (2):
                if (edited == true) {
                    value = SubClass.getValue();
                    LinearSearch();
                } else {
                    System.out.println("");
                    System.out.println("Please create an array first");
                    System.out.println("");
                }
                main2();
                break;
            case (3):
                if (edited == true) {
                    value = SubClass.getValue();
                    BinarySearch();
                } else {
                    System.out.println("");
                    System.out.println("Please create an array first");
                    System.out.println("");
                }
                main2();

                break;
            case (4):
                if (edited == true) {
                    bubblesort();
                } else {
                    System.out.println("");
                    System.out.println("Please create an array first");
                    System.out.println("");
                }
                main2();

                break;
            case (5):
                if (edited == true) {
                    insertiosort();
                } else {
                    System.out.println("");
                    System.out.println("Please create an array first");
                    System.out.println("");
                }
                main2();

                break;
            default:
                System.out.println("");
                System.out.println("Invalid choice");
                System.out.println("");
                main2();
                break;
        }

    }

    public void LinearSearch() {
        System.out.println("");
        System.out.println("Searching " + myarray.toString() + " for value " + value);

        boolean found = false;
        System.out.println("");
        for (int i = 0; i < myarray.size(); i++) {
            if (myarray.get(i) == value) {
                found = true;
                System.out.println(value + " found at position: " + (i + 1));
            }
        }
        if (found == false) {
            System.out.println("");
            System.out.println(value + " not found");
        }
        System.out.println("");
    }

    public void BinarySearch() {
        boolean found = false;
        ArrayList<Integer> sortedarray = new ArrayList<Integer>(myarray);
        Collections.sort(sortedarray);
        System.out.println("");
        System.out.println("Searching " + sortedarray.toString() + " for value " + value);
        System.out.println("");
        int k = 0;

        boolean discovered = false;
        while (found == false) {

            int j = ((sortedarray.size() / 2) + (sortedarray.size() % 2) - 1);
            if (sortedarray.size() == 1) {
                j = 0;
            }

            if ((sortedarray.size() == 1) && (sortedarray.get(0) != value)) {
                found = true;
            } else {
                if (value > sortedarray.get(j)) {
                    for (int i = j; i >= 0; i--) {

                        k++;
                        sortedarray.set(i, -1000);
                    }

                } else {
                    if (value < sortedarray.get(j)) {
                        for (int i = j; i < sortedarray.size(); i++) {

                            sortedarray.set(i, -1000);
                        }

                    } else {
                        if (value == sortedarray.get(j)) { // minor error
                            System.out.println(value + " found at position: " + (j + k + 1));

                            sortedarray.set(j, -1000);
                            discovered = true;

                        }
                    }
                }

                for (int i = 0; i < sortedarray.size(); i++) {
                    if (sortedarray.get(i) == -1000) {
                        sortedarray.remove(i);
                        i--;
                    }

                }
                if (sortedarray.isEmpty()) {
                    found = true;
                }
            }

        }
        if (discovered == false) {
            System.out.println("");
            System.out.println(value + " not found;");
        }
        System.out.println("");

    }

    public void bubblesort() {
        System.out.println("");
        System.out.println("Sorting: " + myarray.toString());
        ArrayList<Integer> sortedarray2 = new ArrayList<>(myarray);
        boolean done = false;
        int k = 1;
        while (done == false) {
            done = true;
            for (int i = 0; i < (sortedarray2.size() - k); i++) {
                if (sortedarray2.get(i) > sortedarray2.get(i + 1)) {
                    int buffer = sortedarray2.get(i + 1);
                    sortedarray2.set((i + 1), sortedarray2.get(i));
                    sortedarray2.set((i), buffer);
                    done = false;
                }
            }
            k++;
        }
        System.out.println("");
        System.out.println("Sorted: " + sortedarray2.toString());
        System.out.println("");
    }

    public void insertiosort() {
        System.out.println("");
        System.out.println("Sorting: " + myarray.toString());
        ArrayList<Integer> sortedarray = new ArrayList<>();
        ArrayList<Integer> bufferarray = new ArrayList<>(myarray);
        sortedarray.add(bufferarray.get(0));
        bufferarray.remove(0);
        int insert = bufferarray.get(0);
        int i = 0;
        while (bufferarray.isEmpty() == false) {
            if (sortedarray.size() == (i)) {
                sortedarray.add(i, insert);
                bufferarray.remove(0);
                if (bufferarray.isEmpty() == false) {
                    insert = bufferarray.get(0);
                }
                i = 0;
            } else {
                if (insert > sortedarray.get(i)) {
                    i++;

                } else {

                    sortedarray.add(i, insert);
                    bufferarray.remove(0);
                    if (bufferarray.isEmpty() == false) {
                        insert = bufferarray.get(0);
                    }
                    i = 0;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted: " + sortedarray.toString());
        System.out.println("");
    }

    public void editor() {
        int choose;
        System.out.println("");
        System.out.println("Please choose one from the following:");
        System.out.println("1: Set/edit array length");
        System.out.println("2: Set/edit array Maximum/Minumum number");
        System.out.println("3: Save randomised array");
        if (input.hasNextInt()) {
            choose = input.nextInt();
        } else {
            choose = 100;
        }
        System.out.println("");
        switch (choose) {
            case (1):
                length = SubClass.getLength();
                check1 = true;

                editor();
                break;
            case (2):
                max = SubClass.getMax();
                min = SubClass.getMin();

                check2 = true;
                editor();
                break;
            case (3):
                if (check1 == true && check2 == true) {
                    myarray = SubClass.getMyarray();
                    edited = true;

                    main2();
                } else {
                    System.out.println("");
                    System.out.println("Please enter other properties first");
                    System.out.println("");
                    editor();
                }
                break;
            default:
                System.out.println("");
                System.out.println("Invalid choice");
                System.out.println("");
                editor();
                break;

        }

    }
}
