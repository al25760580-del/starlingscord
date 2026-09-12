package yb;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements ti.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23227d;

    c(int i7) {
        this.f23227d = i7;
    }

    @Override // ti.c
    public final int a() {
        return this.f23227d;
    }
}
