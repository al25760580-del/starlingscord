package com.discord.media.engine.video.events;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BU\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/media/engine/video/events/DeviceChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "inputDevices", "", "", "", "", "outputDevices", "videoInputDevices", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "media_engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceChangedEvent implements ReactEvent {

    @NotNull
    private final List<Map<String, Object>> inputDevices;

    @NotNull
    private final List<Map<String, Object>> outputDevices;

    @NotNull
    private final List<Map<String, Object>> videoInputDevices;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceChangedEvent(@NotNull List<? extends Map<String, ? extends Object>> inputDevices, @NotNull List<? extends Map<String, ? extends Object>> outputDevices, @NotNull List<? extends Map<String, ? extends Object>> videoInputDevices) {
        Intrinsics.checkNotNullParameter(inputDevices, "inputDevices");
        Intrinsics.checkNotNullParameter(outputDevices, "outputDevices");
        Intrinsics.checkNotNullParameter(videoInputDevices, "videoInputDevices");
        this.inputDevices = inputDevices;
        this.outputDevices = outputDevices;
        this.videoInputDevices = videoInputDevices;
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableNativeMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("inputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.inputDevices)), new Pair("outputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.outputDevices)), new Pair("videoInputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.videoInputDevices)));
    }
}
