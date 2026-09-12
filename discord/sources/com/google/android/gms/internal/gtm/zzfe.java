package com.google.android.gms.internal.gtm;

import a3.e;
import af.w;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.discord.chat.presentation.list.a;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.common.util.VisibleForTesting;
import ff.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
final class zzfe extends zzbs {
    private static final byte[] zza = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.getBytes();
    private final String zzb;
    private final zzfo zzc;

    public zzfe(zzbv zzbvVar) {
        super(zzbvVar);
        String str = zzbt.zza;
        String str2 = Build.VERSION.RELEASE;
        String strZzd = zzfs.zzd(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        StringBuilder sbU = e.u("GoogleAnalytics/", str, " (Linux; U; Android ", str2, "; ");
        e.A(sbU, strZzd, "; ", str3, " Build/");
        this.zzb = a.k(sbU, str4, ")");
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[SYNTHETIC] */
    private final int zzg(URL url, byte[] bArr) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnectionZzb;
        IOException e10;
        OutputStream outputStream;
        w.g(url);
        w.g(bArr);
        int length = bArr.length;
        zzH("POST bytes, url", Integer.valueOf(length), url);
        if (zzbr.zzV()) {
            zzP("Post payload\n", new String(bArr));
        }
        OutputStream outputStream2 = null;
        outputStream2 = null;
        outputStream2 = null;
        HttpURLConnection httpURLConnection = null;
        try {
            zzo().getPackageName();
            httpURLConnectionZzb = zzb(url);
            try {
                httpURLConnectionZzb.setDoOutput(true);
                httpURLConnectionZzb.setFixedLengthStreamingMode(length);
                httpURLConnectionZzb.connect();
                outputStream2 = httpURLConnectionZzb.getOutputStream();
                outputStream2.write(bArr);
                zzk(httpURLConnectionZzb);
                int responseCode = httpURLConnectionZzb.getResponseCode();
                if (responseCode == 200) {
                    zzs().zzi();
                    responseCode = 200;
                }
                zzG("POST status", Integer.valueOf(responseCode));
                try {
                    outputStream2.close();
                } catch (IOException e11) {
                    zzK("Error closing http post connection output stream", e11);
                }
                httpURLConnectionZzb.disconnect();
                return responseCode;
            } catch (IOException e12) {
                e10 = e12;
                OutputStream outputStream3 = outputStream2;
                httpURLConnection = httpURLConnectionZzb;
                outputStream = outputStream3;
                try {
                    zzS("Network POST connection error", e10);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e13) {
                            zzK("Error closing http post connection output stream", e13);
                        }
                    }
                    if (httpURLConnection == null) {
                        return 0;
                    }
                    httpURLConnection.disconnect();
                    return 0;
                } catch (Throwable th3) {
                    th2 = th3;
                    HttpURLConnection httpURLConnection2 = httpURLConnection;
                    outputStream2 = outputStream;
                    httpURLConnectionZzb = httpURLConnection2;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e14) {
                            zzK("Error closing http post connection output stream", e14);
                        }
                    }
                    if (httpURLConnectionZzb != null) {
                        throw th2;
                    }
                    httpURLConnectionZzb.disconnect();
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (httpURLConnectionZzb != null) {
                    throw th2;
                }
                httpURLConnectionZzb.disconnect();
                throw th2;
            }
        } catch (IOException e15) {
            e10 = e15;
            outputStream = null;
        } catch (Throwable th5) {
            th2 = th5;
            httpURLConnectionZzb = null;
        }
    }

    private final URL zzh() {
        zzw();
        String strZzi = zzct.zzi();
        zzw();
        String strZzb = zzeu.zzt.zzb();
        try {
            return new URL(strZzb.length() != 0 ? strZzi.concat(strZzb) : new String(strZzi));
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzi(zzex zzexVar) {
        String str;
        String strConcat;
        if (zzexVar.zzh()) {
            zzw();
            String strZzi = zzct.zzi();
            zzw();
            String strZzj = zzct.zzj();
            if (strZzj.length() != 0) {
                strConcat = strZzi.concat(strZzj);
            } else {
                str = new String(strZzi);
                strConcat = str;
            }
        } else {
            zzw();
            String strZzk = zzct.zzk();
            zzw();
            String strZzj2 = zzct.zzj();
            if (strZzj2.length() != 0) {
                strConcat = strZzk.concat(strZzj2);
            } else {
                str = new String(strZzk);
                strConcat = str;
            }
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    private final URL zzj(zzex zzexVar, String str) {
        String strL;
        if (zzexVar.zzh()) {
            zzw();
            String strZzi = zzct.zzi();
            zzw();
            String strZzj = zzct.zzj();
            int length = strZzi.length();
            strL = a.l(new StringBuilder(length + 1 + strZzj.length() + str.length()), strZzi, strZzj, "?", str);
        } else {
            zzw();
            String strZzk = zzct.zzk();
            zzw();
            String strZzj2 = zzct.zzj();
            int length2 = strZzk.length();
            strL = a.l(new StringBuilder(length2 + 1 + strZzj2.length() + str.length()), strZzk, strZzj2, "?", str);
        }
        try {
            return new URL(strL);
        } catch (MalformedURLException e10) {
            zzK("Error trying to parse the hardcoded host url", e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        zzK("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(java.net.HttpURLConnection r4) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1b
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L19
        La:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 > 0) goto La
            r4.close()     // Catch: java.io.IOException -> L14
            return
        L14:
            r4 = move-exception
            r3.zzK(r0, r4)
            return
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            r1 = move-exception
            r4 = 0
        L1d:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.zzK(r0, r4)
        L27:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfe.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb2, String str, String str2) {
        if (sb2.length() != 0) {
            sb2.append('&');
        }
        sb2.append(URLEncoder.encode(str, "UTF-8"));
        sb2.append('=');
        sb2.append(URLEncoder.encode(str2, "UTF-8"));
    }

    @VisibleForTesting
    public final String zza(zzex zzexVar, boolean z5) {
        w.g(zzexVar);
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : zzexVar.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key) && !"z".equals(key) && !"_gmsv".equals(key)) {
                    zzl(sb2, key, entry.getValue());
                }
            }
            zzl(sb2, "ht", String.valueOf(zzexVar.zzd()));
            ((b) zzC()).getClass();
            zzl(sb2, "qt", String.valueOf(System.currentTimeMillis() - zzexVar.zzd()));
            zzw();
            if (z5) {
                long jZzc = zzexVar.zzc();
                zzl(sb2, "z", jZzc != 0 ? String.valueOf(jZzc) : String.valueOf(zzexVar.zzb()));
            }
            return sb2.toString();
        } catch (UnsupportedEncodingException e10) {
            zzK("Failed to encode name or value", e10);
            return null;
        }
    }

    @VisibleForTesting
    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(zzeu.zzE.zzb().intValue());
        zzw();
        httpURLConnection.setReadTimeout(zzeu.zzF.zzb().intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0200  */
    /* JADX WARN: Code duplicated, block: B:109:0x0217  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:170:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0322 A[EDGE_INSN: B:189:0x0322->B:165:0x0322 BREAK  A[LOOP:1: B:113:0x0231->B:192:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[LOOP:1: B:113:0x0231->B:192:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    public final List<Long> zzc(List<zzex> list) throws Throwable {
        boolean z5;
        boolean z6;
        HttpURLConnection httpURLConnection;
        int size;
        int iZzg;
        Integer numValueOf;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        OutputStream outputStream2;
        Throwable th3;
        i.a();
        zzW();
        w.g(list);
        if (zzw().zza().isEmpty()) {
            z5 = false;
            z6 = false;
        } else {
            zzfo zzfoVar = this.zzc;
            zzw();
            if (zzfoVar.zzc(((long) zzeu.zzC.zzb().intValue()) * 1000)) {
                zzw();
                String strZzb = zzeu.zzv.zzb();
                z5 = "BATCH_BY_SESSION".equalsIgnoreCase(strZzb) || "BATCH_BY_TIME".equalsIgnoreCase(strZzb) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(strZzb) || "BATCH_BY_COUNT".equalsIgnoreCase(strZzb) || "BATCH_BY_SIZE".equalsIgnoreCase(strZzb);
                zzw();
                if (true == "GZIP".equalsIgnoreCase(zzeu.zzw.zzb())) {
                    z6 = true;
                }
            } else {
                z5 = false;
            }
            z6 = false;
        }
        if (!z5) {
            ArrayList arrayList = new ArrayList(list.size());
            for (zzex zzexVar : list) {
                w.g(zzexVar);
                String strZza = zza(zzexVar, !zzexVar.zzh());
                if (strZza != null) {
                    int length = strZza.length();
                    zzw();
                    if (length > zzeu.zzu.zzb().intValue()) {
                        String strZza2 = zza(zzexVar, false);
                        if (strZza2 != null) {
                            byte[] bytes = strZza2.getBytes();
                            int length2 = bytes.length;
                            zzw();
                            if (length2 <= zzeu.zzz.zzb().intValue()) {
                                URL urlZzi = zzi(zzexVar);
                                if (urlZzi == null) {
                                    zzJ("Failed to build collect POST endpoint url");
                                    return arrayList;
                                }
                                if (zzg(urlZzi, bytes) != 200) {
                                    break;
                                }
                            } else {
                                zzz().zzb(zzexVar, "Hit payload exceeds size limit");
                            }
                        } else {
                            zzz().zzb(zzexVar, "Error formatting hit for POST upload");
                        }
                        arrayList.add(Long.valueOf(zzexVar.zzb()));
                        size = arrayList.size();
                        zzw();
                        if (size >= zzct.zzh()) {
                            break;
                        }
                    } else {
                        URL urlZzj = zzj(zzexVar, strZza);
                        if (urlZzj == null) {
                            zzJ("Failed to build collect GET endpoint url");
                            return arrayList;
                        }
                        zzG("GET request", urlZzj);
                        try {
                            HttpURLConnection httpURLConnectionZzb = zzb(urlZzj);
                            try {
                                httpURLConnectionZzb.connect();
                                zzk(httpURLConnectionZzb);
                                int responseCode = httpURLConnectionZzb.getResponseCode();
                                if (responseCode == 200) {
                                    zzs().zzi();
                                    responseCode = 200;
                                }
                                zzG("GET status", Integer.valueOf(responseCode));
                                httpURLConnectionZzb.disconnect();
                                if (responseCode != 200) {
                                    break;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                httpURLConnection = httpURLConnectionZzb;
                                try {
                                    zzS("Network GET connection error", e);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                httpURLConnection = httpURLConnectionZzb;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            httpURLConnection = null;
                        } catch (Throwable th6) {
                            th = th6;
                            httpURLConnection = null;
                        }
                    }
                } else {
                    zzz().zzb(zzexVar, "Error formatting hit for upload");
                }
                arrayList.add(Long.valueOf(zzexVar.zzb()));
                size = arrayList.size();
                zzw();
                if (size >= zzct.zzh()) {
                    break;
                    break;
                }
            }
            return arrayList;
        }
        w.b(!list.isEmpty());
        zzQ("Uploading batched hits. compression, count", Boolean.valueOf(z6), Integer.valueOf(list.size()));
        zzfd zzfdVar = new zzfd(this);
        ArrayList arrayList2 = new ArrayList();
        for (zzex zzexVar2 : list) {
            if (!zzfdVar.zzb(zzexVar2)) {
                break;
            }
            arrayList2.add(Long.valueOf(zzexVar2.zzb()));
        }
        if (zzfdVar.zza() == 0) {
            return arrayList2;
        }
        URL urlZzh = zzh();
        if (urlZzh == null) {
            zzJ("Failed to build batching endpoint url");
            return Collections.EMPTY_LIST;
        }
        if (z6) {
            byte[] bArrZzc = zzfdVar.zzc();
            w.g(bArrZzc);
            try {
                zzo().getPackageName();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrZzc);
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length3 = byteArray.length;
                Integer numValueOf2 = Integer.valueOf(length3);
                int length4 = bArrZzc.length;
                zzI("POST compressed size, ratio %, url", numValueOf2, Long.valueOf((((long) length3) * 100) / ((long) length4)), urlZzh);
                if (length3 > length4) {
                    zzT("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length4));
                }
                if (zzbr.zzV()) {
                    String str = new String(bArrZzc);
                    zzP("Post payload", str.length() != 0 ? ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.concat(str) : new String(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
                }
                HttpURLConnection httpURLConnectionZzb2 = zzb(urlZzh);
                try {
                    httpURLConnectionZzb2.setDoOutput(true);
                    httpURLConnectionZzb2.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnectionZzb2.setFixedLengthStreamingMode(length3);
                    httpURLConnectionZzb2.connect();
                    OutputStream outputStream3 = httpURLConnectionZzb2.getOutputStream();
                    try {
                        outputStream3.write(byteArray);
                        outputStream3.close();
                        zzk(httpURLConnectionZzb2);
                        int responseCode2 = httpURLConnectionZzb2.getResponseCode();
                        if (responseCode2 == 200) {
                            zzs().zzi();
                            responseCode2 = 200;
                        }
                        zzG("POST status", Integer.valueOf(responseCode2));
                        httpURLConnectionZzb2.disconnect();
                        iZzg = responseCode2;
                    } catch (IOException e12) {
                        e = e12;
                        httpURLConnection3 = httpURLConnectionZzb2;
                        outputStream2 = outputStream3;
                        try {
                            zzS("Network compressed POST connection error", e);
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e13) {
                                    zzK("Error closing http compressed post connection output stream", e13);
                                }
                            }
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            iZzg = 0;
                        } catch (Throwable th7) {
                            th3 = th7;
                            OutputStream outputStream4 = outputStream2;
                            httpURLConnection2 = httpURLConnection3;
                            outputStream = outputStream4;
                            th2 = th3;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e14) {
                                    zzK("Error closing http compressed post connection output stream", e14);
                                }
                            }
                            if (httpURLConnection2 == null) {
                                throw th2;
                            }
                            httpURLConnection2.disconnect();
                            throw th2;
                        }
                    } catch (Throwable th8) {
                        th3 = th8;
                        httpURLConnection2 = httpURLConnectionZzb2;
                        outputStream = outputStream3;
                        th2 = th3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection2 == null) {
                            throw th2;
                        }
                        httpURLConnection2.disconnect();
                        throw th2;
                    }
                } catch (IOException e15) {
                    e = e15;
                    httpURLConnection3 = httpURLConnectionZzb2;
                    outputStream2 = null;
                    zzS("Network compressed POST connection error", e);
                    if (outputStream2 != null) {
                        outputStream2.close();
                    }
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                    iZzg = 0;
                    if (iZzg == 200) {
                        zzP("Batched upload completed. Hits batched", Integer.valueOf(zzfdVar.zza()));
                        return arrayList2;
                    }
                    numValueOf = Integer.valueOf(iZzg);
                    zzP("Network error uploading hits. status code", numValueOf);
                    if (zzw().zza().contains(numValueOf)) {
                        zzR("Server instructed the client to stop batching");
                        this.zzc.zzb();
                    }
                    return Collections.EMPTY_LIST;
                } catch (Throwable th9) {
                    th3 = th9;
                    httpURLConnection2 = httpURLConnectionZzb2;
                    outputStream = null;
                }
            } catch (IOException e16) {
                e = e16;
                httpURLConnection3 = null;
            } catch (Throwable th10) {
                th2 = th10;
                outputStream = null;
                httpURLConnection2 = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection2 == null) {
                    throw th2;
                }
                httpURLConnection2.disconnect();
                throw th2;
            }
        } else {
            iZzg = zzg(urlZzh, zzfdVar.zzc());
        }
        if (iZzg == 200) {
            zzP("Batched upload completed. Hits batched", Integer.valueOf(zzfdVar.zza()));
            return arrayList2;
        }
        numValueOf = Integer.valueOf(iZzg);
        zzP("Network error uploading hits. status code", numValueOf);
        if (zzw().zza().contains(numValueOf)) {
            zzR("Server instructed the client to stop batching");
            this.zzc.zzb();
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        zzP("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo activeNetworkInfo;
        i.a();
        zzW();
        try {
            activeNetworkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzO("No network connectivity");
        return false;
    }
}
