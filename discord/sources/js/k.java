package js;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f14132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, p pVar, int i7, int i10) {
        super(str, true);
        this.f14132e = pVar;
        this.f14133f = i7;
        this.f14134g = i10;
    }

    @Override // fs.a
    public final long a() {
        p pVar = this.f14132e;
        try {
            pVar.T.n(this.f14133f, this.f14134g, true);
            return -1L;
        } catch (IOException e10) {
            pVar.f(e10);
            return -1L;
        }
    }
}
