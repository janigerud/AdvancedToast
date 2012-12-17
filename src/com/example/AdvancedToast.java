package com.example;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
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
        private int textColor = Color.WHITE;

        static private View makeToastPicture(Context context, int resourceId){
            return  makeToastView(context,"",0,0,resourceId);
        }
        static private View makeToastText(Context context,String text,float testSize, int textColor){
            return  makeToastView(context, text, testSize, textColor,0);
        }

       //crete view programmicly, more portable
        static private View makeToastView(Context context,String text,float textSize, int textColor,int resourceId){
            LinearLayout ll = new LinearLayout(context);
            ll.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams lpr = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            ll.setLayoutParams(lpr);

            if(text != null && text != ""){
                TextView tv = new TextView(context);
                tv.setText(text);
                tv.setTextColor(textColor);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,textSize);
                tv.setVisibility(View.VISIBLE);
                tv.setId(1);
                ll.addView(tv);
            }
            if(resourceId !=0){
                ImageView iv = new ImageView(context);
                iv.setId(2);
                iv.setImageResource(resourceId);
                ll.addView(iv);
            }
            return (View)ll;
        }
        /**
        Create and initiate a Tost with more adjustable textsise
        @param showDuration MUST be  Toast.LENGTH_LONG or Toast.LENGTH_SHORT
        */
        public static Toast makeToast(Context context, String text, float textSize, int showDuration){
            Toast toast = new Toast(context);
            toast.setView(makeToastText(context, text,textSize,Color.RED));
            toast.setDuration(showDuration);
            return toast;
        }
        /**
         Create and initiate a Tost with a picture
         @param resourceId The resource Id to show
         @param showDuration MUST be  Toast.LENGTH_LONG or Toast.LENGTH_SHORT
         */
        public static Toast makePicture(Context context, int resourceId, int showDuration){
            Toast toast = new Toast(context);
            toast.setView(makeToastPicture(context, resourceId));
            toast.setDuration(showDuration);
            return toast;
        }
        /**
         Create and initiate a Tost with a picture
         @param showDuration MUST be  Toast.LENGTH_LONG or Toast.LENGTH_SHORT
         @param text The text to display

         */
        public static Toast makeText(Context context, String text, float textSize, int textColor, int showDuration){
            Toast toast = new Toast(context);
            toast.setView(makeToastText(context,text,textSize,textColor));
            toast.setDuration(showDuration);
            return toast;
        }


}
