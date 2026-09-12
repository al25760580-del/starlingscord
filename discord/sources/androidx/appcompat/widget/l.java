package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class l extends y implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f1019d = nVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        ib.a.I(this, getContentDescription());
        setOnTouchListener(new k(this, this));
    }

    @Override // androidx.appcompat.widget.o
    public final boolean b() {
        return false;
    }

    @Override // androidx.appcompat.widget.o
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1019d.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i7, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
