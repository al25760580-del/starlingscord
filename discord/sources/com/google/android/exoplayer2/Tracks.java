package com.google.android.exoplayer2;

import ei.c0;
import ei.e0;
import ei.r0;
import gc.g;
import gc.w1;

/* JADX INFO: loaded from: classes3.dex */
public final class Tracks implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Tracks f5589e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f5590d;

    static {
        c0 c0Var = e0.f8303e;
        f5589e = new Tracks(r0.f8352w);
        int i7 = je.e0.f13788a;
        Integer.toString(0, 36);
    }

    public Tracks(r0 r0Var) {
        this.f5590d = e0.k(r0Var);
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            e0 e0Var = this.f5590d;
            if (i10 >= e0Var.size()) {
                return false;
            }
            w1 w1Var = (w1) e0Var.get(i10);
            for (boolean z5 : w1Var.f9932w) {
                if (z5) {
                    if (w1Var.f9929e.f15729i != i7) {
                        break;
                    }
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.f5590d.equals(((Tracks) obj).f5590d);
    }

    public final int hashCode() {
        return this.f5590d.hashCode();
    }
}
