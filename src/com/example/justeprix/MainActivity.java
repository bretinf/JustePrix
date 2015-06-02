package com.example.justeprix;

import java.util.Random;

import com.example.justeprix.MainActivity;
import com.example.justeprix.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private final String sup = "Le chiffre est trop grand";
	private final String inf = "Le chiffre est trop petit ";
	private final String bravo = "Vous avez trouver le bon numéro ";
	private final String defaut="";
	private int compteur=0;
	
	Button tenter=null;
	Button essai=null;
	EditText prix=null;
	TextView result=null;
	
	
	Random r = new Random();
	float a = r.nextInt(50);
	

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		
		// On récupère toutes les vues dont on a besoin
		tenter= (Button)findViewById(R.id.tentative);
		prix=	(EditText)findViewById(R.id.prix);
		result = (TextView)findViewById(R.id.result);
		essai=   (Button)findViewById(R.id.essai);

		
		tenter.setOnClickListener(envoyerTentative);
	
		prix.addTextChangedListener(textWatcher);
	}
	private TextWatcher textWatcher = new TextWatcher() {

	    @Override
	    public void onTextChanged(CharSequence s, int start, int before, int count) {
	  
	      result.setText(defaut);
	    }
			
	    @Override
	    public void beforeTextChanged(CharSequence s, int start, int count,
	      int after) {
	  
	    }
	  
	    @Override
	    public void afterTextChanged(Editable s) {
	  
	    }
	    
	  };
	 
		 private OnClickListener envoyerTentative = new OnClickListener() {
			    @Override
			    public void onClick(View v) {
			    
			    	//Compteur de tentative 
			    	compteur=compteur+1;
			    	essai.setText(String.valueOf(compteur));
			        // On récupère le prix
			        String p = prix.getText().toString();
						
						
			        // Puis on vérifie le prix
			        
			          float pValue = Float.valueOf(p);
			          // Si l'utilisateur a indiqué que la taille était en centimètres
			          // On vérifie que la Checkbox sélectionnée est la deuxième à l'aide de son identifiant
			          if(pValue>a){
			          result.setText(sup); 
			          }else if(pValue<a){
			          result.setText(inf);
			          }else{
			        result.setText(bravo);
			      
			    	
			          }

			       
			    
			  
	}
		 };
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
	
