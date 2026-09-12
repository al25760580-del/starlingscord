package androidx.core.view;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f1723a;

    public s0(u uVar) {
        this.f1723a = uVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new d(contentInfo));
        ContentInfoCompat contentInfoCompatA = this.f1723a.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        return contentInfoCompatA == contentInfoCompat ? contentInfo : contentInfoCompatA.c();
    }
}
