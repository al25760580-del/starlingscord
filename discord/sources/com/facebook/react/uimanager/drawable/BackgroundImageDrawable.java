package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BackgroundPosition;
import com.facebook.react.uimanager.style.BackgroundRepeat;
import com.facebook.react.uimanager.style.BackgroundRepeatKeyword;
import com.facebook.react.uimanager.style.BackgroundSize;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u0002002\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u000206H\u0017J\u0010\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0017H\u0002J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u0017H\u0002J\b\u0010B\u001a\u000200H\u0002J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020DH\u0002JH\u0010H\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0I2\u0006\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010N\u001a\u0004\u0018\u00010)H\u0002J.\u0010O\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0I2\u0006\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020D2\b\u0010R\u001a\u0004\u0018\u00010%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R4\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R4\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/facebook/react/uimanager/drawable/BackgroundImageDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "borderRadius", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "needUpdatePath", "", "backgroundImageClipPath", "Landroid/graphics/Path;", "backgroundPositioningArea", "Landroid/graphics/RectF;", "backgroundPaintingArea", "value", "", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "backgroundImageLayers", "getBackgroundImageLayers", "()Ljava/util/List;", "setBackgroundImageLayers", "(Ljava/util/List;)V", "Lcom/facebook/react/uimanager/style/BackgroundSize;", "backgroundSize", "getBackgroundSize", "setBackgroundSize", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", "backgroundPosition", "getBackgroundPosition", "setBackgroundPosition", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "backgroundRepeat", "getBackgroundRepeat", "setBackgroundRepeat", "backgroundPaint", "Landroid/graphics/Paint;", "invalidateSelf", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "computeBorderInsets", "hasInvalidDimensions", "positioningArea", "paintingArea", "updatePath", "positionToPixels", "", "lengthPercentage", "Lcom/facebook/react/uimanager/LengthPercentage;", "availableSpace", "calculateBackgroundImageSize", "Lkotlin/Pair;", "containerWidth", "containerHeight", "imageWidth", "imageHeight", "repeat", "calculateBackgroundPosition", "tileWidth", "tileHeight", ViewProps.POSITION, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackgroundImageDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundImageDrawable.kt\ncom/facebook/react/uimanager/drawable/BackgroundImageDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,418:1\n1#2:419\n*E\n"})
public final class BackgroundImageDrawable extends Drawable {
    private Path backgroundImageClipPath;
    private List<BackgroundImageLayer> backgroundImageLayers;

    @NotNull
    private final Paint backgroundPaint;
    private RectF backgroundPaintingArea;
    private List<BackgroundPosition> backgroundPosition;
    private RectF backgroundPositioningArea;
    private List<BackgroundRepeat> backgroundRepeat;
    private List<? extends BackgroundSize> backgroundSize;
    private BorderInsets borderInsets;
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;
    private boolean needUpdatePath;

