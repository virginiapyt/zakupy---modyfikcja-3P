package com.example.zakupy_edycja3p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> products = new ArrayList<>();
    private RecyclerView recyclerView;
    private ShoppingAdapter shoppingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        products.add(new Product("mleko"));
        products.add(new Product("jajka"));
        products.add(new Product("ser"));
        products.add(new Product("porshe"));
        products.add(new Product("mleko"));
        products.add(new Product("jajka"));
        products.add(new Product("ser"));
        products.add(new Product("porshe"));
        products.add(new Product("mleko"));
        products.add(new Product("jajka"));
        products.add(new Product("ser"));
        products.add(new Product("porshe"));


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        shoppingAdapter = new ShoppingAdapter(this, products);
        recyclerView.setAdapter(shoppingAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}