package odomobileapplicationdevelopment.myasyncapp;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by j on 9/6/17.
 */

public class HeavyTask extends AsyncTask {
    Context context;

    public HeavyTask() {
        super();
    }

    public  HeavyTask(Context c){
        super();
        context = c;
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        ArrayList<Integer> myArray = new ArrayList<>();
        Random random  = new Random();
        int SIZE = 2000000;

        for(int i=0; i<SIZE; i++){
            myArray.add(random.nextInt());
        }

        Collections.sort(myArray);
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

        // Called when doInBackground is complete
    @Override
    protected void onPostExecute(Object o) {
        Toast toast = Toast.makeText(context,"Async Complete", Toast.LENGTH_LONG);
        toast.show();
        super.onPostExecute(o);
    }

    @Override
    protected void onProgressUpdate(Object[] values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onCancelled(Object o) {
        super.onCancelled(o);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }
}