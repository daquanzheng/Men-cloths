package com.men_cloths.mainContent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.men_cloths.R;

/**
 * Created by Administrator on 2016/10/19.
 */

public class Seting extends Activity{
    LinearLayout linearLayout,message,interchanged,personInfo;//账户

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seting);
        init();
        setOnclick();

    }
    public void init(){
        linearLayout= (LinearLayout) findViewById(R.id.account);
        message= (LinearLayout) findViewById(R.id.message);
        interchanged= (LinearLayout) findViewById(R.id.interchanged);
        personInfo= (LinearLayout) findViewById(R.id.personInfo);
    }

    public void setOnclick(){
        linearLayout.setOnClickListener(listener);
        message.setOnClickListener(listener);
        interchanged.setOnClickListener(listener);
        personInfo.setOnClickListener(listener);
    }


    View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.account:
                     intent=new Intent(Seting.this,Account.class);
                    startActivity(intent);
                    break;
                case R.id.message:
                    intent=new Intent(Seting.this,MessAge.class);
                    startActivity(intent);
                    break;
                case R.id.interchanged:
                     intent=new Intent(Seting.this,Interchangeable.class);
                    startActivity(intent);
                    break;
                case R.id.personInfo:
                    intent=new Intent(Seting.this,PersonInfo.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
