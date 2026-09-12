package sp;

import vp.o;

/* JADX INFO: loaded from: classes3.dex */
public enum h implements o {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20468d;

    h(int i7) {
        this.f20468d = i7;
    }

    @Override // vp.o
    public final int a() {
        return this.f20468d;
    }
}
