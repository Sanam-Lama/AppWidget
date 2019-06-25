package com.example.appwidget;

/* App widget is small gadget or control of the android application placed on the home screen.
 * Four steps to remember while creating appwidget
 * 1. Mention in the manifext with intent filter
 * 2. Java extends AppWidgetProvider*
 * 3. Override onUpdate
 * 4. Create an xml file specifying the time duration  */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
