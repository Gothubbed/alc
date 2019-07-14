package com.mycompany.alc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.content.*;
import android.widget.*;
import android.view.*;
import android.webkit.*;


public class ManiActivity extends AppCompatActivity
{
	WebView webView1, view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mani);

		WebView view = (WebView) findViewById(R.id.webView1);
		view.setWebViewClient(new WebViewClient() {
				@Override
				public boolean shouldOverrideUrlLoading(WebView view, String url) {
					view.loadUrl(url);
					return false;
				}
			});
		view.getSettings().setJavaScriptEnabled(true);
		view.loadUrl("http://google.com");
		
		return ;
	}
}
