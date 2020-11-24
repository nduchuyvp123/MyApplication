package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);

		final Random rd = new Random();
		final Button button = findViewById(R.id.randomButton);

		final EditText editText = findViewById(R.id.textBox);
		button.setOnClickListener(new View.OnClickListener() {
			@SuppressLint("SetTextI18n")
			@Override
			public void onClick(View v) {

				int n = rd.nextInt(59) + 1;

				Toast.makeText(MainActivity2.this, String.valueOf(n), Toast.LENGTH_SHORT).show();
				editText.setText(editText.getText() + String.valueOf(n) + ". Tên ai đấy\n");
			}
		});
	}
}