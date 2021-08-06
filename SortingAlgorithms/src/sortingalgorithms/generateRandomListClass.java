package sortingalgorithms;

import java.util.ArrayList;
import java.util.Random;

public class generateRandomListClass extends ArrayCreator {

    public void generateRandomList() {

        Random rand = new Random();

        for (int i = 0; i < arryprops.length; i++) {
            int r1 = rand.nextInt(arryprops.max - arryprops.min) + 1 + arryprops.min;
            myarray.add(r1);
        }
        
    }

    public ArrayList<Integer> returnMyarray() {
        return myarray;
    }
}
