package com.example.game;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView textStart;
    private TextView textEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textStart = findViewById(R.id.TextStart);
        textEnd = findViewById(R.id.TextEnd);



    }
    public void onClick (View v){
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra( "start",Integer.parseInt(textStart.getText().toString()));
        intent.putExtra( "end",Integer.parseInt(textEnd.getText().toString()));
        startActivity(intent);
    }
}
