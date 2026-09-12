package com.google.android.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.reactnativecommunity.webview.RNCWebViewManager;
import fe.g;
import java.util.Map;
import je.e0;
import md.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends TrackSelectionParameters {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final a f5747n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final a f5748o0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f5749b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f5750c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f5751d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f5752e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f5753f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f5754g0;
    public final boolean h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final boolean f5755i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final boolean f5756j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f5757k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final SparseArray f5758l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final SparseBooleanArray f5759m0;

    static {
        a aVar = new a(new g());
        f5747n0 = aVar;
        f5748o0 = aVar;
        int i7 = e0.f13788a;
        Integer.toString(1000, 36);
        Integer.toString(RNCWebViewManager.COMMAND_CLEAR_CACHE, 36);
        Integer.toString(RNCWebViewManager.COMMAND_CLEAR_HISTORY, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
    }

    public a(g gVar) {
        super(gVar);
        this.X = gVar.A;
        this.Y = gVar.B;
        this.Z = gVar.C;
        this.a0 = gVar.D;
        this.f5749b0 = gVar.E;
        this.f5750c0 = gVar.F;
        this.f5751d0 = gVar.G;
        this.f5752e0 = gVar.H;
        this.f5753f0 = gVar.I;
        this.f5754g0 = gVar.J;
        this.h0 = gVar.K;
        this.f5755i0 = gVar.L;
        this.f5756j0 = gVar.M;
        this.f5757k0 = gVar.N;
        this.f5758l0 = gVar.O;
        this.f5759m0 = gVar.P;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (super.equals(aVar) && this.X == aVar.X && this.Y == aVar.Y && this.Z == aVar.Z && this.a0 == aVar.a0 && this.f5749b0 == aVar.f5749b0 && this.f5750c0 == aVar.f5750c0 && this.f5751d0 == aVar.f5751d0 && this.f5752e0 == aVar.f5752e0 && this.f5753f0 == aVar.f5753f0 && this.f5754g0 == aVar.f5754g0 && this.h0 == aVar.h0 && this.f5755i0 == aVar.f5755i0 && this.f5756j0 == aVar.f5756j0 && this.f5757k0 == aVar.f5757k0) {
                SparseBooleanArray sparseBooleanArray = aVar.f5759m0;
                SparseBooleanArray sparseBooleanArray2 = this.f5759m0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i7)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = aVar.f5758l0;
                    SparseArray sparseArray2 = this.f5758l0;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i10 = 0; i10 < size2; i10++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i10);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        y0 y0Var = (y0) entry.getKey();
                                        if (!map2.containsKey(y0Var) || !e0.a(entry.getValue(), map2.get(y0Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
    public final int hashCode() {
        return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.a0 ? 1 : 0)) * 31) + (this.f5749b0 ? 1 : 0)) * 31) + (this.f5750c0 ? 1 : 0)) * 31) + (this.f5751d0 ? 1 : 0)) * 31) + (this.f5752e0 ? 1 : 0)) * 31) + (this.f5753f0 ? 1 : 0)) * 31) + (this.f5754g0 ? 1 : 0)) * 31) + (this.h0 ? 1 : 0)) * 31) + (this.f5755i0 ? 1 : 0)) * 31) + (this.f5756j0 ? 1 : 0)) * 31) + (this.f5757k0 ? 1 : 0);
    }
}
