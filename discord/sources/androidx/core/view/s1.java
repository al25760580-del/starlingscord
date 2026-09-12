package androidx.core.view;

import android.graphics.RenderNode;
import android.media.MediaFormat;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s1 {
    public static /* synthetic */ RenderNode a() {
        return new RenderNode("content");
    }

    public static /* synthetic */ RenderNode b(String str) {
        return new RenderNode(str);
    }

    public static /* synthetic */ MediaFormat c(MediaFormat mediaFormat) {
        return new MediaFormat(mediaFormat);
    }

    public static /* synthetic */ WindowInsets.Builder d() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder e(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ RenderNode g() {
        return new RenderNode("BlurViewNode");
    }
}
