package n8;

import com.facebook.common.internal.Supplier;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16513a;

    public /* synthetic */ h(int i7) {
        this.f16513a = i7;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        switch (this.f16513a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.FALSE;
            default:
                return ib.a.w(AbstractDraweeControllerBuilder.f4631i);
        }
    }
}
