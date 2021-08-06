package sortingalgorithms;

import java.util.ArrayList;

public class ArrayCreator {

    public ArrayList<Integer> myarray = new ArrayList<>();
    public int value;
    public int length;
    public int max;
    public int min;

    public static class arryprops {

        static public int length;
        static public int max;
        static public int min;
    }

    public static class valueprops {

        static public int max;
        static public int min;
    }

    public ArrayList<Integer> getMyarray() {
        generateRandomListClass d = new generateRandomListClass();
        d.generateRandomList();
        myarray = d.returnMyarray();

        return myarray;
    }

    public int getValue() {
        valueenterClass a = new valueenterClass();
        a.valueenter();
        value = a.returnValue();

        return value;
    }

    public int getLength() {
        arraysizeClass b = new arraysizeClass();
        b.arraysize();
        length = b.returnarray();
        arryprops.length = length;
        return length;
    }

    public int getMax() {
        maxminClass c = new maxminClass();
        c.maxmin();
        max = c.returnMax();
        arryprops.max = max;
        valueprops.max = max;
        min = c.returnMin();
        arryprops.min = min;
        valueprops.min = min;
        return max;
    }

    public int getMin() {
        return min;
    }

}
