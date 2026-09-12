package ag;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends c implements Serializable {
    public final String E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MessageDigest f547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f549y;

    public n0() {
        boolean z5;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f547w = messageDigest;
            this.f548x = messageDigest.getDigestLength();
            this.E = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z5 = true;
            } catch (CloneNotSupportedException unused) {
                z5 = false;
            }
            this.f549y = z5;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.E;
    }
}
