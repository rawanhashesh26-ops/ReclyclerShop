package com.example.recyclershop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
        
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{
    private List<Product> productList;
    public ProductAdapter(List<Product> productList){
        this.productList = productList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        Product product = productList.get(position);
        holder.productName.setText(product.name);
        holder.productPrice.setText(product.price);
        holder.productImage.setImageResource(product.imageRes);
    }
    @Override
    public  int getItemCount(){
        return productList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView productImage;
        TextView productName, productPrice;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
            productPrice = itemView.findViewById(R.id.productPrice);
        }
    }

}
