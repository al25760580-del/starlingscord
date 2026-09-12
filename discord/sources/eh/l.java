package eh;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends FrameLayout implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8266e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8267i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n.l f8268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f8269w;

    public l(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f8265d = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    @Override // n.w
    public final void a(n.l lVar) {
        this.f8268v = lVar;
        lVar.setCheckable(false);
        this.f8265d.setText(lVar.f16171e);
        b();
    }

    public final void b() {
        n.l lVar = this.f8268v;
        if (lVar != null) {
            setVisibility((!lVar.isVisible() || (!this.f8266e && this.f8267i)) ? 8 : 0);
        }
    }

    @Override // n.w
    public n.l getItemData() {
        return this.f8268v;
    }

    @Override // eh.h
    public void setExpanded(boolean z5) {
        this.f8266e = z5;
        b();
    }

    @Override // eh.h
    public void setOnlyShowWhenExpanded(boolean z5) {
        this.f8267i = z5;
        b();
    }

    public void setTextAppearance(int i7) {
        TextView textView = this.f8265d;
        textView.setTextAppearance(i7);
        ColorStateList colorStateList = this.f8269w;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8269w = colorStateList;
        if (colorStateList != null) {
            this.f8265d.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
