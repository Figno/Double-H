package cn.liguanrui.shiyan9;

import cn.liguanrui.shiyan9.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	protected static final int REGISTER = 0;
	private String name;
	private EditText et_main_name, et_main_password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		et_main_name = (EditText) findViewById(R.id.et_main_name);
		et_main_password = (EditText) findViewById(R.id.et_main_password);
		
	
		Button bt_sign = (Button) findViewById(R.id.bt_sign);
		Button bt_register = (Button) findViewById(R.id.bt_register);
		Button bt_findpw = (Button) findViewById(R.id.bt_findpw);
		
		
		

		bt_sign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String main_password = et_main_password.getText().toString().trim();
				String main_name = et_main_name.getText().toString().trim();
				
				if (main_name.equals("") || main_password.equals("")) {
					Toast.makeText(MainActivity.this, "用户名，密码不能为空！", 1).show();
				} else if (!main_password.equals(RegisterActivity.register_password)) {
					Toast.makeText(MainActivity.this, "用户名，密码有误！", 1).show();
				} else if (main_password.equals(RegisterActivity.register_password)) {
					Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
					startActivity(intent);
					finish();
				}
			}
		});

		bt_register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
				startActivityForResult(intent, REGISTER);
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == REGISTER) {
			if (resultCode == RESULT_OK) {
				name = data.getStringExtra("name");
				et_main_name.setText(name);
			}
		}
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
