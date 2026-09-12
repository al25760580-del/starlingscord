package com.discord.chat.reactevents;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u00014BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00065"}, d2 = {"Lcom/discord/chat/reactevents/TapImageData;", "Lcom/discord/reactevents/ReactEvent;", StackTraceHelper.ID_KEY, "", "index", "", "type", "layout", "Lcom/discord/chat/reactevents/TapImageData$Layout;", "portal", "", "embedIndex", "componentId", "componentMediaIndex", "embedId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getIndex", "()I", "getType", "getLayout", "()Lcom/discord/chat/reactevents/TapImageData$Layout;", "getPortal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEmbedIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getComponentId", "getComponentMediaIndex", "getEmbedId", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Lcom/discord/chat/reactevents/TapImageData$Layout;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapImageData;", "equals", "", "other", "", "hashCode", "toString", "Layout", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapImageData implements ReactEvent {
    private final String componentId;
    private final Integer componentMediaIndex;
    private final String embedId;
    private final Integer embedIndex;

    @NotNull
    private final String id;
    private final int index;

    @NotNull
    private final Layout layout;
    private final Double portal;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/discord/chat/reactevents/TapImageData$Layout;", "", "width", "", "height", "x", "y", ViewProps.RESIZE_MODE, "Lcom/discord/chat/reactevents/ViewResizeMode;", "<init>", "(IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", "getWidth", "()I", "getHeight", "getX", "getY", "getResizeMode", "()Lcom/discord/chat/reactevents/ViewResizeMode;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Layout {
        private final int height;

        @NotNull
        private final ViewResizeMode resizeMode;
        private final int width;
        private final int x;
        private final int y;

        public Layout(int i7, int i10, int i11, int i12, @NotNull ViewResizeMode resizeMode) {
            Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
            this.width = i7;
            this.height = i10;
            this.x = i11;
            this.y = i12;
            this.resizeMode = resizeMode;
        }

        public static /* synthetic */ Layout copy$default(Layout layout, int i7, int i10, int i11, int i12, ViewResizeMode viewResizeMode, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i7 = layout.width;
            }
            if ((i13 & 2) != 0) {
                i10 = layout.height;
            }
            if ((i13 & 4) != 0) {
                i11 = layout.x;
            }
            if ((i13 & 8) != 0) {
                i12 = layout.y;
            }
            if ((i13 & 16) != 0) {
                viewResizeMode = layout.resizeMode;
            }
            ViewResizeMode viewResizeMode2 = viewResizeMode;
            int i14 = i11;
            return layout.copy(i7, i10, i14, i12, viewResizeMode2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getY() {
            return this.y;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ViewResizeMode getResizeMode() {
            return this.resizeMode;
        }

        @NotNull
        public final Layout copy(int width, int height, int x5, int y5, @NotNull ViewResizeMode resizeMode) {
            Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
            return new Layout(width, height, x5, y5, resizeMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Layout)) {
                return false;
            }
            Layout layout = (Layout) other;
            return this.width == layout.width && this.height == layout.height && this.x == layout.x && this.y == layout.y && this.resizeMode == layout.resizeMode;
        }

        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final ViewResizeMode getResizeMode() {
            return this.resizeMode;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return this.resizeMode.hashCode() + a.u(this.y, a.u(this.x, a.u(this.height, Integer.hashCode(this.width) * 31, 31), 31), 31);
        }

        @NotNull
        public final WritableMap serialize() {
            return NativeMapExtensionsKt.nativeMapOf(new Pair("width", Integer.valueOf(this.width)), new Pair("height", Integer.valueOf(this.height)), new Pair("x", Integer.valueOf(this.x)), new Pair("y", Integer.valueOf(this.y)), new Pair(ViewProps.RESIZE_MODE, this.resizeMode.getValue()));
        }

        @NotNull
        public String toString() {
            int i7 = this.width;
            int i10 = this.height;
            int i11 = this.x;
            int i12 = this.y;
            ViewResizeMode viewResizeMode = this.resizeMode;
            StringBuilder sbR = e.r(i7, "Layout(width=", i10, ", height=", ", x=");
            e.z(sbR, i11, ", y=", i12, ", resizeMode=");
            sbR.append(viewResizeMode);
            sbR.append(")");
            return sbR.toString();
        }
    }

    public TapImageData(@NotNull String id2, int i7, @NotNull String type, @NotNull Layout layout, Double d6, Integer num, String str, Integer num2, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.id = id2;
        this.index = i7;
        this.type = type;
        this.layout = layout;
        this.portal = d6;
        this.embedIndex = num;
        this.componentId = str;
        this.componentMediaIndex = num2;
        this.embedId = str2;
    }

    public static /* synthetic */ TapImageData copy$default(TapImageData tapImageData, String str, int i7, String str2, Layout layout, Double d6, Integer num, String str3, Integer num2, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapImageData.id;
        }
        if ((i10 & 2) != 0) {
            i7 = tapImageData.index;
        }
        if ((i10 & 4) != 0) {
            str2 = tapImageData.type;
        }
        if ((i10 & 8) != 0) {
            layout = tapImageData.layout;
        }
        if ((i10 & 16) != 0) {
            d6 = tapImageData.portal;
        }
        if ((i10 & 32) != 0) {
            num = tapImageData.embedIndex;
        }
        if ((i10 & 64) != 0) {
            str3 = tapImageData.componentId;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            num2 = tapImageData.componentMediaIndex;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str4 = tapImageData.embedId;
        }
        Integer num3 = num2;
        String str5 = str4;
        Integer num4 = num;
        String str6 = str3;
        Double d7 = d6;
        String str7 = str2;
        return tapImageData.copy(str, i7, str7, layout, d7, num4, str6, num3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getPortal() {
        return this.portal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getEmbedIndex() {
        return this.embedIndex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getComponentId() {
        return this.componentId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getComponentMediaIndex() {
        return this.componentMediaIndex;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmbedId() {
        return this.embedId;
    }

    @NotNull
    public final TapImageData copy(@NotNull String id2, int index, @NotNull String type, @NotNull Layout layout, Double portal, Integer embedIndex, String componentId, Integer componentMediaIndex, String embedId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new TapImageData(id2, index, type, layout, portal, embedIndex, componentId, componentMediaIndex, embedId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapImageData)) {
            return false;
        }
        TapImageData tapImageData = (TapImageData) other;
        return Intrinsics.areEqual(this.id, tapImageData.id) && this.index == tapImageData.index && Intrinsics.areEqual(this.type, tapImageData.type) && Intrinsics.areEqual(this.layout, tapImageData.layout) && Intrinsics.areEqual((Object) this.portal, (Object) tapImageData.portal) && Intrinsics.areEqual(this.embedIndex, tapImageData.embedIndex) && Intrinsics.areEqual(this.componentId, tapImageData.componentId) && Intrinsics.areEqual(this.componentMediaIndex, tapImageData.componentMediaIndex) && Intrinsics.areEqual(this.embedId, tapImageData.embedId);
    }

    public final String getComponentId() {
        return this.componentId;
    }

    public final Integer getComponentMediaIndex() {
        return this.componentMediaIndex;
    }

    public final String getEmbedId() {
        return this.embedId;
    }

    public final Integer getEmbedIndex() {
        return this.embedIndex;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final Double getPortal() {
        return this.portal;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.layout.hashCode() + e.d(a.u(this.index, this.id.hashCode() * 31, 31), 31, this.type)) * 31;
        Double d6 = this.portal;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        Integer num = this.embedIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.componentId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.componentMediaIndex;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.embedId;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair(StackTraceHelper.ID_KEY, this.id), new Pair("index", Integer.valueOf(this.index)), new Pair("type", this.type), new Pair("layout", this.layout.serialize()), new Pair("portal", this.portal), new Pair("embedIndex", this.embedIndex), new Pair("componentId", this.componentId), new Pair("componentMediaIndex", this.componentMediaIndex), new Pair("embedId", this.embedId));
    }

    @NotNull
    public String toString() {
        String str = this.id;
        int i7 = this.index;
        String str2 = this.type;
        Layout layout = this.layout;
        Double d6 = this.portal;
        Integer num = this.embedIndex;
        String str3 = this.componentId;
        Integer num2 = this.componentMediaIndex;
        String str4 = this.embedId;
        StringBuilder sbT = e.t("TapImageData(id=", str, ", index=", i7, ", type=");
        sbT.append(str2);
        sbT.append(", layout=");
        sbT.append(layout);
        sbT.append(", portal=");
        sbT.append(d6);
        sbT.append(", embedIndex=");
        sbT.append(num);
        sbT.append(", componentId=");
        a.r(num2, str3, ", componentMediaIndex=", ", embedId=", sbT);
        return a.k(sbT, str4, ")");
    }
}
