package js;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f14144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f14146h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, p pVar, int i7, b bVar, int i10) {
        super(str, true);
        this.f14143e = i10;
        this.f14144f = pVar;
        this.f14145g = i7;
        this.f14146h = bVar;
    }

    @Override // fs.a
    public final long a() {
        switch (this.f14143e) {
            case 0:
                z zVar = this.f14144f.H;
                b errorCode = this.f14146h;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (this.f14144f) {
                    this.f14144f.V.remove(Integer.valueOf(this.f14145g));
                    Unit unit = Unit.f14616a;
                }
                return -1L;
            default:
                p pVar = this.f14144f;
                try {
                    int i7 = this.f14145g;
                    b statusCode = this.f14146h;
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    pVar.T.q(i7, statusCode);
                    break;
                } catch (IOException e10) {
                    pVar.f(e10);
                }
                return -1L;
        }
    }
}
