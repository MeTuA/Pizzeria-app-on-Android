package com.example.pizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_actviity);

        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drinks = Drink.drinks[drinkId];

        TextView textView = (TextView) findViewById(R.id.drink_activity_textView);
        textView.setText(drinks.getName());

        TextView textViewS = (TextView) findViewById(R.id.drink_activity_textViewS);
        textViewS.setText(drinks.getDescription());
    }
}