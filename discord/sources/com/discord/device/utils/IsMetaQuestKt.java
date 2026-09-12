package com.discord.device.utils;

import android.os.Build;
import kotlin.Metadata;
import kotlin.text.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isMetaQuest", "", "device_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IsMetaQuestKt {
    public static final boolean isMetaQuest() {
        return x.i(Build.BRAND, "oculus", true);
    }
}
