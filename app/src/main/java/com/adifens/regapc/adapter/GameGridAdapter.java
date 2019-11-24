package com.adifens.regapc.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adifens.regapc.Game;
import com.adifens.regapc.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GameGridAdapter extends RecyclerView.Adapter<GameGridAdapter.GridViewHolder> {
    private ArrayList<Game> listGame;

    public GameGridAdapter(ArrayList<Game> list) {
        this.listGame = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_layout, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listGame.get(position).getFoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.img_foto);
    }

    @Override
    public int getItemCount() {
        return listGame.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView img_foto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            img_foto = itemView.findViewById(R.id.img_item_foto);
        }
    }
}