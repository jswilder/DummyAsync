package odomobileapplicationdevelopment.myasyncapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by j on 9/16/17.
 */
public class HeavyLoader extends AsyncTaskLoader<List<Integer>>{

    Context context;

    private String TAG = "WILDER";

    public HeavyLoader(Context context) {
        super(context);
        this.context = context;
        Log.i(TAG," **** ---- Heavy Loader Constructor()...");
        Toast.makeText(this.context,"Loader Created",Toast.LENGTH_SHORT).show();
    }

    @Override
    public List<Integer> loadInBackground() {
        // Do work here
        Random random = new Random();
        int SIZE = 2000000;
        ArrayList<Integer> myArray = new ArrayList<>();

        for(int i=0; i<SIZE; i++){
            myArray.add(random.nextInt());
        }
        Collections.sort(myArray);
        Log.i(TAG," **** ---- Load in background called...");
        return null;
    }

    @Override
    protected void onStartLoading(){
        forceLoad();
        Log.i(TAG," **** ---- On Start Loading");
    }
}