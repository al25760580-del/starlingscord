package nc;

import he.d0;
import he.p;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import je.e0;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends UrlRequest.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f16544a;

    public d(e eVar) {
        this.f16544a = eVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        try {
            if (urlRequest != this.f16544a.N) {
                return;
            }
            if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                this.f16544a.R = new UnknownHostException();
            } else {
                this.f16544a.R = cronetException;
            }
            this.f16544a.J.p();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        e eVar = this.f16544a;
        if (urlRequest != eVar.N) {
            return;
        }
        eVar.J.p();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        UrlRequest urlRequest2 = this.f16544a.N;
        if (urlRequest != urlRequest2) {
            return;
        }
        urlRequest2.getClass();
        p pVar = this.f16544a.O;
        pVar.getClass();
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (pVar.f10651c != 2 || (httpStatusCode != 307 && httpStatusCode != 308)) {
            urlRequest.followRedirect();
            return;
        }
        e eVar = this.f16544a;
        urlResponseInfo.getHttpStatusText();
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        int i7 = e0.f13788a;
        eVar.R = new d0(httpStatusCode, null, allHeaders);
        this.f16544a.J.p();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        e eVar = this.f16544a;
        if (urlRequest != eVar.N) {
            return;
        }
        eVar.Q = urlResponseInfo;
        eVar.J.p();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        e eVar = this.f16544a;
        if (urlRequest != eVar.N) {
            return;
        }
        eVar.S = true;
        eVar.J.p();
    }
}
