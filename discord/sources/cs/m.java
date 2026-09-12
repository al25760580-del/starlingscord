package cs;

import androidx.appcompat.widget.m3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f7451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f7452f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f7455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f7456d;

    static {
        l lVar = l.f7447r;
        l lVar2 = l.f7448s;
        l lVar3 = l.f7449t;
        l lVar4 = l.f7441l;
        l lVar5 = l.f7443n;
        l lVar6 = l.f7442m;
        l lVar7 = l.f7444o;
        l lVar8 = l.f7446q;
        l lVar9 = l.f7445p;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9};
        l[] lVarArr2 = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, l.j, l.k, l.f7439h, l.f7440i, l.f7437f, l.f7438g, l.f7436e};
        m3 m3Var = new m3();
        m3Var.b((l[]) Arrays.copyOf(lVarArr, 9));
        x xVar = x.TLS_1_3;
        x xVar2 = x.TLS_1_2;
        m3Var.e(xVar, xVar2);
        m3Var.f1033b = true;
        m3Var.a();
        m3 m3Var2 = new m3();
        m3Var2.b((l[]) Arrays.copyOf(lVarArr2, 16));
        m3Var2.e(xVar, xVar2);
        m3Var2.f1033b = true;
        f7451e = m3Var2.a();
        m3 m3Var3 = new m3();
        m3Var3.b((l[]) Arrays.copyOf(lVarArr2, 16));
        m3Var3.e(xVar, xVar2, x.TLS_1_1, x.TLS_1_0);
        m3Var3.f1033b = true;
        m3Var3.a();
        f7452f = new m(false, false, null, null);
    }

    public m(boolean z5, boolean z6, String[] strArr, String[] strArr2) {
        this.f7453a = z5;
        this.f7454b = z6;
        this.f7455c = strArr;
        this.f7456d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f7455c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(l.f7433b.c(str));
        }
        return CollectionsKt.i0(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f7453a) {
            return false;
        }
        String[] strArr = this.f7456d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            tn.b bVar = tn.b.f20850d;
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            if (!ds.b.i(strArr, enabledProtocols, bVar)) {
                return false;
            }
        }
        String[] strArr2 = this.f7455c;
        return strArr2 == null || ds.b.i(strArr2, socket.getEnabledCipherSuites(), l.f7434c);
    }

    public final List c() {
        String[] strArr = this.f7456d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(android.support.v4.media.session.b.i(str));
        }
        return CollectionsKt.i0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        m mVar = (m) obj;
        boolean z5 = mVar.f7453a;
        boolean z6 = this.f7453a;
        if (z6 != z5) {
            return false;
        }
        if (z6) {
            return Arrays.equals(this.f7455c, mVar.f7455c) && Arrays.equals(this.f7456d, mVar.f7456d) && this.f7454b == mVar.f7454b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f7453a) {
            return 17;
        }
        String[] strArr = this.f7455c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f7456d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f7454b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f7453a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f7454b + ')';
    }
}
