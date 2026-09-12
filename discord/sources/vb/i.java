package vb;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.d f21531c;

    public i(String str, byte[] bArr, sb.d dVar) {
        this.f21529a = str;
        this.f21530b = bArr;
        this.f21531c = dVar;
    }

    public static n8.f a() {
        n8.f fVar = new n8.f(17, false);
        fVar.f16511i = sb.d.f19823d;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f21529a.equals(iVar.f21529a)) {
                if (Arrays.equals(this.f21530b, iVar instanceof i ? iVar.f21530b : iVar.f21530b) && this.f21531c.equals(iVar.f21531c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21529a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21530b)) * 1000003) ^ this.f21531c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f21530b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f21529a);
        sb2.append(", ");
        sb2.append(this.f21531c);
        sb2.append(", ");
        return com.discord.chat.presentation.list.a.k(sb2, strEncodeToString, ")");
    }
}
