package com.mytest.personalresume;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class QRCodeView extends Activity {
	
	private ImageView qrCodeView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qrcode_dialog);
		qrCodeView = (ImageView)findViewById(R.id.qrcode_view);
		qrCodeView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
