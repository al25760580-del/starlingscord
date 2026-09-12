package com.discord.chat.presentation.message.view.voicemessages;

import android.view.View;
import android.view.ViewGroup;
import com.discord.react_strings.RenderContext;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import im.q;
import jm.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4273e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4274i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4275v;

    public /* synthetic */ d(ViewGroup viewGroup, int i7, int i10, int i11) {
        this.f4272d = i11;
        this.f4273e = viewGroup;
        this.f4274i = i7;
        this.f4275v = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4272d) {
            case 0:
                return AudioPlayerView.getA11yAudioProgressDescription$lambda$22((AudioPlayerView) this.f4273e, this.f4274i, this.f4275v, (RenderContext) obj);
            case 1:
                return AudioPlayerView.getA11yAudioProgressDescription$lambda$24((AudioPlayerView) this.f4273e, this.f4274i, this.f4275v, (RenderContext) obj);
            default:
                jm.f fVar = (jm.f) this.f4273e;
                im.f handler = (im.f) obj;
                Intrinsics.checkNotNullParameter(handler, "handler");
                RNGestureHandlerModule.Companion.getClass();
                k kVar = (k) RNGestureHandlerModule.registries.get(Integer.valueOf(fVar.f13951y));
                if (kVar == null) {
                    throw new Exception("Tried to access a non-existent registry");
                }
                handler.getClass();
                boolean z5 = handler instanceof q;
                int i7 = this.f4274i;
                if (z5 && i7 == 5) {
                    fVar.getChildCount();
                    fVar.f13947i.add(Integer.valueOf(handler.f11892d));
                    if (fVar.getChildCount() != 0) {
                        View childAt = fVar.getChildAt(0);
                        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                        fVar.i(childAt);
                    }
                } else {
                    kVar.a(handler.f11892d, this.f4275v, i7, fVar);
                    if (i7 == 6) {
                        handler.f11895g = fVar;
                    }
                    fVar.f13949w.add(Integer.valueOf(handler.f11892d));
                }
                return Unit.f14616a;
        }
    }
}
