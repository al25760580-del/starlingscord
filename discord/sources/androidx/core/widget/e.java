package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(NestedScrollView nestedScrollView, float f2) {
        try {
            nestedScrollView.setFrameContentVelocity(f2);
        } catch (LinkageError unused) {
        }
    }
}
