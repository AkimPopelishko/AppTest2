package com.example.user.apptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String tag = "my_activity";
    private final String data_id = "data_id";
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(listener);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(listener2);

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "destroyed");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, BestActivity.class);
            intent.putExtra(data_id,i+"");
            startActivity(intent);
        }
    };

    View.OnClickListener listener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textView = (TextView) findViewById(R.id.textView3);
            i++;
            textView.setText(i+" taps");
        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
