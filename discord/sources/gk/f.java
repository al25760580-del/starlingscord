package gk;

import android.view.ViewConfiguration;
import com.henninghall.date_picker.pickers.AndroidNative;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10053e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AndroidNative f10054i;

    public f(AndroidNative androidNative) {
        this.f10054i = androidNative;
    }

    public final void a() {
        this.f10053e = 0;
        this.f10052d = 0;
        AndroidNative androidNative = this.f10054i;
        androidNative.removeCallbacks(this);
        if (androidNative.f10090x0) {
            androidNative.f10090x0 = false;
            androidNative.invalidate(0, androidNative.f10086v0, androidNative.getRight(), androidNative.getBottom());
        }
        androidNative.f10092y0 = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f10053e;
        AndroidNative androidNative = this.f10054i;
        if (i7 == 1) {
            int i10 = this.f10052d;
            if (i10 == 1) {
                androidNative.f10090x0 = true;
                androidNative.invalidate(0, androidNative.f10086v0, androidNative.getRight(), androidNative.getBottom());
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                androidNative.f10092y0 = true;
                androidNative.invalidate(0, 0, androidNative.getRight(), androidNative.f10084u0);
                return;
            }
        }
        if (i7 != 2) {
            return;
        }
        int i11 = this.f10052d;
        if (i11 == 1) {
            if (!androidNative.f10090x0) {
                androidNative.postDelayed(this, ViewConfiguration.getPressedStateDuration());
            }
            androidNative.f10090x0 = !androidNative.f10090x0;
            androidNative.invalidate(0, androidNative.f10086v0, androidNative.getRight(), androidNative.getBottom());
            return;
        }
        if (i11 != 2) {
            return;
        }
        if (!androidNative.f10092y0) {
            androidNative.postDelayed(this, ViewConfiguration.getPressedStateDuration());
        }
        androidNative.f10092y0 = !androidNative.f10092y0;
        androidNative.invalidate(0, 0, androidNative.getRight(), androidNative.f10084u0);
    }
}
