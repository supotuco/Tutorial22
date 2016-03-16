package com.diego.tutorial22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
//to test stuff
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);
        switch(item.getItemId()){
            case R.id.id_blue_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.blue, null));
                break;
            case R.id.id_red_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.red, null));
                break;
            case R.id.id_green_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.green, null));
                break;
            case R.id.id_purple_color:
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.purple, null));
                break;
        }
        return true;

    }

}
