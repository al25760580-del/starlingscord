package mc;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements lc.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15485d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f15486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f15487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15488c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z5;
        if ("Amazon".equals(je.e0.f13790c)) {
            String str = je.e0.f13791d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        f15485d = z5;
    }

    public a0(UUID uuid, byte[] bArr, boolean z5) {
        this.f15486a = uuid;
        this.f15487b = bArr;
        this.f15488c = z5;
    }
}
