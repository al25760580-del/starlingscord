package com.facebook.yoga;

import kk.b;
import nb.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@a
public final class YogaLogLevel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final YogaLogLevel f5453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final YogaLogLevel f5454e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final YogaLogLevel f5455i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final YogaLogLevel f5456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final YogaLogLevel f5457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final YogaLogLevel f5458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ YogaLogLevel[] f5459y;

    static {
        YogaLogLevel yogaLogLevel = new YogaLogLevel("ERROR", 0);
        f5453d = yogaLogLevel;
        YogaLogLevel yogaLogLevel2 = new YogaLogLevel("WARN", 1);
        f5454e = yogaLogLevel2;
        YogaLogLevel yogaLogLevel3 = new YogaLogLevel("INFO", 2);
        f5455i = yogaLogLevel3;
        YogaLogLevel yogaLogLevel4 = new YogaLogLevel("DEBUG", 3);
        f5456v = yogaLogLevel4;
        YogaLogLevel yogaLogLevel5 = new YogaLogLevel("VERBOSE", 4);
        f5457w = yogaLogLevel5;
        YogaLogLevel yogaLogLevel6 = new YogaLogLevel("FATAL", 5);
        f5458x = yogaLogLevel6;
        f5459y = new YogaLogLevel[]{yogaLogLevel, yogaLogLevel2, yogaLogLevel3, yogaLogLevel4, yogaLogLevel5, yogaLogLevel6};
    }

    @a
    public static YogaLogLevel fromInt(int i7) {
        if (i7 == 0) {
            return f5453d;
        }
        if (i7 == 1) {
            return f5454e;
        }
        if (i7 == 2) {
            return f5455i;
        }
        if (i7 == 3) {
            return f5456v;
        }
        if (i7 == 4) {
            return f5457w;
        }
        if (i7 == 5) {
            return f5458x;
        }
        throw new IllegalArgumentException(b.h(i7, "Unknown enum value: "));
    }

    public static YogaLogLevel valueOf(String str) {
        return (YogaLogLevel) Enum.valueOf(YogaLogLevel.class, str);
    }

    public static YogaLogLevel[] values() {
        return (YogaLogLevel[]) f5459y.clone();
    }
}
