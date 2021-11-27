package com.example.myapplicationmain;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import static com.example.myapplicationmain.R.menu.menu;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);

    }

    private void setSupportActionBar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

        @Override
        public boolean onOptionsItemSelected(MenuItem item){

            switch (item.getItemId()) {

                case R.id.map:
                    Intent shareIntent = new Intent(MainActivity.this, map.class);
                    startActivity(shareIntent);
                    return true;

                default:
                    return super.onOptionsItemSelected(item);

            }
        }

}
