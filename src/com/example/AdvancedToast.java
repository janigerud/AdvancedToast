package com.example;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: jan
 * Date: 11/7/12
 * Time: 10:48 PM
 * Create a simple Toast with adjustable textsise
 */
public class AdvancedToast {

    private Context context = null;
    private LinearLayout ll = null;
    private Toast toast = null;
    private AdvancedToast() {};

    //crete view programmicly, more portable
    static private View makeToastView(Context context,String text, float textSize){
    	LinearLayout ll = new LinearLayout(context);
        ll.setVisibility(View.VISIBLE);
        LinearLayout.LayoutParams lpr = new LinearLayout.LayoutParams(
        		LinearLayout.LayoutParams.WRAP_CONTENT,
        		LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.setLayoutParams(lpr);
        
        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setTextColor(Color.RED);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,textSize);
        tv.setVisibility(View.VISIBLE);
        tv.setId(1);
        ll.addView(tv);
    	return (View)ll;
    }
    /* 
    	Create and initiate a Tost with more adjustable textsise
	@param showDuration MUST be  Toast.LENGTH_LONG or Toast.LENGTH_SHORT
    */	
    public static Toast makeToast(Context context, String text, float textSize, int showDuration){
    	Toast toast = new Toast(context);
    	toast.setView(makeToastView(context, text,textSize));
    	toast.setDuration(showDuration);
    	return toast;
    }



}
