package androidx.core.view;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerWipeAnimatorManager;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1611c;

    public /* synthetic */ a1(int i7, Object obj, Object obj2) {
        this.f1609a = i7;
        this.f1610b = obj;
        this.f1611c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1609a) {
            case 0:
                ((View) ((i.j0) ((fj.c) this.f1610b).f9267e).f11230d.getParent()).invalidate();
                return;
            case 1:
                AudioPlayerWipeAnimatorManager.scaleAnimator_delegate$lambda$5$lambda$4$lambda$3((AudioPlayerViewBinding) this.f1610b, (AudioPlayerWipeAnimatorManager) this.f1611c, valueAnimator);
                return;
            case 2:
                fh.m mVar = (fh.m) this.f1610b;
                fh.k kVar = (fh.k) this.f1611c;
                mVar.getClass();
                if (kVar.a(true) && kVar.f9224m != 0 && mVar.isVisible()) {
                    mVar.invalidateSelf();
                    return;
                }
                return;
            case 3:
                gl.a this$0 = (gl.a) this.f1610b;
                gl.c update = (gl.c) this.f1611c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(update, "$update");
                this$0.c(new es.c(1, update, valueAnimator));
                return;
            default:
                mg.f fVar = (mg.f) this.f1610b;
                kh.i iVar = (kh.i) this.f1611c;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.p(fFloatValue);
                Drawable drawable = fVar.T;
                if (drawable instanceof kh.i) {
                    ((kh.i) drawable).p(fFloatValue);
                }
                Iterator it = fVar.N.iterator();
                if (it.hasNext()) {
                    throw s0.g.a(it);
                }
                Iterator it2 = fVar.O.iterator();
                if (it2.hasNext()) {
                    throw s0.g.a(it2);
                }
                return;
        }
    }
}
