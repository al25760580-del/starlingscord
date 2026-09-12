package e;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Lambda implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f7849e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f7850i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7851d;

    static {
        int i7 = 1;
        f7849e = new u(i7, 0);
        f7850i = new u(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i7, int i10) {
        super(i7);
        this.f7851d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7851d) {
            case 0:
                Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
                return Boolean.TRUE;
            default:
                Intrinsics.checkNotNullParameter((Resources) obj, "<anonymous parameter 0>");
                return Boolean.FALSE;
        }
    }
}
