package com.discord.chat.presentation.list;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.discord.chat.presentation.message.view.voicemessages.AudioProgressBar;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import fh.m;
import kotlin.jvm.internal.Intrinsics;
import l4.v;
import nh.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4087b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f4086a = i7;
        this.f4087b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i7 = this.f4086a;
        Object obj = this.f4087b;
        switch (i7) {
            case 0:
                ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$lambda$2$lambda$1((View) obj, it);
                break;
            case 1:
                AudioProgressBar.animateKnob$lambda$3$lambda$2((AudioProgressBar) obj, it);
                break;
            case 2:
                StatusBarModule.AnonymousClass1.runGuarded$lambda$0((Activity) obj, it);
                break;
            case 3:
                m mVar = (m) obj;
                mVar.N.f9244d = mVar.S.getInterpolation(mVar.R.getAnimatedFraction());
                break;
            case 4:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i10 = DefaultTimeBar.f5764n0;
                defaultTimeBar.getClass();
                defaultTimeBar.f5770e0 = ((Float) it.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f5767d);
                break;
            case 5:
                v vVar = (v) obj;
                l4.a aVar = vVar.f14924i0;
                if (aVar == null) {
                    aVar = l4.a.f14817d;
                }
                if (aVar != l4.a.f14818e) {
                    t4.c cVar = vVar.N;
                    if (cVar != null) {
                        cVar.s(vVar.f14919e.d());
                    }
                } else {
                    vVar.invalidateSelf();
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                View view = ((mm.c) obj).f15889b;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Float) animatedValue).floatValue());
                break;
            case 7:
                mm.d dVar = (mm.d) obj;
                Intrinsics.checkNotNullParameter(it, "animator");
                Object animatedValue2 = it.getAnimatedValue();
                Float f2 = animatedValue2 instanceof Float ? (Float) animatedValue2 : null;
                if (f2 != null) {
                    dVar.f15894a.setAlpha(f2.floatValue());
                }
                break;
            case 8:
                k kVar = (k) obj;
                kVar.getClass();
                kVar.f16872d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                break;
            case 9:
                tg.c cVar2 = (tg.c) obj;
                cVar2.getClass();
                float fFloatValue = ((Float) it.getAnimatedValue()).floatValue();
                cVar2.j.setAlpha((int) (255.0f * fFloatValue));
                cVar2.f20764x = fFloatValue;
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "animator");
                Object animatedValue3 = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                ((Window) obj).setStatusBarColor(((Integer) animatedValue3).intValue());
                break;
        }
    }
}
