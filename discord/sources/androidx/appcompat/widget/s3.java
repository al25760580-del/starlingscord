package androidx.appcompat.widget;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class s3 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1106b;

    public s3(int i7) {
        super(-2, i7);
        this.f1106b = 0;
        this.f1105a = 8388627;
    }

    public s3(s3 s3Var) {
        super((ViewGroup.MarginLayoutParams) s3Var);
        this.f1105a = 0;
        this.f1105a = s3Var.f1105a;
    }

    public s3(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1105a = 0;
    }
}
