package com.facebook.imagepipeline.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DownsampleMode {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DownsampleMode f4828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DownsampleMode f4829e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DownsampleMode f4830i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ DownsampleMode[] f4831v;

    static {
        DownsampleMode downsampleMode = new DownsampleMode("ALWAYS", 0);
        f4828d = downsampleMode;
        DownsampleMode downsampleMode2 = new DownsampleMode("AUTO", 1);
        f4829e = downsampleMode2;
        DownsampleMode downsampleMode3 = new DownsampleMode("NEVER", 2);
        f4830i = downsampleMode3;
        DownsampleMode[] downsampleModeArr = {downsampleMode, downsampleMode2, downsampleMode3};
        f4831v = downsampleModeArr;
        com.facebook.imagepipeline.nativecode.b.l(downsampleModeArr);
    }

    public static DownsampleMode valueOf(String str) {
        return (DownsampleMode) Enum.valueOf(DownsampleMode.class, str);
    }

    public static DownsampleMode[] values() {
        return (DownsampleMode[]) f4831v.clone();
    }
}
