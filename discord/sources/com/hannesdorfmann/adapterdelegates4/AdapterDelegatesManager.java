package com.hannesdorfmann.adapterdelegates4;

import a3.e;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AdapterDelegatesManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f6653b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArrayCompat f6654a;

    public final b a(int i7) {
        Object obj;
        SparseArrayCompat sparseArrayCompat = this.f6654a;
        sparseArrayCompat.getClass();
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iA = t.a.a(sparseArrayCompat.f1226v, i7, sparseArrayCompat.f1224e);
        if (iA < 0 || (obj = sparseArrayCompat.f1225i[iA]) == l.f19641b) {
            obj = null;
        }
        return (b) obj;
    }

    public final void b(Object obj, int i7, RecyclerView.ViewHolder viewHolder, List list) {
        b bVarA = a(viewHolder.getItemViewType());
        if (bVarA == null) {
            StringBuilder sbS = e.s(i7, "No delegate found for item at position = ", " for viewType = ");
            sbS.append(viewHolder.getItemViewType());
            throw new NullPointerException(sbS.toString());
        }
        if (list == null) {
            list = f6653b;
        }
        bVarA.onBindViewHolder(obj, i7, viewHolder, list);
    }
}
