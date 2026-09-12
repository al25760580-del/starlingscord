package j2;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import androidx.dynamicanimation.animation.SpringAnimation;
import io.sentry.android.core.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f13615i = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f13620e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f13623h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap f13616a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13617b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.c f13618c = new u4.c(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13619d = new p(12, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13621f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13622g = 1.0f;

    public c(io.sentry.internal.debugmeta.c cVar) {
        this.f13620e = cVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, j2.a] */
    public final void a(SpringAnimation springAnimation) {
        ArrayList arrayList = this.f13617b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f13620e.f12759e).postFrameCallback(new com.facebook.react.modules.core.b(1, this.f13619d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f13622g = ValueAnimator.getDurationScale();
                if (this.f13623h == null) {
                    this.f13623h = new b(this);
                }
                final b bVar = this.f13623h;
                if (bVar.f13613a == null) {
                    ?? r5 = new ValueAnimator.DurationScaleChangeListener() { // from class: j2.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            bVar.f13614b.f13622g = f2;
                        }
                    };
                    bVar.f13613a = r5;
                    ValueAnimator.registerDurationScaleChangeListener(r5);
                }
            }
        }
        if (arrayList.contains(springAnimation)) {
            return;
        }
        arrayList.add(springAnimation);
    }

    public final boolean b() {
        io.sentry.internal.debugmeta.c cVar = this.f13620e;
        cVar.getClass();
        return Thread.currentThread() == ((Looper) cVar.f12760i).getThread();
    }
}
