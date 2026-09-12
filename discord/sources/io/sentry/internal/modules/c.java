package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pattern f12767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pattern f12768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ClassLoader f12769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = c.class.getClassLoader();
        this.f12767e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f12768f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f12769g = q.j(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        HashMap map = new HashMap();
        ArrayList<b> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f12769g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f12767e.matcher(resources.nextElement().toString());
                b bVar = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f12768f.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        bVar = new b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f12771a.g(SentryLevel.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        for (b bVar2 : arrayList) {
            map.put(bVar2.f12765a, bVar2.f12766b);
        }
        return map;
    }
}
