package com.example.cal;

import com.example.cal.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{
	Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,equal,dot,refresh;
	EditText workSpace;
	TextView result,history;
	double input1,input2;
	boolean addition,subtraction,multiplication,divide;
	
	 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
    	
        addition= false;
        subtraction= false;
        multiplication= false;
        divide= false;
        setContentView(R.layout.activity_main);
       
        refresh=(Button)findViewById(R.id.refresh);
        one =(Button)findViewById(R.id.one);
        two =(Button)findViewById(R.id.two);
        three =(Button)findViewById(R.id.three);
        four =(Button)findViewById(R.id.four);
        five =(Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight= (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.subrtraction);
        mul = (Button)findViewById(R.id.multiplication);
        div = (Button)findViewById(R.id.divide);
        dot = (Button)findViewById(R.id.dot);
        equal= (Button)findViewById(R.id.Equals);
        workSpace = (EditText)findViewById(R.id.editText1);
        history =  (TextView)findViewById(R.id.history);
        result =  (TextView)findViewById(R.id.result);
        result.setTextColor(Color.BLUE);
        history.setTextColor(Color.RED);
        workSpace.setTextColor(Color.MAGENTA);
        refresh.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.setText("");
				history.setText("");
				result.setText("");
				input1 =0;
				input2=0;
				
			}});
        one.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("1");
				
			}});
        two.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("2");
				
			}});
        three.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("3");
				
			}});
        four.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("4");
				
			}});
        five.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("5");
				
			}});
        six.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("6");
				
			}});
        seven.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("7");
				
			}});
        eight.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("8");
				
			}});
        nine.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("9");
				
			}});
        zero.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append("0");				
			}});
        dot.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				workSpace.append(".");				
			}});
        add.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				if(workSpace.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "please enter value", Toast.LENGTH_SHORT).show();
					
				}
				else{
				input1 = Double.parseDouble(workSpace.getText().toString());
				
				addition = true;
				
				
				input2+=input1;
				
				result.setText(String.valueOf(input2));
				
				history.append(String.valueOf(input1+"+"));
				workSpace.setText("");
				}
				}	
			});
         sub.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				if(workSpace.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "please enter value", Toast.LENGTH_SHORT).show();
					
				}
				else{
				input1 = Double.parseDouble(workSpace.getText().toString());
				subtraction = true;
				
				if(input2==0){
					input2 = input1;
				}else{
				
				input2-=input1;
				}
				
				result.setText(String.valueOf(input2));
				
				history.append(String.valueOf(input1+"-"));
				workSpace.setText("");
				}
			}
			});
         mul.setOnClickListener(new OnClickListener(){
 			@Override
 			public void onClick(View arg0) {
 				if(workSpace.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "please enter value", Toast.LENGTH_SHORT).show();
					
				}
				else{
 				
 				input1 = Double.parseDouble(workSpace.getText().toString());
 				
 				multiplication = true;
 				if(input2==0)
 					input2 =input1;
 				
 				else{
 					input2*=input1;	
 				}	
 				result.setText(String.valueOf(input2));	
 				history.append(String.valueOf(input1+"*"));
 				workSpace.setText("");
 				}
 			}
 			});
         div.setOnClickListener(new OnClickListener(){
  			@Override
  			public void onClick(View arg0) {
  				if(workSpace.getText().toString().equals("")){
					Toast.makeText(getApplicationContext(), "please enter value", Toast.LENGTH_SHORT).show();
				
				}
				else{
  				
  				input1 = Double.parseDouble(workSpace.getText().toString());
  				
  				divide = true;
  				if(input2==0)
  					input2 =input1;
  				
  				else{
  				
  					
  					input2/=input1;	
  				}	
  				result.setText(String.valueOf(input2));	
  				history.append(String.valueOf(input1+"/"));
  				workSpace.setText("");
  				}	}
  			});
        equal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(workSpace.getText().toString().equals(""))
		      		workSpace.setText(result.getText().toString());
				else{ 
					if(addition==true){
					 double first =Double.parseDouble(result.getText().toString());
					double second = Double.parseDouble(workSpace.getText().toString());
					workSpace.setText(String.valueOf(first+second));
			
					result.setText("");
				}
				if(subtraction==true){
				 double first =Double.parseDouble(result.getText().toString());
				double second = Double.parseDouble(workSpace.getText().toString());
				workSpace.setText(String.valueOf(first-second));
				result.setText("");
				}
				if(multiplication==true){
					 double first =Double.parseDouble(result.getText().toString());
					double second = Double.parseDouble(workSpace.getText().toString());
					workSpace.setText(String.valueOf(first*second));
					result.setText("");
				}
				if(divide==true){
					 double first =Double.parseDouble(result.getText().toString());
					double second = Double.parseDouble(workSpace.getText().toString());
					workSpace.setText(String.valueOf(first/second));
					result.setText("");
				}
			}
				
			}
				
			
			});
       
        }

            



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	
	
    
}
