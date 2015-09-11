package com.example.fgonzalez.developerhub.Util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.fgonzalez.developerhub.R;

/**
 * Created by fgonzalez on 11/09/2015.
 */
public abstract class BaseActivity extends AppCompatActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        toolbar = (Toolbar) findViewById(R  .id.toolbar); // Attaching the layout to the toolbar object

       if(toolbar != null)
       {
           setSupportActionBar(toolbar);
           getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       }

    }

    protected abstract int getLayoutResource ();

    protected void setActionBarIcon(int iconRes)
    {
        toolbar.setNavigationIcon(iconRes);
    }

}


