package vr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f21954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f21955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f21956c;

    static {
        boolean zEqualsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f21954a = zEqualsIgnoreCase;
        f21956c = !zEqualsIgnoreCase && Boolean.getBoolean("net.time4j.base.useClassloaderOnly");
        String property = System.getProperty("net.time4j.base.ResourceLoader");
        if (property == null) {
            b bVar = new b();
            if (zEqualsIgnoreCase) {
                throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
            }
            f21955b = bVar;
            return;
        }
        try {
            f21955b = (c) Class.forName(property).newInstance();
        } catch (Exception e10) {
            throw new AssertionError("Wrong configuration of external resource loader: " + e10.getMessage());
        }
    }

    public static InputStream a(Class cls, String str) throws IOException {
        if (f21954a) {
            throw new FileNotFoundException(str);
        }
        URL resource = cls.getClassLoader().getResource(str);
        if (resource == null) {
            throw new FileNotFoundException(str);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        uRLConnectionOpenConnection.connect();
        return uRLConnectionOpenConnection.getInputStream();
    }

    public abstract InputStream b(URI uri);

    public abstract URI c(String str, String str2, Class cls);

    public abstract Iterable d(Class cls);
}
