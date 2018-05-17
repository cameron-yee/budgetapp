package com.example.cameron.budgetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.example.cameron.budgetapp.Groceries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewGroceries(View view) {
        Intent groceries = new Intent(this, Groceries.class);
        startActivity(groceries);
    }

    //Resets all values to their defaults
    public void resetValues(View view) {
        TextView groceries = findViewById(R.id.groceriesValueView);
        groceries.setText("140");
        TextView gas = findViewById(R.id.gasValueView);
        gas.setText("40");
        TextView entertainment = findViewById(R.id.entertainmentValueView);
        entertainment.setText("13");
        TextView eatout = findViewById(R.id.eatoutValueView);
        eatout.setText("30");
        TextView coffee = findViewById(R.id.coffeeValueView);
        coffee.setText("12");
    }
}
