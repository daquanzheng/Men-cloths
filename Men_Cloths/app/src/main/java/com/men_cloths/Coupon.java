package com.men_cloths;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import java.util.ArrayList;
import java.util.List;

import adapter.Adapter;

public class Coupon extends Activity{
	
	RadioGroup group;
	List<Integer> list;
	
	RadioButton radiao[]=new RadioButton[3];
	View views[]=new View[3];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.copon);




		
		
		group=(RadioGroup) findViewById(R.id.group);
		
		radiao[0]=(RadioButton) findViewById(R.id.already_used);
		radiao[1]=(RadioButton) findViewById(R.id.can_use);
		radiao[2]=(RadioButton) findViewById(R.id.not_used);
		views[0]=findViewById(R.id.view1);
		views[1]=findViewById(R.id.view2);
		views[2]=findViewById(R.id.view3);




		group.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId){
				case R.id.already_used:
					createPopupWindow(radiao[0]);
					for(int i=0;i<3;i++)
					{
						if(i==0){
							views[i].setVisibility(View.VISIBLE);
						}
						else
							views[i].setVisibility(View.INVISIBLE);
					}
					break;
                case R.id.can_use:
                	createPopupWindow(radiao[1]);
                	for(int i=0;i<3;i++)
					{
						if(i==1){
							views[i].setVisibility(View.VISIBLE);
						}
						else
						views[i].setVisibility(View.INVISIBLE);
					}
					break;
               case R.id.not_used:
            	   createPopupWindow(radiao[2]);
            	   for(int i=0;i<3;i++)
					{
						if(i==2){
							views[i].setVisibility(View.VISIBLE);
						}
						else
						views[i].setVisibility(View.INVISIBLE);
					}
	               break;
				
				
				}
				
			}
		});
	}
	
	public void createDatebase(){
		list=new ArrayList<Integer>();
		list.add(123);
		
		
	}
	PopupWindow pop;
	public void createPopupWindow(View view){
		createDatebase();
		View v=LayoutInflater.from(this).inflate(R.layout.popupwindow_item,null);
		ListView listview=(ListView) v.findViewById(R.id.list_view_popupwindow);
		listview.setAdapter(new Adapter().getPopupWindowAdapter(this, list));

		pop=new PopupWindow(v);
		pop.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
		pop.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
		pop.showAsDropDown(view);
		
	}

}
