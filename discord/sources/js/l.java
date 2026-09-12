package js;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class l extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f14135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Buffer f14137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, p pVar, int i7, Buffer buffer, int i10, boolean z5) {
        super(str, true);
        this.f14135e = pVar;
        this.f14136f = i7;
        this.f14137g = buffer;
        this.f14138h = i10;
    }

    @Override // fs.a
    public final long a() {
        try {
            z zVar = this.f14135e.H;
            Buffer source = this.f14137g;
            int i7 = this.f14138h;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i7);
            this.f14135e.T.q(this.f14136f, b.CANCEL);
            synchronized (this.f14135e) {
                this.f14135e.V.remove(Integer.valueOf(this.f14136f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
