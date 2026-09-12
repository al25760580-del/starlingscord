package com.discord.fastest_list.android.placeholder;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.a;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", "", "<init>", "()V", "None", "Shape", "FeedItem", "Companion", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$FeedItem;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$None;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FastestListPlaceholderType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Companion;", "", "<init>", "()V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J½\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010C\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006I"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$FeedItem;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", ViewProps.BACKGROUND_COLOR, "", "borderRadius", "", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomLeftRadius", "borderBottomRightRadius", ViewProps.COLOR, "divider", "", "dividerColor", "dividerPaddingLeft", "dividerPaddingRight", ViewProps.PADDING, "shapeType", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;", "shapeSize", "labelPadding", "labelPaddingInnerRatio", "labelSize", "labelSecondarySize", "<init>", "(IFFFFFIZIFFFLcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;FFFFF)V", "getBackgroundColor", "()I", "getBorderRadius", "()F", "getBorderTopLeftRadius", "getBorderTopRightRadius", "getBorderBottomLeftRadius", "getBorderBottomRightRadius", "getColor", "getDivider", "()Z", "getDividerColor", "getDividerPaddingLeft", "getDividerPaddingRight", "getPadding", "getShapeType", "()Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;", "getShapeSize", "getLabelPadding", "getLabelPaddingInnerRatio", "getLabelSize", "getLabelSecondarySize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "", "hashCode", "toString", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FeedItem extends FastestListPlaceholderType {
        private final int backgroundColor;
        private final float borderBottomLeftRadius;
        private final float borderBottomRightRadius;
        private final float borderRadius;
        private final float borderTopLeftRadius;
        private final float borderTopRightRadius;
        private final int color;
        private final boolean divider;
        private final int dividerColor;
        private final float dividerPaddingLeft;
        private final float dividerPaddingRight;
        private final float labelPadding;
        private final float labelPaddingInnerRatio;
        private final float labelSecondarySize;
        private final float labelSize;
        private final float padding;
        private final float shapeSize;

        @NotNull
        private final Shape.Type shapeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedItem(int i7, float f2, float f7, float f10, float f11, float f12, int i10, boolean z5, int i11, float f13, float f14, float f15, @NotNull Shape.Type shapeType, float f16, float f17, float f18, float f19, float f20) {
            super(null);
            Intrinsics.checkNotNullParameter(shapeType, "shapeType");
            this.backgroundColor = i7;
            this.borderRadius = f2;
            this.borderTopLeftRadius = f7;
            this.borderTopRightRadius = f10;
            this.borderBottomLeftRadius = f11;
            this.borderBottomRightRadius = f12;
            this.color = i10;
            this.divider = z5;
            this.dividerColor = i11;
            this.dividerPaddingLeft = f13;
            this.dividerPaddingRight = f14;
            this.padding = f15;
            this.shapeType = shapeType;
            this.shapeSize = f16;
            this.labelPadding = f17;
            this.labelPaddingInnerRatio = f18;
            this.labelSize = f19;
            this.labelSecondarySize = f20;
        }

        public static /* synthetic */ FeedItem copy$default(FeedItem feedItem, int i7, float f2, float f7, float f10, float f11, float f12, int i10, boolean z5, int i11, float f13, float f14, float f15, Shape.Type type, float f16, float f17, float f18, float f19, float f20, int i12, Object obj) {
            float f21;
            float f22;
            int i13 = (i12 & 1) != 0 ? feedItem.backgroundColor : i7;
            float f23 = (i12 & 2) != 0 ? feedItem.borderRadius : f2;
            float f24 = (i12 & 4) != 0 ? feedItem.borderTopLeftRadius : f7;
            float f25 = (i12 & 8) != 0 ? feedItem.borderTopRightRadius : f10;
            float f26 = (i12 & 16) != 0 ? feedItem.borderBottomLeftRadius : f11;
            float f27 = (i12 & 32) != 0 ? feedItem.borderBottomRightRadius : f12;
            int i14 = (i12 & 64) != 0 ? feedItem.color : i10;
            boolean z6 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? feedItem.divider : z5;
            int i15 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? feedItem.dividerColor : i11;
            float f28 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? feedItem.dividerPaddingLeft : f13;
            float f29 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? feedItem.dividerPaddingRight : f14;
            float f30 = (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? feedItem.padding : f15;
            Shape.Type type2 = (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? feedItem.shapeType : type;
            float f31 = (i12 & 8192) != 0 ? feedItem.shapeSize : f16;
            int i16 = i13;
            float f32 = (i12 & 16384) != 0 ? feedItem.labelPadding : f17;
            float f33 = (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? feedItem.labelPaddingInnerRatio : f18;
            float f34 = (i12 & 65536) != 0 ? feedItem.labelSize : f19;
            if ((i12 & 131072) != 0) {
                f22 = f34;
                f21 = feedItem.labelSecondarySize;
            } else {
                f21 = f20;
                f22 = f34;
            }
            return feedItem.copy(i16, f23, f24, f25, f26, f27, i14, z6, i15, f28, f29, f30, type2, f31, f32, f33, f22, f21);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final float getDividerPaddingLeft() {
            return this.dividerPaddingLeft;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final float getDividerPaddingRight() {
            return this.dividerPaddingRight;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getPadding() {
            return this.padding;
        }

        @NotNull
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Shape.Type getShapeType() {
            return this.shapeType;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final float getShapeSize() {
            return this.shapeSize;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final float getLabelPadding() {
            return this.labelPadding;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final float getLabelPaddingInnerRatio() {
            return this.labelPaddingInnerRatio;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final float getLabelSize() {
            return this.labelSize;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final float getLabelSecondarySize() {
            return this.labelSecondarySize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getBorderRadius() {
            return this.borderRadius;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getBorderTopLeftRadius() {
            return this.borderTopLeftRadius;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBorderTopRightRadius() {
            return this.borderTopRightRadius;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getBorderBottomLeftRadius() {
            return this.borderBottomLeftRadius;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getBorderBottomRightRadius() {
            return this.borderBottomRightRadius;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getDivider() {
            return this.divider;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final int getDividerColor() {
            return this.dividerColor;
        }

        @NotNull
        public final FeedItem copy(int backgroundColor, float borderRadius, float borderTopLeftRadius, float borderTopRightRadius, float borderBottomLeftRadius, float borderBottomRightRadius, int color, boolean divider, int dividerColor, float dividerPaddingLeft, float dividerPaddingRight, float padding, @NotNull Shape.Type shapeType, float shapeSize, float labelPadding, float labelPaddingInnerRatio, float labelSize, float labelSecondarySize) {
            Intrinsics.checkNotNullParameter(shapeType, "shapeType");
            return new FeedItem(backgroundColor, borderRadius, borderTopLeftRadius, borderTopRightRadius, borderBottomLeftRadius, borderBottomRightRadius, color, divider, dividerColor, dividerPaddingLeft, dividerPaddingRight, padding, shapeType, shapeSize, labelPadding, labelPaddingInnerRatio, labelSize, labelSecondarySize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedItem)) {
                return false;
            }
            FeedItem feedItem = (FeedItem) other;
            return this.backgroundColor == feedItem.backgroundColor && Float.compare(this.borderRadius, feedItem.borderRadius) == 0 && Float.compare(this.borderTopLeftRadius, feedItem.borderTopLeftRadius) == 0 && Float.compare(this.borderTopRightRadius, feedItem.borderTopRightRadius) == 0 && Float.compare(this.borderBottomLeftRadius, feedItem.borderBottomLeftRadius) == 0 && Float.compare(this.borderBottomRightRadius, feedItem.borderBottomRightRadius) == 0 && this.color == feedItem.color && this.divider == feedItem.divider && this.dividerColor == feedItem.dividerColor && Float.compare(this.dividerPaddingLeft, feedItem.dividerPaddingLeft) == 0 && Float.compare(this.dividerPaddingRight, feedItem.dividerPaddingRight) == 0 && Float.compare(this.padding, feedItem.padding) == 0 && this.shapeType == feedItem.shapeType && Float.compare(this.shapeSize, feedItem.shapeSize) == 0 && Float.compare(this.labelPadding, feedItem.labelPadding) == 0 && Float.compare(this.labelPaddingInnerRatio, feedItem.labelPaddingInnerRatio) == 0 && Float.compare(this.labelSize, feedItem.labelSize) == 0 && Float.compare(this.labelSecondarySize, feedItem.labelSecondarySize) == 0;
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final float getBorderBottomLeftRadius() {
            return this.borderBottomLeftRadius;
        }

        public final float getBorderBottomRightRadius() {
            return this.borderBottomRightRadius;
        }

        public final float getBorderRadius() {
            return this.borderRadius;
        }

        public final float getBorderTopLeftRadius() {
            return this.borderTopLeftRadius;
        }

        public final float getBorderTopRightRadius() {
            return this.borderTopRightRadius;
        }

        public final int getColor() {
            return this.color;
        }

        public final boolean getDivider() {
            return this.divider;
        }

        public final int getDividerColor() {
            return this.dividerColor;
        }

        public final float getDividerPaddingLeft() {
            return this.dividerPaddingLeft;
        }

        public final float getDividerPaddingRight() {
            return this.dividerPaddingRight;
        }

        public final float getLabelPadding() {
            return this.labelPadding;
        }

        public final float getLabelPaddingInnerRatio() {
            return this.labelPaddingInnerRatio;
        }

        public final float getLabelSecondarySize() {
            return this.labelSecondarySize;
        }

        public final float getLabelSize() {
            return this.labelSize;
        }

        public final float getPadding() {
            return this.padding;
        }

        public final float getShapeSize() {
            return this.shapeSize;
        }

        @NotNull
        public final Shape.Type getShapeType() {
            return this.shapeType;
        }

        public int hashCode() {
            return Float.hashCode(this.labelSecondarySize) + e.a(e.a(e.a(e.a((this.shapeType.hashCode() + e.a(e.a(e.a(a.u(this.dividerColor, a.g(a.u(this.color, e.a(e.a(e.a(e.a(e.a(Integer.hashCode(this.backgroundColor) * 31, 31, this.borderRadius), 31, this.borderTopLeftRadius), 31, this.borderTopRightRadius), 31, this.borderBottomLeftRadius), 31, this.borderBottomRightRadius), 31), 31, this.divider), 31), 31, this.dividerPaddingLeft), 31, this.dividerPaddingRight), 31, this.padding)) * 31, 31, this.shapeSize), 31, this.labelPadding), 31, this.labelPaddingInnerRatio), 31, this.labelSize);
        }

        @NotNull
        public String toString() {
            return "FeedItem(backgroundColor=" + this.backgroundColor + ", borderRadius=" + this.borderRadius + ", borderTopLeftRadius=" + this.borderTopLeftRadius + ", borderTopRightRadius=" + this.borderTopRightRadius + ", borderBottomLeftRadius=" + this.borderBottomLeftRadius + ", borderBottomRightRadius=" + this.borderBottomRightRadius + ", color=" + this.color + ", divider=" + this.divider + ", dividerColor=" + this.dividerColor + ", dividerPaddingLeft=" + this.dividerPaddingLeft + ", dividerPaddingRight=" + this.dividerPaddingRight + ", padding=" + this.padding + ", shapeType=" + this.shapeType + ", shapeSize=" + this.shapeSize + ", labelPadding=" + this.labelPadding + ", labelPaddingInnerRatio=" + this.labelPaddingInnerRatio + ", labelSize=" + this.labelSize + ", labelSecondarySize=" + this.labelSecondarySize + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$None;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends FastestListPlaceholderType {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 1223619387;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001:Bq\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u0080\u0001\u00101\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006;"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", "borderRadius", "", ViewProps.COLOR, "", "count", ViewProps.GAP, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_VERTICAL, "width", "height", "type", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;", "verticalAlignment", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical;", "horizontalAlignment", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal;", "<init>", "(FIIFFFLjava/lang/Float;Ljava/lang/Float;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal;)V", "getBorderRadius", "()F", "getColor", "()I", "getCount", "getGap", "getPaddingHorizontal", "getPaddingVertical", "getWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeight", "getType", "()Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;", "getVerticalAlignment", "()Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical;", "getHorizontalAlignment", "()Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(FIIFFFLjava/lang/Float;Ljava/lang/Float;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Vertical;Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderAlignment$Horizontal;)Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape;", "equals", "", "other", "", "hashCode", "toString", "", "Type", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Shape extends FastestListPlaceholderType {
        private final float borderRadius;
        private final int color;
        private final int count;
        private final float gap;
        private final Float height;

        @NotNull
        private final FastestListPlaceholderAlignment.Horizontal horizontalAlignment;
        private final float paddingHorizontal;
        private final float paddingVertical;

        @NotNull
        private final Type type;

        @NotNull
        private final FastestListPlaceholderAlignment.Vertical verticalAlignment;
        private final Float width;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "RECT", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum Type {
            CIRCLE,
            RECT;

            private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$Shape$Type$Companion;", "", "<init>", "()V", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Shape(float f2, int i7, int i10, float f7, float f10, float f11, Float f12, Float f13, @NotNull Type type, @NotNull FastestListPlaceholderAlignment.Vertical verticalAlignment, @NotNull FastestListPlaceholderAlignment.Horizontal horizontalAlignment) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
            Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
            this.borderRadius = f2;
            this.color = i7;
            this.count = i10;
            this.gap = f7;
            this.paddingHorizontal = f10;
            this.paddingVertical = f11;
            this.width = f12;
            this.height = f13;
            this.type = type;
            this.verticalAlignment = verticalAlignment;
            this.horizontalAlignment = horizontalAlignment;
        }

        public static /* synthetic */ Shape copy$default(Shape shape, float f2, int i7, int i10, float f7, float f10, float f11, Float f12, Float f13, Type type, FastestListPlaceholderAlignment.Vertical vertical, FastestListPlaceholderAlignment.Horizontal horizontal, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f2 = shape.borderRadius;
            }
            if ((i11 & 2) != 0) {
                i7 = shape.color;
            }
            if ((i11 & 4) != 0) {
                i10 = shape.count;
            }
            if ((i11 & 8) != 0) {
                f7 = shape.gap;
            }
            if ((i11 & 16) != 0) {
                f10 = shape.paddingHorizontal;
            }
            if ((i11 & 32) != 0) {
                f11 = shape.paddingVertical;
            }
            if ((i11 & 64) != 0) {
                f12 = shape.width;
            }
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                f13 = shape.height;
            }
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                type = shape.type;
            }
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                vertical = shape.verticalAlignment;
            }
            if ((i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                horizontal = shape.horizontalAlignment;
            }
            FastestListPlaceholderAlignment.Vertical vertical2 = vertical;
            FastestListPlaceholderAlignment.Horizontal horizontal2 = horizontal;
            Float f14 = f13;
            Type type2 = type;
            float f15 = f11;
            Float f16 = f12;
            float f17 = f10;
            int i12 = i10;
            return shape.copy(f2, i7, i12, f7, f17, f15, f16, f14, type2, vertical2, horizontal2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getBorderRadius() {
            return this.borderRadius;
        }

        @NotNull
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final FastestListPlaceholderAlignment.Vertical getVerticalAlignment() {
            return this.verticalAlignment;
        }

        @NotNull
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final FastestListPlaceholderAlignment.Horizontal getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getGap() {
            return this.gap;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getPaddingHorizontal() {
            return this.paddingHorizontal;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getPaddingVertical() {
            return this.paddingVertical;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Float getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Float getHeight() {
            return this.height;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @NotNull
        public final Shape copy(float borderRadius, int color, int count, float gap, float paddingHorizontal, float paddingVertical, Float width, Float height, @NotNull Type type, @NotNull FastestListPlaceholderAlignment.Vertical verticalAlignment, @NotNull FastestListPlaceholderAlignment.Horizontal horizontalAlignment) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
            Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
            return new Shape(borderRadius, color, count, gap, paddingHorizontal, paddingVertical, width, height, type, verticalAlignment, horizontalAlignment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shape)) {
                return false;
            }
            Shape shape = (Shape) other;
            return Float.compare(this.borderRadius, shape.borderRadius) == 0 && this.color == shape.color && this.count == shape.count && Float.compare(this.gap, shape.gap) == 0 && Float.compare(this.paddingHorizontal, shape.paddingHorizontal) == 0 && Float.compare(this.paddingVertical, shape.paddingVertical) == 0 && Intrinsics.areEqual((Object) this.width, (Object) shape.width) && Intrinsics.areEqual((Object) this.height, (Object) shape.height) && this.type == shape.type && this.verticalAlignment == shape.verticalAlignment && this.horizontalAlignment == shape.horizontalAlignment;
        }

        public final float getBorderRadius() {
            return this.borderRadius;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getCount() {
            return this.count;
        }

        public final float getGap() {
            return this.gap;
        }

        public final Float getHeight() {
            return this.height;
        }

        @NotNull
        public final FastestListPlaceholderAlignment.Horizontal getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        public final float getPaddingHorizontal() {
            return this.paddingHorizontal;
        }

        public final float getPaddingVertical() {
            return this.paddingVertical;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        @NotNull
        public final FastestListPlaceholderAlignment.Vertical getVerticalAlignment() {
            return this.verticalAlignment;
        }

        public final Float getWidth() {
            return this.width;
        }

        public int hashCode() {
            int iA = e.a(e.a(e.a(a.u(this.count, a.u(this.color, Float.hashCode(this.borderRadius) * 31, 31), 31), 31, this.gap), 31, this.paddingHorizontal), 31, this.paddingVertical);
            Float f2 = this.width;
            int iHashCode = (iA + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f7 = this.height;
            return this.horizontalAlignment.hashCode() + ((this.verticalAlignment.hashCode() + ((this.type.hashCode() + ((iHashCode + (f7 != null ? f7.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Shape(borderRadius=" + this.borderRadius + ", color=" + this.color + ", count=" + this.count + ", gap=" + this.gap + ", paddingHorizontal=" + this.paddingHorizontal + ", paddingVertical=" + this.paddingVertical + ", width=" + this.width + ", height=" + this.height + ", type=" + this.type + ", verticalAlignment=" + this.verticalAlignment + ", horizontalAlignment=" + this.horizontalAlignment + ")";
        }
    }

    public /* synthetic */ FastestListPlaceholderType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FastestListPlaceholderType() {
    }
}
