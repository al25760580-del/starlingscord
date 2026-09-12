package hs;

import io.sentry.hints.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okio.ByteString;
import xr.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    static {
        ByteString byteString = ByteString.f17414v;
        j.z("\"\\");
        j.z("\t ,=");
    }

    public static final boolean a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.f17379d.f17369b, "HEAD")) {
            return false;
        }
        int i7 = response.f17382v;
        return (((i7 >= 100 && i7 < 200) || i7 == 204 || i7 == 304) && ds.b.j(response) == -1 && !"chunked".equalsIgnoreCase(response.f("Transfer-Encoding", null))) ? false : true;
    }

    public static final void b(CookieJar cookieJar, HttpUrl url, Headers headers) {
        List listUnmodifiableList;
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.f17312t) {
            return;
        }
        Pattern pattern = Cookie.j;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        List listI = headers.i("Set-Cookie");
        int size = listI.size();
        ArrayList arrayList = null;
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            Cookie cookieN = m.N(url, (String) listI.get(i7));
            if (cookieN != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cookieN);
            }
            i7 = i10;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = n0.f14659d;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, listUnmodifiableList);
    }
}
