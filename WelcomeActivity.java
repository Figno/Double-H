package cn.liguanrui.shiyan9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		
		Button bt_create = (Button) findViewById(R.id.bt_create);
		Button bt_new = (Button) findViewById(R.id.bt_new);
		Button bt_ptj = (Button) findViewById(R.id.bt_ptj);
		Button bt_lost = (Button) findViewById(R.id.bt_lost);
		Button bt_love = (Button) findViewById(R.id.bt_love);
		Button bt_change = (Button) findViewById(R.id.bt_change);
		Button bt_study = (Button) findViewById(R.id.bt_study);
		Button bt_others = (Button) findViewById(R.id.bt_others);
		
		
		
		bt_create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(WelcomeActivity.this,CreateMessage.class);
				startActivity(intent);
				finish();
				
			}
		});
	}
}
