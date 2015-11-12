package com.example.franksisca.myapplication.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.franksisca.myapplication.R;
import com.example.franksisca.myapplication.fragments.SayHelloFragment;

public class MainActivity extends FragmentActivity {

    public static final String TAG = MainActivity.class.getCanonicalName();

    private static final int FRAGMENT_CONTEINER = R.id.fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragment = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragment.beginTransaction();

        SayHelloFragment sayHelloFragment = SayHelloFragment.newInstance();
        fragmentTransaction.replace(FRAGMENT_CONTEINER, sayHelloFragment, SayHelloFragment.TAG);

        fragmentTransaction.commit();
    }

}
