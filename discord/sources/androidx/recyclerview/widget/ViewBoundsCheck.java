package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ViewBoundsCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callback f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae.b f2550b;

    public interface Callback {
        int a(View view);

        int b();

        int c();

        int d(View view);

        View getChildAt(int i7);
    }

    public ViewBoundsCheck(Callback callback) {
        this.f2549a = callback;
        ae.b bVar = new ae.b();
        bVar.f361b = 0;
        this.f2550b = bVar;
    }

    public final View a(int i7, int i10, int i11, int i12) {
        Callback callback = this.f2549a;
        int iB = callback.b();
        int iC = callback.c();
        int i13 = i10 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i10) {
            View childAt = callback.getChildAt(i7);
            int iA = callback.a(childAt);
            int iD = callback.d(childAt);
            ae.b bVar = this.f2550b;
            bVar.f362c = iB;
            bVar.f363d = iC;
            bVar.f364e = iA;
            bVar.f365f = iD;
            if (i11 != 0) {
                bVar.f361b = i11;
                if (bVar.a()) {
                    return childAt;
                }
            }
            if (i12 != 0) {
                bVar.f361b = i12;
                if (bVar.a()) {
                    view = childAt;
                }
            }
            i7 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        Callback callback = this.f2549a;
        int iB = callback.b();
        int iC = callback.c();
        int iA = callback.a(view);
        int iD = callback.d(view);
        ae.b bVar = this.f2550b;
        bVar.f362c = iB;
        bVar.f363d = iC;
        bVar.f364e = iA;
        bVar.f365f = iD;
        bVar.f361b = 24579;
        return bVar.a();
    }
}
