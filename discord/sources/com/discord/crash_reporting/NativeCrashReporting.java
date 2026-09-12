package com.discord.crash_reporting;

import androidx.annotation.Keep;
import com.facebook.jni.annotations.DoNotStrip;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/discord/crash_reporting/NativeCrashReporting;", "", "<init>", "()V", "Companion", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeCrashReporting {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 ¨\u0006\b"}, d2 = {"Lcom/discord/crash_reporting/NativeCrashReporting$Companion;", "", "<init>", "()V", "initNative", "", "isProd", "", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        @Keep
        public final void initNative(boolean isProd) {
            NativeCrashReporting.initNative(isProd);
        }

        private Companion() {
        }
    }

    static {
        System.loadLibrary("crash-reporting");
    }

    @DoNotStrip
    @Keep
    public static final native void initNative(boolean z5);
}
