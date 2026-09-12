package com.discord.analytics.touch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MAX_STRING_LEN", "", "truncate", "", "value", "maxLen", "analytics_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TouchEventAnalyticsModuleKt {
    private static final int MAX_STRING_LEN = 4096;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncate(String str, int i7) {
        if (str == null) {
            return "";
        }
        if (str.length() <= i7) {
            return str;
        }
        String strSubstring = str.substring(0, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
