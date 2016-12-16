package com.fachri.makerinstitute.milkordering;

import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created by fachrifebrian on 12/8/16.
 */

public class Count {
    private static int quantityOfMilk = 0;
    private static int totalPriceOfOrderMilk = 0;
    private static int priceOfMilk = 5;
    Drawable drawable;

//    public Count() {
//
//    }


    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public static void incrementOrder(){
        if (quantityOfMilk < 20) {
            //increment quantity of order milk
            quantityOfMilk += 1;
            //displaying a quantity of order milk
            Log.d("incrementOrder", "" + quantityOfMilk);
        } else {
            Log.d("incrementOrder", "quantity lebih dari 20");
        }
    }

    public static void decrementOrder() {
        if (quantityOfMilk > 0) {
            //increment quantity of order milk
            quantityOfMilk -= 1;
            //displaying a quantity of order milk
            Log.d("decrementOrder", "" + quantityOfMilk);
        } else {
            Log.d("decrementOrder", "quantity kurang dari 0");
        }

    }

    public  static void setTotalPriceOfOrderMilk(){
        totalPriceOfOrderMilk = priceOfMilk * quantityOfMilk;
    }

    public  static void setReset(){
        quantityOfMilk = 0;
        totalPriceOfOrderMilk = 0;
    }

    public static int getQuantityOfMilk() {
        return  quantityOfMilk;
    }

    public static String getTotalPriceOfOrderMilk() {
        return "$"+totalPriceOfOrderMilk;
    }


}
