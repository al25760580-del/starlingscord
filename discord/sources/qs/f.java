package qs;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class f extends fs.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f19080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f19081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, g gVar, long j) {
        super(str, true);
        this.f19080e = gVar;
        this.f19081f = j;
    }

    @Override // fs.a
    public final long a() {
        k kVar;
        g gVar = this.f19080e;
        synchronized (gVar) {
            try {
                if (!gVar.f19100t && (kVar = gVar.j) != null) {
                    int i7 = gVar.f19102v ? gVar.f19101u : -1;
                    gVar.f19101u++;
                    gVar.f19102v = true;
                    Unit unit = Unit.f14616a;
                    if (i7 != -1) {
                        StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                        sb2.append(gVar.f19085c);
                        sb2.append("ms (after ");
                        gVar.f(new SocketTimeoutException(kk.b.l(sb2, i7 - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            ByteString payload = ByteString.f17414v;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            kVar.c(payload, 9);
                        } catch (IOException e10) {
                            gVar.f(e10, null);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f19081f;
    }
}
