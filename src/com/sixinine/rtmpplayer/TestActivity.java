package com.sixinine.rtmpplayer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.sixnine.live.R;
import com.sixnine.live.fragment.LiveFragment;

public class TestActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        
        LiveFragment liveFragment = new LiveFragment();
        fragmentTransaction.add(R.id.live_fragment, liveFragment);
        //fragmentTransaction.add(exampleFragment, "");
        fragmentTransaction.commit();
		
	}


}