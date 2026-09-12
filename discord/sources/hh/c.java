package hh;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import e4.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f10750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f10751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f10752e;

    public c(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.f10752e = dVar;
        this.f10749b = context;
        this.f10750c = textPaint;
        this.f10751d = fVar;
    }

    @Override // e4.f
    public final void m0(int i7) {
        this.f10751d.m0(i7);
    }

    @Override // e4.f
    public final void n0(Typeface typeface, boolean z5) {
        this.f10752e.f(this.f10749b, this.f10750c, typeface);
        this.f10751d.n0(typeface, z5);
    }
}
