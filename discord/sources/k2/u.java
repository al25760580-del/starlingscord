package k2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f14265d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.messaging.r f14267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f14268c = 0;

    public u(com.google.firebase.messaging.r rVar, int i7) {
        this.f14267b = rVar;
        this.f14266a = i7;
    }

    public final int a(int i7) {
        l2.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f1674v;
        int i10 = iA + aVarB.f1671d;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final l2.a b() {
        ThreadLocal threadLocal = f14265d;
        l2.a aVar = (l2.a) threadLocal.get();
        if (aVar == null) {
            aVar = new l2.a();
            threadLocal.set(aVar);
        }
        l2.b bVar = (l2.b) this.f14267b.f6610d;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i7 = iA + bVar.f1671d;
            int i10 = (this.f14266a * 4) + ((ByteBuffer) bVar.f1674v).getInt(i7) + i7 + 4;
            int i11 = ((ByteBuffer) bVar.f1674v).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1674v;
            aVar.f1674v = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1671d = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f1672e = i12;
                aVar.f1673i = ((ByteBuffer) aVar.f1674v).getShort(i12);
                return aVar;
            }
            aVar.f1671d = 0;
            aVar.f1672e = 0;
            aVar.f1673i = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        l2.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f1674v).getInt(iA + aVarB.f1671d) : 0));
        sb2.append(", codepoints:");
        l2.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f1671d;
            i7 = ((ByteBuffer) aVarB2.f1674v).getInt(((ByteBuffer) aVarB2.f1674v).getInt(i10) + i10);
        } else {
            i7 = 0;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
