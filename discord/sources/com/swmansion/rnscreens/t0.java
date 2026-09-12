package com.swmansion.rnscreens;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends u0 {
    public t0() {
        super("TEXT", 0);
    }

    @Override // com.swmansion.rnscreens.u0
    public final int a(p0 capitalize) {
        Intrinsics.checkNotNullParameter(capitalize, "capitalize");
        int iOrdinal = capitalize.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 8192;
        }
        if (iOrdinal == 2) {
            return 16384;
        }
        if (iOrdinal == 3) {
            return RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        throw new rn.n();
    }
}
