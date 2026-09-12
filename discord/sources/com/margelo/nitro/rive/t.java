package com.margelo.nitro.rive;

import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.NitroModules;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Continuation continuation, int i7) {
        super(2, continuation);
        this.f6980d = i7;
        this.f6981e = obj;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f6980d) {
            case 0:
                return new t((String) this.f6981e, continuation, 0);
            case 1:
                return new t((String) this.f6981e, continuation, 1);
            case 2:
                return new t((String) this.f6981e, continuation, 2);
            case 3:
                return new t((String) this.f6981e, continuation, 3);
            default:
                return new t((ar.p) this.f6981e, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f6980d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0074, please report this as an issue */
    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws h, j, IOException {
        int identifier;
        InputStream inputStreamOpenRawResource;
        int i7 = this.f6980d;
        Object obj2 = this.f6981e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                String path = (String) obj2;
                File file = new File(path);
                if (file.exists()) {
                    return co.m.b(file);
                }
                Intrinsics.checkNotNullParameter(path, "path");
                throw new h("File not found: " + path);
            case 1:
                String url = (String) obj2;
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                    Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        int responseCode = httpURLConnection.getResponseCode();
                        if (200 > responseCode || responseCode >= 300) {
                            Intrinsics.checkNotNullParameter(url, "url");
                            throw new h("HTTP error " + responseCode + " for " + url);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            Intrinsics.checkNotNull(inputStream);
                            byte[] bArrK = m3.m.K(inputStream);
                            ls.d.k(inputStream, null);
                            httpURLConnection.disconnect();
                            return bArrK;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ls.d.k(inputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        httpURLConnection.disconnect();
                        throw th4;
                    }
                } catch (MalformedURLException unused) {
                    throw new h(url);
                }
            case 2:
                wn.a aVar3 = wn.a.f22354d;
                ib.a.L(obj);
                URL url2 = new URL((String) obj2);
                Intrinsics.checkNotNullParameter(url2, "<this>");
                InputStream inputStreamOpenStream = url2.openStream();
                try {
                    Intrinsics.checkNotNull(inputStreamOpenStream);
                    byte[] bArrK2 = m3.m.K(inputStreamOpenStream);
                    ls.d.k(inputStreamOpenStream, null);
                    return bArrK2;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ls.d.k(inputStreamOpenStream, th5);
                        throw th6;
                    }
                }
            case 3:
                String resource = (String) obj2;
                wn.a aVar4 = wn.a.f22354d;
                ib.a.L(obj);
                NitroModules.Companion.getClass();
                ReactApplicationContext reactApplicationContext = NitroModules.applicationContext;
                if (reactApplicationContext == null) {
                    throw j.f6943d;
                }
                Iterator it = kotlin.collections.d0.g("raw", "drawable").iterator();
                do {
                    if (it.hasNext()) {
                        identifier = reactApplicationContext.getResources().getIdentifier(resource, (String) it.next(), reactApplicationContext.getPackageName());
                    } else {
                        identifier = 0;
                    }
                    if (identifier != 0) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        throw new h("Resource not found: " + resource);
                    }
                    inputStreamOpenRawResource = reactApplicationContext.getResources().openRawResource(identifier);
                    try {
                        Intrinsics.checkNotNull(inputStreamOpenRawResource);
                        byte[] bArrK3 = m3.m.K(inputStreamOpenRawResource);
                        ls.d.k(inputStreamOpenRawResource, null);
                        return bArrK3;
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            ls.d.k(inputStreamOpenRawResource, th7);
                            throw th8;
                        }
                    }
                } while (identifier == 0);
                if (identifier != 0) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    throw new h("Resource not found: " + resource);
                }
                inputStreamOpenRawResource = reactApplicationContext.getResources().openRawResource(identifier);
                Intrinsics.checkNotNull(inputStreamOpenRawResource);
                byte[] bArrK4 = m3.m.K(inputStreamOpenRawResource);
                ls.d.k(inputStreamOpenRawResource, null);
                return bArrK4;
            default:
                wn.a aVar5 = wn.a.f22354d;
                ib.a.L(obj);
                return Boolean.valueOf(((ar.p) obj2).S(Unit.f14616a));
        }
    }
}
