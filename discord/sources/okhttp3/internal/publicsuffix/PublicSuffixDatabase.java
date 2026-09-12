package okhttp3.internal.publicsuffix;

import ga.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ls.d;
import ls.n;
import rs.i;
import rs.p;
import rs.v;
import xq.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "ga/k", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f17405e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f17406f = c0.c("*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f17407g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f17408a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f17409b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f17410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f17411d;

    public static List c(String str) {
        List listS = StringsKt.S(str, new char[]{'.'});
        return Intrinsics.areEqual(CollectionsKt.Q(listS), "") ? CollectionsKt.G(listS) : listS;
    }

    public final String a(String domain) {
        String strQ;
        String strQ2;
        String strQ3;
        List listS;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        if (this.f17408a.get() || !this.f17408a.compareAndSet(false, true)) {
            try {
                this.f17409b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z5 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (Throwable th2) {
                        if (z5) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z5 = true;
                } catch (IOException e10) {
                    n nVar = n.f15297a;
                    n.f15297a.getClass();
                    n.i(5, "Failed to read public suffix list", e10);
                    if (z5) {
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f17410c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i7 = 0; i7 < size3; i7++) {
            String str = (String) listC.get(i7);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i7] = bytes;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                strQ = null;
                break;
            }
            int i11 = i10 + 1;
            byte[] bArr2 = this.f17410c;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            strQ = k.q(bArr2, bArr, i10);
            if (strQ != null) {
                break;
            }
            i10 = i11;
        }
        if (size3 <= 1) {
            strQ2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                strQ2 = null;
                break;
            }
            int i13 = i12 + 1;
            bArr3[i12] = f17405e;
            byte[] bArr4 = this.f17410c;
            if (bArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr4 = null;
            }
            strQ2 = k.q(bArr4, bArr3, i12);
            if (strQ2 != null) {
                break;
            }
            i12 = i13;
        }
        if (strQ2 == null) {
            strQ3 = null;
            break;
        }
        int i14 = size3 - 1;
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                strQ3 = null;
                break;
            }
            int i16 = i15 + 1;
            byte[] bArr5 = this.f17411d;
            if (bArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                bArr5 = null;
            }
            strQ3 = k.q(bArr5, bArr, i15);
            if (strQ3 != null) {
                break;
            }
            i15 = i16;
        }
        if (strQ3 != null) {
            listS = StringsKt.S(Intrinsics.stringPlus("!", strQ3), new char[]{'.'});
        } else if (strQ == null && strQ2 == null) {
            listS = f17406f;
        } else {
            List listS2 = strQ == null ? null : StringsKt.S(strQ, new char[]{'.'});
            if (listS2 == null) {
                listS2 = n0.f14659d;
            }
            listS = strQ2 == null ? null : StringsKt.S(strQ2, new char[]{'.'});
            if (listS == null) {
                listS = n0.f14659d;
            }
            if (listS2.size() > listS.size()) {
                listS = listS2;
            }
        }
        if (listC.size() == listS.size() && ((String) listS.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listS.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listS.size();
        } else {
            size = listC.size();
            size2 = listS.size() + 1;
        }
        return r.m(r.f(CollectionsKt.C(c(domain)), size - size2), ".");
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        p pVarD = v.d(new i(v.m(resourceAsStream)));
        try {
            long j = pVarD.readInt();
            pVarD.d0(j);
            byte[] bArrB = pVarD.f19594e.B(j);
            long j5 = pVarD.readInt();
            pVarD.d0(j5);
            byte[] bArrB2 = pVarD.f19594e.B(j5);
            Unit unit = Unit.f14616a;
            pVarD.close();
            synchronized (this) {
                Intrinsics.checkNotNull(bArrB);
                this.f17410c = bArrB;
                Intrinsics.checkNotNull(bArrB2);
                this.f17411d = bArrB2;
            }
            this.f17409b.countDown();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(pVarD, th2);
                throw th3;
            }
        }
    }
}
