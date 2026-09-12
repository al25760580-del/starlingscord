package f9;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.span.DraweeSpanStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9042d = 0;

    public /* synthetic */ d() {
    }

    @Override // f9.f, com.facebook.drawee.controller.ControllerListener
    public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
        switch (this.f9042d) {
            case 0:
                if (animatable != null) {
                    animatable.start();
                }
                break;
            default:
                break;
        }
    }

    public d(DraweeSpanStringBuilder draweeSpanStringBuilder, j9.a aVar, int i7) {
    }
}
