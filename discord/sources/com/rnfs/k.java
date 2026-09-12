package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import je.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f7104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f7105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f7106c;

    /* JADX WARN: Code duplicated, block: B:112:0x0376  */
    /* JADX WARN: Code duplicated, block: B:114:0x037b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0380  */
    /* JADX WARN: Code duplicated, block: B:118:0x0385  */
    public static void a(k kVar, j jVar) {
        BufferedInputStream bufferedInputStream;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        boolean z5;
        long j;
        HttpURLConnection httpURLConnection2;
        long j5;
        String string;
        String string2;
        String mimeTypeFromExtension;
        String str = "filename";
        String str2 = StackTraceHelper.NAME_KEY;
        String str3 = "\r\n--*****--\r\n";
        try {
            Object[] array = jVar.f7096b.toArray();
            boolean z6 = jVar.f7097c;
            httpURLConnection = (HttpURLConnection) jVar.f7095a.openConnection();
            boolean z7 = true;
            try {
                httpURLConnection.setDoOutput(true);
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = jVar.f7098d.keySetIterator();
                httpURLConnection.setRequestMethod(jVar.f7100f);
                if (!z6) {
                    httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
                }
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    httpURLConnection.setRequestProperty(strNextKey, jVar.f7098d.getString(strNextKey));
                }
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = jVar.f7099e.keySetIterator();
                String str4 = "";
                while (true) {
                    boolean z10 = z7;
                    z5 = z6;
                    if (!readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                        break;
                    }
                    String strNextKey2 = readableMapKeySetIteratorKeySetIterator2.nextKey();
                    ReadableMapKeySetIterator readableMapKeySetIterator = readableMapKeySetIteratorKeySetIterator2;
                    str4 = str4 + "--*****\r\nContent-Disposition: form-data; name=\"" + strNextKey2 + "\"\r\n\r\n" + jVar.f7099e.getString(strNextKey2) + "\r\n";
                    z7 = z10;
                    z6 = z5;
                    readableMapKeySetIteratorKeySetIterator2 = readableMapKeySetIterator;
                    str3 = str3;
                    httpURLConnection = httpURLConnection;
                    bufferedInputStream = null;
                    bufferedReader = null;
                    dataOutputStream = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
                String str5 = str3;
                String[] strArr = new String[array.length];
                Iterator it = jVar.f7096b.iterator();
                String str6 = "" + str4;
                int i7 = 0;
                String str7 = str4;
                long j7 = 0;
                while (true) {
                    j = j7;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        ReadableMap readableMap = (ReadableMap) it.next();
                        try {
                            string = readableMap.getString(str2);
                            string2 = readableMap.getString(str);
                            mimeTypeFromExtension = readableMap.getString("filetype");
                            str = str;
                        } catch (NoSuchKeyException unused) {
                            string = readableMap.getString(str2);
                            string2 = readableMap.getString(str);
                            try {
                                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(readableMap.getString("filepath"));
                                mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : null;
                                if (mimeTypeFromExtension == null) {
                                    mimeTypeFromExtension = "*/*";
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                httpURLConnection2 = httpURLConnection;
                                httpURLConnection = httpURLConnection2;
                                bufferedInputStream = null;
                                bufferedReader = null;
                                dataOutputStream = null;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th;
                            }
                        }
                        String str8 = string;
                        String str9 = str2;
                        String str10 = string2;
                        httpURLConnection2 = httpURLConnection;
                        try {
                            long length = new File(readableMap.getString("filepath")).length();
                            long j10 = j + length;
                            if (!z5) {
                                String str11 = "--*****\r\nContent-Disposition: form-data; name=\"" + str8 + "\"; filename=\"" + str10 + "\"\r\nContent-Type: " + mimeTypeFromExtension + "\r\n";
                                if (array.length - 1 == i7) {
                                    j10 += (long) 13;
                                }
                                String str12 = "Content-length: " + length + "\r\n";
                                strArr[i7] = str11 + str12 + "\r\n";
                                str6 = str6 + str11 + str12 + "\r\n";
                            }
                            j7 = j10;
                            i7++;
                            str2 = str9;
                            httpURLConnection = httpURLConnection2;
                            str = str;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th3;
                    httpURLConnection = httpURLConnection2;
                    bufferedInputStream = null;
                    bufferedReader = null;
                    dataOutputStream = null;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
                httpURLConnection2 = httpURLConnection;
                try {
                    g gVar = kVar.f7104a.f7103i;
                    if (gVar != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putInt("jobId", gVar.f7091a);
                        RNFSManager rNFSManager = gVar.f7092b;
                        rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", writableMapCreateMap);
                    }
                    if (z5) {
                        httpURLConnection = httpURLConnection2;
                    } else {
                        long length2 = j + ((long) ((array.length * 2) + str6.length()));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        int i10 = (int) length2;
                        sb2.append(i10);
                        httpURLConnection = httpURLConnection2;
                        httpURLConnection.setRequestProperty("Content-length", sb2.toString());
                        httpURLConnection.setFixedLengthStreamingMode(i10);
                    }
                    httpURLConnection.connect();
                    dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(dataOutputStream);
                        if (!z5) {
                            dataOutputStream.writeBytes(str7);
                        }
                        Iterator it2 = jVar.f7096b.iterator();
                        int i11 = 0;
                        int i12 = 0;
                        while (it2.hasNext()) {
                            ReadableMap readableMap2 = (ReadableMap) it2.next();
                            if (!z5) {
                                dataOutputStream.writeBytes(strArr[i11]);
                            }
                            File file = new File(readableMap2.getString("filepath"));
                            long length3 = file.length();
                            long jCeil = (long) Math.ceil(length3 / 100.0f);
                            FileInputStream fileInputStream = new FileInputStream(file);
                            FileChannel channel = fileInputStream.getChannel();
                            long j11 = 0;
                            while (j11 < length3) {
                                long j12 = jCeil;
                                long jTransferTo = channel.transferTo(j11, j12, writableByteChannelNewChannel);
                                j11 += jTransferTo;
                                g gVar2 = kVar.f7104a.f7102h;
                                if (gVar2 != null) {
                                    int i13 = (int) (((long) i12) + jTransferTo);
                                    j5 = j;
                                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                                    writableMapCreateMap2.putInt("jobId", gVar2.f7091a);
                                    writableMapCreateMap2.putInt("totalBytesExpectedToSend", (int) j5);
                                    writableMapCreateMap2.putInt("totalBytesSent", i13);
                                    RNFSManager rNFSManager2 = gVar2.f7092b;
                                    rNFSManager2.sendEvent(rNFSManager2.getReactApplicationContext(), "UploadProgress", writableMapCreateMap2);
                                    i12 = i13;
                                } else {
                                    j5 = j;
                                }
                                it2 = it2;
                                j = j5;
                                i11 = i11;
                                fileInputStream = fileInputStream;
                                jCeil = j12;
                            }
                            Iterator it3 = it2;
                            int i14 = i11;
                            FileInputStream fileInputStream2 = fileInputStream;
                            long j13 = j;
                            if (!z5) {
                                dataOutputStream.writeBytes("\r\n");
                            }
                            i11 = i14 + 1;
                            fileInputStream2.close();
                            it2 = it3;
                            j = j13;
                        }
                        if (!z5) {
                            dataOutputStream.writeBytes(str5);
                        }
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                            try {
                                WritableMap writableMapCreateMap3 = Arguments.createMap();
                                for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                                    writableMapCreateMap3.putString(entry.getKey(), entry.getValue().get(0));
                                }
                                StringBuilder sb3 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        String string3 = sb3.toString();
                                        int responseCode = httpURLConnection.getResponseCode();
                                        u uVar = kVar.f7105b;
                                        uVar.f13849b = writableMapCreateMap3;
                                        uVar.f13851d = string3;
                                        uVar.f13848a = responseCode;
                                        httpURLConnection.disconnect();
                                        dataOutputStream.close();
                                        bufferedInputStream.close();
                                        bufferedReader.close();
                                        return;
                                    }
                                    sb3.append(line);
                                    sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                dataOutputStream = dataOutputStream;
                                httpURLConnection = httpURLConnection;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedReader = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedInputStream = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection = httpURLConnection2;
                    httpURLConnection = httpURLConnection;
                    bufferedInputStream = null;
                    bufferedReader = null;
                    dataOutputStream = null;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            bufferedInputStream = null;
            bufferedReader = null;
            httpURLConnection = null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        this.f7104a = ((j[]) objArr)[0];
        this.f7105b = new u();
        new Thread(new a3.h(10, this)).start();
        return this.f7105b;
    }
}
