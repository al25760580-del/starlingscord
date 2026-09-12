package ej;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements ti.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8425d;

    b(int i7) {
        this.f8425d = i7;
    }

    @Override // ti.c
    public final int a() {
        return this.f8425d;
    }
}
