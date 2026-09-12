package rn;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final j f19477w = new j(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f19478x = new k(2, 1, 20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19480e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19481i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19482v;

    public k(int i7, int i10, int i11) {
        this.f19479d = i7;
        this.f19480e = i10;
        this.f19481i = i11;
        if (i7 >= 0 && i7 < 256 && i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256) {
            this.f19482v = (i7 << 16) + (i10 << 8) + i11;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k other = (k) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f19482v - other.f19482v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k kVar = obj instanceof k ? (k) obj : null;
        return kVar != null && this.f19482v == kVar.f19482v;
    }

    public final int hashCode() {
        return this.f19482v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19479d);
        sb2.append('.');
        sb2.append(this.f19480e);
        sb2.append('.');
        sb2.append(this.f19481i);
        return sb2.toString();
    }
}
