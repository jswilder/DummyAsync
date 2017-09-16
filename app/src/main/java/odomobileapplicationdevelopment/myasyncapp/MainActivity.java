package odomobileapplicationdevelopment.myasyncapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    HeavyComputation heavyComputation;
    HeavyTask heavyTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heavyComputation = new HeavyComputation();
    }

    public void StartDoingWork(View view) {
        heavyComputation.doWork(view);
    }

    public void StartDoingAsyncWork(final View view) {

        heavyTask = new HeavyTask(getApplicationContext());

        heavyTask.execute();
    }

    public void StartDoingAsyncLoaderWork(View view) {
//        heavyComputationLoader.loadInBackground();
    }

    public void Switch(View view) {
        // Do nothing
    }
}