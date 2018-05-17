package com.example.cameron.budgetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class Groceries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
    }

    public Double getGroceryInput() {
        EditText input = findViewById(R.id.groceriesAmount);
        String rawValue = input.getText().toString();
        Double value = Double.parseDouble(rawValue);
        return value;
    }

    public void updateGroceries() {
       Double value = getGroceryInput();
       Double grocValue = Double.parseDouble(getResources().getString(R.string.groceriesValue));
       TextView groceryAmount = findViewById(R.id.groceriesAmount);
       groceryAmount.setText(String.valueOf(grocValue - value));

       Intent main = new Intent(this, MainActivity.class);
       startActivity(main);
    }

}
