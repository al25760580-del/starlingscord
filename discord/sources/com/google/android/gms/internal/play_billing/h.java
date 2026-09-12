package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b0 f6016i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6018d;

    static {
        a1.d dVar = new a1.d(3, (byte) 0);
        dVar.f18i = new Object[8];
        dVar.f17e = 0;
        for (h hVar : values()) {
            Integer numValueOf = Integer.valueOf(hVar.f6018d);
            int i7 = dVar.f17e + 1;
            Object[] objArr = (Object[]) dVar.f18i;
            int length = objArr.length;
            int i10 = i7 + i7;
            if (i10 > length) {
                dVar.f18i = Arrays.copyOf(objArr, z1.b(length, i10));
            }
            Object[] objArr2 = (Object[]) dVar.f18i;
            int i11 = dVar.f17e;
            int i12 = i11 + i11;
            objArr2[i12] = numValueOf;
            objArr2[i12 + 1] = hVar;
            dVar.f17e = i11 + 1;
        }
        t tVar = (t) dVar.f19v;
        if (tVar != null) {
            throw tVar.a();
        }
        b0 b0VarA = b0.a(dVar.f17e, (Object[]) dVar.f18i, dVar);
        t tVar2 = (t) dVar.f19v;
        if (tVar2 != null) {
            throw tVar2.a();
        }
        f6016i = b0VarA;
    }

    h(int i7) {
        this.f6018d = i7;
    }
}
