package com.example.vote_radio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Star_vote extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.star_vote);
		setTitle("연예인 투표하기 (라디오 버튼)");

		final RadioButton rdoSecond = (RadioButton) findViewById(R.id.rdoSecond);

		Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
		btnNewActivity.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent;

				if (rdoSecond.isChecked() == true)
					intent = new Intent(getApplicationContext(),
							Star_vote_result.class);
				else
					intent = new Intent(getApplicationContext(),
							Star_vote_list.class);

				startActivity(intent);
			}
		});
	}

}
