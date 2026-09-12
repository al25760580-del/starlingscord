package wb;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import n8.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.c f22083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f22084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22085c;

    public d(Context context, f fVar) {
        e4.c cVar = new e4.c(context);
        this.f22085c = new HashMap();
        this.f22083a = cVar;
        this.f22084b = fVar;
    }

    public final synchronized e a(String str) {
        if (this.f22085c.containsKey(str)) {
            return (e) this.f22085c.get(str);
        }
        CctBackendFactory cctBackendFactoryE = this.f22083a.E(str);
        if (cctBackendFactoryE == null) {
            return null;
        }
        f fVar = this.f22084b;
        e eVarCreate = cctBackendFactoryE.create(new b((Context) fVar.f16510e, (ec.a) fVar.f16512v, (ec.a) fVar.f16511i, str));
        this.f22085c.put(str, eVarCreate);
        return eVarCreate;
    }
}
