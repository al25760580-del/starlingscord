package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0017R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/animated/EventAnimationDriver;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "eventName", "", "viewTag", "", "eventPath", "", "valueNode", "Lcom/facebook/react/animated/ValueAnimatedNode;", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/facebook/react/animated/ValueAnimatedNode;)V", "receiveEvent", "", "surfaceId", "targetTag", "canCoalesceEvent", "", "customCoalesceKey", "params", "Lcom/facebook/react/bridge/WritableMap;", "category", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEventAnimationDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventAnimationDriver.kt\ncom/facebook/react/animated/EventAnimationDriver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class EventAnimationDriver implements RCTModernEventEmitter {

    @NotNull
    public String eventName;

    @NotNull
    private final List<String> eventPath;

    @NotNull
    public ValueAnimatedNode valueNode;
    public int viewTag;

    public EventAnimationDriver(@NotNull String eventName, int i7, @NotNull List<String> eventPath, @NotNull ValueAnimatedNode valueNode) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventPath, "eventPath");
        Intrinsics.checkNotNullParameter(valueNode, "valueNode");
        this.eventName = eventName;
        this.viewTag = i7;
        this.eventPath = eventPath;
        this.valueNode = valueNode;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    @d
    public void receiveEvent(int surfaceId, int targetTag, @NotNull String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap params, int category) {
        ReadableMap readableMap;
        ReadableType type;
        ReadableMap map;
        ReadableMap readableMap2;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (params == null) {
            throw new IllegalArgumentException("Native animated events must have event data.");
        }
        int size = this.eventPath.size() - 1;
        int i7 = 0;
        ReadableArray array = null;
        while (i7 < size) {
            if (readableMap != null) {
                String str = this.eventPath.get(i7);
                ReadableType type2 = readableMap.getType(str);
                if (type2 == ReadableType.Map) {
                    readableMap = params;
                    map = readableMap.getMap(str);
                    readableMap2 = map;
                    array = null;
                } else {
                    if (type2 != ReadableType.Array) {
                        readableMap = params;
                        throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for key '" + str + "'");
                    }
                    readableMap = params;
                    array = readableMap.getArray(str);
                    readableMap2 = null;
                }
            } else {
                int i10 = Integer.parseInt(this.eventPath.get(i7));
                if (array != null) {
                    readableMap = params;
                    type = array.getType(i10);
                } else {
                    readableMap = params;
                    type = null;
                }
                if (type == ReadableType.Map) {
                    map = array.getMap(i10);
                    readableMap2 = map;
                    array = null;
                } else {
                    if (type != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type + " for index '" + i10 + "'");
                    }
                    array = array.getArray(i10);
                    readableMap2 = null;
                }
            }
            i7++;
            readableMap = readableMap2;
        }
        readableMap = params;
        String str2 = (String) b.f(1, this.eventPath);
        if (readableMap != null) {
            this.valueNode.nodeValue = readableMap.getDouble(str2);
            return;
        }
        this.valueNode.nodeValue = array != null ? array.getDouble(Integer.parseInt(str2)) : 0.0d;
    }
}
