package he;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10588i;

    public b0(int i7) {
        super(i7 == 2000 ? 2001 : i7);
        this.f10588i = 1;
    }

    public static b0 a(IOException iOException, int i7) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else {
            i10 = (message == null || !m3.m.T(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i10 == 2007 ? new a0(iOException) : new b0(iOException, i10, i7);
    }

    public b0(String str, int i7) {
        super(str, i7 == 2000 ? 2001 : i7);
        this.f10588i = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(IOException iOException, int i7, int i10) {
        if (i7 == 2000 && i10 == 1) {
            i7 = 2001;
        }
        super(i7, iOException);
        this.f10588i = i10;
    }

    public b0(String str, IOException iOException, int i7) {
        super(str, iOException, i7 == 2000 ? 2001 : i7);
        this.f10588i = 1;
    }
}
