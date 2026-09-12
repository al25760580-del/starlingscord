package si;

import java.util.Map;
import ti.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements qi.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20260a;

    @Override // qi.a
    public final void a(Object obj, Object obj2) {
        switch (this.f20260a) {
            case 0:
                throw new qi.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                qi.e eVar = (qi.e) obj2;
                eVar.e(f.f20804g, entry.getKey());
                eVar.e(f.f20805h, entry.getValue());
                return;
            default:
                throw new qi.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
