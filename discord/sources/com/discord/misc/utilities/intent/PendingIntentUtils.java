package com.discord.misc.utilities.intent;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/discord/misc/utilities/intent/PendingIntentUtils;", "", "<init>", "()V", "immutablePendingIntentFlag", "", "flags", "mutablePendingIntentFlag", "misc_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PendingIntentUtils {

    @NotNull
    public static final PendingIntentUtils INSTANCE = new PendingIntentUtils();

    private PendingIntentUtils() {
    }

    public static /* synthetic */ int immutablePendingIntentFlag$default(PendingIntentUtils pendingIntentUtils, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = 134217728;
        }
        return pendingIntentUtils.immutablePendingIntentFlag(i7);
    }

    public static /* synthetic */ int mutablePendingIntentFlag$default(PendingIntentUtils pendingIntentUtils, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = 134217728;
        }
        return pendingIntentUtils.mutablePendingIntentFlag(i7);
    }

    public final int immutablePendingIntentFlag(int flags) {
        return flags | 67108864;
    }

    public final int mutablePendingIntentFlag(int flags) {
        return Build.VERSION.SDK_INT >= 31 ? flags | 33554432 : flags;
    }
}
