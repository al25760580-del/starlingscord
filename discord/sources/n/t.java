package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f16206e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f16209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f16210i;
    public PopupWindow.OnDismissListener j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16207f = 8388611;
    public final s k = new s(this);

    public t(Context context, j jVar, View view, boolean z5, int i7, int i10) {
        this.f16202a = context;
        this.f16203b = jVar;
        this.f16206e = view;
        this.f16204c = z5;
        this.f16205d = i7;
    }

    public final r a() {
        r a0Var;
        if (this.f16210i == null) {
            Context context = this.f16202a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                a0Var = new d(context, this.f16206e, this.f16205d, this.f16204c);
            } else {
                a0Var = new a0(this.f16202a, this.f16203b, this.f16206e, this.f16205d, this.f16204c);
            }
            a0Var.l(this.f16203b);
            a0Var.r(this.k);
            a0Var.n(this.f16206e);
            a0Var.j(this.f16209h);
            a0Var.o(this.f16208g);
            a0Var.p(this.f16207f);
            this.f16210i = a0Var;
        }
        return this.f16210i;
    }

    public final boolean b() {
        r rVar = this.f16210i;
        return rVar != null && rVar.isShowing();
    }

    public void c() {
        this.f16210i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z5, boolean z6) {
        r rVarA = a();
        rVarA.s(z6);
        if (z5) {
            if ((Gravity.getAbsoluteGravity(this.f16207f, this.f16206e.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f16206e.getWidth();
            }
            rVarA.q(i7);
            rVarA.t(i10);
            int i11 = (int) ((this.f16202a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            rVarA.f16200d = new Rect(i7 - i11, i10 - i11, i7 + i11, i10 + i11);
        }
        rVarA.show();
    }
}
