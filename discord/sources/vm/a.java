package vm;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f21748e;

    public /* synthetic */ a(k kVar, int i7) {
        this.f21747d = i7;
        this.f21748e = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21747d) {
            case 0:
                n it = (n) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f21781d == this.f21748e);
            default:
                Drawable drawable = (Drawable) obj;
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                new Handler(Looper.getMainLooper()).post(new xm.b(0, this.f21748e, drawable));
                return Unit.f14616a;
        }
    }
}
