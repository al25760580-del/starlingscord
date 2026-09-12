package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends CopyOnWriteArrayList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f12172d;

    public d0(e0 e0Var) {
        this.f12172d = e0Var;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c0 c0Var = (c0) obj;
        boolean zAdd = super.add(c0Var);
        if (Boolean.FALSE.equals(this.f12172d.f12179e.f12185v)) {
            c0Var.c();
            return zAdd;
        }
        if (Boolean.TRUE.equals(this.f12172d.f12179e.f12185v)) {
            c0Var.f();
        }
        return zAdd;
    }
}
