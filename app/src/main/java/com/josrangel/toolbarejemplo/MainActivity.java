package com.josrangel.toolbarejemplo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.text);
        registerForContextMenu(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.accion_favorite:
                Toast.makeText(this,"favoritos",Toast.LENGTH_SHORT).show();
                Log.i("clickItem","favoritos");
                break;

            case R.id.accion_settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                Log.i("clickItem","Settings");
                break;
        }
        /*if (item.getItemId() == R.id.accion_favorite){
            Toast.makeText(this,"favoritos",Toast.LENGTH_SHORT).show();
            Log.i("clickItem","favoritos");
        }

        if (item.getItemId() == R.id.accion_settings){
            Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
            Log.i("clickItem","Settings");
        }*/

        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        return true;
    }
}