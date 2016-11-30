//  Flashlight 2. uygulama
package com.yamankod.component_2_flashlight;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class main2 extends Activity {
	private Button button;
	private Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		
		intent = new Intent(this, main.class);
		button = (Button) findViewById(R.id.button2);

		button.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				startActivity(intent);

			}
		});
	}

}
