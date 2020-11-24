package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);

//		Bundle bundle = getIntent().getExtras();
//		assert bundle != null;
//		String data = bundle.getString("Value1");
//		Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

		Button button = (Button) findViewById(R.id.goTo1);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity3.this, MainActivity.class));
			}
		});

		Button button1 = (Button) findViewById(R.id.facebook3);
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/huysmith.it")));
			}
		});

		Button button2 = (Button) findViewById(R.id.finishButton);
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
//		finish();
	}

	@Override
	public void finish() {
		Intent intent = new Intent();
		intent.putExtra("returnKey1", "trả về 1");
		intent.putExtra("returnKey2", "trả về 2");
		setResult(RESULT_OK, intent);
		super.finish();


	}
}