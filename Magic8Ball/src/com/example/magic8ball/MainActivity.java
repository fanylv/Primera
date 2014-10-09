package com.example.magic8ball;

import java.util.Random;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	TextView tv;
	RelativeLayout fondo;
	ImageView bola;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv = (TextView) findViewById(R.id.textView1);
		fondo = (RelativeLayout) findViewById(R.id.color);
		bola = (ImageView) findViewById(R.id.imageView1);

		bola.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MagicBall magic = new MagicBall(getResources());

				// Random ran = new Random();

				String respuestas = magic.getPrediction();

				switch (respuestas) {

				case "En mi opinion, si":
				case "Es cierto":
				case "Es decididamente así":
				case "Probablemente":
				case "Buen pronóstico":
				case "Todo apunta a que sí":
				case "Sin duda":
				case "Sí":
				case "Sí - definitivamente":
				case "Debes confiar en ello": {
					fondo.setBackgroundColor(Color.GREEN);
					break;

				}
				case "Respuesta vaga, vuelve a intentarlo":
				case "Pregunta en otro momento":
				case "Será mejor que no te lo diga ahora":
				case "No lo quieras saber":
				case "No puedo predecirlo ahora":
				case "Concéntrate y vuelve a preguntar": {
					fondo.setBackgroundColor(Color.YELLOW);
					break;

				}
				case "No cuentes con ello":
				case "Mi respuesta es no":
				case "Mis fuentes me dicen que no":
				case "Las perspectivas no son buenas":
				case "Muy dudoso":
				case "Olvidalo": {
					fondo.setBackgroundColor(Color.RED);
					break;

				}

					
					
				}
				 tv.setText(respuestas);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
