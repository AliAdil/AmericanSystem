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

    int total=0;
    int quantity = 1;
    int cutQuantity= 1;
    int drinkQuantity=1;
    int friesQuantity=1;
    int divideQuantity=1;

    //TEA FULL IN DE

    public void incrementTeaFull(View view) {
        quantity = quantity + 1;
        displayTeaFull(quantity);
    }

    public void decrementTeaFull(View view) {
        if (quantity >= 1)
            quantity = quantity - 1;
        displayTeaFull(quantity);

    }

    //TEA CUT IN DE

    public void incrementTeaCut(View view) {
        cutQuantity = cutQuantity + 1;
        displayCut(cutQuantity);
    }

    public void decrementTeaCut(View view) {
        if (cutQuantity >= 1)
            cutQuantity = cutQuantity - 1;
        displayCut(cutQuantity);

    }

    //Cold drinks IN DE
    public void incrementColdDrinks(View view) {
        drinkQuantity = drinkQuantity + 1;
        displayDrink(drinkQuantity);
    }

    public void decrementColdDrinks(View view) {
        if (drinkQuantity >= 1)
            drinkQuantity = drinkQuantity - 1;
        displayDrink(drinkQuantity);

    }

    //Fries IN DE
    public void incrementFries(View view) {
        friesQuantity = friesQuantity + 1;
        displayFries(friesQuantity);
    }

    public void decrementFries(View view) {
        if (friesQuantity >= 1)
            friesQuantity = friesQuantity - 1;
        displayFries(friesQuantity);

    }


    ///Divide Between IN DE
    public void incrementDivide(View view) {
        divideQuantity = divideQuantity + 1;
        displayDivide(divideQuantity);
    }

    public void decrementDivide(View view) {
        if (divideQuantity >= 2)
            divideQuantity = divideQuantity - 1;
        displayDivide(divideQuantity);

    }

    // This method calculate the total amount
    public void submitOrder(View view) {

        total= (quantity*30)+(cutQuantity*20)+(drinkQuantity*30)+(friesQuantity*50);
        displayPrice(total);
    }

    //this method divide total amount
    public void divide(View view) {

        divideTotal(total/divideQuantity);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayTeaFull(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teaFull_text_view);
        quantityTextView.setText("" + number);
        }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayCut(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teaCut_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayDrink(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.drinks_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayFries(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.fries_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayDivide(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.divide_text_view);
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
