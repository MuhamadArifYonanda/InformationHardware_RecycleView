package com.example.hardwareinformations;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailTitle = findViewById(R.id.detailTitle);
        TextView detailDescription = findViewById(R.id.detailDescription);

        detailTitle.setText(getIntent().getStringExtra("title"));
        detailDescription.setText(getIntent().getStringExtra("description"));
        detailImage.setImageResource(getIntent().getIntExtra("imageResId", 0));
    }
}

