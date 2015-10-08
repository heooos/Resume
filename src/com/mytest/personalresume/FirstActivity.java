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
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends Activity implements OnClickListener {
	
	private TextView tvName;
	private TextView tvSex;
	private TextView tvEdu;
	private Button btnInfo,btnEdu,btnExp,btnCer,btnOther,btnCon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		tvName = (TextView)findViewById(R.id.tv_name);
		tvSex = (TextView)findViewById(R.id.tv_sex);
		tvEdu = (TextView)findViewById(R.id.tv_edu_de);
		btnInfo = (Button)findViewById(R.id.btn_per_info);
		btnEdu = (Button)findViewById(R.id.btn_per_edu);
		btnCer = (Button)findViewById(R.id.btn_per_cer);
		btnCon = (Button)findViewById(R.id.btn_per_con);
		btnExp = (Button)findViewById(R.id.btn_per_exp);
		btnOther = (Button)findViewById(R.id.btn_per_other); 
		
		btnInfo.setOnClickListener(this);
		btnEdu.setOnClickListener(this);
		btnCer.setOnClickListener(this);
		btnCon.setOnClickListener(this);
		btnExp.setOnClickListener(this);
		btnOther.setOnClickListener(this);
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
			weibo.setData(Uri.parse("http://weibo.com/u/2211626583/home?wvr=5&sudaref=www.baidu.com"));
			startActivity(weibo);
			break;

		case R.id.action_wechat:
			Intent wechat =new Intent(this,QRCodeView.class);
			startActivity(wechat);
			break;
		}
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_per_info:
			tvName.setText("姓名：小明");
			tvSex.setText("性别：男");
			tvEdu.setText("教育程度：本科");
			break;
		case R.id.btn_per_edu:
			Intent peredu = new Intent(this,PerEdu.class);
			startActivity(peredu);
			break;
		case R.id.btn_per_cer:
			Toast.makeText(this, "获奖证书", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_per_con:
			Toast.makeText(this, "联系方式", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_per_exp:
			Toast.makeText(this, "实习经历", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_per_other:
			Toast.makeText(this, "其        他", Toast.LENGTH_SHORT).show();
			break;
		}
		
	}
}
