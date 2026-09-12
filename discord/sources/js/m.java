package js;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14139e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f14140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f14142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i7, List list) {
        super(str, true);
        this.f14140f = pVar;
        this.f14141g = i7;
        this.f14142h = list;
    }

    @Override // fs.a
    public final long a() {
        switch (this.f14139e) {
            case 0:
                z zVar = this.f14140f.H;
                List responseHeaders = this.f14142h;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    this.f14140f.T.q(this.f14141g, b.CANCEL);
                    synchronized (this.f14140f) {
                        this.f14140f.V.remove(Integer.valueOf(this.f14141g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                z zVar2 = this.f14140f.H;
                List requestHeaders = this.f14142h;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    this.f14140f.T.q(this.f14141g, b.CANCEL);
                    synchronized (this.f14140f) {
                        this.f14140f.V.remove(Integer.valueOf(this.f14141g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, p pVar, int i7, List list, boolean z5) {
        super(str, true);
        this.f14140f = pVar;
        this.f14141g = i7;
        this.f14142h = list;
    }
}
