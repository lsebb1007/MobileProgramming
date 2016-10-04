package org.androidtown.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            int[] arr = {1,2,3,4,5};

            Minimum min = new Minimum();
            Average avg = new Average();


            String string1 = Integer.toString(min.getresult(arr));
            String string2 = Integer.toString(avg.getresult(arr));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton2Clicked(View v){
        Toast.makeText(getApplicationContext(),string1,Toast.LENGTH_LONG).show();
    }
    public void onButton3Clicked(View v){
        Toast.makeText(getApplicationContext(),string2,Toast.LENGTH_LONG).show();
    }
}
