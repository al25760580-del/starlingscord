package com.discord.fastest_list.android.placeholder;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.discord.fastest_list.android.FastestListSections;
import com.discord.misc.utilities.drawable.CustomDrawDrawable;
import com.discord.misc.utilities.size.SizeUtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import jo.d;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder;", "config", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$FeedItem;", "<init>", "(Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$FeedItem;)V", "placeholders", "", "", "Lcom/discord/misc/utilities/drawable/CustomDrawDrawable;", "onPlaceholderShouldBind", "", "view", "Landroid/view/ViewGroup;", "item", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "onPlaceholderShouldUnbind", "FeedItemDrawable", "Companion", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFastestListPlaceholderTypeFeedItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListPlaceholderTypeFeedItem.kt\ncom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,167:1\n384#2,7:168\n*S KotlinDebug\n*F\n+ 1 FastestListPlaceholderTypeFeedItem.kt\ncom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem\n*L\n22#1:168,7\n*E\n"})
public final class FastestListPlaceholderTypeFeedItem extends FastestListPlaceholder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int TOTAL_VARIANTS = 20;
    private static final float WIDTH_RATIO_MAX = 0.9f;
    private static final float WIDTH_RATIO_MIN = 0.4f;

    @NotNull
    private final FastestListPlaceholderType.FeedItem config;

    @NotNull
    private final Map<Integer, CustomDrawDrawable> placeholders;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem$Companion;", "", "<init>", "()V", "TOTAL_VARIANTS", "", "WIDTH_RATIO_MIN", "", "WIDTH_RATIO_MAX", "getRandomWidthRatio", "ratioMin", "ratioMax", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float getRandomWidthRatio(float ratioMin, float ratioMax) {
            d.f13988d.getClass();
            return b.c(ratioMax, ratioMin, d.f13989e.d().nextFloat(), ratioMin);
        }

        public static /* synthetic */ float getRandomWidthRatio$default(Companion companion, float f2, float f7, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                f2 = FastestListPlaceholderTypeFeedItem.WIDTH_RATIO_MIN;
            }
            if ((i7 & 2) != 0) {
                f7 = FastestListPlaceholderTypeFeedItem.WIDTH_RATIO_MAX;
            }
            return companion.getRandomWidthRatio(f2, f7);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem$FeedItemDrawable;", "Lcom/discord/misc/utilities/drawable/CustomDrawDrawable;", "config", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$FeedItem;", "labelWidthRatio", "", "labelWidthRatioSecondary", "<init>", "(Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType$FeedItem;FF)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "pathRect", "Landroid/graphics/RectF;", "pathCornerRadii", "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFastestListPlaceholderTypeFeedItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListPlaceholderTypeFeedItem.kt\ncom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem$FeedItemDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
    public static final class FeedItemDrawable extends CustomDrawDrawable {

        @NotNull
        private final FastestListPlaceholderType.FeedItem config;
        private final float labelWidthRatio;
        private final float labelWidthRatioSecondary;

        @NotNull
        private final Paint paint;

        @NotNull
        private final Path path;

        @NotNull
        private final float[] pathCornerRadii;

        @NotNull
        private final RectF pathRect;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FastestListPlaceholderType.Shape.Type.values().length];
                try {
                    iArr[FastestListPlaceholderType.Shape.Type.CIRCLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FastestListPlaceholderType.Shape.Type.RECT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FeedItemDrawable(@NotNull FastestListPlaceholderType.FeedItem config, float f2, float f7) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
            this.labelWidthRatio = f2;
            this.labelWidthRatioSecondary = f7;
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(config.getColor());
            this.paint = paint;
            this.path = new Path();
            this.pathRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            Float fValueOf = Float.valueOf(config.getBorderTopLeftRadius());
            fValueOf = (fValueOf.floatValue() > 0.0f ? 1 : (fValueOf.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf;
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : config.getBorderRadius();
            Float fValueOf2 = Float.valueOf(config.getBorderTopLeftRadius());
            fValueOf2 = (fValueOf2.floatValue() > 0.0f ? 1 : (fValueOf2.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf2;
            float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : config.getBorderRadius();
            Float fValueOf3 = Float.valueOf(config.getBorderTopRightRadius());
            fValueOf3 = (fValueOf3.floatValue() > 0.0f ? 1 : (fValueOf3.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf3;
            float fFloatValue3 = fValueOf3 != null ? fValueOf3.floatValue() : config.getBorderRadius();
            Float fValueOf4 = Float.valueOf(config.getBorderTopRightRadius());
            fValueOf4 = (fValueOf4.floatValue() > 0.0f ? 1 : (fValueOf4.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf4;
            float fFloatValue4 = fValueOf4 != null ? fValueOf4.floatValue() : config.getBorderRadius();
            Float fValueOf5 = Float.valueOf(config.getBorderBottomRightRadius());
            fValueOf5 = (fValueOf5.floatValue() > 0.0f ? 1 : (fValueOf5.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf5;
            float fFloatValue5 = fValueOf5 != null ? fValueOf5.floatValue() : config.getBorderRadius();
            Float fValueOf6 = Float.valueOf(config.getBorderBottomRightRadius());
            fValueOf6 = (fValueOf6.floatValue() > 0.0f ? 1 : (fValueOf6.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf6;
            float fFloatValue6 = fValueOf6 != null ? fValueOf6.floatValue() : config.getBorderRadius();
            Float fValueOf7 = Float.valueOf(config.getBorderBottomLeftRadius());
            fValueOf7 = (fValueOf7.floatValue() > 0.0f ? 1 : (fValueOf7.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf7;
            float fFloatValue7 = fValueOf7 != null ? fValueOf7.floatValue() : config.getBorderRadius();
            Float fValueOf8 = Float.valueOf(config.getBorderBottomLeftRadius());
            Float f10 = (fValueOf8.floatValue() > 0.0f ? 1 : (fValueOf8.floatValue() == 0.0f ? 0 : -1)) == 0 ? null : fValueOf8;
            this.pathCornerRadii = new float[]{fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue7, f10 != null ? f10.floatValue() : config.getBorderRadius()};
        }

        @Override // com.discord.misc.utilities.drawable.CustomDrawDrawable, android.graphics.drawable.Drawable
        public void draw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            int iWidth = getBounds().width();
            int iHeight = getBounds().height();
            if (this.config.getBackgroundColor() != 0) {
                this.path.reset();
                this.pathRect.set(0.0f, 0.0f, iWidth, iHeight);
                this.path.addRoundRect(this.pathRect, this.pathCornerRadii, Path.Direction.CW);
                this.paint.setColor(this.config.getBackgroundColor());
                canvas.drawPath(this.path, this.paint);
                this.paint.setColor(this.config.getColor());
            }
            int i7 = WhenMappings.$EnumSwitchMapping$0[this.config.getShapeType().ordinal()];
            if (i7 == 1) {
                canvas.drawCircle(this.config.getPadding() + (this.config.getShapeSize() / 2.0f), (this.config.getShapeSize() / 2.0f) + ((iHeight - this.config.getShapeSize()) / 2.0f), this.config.getShapeSize() / 2.0f, this.paint);
            } else {
                if (i7 != 2) {
                    throw new n();
                }
                float padding = this.config.getPadding();
                float shapeSize = this.config.getShapeSize();
                float shapeSize2 = (iHeight - this.config.getShapeSize()) / 2.0f;
                canvas.drawRect(padding, shapeSize2, shapeSize, this.config.getShapeSize() + shapeSize2, this.paint);
            }
            float labelSize = this.config.getLabelSize();
            float labelSecondarySize = this.config.getLabelSecondarySize();
            float f2 = 2;
            float f7 = labelSize / f2;
            float f10 = labelSecondarySize / f2;
            float labelPaddingInnerRatio = (this.config.getLabelPaddingInnerRatio() * labelSize) / f2;
            float labelPaddingInnerRatio2 = (this.config.getLabelPaddingInnerRatio() * labelSecondarySize) / f2;
            float labelPadding = this.config.getLabelPadding() + this.config.getShapeSize() + this.config.getPadding();
            float f11 = iWidth;
            float padding2 = (f11 - this.config.getPadding()) - this.config.getLabelPadding();
            float f12 = iHeight;
            float f13 = (f12 - (labelSize + labelSecondarySize)) / 2.0f;
            float f14 = f13 + labelSize;
            canvas.drawRoundRect(labelPadding, f13 + labelPaddingInnerRatio, this.labelWidthRatio * padding2, f14 - labelPaddingInnerRatio, f7, f7, this.paint);
            canvas.drawRoundRect(labelPadding, f14 + labelPaddingInnerRatio2, padding2 * this.labelWidthRatioSecondary, (f14 + labelSecondarySize) - labelPaddingInnerRatio2, f10, f10, this.paint);
            if (this.config.getDivider()) {
                this.paint.setColor(this.config.getDividerColor());
                canvas.drawRect(this.config.getDividerPaddingLeft(), f12 - SizeUtilsKt.getDpToPx(1), f11 - this.config.getDividerPaddingRight(), f12, this.paint);
                this.paint.setColor(this.config.getColor());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastestListPlaceholderTypeFeedItem(@NotNull FastestListPlaceholderType.FeedItem config) {
        super(null);
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.placeholders = new LinkedHashMap();
    }

    @Override // com.discord.fastest_list.android.placeholder.FastestListPlaceholder
    public void onPlaceholderShouldBind(@NotNull ViewGroup view, @NotNull FastestListSections.Entry item) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
        int iFloorMod = Math.floorMod(item.getKey().hashCode(), 20);
        Map<Integer, CustomDrawDrawable> map = this.placeholders;
        Integer numValueOf = Integer.valueOf(iFloorMod);
        CustomDrawDrawable feedItemDrawable = map.get(numValueOf);
        if (feedItemDrawable == null) {
            FastestListPlaceholderType.FeedItem feedItem = this.config;
            Companion companion = INSTANCE;
            feedItemDrawable = new FeedItemDrawable(feedItem, Companion.getRandomWidthRatio$default(companion, 0.0f, 0.0f, 3, null), Companion.getRandomWidthRatio$default(companion, 0.0f, 0.0f, 3, null));
            map.put(numValueOf, feedItemDrawable);
        }
        view.setBackground(feedItemDrawable);
    }

    @Override // com.discord.fastest_list.android.placeholder.FastestListPlaceholder
    public void onPlaceholderShouldUnbind(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(null);
    }
}
