package com.horcrux.svg;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new SvgViewManager();
    }
}
