package com.example.zakupy_edycja3p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.ProductViewHolder> {

    private ArrayList<Product> products;
    private LayoutInflater inflater;

    public ShoppingAdapter(Context context, ArrayList<Product> products) {
        this.products = products;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View proditemView = inflater.inflate(R.layout.item_product, parent, false);

        return new ProductViewHolder(proditemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
    Product current_prod = products.get(position);
    holder.checkBoxItem.setText(current_prod.getName());
    holder.checkBoxItem.setChecked(current_prod.isChecked());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }




    //podklasa
    public class ProductViewHolder extends RecyclerView.ViewHolder {
        public CheckBox checkBoxItem;
        final ShoppingAdapter shopAdapter;


        public ProductViewHolder(@NonNull View itemView, ShoppingAdapter shopAdapter) {
            super(itemView);
            this.shopAdapter = shopAdapter;
            checkBoxItem = itemView.findViewById(R.id.checkBox);
        }
    }//koniec podklasy
}
