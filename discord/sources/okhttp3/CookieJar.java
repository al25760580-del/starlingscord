package okhttp3;

import cs.o;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CookieJar {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f17312t = new o();

    List loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List list);
}
