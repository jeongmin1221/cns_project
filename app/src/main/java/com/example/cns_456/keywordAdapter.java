package com.example.cns_456;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class keywordAdapter extends RecyclerView.Adapter<keywordAdapter.ViewHolder> {
    Context context;
    List<String> nlist;

    public keywordAdapter(Context context, ArrayList<String> testList) {
        this.context = context;
        this.nlist = testList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.keyword_recycler,parent,false);
        return new keywordAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String strData = nlist.get(position);
    }

    @Override
    public int getItemCount() {
        return nlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
