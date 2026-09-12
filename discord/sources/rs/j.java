package rs;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageDigest f19575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c sink) throws NoSuchAlgorithmException {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter("MD5", "algorithm");
        MessageDigest digest = MessageDigest.getInstance("MD5");
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(algorithm)");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.f19575e = digest;
    }

    @Override // rs.f, okio.Sink
    public final void H(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        v.f(source.f17413e, 0L, j);
        q qVar = source.f17412d;
        Intrinsics.checkNotNull(qVar);
        long j5 = 0;
        while (j5 < j) {
            int iMin = (int) Math.min(j - j5, qVar.f19598c - qVar.f19597b);
            MessageDigest messageDigest = this.f19575e;
            if (messageDigest == null) {
                Intrinsics.checkNotNull(null);
                throw null;
            }
            messageDigest.update(qVar.f19596a, qVar.f19597b, iMin);
            j5 += (long) iMin;
            qVar = qVar.f19601f;
            Intrinsics.checkNotNull(qVar);
        }
        super.H(source, j);
    }
}
