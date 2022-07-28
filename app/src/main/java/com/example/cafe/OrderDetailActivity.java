package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailActivity extends AppCompatActivity {

    private static final String EXTRA_USER_NAME = "Username";
    private static final String EXTRA_DRINK = "drink";
    private static final String EXTRA_DRINK_TYPE = "drinkType";
    private static final String EXTRA_ADDITIVES = "Additives";

    private TextView textViewName;
    private TextView textViewDrink;
    private TextView textViewDrinkType;
    private TextView textViewAdditives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        initViews();

        String username = getIntent().getStringExtra(EXTRA_USER_NAME);
        String drink = getIntent().getStringExtra(EXTRA_DRINK);
        String drinkType = getIntent().getStringExtra(EXTRA_DRINK_TYPE);
        String additives = getIntent().getStringExtra(EXTRA_ADDITIVES);

        textViewName.setText(username);
        textViewDrink.setText(drink);
        textViewDrinkType.setText(drinkType);
        textViewAdditives.setText(additives);
    }

    public static Intent newIntent(Context context,
                                   String username,
                                   String drink,
                                   String additives,
                                   String drinkType) {
        Intent intent = new Intent(context, OrderDetailActivity.class);
        intent.putExtra(EXTRA_USER_NAME, username);
        intent.putExtra(EXTRA_DRINK, drink);
        intent.putExtra(EXTRA_DRINK_TYPE, drinkType);
        intent.putExtra(EXTRA_ADDITIVES, additives);
        return intent;
    }

    private void initViews() {
        textViewName = findViewById(R.id.textViewName);
        textViewDrink = findViewById(R.id.textViewDrink);
        textViewDrinkType = findViewById(R.id.textViewDrinkType);
        textViewAdditives = findViewById(R.id.textViewAdditives);
    }

}