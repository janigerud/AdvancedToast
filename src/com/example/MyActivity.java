package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
//import com.example.AdvancedToast; 

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onResume(){
        super.onResume();
        Toast t = AdvancedToast.makeToast(this, "Broken movie file, please download it againg", 40.0f, Toast.LENGTH_LONG);
        t.show();

    }
}
