package com.swmansion.rnscreens;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ReactPointerEventsView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7219e;

    public o(int i7) {
        this.f7218d = i7;
        switch (i7) {
            case 2:
                break;
            default:
                this.f7219e = PointerEvents.BOX_NONE;
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public final PointerEvents getPointerEvents() {
        PointerEvents pointerEvents;
        switch (this.f7218d) {
            case 0:
                return (PointerEvents) this.f7219e;
            case 1:
                return ((mm.b) this.f7219e).getBlockGestures$react_native_screens_release() ? PointerEvents.AUTO : PointerEvents.NONE;
            default:
                o oVar = (o) this.f7219e;
                return (oVar == null || (pointerEvents = oVar.getPointerEvents()) == null) ? PointerEvents.NONE : pointerEvents;
        }
    }

    public o(mm.b dimmingView) {
        this.f7218d = 1;
        Intrinsics.checkNotNullParameter(dimmingView, "dimmingView");
        this.f7219e = dimmingView;
    }
}
