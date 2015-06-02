package com.example.justeprix;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu1 extends Activity {
	
	
	Button jouer=null;
	Button option=null;
	
	

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		jouer=(Button)findViewById(R.id.jouer);
		option=(Button)findViewById(R.id.option);
		
		jouer.setOnClickListener(dJouer);
		option.setOnClickListener(dOptions);
		
	}
	
	 private OnClickListener dJouer = new OnClickListener() {
		 
		 @Override
			
		    public void onClick(View v) {
		    
		    	Intent intent = new Intent(Menu1.this,MainActivity.class);
		    	startActivity(intent);

		    	
		    }
		   
	  };
	  private OnClickListener dOptions = new OnClickListener() {
			 
			 @Override
				
			    public void onClick(View v) {
			    
			    	Intent intent = new Intent(Menu1.this,Options.class);
			    	startActivity(intent);

			    	
			    }
			   
		  };

	 
}
