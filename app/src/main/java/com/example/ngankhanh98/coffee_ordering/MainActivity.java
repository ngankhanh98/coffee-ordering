package com.example.ngankhanh98.coffee_ordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.ngankhanh98.coffee_ordering.R.*;

public class MainActivity extends AppCompatActivity {

    private int countQuantity=0;
    private TextView showQuantity;
    private TextView showTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    public void countUp(View view) {
        countQuantity++;

        showQuantity = (TextView)(findViewById(id.txt_showQuantity));
        showQuantity.setText(Integer.toString(countQuantity));
        showTotal=(TextView)(findViewById(id.txt_showTotal));
        showTotal.setText(Integer.toString(countQuantity*10 )+"000");
    }

    public void countDown(View view) {
        if(countQuantity!=0)
        {
            countQuantity--;
            showQuantity = (TextView)(findViewById(id.txt_showQuantity));
            showQuantity.setText(Integer.toString(countQuantity));
            showTotal=(TextView)(findViewById(id.txt_showTotal));
            showTotal.setText(Integer.toString(countQuantity*10 )+"000");
        }
    }
}
