package lc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14999e;

    public static String b(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int d(int i7) {
        return (i7 >> 24) & 255;
    }

    public void a(int i7) {
        this.f14999e = i7 | this.f14999e;
    }

    public boolean c(int i7) {
        return (this.f14999e & i7) == i7;
    }

    public String toString() {
        switch (this.f14998d) {
            case 1:
                return b(this.f14999e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i7, int i10) {
        this.f14998d = i10;
        this.f14999e = i7;
    }
}
