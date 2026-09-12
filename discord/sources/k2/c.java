package k2;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f14227b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f14228a;

    public c() {
        TextPaint textPaint = new TextPaint();
        this.f14228a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
