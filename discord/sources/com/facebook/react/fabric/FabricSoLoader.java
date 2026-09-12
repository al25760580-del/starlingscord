package com.facebook.react.fabric;

import android.os.Trace;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/react/fabric/FabricSoLoader;", "", "<init>", "()V", "didInit", "", "staticInit", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FabricSoLoader {

    @NotNull
    public static final FabricSoLoader INSTANCE = new FabricSoLoader();
    private static volatile boolean didInit;

    private FabricSoLoader() {
    }

    public static final void staticInit() {
        if (didInit) {
            return;
        }
        Intrinsics.checkNotNullParameter("FabricSoLoader", "sectionName");
        Trace.beginSection(c0.Q("FabricSoLoader"));
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.m("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        Trace.endSection();
        didInit = true;
    }
}
