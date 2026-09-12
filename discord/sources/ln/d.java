package ln;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends StateListDrawable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15153d;

    public d(Drawable drawable, int i7) {
        this.f15153d = i7;
        addState(new int[]{R.attr.state_selected}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z5 = false;
        for (int i7 : iArr) {
            if (i7 == 16842913) {
                z5 = true;
            }
        }
        if (z5) {
            setColorFilter(this.f15153d, PorterDuff.Mode.SRC_ATOP);
        } else {
            clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
