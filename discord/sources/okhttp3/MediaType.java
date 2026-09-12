package okhttp3;

import com.facebook.react.devsupport.StackTraceHelper;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes.dex */
public final class MediaType {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f17329d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17330e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f17333c;

    public MediaType(String str, String str2, String[] strArr) {
        this.f17331a = str;
        this.f17332b = str2;
        this.f17333c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", StackTraceHelper.NAME_KEY);
        String[] strArr = this.f17333c;
        int i7 = 0;
        int iA = zn.c.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (true) {
            int i10 = i7 + 2;
            if (x.i(strArr[i7], "charset", true)) {
                str = strArr[i7 + 1];
                break;
            }
            if (i7 == iA) {
                str = null;
                break;
            }
            i7 = i10;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && Intrinsics.areEqual(((MediaType) obj).f17331a, this.f17331a);
    }

    public final int hashCode() {
        return this.f17331a.hashCode();
    }

    public final String toString() {
        return this.f17331a;
    }
}
