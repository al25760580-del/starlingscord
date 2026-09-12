package dk;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f7653a = {2, 1, 4, 3};

    public static boolean a(int i7, int i10, int i11) {
        switch (i7) {
            case 1:
                return ((i10 + i11) & 1) == 0;
            case 2:
                return (i10 & 1) == 0;
            case 3:
                return i11 % 3 == 0;
            case 4:
                return (i10 + i11) % 3 == 0;
            case 5:
                return (((i11 / 3) + (i10 / 2)) & 1) == 0;
            case 6:
                return (i10 * i11) % 6 == 0;
            case 7:
                return (i10 * i11) % 6 < 3;
            default:
                return ((((i10 * i11) % 3) + (i10 + i11)) & 1) == 0;
        }
    }
}
