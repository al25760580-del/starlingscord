package com.discord.tti_measurement_view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import e4.i;
import io.sentry.android.core.internal.util.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4605e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4606i;

    public /* synthetic */ a(Object obj, View view, int i7) {
        this.f4604d = i7;
        this.f4606i = obj;
        this.f4605e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4604d) {
            case 0:
                ((FirstDrawDoneListener) this.f4606i).lambda$onDraw$0(this.f4605e);
                break;
            case 1:
                h hVar = (h) this.f4606i;
                hVar.getClass();
                this.f4605e.getViewTreeObserver().removeOnDrawListener(hVar);
                break;
            default:
                ((i) this.f4606i).F((ViewGroup) this.f4605e);
                break;
        }
    }
}
