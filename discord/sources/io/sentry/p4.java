package io.sentry;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f12886d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4 f12887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f12888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f12889c;

    public p4(q4 q4Var, byte[] bArr) {
        this.f12887a = q4Var;
        this.f12889c = bArr;
        this.f12888b = null;
    }

    public static void a(long j, long j5, String str) throws io.sentry.exception.b {
        if (j > j5) {
            throw new io.sentry.exception.b(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j5)));
        }
    }

    public static p4 b(c1 c1Var, io.sentry.clientreport.b bVar) {
        com.facebook.imagepipeline.nativecode.c.H(c1Var, "ISerializer is required.");
        e4.e eVar = new e4.e((Callable) new com.facebook.react.runtime.o(6, c1Var, bVar));
        return new p4(new q4(w4.resolve(bVar), new m4(eVar, 11), "application/json", null, null), new m4(eVar, 12));
    }

    public static p4 c(final d3 d3Var, final c1 c1Var, final v0 v0Var) {
        final File file = d3Var.H;
        e4.e eVar = new e4.e(new Callable() { // from class: io.sentry.o4
            @Override // java.util.concurrent.Callable
            public final Object call() throws io.sentry.exception.b {
                c1 c1Var2 = c1Var;
                File file2 = file;
                if (!file2.exists()) {
                    throw new io.sentry.exception.b(s0.g.e("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                }
                d3 d3Var2 = d3Var;
                if ("java".equals(d3Var2.f12617x)) {
                    k2 k2Var = k2.f12789a;
                    v0 v0Var2 = v0Var;
                    if (k2Var.equals(v0Var2)) {
                        throw new io.sentry.exception.b("No ProfileConverter available, dropping chunk.");
                    }
                    try {
                        file2.getAbsolutePath();
                        ((k2) v0Var2).getClass();
                        d3Var2.J = new io.sentry.protocol.profiling.a();
                    } catch (Exception e10) {
                        throw new io.sentry.exception.b("Profile conversion failed", e10);
                    }
                } else {
                    String strR = io.sentry.config.a.r(a.a.w(52428800L, file2.getPath()));
                    if (strR.isEmpty()) {
                        throw new io.sentry.exception.b("Profiling trace file is empty");
                    }
                    d3Var2.I = strR;
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, p4.f12886d));
                            try {
                                c1Var2.b(d3Var2, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                file2.delete();
                                return byteArray;
                            } catch (Throwable th2) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (IOException e11) {
                        throw new io.sentry.exception.b("Failed to serialize profile chunk\n" + e11.getMessage());
                    }
                } catch (Throwable th6) {
                    file2.delete();
                    throw th6;
                }
            }
        });
        return new p4(new q4(w4.ProfileChunk, new m4(eVar, 0), "application-json", file.getName(), (String) null, d3Var.f12617x, (Integer) null), new m4(eVar, 1));
    }

    public static p4 d(c1 c1Var, h6 h6Var) {
        com.facebook.imagepipeline.nativecode.c.H(c1Var, "ISerializer is required.");
        com.facebook.imagepipeline.nativecode.c.H(h6Var, "Session is required.");
        e4.e eVar = new e4.e((Callable) new com.facebook.react.runtime.o(3, c1Var, h6Var));
        return new p4(new q4(w4.Session, new m4(eVar, 7), "application/json", null, null), new m4(eVar, 13));
    }

    public static byte[] k(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f12886d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.clientreport.b e(c1 c1Var) throws IOException {
        q4 q4Var = this.f12887a;
        if (q4Var == null || q4Var.f13085w != w4.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12886d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) c1Var.d(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final byte[] f() {
        Callable callable;
        if (this.f12889c == null && (callable = this.f12888b) != null) {
            this.f12889c = (byte[]) callable.call();
        }
        return this.f12889c;
    }

    public final SentryEvent g(c1 c1Var) throws IOException {
        q4 q4Var = this.f12887a;
        if (q4Var == null || q4Var.f13085w != w4.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12886d));
        try {
            SentryEvent sentryEvent = (SentryEvent) c1Var.d(bufferedReader, SentryEvent.class);
            bufferedReader.close();
            return sentryEvent;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final z4 h(c1 c1Var) throws IOException {
        q4 q4Var = this.f12887a;
        if (q4Var == null || q4Var.f13085w != w4.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12886d));
        try {
            z4 z4Var = (z4) c1Var.d(bufferedReader, z4.class);
            bufferedReader.close();
            return z4Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final d5 i(c1 c1Var) throws IOException {
        q4 q4Var = this.f12887a;
        if (q4Var == null || q4Var.f13085w != w4.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12886d));
        try {
            d5 d5Var = (d5) c1Var.d(bufferedReader, d5.class);
            bufferedReader.close();
            return d5Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.protocol.d0 j(c1 c1Var) throws IOException {
        q4 q4Var = this.f12887a;
        if (q4Var == null || q4Var.f13085w != w4.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(f()), f12886d));
        try {
            io.sentry.protocol.d0 d0Var = (io.sentry.protocol.d0) c1Var.d(bufferedReader, io.sentry.protocol.d0.class);
            bufferedReader.close();
            return d0Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public p4(q4 q4Var, Callable callable) {
        this.f12887a = q4Var;
        this.f12888b = callable;
        this.f12889c = null;
    }
}
