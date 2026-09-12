package com.discord.chrome_custom_tabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0014J\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\bH\u0014J\r\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabHostActivity;", "Landroid/app/Activity;", "<init>", "()V", "hasResumedBefore", "", "finishedByTracker", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onDestroy", "finishFromTracker", "finishFromTracker$chrome_custom_tabs_release", "Companion", "chrome_custom_tabs_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTabHostActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean finishedByTracker;
    private boolean hasResumedBefore;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabHostActivity$Companion;", "", "<init>", "()V", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "chrome_custom_tabs_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent intent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intentAddFlags = new Intent(context, (Class<?>) CustomTabHostActivity.class).addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        private Companion() {
        }
    }

    public final void finishFromTracker$chrome_custom_tabs_release() {
        this.finishedByTracker = true;
        finishAndRemoveTask();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            TrackedCustomTab.INSTANCE.onHostCreated$chrome_custom_tabs_release(this);
            return;
        }
        this.hasResumedBefore = true;
        TrackedCustomTab trackedCustomTab = TrackedCustomTab.INSTANCE;
        if (trackedCustomTab.isTracking$chrome_custom_tabs_release()) {
            trackedCustomTab.onHostRebuilt$chrome_custom_tabs_release(this);
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.finishedByTracker || isChangingConfigurations()) {
            return;
        }
        TrackedCustomTab.INSTANCE.onHostDestroyed$chrome_custom_tabs_release(this);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        TrackedCustomTab.INSTANCE.onHostConcealed$chrome_custom_tabs_release();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.hasResumedBefore) {
            TrackedCustomTab.INSTANCE.onHostExposed$chrome_custom_tabs_release();
        } else {
            this.hasResumedBefore = true;
        }
    }
}
