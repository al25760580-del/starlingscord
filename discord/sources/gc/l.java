package gc;

import com.google.android.exoplayer2.DeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9746c;

    public /* synthetic */ l(int i7, int i10, int i11) {
        this.f9744a = i7;
        this.f9745b = i10;
        this.f9746c = i11;
    }

    public DeviceInfo a() {
        je.b.g(this.f9745b <= this.f9746c);
        return new DeviceInfo(this);
    }

    public l(int i7) {
        this.f9744a = i7;
    }
}
