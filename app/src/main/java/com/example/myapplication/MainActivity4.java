package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main4);

		Log.e("MainActivity4: ", "onCreate");

		Button button = findViewById(R.id.destroy);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e("MainActivity4: ", "onPause");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e("MainActivity4: ", "onResume");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e("MainActivity4: ", "onRestart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e("MainActivity4: ", "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e("MainActivity4: ", "onDestroy");
	}

	@Override
	protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.e("MainActivity4: ", "onRestoreInstanceState");
	}

	@Override
	protected void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.e("MainActivity4: ", "onSaveInstanceState");

	}
}