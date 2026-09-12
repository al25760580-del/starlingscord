package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ContentInfoCompat b(View view, ContentInfoCompat contentInfoCompat) {
        ContentInfo contentInfoC = contentInfoCompat.c();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoC);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoC ? contentInfoCompat : new ContentInfoCompat(new d(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, u uVar) {
        if (uVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new s0(uVar));
        }
    }
}
