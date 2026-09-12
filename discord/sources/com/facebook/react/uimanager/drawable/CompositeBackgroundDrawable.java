package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010.\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u00100\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u00103\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0005J\u0010\u0010$\u001a\u0002052\u0006\u0010\u0010\u001a\u000206H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00068"}, d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "context", "Landroid/content/Context;", "originalBackground", "Landroid/graphics/drawable/Drawable;", "outerShadows", "", AppStateModule.APP_STATE_BACKGROUND, "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "backgroundImage", "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "border", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "feedbackUnderlay", "innerShadows", "outline", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "borderRadius", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "<init>", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/OutlineDrawable;Lcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getOriginalBackground", "()Landroid/graphics/drawable/Drawable;", "getOuterShadows", "()Ljava/util/List;", "getBackground", "()Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getBackgroundImage", "()Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "getBorder", "()Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "getFeedbackUnderlay", "getInnerShadows", "getOutline", "()Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "withNewBackgroundImage", "withNewBackground", "withNewShadows", "withNewBorder", "withNewOutline", "withNewFeedbackUnderlay", "newUnderlay", "", "Landroid/graphics/Outline;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositeBackgroundDrawable extends LayerDrawable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final BackgroundDrawable background;
    private final BackgroundImageDrawable backgroundImage;
    private final BorderDrawable border;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;
    private final Drawable feedbackUnderlay;

    @NotNull
    private final List<Drawable> innerShadows;
    private final Drawable originalBackground;

    @NotNull
    private final List<Drawable> outerShadows;
    private final OutlineDrawable outline;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$Companion;", "", "<init>", "()V", "createLayersArray", "", "Landroid/graphics/drawable/Drawable;", "originalBackground", "outerShadows", "", AppStateModule.APP_STATE_BACKGROUND, "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "backgroundImage", "Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "border", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "feedbackUnderlay", "innerShadows", "outline", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "(Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;Lcom/facebook/react/uimanager/drawable/BorderDrawable;Landroid/graphics/drawable/Drawable;Ljava/util/List;Lcom/facebook/react/uimanager/drawable/OutlineDrawable;)[Landroid/graphics/drawable/Drawable;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCompositeBackgroundDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeBackgroundDrawable.kt\ncom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,250:1\n1#2:251\n37#3:252\n36#3,3:253\n*S KotlinDebug\n*F\n+ 1 CompositeBackgroundDrawable.kt\ncom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable$Companion\n*L\n246#1:252\n246#1:253,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable[] createLayersArray(Drawable originalBackground, List<? extends Drawable> outerShadows, BackgroundDrawable background, BackgroundImageDrawable backgroundImage, BorderDrawable border, Drawable feedbackUnderlay, List<? extends Drawable> innerShadows, OutlineDrawable outline) {
            ArrayList arrayList = new ArrayList();
            if (originalBackground != null) {
                arrayList.add(originalBackground);
            }
            arrayList.addAll(j0.x(outerShadows));
            if (background != null) {
                arrayList.add(background);
            }
            if (backgroundImage != null) {
                arrayList.add(backgroundImage);
            }
            if (border != null) {
                arrayList.add(border);
            }
            if (feedbackUnderlay != null) {
                arrayList.add(feedbackUnderlay);
            }
            arrayList.addAll(j0.x(innerShadows));
            if (outline != null) {
                arrayList.add(outline);
            }
            return (Drawable[]) arrayList.toArray(new Drawable[0]);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositeBackgroundDrawable(@NotNull Context context, Drawable drawable, @NotNull List<? extends Drawable> outerShadows, BackgroundDrawable backgroundDrawable, BackgroundImageDrawable backgroundImageDrawable, BorderDrawable borderDrawable, Drawable drawable2, @NotNull List<? extends Drawable> innerShadows, OutlineDrawable outlineDrawable, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle) {
        super(INSTANCE.createLayersArray(drawable, outerShadows, backgroundDrawable, backgroundImageDrawable, borderDrawable, drawable2, innerShadows, outlineDrawable));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(outerShadows, "outerShadows");
        Intrinsics.checkNotNullParameter(innerShadows, "innerShadows");
        this.context = context;
        this.originalBackground = drawable;
        this.outerShadows = outerShadows;
        this.background = backgroundDrawable;
        this.backgroundImage = backgroundImageDrawable;
        this.border = borderDrawable;
        this.feedbackUnderlay = drawable2;
        this.innerShadows = innerShadows;
        this.outline = outlineDrawable;
        this.borderInsets = borderInsets;
        this.borderRadius = borderRadiusStyle;
        setPaddingMode(1);
    }

    public final BackgroundDrawable getBackground() {
        return this.background;
    }

    public final BackgroundImageDrawable getBackgroundImage() {
        return this.backgroundImage;
    }

    public final BorderDrawable getBorder() {
        return this.border;
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final Drawable getFeedbackUnderlay() {
        return this.feedbackUnderlay;
    }

    @NotNull
    public final List<Drawable> getInnerShadows() {
        return this.innerShadows;
    }

    public final Drawable getOriginalBackground() {
        return this.originalBackground;
    }

    @NotNull
    public final List<Drawable> getOuterShadows() {
        return this.outerShadows;
    }

    public final OutlineDrawable getOutline() {
        return this.outline;
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewBackground(BackgroundDrawable background) {
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, background, this.backgroundImage, this.border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewBackgroundImage(BackgroundImageDrawable backgroundImage) {
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, backgroundImage, this.border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewBorder(@NotNull BorderDrawable border) {
        Intrinsics.checkNotNullParameter(border, "border");
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, this.backgroundImage, border, this.feedbackUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewFeedbackUnderlay(Drawable newUnderlay) {
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, this.backgroundImage, this.border, newUnderlay, this.innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewOutline(@NotNull OutlineDrawable outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, this.outerShadows, this.background, this.backgroundImage, this.border, this.feedbackUnderlay, this.innerShadows, outline, this.borderInsets, this.borderRadius);
    }

    @NotNull
    public final CompositeBackgroundDrawable withNewShadows(@NotNull List<? extends Drawable> outerShadows, @NotNull List<? extends Drawable> innerShadows) {
        Intrinsics.checkNotNullParameter(outerShadows, "outerShadows");
        Intrinsics.checkNotNullParameter(innerShadows, "innerShadows");
        return new CompositeBackgroundDrawable(this.context, this.originalBackground, outerShadows, this.background, this.backgroundImage, this.border, this.feedbackUnderlay, innerShadows, this.outline, this.borderInsets, this.borderRadius);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void getOutline(@NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle == null || !borderRadiusStyle.hasRoundedBorders()) {
            outline.setRect(getBounds());
            return;
        }
        Path path = new Path();
        BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
        ComputedBorderRadius computedBorderRadiusResolve = borderRadiusStyle2 != null ? borderRadiusStyle2.resolve(getLayoutDirection(), this.context, getBounds().width(), getBounds().height()) : null;
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        if (computedBorderRadiusResolve != null) {
            RectF rectF = new RectF(getBounds());
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            path.addRoundRect(rectF, new float[]{pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal() + (rectFResolve != null ? rectFResolve.left : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical() + (rectFResolve != null ? rectFResolve.top : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal() + (rectFResolve != null ? rectFResolve.right : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical() + (rectFResolve != null ? rectFResolve.top : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal() + (rectFResolve != null ? rectFResolve.right : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical() + (rectFResolve != null ? rectFResolve.bottom : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal() + (rectFResolve != null ? rectFResolve.left : 0.0f)), pixelUtil.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical() + (rectFResolve != null ? rectFResolve.bottom : 0.0f))}, Path.Direction.CW);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }

    public CompositeBackgroundDrawable(Context context, Drawable drawable, List list, BackgroundDrawable backgroundDrawable, BackgroundImageDrawable backgroundImageDrawable, BorderDrawable borderDrawable, Drawable drawable2, List list2, OutlineDrawable outlineDrawable, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : drawable, (i7 & 4) != 0 ? n0.f14659d : list, (i7 & 8) != 0 ? null : backgroundDrawable, (i7 & 16) != 0 ? null : backgroundImageDrawable, (i7 & 32) != 0 ? null : borderDrawable, (i7 & 64) != 0 ? null : drawable2, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? n0.f14659d : list2, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : outlineDrawable, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : borderInsets, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : borderRadiusStyle);
    }
}
