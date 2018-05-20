package com.library.android.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        textView = findViewById(R.id.joke_text_view);

        String joke = getIntent().getStringExtra("joke");

        textView.setText(joke);

    }
}
