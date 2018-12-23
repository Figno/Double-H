package cn.liguanrui.shiyan9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Mine extends Activity {

	protected void onCreate(Bundle savedInstanceState){
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_mine);
	
	
	ImageView iv_hp = (ImageView) findViewById(R.id.iv_hp);
	TextView tv_name = (TextView) findViewById(R.id.tv_name);
	TextView tv_collect = (TextView) findViewById(R.id.tv_collect);
	TextView tv_data = (TextView) findViewById(R.id.tv_data);
	TextView tv_settings = (TextView) findViewById(R.id.tv_settings);
	TextView tv_update = (TextView) findViewById(R.id.tv_update);
	
	
	}
	

}
