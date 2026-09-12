package n8;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f16514a = new h(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f16515b = new h(1);

    public static void a(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(boolean z5, String str, Object... objArr) {
        if (!z5) {
            throw new IllegalArgumentException(g(str, objArr));
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void e(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String g(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i7 = 0;
        int i10 = 0;
        while (i7 < objArr.length && (iIndexOf = str.indexOf("%s", i10)) != -1) {
            sb2.append(str.substring(i10, iIndexOf));
            sb2.append(objArr[i7]);
            i10 = iIndexOf + 2;
            i7++;
        }
        sb2.append(str.substring(i10));
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i11 = i7 + 1; i11 < objArr.length; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void h(Throwable th2) throws Throwable {
        if (Error.class.isInstance(th2)) {
            throw ((Throwable) Error.class.cast(th2));
        }
        if (!RuntimeException.class.isInstance(th2)) {
            throw new RuntimeException(th2);
        }
        throw ((Throwable) RuntimeException.class.cast(th2));
    }

    public static int i(InputStream inputStream, byte[] bArr, int i7) {
        inputStream.getClass();
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i10 = 0;
        while (i10 < i7) {
            int i11 = inputStream.read(bArr, i10, i7 - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        return i10;
    }

    public static f j(Object obj) {
        return new f(obj.getClass().getSimpleName(), 1);
    }
}
