package bh;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3288d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f3290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hh.d f3291g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f3285a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3286b = new j(0, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3289e = true;

    public l(k kVar) {
        this.f3290f = new WeakReference(null);
        this.f3290f = new WeakReference(kVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f3285a;
        this.f3287c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f3288d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f3289e = false;
    }

    public final void b(hh.d dVar, Context context) {
        if (this.f3291g != dVar) {
            this.f3291g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f3285a;
                j jVar = this.f3286b;
                dVar.e(context, textPaint, jVar);
                k kVar = (k) this.f3290f.get();
                if (kVar != null) {
                    textPaint.drawableState = kVar.getState();
                }
                dVar.d(context, textPaint, jVar);
                this.f3289e = true;
            }
            k kVar2 = (k) this.f3290f.get();
            if (kVar2 != null) {
                kVar2.a();
                kVar2.onStateChange(kVar2.getState());
            }
        }
    }
}
