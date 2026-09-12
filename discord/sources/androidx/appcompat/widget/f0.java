package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends SeekBar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f939d;

    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        k3.a(this, getContext());
        g0 g0Var = new g0(this);
        this.f939d = g0Var;
        g0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g0 g0Var = this.f939d;
        f0 f0Var = g0Var.f979d;
        Drawable drawable = g0Var.f980e;
        if (drawable != null && drawable.isStateful() && drawable.setState(f0Var.getDrawableState())) {
            f0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f939d.f980e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f939d.d(canvas);
    }
}
