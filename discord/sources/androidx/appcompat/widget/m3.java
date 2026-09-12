package androidx.appcompat.widget;

import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1032a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1035d;

    public cs.m a() {
        return new cs.m(this.f1032a, this.f1033b, (String[]) this.f1034c, (String[]) this.f1035d);
    }

    public void b(cs.l... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f1032a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (cs.l lVar : cipherSuites) {
            arrayList.add(lVar.f7450a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
        if (!this.f1032a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f1034c = (String[]) cipherSuites.clone();
    }

    public void d() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        com.swmansion.rnscreens.e0 e0Var = (com.swmansion.rnscreens.e0) this.f1034c;
        if (this.f1032a || !this.f1033b) {
            return;
        }
        FragmentActivity activity = e0Var.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.a(e0Var, (com.swmansion.rnscreens.b) this.f1035d);
        }
        this.f1032a = true;
    }

    public void e(cs.x... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f1032a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tlsVersions.length);
        for (cs.x xVar : tlsVersions) {
            arrayList.add(xVar.f7507d);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void f(String... tlsVersions) {
        Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
        if (!this.f1032a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f1035d = (String[]) tlsVersions.clone();
    }
}
