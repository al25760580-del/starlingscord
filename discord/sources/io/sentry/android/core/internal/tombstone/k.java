package io.sentry.android.core.internal.tombstone;

import hj.p0;
import hj.q;
import hj.r;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f12266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile q f12267f;

    static {
        k kVar = new k();
        f12266e = kVar;
        r.h(k.class, kVar);
    }

    @Override // hj.r
    public final Object a(int i7) {
        q qVar;
        switch (f0.e.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new p0(f12266e, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
            case 3:
                return new k();
            case 4:
                return new j(f12266e);
            case 5:
                return f12266e;
            case 6:
                q qVar2 = f12267f;
                if (qVar2 != null) {
                    return qVar2;
                }
                synchronized (k.class) {
                    try {
                        qVar = f12267f;
                        if (qVar == null) {
                            qVar = new q();
                            f12267f = qVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return qVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
