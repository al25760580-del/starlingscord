package q;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public Bundle extraCallbackWithResult(@NonNull String str, Bundle bundle) {
        return null;
    }

    public abstract void onMinimized(Bundle bundle);

    public abstract void onUnminimized(Bundle bundle);

    public void onMessageChannelReady(Bundle bundle) {
    }

    public void onWarmupCompleted(@NonNull Bundle bundle) {
    }

    public void extraCallback(@NonNull String str, Bundle bundle) {
    }

    public void onNavigationEvent(int i7, Bundle bundle) {
    }

    public void onPostMessage(@NonNull String str, Bundle bundle) {
    }

    public void onActivityResized(int i7, int i10, @NonNull Bundle bundle) {
    }

    public void onRelationshipValidationResult(int i7, @NonNull Uri uri, boolean z5, Bundle bundle) {
    }

    public void onActivityLayout(int i7, int i10, int i11, int i12, int i13, @NonNull Bundle bundle) {
    }
}
