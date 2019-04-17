package com.example.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity {
    int start,end,mid;
    private TextView textView;
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        start = Math.min(i.getIntExtra("start",0),i.getIntExtra("end",0)) ;
        end = Math.max(i.getIntExtra("start",0),i.getIntExtra("end",0)) ;
        mid = (end-start)/2+start;
        textView  = (TextView) findViewById(R.id.textView);
        textView.setText("Ваше число больше либо равно: "+Integer.toString(mid));
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        if(  start>end){
            int k = 0;
            k = start;
            start = end;
            end = k;
        };
        if (start<0 && end<0 && start>end){
            int k = 0;
            k = start;
            start = end;
            end = k;
        }
        if(end-start==0){
            textView.setText("Your number is  "+Integer.toString(start));
        }

    }
    public void YesClick (View v){
        if(end-start<=2){
            //textView.setText("yes"+Integer.toString(mid)+ "start:"+Integer.toString(start)+" end: "+Integer.toString(end)+" mid: "+Integer.toString(mid));
            textView.setText("Ваше число: "+Integer.toString(mid));
            button.setEnabled(false);
            button2.setEnabled(false);
        }
        else{
            start = mid;
            mid = (end - start)/2+start;
            textView.setText("Ваше число больше либо равно: "+Integer.toString(mid));
            //textView.setText("Your number is "+"start:"+Integer.toString(start)+" end: "+Integer.toString(end)+" mid: "+Integer.toString(mid));
        }
    }
    public void NoClick (View v){
        if(end-start<=2){
            textView.setText("Ваше число: "+Integer.toString(mid-1));
            //textView.setText("No "+Integer.toString(mid-1) + "start:"+Integer.toString(start)+" end: "+Integer.toString(end)+" mid: "+Integer.toString(mid));
            button.setEnabled(false);
            button2.setEnabled(false);
        }
        else{
            end = mid;
            mid = (end - start)/2+start;
            textView.setText("Ваше число больше либо равно: "+Integer.toString(mid));
            //textView.setText("Your number is "+"start:"+Integer.toString(start)+" end: "+Integer.toString(end)+" mid: "+Integer.toString(mid));
        }
    }
}
