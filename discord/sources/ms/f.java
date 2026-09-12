package ms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public class f implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f16086f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f16088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f16089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f16090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f16091e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f16086f = new e();
    }

    public f(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f16087a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f16088b = declaredMethod;
        this.f16089c = sslSocketClass.getMethod("setHostname", String.class);
        this.f16090d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f16091e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ms.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f16087a.isInstance(sslSocket);
    }

    @Override // ms.m
    public final boolean b() {
        boolean z5 = ls.c.f15277e;
        return ls.c.f15277e;
    }

    @Override // ms.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f16090d.invoke(sslSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e11);
                }
            }
        }
        return null;
    }

    @Override // ms.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f16088b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f16089c.invoke(sslSocket, str);
                }
                Method method = this.f16091e;
                ls.n nVar = ls.n.f15297a;
                method.invoke(sslSocket, kh.f.d(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
