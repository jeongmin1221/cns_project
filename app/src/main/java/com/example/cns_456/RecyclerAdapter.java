package com.example.cns_456;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
    private final ArrayList<keyword_class> listkeyword_class = new ArrayList<>();

    @NonNull
    @Override
    public RecyclerAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.keyword_recycler,parent, false);
        return new ItemViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.onBind(listkeyword_class.get(position));
    }

    public int getItemCount() {
        return listkeyword_class.size();
    }

    void addItem(keyword_class data){
        listkeyword_class.add(data);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final TextView textView2;

        ItemViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }

        void onBind(keyword_class data) {
            textView.setText(data.getLawName());
            textView2.setText(data.getLawContent());
        }
    }
}
