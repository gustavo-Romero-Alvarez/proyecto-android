package com.example.gustavoromero_animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainActivity extends AppCompatActivity {
    private TabHost tabespec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabhost = (TabHost)findViewById(R.id.tabhost);


        // tab1
        tabhost.setup();//para abrir la configuracion para modificar el tab1
        TabSpec ts1= tabhost.newTabSpec("tab1");
        ts1.setIndicator("First animation");

        ts1.setContent(R.id.tab1);
        tabhost.addTab(ts1);

        // tab2
        tabhost.setup();//para abrir la configuracion para modificar el tab2
        TabSpec ts2= tabhost.newTabSpec("tab2");
        ts2.setIndicator("Second animation ");
        ts2.setContent(R.id.tab2);
        tabhost.addTab(ts2);

        // tab1
        tabhost.setup();//para abrir la configuracion para modificar el tab3
        TabSpec ts3= tabhost.newTabSpec("tab3");
        ts3.setIndicator("third animation");
        ts3.setContent(R.id.tab3);
        tabhost.addTab(ts3);



    }
    public void animation (View v)
    {
        Intent i = new Intent(this,Animation_act.class);
        startActivity(i);

    }
    public void animation2 (View v)
    {
        Intent i = new Intent(this,Animation2_act.class);
        startActivity(i);

    }
    public void animation3 (View v)
    {
        Intent i = new Intent(this,Animation3_act.class);
        startActivity(i);


    }
}
