package com.ankitsharma6466.androiddesignlibrarysample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void onNavigationViewClick(View v){
        Intent intent = new Intent(LauncherActivity.this, DrawerActivity.class);
        startActivity(intent);
    }

    public void onFABClick(View v){
        Intent intent = new Intent(LauncherActivity.this, DrawerActivity.class);
        startActivity(intent);
    }

    public void onTabViewClick(View v){
        Intent intent = new Intent(LauncherActivity.this, DrawerActivity.class);
        startActivity(intent);
    }

    public void onCollapsibleClick(View v){
        Intent intent = new Intent(LauncherActivity.this, DrawerActivity.class);
        startActivity(intent);
    }

    public void onTextInputClick(View v){
        Intent intent = new Intent(LauncherActivity.this, DrawerActivity.class);
        startActivity(intent);
    }

}
