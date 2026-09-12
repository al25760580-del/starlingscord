package com.discord.systrace;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import com.discord.codegen.NativeSystraceModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/systrace/SystraceModule;", "Lcom/discord/codegen/NativeSystraceModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cookieCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "isEnabled", "", "beginEvent", "", "eventName", "", "endEvent", "beginAsyncEvent", "", "endAsyncEvent", "cookie", "counterEvent", "value", "systrace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SystraceModule extends NativeSystraceModuleSpec {

    @NotNull
    private final AtomicInteger cookieCounter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystraceModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.cookieCounter = new AtomicInteger(0);
    }

    @Override // com.discord.codegen.NativeSystraceModuleSpec
    public double beginAsyncEvent(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        int iIncrementAndGet = this.cookieCounter.incrementAndGet();
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(eventName, iIncrementAndGet);
        }
        return iIncrementAndGet;
    }

    @Override // com.discord.codegen.NativeSystraceModuleSpec
    @SuppressLint({"UnclosedTrace"})
    public void beginEvent(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Trace.beginSection(eventName);
    }

    @Override // com.discord.codegen.NativeSystraceModuleSpec
    public void counterEvent(@NotNull String eventName, double value) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(eventName, (long) value);
        }
    }

    @Override // com.discord.codegen.NativeSystraceModuleSpec
    public void endAsyncEvent(@NotNull String eventName, double cookie) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(eventName, (int) cookie);
        }
    }

    @Override // com.discord.codegen.NativeSystraceModuleSpec
    public void endEvent() {
        Trace.endSection();
    }

    @Override // com.discord.codegen.NativeSystraceModuleSpec
    public boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        return false;
    }
}
