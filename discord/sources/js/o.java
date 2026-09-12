package js;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f14147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f14149g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, p pVar, int i7, long j) {
        super(str, true);
        this.f14147e = pVar;
        this.f14148f = i7;
        this.f14149g = j;
    }

    @Override // fs.a
    public final long a() {
        p pVar = this.f14147e;
        try {
            pVar.T.u(this.f14148f, this.f14149g);
            return -1L;
        } catch (IOException e10) {
            pVar.f(e10);
            return -1L;
        }
    }
}
