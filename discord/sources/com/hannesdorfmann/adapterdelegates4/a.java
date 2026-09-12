package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends RecyclerView.Adapter {
    protected AdapterDelegatesManager delegatesManager;
    protected Object items;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i7) {
        AdapterDelegatesManager adapterDelegatesManager = this.delegatesManager;
        Object obj = this.items;
        SparseArrayCompat sparseArrayCompat = adapterDelegatesManager.f6654a;
        if (obj == null) {
            throw new NullPointerException("Items datasource is null!");
        }
        int iG = sparseArrayCompat.g();
        for (int i10 = 0; i10 < iG; i10++) {
            if (((b) sparseArrayCompat.h(i10)).isForViewType(obj, i7)) {
                return sparseArrayCompat.d(i10);
            }
        }
        throw new NullPointerException(obj instanceof List ? "No AdapterDelegate added that matches item=" + ((List) obj).get(i7).toString() + " at position=" + i7 + " in data source" : "No AdapterDelegate added for item at position=" + i7 + ". items=" + obj);
    }

    public Object getItems() {
        return this.items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i7) {
        this.delegatesManager.b(this.items, i7, viewHolder, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7) {
        b bVarA = this.delegatesManager.a(i7);
        if (bVarA == null) {
            throw new NullPointerException(kk.b.h(i7, "No AdapterDelegate added for ViewType "));
        }
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = bVarA.onCreateViewHolder(viewGroup);
        if (viewHolderOnCreateViewHolder != null) {
            return viewHolderOnCreateViewHolder;
        }
        throw new NullPointerException("ViewHolder returned from AdapterDelegate " + bVarA + " for ViewType =" + i7 + " is null!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        AdapterDelegatesManager adapterDelegatesManager = this.delegatesManager;
        adapterDelegatesManager.getClass();
        b bVarA = adapterDelegatesManager.a(viewHolder.getItemViewType());
        if (bVarA != null) {
            return bVarA.onFailedToRecycleView(viewHolder);
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        AdapterDelegatesManager adapterDelegatesManager = this.delegatesManager;
        adapterDelegatesManager.getClass();
        b bVarA = adapterDelegatesManager.a(viewHolder.getItemViewType());
        if (bVarA != null) {
            bVarA.onViewAttachedToWindow(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        AdapterDelegatesManager adapterDelegatesManager = this.delegatesManager;
        adapterDelegatesManager.getClass();
        b bVarA = adapterDelegatesManager.a(viewHolder.getItemViewType());
        if (bVarA != null) {
            bVarA.onViewDetachedFromWindow(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        AdapterDelegatesManager adapterDelegatesManager = this.delegatesManager;
        adapterDelegatesManager.getClass();
        b bVarA = adapterDelegatesManager.a(viewHolder.getItemViewType());
        if (bVarA != null) {
            bVarA.onViewRecycled(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public void setItems(Object obj) {
        this.items = obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i7, @NonNull List list) {
        this.delegatesManager.b(this.items, i7, viewHolder, list);
    }
}
