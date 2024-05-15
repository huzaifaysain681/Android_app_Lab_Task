package com.example.adaptermenu;// MainActivity.java
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", "$10.00", R.drawable.image1));
        products.add(new Product("Product 2", "$20.00", R.drawable.image2));
        // Add more products as needed

        ProductAdapter adapter = new ProductAdapter(this, products);


        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

}
