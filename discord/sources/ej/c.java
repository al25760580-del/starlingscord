package ej;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements ti.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8428d;

    c(int i7) {
        this.f8428d = i7;
    }

    @Override // ti.c
    public final int a() {
        return this.f8428d;
    }
}
