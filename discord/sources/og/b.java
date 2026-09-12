package og;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends io.sentry.config.a {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7) {
        super(14);
        this.k = i7;
    }

    @Override // io.sentry.config.a
    public final int E(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i7;
        switch (this.k) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i7 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i7 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i7 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i7;
    }

    @Override // io.sentry.config.a
    public final int I() {
        switch (this.k) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // io.sentry.config.a
    public final ViewPropertyAnimator J(int i7, View view) {
        switch (this.k) {
            case 0:
                return view.animate().translationY(i7);
            case 1:
                return view.animate().translationX(-i7);
            default:
                return view.animate().translationX(i7);
        }
    }
}
