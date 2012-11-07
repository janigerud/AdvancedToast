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
 * To change this template use File | Settings | File Templates.
 */
public class AdvancedToast {

    private Context context = null;
    private LinearLayout ll = null;
    private Toast toast = null;
    AdvancedToast(Context context){
        this.context = context;
        ll = new LinearLayout(context);
        ll.setVisibility(View.VISIBLE);
        LinearLayout.LayoutParams lpr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.setLayoutParams(lpr);

        TextView tv = new TextView(context);
        tv.setText("I have made a advance Toast!!");
        tv.setTextColor(Color.RED);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,20.0f);
        tv.setVisibility(View.VISIBLE);
        tv.setId(1);
        ll.addView(tv);

    }
    public void makeToast(){
        toast = new Toast(context);
        toast.setView(ll.getRootView());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }


}
