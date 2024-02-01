package com.example.cooffeordination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mCount = 0;
    TextView mShowCount;
    double cooffe_cost = 0.80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void showToast(View view) {
        double total_cost = cooffe_cost * (double)mCount;
        total_cost= Math.round(total_cost*100.0)/100.0;
        Toast toast = Toast.makeText(this, "" + total_cost, Toast.LENGTH_LONG);
        toast.show();
    }
}