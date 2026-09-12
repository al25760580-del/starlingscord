package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.otaliastudios.zoom.ZoomEngine;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1004e;

    public /* synthetic */ i0(int i7, Object obj) {
        this.f1003d = i7;
        this.f1004e = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1003d) {
            case 0:
                r0 r0Var = (r0) this.f1004e;
                if (!r0Var.getInternalPopup().isShowing()) {
                    r0Var.f1091x.k(r0Var.getTextDirection(), r0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = r0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                o0 o0Var = (o0) this.f1004e;
                r0 r0Var2 = o0Var.f1058d0;
                o0Var.getClass();
                if (!r0Var2.isAttachedToWindow() || !r0Var2.getGlobalVisibleRect(o0Var.f1056b0)) {
                    o0Var.dismiss();
                    return;
                } else {
                    o0Var.q();
                    o0Var.show();
                    return;
                }
            case 2:
                ZoomEngine zoomEngine = (ZoomEngine) this.f1004e;
                ZoomLayoutFixed zoomLayoutFixed = zoomEngine.f7021c;
                if (zoomLayoutFixed == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("container");
                    throw null;
                }
                float width = zoomLayoutFixed.getWidth();
                ZoomLayoutFixed zoomLayoutFixed2 = zoomEngine.f7021c;
                if (zoomLayoutFixed2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("container");
                    throw null;
                }
                float height = zoomLayoutFixed2.getHeight();
                gl.a aVar = zoomEngine.f7027i;
                aVar.getClass();
                if (width <= 0.0f || height <= 0.0f) {
                    return;
                }
                if (width == aVar.j && height == aVar.k) {
                    return;
                }
                aVar.j = width;
                aVar.k = height;
                aVar.g(aVar.f(), false);
                return;
            case 3:
                n.d dVar = (n.d) this.f1004e;
                ArrayList arrayList = dVar.E;
                if (!dVar.isShowing() || arrayList.size() <= 0 || ((n.c) arrayList.get(0)).f16118a.V) {
                    return;
                }
                View view = dVar.L;
                if (view == null || !view.isShown()) {
                    dVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n.c) it.next()).f16118a.show();
                }
                return;
            default:
                n.a0 a0Var = (n.a0) this.f1004e;
                l2 l2Var = a0Var.E;
                if (!a0Var.isShowing() || l2Var.V) {
                    return;
                }
                View view2 = a0Var.J;
                if (view2 == null || !view2.isShown()) {
                    a0Var.dismiss();
                    return;
                } else {
                    l2Var.show();
                    return;
                }
        }
    }

    public i0(ZoomEngine this$0) {
        this.f1003d = 2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f1004e = this$0;
    }
}
