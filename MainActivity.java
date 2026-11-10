package com.example.recyclershop;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       RecyclerView recyclerView = findViewById(R.id.recyclerView);
       recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

       List<product> productList = new ArrayList<>();
       productList.add(new Product("Polaroid Camera", "50$", R.drawable.camera1));
        productList.add(new Product("Samsung Gear 360", "120$", R.drawable.camera2));
        productList.add(new Product("Polaroid OneStep", "80$", R.drawable.camera3));
        productList.add(new Product("Action Camera 4K", "200$", R.drawable.camera4));
        productList.add(new Product("Polaroid Sun 600", "150$", R.drawable.camera5));
        productList.add(new Product("Vintage Polaroid", "140$", R.drawable.camera6));

        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);

    }
}