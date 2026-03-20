package com.berk.bilim;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.StringViewHolder> {

    private List<String> stringList;

    public StringAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new StringViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        holder.itemTextView.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public static class StringViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTextView;

        public StringViewHolder(View itemView) {
            super(itemView);
            itemTextView = itemView.findViewById(R.id.itemTextView);
        }
    }
}
