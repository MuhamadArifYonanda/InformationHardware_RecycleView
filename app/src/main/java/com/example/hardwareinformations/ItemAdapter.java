package com.example.hardwareinformations;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private final Context context;
    private final List<ClipData.Item> itemList;

    public ItemAdapter(Context context, List<ClipData.Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClipData.Item item = itemList.get(position);
        holder.itemTitle.setText(item.getTitle());
        holder.itemOverview.setText(item.getOverview());
        holder.itemImage.setImageResource(item.getImageResId());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("title", item.getTitle());
            intent.putExtra("description", item.getDescription());
            intent.putExtra("imageResId", item.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle, itemOverview;
        ImageView itemImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemOverview = itemView.findViewById(R.id.itemOverview);
            itemImage = itemView.findViewById(R.id.itemImage);
        }
    }
}

