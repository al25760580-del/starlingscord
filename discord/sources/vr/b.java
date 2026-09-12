package vr;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    @Override // vr.c
    public final InputStream b(URI uri) {
        if (uri == null || c.f21956c) {
            return null;
        }
        try {
            URLConnection uRLConnectionOpenConnection = uri.toURL().openConnection();
            uRLConnectionOpenConnection.setUseCaches(false);
            uRLConnectionOpenConnection.connect();
            return uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e10) {
            if (!uri.toString().contains(".repository")) {
                return null;
            }
            System.err.println("Warning: Loading of resource " + uri + " failed (" + e10.getMessage() + "). Consider setting the system property \"net.time4j.base.useClassloaderOnly\" for reducing overhead.");
            e10.printStackTrace(System.err);
            return null;
        }
    }

    @Override // vr.c
    public final URI c(String str, String str2, Class cls) {
        String externalForm;
        try {
            try {
                ProtectionDomain protectionDomain = cls.getProtectionDomain();
                CodeSource codeSource = protectionDomain == null ? null : protectionDomain.getCodeSource();
                if (codeSource != null) {
                    externalForm = codeSource.getLocation().toExternalForm();
                    try {
                        if (externalForm.endsWith(".jar")) {
                            externalForm = "jar:" + externalForm + "!/";
                        }
                        externalForm = externalForm + str2;
                        return new URI(externalForm);
                    } catch (URISyntaxException unused) {
                        System.err.println("Warning: malformed resource path = " + externalForm);
                        return null;
                    }
                }
            } catch (URISyntaxException unused2) {
                externalForm = null;
            }
        } catch (SecurityException unused3) {
        }
        return null;
    }

    @Override // vr.c
    public final Iterable d(Class cls) {
        return ServiceLoader.load(cls, cls.getClassLoader());
    }
}
