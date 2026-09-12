package ls;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile n f15297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f15298b;

    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[PHI: r3
      0x0073: PHI (r3v3 ls.n) = (r3v1 ls.n), (r3v4 ls.n) binds: [B:65:0x015f, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[PHI: r1
      0x0095: PHI (r1v27 ls.n) = (r1v15 ls.n), (r1v21 ls.n), (r1v25 ls.n), (r1v30 ls.n) binds: [B:55:0x00e3, B:49:0x00d5, B:41:0x00b5, B:33:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    static {
        n kVar;
        String jvmVersion;
        n nVar;
        n jVar = null;
        if (kh.f.f()) {
            for (Map.Entry entry : ms.c.f16084b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (ms.c.f16083a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(ms.d.f16085a);
                }
            }
            nVar = a.f15273d ? new a() : null;
            if (nVar == null) {
                jVar = c.f15277e ? new c() : null;
                Intrinsics.checkNotNull(jVar);
                nVar = jVar;
            }
        } else if (Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName())) {
            kVar = h.f15284d ? new h() : null;
            if (kVar != null) {
                nVar = kVar;
            } else if (!Intrinsics.areEqual("BC", Security.getProviders()[0].getName())) {
                if (e.f15281d) {
                    kVar = new e();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (m.f15295d) {
                        kVar = new m();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        if (k.f15294c) {
                            kVar = new k();
                        } else {
                            kVar = null;
                        }
                        if (kVar != null) {
                            nVar = kVar;
                        } else {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                                Class<?> clientProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                                Class<?> serverProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                Method getMethod = cls.getMethod("get", SSLSocket.class);
                                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                                jVar = new j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                            }
                            if (jVar != null) {
                                nVar = jVar;
                            } else {
                                nVar = new n();
                            }
                        }
                    }
                } else {
                    if (k.f15294c) {
                        kVar = new k();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                            Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                            Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod2, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod2, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod2, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass2, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass2, "serverProviderClass");
                            jVar = new j(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                }
            } else if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
                if (k.f15294c) {
                    kVar = new k();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls6 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                        Class<?> clientProviderClass3 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                        Class<?> serverProviderClass3 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                        Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                        Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                        Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                        Intrinsics.checkNotNullExpressionValue(putMethod3, "putMethod");
                        Intrinsics.checkNotNullExpressionValue(getMethod3, "getMethod");
                        Intrinsics.checkNotNullExpressionValue(removeMethod3, "removeMethod");
                        Intrinsics.checkNotNullExpressionValue(clientProviderClass3, "clientProviderClass");
                        Intrinsics.checkNotNullExpressionValue(serverProviderClass3, "serverProviderClass");
                        jVar = new j(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            } else {
                if (m.f15295d) {
                    kVar = new m();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    if (k.f15294c) {
                        kVar = new k();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls8 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass4 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                            Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                            Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod4, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod4, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod4, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass4, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass4, "serverProviderClass");
                            jVar = new j(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                }
            }
        } else if (!Intrinsics.areEqual("BC", Security.getProviders()[0].getName())) {
            if (e.f15281d) {
                kVar = new e();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar;
            } else if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
                if (k.f15294c) {
                    kVar = new k();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls10 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                        Class<?> clientProviderClass5 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                        Class<?> serverProviderClass5 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                        Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                        Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                        Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                        Intrinsics.checkNotNullExpressionValue(putMethod5, "putMethod");
                        Intrinsics.checkNotNullExpressionValue(getMethod5, "getMethod");
                        Intrinsics.checkNotNullExpressionValue(removeMethod5, "removeMethod");
                        Intrinsics.checkNotNullExpressionValue(clientProviderClass5, "clientProviderClass");
                        Intrinsics.checkNotNullExpressionValue(serverProviderClass5, "serverProviderClass");
                        jVar = new j(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            } else {
                if (m.f15295d) {
                    kVar = new m();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    if (k.f15294c) {
                        kVar = new k();
                    } else {
                        kVar = null;
                    }
                    if (kVar != null) {
                        nVar = kVar;
                    } else {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls12 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass6 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass6 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                            Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                            Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod6, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod6, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod6, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass6, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass6, "serverProviderClass");
                            jVar = new j(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                        }
                        if (jVar != null) {
                            nVar = jVar;
                        } else {
                            nVar = new n();
                        }
                    }
                }
            }
        } else if (Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName())) {
            if (k.f15294c) {
                kVar = new k();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar;
            } else {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            Class<?> clientProviderClass7 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> serverProviderClass7 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            Intrinsics.checkNotNullExpressionValue(putMethod7, "putMethod");
                            Intrinsics.checkNotNullExpressionValue(getMethod7, "getMethod");
                            Intrinsics.checkNotNullExpressionValue(removeMethod7, "removeMethod");
                            Intrinsics.checkNotNullExpressionValue(clientProviderClass7, "clientProviderClass");
                            Intrinsics.checkNotNullExpressionValue(serverProviderClass7, "serverProviderClass");
                            jVar = new j(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (jVar != null) {
                    nVar = jVar;
                } else {
                    nVar = new n();
                }
            }
        } else {
            if (m.f15295d) {
                kVar = new m();
            } else {
                kVar = null;
            }
            if (kVar != null) {
                nVar = kVar;
            } else {
                if (k.f15294c) {
                    kVar = new k();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    nVar = kVar;
                } else {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                        Class<?> clientProviderClass8 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                        Class<?> serverProviderClass8 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        Intrinsics.checkNotNullExpressionValue(putMethod8, "putMethod");
                        Intrinsics.checkNotNullExpressionValue(getMethod8, "getMethod");
                        Intrinsics.checkNotNullExpressionValue(removeMethod8, "removeMethod");
                        Intrinsics.checkNotNullExpressionValue(clientProviderClass8, "clientProviderClass");
                        Intrinsics.checkNotNullExpressionValue(serverProviderClass8, "serverProviderClass");
                        jVar = new j(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (jVar != null) {
                        nVar = jVar;
                    } else {
                        nVar = new n();
                    }
                }
            }
        }
        f15297a = nVar;
        f15298b = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static void i(int i7, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        f15298b.log(i7 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public l b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new ps.a(c(trustManager));
    }

    public ps.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new ps.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i7);
    }

    public String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f15298b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = Intrinsics.stringPlus(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, message, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", e10), e10);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
