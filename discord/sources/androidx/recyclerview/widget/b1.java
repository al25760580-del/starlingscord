package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {
    public static void a(View view, float f2) {
        try {
            view.setFrameContentVelocity(f2);
        } catch (LinkageError unused) {
        }
    }
}
