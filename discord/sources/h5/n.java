package h5;

import com.budiyev.android.codescanner.CodeScanner;
import com.discord.qr.scanner.QRScanner;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij.g f10357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.b f10359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumMap f10360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10361e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile k f10362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile l f10363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f10364h;

    public n(u4.b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List list, QRScanner qRScanner) {
        ij.g gVar = new ij.g();
        this.f10357a = gVar;
        m mVar = new m(this);
        this.f10358b = mVar;
        mVar.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        EnumMap enumMap = new EnumMap(ij.c.class);
        this.f10360d = enumMap;
        enumMap.put(ij.c.f11795e, list);
        gVar.c(enumMap);
        this.f10362f = qRScanner;
        this.f10359c = bVar;
        this.f10364h = 1;
    }

    public static boolean a(n nVar, int i7) {
        nVar.f10364h = i7;
        u4.b bVar = nVar.f10359c;
        if (i7 != 4) {
            bVar.getClass();
            return true;
        }
        int i10 = ((CodeScanner) bVar.f20945e).F;
        if (i10 == 3) {
            return false;
        }
        if (i10 == 1) {
            ((CodeScanner) bVar.f20945e).f3908t = true;
            CodeScanner codeScanner = (CodeScanner) bVar.f20945e;
            codeScanner.f3893c.post(codeScanner.k);
        }
        return true;
    }
}
