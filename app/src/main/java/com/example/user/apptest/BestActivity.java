package com.example.user.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BestActivity extends AppCompatActivity {

    private final String tag = "my_activity";
    private final String data_id = "data_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(listener);
        Intent intent = getIntent();
        Log.d(tag, intent.getStringExtra(data_id));
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("you tapped "+intent.getStringExtra(data_id)+" times");
    }


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(BestActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
}
