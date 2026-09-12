package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n.j;
import n.x;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuView extends RecyclerView implements x {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // n.x
    public final void b(j jVar) {
    }
}
