package fh;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n3.b f9167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f9169c;

    public /* synthetic */ c(int i7, View view) {
        this.f9168b = i7;
        this.f9169c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f9168b) {
            case 0:
                d dVar = (d) this.f9169c;
                dVar.setIndeterminate(false);
                dVar.a(dVar.f9171e, dVar.f9172i);
                break;
            case 1:
                d dVar2 = (d) this.f9169c;
                if (!dVar2.f9176y) {
                    dVar2.setVisibility(dVar2.E);
                }
                break;
            default:
                ColorStateList colorStateList = ((vg.b) this.f9169c).L;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f9168b) {
            case 2:
                vg.b bVar = (vg.b) this.f9169c;
                ColorStateList colorStateList = bVar.L;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(bVar.P, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
