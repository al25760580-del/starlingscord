package com.facebook.hermes.instrumentation;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/hermes/instrumentation/HermesSamplingProfiler;", "", "", "enable", "()V", "disable", "", "filename", "dumpSampledTraceToFile", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HermesSamplingProfiler {
    static {
        SoLoader.m("jsijniprofiler");
    }

    public static final native void disable();

    public static final native void dumpSampledTraceToFile(@NotNull String filename);

    public static final native void enable();
}
