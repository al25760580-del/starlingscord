package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3300a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3304e;

    public /* synthetic */ t() {
    }

    public boolean a(int i7) {
        if (i7 == 1) {
            if (this.f3301b - this.f3302c <= 1) {
                return false;
            }
        } else if (this.f3303d - this.f3304e <= 1) {
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f3300a) {
            case 2:
                return this.f3301b + "." + this.f3302c + "." + this.f3303d + "." + this.f3304e;
            default:
                return super.toString();
        }
    }

    public t(int i7, int i10, int i11, int i12) {
        this.f3301b = i7;
        this.f3302c = i10;
        this.f3303d = i11;
        this.f3304e = i12;
    }

    public t(String str) {
        String[] strArrSplit = str.split("\\.");
        this.f3301b = Integer.parseInt(strArrSplit[0]);
        this.f3302c = Integer.parseInt(strArrSplit[1]);
        this.f3303d = Integer.parseInt(strArrSplit[2]);
        this.f3304e = Integer.parseInt(strArrSplit[3]);
    }
}