    public /* synthetic */ BackgroundImageDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : borderRadiusStyle, (i7 & 4) != 0 ? null : borderInsets);
    }

    private final Pair<Float, Float> calculateBackgroundImageSize(float containerWidth, float containerHeight, float imageWidth, float imageHeight, BackgroundSize backgroundSize, BackgroundRepeat repeat) {
        if (backgroundSize instanceof BackgroundSize.LengthPercentageAuto) {
            BackgroundSize.LengthPercentageAuto lengthPercentageAuto = (BackgroundSize.LengthPercentageAuto) backgroundSize;
            LengthPercentage x5 = lengthPercentageAuto.getLengthPercentage().getX();
            LengthPercentage y5 = lengthPercentageAuto.getLengthPercentage().getY();
            if (x5 != null && y5 != null) {
                imageWidth = positionToPixels(x5, containerWidth);
                imageHeight = positionToPixels(y5, containerHeight);
            }
        }
        BackgroundRepeatKeyword x6 = repeat != null ? repeat.getX() : null;
        BackgroundRepeatKeyword backgroundRepeatKeyword = BackgroundRepeatKeyword.Round;
        if (x6 == backgroundRepeatKeyword && imageWidth > 0.0f && !FloatUtil.floatsEqual(containerWidth % imageWidth, 0.0f)) {
            float fRint = (float) Math.rint(containerWidth / imageWidth);
            if (fRint > 0.0f) {
                imageWidth = containerWidth / fRint;
            }
        }
        if ((repeat != null ? repeat.getY() : null) == backgroundRepeatKeyword && imageHeight > 0.0f && !FloatUtil.floatsEqual(containerHeight % imageHeight, 0.0f)) {
            float fRint2 = (float) Math.rint(containerHeight / imageHeight);
            if (fRint2 > 0.0f) {
                imageHeight = containerHeight / fRint2;
            }
        }
        return new Pair<>(Float.valueOf(imageWidth), Float.valueOf(imageHeight));
    }

    private final Pair<Float, Float> calculateBackgroundPosition(float tileWidth, float tileHeight, BackgroundPosition position) {
        float fPositionToPixels;
        float fPositionToPixels2 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        RectF rectF = this.backgroundPositioningArea;
        if (rectF == null) {
            return new Pair<>(fValueOf, fValueOf);
        }
        float fWidth = rectF.width() - tileWidth;
        float fHeight = rectF.height() - tileHeight;
        if ((position != null ? position.getLeft() : null) != null) {
            fPositionToPixels = positionToPixels(position.getLeft(), fWidth);
        } else {
            fPositionToPixels = (position != null ? position.getRight() : null) != null ? fWidth - positionToPixels(position.getRight(), fWidth) : 0.0f;
        }
        float f2 = fPositionToPixels + rectF.left;
        if ((position != null ? position.getTop() : null) != null) {
            fPositionToPixels2 = positionToPixels(position.getTop(), fHeight);
        } else {
            if ((position != null ? position.getBottom() : null) != null) {
                fPositionToPixels2 = fHeight - positionToPixels(position.getBottom(), fHeight);
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(fPositionToPixels2 + rectF.top));
    }

    private final RectF computeBorderInsets() {
        float fDpToPx;
        float fDpToPx2;
        float fDpToPx3;
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        float fDpToPx4 = 0.0f;
        if (rectFResolve != null) {
            fDpToPx = PixelUtil.INSTANCE.dpToPx(rectFResolve.left);
        } else {
            fDpToPx = 0.0f;
        }
        if (rectFResolve != null) {
            fDpToPx2 = PixelUtil.INSTANCE.dpToPx(rectFResolve.top);
        } else {
            fDpToPx2 = 0.0f;
        }
        if (rectFResolve != null) {
            fDpToPx3 = PixelUtil.INSTANCE.dpToPx(rectFResolve.right);
        } else {
            fDpToPx3 = 0.0f;
        }
        if (rectFResolve != null) {
            fDpToPx4 = PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom);
        }
        return new RectF(fDpToPx, fDpToPx2, fDpToPx3, fDpToPx4);
    }

    private final boolean hasInvalidDimensions(RectF positioningArea, RectF paintingArea) {
        return FloatUtil.floatsEqual(positioningArea.width(), 0.0f) || positioningArea.width() < 0.0f || FloatUtil.floatsEqual(positioningArea.height(), 0.0f) || positioningArea.height() < 0.0f || FloatUtil.floatsEqual(paintingArea.width(), 0.0f) || paintingArea.width() < 0.0f || FloatUtil.floatsEqual(paintingArea.height(), 0.0f) || paintingArea.height() < 0.0f;
    }

    private final float positionToPixels(LengthPercentage lengthPercentage, float availableSpace) {
        return lengthPercentage.getType() == LengthPercentageType.PERCENT ? lengthPercentage.resolve(availableSpace) : PixelUtil.INSTANCE.dpToPx(lengthPercentage.resolve(availableSpace));
    }

    private final void updatePath() {
        ComputedBorderRadius computedBorderRadiusResolve;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            RectF rectFComputeBorderInsets = computeBorderInsets();
            this.backgroundPositioningArea = new RectF(getBounds().left + rectFComputeBorderInsets.left, getBounds().top + rectFComputeBorderInsets.top, getBounds().right - rectFComputeBorderInsets.right, getBounds().bottom - rectFComputeBorderInsets.bottom);
            this.backgroundPaintingArea = new RectF(getBounds());
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                PixelUtil pixelUtil = PixelUtil.INSTANCE;
                computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
            } else {
                computedBorderRadiusResolve = null;
            }
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 == null || !borderRadiusStyle2.hasRoundedBorders()) {
                RectF rectF = this.backgroundPaintingArea;
                if (rectF == null) {
                    return;
                }
                Path path = new Path();
                this.backgroundImageClipPath = path;
                path.addRect(rectF, Path.Direction.CW);
                return;
            }
            RectF rectF2 = this.backgroundPaintingArea;
            if (rectF2 == null) {
                return;
            }
            Path path2 = new Path();
            this.backgroundImageClipPath = path2;
            float fDpToPx = 0.0f;
            float fDpToPx2 = (computedBorderRadiusResolve == null || (topLeft2 = computedBorderRadiusResolve.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal());
            float fDpToPx3 = (computedBorderRadiusResolve == null || (topLeft = computedBorderRadiusResolve.getTopLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topLeft.getVertical());
            float fDpToPx4 = (computedBorderRadiusResolve == null || (topRight2 = computedBorderRadiusResolve.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal());
            float fDpToPx5 = (computedBorderRadiusResolve == null || (topRight = computedBorderRadiusResolve.getTopRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(topRight.getVertical());
            float fDpToPx6 = (computedBorderRadiusResolve == null || (bottomRight2 = computedBorderRadiusResolve.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal());
            float fDpToPx7 = (computedBorderRadiusResolve == null || (bottomRight = computedBorderRadiusResolve.getBottomRight()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical());
            float fDpToPx8 = (computedBorderRadiusResolve == null || (bottomLeft2 = computedBorderRadiusResolve.getBottomLeft()) == null) ? 0.0f : PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal());
            if (computedBorderRadiusResolve != null && (bottomLeft = computedBorderRadiusResolve.getBottomLeft()) != null) {
                fDpToPx = PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical());
            }
            path2.addRoundRect(rectF2, new float[]{fDpToPx2, fDpToPx3, fDpToPx4, fDpToPx5, fDpToPx6, fDpToPx7, fDpToPx8, fDpToPx}, Path.Direction.CW);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x020c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0238  */
    /* JADX WARN: Code duplicated, block: B:109:0x0248  */
    /* JADX WARN: Code duplicated, block: B:111:0x024d A[LOOP:2: B:110:0x024b->B:111:0x024d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fd  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        RectF rectF;
        int size;
        BackgroundSize backgroundSize;
        BackgroundRepeat backgroundRepeat;
        int i7;
        RectF rectF2;
        BackgroundRepeatKeyword x5;
        float f2;
        float f7;
        float f10;
        int i10;
        int i11;
        float f11;
        BackgroundRepeatKeyword y5;
        float fRint;
        float f12;
        int i12;
        int i13;
        float f13;
        float f14;
        int i14;
        int i15;
        float f15;
        float fRint2;
        BackgroundImageDrawable backgroundImageDrawable = this;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        List<BackgroundImageLayer> list = backgroundImageDrawable.backgroundImageLayers;
        if (list != null) {
            int i16 = 1;
            if (list != null && list.isEmpty()) {
                return;
            }
            backgroundImageDrawable.updatePath();
            RectF rectF3 = backgroundImageDrawable.backgroundPaintingArea;
            if (rectF3 != null && (rectF = backgroundImageDrawable.backgroundPositioningArea) != null && !backgroundImageDrawable.hasInvalidDimensions(rectF, rectF3)) {
                canvas2.save();
                Path path = backgroundImageDrawable.backgroundImageClipPath;
                if (path != null) {
                    canvas2.clipPath(path);
                }
                List<BackgroundImageLayer> list2 = backgroundImageDrawable.backgroundImageLayers;
                if (list2 != null && (size = list2.size() - 1) >= 0) {
                    while (true) {
                        int i17 = size - 1;
                        BackgroundImageLayer backgroundImageLayer = list2.get(size);
                        List<? extends BackgroundSize> list3 = backgroundImageDrawable.backgroundSize;
                        BackgroundPosition backgroundPosition = null;
                        if (list3 == null) {
                            backgroundSize = null;
                        } else {
                            if (list3.isEmpty()) {
                                list3 = null;
                            }
                            if (list3 != null) {
                                backgroundSize = (BackgroundSize) CollectionsKt.M(size % list3.size(), list3);
                            } else {
                                backgroundSize = null;
                            }
                        }
                        List<BackgroundRepeat> list4 = backgroundImageDrawable.backgroundRepeat;
                        if (list4 == null) {
                            backgroundRepeat = null;
                        } else {
                            if (list4.isEmpty()) {
                                list4 = null;
                            }
                            if (list4 != null) {
                                backgroundRepeat = (BackgroundRepeat) CollectionsKt.M(size % list4.size(), list4);
                            } else {
                                backgroundRepeat = null;
                            }
                        }
                        List<BackgroundPosition> list5 = backgroundImageDrawable.backgroundPosition;
                        if (list5 != null) {
                            if (list5.isEmpty()) {
                                list5 = null;
                            }
                            if (list5 != null) {
                                backgroundPosition = (BackgroundPosition) CollectionsKt.M(size % list5.size(), list5);
                            }
                        }
                        BackgroundPosition backgroundPosition2 = backgroundPosition;
                        Pair<Float, Float> pairCalculateBackgroundImageSize = backgroundImageDrawable.calculateBackgroundImageSize(rectF.width(), rectF.height(), rectF.width(), rectF.height(), backgroundSize, backgroundRepeat);
                        BackgroundRepeat backgroundRepeat2 = backgroundRepeat;
                        BackgroundImageDrawable backgroundImageDrawable2 = backgroundImageDrawable;
                        float fFloatValue = ((Number) pairCalculateBackgroundImageSize.f14612d).floatValue();
                        float fFloatValue2 = ((Number) pairCalculateBackgroundImageSize.f14613e).floatValue();
                        if (fFloatValue <= 0.0f || fFloatValue2 <= 0.0f) {
                            i7 = i16;
                            rectF2 = rectF3;
                            rectF = rectF;
                        } else {
                            backgroundImageDrawable2.backgroundPaint.setShader(backgroundImageLayer.getShader(fFloatValue, fFloatValue2));
                            Pair<Float, Float> pairCalculateBackgroundPosition = backgroundImageDrawable2.calculateBackgroundPosition(fFloatValue, fFloatValue2, backgroundPosition2);
                            float fFloatValue3 = ((Number) pairCalculateBackgroundPosition.f14612d).floatValue();
                            float fFloatValue4 = ((Number) pairCalculateBackgroundPosition.f14613e).floatValue();
                            if (backgroundRepeat2 == null || (x5 = backgroundRepeat2.getX()) == null) {
                                x5 = BackgroundRepeatKeyword.Repeat;
                            }
                            BackgroundRepeatKeyword backgroundRepeatKeyword = BackgroundRepeatKeyword.Space;
                            if (x5 == backgroundRepeatKeyword) {
                                float fWidth = rectF3.width() - (2 * fFloatValue);
                                i7 = i16;
                                RectF rectF4 = rectF3;
                                float fRint3 = (float) Math.rint(fFloatValue);
                                if (fRint3 <= 0.0f || (fWidth <= 0.0f && !FloatUtil.floatsEqual(fWidth, 0.0f))) {
                                    f7 = 0.0f;
                                    f2 = fFloatValue4;
                                    rectF2 = rectF4;
                                } else {
                                    f2 = fFloatValue4;
                                    int iFloor = (int) Math.floor(((float) Math.rint(fWidth)) / fRint3);
                                    int i18 = iFloor + 2;
                                    float f16 = (fWidth - (iFloor * fFloatValue)) / (iFloor + 1);
                                    rectF2 = rectF4;
                                    fFloatValue3 = rectF2.left;
                                    backgroundRepeat2 = backgroundRepeat2;
                                    f10 = 0.0f;
                                    rectF = rectF;
                                    f11 = f16;
                                    i11 = i18;
                                }
                                if (backgroundRepeat2 != null || (y5 = backgroundRepeat2.getY()) == null) {
                                    y5 = BackgroundRepeatKeyword.Repeat;
                                }
                                if (y5 == backgroundRepeatKeyword) {
                                    float fHeight = rectF2.height() - (2 * fFloatValue2);
                                    fRint2 = (float) Math.rint(fFloatValue2);
                                    if (fRint2 <= f10 && (fHeight > f10 || FloatUtil.floatsEqual(fHeight, f10))) {
                                        int iFloor2 = (int) Math.floor(((float) Math.rint(fHeight)) / fRint2);
                                        f2 = rectF2.top;
                                        f11 = f11;
                                        i13 = iFloor2 + 2;
                                        f13 = (fHeight - (iFloor2 * fFloatValue2)) / (iFloor2 + 1);
                                    }
                                    f14 = fFloatValue3;
                                    i14 = 0;
                                    while (i14 < i11) {
                                        i15 = 0;
                                        f15 = f2;
                                        while (i15 < i13) {
                                            canvas2.save();
                                            canvas2.translate(f14, f15);
                                            canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                            canvas.restore();
                                            f15 = fFloatValue2 + f13 + f15;
                                            i15++;
                                            i11 = i11;
                                            i14 = i14;
                                            canvas2 = canvas;
                                        }
                                        f14 += fFloatValue + f11;
                                        i14++;
                                        i11 = i11;
                                        canvas2 = canvas;
                                    }
                                } else {
                                    if (y5 != BackgroundRepeatKeyword.Round || y5 == BackgroundRepeatKeyword.Repeat) {
                                        fRint = (float) Math.rint(fFloatValue2);
                                        if (fRint > 0.0f) {
                                            float f17 = f2;
                                            int iCeil = (int) Math.ceil(((float) Math.rint(f17)) / fRint);
                                            int iCeil2 = ((int) Math.ceil(((float) Math.rint(rectF2.height() - f17)) / fRint)) + iCeil;
                                            f12 = f17 - (iCeil * fFloatValue2);
                                            i12 = iCeil2;
                                        } else {
                                            f12 = f2;
                                            i12 = i7;
                                        }
                                        f2 = f12;
                                        i13 = i12;
                                    }
                                    f13 = 0.0f;
                                    f14 = fFloatValue3;
                                    i14 = 0;
                                    while (i14 < i11) {
                                        i15 = 0;
                                        f15 = f2;
                                        while (i15 < i13) {
                                            canvas2.save();
                                            canvas2.translate(f14, f15);
                                            canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                            canvas.restore();
                                            f15 = fFloatValue2 + f13 + f15;
                                            i15++;
                                            i11 = i11;
                                            i14 = i14;
                                            canvas2 = canvas;
                                        }
                                        f14 += fFloatValue + f11;
                                        i14++;
                                        i11 = i11;
                                        canvas2 = canvas;
                                    }
                                }
                                f11 = f11;
                                i13 = i7;
                                f13 = 0.0f;
                                f14 = fFloatValue3;
                                i14 = 0;
                                while (i14 < i11) {
                                    i15 = 0;
                                    f15 = f2;
                                    while (i15 < i13) {
                                        canvas2.save();
                                        canvas2.translate(f14, f15);
                                        canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                        canvas.restore();
                                        f15 = fFloatValue2 + f13 + f15;
                                        i15++;
                                        i11 = i11;
                                        i14 = i14;
                                        canvas2 = canvas;
                                    }
                                    f14 += fFloatValue + f11;
                                    i14++;
                                    i11 = i11;
                                    canvas2 = canvas;
                                }
                            } else {
                                f2 = fFloatValue4;
                                i7 = i16;
                                rectF2 = rectF3;
                                f7 = 0.0f;
                                if (x5 == BackgroundRepeatKeyword.Round || x5 == BackgroundRepeatKeyword.Repeat) {
                                    float fRint4 = (float) Math.rint(fFloatValue);
                                    if (fRint4 > 0.0f) {
                                        int iCeil3 = (int) Math.ceil(((float) Math.rint(fFloatValue3)) / fRint4);
                                        f10 = 0.0f;
                                        int iCeil4 = ((int) Math.ceil(((float) Math.rint(rectF2.width() - fFloatValue3)) / fRint4)) + iCeil3;
                                        fFloatValue3 -= iCeil3 * fFloatValue;
                                        i10 = iCeil4;
                                    } else {
                                        f10 = 0.0f;
                                        i10 = i7;
                                    }
                                    i11 = i10;
                                }
                                f11 = f10;
                                if (backgroundRepeat2 != null) {
                                    y5 = BackgroundRepeatKeyword.Repeat;
                                } else {
                                    y5 = BackgroundRepeatKeyword.Repeat;
                                }
                                if (y5 == backgroundRepeatKeyword) {
                                    float fHeight2 = rectF2.height() - (2 * fFloatValue2);
                                    fRint2 = (float) Math.rint(fFloatValue2);
                                    if (fRint2 <= f10) {
                                    }
                                } else {
                                    if (y5 != BackgroundRepeatKeyword.Round) {
                                    }
                                    fRint = (float) Math.rint(fFloatValue2);
                                    if (fRint > 0.0f) {
                                        float f18 = f2;
                                        int iCeil5 = (int) Math.ceil(((float) Math.rint(f18)) / fRint);
                                        int iCeil6 = ((int) Math.ceil(((float) Math.rint(rectF2.height() - f18)) / fRint)) + iCeil5;
                                        f12 = f18 - (iCeil5 * fFloatValue2);
                                        i12 = iCeil6;
                                    } else {
                                        f12 = f2;
                                        i12 = i7;
                                    }
                                    f2 = f12;
                                    i13 = i12;
                                    f13 = 0.0f;
                                    f14 = fFloatValue3;
                                    i14 = 0;
                                    while (i14 < i11) {
                                        i15 = 0;
                                        f15 = f2;
                                        while (i15 < i13) {
                                            canvas2.save();
                                            canvas2.translate(f14, f15);
                                            canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                            canvas.restore();
                                            f15 = fFloatValue2 + f13 + f15;
                                            i15++;
                                            i11 = i11;
                                            i14 = i14;
                                            canvas2 = canvas;
                                        }
                                        f14 += fFloatValue + f11;
                                        i14++;
                                        i11 = i11;
                                        canvas2 = canvas;
                                    }
                                }
                                f11 = f11;
                                i13 = i7;
                                f13 = 0.0f;
                                f14 = fFloatValue3;
                                i14 = 0;
                                while (i14 < i11) {
                                    i15 = 0;
                                    f15 = f2;
                                    while (i15 < i13) {
                                        canvas2.save();
                                        canvas2.translate(f14, f15);
                                        canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                        canvas.restore();
                                        f15 = fFloatValue2 + f13 + f15;
                                        i15++;
                                        i11 = i11;
                                        i14 = i14;
                                        canvas2 = canvas;
                                    }
                                    f14 += fFloatValue + f11;
                                    i14++;
                                    i11 = i11;
                                    canvas2 = canvas;
                                }
                            }
                            backgroundRepeat2 = backgroundRepeat2;
                            f10 = f7;
                            rectF = rectF;
                            i11 = i7;
                            f11 = f10;
                            if (backgroundRepeat2 != null) {
                                y5 = BackgroundRepeatKeyword.Repeat;
                            } else {
                                y5 = BackgroundRepeatKeyword.Repeat;
                            }
                            if (y5 == backgroundRepeatKeyword) {
                                float fHeight3 = rectF2.height() - (2 * fFloatValue2);
                                fRint2 = (float) Math.rint(fFloatValue2);
                                if (fRint2 <= f10) {
                                }
                            } else {
                                if (y5 != BackgroundRepeatKeyword.Round) {
                                }
                                fRint = (float) Math.rint(fFloatValue2);
                                if (fRint > 0.0f) {
                                    float f19 = f2;
                                    int iCeil7 = (int) Math.ceil(((float) Math.rint(f19)) / fRint);
                                    int iCeil8 = ((int) Math.ceil(((float) Math.rint(rectF2.height() - f19)) / fRint)) + iCeil7;
                                    f12 = f19 - (iCeil7 * fFloatValue2);
                                    i12 = iCeil8;
                                } else {
                                    f12 = f2;
                                    i12 = i7;
                                }
                                f2 = f12;
                                i13 = i12;
                                f13 = 0.0f;
                                f14 = fFloatValue3;
                                i14 = 0;
                                while (i14 < i11) {
                                    i15 = 0;
                                    f15 = f2;
                                    while (i15 < i13) {
                                        canvas2.save();
                                        canvas2.translate(f14, f15);
                                        canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                        canvas.restore();
                                        f15 = fFloatValue2 + f13 + f15;
                                        i15++;
                                        i11 = i11;
                                        i14 = i14;
                                        canvas2 = canvas;
                                    }
                                    f14 += fFloatValue + f11;
                                    i14++;
                                    i11 = i11;
                                    canvas2 = canvas;
                                }
                            }
                            f11 = f11;
                            i13 = i7;
                            f13 = 0.0f;
                            f14 = fFloatValue3;
                            i14 = 0;
                            while (i14 < i11) {
                                i15 = 0;
                                f15 = f2;
                                while (i15 < i13) {
                                    canvas2.save();
                                    canvas2.translate(f14, f15);
                                    canvas2.drawRect(0.0f, 0.0f, fFloatValue, fFloatValue2, backgroundImageDrawable2.backgroundPaint);
                                    canvas.restore();
                                    f15 = fFloatValue2 + f13 + f15;
                                    i15++;
                                    i11 = i11;
                                    i14 = i14;
                                    canvas2 = canvas;
                                }
                                f14 += fFloatValue + f11;
                                i14++;
                                i11 = i11;
                                canvas2 = canvas;
                            }
                        }
                        if (i17 < 0) {
                            break;
                        }
                        canvas2 = canvas;
                        backgroundImageDrawable = backgroundImageDrawable2;
                        rectF3 = rectF2;
                        size = i17;
                        rectF = rectF;
                        i16 = i7;
                    }
                }
                canvas.restore();
            }
        }
    }

    public final List<BackgroundImageLayer> getBackgroundImageLayers() {
        return this.backgroundImageLayers;
    }

    public final List<BackgroundPosition> getBackgroundPosition() {
        return this.backgroundPosition;
    }

    public final List<BackgroundRepeat> getBackgroundRepeat() {
        return this.backgroundRepeat;
    }

    public final List<BackgroundSize> getBackgroundSize() {
        return this.backgroundSize;
    }

    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    @d
    public int getOpacity() {
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        invalidateSelf();
    }

    public final void setBackgroundImageLayers(List<BackgroundImageLayer> list) {
        if (Intrinsics.areEqual(this.backgroundImageLayers, list)) {
            return;
        }
        this.backgroundImageLayers = list;
        invalidateSelf();
    }

    public final void setBackgroundPosition(List<BackgroundPosition> list) {
        if (Intrinsics.areEqual(this.backgroundPosition, list)) {
            return;
        }
        this.backgroundPosition = list;
        invalidateSelf();
    }

    public final void setBackgroundRepeat(List<BackgroundRepeat> list) {
        if (Intrinsics.areEqual(this.backgroundRepeat, list)) {
            return;
        }
        this.backgroundRepeat = list;
        invalidateSelf();
    }

    public final void setBackgroundSize(List<? extends BackgroundSize> list) {
        if (Intrinsics.areEqual(this.backgroundSize, list)) {
            return;
        }
        this.backgroundSize = list;
        invalidateSelf();
    }

    public final void setBorderInsets(BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BackgroundImageDrawable(@NotNull Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.needUpdatePath = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
    }
}
