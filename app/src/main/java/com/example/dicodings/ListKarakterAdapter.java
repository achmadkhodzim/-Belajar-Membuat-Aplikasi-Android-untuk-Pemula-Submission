package com.example.dicodings;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListKarakterAdapter extends RecyclerView.Adapter<ListKarakterAdapter.CategoryViewHolder> {
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    private ArrayList<Karakter> listKarakters;

    public ListKarakterAdapter(ArrayList<Karakter> list) {
        this.listKarakters = list;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hero, viewGroup, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder categoryViewHolder, int i) {
        Karakter karakter = listKarakters.get(i);
        Glide.with(categoryViewHolder.itemView.getContext())
                .load(karakter.getPhoto())

                .into(categoryViewHolder.imgPhoto);
        categoryViewHolder.tvName.setText(karakter.getName());
        categoryViewHolder.tvFrom.setText(karakter.getFrom());
        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKarakters.get(categoryViewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKarakters.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;
        CategoryViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Karakter data);
    }
}