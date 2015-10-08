package com.mytest.personalresume;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PerEdu extends Activity {
	
	private Button btnBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.peredu_view);
		btnBack = (Button)findViewById(R.id.btn_per_eduBack);
		btnBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_weibo:
			Intent weibo =new Intent(Intent.ACTION_VIEW);
			weibo.setData(Uri.parse("http://weibo.com/u/2211626583"));
			startActivity(weibo);
			break;

		case R.id.action_wechat:
			Intent wechat =new Intent(this,QRCodeView.class);
			startActivity(wechat);
			break;
		}
		return true;
	}
}
