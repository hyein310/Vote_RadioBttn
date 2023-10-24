package com.example.vote_radio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Star_vote_result extends Activity {

	ImageView stars;
	RadioButton radio0, radio1, radio2, radio3;
	RadioGroup radioGroup1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.star_vote_result);

		Button btnReturn = (Button) findViewById(R.id.btnReturn);
		btnReturn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		stars=(ImageView)findViewById(R.id.stars);
		radio0=(RadioButton)findViewById(R.id.radio0);
		radio1=(RadioButton)findViewById(R.id.radio1);
		radio2=(RadioButton)findViewById(R.id.radio2);
		radio3=(RadioButton)findViewById(R.id.radio3);
		//radioGroup1=(RadioGroup)findViewById(R.id.radioGroup1);

		final RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup1);
		Button b = (Button)findViewById(R.id.button10);
		final TextView tv = (TextView)findViewById(R.id.textView2);

		b.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int id = rg.getCheckedRadioButtonId();
				//getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
				RadioButton rb = (RadioButton) findViewById(id);
				tv.setText("결과창: " + rb.getText().toString());

				switch (rg.getCheckedRadioButtonId()) {
					case R.id.radio0:
						stars.setImageResource(R.drawable.newjeans);
						break;
					case R.id.radio1:
						stars.setImageResource(R.drawable.nct);
						break;
					case R.id.radio2:
						stars.setImageResource(R.drawable.bts);
						break;
					case R.id.radio3:
						stars.setImageResource(R.drawable.ive);
						break;
					default:
						Toast.makeText(getApplicationContext(), "연예인을 선택하세요.", Toast.LENGTH_SHORT).show();

				}



			} // end onClick()
		});  // end Listener
	}

}