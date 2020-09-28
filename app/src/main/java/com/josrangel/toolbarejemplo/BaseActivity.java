package com.josrangel.toolbarejemplo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class BaseActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("hola");
        setSupportActionBar(toolbar);
    }
}
