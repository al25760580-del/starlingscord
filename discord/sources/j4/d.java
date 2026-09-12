package j4;

import a5.t;
import androidx.datastore.preferences.protobuf.d1;
import java.util.concurrent.Executor;
import ue.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f13653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f13654c;

    public d(i iVar, c cVar, Executor executor) {
        this.f13652a = iVar;
        this.f13653b = cVar;
        this.f13654c = executor;
    }

    @Override // j4.c
    public final void a(e eVar) {
        i iVar = this.f13652a;
        c cVar = this.f13653b;
        try {
            this.f13654c.execute(new t(iVar, cVar, eVar, 9));
        } catch (Exception e10) {
            iVar.s(new d1(e10));
        }
    }
}
