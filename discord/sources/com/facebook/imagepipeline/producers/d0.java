package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.react.views.image.ReactImageView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f4963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RealtimeSinceBootClock f4964c;

    public d0(int i7) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.f4963b = Executors.newFixedThreadPool(3);
        this.f4964c = realtimeSinceBootClock;
        this.f4962a = i7;
    }

    public final HttpURLConnection a(Uri uri, int i7) throws IOException {
        URL url;
        String str;
        Uri uri2 = v8.a.f21502a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e10) {
                throw new RuntimeException(e10);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f4962a);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i7 > 0 && uri3 != null && !n8.i.f(uri3.getScheme(), scheme)) {
            return a(uri3, i7 - 1);
        }
        if (i7 == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final FetchState createFetchState(Consumer consumer, ProducerContext producerContext) {
        return new c0(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final void fetch(FetchState fetchState, NetworkFetcher.Callback callback) {
        c0 c0Var = (c0) fetchState;
        c0Var.f4954f = this.f4964c.now();
        v0 v0Var = (v0) callback;
        c0Var.f4935b.i(new b0(this.f4963b.submit(new a0(this, c0Var, v0Var)), v0Var));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final Map getExtraMap(FetchState fetchState, int i7) {
        c0 c0Var = (c0) fetchState;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c0Var.f4955g - c0Var.f4954f));
        map.put("fetch_time", Long.toString(c0Var.f4956h - c0Var.f4955g));
        map.put("total_time", Long.toString(c0Var.f4956h - c0Var.f4954f));
        map.put("image_size", Integer.toString(i7));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final void onFetchCompletion(FetchState fetchState, int i7) {
        ((c0) fetchState).f4956h = this.f4964c.now();
    }
}
