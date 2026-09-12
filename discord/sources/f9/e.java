package f9;

import com.facebook.common.internal.Supplier;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.b f9043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractDraweeControllerBuilder f9048f;

    public e(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, c9.b bVar, String str, Object obj, Object obj2, int i7) {
        this.f9048f = abstractDraweeControllerBuilder;
        this.f9043a = bVar;
        this.f9044b = str;
        this.f9045c = obj;
        this.f9046d = obj2;
        this.f9047e = i7;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        return this.f9048f.b(this.f9043a, this.f9044b, this.f9045c, this.f9046d, this.f9047e);
    }

    public final String toString() {
        n8.f fVarJ = i.j(this);
        fVarJ.H(this.f9045c.toString(), "request");
        return fVarJ.toString();
    }
}
