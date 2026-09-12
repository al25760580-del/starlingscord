package ej;

/* JADX INFO: loaded from: classes3.dex */
public enum a implements ti.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8421d;

    a(int i7) {
        this.f8421d = i7;
    }

    @Override // ti.c
    public final int a() {
        return this.f8421d;
    }
}
