package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.f6;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f12145b;

    public /* synthetic */ a0(SentryAndroidOptions sentryAndroidOptions, int i7) {
        this.f12144a = i7;
        this.f12145b = sentryAndroidOptions;
    }

    @Override // io.sentry.android.core.i0
    public final int a() {
        switch (this.f12144a) {
            case 0:
                return 6;
            default:
                return 5;
        }
    }

    @Override // io.sentry.android.core.i0
    public final Long b() {
        switch (this.f12144a) {
            case 0:
                return io.sentry.android.core.cache.b.k(this.f12145b, "last_anr_report", "ANR");
            default:
                return io.sentry.android.core.cache.b.k(this.f12145b, "last_tombstone_report", "Tombstone");
        }
    }

    @Override // io.sentry.android.core.i0
    public final boolean c() {
        switch (this.f12144a) {
            case 0:
                return this.f12145b.isReportHistoricalAnrs();
            default:
                return this.f12145b.isReportHistoricalTombstones();
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[Catch: all -> 0x00b5, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x00b5, blocks: (B:27:0x00a1, B:31:0x00b0, B:47:0x00db, B:81:0x017b, B:80:0x0178, B:77:0x0173, B:29:0x00a7, B:37:0x00bc, B:46:0x00d8, B:75:0x0170, B:74:0x016d), top: B:107:0x00a1, inners: #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    @Override // io.sentry.android.core.i0
    public final e4.m d(ApplicationExitInfo applicationExitInfo, boolean z5) {
        e4.i iVar;
        b0 b0Var;
        Hint hintP;
        SentryEvent sentryEvent;
        ArrayList arrayList;
        byte[] bArr;
        switch (this.f12144a) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = this.f12145b;
                long timestamp = applicationExitInfo.getTimestamp();
                boolean z6 = applicationExitInfo.getImportance() != 100;
                try {
                    InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                    try {
                        if (traceInputStream != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr2 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                                while (true) {
                                    int i7 = traceInputStream.read(bArr2, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                                    if (i7 != -1) {
                                        byteArrayOutputStream.write(bArr2, 0, i7);
                                    } else {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        traceInputStream.close();
                                        try {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                                            try {
                                                ArrayList arrayList2 = new ArrayList();
                                                while (true) {
                                                    String line = bufferedReader.readLine();
                                                    if (line != null) {
                                                        io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                                        aVar.f12248a = line;
                                                        arrayList2.add(aVar);
                                                    } else {
                                                        a5.g gVar = new a5.g();
                                                        gVar.f186i = arrayList2;
                                                        gVar.f184d = arrayList2.size();
                                                        io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(sentryAndroidOptions, z6);
                                                        bVar.d(gVar);
                                                        ArrayList arrayList3 = bVar.f12263e;
                                                        ArrayList arrayList4 = new ArrayList(bVar.f12262d.values());
                                                        if (arrayList3.isEmpty()) {
                                                            iVar = new e4.i(b0.NO_DUMP);
                                                            bufferedReader.close();
                                                        } else {
                                                            e4.i iVar2 = new e4.i(7, b0.DUMP, byteArray, arrayList3, arrayList4);
                                                            bufferedReader.close();
                                                            iVar = iVar2;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    bufferedReader.close();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            sentryAndroidOptions.getLogger().g(SentryLevel.WARNING, "Failed to parse ANR thread dump", th4);
                                            iVar = new e4.i(b0.ERROR, byteArray);
                                        }
                                    }
                                    if (traceInputStream != null) {
                                        throw th;
                                    }
                                    try {
                                        traceInputStream.close();
                                        throw th;
                                    } catch (Throwable th5) {
                                        th.addSuppressed(th5);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th6) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th6;
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                    throw th6;
                                }
                            }
                        }
                        iVar = new e4.i(b0.NO_DUMP);
                        if (traceInputStream != null) {
                            traceInputStream.close();
                        }
                        b0Var = (b0) iVar.f7980e;
                        if (b0Var == b0.NO_DUMP) {
                            sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                            return null;
                        }
                        z zVar = new z(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z5, z6);
                        hintP = a5.l0.p(zVar);
                        sentryEvent = new SentryEvent();
                        if (b0Var == b0.ERROR) {
                            io.sentry.protocol.n nVar = new io.sentry.protocol.n();
                            nVar.f13002d = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                            sentryEvent.N = nVar;
                        } else if (b0Var == b0.DUMP) {
                            sentryEvent.P = new f6((List) iVar.f7982v);
                            arrayList = (ArrayList) iVar.f7983w;
                            if (arrayList != null) {
                                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                                dVar.f12933e = new ArrayList(arrayList);
                                sentryEvent.K = dVar;
                            }
                        }
                        sentryEvent.R = SentryLevel.FATAL;
                        sentryEvent.M = io.sentry.config.a.z(timestamp);
                        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) iVar.f7981i) != null) {
                            hintP.f12017f = new io.sentry.a(bArr);
                        }
                        return new e4.m(sentryEvent, hintP, zVar, 22);
                    } catch (Throwable th8) {
                        if (traceInputStream != null) {
                            throw th8;
                        }
                        traceInputStream.close();
                        throw th8;
                        b0Var = (b0) iVar.f7980e;
                        if (b0Var == b0.NO_DUMP) {
                            sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                            return null;
                        }
                        z zVar2 = new z(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z5, z6);
                        hintP = a5.l0.p(zVar2);
                        sentryEvent = new SentryEvent();
                        if (b0Var == b0.ERROR) {
                            io.sentry.protocol.n nVar2 = new io.sentry.protocol.n();
                            nVar2.f13002d = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                            sentryEvent.N = nVar2;
                        } else if (b0Var == b0.DUMP) {
                            sentryEvent.P = new f6((List) iVar.f7982v);
                            arrayList = (ArrayList) iVar.f7983w;
                            if (arrayList != null) {
                                io.sentry.protocol.d dVar2 = new io.sentry.protocol.d();
                                dVar2.f12933e = new ArrayList(arrayList);
                                sentryEvent.K = dVar2;
                            }
                        }
                        sentryEvent.R = SentryLevel.FATAL;
                        sentryEvent.M = io.sentry.config.a.z(timestamp);
                        if (sentryAndroidOptions.isAttachAnrThreadDump()) {
                            hintP.f12017f = new io.sentry.a(bArr);
                        }
                        return new e4.m(sentryEvent, hintP, zVar2, 22);
                    }
                } catch (Throwable th9) {
                    sentryAndroidOptions.getLogger().g(SentryLevel.WARNING, "Failed to read ANR thread dump", th9);
                    iVar = new e4.i(b0.NO_DUMP);
                }
                break;
            default:
                SentryAndroidOptions sentryAndroidOptions2 = this.f12145b;
                try {
                    InputStream traceInputStream2 = applicationExitInfo.getTraceInputStream();
                    if (traceInputStream2 == null) {
                        sentryAndroidOptions2.getLogger().q(SentryLevel.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                        return null;
                    }
                    io.sentry.android.core.internal.tombstone.a aVar2 = new io.sentry.android.core.internal.tombstone.a(traceInputStream2);
                    try {
                        SentryEvent sentryEventF = aVar2.f();
                        aVar2.close();
                        long timestamp2 = applicationExitInfo.getTimestamp();
                        sentryEventF.M = io.sentry.config.a.z(timestamp2);
                        k1 k1Var = new k1(sentryAndroidOptions2.getFlushTimeoutMillis(), sentryAndroidOptions2.getLogger(), timestamp2, z5);
                        return new e4.m(sentryEventF, a5.l0.p(k1Var), k1Var, 22);
                    } catch (Throwable th10) {
                        try {
                            aVar2.close();
                            throw th10;
                        } catch (Throwable th11) {
                            th10.addSuppressed(th11);
                            throw th10;
                        }
                    }
                } catch (Throwable th12) {
                    sentryAndroidOptions2.getLogger().q(SentryLevel.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th12.getMessage());
                    return null;
                }
        }
    }

    @Override // io.sentry.android.core.i0
    public final String getLabel() {
        switch (this.f12144a) {
            case 0:
                return "ANR";
            default:
                return "Tombstone";
        }
    }
}
