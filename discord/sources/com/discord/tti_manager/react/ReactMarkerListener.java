package com.discord.tti_manager.react;

import com.discord.chat.presentation.list.a;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import io.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\"\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0016R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/discord/tti_manager/react/ReactMarkerListener;", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "<init>", "()V", "<set-?>", "", "bundleStartedTimestamp", "getBundleStartedTimestamp", "()J", "setBundleStartedTimestamp", "(J)V", "bundleStartedTimestamp$delegate", "Lkotlin/properties/ReadWriteProperty;", "bundleLoadedTimestamp", "getBundleLoadedTimestamp", "setBundleLoadedTimestamp", "bundleLoadedTimestamp$delegate", "bundleParsedTimestamp", "getBundleParsedTimestamp", "setBundleParsedTimestamp", "bundleParsedTimestamp$delegate", "stopped", "", "getStopped", "()Z", "setStopped", "(Z)V", ViewProps.START, "", "stop", "logMarker", StackTraceHelper.NAME_KEY, "Lcom/facebook/react/bridge/ReactMarkerConstants;", "tag", "", "instanceKey", "", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactMarkerListener implements ReactMarker.MarkerListener {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {a.p(ReactMarkerListener.class, "bundleStartedTimestamp", "getBundleStartedTimestamp()J", 0), a.p(ReactMarkerListener.class, "bundleLoadedTimestamp", "getBundleLoadedTimestamp()J", 0), a.p(ReactMarkerListener.class, "bundleParsedTimestamp", "getBundleParsedTimestamp()J", 0)};

    @NotNull
    public static final ReactMarkerListener INSTANCE = new ReactMarkerListener();

    /* JADX INFO: renamed from: bundleLoadedTimestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty bundleLoadedTimestamp;

    /* JADX INFO: renamed from: bundleParsedTimestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty bundleParsedTimestamp;

    /* JADX INFO: renamed from: bundleStartedTimestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty bundleStartedTimestamp;
    private static boolean stopped;

    static {
        io.a.f12002a.getClass();
        bundleStartedTimestamp = new b();
        bundleLoadedTimestamp = new b();
        bundleParsedTimestamp = new b();
        stopped = true;
    }

    private ReactMarkerListener() {
    }

    public final long getBundleLoadedTimestamp() {
        return ((Number) bundleLoadedTimestamp.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getBundleParsedTimestamp() {
        return ((Number) bundleParsedTimestamp.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final long getBundleStartedTimestamp() {
        return ((Number) bundleStartedTimestamp.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final boolean getStopped() {
        return stopped;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
    public void logMarker(@NotNull ReactMarkerConstants name, String tag, int instanceKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strName = name.name();
        TTIMetrics.INSTANCE.record(strName, jCurrentTimeMillis, tag, true);
        switch (strName.hashCode()) {
            case -1775741598:
                if (!strName.equals("REACT_BRIDGELESS_LOADING_START")) {
                    return;
                }
                break;
            case -1048597525:
                if (!strName.equals("PRE_RUN_JS_BUNDLE_START")) {
                    return;
                }
                break;
            case -351240678:
                if (strName.equals("CONTENT_APPEARED")) {
                    stop();
                    return;
                }
                return;
            case 241900896:
                if (strName.equals("RUN_JS_BUNDLE_END")) {
                    setBundleParsedTimestamp(jCurrentTimeMillis);
                    return;
                }
                return;
            case 551634855:
                if (strName.equals("RUN_JS_BUNDLE_START")) {
                    setBundleLoadedTimestamp(jCurrentTimeMillis);
                    return;
                }
                return;
            default:
                return;
        }
        setBundleStartedTimestamp(jCurrentTimeMillis);
        setBundleLoadedTimestamp(jCurrentTimeMillis);
        setBundleParsedTimestamp(jCurrentTimeMillis);
    }

    public final void setBundleLoadedTimestamp(long j) {
        bundleLoadedTimestamp.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setBundleParsedTimestamp(long j) {
        bundleParsedTimestamp.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setBundleStartedTimestamp(long j) {
        bundleStartedTimestamp.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setStopped(boolean z5) {
        stopped = z5;
    }

    public final void start() {
        if (stopped) {
            ReactMarker.addListener(this);
            stopped = false;
        }
    }

    public final void stop() {
        if (stopped) {
            return;
        }
        ReactMarker.removeListener(this);
        stopped = true;
    }
}
