package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public abstract boolean isForViewType(Object obj, int i7);

    public abstract void onBindViewHolder(Object obj, int i7, RecyclerView.ViewHolder viewHolder, List list);

    public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup);

    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
    }

    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
    }
}
