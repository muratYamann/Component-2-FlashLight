//  Flashlight 1. uygulama
package com.yamankod.component_2_flashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class main extends Activity {
	private Button button;
	private Intent intent;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		button = (Button) findViewById(R.id.button1);
		
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
		
				intent = new Intent(getApplicationContext(), main2.class);
				
				startActivity(intent);
			}
		});
	}
}





