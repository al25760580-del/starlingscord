package com.facebook.react.runtime.hermes;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/runtime/hermes/HermesInstance;", "Lcom/facebook/react/runtime/JSRuntimeFactory;", "allocInOldGenBeforeTTI", "", "useOccupancyTargetExperiment", "<init>", "(ZZ)V", "(Z)V", "()V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesInstance extends JSRuntimeFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0085 ¨\u0006\t"}, d2 = {"Lcom/facebook/react/runtime/hermes/HermesInstance$Companion;", "", "<init>", "()V", "initHybrid", "Lcom/facebook/jni/HybridData;", "allocInOldGenBeforeTTI", "", "useOccupancyTargetExperiment", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        @NotNull
        public final HybridData initHybrid(boolean allocInOldGenBeforeTTI, boolean useOccupancyTargetExperiment) {
            return HermesInstance.initHybrid(allocInOldGenBeforeTTI, useOccupancyTargetExperiment);
        }

        private Companion() {
        }
    }

    static {
        SoLoader.m("hermesinstancejni");
    }

    public HermesInstance(boolean z5, boolean z6) {
        super(initHybrid(z5, z6));
    }

    @DoNotStrip
    @NotNull
    public static final native HybridData initHybrid(boolean z5, boolean z6);

    public HermesInstance(boolean z5) {
        this(z5, false);
    }

    public HermesInstance() {
        this(false, false);
    }
}
