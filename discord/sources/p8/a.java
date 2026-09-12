package p8;

import a3.e;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f17788a = w0.g(new Pair("mkv", "video/x-matroska"), new Pair("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public static final String a(String path) {
        String strSubstring;
        Locale locale;
        String strP;
        Intrinsics.checkNotNullParameter(path, "path");
        int iL = StringsKt.L('.', 0, 6, path);
        if (iL < 0 || iL == path.length() - 1) {
            strSubstring = null;
        } else {
            strSubstring = path.substring(iL + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        if (strSubstring == null || (strP = e.p((locale = Locale.US), "US", strSubstring, locale, "toLowerCase(...)")) == null) {
            return null;
        }
        String mimeTypeFromExtension = (String) b.f17790b.get(strP);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = b.f17789a.getMimeTypeFromExtension(strP);
        }
        return mimeTypeFromExtension == null ? (String) f17788a.get(strP) : mimeTypeFromExtension;
    }
}
