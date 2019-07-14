package com.mycompany.alc;

	import android.app.*;
	import android.os.*;
	import android.view.*;
	import android.content.*;
	import android.widget.*;


	public class MainActivity extends Activity 
	{
		Button btn, btn1;
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);

			Button btn1 = findViewById(R.id.btn);

			btn1.setOnClickListener(new View.OnClickListener()
				{
					@Override
					public void onClick(View view)
					{
						goToActivity1();
						return ;
					}
				});
			return ;
		}

		private void goToActivity1()
		{
			Intent myIntent = new Intent(this, ManiActivity.class);
			startActivity(myIntent);
			return ;
		}
	}	
