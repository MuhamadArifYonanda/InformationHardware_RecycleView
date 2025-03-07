package com.example.hardwareinformations;

import android.content.ClipData;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ClipData.Item> itemList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            itemList.add(new ClipData.Item("Title " + i, "This is item " + i, "Description of item " + i, R.drawable.ic_launcher_foreground));
        }

        ItemAdapter adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}
