package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.p0;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4185d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4186e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4187i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4188v;

    public /* synthetic */ a0(p0 p0Var, io.sentry.protocol.f fVar, boolean z5) {
        this.f4187i = p0Var;
        this.f4188v = fVar;
        this.f4186e = z5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #2 {all -> 0x00ab, blocks: (B:20:0x0064, B:23:0x006c, B:25:0x0072, B:27:0x0076, B:36:0x008e, B:31:0x007d, B:34:0x0084, B:40:0x00a1, B:37:0x0091), top: B:62:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        StatFs statFs;
        Long lValueOf;
        File file;
        Long lValueOf2;
        Long lValueOf3;
        switch (this.f4185d) {
            case 0:
                VoiceChannelListInviteView.configure$lambda$11(this.f4186e, (VoiceChannelListInviteView) this.f4187i, (Function0) this.f4188v);
                break;
            default:
                p0 p0Var = (p0) this.f4187i;
                io.sentry.protocol.f fVar = (io.sentry.protocol.f) this.f4188v;
                Context context = p0Var.f12359a;
                SentryAndroidOptions sentryAndroidOptions = p0Var.f12360b;
                File dataDirectory = Environment.getDataDirectory();
                Long lValueOf4 = null;
                if (dataDirectory != null) {
                    StatFs statFs2 = new StatFs(dataDirectory.getPath());
                    try {
                        lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting total internal storage amount.", th2);
                        lValueOf2 = null;
                    }
                    fVar.N = lValueOf2;
                    try {
                        lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting unused internal storage amount.", th3);
                        lValueOf3 = null;
                    }
                    fVar.O = lValueOf3;
                }
                if (this.f4186e) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    try {
                        File[] externalFilesDirs = context.getExternalFilesDirs(null);
                        if (externalFilesDirs != null) {
                            String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
                            int length = externalFilesDirs.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length) {
                                    file = externalFilesDirs[i7];
                                    if (file != null) {
                                        if (absolutePath != null && !absolutePath.isEmpty() && file.getAbsolutePath().contains(absolutePath)) {
                                        }
                                    }
                                    i7++;
                                }
                            }
                            if (file != null) {
                                statFs = new StatFs(file.getPath());
                            } else {
                                statFs = null;
                            }
                            if (statFs != null) {
                                try {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                } catch (Throwable th4) {
                                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting total external storage amount.", th4);
                                    lValueOf = null;
                                }
                                fVar.P = lValueOf;
                                try {
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                } catch (Throwable th5) {
                                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting unused external storage amount.", th5);
                                }
                                fVar.Q = lValueOf4;
                            }
                        } else {
                            sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                        }
                        file = null;
                        if (file != null) {
                            statFs = new StatFs(file.getPath());
                        } else {
                            statFs = null;
                        }
                    } catch (Throwable unused) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "Not possible to read external files directory", new Object[0]);
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        fVar.P = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        fVar.Q = lValueOf4;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a0(boolean z5, VoiceChannelListInviteView voiceChannelListInviteView, Function0 function0) {
        this.f4186e = z5;
        this.f4187i = voiceChannelListInviteView;
        this.f4188v = function0;
    }
}
