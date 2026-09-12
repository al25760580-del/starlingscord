package com.facebook.imagepipeline.backends.okhttp3;

import android.os.SystemClock;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.devsupport.StackTraceHelper;
import cs.h;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rn.u;
import vi.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OkHttpNetworkFetcher.OkHttpNetworkFetchState f4797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OkHttpNetworkFetcher f4798e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ NetworkFetcher.Callback f4799i;

    public b(OkHttpNetworkFetcher.OkHttpNetworkFetchState okHttpNetworkFetchState, OkHttpNetworkFetcher okHttpNetworkFetcher, NetworkFetcher.Callback callback) {
        this.f4797d = okHttpNetworkFetchState;
        this.f4798e = okHttpNetworkFetcher;
        this.f4799i = callback;
    }

    @Override // cs.h
    public final void onFailure(Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        OkHttpNetworkFetcher.access$handleException(this.f4798e, call, e10, this.f4799i);
    }

    @Override // cs.h
    public final void onResponse(Call call, Response response) throws IOException {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        OkHttpNetworkFetcher.OkHttpNetworkFetchState okHttpNetworkFetchState = this.f4797d;
        okHttpNetworkFetchState.f4793g = jElapsedRealtime;
        ResponseBody responseBody = response.f17385y;
        NetworkFetcher.Callback callback = this.f4799i;
        OkHttpNetworkFetcher okHttpNetworkFetcher = this.f4798e;
        try {
            if (responseBody == null) {
                OkHttpNetworkFetcher.access$handleException(okHttpNetworkFetcher, call, OkHttpNetworkFetcher.access$makeExceptionFromResponse(okHttpNetworkFetcher, "Response body null: " + response, response), callback);
                return;
            }
            try {
                if (response.g()) {
                    u uVar = BytesRange.f4806c;
                    Intrinsics.checkNotNullParameter("Content-Range", StackTraceHelper.NAME_KEY);
                    BytesRange bytesRangeO = d.o(response.f("Content-Range", null));
                    if (bytesRangeO != null && (bytesRangeO.f4807a != 0 || bytesRangeO.f4808b != Integer.MAX_VALUE)) {
                        okHttpNetworkFetchState.f4938e = bytesRangeO;
                        okHttpNetworkFetchState.f4937d = 8;
                    }
                    callback.b(responseBody.byteStream(), responseBody.contentLength() < 0 ? 0 : (int) responseBody.contentLength());
                } else {
                    OkHttpNetworkFetcher.access$handleException(okHttpNetworkFetcher, call, OkHttpNetworkFetcher.access$makeExceptionFromResponse(okHttpNetworkFetcher, "Unexpected HTTP code " + response, response), callback);
                }
            } catch (Exception e10) {
                OkHttpNetworkFetcher.access$handleException(okHttpNetworkFetcher, call, e10, callback);
            }
            Unit unit = Unit.f14616a;
            responseBody.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(responseBody, th2);
                throw th3;
            }
        }
    }
}
