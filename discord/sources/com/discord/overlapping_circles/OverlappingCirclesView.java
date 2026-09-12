package com.discord.overlapping_circles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.LinearLayout;
import androidx.core.view.w;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetExtensionsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.dialog.AlertFragment;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxItems", "", "overlapPx", "separatorSizePx", "imageLoadingColor", "overflowBgColor", "overflowTextColor", "overflowTextSizePx", "placeholderCircleColor", "imageLoadingColorDrawable", "Landroid/graphics/drawable/ColorDrawable;", "overlapNegativeMargin", "setItems", "", AlertFragment.ARG_ITEMS, "", "Lcom/discord/overlapping_circles/OverlappingItem;", "OverlappingClippedItem", "PlaceholderItem", "OverflowItem", "Companion", "overlapping_circles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n27#2:289\n51#3,9:290\n1878#4,3:299\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView\n*L\n66#1:289\n70#1:290,9\n93#1:299,3\n*E\n"})
public final class OverlappingCirclesView extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int SMALL_ITEM_HEIGHT_DP = 20;
    private int imageLoadingColor;

    @NotNull
    private final ColorDrawable imageLoadingColorDrawable;
    private int maxItems;
    private int overflowBgColor;
    private int overflowTextColor;
    private int overflowTextSizePx;
    private final int overlapNegativeMargin;
    private int overlapPx;
    private int placeholderCircleColor;
    private int separatorSizePx;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;", "", "<init>", "()V", "SMALL_ITEM_HEIGHT_DP", "", "getClippingPathForSeparator", "Landroid/graphics/Path;", "radius", "", "viewCenterX", "viewCenterY", "separatorSizePx", "overlapping_circles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Path getClippingPathForSeparator(float radius, float viewCenterX, float viewCenterY, int separatorSizePx) {
            Path path = new Path();
            path.addCircle(((2 * radius) + viewCenterX) - separatorSizePx, viewCenterY, radius, Path.Direction.CW);
            return path;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;", "Lcom/google/android/material/textview/MaterialTextView;", "context", "Landroid/content/Context;", "count", "", "textSizePx", "textColor", "bgColor", "sizePx", "<init>", "(Landroid/content/Context;IIIII)V", "overlapping_circles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,288:1\n167#2,2:289\n81#2:291\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem\n*L\n260#1:289,2\n265#1:291\n*E\n"})
    public static final class OverflowItem extends MaterialTextView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverflowItem(@NotNull Context context, int i7, int i10, int i11, int i12, int i13) {
            super(context, null);
            Intrinsics.checkNotNullParameter(context, "context");
            DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryBold);
            setTextSize(0, i10);
            setTextColor(i11);
            setText("+" + i7);
            setGravity(17);
            float pxToDp = SizeUtilsKt.getPxToDp(i13);
            setPadding(pxToDp > 20.0f ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(4), 0, pxToDp > 20.0f ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(4), 0);
            setBackgroundColor(i12);
            ViewClippingUtilsKt.clipToCircle(this);
            w.a(this, new Runnable() { // from class: com.discord.overlapping_circles.OverlappingCirclesView$OverflowItem$special$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = this;
                    OverlappingCirclesView.OverflowItem overflowItem = this;
                    ViewGroup.LayoutParams layoutParams = overflowItem.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (width < height) {
                        width = height;
                    }
                    layoutParams2.width = width;
                    overflowItem.setLayoutParams(layoutParams2);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "context", "Landroid/content/Context;", "imageUri", "", "showSeparation", "", "overlapPx", "", "separatorSizePx", "defaultImg", "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/content/Context;Ljava/lang/String;ZIILandroid/graphics/drawable/Drawable;)V", "clipPath", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "overlapping_circles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SuppressLint({"ViewConstructor"})
    @SourceDebugExtension({"SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,288:1\n67#2,4:289\n37#2,2:293\n55#2:295\n72#2:296\n27#3,7:297\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem\n*L\n175#1:289,4\n175#1:293,2\n175#1:295\n175#1:296\n192#1:297,7\n*E\n"})
    public static final class OverlappingClippedItem extends SimpleDraweeView {

        @NotNull
        private Path clipPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverlappingClippedItem(@NotNull Context context, @NotNull String imageUri, final boolean z5, final int i7, final int i10, @NotNull Drawable defaultImg) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageUri, "imageUri");
            Intrinsics.checkNotNullParameter(defaultImg, "defaultImg");
            this.clipPath = new Path();
            GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(getResources());
            genericDraweeHierarchyBuilder.f4708d = defaultImg;
            genericDraweeHierarchyBuilder.f4712h = defaultImg;
            genericDraweeHierarchyBuilder.f4707c = 1.0f;
            setHierarchy(genericDraweeHierarchyBuilder.a());
            setImageURI(imageUri);
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.overlapping_circles.OverlappingCirclesView$OverlappingClippedItem$special$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        float f2 = this.this$0.getLayoutParams().width / 2.0f;
                        this.this$0.clipPath.addCircle(f2, f2, f2, Path.Direction.CW);
                        if (z5) {
                            this.this$0.clipPath.op(OverlappingCirclesView.INSTANCE.getClippingPathForSeparator(f2, f2 - i7, f2, i10), Path.Op.DIFFERENCE);
                        }
                    }
                });
                return;
            }
            float f2 = getLayoutParams().width / 2.0f;
            this.clipPath.addCircle(f2, f2, f2, Path.Direction.CW);
            if (z5) {
                this.clipPath.op(OverlappingCirclesView.INSTANCE.getClippingPathForSeparator(f2, f2 - i7, f2, i10), Path.Op.DIFFERENCE);
            }
        }

        @Override // android.widget.ImageView, android.view.View
        public void onDraw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            int iSave = canvas.save();
            try {
                canvas.clipPath(this.clipPath);
                super.onDraw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;", "Landroid/view/View;", "context", "Landroid/content/Context;", "bgColor", "", "showSeparation", "", "overlapPx", "separatorSizePx", "size", "<init>", "(Landroid/content/Context;IZIII)V", "radius", "", "separatorClipPath", "Landroid/graphics/Path;", "getSeparatorClipPath", "()Landroid/graphics/Path;", "separatorClipPath$delegate", "Lkotlin/Lazy;", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "overlapping_circles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOverlappingCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,288:1\n27#2,7:289\n*S KotlinDebug\n*F\n+ 1 OverlappingCirclesView.kt\ncom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem\n*L\n224#1:289,7\n*E\n"})
    public static final class PlaceholderItem extends View {
        private final int overlapPx;

        @NotNull
        private final Paint paint;
        private final float radius;

        /* JADX INFO: renamed from: separatorClipPath$delegate, reason: from kotlin metadata */
        @NotNull
        private final Lazy separatorClipPath;
        private final boolean showSeparation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaceholderItem(@NotNull Context context, int i7, boolean z5, int i10, final int i11, int i12) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.showSeparation = z5;
            this.overlapPx = i10;
            this.radius = i12 / 2.0f;
            this.separatorClipPath = l.a(m.f19487i, new Function0() { // from class: com.discord.overlapping_circles.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OverlappingCirclesView.PlaceholderItem.separatorClipPath_delegate$lambda$0(this.f4537d, i11);
                }
            });
            Paint paint = new Paint();
            paint.setColor(i7);
            paint.setAntiAlias(true);
            this.paint = paint;
        }

        private final Path getSeparatorClipPath() {
            return (Path) this.separatorClipPath.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Path separatorClipPath_delegate$lambda$0(PlaceholderItem placeholderItem, int i7) {
            Companion companion = OverlappingCirclesView.INSTANCE;
            float f2 = placeholderItem.radius;
            return companion.getClippingPathForSeparator(f2, f2 - placeholderItem.overlapPx, f2, i7);
        }

        @Override // android.view.View
        public void onDraw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            int iSave = canvas.save();
            try {
                if (this.showSeparation) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        canvas.clipOutPath(getSeparatorClipPath());
                    } else {
                        canvas.clipPath(getSeparatorClipPath(), Region.Op.DIFFERENCE);
                    }
                }
                float f2 = this.radius;
                canvas.drawCircle(f2, f2, f2, this.paint);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OverlappingCirclesView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setItems(@NotNull List<OverlappingItem> items) {
        View placeholderItem;
        String reactImageUrl;
        Intrinsics.checkNotNullParameter(items, "items");
        removeAllViews();
        boolean z5 = items.size() > this.maxItems;
        int iMin = Math.min(items.size(), this.maxItems) - 1;
        int i7 = this.maxItems;
        if (z5) {
            i7--;
        }
        int i10 = 0;
        for (Object obj : CollectionsKt.f0(items, i7)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                d0.k();
                throw null;
            }
            OverlappingItem overlappingItem = (OverlappingItem) obj;
            boolean z6 = i10 != iMin || z5;
            if (overlappingItem.getImageUri() != null) {
                if (URLUtil.isValidUrl(overlappingItem.getImageUri())) {
                    reactImageUrl = overlappingItem.getImageUri();
                } else {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ReactAsset reactAsset = ReactAsset.DefaultAvatar0;
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    reactImageUrl = ReactAssetUtilsKt.getReactImageUrl(context, ReactAssetExtensionsKt.getUri(reactAsset, context2));
                }
                String str = reactImageUrl;
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                placeholderItem = new OverlappingClippedItem(context3, str, z6, this.overlapPx, this.separatorSizePx, this.imageLoadingColorDrawable);
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                placeholderItem = new PlaceholderItem(context4, this.placeholderCircleColor, z6, this.overlapPx, this.separatorSizePx, getLayoutParams().height);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getLayoutParams().height, getLayoutParams().height);
            if (i10 > 0) {
                layoutParams.setMarginStart(this.overlapNegativeMargin);
            }
            addView(placeholderItem, layoutParams);
            i10 = i11;
        }
        if (z5) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            View overflowItem = new OverflowItem(context5, items.size() - i7, this.overflowTextSizePx, this.overflowTextColor, this.overflowBgColor, getLayoutParams().height);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams2.setMarginStart(this.overlapNegativeMargin);
            Unit unit = Unit.f14616a;
            addView(overflowItem, layoutParams2);
        }
    }

    public /* synthetic */ OverlappingCirclesView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlappingCirclesView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxItems = 3;
        this.overlapPx = SizeUtilsKt.getDpToPx(4);
        this.separatorSizePx = SizeUtilsKt.getDpToPx(3);
        this.imageLoadingColor = ThemeManagerKt.getTheme().getBackgroundModNormal();
        this.overflowBgColor = ThemeManagerKt.getTheme().getBackgroundModNormal();
        this.overflowTextColor = ThemeManagerKt.getTheme().getInteractiveTextDefault();
        this.overflowTextSizePx = SizeUtilsKt.getSpToPx(12);
        this.placeholderCircleColor = ThemeManagerKt.getTheme().getBackgroundModMuted();
        this.imageLoadingColorDrawable = new ColorDrawable(this.imageLoadingColor);
        int[] OverlappingCirclesView = R.styleable.OverlappingCirclesView;
        Intrinsics.checkNotNullExpressionValue(OverlappingCirclesView, "OverlappingCirclesView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OverlappingCirclesView, 0, 0);
        int i7 = typedArrayObtainStyledAttributes.getInt(R.styleable.OverlappingCirclesView_oc_maxItems, this.maxItems);
        this.maxItems = i7 < 0 ? 0 : i7;
        this.overlapPx = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_overlap, this.overlapPx);
        this.separatorSizePx = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_separation, this.separatorSizePx);
        this.imageLoadingColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_circleBgColor, this.imageLoadingColor);
        this.overflowBgColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_overflowBgColor, this.overflowBgColor);
        this.overflowTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_overflowTextColor, this.overflowTextColor);
        this.overflowTextSizePx = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.OverlappingCirclesView_oc_overflowTextSize, this.overflowTextSizePx);
        this.placeholderCircleColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OverlappingCirclesView_oc_placeholderColor, this.placeholderCircleColor);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        this.overlapNegativeMargin = -Math.abs(this.overlapPx);
    }
}
