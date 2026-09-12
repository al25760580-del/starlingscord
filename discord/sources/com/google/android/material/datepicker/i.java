package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f6350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, int i7, int i10) {
        super(i7, false);
        this.f6350e = mVar;
        this.f6349d = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int i7 = this.f6349d;
        m mVar = this.f6350e;
        if (i7 == 0) {
            iArr[0] = mVar.E.getWidth();
            iArr[1] = mVar.E.getWidth();
        } else {
            iArr[0] = mVar.E.getHeight();
            iArr[1] = mVar.E.getHeight();
        }
    }
}
