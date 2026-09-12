package mm;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.Screen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends rg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Screen f15888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ValueAnimator f15893f;

    public c(Screen screen, b viewToAnimate, float f2) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
        this.f15888a = screen;
        this.f15889b = viewToAnimate;
        this.f15890c = c(screen.getSheetLargestUndimmedDetentIndex());
        float fC = c(lo.j.d(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().f7172a.size() - 1));
        this.f15891d = fC;
        this.f15892e = fC - this.f15890c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f2);
        valueAnimatorOfFloat.setDuration(1L);
        valueAnimatorOfFloat.addUpdateListener(new com.discord.chat.presentation.list.c(6, this));
        this.f15893f = valueAnimatorOfFloat;
    }

    @Override // rg.b
    public final void a(View bottomSheet, float f2) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        float f7 = this.f15890c;
        if (f7 >= f2 || f2 >= this.f15891d) {
            return;
        }
        this.f15893f.setCurrentFraction((f2 - f7) / this.f15892e);
    }

    @Override // rg.b
    public final void b(int i7, View bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i7 == 1 || i7 == 2) {
            Screen screen = this.f15888a;
            this.f15890c = c(screen.getSheetLargestUndimmedDetentIndex());
            float fC = c(lo.j.d(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().f7172a.size() - 1));
            this.f15891d = fC;
            this.f15892e = fC - this.f15890c;
        }
    }

    public final float c(int i7) {
        Screen screen = this.f15888a;
        int size = screen.getSheetDetents().f7172a.size();
        if (size == 1) {
            return (i7 == -1 || i7 != 0) ? -1.0f : 1.0f;
        }
        if (size == 2) {
            if (i7 == -1) {
                return -1.0f;
            }
            if (i7 != 0) {
                return i7 != 1 ? -1.0f : 1.0f;
            }
            return 0.0f;
        }
        if (size != 3 || i7 == -1) {
            return -1.0f;
        }
        if (i7 == 0) {
            return 0.0f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -1.0f : 1.0f;
        }
        BottomSheetBehavior<Screen> sheetBehavior = screen.getSheetBehavior();
        Intrinsics.checkNotNull(sheetBehavior);
        return sheetBehavior.F;
    }
}
