package odomobileapplicationdevelopment.myasyncapp;

import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by j on 9/6/17.
 */

public class HeavyComputation {

    private static int SIZE = 2000000;
    protected Random random;

    public HeavyComputation(){
        random = new Random();
    }

    protected void doWork(View view){

        ArrayList<Integer> myArray = new ArrayList<>();

        for(int i=0; i<SIZE; i++){
            myArray.add(random.nextInt());
        }

        Collections.sort(myArray);
    }
}
