package gh;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[][] f10041y = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f10042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10043x;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10042w == null) {
            int iW = io.sentry.config.a.w(com.discord.R.attr.colorControlActivated, this);
            int iW2 = io.sentry.config.a.w(com.discord.R.attr.colorOnSurface, this);
            int iW3 = io.sentry.config.a.w(com.discord.R.attr.colorSurface, this);
            this.f10042w = new ColorStateList(f10041y, new int[]{io.sentry.config.a.N(iW3, iW, 1.0f), io.sentry.config.a.N(iW3, iW2, 0.54f), io.sentry.config.a.N(iW3, iW2, 0.38f), io.sentry.config.a.N(iW3, iW2, 0.38f)});
        }
        return this.f10042w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10043x && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f10043x = z5;
        if (z5) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
