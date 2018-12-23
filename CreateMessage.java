package cn.liguanrui.shiyan9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class CreateMessage extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create);
		
		EditText et_topic = (EditText) findViewById(R.id.et_topic);
		EditText et_matter = (EditText) findViewById(R.id.et_matter);
		Spinner sp_select = (Spinner) findViewById(R.id.sp_select);
		Button bt_creatnew = (Button) findViewById(R.id.bt_creatnew);
		Button bt_save = (Button) findViewById(R.id.bt_save);
		
		String[] ops = {"兼职地带","表白墙","失物招领","闲置交易","学习资讯","其他"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(CreateMessage.this,android.R.layout.simple_spinner_dropdown_item,ops);
		sp_select.setAdapter(adapter);
		
		
		bt_creatnew.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CreateMessage.this,WelcomeActivity.class);
				startActivity(intent);
				finish();
			}
		});
		
		
		
	bt_save.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent intent = new Intent(CreateMessage.this,Mine.class);
			startActivity(intent);
			finish();
			
		}
	});
	}
}