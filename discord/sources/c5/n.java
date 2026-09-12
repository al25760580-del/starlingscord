package c5;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Comparable {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private b mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private p mErrorListener;
    private final v mEventLog;
    private final Object mLock;
    private final int mMethod;
    private l mRequestCompleteListener;
    private o mRequestQueue;
    private boolean mResponseDelivered;
    private s mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public n(String str, p pVar) {
        Uri uri;
        String host;
        this.mEventLog = v.f3521c ? new v() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        int iHashCode = 0;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = 0;
        this.mUrl = str;
        this.mErrorListener = pVar;
        e eVar = new e(0);
        eVar.f3485b = 2500;
        setRetryPolicy(eVar);
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.mDefaultTrafficStatsTag = iHashCode;
    }

    public static byte[] a(String str, Map map) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb2.append(URLEncoder.encode((String) entry.getKey(), str));
                sb2.append('=');
                sb2.append(URLEncoder.encode((String) entry.getValue(), str));
                sb2.append('&');
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(a3.e.l("Encoding not supported: ", str), e10);
        }
    }

    public void addMarker(String str) {
        if (v.f3521c) {
            this.mEventLog.a(Thread.currentThread().getId(), str);
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(t tVar) {
        p pVar;
        synchronized (this.mLock) {
            pVar = this.mErrorListener;
        }
        if (pVar != null) {
            pVar.d(tVar);
        }
    }

    public abstract void deliverResponse(Object obj);

    public void finish(String str) {
        o oVar = this.mRequestQueue;
        if (oVar != null) {
            synchronized (oVar.f3506b) {
                oVar.f3506b.remove(this);
            }
            synchronized (oVar.j) {
                Iterator it = oVar.j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            oVar.b();
        }
        if (v.f3521c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new k(this, str, id2));
            } else {
                this.mEventLog.a(id2, str);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return a(getParamsEncoding(), params);
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public b getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public p getErrorListener() {
        p pVar;
        synchronized (this.mLock) {
            pVar = this.mErrorListener;
        }
        return pVar;
    }

    public Map<String, String> getHeaders() {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return a(getPostParamsEncoding(), postParams);
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public m getPriority() {
        return m.f3503d;
    }

    public s getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return ((e) getRetryPolicy()).f3485b;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z5;
        synchronized (this.mLock) {
            z5 = this.mResponseDelivered;
        }
        return z5;
    }

    public boolean isCanceled() {
        boolean z5;
        synchronized (this.mLock) {
            z5 = this.mCanceled;
        }
        return z5;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        l lVar;
        synchronized (this.mLock) {
            lVar = this.mRequestCompleteListener;
        }
        if (lVar != null) {
            ((e4.i) lVar).C(this);
        }
    }

    public void notifyListenerResponseReceived(r rVar) {
        l lVar;
        List list;
        synchronized (this.mLock) {
            lVar = this.mRequestCompleteListener;
        }
        if (lVar != null) {
            e4.i iVar = (e4.i) lVar;
            b bVar = rVar.f3515b;
            if (bVar != null) {
                if (bVar.f3473e >= System.currentTimeMillis()) {
                    String cacheKey = getCacheKey();
                    synchronized (iVar) {
                        list = (List) ((HashMap) iVar.f7980e).remove(cacheKey);
                    }
                    if (list != null) {
                        if (w.f3524a) {
                            w.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((u4.b) iVar.f7981i).h0((n) it.next(), rVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            iVar.C(this);
        }
    }

    public abstract r parseNetworkResponse(i iVar);

    public void sendEvent(int i7) {
        o oVar = this.mRequestQueue;
        if (oVar != null) {
            oVar.b();
        }
    }

    public n setCacheEntry(b bVar) {
        this.mCacheEntry = bVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(l lVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = lVar;
        }
    }

    public n setRequestQueue(o oVar) {
        this.mRequestQueue = oVar;
        return this;
    }

    public n setRetryPolicy(s sVar) {
        this.mRetryPolicy = sVar;
        return this;
    }

    public final n setSequence(int i7) {
        this.mSequence = Integer.valueOf(i7);
        return this;
    }

    public final n setShouldCache(boolean z5) {
        this.mShouldCache = z5;
        return this;
    }

    public final n setShouldRetryConnectionErrors(boolean z5) {
        this.mShouldRetryConnectionErrors = z5;
        return this;
    }

    public final n setShouldRetryServerErrors(boolean z5) {
        this.mShouldRetryServerErrors = z5;
        return this;
    }

    public n setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(n nVar) {
        m priority = getPriority();
        m priority2 = nVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - nVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public t parseNetworkError(t tVar) {
        return tVar;
    }
}
