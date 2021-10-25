package com.example.zakupy_edycja3p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        shoppingAdapter = new ShoppingAdapter(this, products);
        recyclerView.setAdapter(shoppingAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //przycisk dodaj

        Button btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.editText);
                String productName = editText.getText().toString();
                productName = productName.trim();
                if (productName.length()>0){
                    Product prod = new Product(productName);
                    shoppingAdapter.addProduct(prod);
                    editText.setText("");  //czyszczenie pola
                }
            }
        });

        //przycisk usun

        Button btn_del = (Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shoppingAdapter.delProduct();

            }
        });


    }
}