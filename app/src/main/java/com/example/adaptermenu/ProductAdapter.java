package com.example.adaptermenu;// ProductAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    public ProductAdapter(@NonNull Context context, @NonNull List<Product> products) {
        super(context, 0, products);
    }

    @Nullable
    @Override
    public Product getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }

        ImageView productImageView = convertView.findViewById(R.id.productImageView);
        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        TextView priceTextView = convertView.findViewById(R.id.priceTextView);

        if (product != null) {
            productImageView.setImageResource(product.getImageResId());
            nameTextView.setText(product.getName());
            priceTextView.setText(product.getPrice());
        }

        return convertView;
    }
}
