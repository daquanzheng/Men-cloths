package com.men_cloths;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/10/21.
 */

public class Interchangeable extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interchangeable);
        SwitchButton switchButton= (SwitchButton) findViewById(R.id.button);
        switchButton.setOnSwitchButtonClickListene(new SwitchButton.OnSwitchButtonClickListene() {
            @Override
            public void OnSwitchButtonClick(boolean state) {

            }
        });
        SwitchButton switchButton1= (SwitchButton) findViewById(R.id.button_);
        switchButton1.setOnSwitchButtonClickListene(new SwitchButton.OnSwitchButtonClickListene() {
            @Override
            public void OnSwitchButtonClick(boolean state) {

            }
        });
    }
}
