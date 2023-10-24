package com.example.vote_radio;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Star_vote_list extends TabActivity {


	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.star_vote_list);

		Button btnReturn = (Button) findViewById(R.id.btnReturn);
		btnReturn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		TabHost tabHost = getTabHost();

		TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("뉴진스");
		tabSpec1.setContent(R.id.imageView1);
		tabHost.addTab(tabSpec1);

		TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("엔시티");
		tabSpec2.setContent(R.id.imageView2);
		tabHost.addTab(tabSpec2);

		TabSpec tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("방탄소년단");
		tabSpec3.setContent(R.id.imageView3);
		tabHost.addTab(tabSpec3);

		TabSpec tabSpec4 = tabHost.newTabSpec("TAG4").setIndicator("아이브");
		tabSpec4.setContent(R.id.imageView4);
		tabHost.addTab(tabSpec4);



		tabHost.setCurrentTab(0);

	}
}