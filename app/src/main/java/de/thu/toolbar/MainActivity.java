package de.thu.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // create the toolbar object
        Toolbar toolbar = findViewById(R.id.tool);
        // set the toolbar as the app bar for the activity
        setSupportActionBar(toolbar);

        //
    }

    // set menu resource for the toolbar by adding a method
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        // inflate menu widget
        getMenuInflater().inflate(R.menu.menu, menu); return true;
    }
    // a method to handle what happens when a user presses on an item in the app bar
    // when a user clicks on an item, the system calls the onOptionsItemSelected method
    // in the implementation call MenuItem.getItemId function which returns the id the item clicked
    // then in a switch statement do the necessary action
    @Override public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.my_cat:
                Log.i("AppBarExample", "Yes, you clicked!");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
