package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1663w;

    public g0(int i7, Class cls, int i10, int i11, int i12) {
        this.f1663w = i12;
        this.f1671d = i7;
        this.f1674v = cls;
        this.f1673i = i10;
        this.f1672e = i11;
    }

    @Override // androidx.core.view.i0
    public final Object c(View view) {
        switch (this.f1663w) {
            case 0:
                return Boolean.valueOf(o0.c(view));
            case 1:
                return o0.a(view);
            case 2:
                return q0.b(view);
            default:
                return Boolean.valueOf(o0.b(view));
        }
    }

    @Override // androidx.core.view.i0
    public final void d(View view, Object obj) {
        switch (this.f1663w) {
            case 0:
                o0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                o0.e(view, (CharSequence) obj);
                break;
            case 2:
                q0.e(view, (CharSequence) obj);
                break;
            default:
                o0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.core.view.i0
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f1663w) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
