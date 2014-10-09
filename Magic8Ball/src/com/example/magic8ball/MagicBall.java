package com.example.magic8ball;

import java.util.Random;

import android.content.res.Resources;

public class MagicBall {

	
	private String[] respuesta;
	private Resources res;
	private Random ran;
	
	
	
	public MagicBall(Resources r)
	{
    ran = new Random(); 		
	res=r;	
	respuesta= res.getStringArray(R.array.Respuesta);	
	}
			
		
		public String getPrediction()
		{
			
		return respuesta[ran.nextInt(respuesta.length)];
	}
		
		
		

}
