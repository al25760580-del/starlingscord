package h9;

import android.graphics.drawable.Animatable;
import f9.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g9.a f10389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10390e = -1;

    public a(g9.a aVar) {
        this.f10389d = aVar;
    }

    @Override // f9.f, com.facebook.drawee.controller.ControllerListener
    public final void onFinalImageSet(String id2, Object obj, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f10390e;
        g9.a aVar = this.f10389d;
        aVar.f9515s = jCurrentTimeMillis;
        aVar.invalidateSelf();
    }

    @Override // f9.f, com.facebook.drawee.controller.ControllerListener
    public final void onSubmit(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f10390e = System.currentTimeMillis();
    }
}
