package j9;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import n3.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13717e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f13716d = i7;
        this.f13717e = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f13716d) {
            case 0:
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = ((DraweeSpanStringBuilder) this.f13717e).f4723v;
                if (simpleDraweeSpanTextView != null) {
                    simpleDraweeSpanTextView.invalidate();
                }
                break;
            default:
                ((f) this.f13717e).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f13716d) {
            case 0:
                DraweeSpanStringBuilder draweeSpanStringBuilder = (DraweeSpanStringBuilder) this.f13717e;
                if (draweeSpanStringBuilder.f4723v != null) {
                    draweeSpanStringBuilder.f4723v.postDelayed(runnable, j - SystemClock.uptimeMillis());
                }
                break;
            default:
                ((f) this.f13717e).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f13716d) {
            case 0:
                SimpleDraweeSpanTextView simpleDraweeSpanTextView = ((DraweeSpanStringBuilder) this.f13717e).f4723v;
                if (simpleDraweeSpanTextView != null) {
                    simpleDraweeSpanTextView.removeCallbacks(runnable);
                }
                break;
            default:
                ((f) this.f13717e).unscheduleSelf(runnable);
                break;
        }
    }
}
