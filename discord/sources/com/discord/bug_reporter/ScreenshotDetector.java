package com.discord.bug_reporter;

import android.content.ContentResolver;
import androidx.lifecycle.r0;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/discord/bug_reporter/ScreenshotDetector;", "", "contentResolver", "Landroid/content/ContentResolver;", "<init>", "(Landroid/content/ContentResolver;)V", "screenshotContentObserver", "Lcom/discord/bug_reporter/ScreenshotContentObserver;", "value", "Lkotlin/Function0;", "", "screenshotListener", "getScreenshotListener", "()Lkotlin/jvm/functions/Function0;", "setScreenshotListener", "(Lkotlin/jvm/functions/Function0;)V", "", AppStateModule.APP_STATE_ACTIVE, "getActive", "()Z", "setActive", "(Z)V", "toggleScreenshotObserver", "bug_reporter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenshotDetector {
    private boolean active;

    @NotNull
    private final ScreenshotContentObserver screenshotContentObserver;
    private Function0<Unit> screenshotListener;

    public ScreenshotDetector(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.screenshotContentObserver = new ScreenshotContentObserver(contentResolver, new r0(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit screenshotContentObserver$lambda$0(ScreenshotDetector screenshotDetector) {
        Function0<Unit> function0 = screenshotDetector.screenshotListener;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f14616a;
    }

    private final void toggleScreenshotObserver() {
        if (!this.active || this.screenshotListener == null) {
            this.screenshotContentObserver.disconnect();
        } else {
            this.screenshotContentObserver.connect();
        }
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Function0<Unit> getScreenshotListener() {
        return this.screenshotListener;
    }

    public final void setActive(boolean z5) {
        this.active = z5;
        toggleScreenshotObserver();
    }

    public final void setScreenshotListener(Function0<Unit> function0) {
        this.screenshotListener = function0;
        toggleScreenshotObserver();
    }
}
