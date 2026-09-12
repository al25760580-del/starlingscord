package com.hannesdorfmann.adapterdelegates4;

import androidx.collection.SparseArrayCompat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {
    public c() {
        AdapterDelegatesManager adapterDelegatesManager = new AdapterDelegatesManager();
        adapterDelegatesManager.f6654a = new SparseArrayCompat(0);
        this.delegatesManager = adapterDelegatesManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Object obj = this.items;
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }
}
