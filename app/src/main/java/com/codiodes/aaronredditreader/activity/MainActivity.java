package com.codiodes.aaronredditreader.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.codiodes.aaronredditreader.R;
import com.codiodes.aaronredditreader.fragment.MainActivityFragment;
import com.codiodes.aaronredditreader.helper.FragmentHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentHelper.addFragment(R.id.fragment, new MainActivityFragment(), this);
    }
}
