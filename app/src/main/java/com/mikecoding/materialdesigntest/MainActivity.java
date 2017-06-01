package com.mikecoding.materialdesigntest;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Welcome");
        toolbar.setSubtitle("Everybody");

        //toolbar.setLogo();

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //material design api here

            toolbar.setElevation(10f);

        } else {
            //without material design here


        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        String msg = "";

        switch(item.getItemId()){
            case R.id.discard:
                msg=getString(R.string.edit);
                break;
            case R.id.search:
                msg=getString(R.string.search);
                break;
            case R.id.edit:
                msg=getString(R.string.edit);
                break;
            case R.id.settings:
                msg=getString(R.string.settings);
                break;
            case R.id.exit:
                msg=getString(R.string.exit);
                break;
        }
        //Toast.makeText(this, msg + " Clicked");
        return true;
    }
}
