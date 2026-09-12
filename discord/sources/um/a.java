package um;

import ga.k;
import kh.f;
import pa.s;
import vi.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f21185i = new f(17);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f21186v = new s();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f21187w = new d(17, (byte) 0);
    public static final k E = new k();
    public static final i8.b F = new i8.b(18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i7, int i10, int i11) {
        super(i7, i10, "topDidAppear", "onDidAppear");
        switch (i11) {
            case 1:
                super(i7, i10, "topDidDisappear", "onDidDisappear");
                break;
            case 2:
                super(i7, i10, "topNativeDismissPrevented", "onNativeDismissPrevented");
                break;
            case 3:
                super(i7, i10, "topWillAppear", "onWillAppear");
                break;
            case 4:
                super(i7, i10, "topWillDisappear", "onWillDisappear");
                break;
            default:
                break;
        }
    }
}
