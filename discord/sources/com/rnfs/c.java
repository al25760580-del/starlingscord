package com.rnfs;

import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f7080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f7081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f7082c;

    /* JADX WARN: Code duplicated, block: B:79:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    public static void a(c cVar, a aVar, b bVar) {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        int i7;
        long j;
        long j5;
        int i10;
        int i11;
        FileOutputStream fileOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) aVar.f7068a.openConnection();
            try {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = aVar.f7070c.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    httpURLConnection.setRequestProperty(strNextKey, aVar.f7070c.getString(strNextKey));
                }
                httpURLConnection.setConnectTimeout(aVar.f7074g);
                httpURLConnection.setReadTimeout(aVar.f7073f);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                long contentLengthLong = httpURLConnection.getContentLengthLong();
                if (responseCode == 200 || !(responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
                    if (responseCode >= 200 || responseCode >= 300) {
                        bufferedInputStream = null;
                    } else {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap map = new HashMap();
                        Iterator<Map.Entry<String, List<String>>> it = headerFields.entrySet().iterator();
                        while (true) {
                            i7 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, List<String>> next = it.next();
                            String key = next.getKey();
                            String str = next.getValue().get(0);
                            if (key != null && str != null) {
                                map.put(key, str);
                            }
                        }
                        g gVar = cVar.f7080a.f7076i;
                        if (gVar != null) {
                            gVar.a(responseCode, contentLengthLong, map);
                        }
                        bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(aVar.f7069b);
                            try {
                                byte[] bArr = new byte[8192];
                                boolean z5 = cVar.f7080a.j != null;
                                long j7 = 0;
                                long j10 = 0;
                                double d6 = 0.0d;
                                while (true) {
                                    int i12 = bufferedInputStream.read(bArr);
                                    int i13 = i7;
                                    if (i12 == -1) {
                                        fileOutputStream2.flush();
                                        bVar.f7078b = j10;
                                        fileOutputStream = fileOutputStream2;
                                        break;
                                    }
                                    if (cVar.f7081b.get()) {
                                        throw new Exception("Download has been aborted");
                                    }
                                    boolean z6 = z5;
                                    long j11 = j10 + ((long) i12);
                                    if (z6) {
                                        if (aVar.f7071d > 0) {
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (jCurrentTimeMillis - j7 > aVar.f7071d) {
                                                long[] jArr = new long[2];
                                                jArr[i13] = contentLengthLong;
                                                jArr[1] = j11;
                                                cVar.publishProgress(jArr);
                                                j7 = jCurrentTimeMillis;
                                            }
                                            j = contentLengthLong;
                                            i11 = i12;
                                            j5 = j11;
                                        } else if (aVar.f7072e <= 0.0f) {
                                            long[] jArr2 = new long[2];
                                            jArr2[i13] = contentLengthLong;
                                            jArr2[1] = j11;
                                            cVar.publishProgress(jArr2);
                                            j = contentLengthLong;
                                            i10 = i12;
                                            j5 = j11;
                                        } else {
                                            i10 = i12;
                                            j5 = j11;
                                            double dRound = Math.round((j5 * 100.0d) / contentLengthLong);
                                            j = contentLengthLong;
                                            if (dRound % ((double) aVar.f7072e) == 0.0d && (dRound != d6 || j5 == j)) {
                                                Log.d("Downloader", "EMIT: " + String.valueOf(dRound) + ", TOTAL:" + String.valueOf(j5));
                                                long[] jArr3 = new long[2];
                                                jArr3[i13] = j;
                                                jArr3[1] = j5;
                                                cVar.publishProgress(jArr3);
                                                d6 = dRound;
                                            }
                                        }
                                        fileOutputStream2.write(bArr, i13, i11);
                                        j10 = j5;
                                        z5 = z6;
                                        i7 = i13;
                                        contentLengthLong = j;
                                    } else {
                                        j = contentLengthLong;
                                        j5 = j11;
                                        i10 = i12;
                                    }
                                    i11 = i10;
                                    fileOutputStream2.write(bArr, i13, i11);
                                    j10 = j5;
                                    z5 = z6;
                                    i7 = i13;
                                    contentLengthLong = j;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    bVar.f7077a = responseCode;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.connect();
                    int responseCode2 = httpURLConnection2.getResponseCode();
                    contentLengthLong = httpURLConnection2.getContentLengthLong();
                    responseCode = responseCode2;
                    httpURLConnection = httpURLConnection2;
                    if (responseCode >= 200) {
                        bufferedInputStream = null;
                    } else {
                        bufferedInputStream = null;
                    }
                    bVar.f7077a = responseCode;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = null;
                    httpURLConnection = httpURLConnection2;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        throw th;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        this.f7080a = ((a[]) objArr)[0];
        this.f7082c = new b();
        new Thread(new a3.h(9, this)).start();
        return this.f7082c;
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        long[][] jArr = (long[][]) objArr;
        super.onProgressUpdate(jArr);
        g gVar = this.f7080a.j;
        if (gVar != null) {
            long[] jArr2 = jArr[0];
            long j = jArr2[0];
            long j5 = jArr2[1];
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", gVar.f7091a);
            writableMapCreateMap.putDouble("contentLength", j);
            writableMapCreateMap.putDouble("bytesWritten", j5);
            RNFSManager rNFSManager = gVar.f7092b;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", writableMapCreateMap);
        }
    }
}
