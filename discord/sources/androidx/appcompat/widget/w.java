package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1146b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static w f1147c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f1148a;

    public static synchronized w a() {
        try {
            if (f1147c == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1147c;
    }

    public static synchronized PorterDuffColorFilter c(int i7, PorterDuff.Mode mode) {
        return n2.e(i7, mode);
    }

    public static synchronized void d() {
        if (f1147c == null) {
            w wVar = new w();
            f1147c = wVar;
            wVar.f1148a = n2.b();
            n2 n2Var = f1147c.f1148a;
            af.c cVar = new af.c();
            cVar.f393d = new int[]{2131230872, 2131230870, 2131230796};
            cVar.f394e = new int[]{2131230820, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            cVar.f395i = new int[]{2131230869, 2131230871, 2131230813, R.drawable.abc_text_cursor_material, 2131230866, 2131230867, 2131230868};
            cVar.f396v = new int[]{2131230845, R.drawable.abc_cab_background_internal_bg, 2131230844};
            cVar.f397w = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            cVar.f398x = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (n2Var) {
                n2Var.f1055e = cVar;
            }
        }
    }

    public static void e(Drawable drawable, m3 m3Var, int[] iArr) {
        PorterDuff.Mode mode = n2.f1048f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = m3Var.f1033b;
        if (!z5 && !m3Var.f1032a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z5 ? (ColorStateList) m3Var.f1034c : null;
        PorterDuff.Mode mode2 = m3Var.f1032a ? (PorterDuff.Mode) m3Var.f1035d : n2.f1048f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = n2.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i7) {
        return this.f1148a.c(context, i7);
    }
}
