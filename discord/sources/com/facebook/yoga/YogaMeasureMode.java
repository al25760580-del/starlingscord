package com.facebook.yoga;

import kk.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class YogaMeasureMode {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaMeasureMode f5460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final YogaMeasureMode f5461e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final YogaMeasureMode f5462i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ YogaMeasureMode[] f5463v;

    static {
        YogaMeasureMode yogaMeasureMode = new YogaMeasureMode("UNDEFINED", 0);
        f5460d = yogaMeasureMode;
        YogaMeasureMode yogaMeasureMode2 = new YogaMeasureMode("EXACTLY", 1);
        f5461e = yogaMeasureMode2;
        YogaMeasureMode yogaMeasureMode3 = new YogaMeasureMode("AT_MOST", 2);
        f5462i = yogaMeasureMode3;
        f5463v = new YogaMeasureMode[]{yogaMeasureMode, yogaMeasureMode2, yogaMeasureMode3};
    }

    public static YogaMeasureMode a(int i7) {
        if (i7 == 0) {
            return f5460d;
        }
        if (i7 == 1) {
            return f5461e;
        }
        if (i7 == 2) {
            return f5462i;
        }
        throw new IllegalArgumentException(b.h(i7, "Unknown enum value: "));
    }

    public static YogaMeasureMode valueOf(String str) {
        return (YogaMeasureMode) Enum.valueOf(YogaMeasureMode.class, str);
    }

    public static YogaMeasureMode[] values() {
        return (YogaMeasureMode[]) f5463v.clone();
    }
}
