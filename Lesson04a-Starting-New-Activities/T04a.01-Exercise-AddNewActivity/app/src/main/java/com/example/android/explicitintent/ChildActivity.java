package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// Do steps 6 & 7 in ChildActivity.java
// Done (6) Create a TextView field to display your message
// Done (7) Get a reference to your TextView in Java

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        TextView text = (TextView) findViewById(R.id.tv_display);
    }
}
