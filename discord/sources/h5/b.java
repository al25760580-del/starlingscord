package h5;

import androidx.datastore.preferences.protobuf.d1;
import com.budiyev.android.codescanner.CodeScanner;
import com.discord.qr.scanner.QRScanner;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CodeScanner f10336d;

    public b(CodeScanner codeScanner) {
        this.f10336d = codeScanner;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        CodeScanner codeScanner = this.f10336d;
        List list = CodeScanner.H;
        codeScanner.c();
        QRScanner qRScanner = this.f10336d.f3904p;
        if (qRScanner == null) {
            throw new d1(th2);
        }
        qRScanner.onError(th2);
    }
}
