package com.discord.chat.input.views;

import android.view.View;
import com.swmansion.rnscreens.v0;
import k4.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4075b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f4074a = i7;
        this.f4075b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        switch (this.f4074a) {
            case 0:
                ChatInputRootView._init_$lambda$3((ChatInputRootView) this.f4075b, view, z5);
                break;
            case 1:
                v0 v0Var = (v0) this.f4075b;
                int i7 = v0Var.J;
                v0Var.k(z5 ? new k(i7, v0Var.getId(), 11) : new k(i7, v0Var.getId(), 9));
                break;
            case 2:
                nh.c cVar = (nh.c) this.f4075b;
                cVar.s(cVar.t());
                break;
            default:
                nh.k kVar = (nh.k) this.f4075b;
                kVar.f16853l = z5;
                kVar.p();
                if (!z5) {
                    kVar.s(false);
                    kVar.f16854m = false;
                }
                break;
        }
    }
}
