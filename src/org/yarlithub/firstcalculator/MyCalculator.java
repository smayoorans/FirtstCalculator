package org.yarlithub.firstcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;


public class MyCalculator extends Activity implements OnClickListener{

	
	EditText Input1, Input2; 
	Button Plus_Operation, Minus_Operation,Multiple_Operation,Divide_Operation; 
	TextView Answer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_calculator);
		
		 Input1 = (EditText)findViewById(R.id.editText_No1); 
	     Input2 = (EditText)findViewById(R.id.editText_No2); 
	     Answer = (TextView) findViewById(R.id.EditTextAnswer); 
	     
	     Plus_Operation = (Button)findViewById(R.id.Button_Plus); 
	     Minus_Operation = (Button)findViewById(R.id.Button_Minus); 
	     Multiple_Operation = (Button)findViewById(R.id.Button_Multiple); 
	     Divide_Operation = (Button)findViewById(R.id.Button_Divide); 
	     
	     Plus_Operation.setOnClickListener(this); 
	     Minus_Operation.setOnClickListener(this); 
	     Multiple_Operation.setOnClickListener(this); 
	     Divide_Operation.setOnClickListener(this); 
	     
	     
	     
	} 
	public void onClick(View v) { 
	
	    Double Number1 = Double.parseDouble(Input1.getText().toString()); 
	    Double Number2 = Double.parseDouble(Input2.getText().toString()); 
	    switch (v.getId()) { 
	    case R.id.Button_Plus: 
	    	Answer.setText(Double.toString(Number1+Number2)); 
	    break; 
	    case R.id.Button_Minus: 
	    	Answer.setText(Double.toString(Number1-Number2)); 
	    break; 
	    case R.id.Button_Multiple: 
	    	Answer.setText(Double.toString(Number1*Number2)); 
	    break; 
	    case R.id.Button_Divide: 
	    	Answer.setText(Double.toString(Number1/Number2)); 
	    break; 
	    default: 
	    break; 
	   }
	  } 
	
	
	

}
