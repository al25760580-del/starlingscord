package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0015\u0016Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/image/ImageLoadEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "eventType", "errorMessage", "", "sourceUri", "width", "height", "loaded", "total", "<init>", "(IIILjava/lang/String;Ljava/lang/String;IIII)V", "getEventName", "getCoalescingKey", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "createEventDataSource", "ImageEventType", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageLoadEvent extends Event<ImageLoadEvent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ON_ERROR = 1;
    public static final int ON_LOAD = 2;
    public static final int ON_LOAD_END = 3;
    public static final int ON_LOAD_START = 4;
    public static final int ON_PROGRESS = 5;
    private final String errorMessage;
    private final int eventType;
    private final int height;
    private final int loaded;
    private final String sourceUri;
    private final int total;
    private final int width;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J*\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J2\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J2\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/views/image/ImageLoadEvent$Companion;", "", "<init>", "()V", "ON_ERROR", "", "ON_LOAD", "ON_LOAD_END", "ON_LOAD_START", "ON_PROGRESS", "createLoadStartEvent", "Lcom/facebook/react/views/image/ImageLoadEvent;", "viewId", "createProgressEvent", "imageUri", "", "loaded", "total", "createLoadEvent", "width", "height", "createErrorEvent", "throwable", "", "createLoadEndEvent", "surfaceId", "eventNameForType", "eventType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        @d
        public final ImageLoadEvent createErrorEvent(int viewId, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return createErrorEvent(-1, viewId, throwable);
        }

        @NotNull
        @d
        public final ImageLoadEvent createLoadEndEvent(int viewId) {
            return createLoadEndEvent(-1, viewId);
        }

        @NotNull
        @d
        public final ImageLoadEvent createLoadEvent(int viewId, String imageUri, int width, int height) {
            return createLoadEvent(-1, viewId, imageUri, width, height);
        }

        @NotNull
        @d
        public final ImageLoadEvent createLoadStartEvent(int viewId) {
            return createLoadStartEvent(-1, viewId);
        }

        @NotNull
        @d
        public final ImageLoadEvent createProgressEvent(int viewId, String imageUri, int loaded, int total) {
            return createProgressEvent(-1, viewId, imageUri, loaded, total);
        }

        @NotNull
        public final String eventNameForType(int eventType) {
            if (eventType == 1) {
                return "topError";
            }
            if (eventType == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (eventType == 3) {
                return "topLoadEnd";
            }
            if (eventType == 4) {
                return "topLoadStart";
            }
            if (eventType == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + eventType).toString());
        }

        private Companion() {
        }

        @NotNull
        public final ImageLoadEvent createErrorEvent(int surfaceId, int viewId, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ImageLoadEvent(surfaceId, viewId, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        @NotNull
        public final ImageLoadEvent createLoadEndEvent(int surfaceId, int viewId) {
            return new ImageLoadEvent(surfaceId, viewId, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        @NotNull
        public final ImageLoadEvent createLoadEvent(int surfaceId, int viewId, String imageUri, int width, int height) {
            return new ImageLoadEvent(surfaceId, viewId, 2, null, imageUri, width, height, 0, 0, null);
        }

        @NotNull
        public final ImageLoadEvent createLoadStartEvent(int surfaceId, int viewId) {
            return new ImageLoadEvent(surfaceId, viewId, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        @NotNull
        public final ImageLoadEvent createProgressEvent(int surfaceId, int viewId, String imageUri, int loaded, int total) {
            return new ImageLoadEvent(surfaceId, viewId, 5, null, imageUri, 0, 0, loaded, total, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/facebook/react/views/image/ImageLoadEvent$ImageEventType;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public @interface ImageEventType {
    }

    public /* synthetic */ ImageLoadEvent(int i7, int i10, int i11, String str, String str2, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, i11, str, str2, i12, i13, i14, i15);
    }

    @NotNull
    public static final ImageLoadEvent createErrorEvent(int i7, int i10, @NotNull Throwable th2) {
        return INSTANCE.createErrorEvent(i7, i10, th2);
    }

    private final WritableMap createEventDataSource() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", this.sourceUri);
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        return writableMapCreateMap;
    }

    @NotNull
    @d
    public static final ImageLoadEvent createLoadEndEvent(int i7) {
        return INSTANCE.createLoadEndEvent(i7);
    }

    @NotNull
    public static final ImageLoadEvent createLoadEvent(int i7, int i10, String str, int i11, int i12) {
        return INSTANCE.createLoadEvent(i7, i10, str, i11, i12);
    }

    @NotNull
    @d
    public static final ImageLoadEvent createLoadStartEvent(int i7) {
        return INSTANCE.createLoadStartEvent(i7);
    }

    @NotNull
    public static final ImageLoadEvent createProgressEvent(int i7, int i10, String str, int i11, int i12) {
        return INSTANCE.createProgressEvent(i7, i10, str, i11, i12);
    }

    @NotNull
    public static final String eventNameForType(int i7) {
        return INSTANCE.eventNameForType(i7);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) this.eventType;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i7 = this.eventType;
        if (i7 == 1) {
            writableMapCreateMap.putString("error", this.errorMessage);
            return writableMapCreateMap;
        }
        if (i7 == 2) {
            writableMapCreateMap.putMap("source", createEventDataSource());
            return writableMapCreateMap;
        }
        if (i7 != 5) {
            return writableMapCreateMap;
        }
        writableMapCreateMap.putInt("loaded", this.loaded);
        writableMapCreateMap.putInt("total", this.total);
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, ((double) this.loaded) / ((double) this.total));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    /* JADX INFO: renamed from: getEventName */
    public String getName() {
        return INSTANCE.eventNameForType(this.eventType);
    }

    public /* synthetic */ ImageLoadEvent(int i7, int i10, int i11, String str, String str2, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i10, i11, (i16 & 8) != 0 ? null : str, (i16 & 16) != 0 ? null : str2, (i16 & 32) != 0 ? 0 : i12, (i16 & 64) != 0 ? 0 : i13, (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0 : i14, (i16 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0 : i15);
    }

    @NotNull
    @d
    public static final ImageLoadEvent createErrorEvent(int i7, @NotNull Throwable th2) {
        return INSTANCE.createErrorEvent(i7, th2);
    }

    @NotNull
    public static final ImageLoadEvent createLoadEndEvent(int i7, int i10) {
        return INSTANCE.createLoadEndEvent(i7, i10);
    }

    @NotNull
    @d
    public static final ImageLoadEvent createLoadEvent(int i7, String str, int i10, int i11) {
        return INSTANCE.createLoadEvent(i7, str, i10, i11);
    }

    @NotNull
    public static final ImageLoadEvent createLoadStartEvent(int i7, int i10) {
        return INSTANCE.createLoadStartEvent(i7, i10);
    }

    @NotNull
    @d
    public static final ImageLoadEvent createProgressEvent(int i7, String str, int i10, int i11) {
        return INSTANCE.createProgressEvent(i7, str, i10, i11);
    }

    private ImageLoadEvent(int i7, int i10, int i11, String str, String str2, int i12, int i13, int i14, int i15) {
        super(i7, i10);
        this.eventType = i11;
        this.errorMessage = str;
        this.sourceUri = str2;
        this.width = i12;
        this.height = i13;
        this.loaded = i14;
        this.total = i15;
    }
}
