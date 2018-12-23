package cn.liguanrui.shiyan9;

import cn.liguanrui.shiyan9.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
	static String register_password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);

		EditText  et_snum = (EditText) findViewById(R.id.et_snum);
		EditText  et_school = (EditText) findViewById(R.id.et_school);
		final EditText  et_pwa = (EditText) findViewById(R.id.et_pwa);
		EditText  et_name = (EditText) findViewById(R.id.et_name);	
		final EditText et_pnum = (EditText) findViewById(R.id.et_pnum);
	
		
		Button bt_registerok = (Button) findViewById(R.id.bt_registerok);
		
		
		bt_registerok.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String pnum = et_pnum.getText().toString().trim();
				register_password = et_pwa.getText().toString().trim();
			
					Intent data = new Intent();
					data.putExtra("name", pnum);
					setResult(RESULT_OK, data);
					finish();
				
			}
		});
	}
}
