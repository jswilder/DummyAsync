package odomobileapplicationdevelopment.myasyncapp;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Integer>> {

    HeavyComputation heavyComputation;
    HeavyTask heavyTask;
    private static int ID = 24703432;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heavyComputation = new HeavyComputation();
        getLoaderManager().initLoader(ID,null,this);

    }

    public void StartDoingWork(View view) {
        heavyComputation.doWork(view);
    }

    public void StartDoingAsyncWork(final View view) {

        heavyTask = new HeavyTask(getApplicationContext());

        heavyTask.execute();
    }

    public void StartDoingAsyncLoaderWork(View view) {
        // Nothing yet
    }

    public void Switch(View view) {
        // Do nothing; Its here to check for UI responsiveness
    }

    @Override
    public Loader<List<Integer>> onCreateLoader(int i, Bundle bundle) {
        // Create new loader
        return new HeavyLoader(MainActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<List<Integer>> loader, List<Integer> integers) {
        // Update UI
        Toast.makeText(this,"AsyncLoader finished computations",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoaderReset(Loader<List<Integer>> loader) {
        // Clear existing data
    }
}