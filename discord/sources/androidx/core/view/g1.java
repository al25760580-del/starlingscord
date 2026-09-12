package androidx.core.view;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    WindowInsetsCompat mDispachedInsets;
    private final int mDispatchMode;

    public g1(int i7) {
        this.mDispatchMode = i7;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(p1 p1Var);

    public void onPrepare(p1 p1Var) {
    }

    public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list);

    public f1 onStart(p1 p1Var, f1 f1Var) {
        return f1Var;
    }
}
