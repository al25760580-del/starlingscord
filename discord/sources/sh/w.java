package sh;

import com.google.android.play.core.assetpacks.AssetPackState;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends AssetPackState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20222i;

    public w(String str, int i7, int i10, long j, long j5, int i11, int i12, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f20214a = str;
        this.f20215b = i7;
        this.f20216c = i10;
        this.f20217d = j;
        this.f20218e = j5;
        this.f20219f = i11;
        this.f20220g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.f20221h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.f20222i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String b() {
        return this.f20221h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long c() {
        return this.f20217d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int e() {
        return this.f20216c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssetPackState)) {
            return false;
        }
        AssetPackState assetPackState = (AssetPackState) obj;
        return this.f20214a.equals(assetPackState.g()) && this.f20215b == assetPackState.h() && this.f20216c == assetPackState.e() && this.f20217d == assetPackState.c() && this.f20218e == assetPackState.i() && this.f20219f == assetPackState.j() && this.f20220g == assetPackState.k() && this.f20221h.equals(assetPackState.b()) && this.f20222i.equals(assetPackState.f());
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String f() {
        return this.f20222i;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String g() {
        return this.f20214a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int h() {
        return this.f20215b;
    }

    public final int hashCode() {
        int iHashCode = this.f20214a.hashCode() ^ 1000003;
        long j = this.f20218e;
        long j5 = j ^ (j >>> 32);
        long j7 = this.f20217d;
        return (((((((((((((((iHashCode * 1000003) ^ this.f20215b) * 1000003) ^ this.f20216c) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ ((int) j5)) * 1000003) ^ this.f20219f) * 1000003) ^ this.f20220g) * 1000003) ^ this.f20221h.hashCode()) * 1000003) ^ this.f20222i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long i() {
        return this.f20218e;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int j() {
        return this.f20219f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int k() {
        return this.f20220g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackState{name=");
        sb2.append(this.f20214a);
        sb2.append(", status=");
        sb2.append(this.f20215b);
        sb2.append(", errorCode=");
        sb2.append(this.f20216c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f20217d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f20218e);
        sb2.append(", transferProgressPercentage=");
        sb2.append(this.f20219f);
        sb2.append(", updateAvailability=");
        sb2.append(this.f20220g);
        sb2.append(", availableVersionTag=");
        sb2.append(this.f20221h);
        sb2.append(", installedVersionTag=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f20222i, "}");
    }
}
