package d0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7525c;

    public c(String name, long j, int i7) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7523a = name;
        this.f7524b = j;
        this.f7525c = i7;
        if (name.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i7 < -1 || i7 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i7);

    public abstract float b(int i7);

    public boolean c() {
        return false;
    }

    public abstract long d(float f2, float f7, float f10);

    public abstract float e(float f2, float f7, float f10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7525c == cVar.f7525c && Intrinsics.areEqual(this.f7523a, cVar.f7523a)) {
            return b.a(this.f7524b, cVar.f7524b);
        }
        return false;
    }

    public abstract long f(float f2, float f7, float f10, float f11, c cVar);

    public int hashCode() {
        int iHashCode = this.f7523a.hashCode() * 31;
        int i7 = b.f7522e;
        return com.discord.chat.presentation.list.a.h(this.f7524b, iHashCode, 31) + this.f7525c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7523a);
        sb2.append(" (id=");
        sb2.append(this.f7525c);
        sb2.append(", model=");
        long j = b.f7518a;
        long j5 = this.f7524b;
        if (b.a(j5, j)) {
            str = "Rgb";
        } else if (b.a(j5, b.f7519b)) {
            str = "Xyz";
        } else if (b.a(j5, b.f7520c)) {
            str = "Lab";
        } else {
            str = b.a(j5, b.f7521d) ? "Cmyk" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
