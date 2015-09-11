package com.example.fgonzalez.developerhub.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.fgonzalez.developerhub.R;
import com.example.fgonzalez.developerhub.Util.BaseActivity;
import com.parse.ParseObject;

public class MainActivity extends BaseActivity {



    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);

    }

    @Override
    protected int getLayoutResource() {
        return 0;
    }


}
