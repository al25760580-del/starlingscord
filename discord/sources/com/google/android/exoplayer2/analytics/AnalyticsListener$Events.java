package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import je.g;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsListener$Events {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f5602b;

    public AnalyticsListener$Events(g gVar, SparseArray sparseArray) {
        this.f5601a = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.f13801a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int iA = gVar.a(i7);
            AnalyticsListener$EventTime analyticsListener$EventTime = (AnalyticsListener$EventTime) sparseArray.get(iA);
            analyticsListener$EventTime.getClass();
            sparseArray2.append(iA, analyticsListener$EventTime);
        }
        this.f5602b = sparseArray2;
    }

    public final boolean a(int i7) {
        return this.f5601a.f13801a.get(i7);
    }

    public final AnalyticsListener$EventTime b(int i7) {
        AnalyticsListener$EventTime analyticsListener$EventTime = (AnalyticsListener$EventTime) this.f5602b.get(i7);
        analyticsListener$EventTime.getClass();
        return analyticsListener$EventTime;
    }
}
