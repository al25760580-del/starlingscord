package ic;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f11561e = new l(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11565d;

    public l(int i7, int i10, int i11) {
        this.f11562a = i7;
        this.f11563b = i10;
        this.f11564c = i11;
        this.f11565d = je.e0.F(i11) ? je.e0.x(i11, i10) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f11562a == lVar.f11562a && this.f11563b == lVar.f11563b && this.f11564c == lVar.f11564c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11562a), Integer.valueOf(this.f11563b), Integer.valueOf(this.f11564c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f11562a);
        sb2.append(", channelCount=");
        sb2.append(this.f11563b);
        sb2.append(", encoding=");
        return com.discord.chat.presentation.list.a.j(sb2, this.f11564c, ']');
    }
}
