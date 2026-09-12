package ag;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f528d;

    public h1(String str) {
        this.f528d = str;
    }

    @Override // ag.j1
    public final int a() {
        return j1.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j1 j1Var = (j1) obj;
        int iA = j1Var.a();
        int iD = j1.d((byte) 96);
        if (iD != iA) {
            return iD - j1Var.a();
        }
        String str = ((h1) j1Var).f528d;
        int length = str.length();
        String str2 = this.f528d;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            return this.f528d.equals(((h1) obj).f528d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(j1.d((byte) 96)), this.f528d});
    }

    public final String toString() {
        return com.discord.chat.presentation.list.a.k(new StringBuilder("\""), this.f528d, "\"");
    }
}
