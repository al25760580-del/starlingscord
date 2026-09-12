package l4;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements y {
    @Override // l4.y
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        hs.c cVar = x4.h.f22636a;
        if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        x4.c.c("Unable to load composition.", th2);
    }
}
