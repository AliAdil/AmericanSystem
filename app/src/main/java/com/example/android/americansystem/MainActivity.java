package com.example.android.americansystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 1;
    public void submitOrder(View view) {

        displayPrice(quantity * 20);
    }
    public void divide(View view) {

        divideTotal((quantity * 20)/quantity);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity >= 1)
            quantity = quantity - 1;
        display(quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);


    }

    /**
     * This method displays the given price on the screen.@+id/divide_total
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void divideTotal(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.divide_total);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
