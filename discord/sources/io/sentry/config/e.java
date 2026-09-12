package io.sentry.config;

import io.sentry.util.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Properties f12585b;

    public e(String str, Properties properties) {
        this.f12584a = str;
        com.facebook.imagepipeline.nativecode.c.H(properties, "properties are required");
        this.f12585b = properties;
    }

    @Override // io.sentry.config.d
    public final Map c() {
        String strK = com.discord.chat.presentation.list.a.k(new StringBuilder(), this.f12584a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f12585b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strK)) {
                    map.put(str.substring(strK.length()), l.b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return l.b(this.f12585b.getProperty(this.f12584a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
