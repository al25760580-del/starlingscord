package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f1936a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1937b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f1937b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw w.f();
        } catch (w e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static s c(Object obj, Object obj2) {
        s sVar = (s) ((a) obj);
        q qVar = (q) sVar.d(5);
        qVar.c();
        q.d(qVar.f1927e, sVar);
        a aVar = (a) obj2;
        if (!qVar.f1926d.getClass().isInstance(aVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        qVar.c();
        q.d(qVar.f1927e, (s) aVar);
        return qVar.b();
    }
}
