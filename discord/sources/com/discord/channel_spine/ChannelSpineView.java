package com.discord.channel_spine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.imagepipeline.nativecode.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00013B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0014J\u0018\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bH\u0014J\b\u0010-\u001a\u00020&H\u0002J \u0010.\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u000bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR$\u0010 \u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00064"}, d2 = {"Lcom/discord/channel_spine/ChannelSpineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "spinePaint", "Landroid/graphics/Paint;", "verticalPadding", "", "getVerticalPadding", "()I", "setVerticalPadding", "(I)V", "horizontalPadding", "getHorizontalPadding", "setHorizontalPadding", "arcPercent", "", "arcRect", "Landroid/graphics/RectF;", "paths", "", "Landroid/graphics/Path;", "isReplySpline", "", "value", "numRows", "getNumRows", "setNumRows", "rowHeight", "getRowHeight", "()F", "setRowHeight", "(F)V", "configureAsReplySpline", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "rebuildLayout", "createSpinePath", "rowIndex", "direction", "Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;", "yOfRow", "SpineDirection", "channel_spine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChannelSpineView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelSpineView.kt\ncom/discord/channel_spine/ChannelSpineView\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,215:1\n27#2,7:216\n*S KotlinDebug\n*F\n+ 1 ChannelSpineView.kt\ncom/discord/channel_spine/ChannelSpineView\n*L\n91#1:216,7\n*E\n"})
public final class ChannelSpineView extends View {

    @NotNull
    private final RectF arcRect;
    private int horizontalPadding;
    private boolean isReplySpline;
    private int numRows;

    @NotNull
    private List<? extends Path> paths;
    private float rowHeight;

    @NotNull
    private final Paint spinePaint;
    private int verticalPadding;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;", "", "arcSweepAngle", "", "<init>", "(Ljava/lang/String;IF)V", "getArcSweepAngle", "()F", "TOP_TO_BOTTOM", "BOTTOM_TO_TOP", "channel_spine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum SpineDirection {
        TOP_TO_BOTTOM(-90.0f),
        BOTTOM_TO_TOP(90.0f);

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());
        private final float arcSweepAngle;

        SpineDirection(float f2) {
            this.arcSweepAngle = f2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public final float getArcSweepAngle() {
            return this.arcSweepAngle;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpineDirection.values().length];
            try {
                iArr[SpineDirection.TOP_TO_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpineDirection.BOTTOM_TO_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSpineView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float arcPercent() {
        return this.isReplySpline ? 0.25f : 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAsReplySpline$lambda$1(ChannelSpineView channelSpineView, View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        channelSpineView.setRowHeight(SizeUtilsKt.getPxToDp(i12 - i10));
    }

    private final Path createSpinePath(float rowHeight, int rowIndex, SpineDirection direction) {
        float fYOfRow;
        Path path = new Path();
        float strokeWidth = this.spinePaint.getStrokeWidth() / 2.0f;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i7 = iArr[direction.ordinal()];
        if (i7 == 1) {
            fYOfRow = yOfRow(rowHeight, rowIndex);
        } else {
            if (i7 != 2) {
                throw new n();
            }
            fYOfRow = yOfRow(rowHeight, rowIndex + 1);
        }
        float fYOfRow2 = ((yOfRow(rowHeight, rowIndex) - this.verticalPadding) - strokeWidth) + (this.isReplySpline ? SizeUtilsKt.getDpToPx(9) : 0.5f * rowHeight);
        float measuredWidth = getMeasuredWidth() - this.horizontalPadding;
        float fArcPercent = arcPercent() * getMeasuredWidth();
        int i10 = iArr[direction.ordinal()];
        if (i10 == 1) {
            this.arcRect.set(strokeWidth, fYOfRow2 - fArcPercent, fArcPercent + strokeWidth, fYOfRow2);
        } else {
            if (i10 != 2) {
                throw new n();
            }
            this.arcRect.set(strokeWidth, fYOfRow2, strokeWidth + fArcPercent, fArcPercent + fYOfRow2);
        }
        path.moveTo(strokeWidth, fYOfRow);
        path.arcTo(this.arcRect, 180.0f, direction.getArcSweepAngle(), false);
        path.lineTo(measuredWidth, fYOfRow2);
        return path;
    }

    private final void rebuildLayout() {
        int i7 = this.numRows;
        float dpToPx = SizeUtilsKt.getDpToPx(this.rowHeight);
        if (i7 == 0 || dpToPx <= 1.0E-4f) {
            this.paths = n0.f14659d;
            return;
        }
        int i10 = i7 <= 1 ? 0 : 1;
        ArrayList arrayList = new ArrayList(i7 + i10);
        int i11 = i7 - 1;
        for (int i12 = 0; i12 < i7; i12++) {
            arrayList.add(createSpinePath(dpToPx, i12, this.isReplySpline ? SpineDirection.BOTTOM_TO_TOP : SpineDirection.TOP_TO_BOTTOM));
            if (i12 < i11) {
                arrayList.add(createSpinePath(dpToPx, i12, SpineDirection.BOTTOM_TO_TOP));
            }
        }
        if (i10 != 0) {
            Path path = new Path();
            float strokeWidth = this.spinePaint.getStrokeWidth() / 2.0f;
            path.moveTo(strokeWidth, this.verticalPadding);
            path.lineTo(strokeWidth, (dpToPx / 2.0f) + yOfRow(dpToPx, i7 - 2));
            arrayList.add(path);
        }
        this.paths = arrayList;
    }

    private final float yOfRow(float rowHeight, int rowIndex) {
        return (rowIndex * rowHeight) + this.verticalPadding;
    }

    public final void configureAsReplySpline() {
        this.isReplySpline = true;
        this.verticalPadding = SizeUtilsKt.getDpToPx(0);
        this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
        setNumRows(1);
        addOnLayoutChangeListener(new a(0, this));
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final int getNumRows() {
        return this.numRows;
    }

    public final float getRowHeight() {
        return this.rowHeight;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int iSave = canvas.save();
        try {
            Iterator<? extends Path> it = this.paths.iterator();
            while (it.hasNext()) {
                canvas.drawPath(it.next(), this.spinePaint);
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Number numberValueOf;
        if (this.numRows == 0 || this.rowHeight == 0.0f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(widthMeasureSpec) : 0;
        float f2 = this.numRows * this.rowHeight;
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 != Integer.MIN_VALUE) {
            numberValueOf = mode2 != 1073741824 ? Float.valueOf(f2) : Integer.valueOf(View.MeasureSpec.getSize(heightMeasureSpec));
        } else {
            float size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            if (f2 > size2) {
                f2 = size2;
            }
            numberValueOf = Float.valueOf(f2);
        }
        boolean z5 = size != getMeasuredWidth();
        setMeasuredDimension(size, numberValueOf.intValue());
        if (z5) {
            rebuildLayout();
            invalidate();
        }
    }

    public final void setHorizontalPadding(int i7) {
        this.horizontalPadding = i7;
    }

    public final void setNumRows(int i7) {
        boolean z5 = this.numRows != i7;
        this.numRows = i7;
        if (!z5 || this.rowHeight <= 0.0f) {
            return;
        }
        rebuildLayout();
        invalidate();
        requestLayout();
    }

    public final void setRowHeight(float f2) {
        boolean z5 = this.rowHeight == f2;
        this.rowHeight = f2;
        if (z5 || this.numRows <= 0) {
            return;
        }
        rebuildLayout();
        invalidate();
        requestLayout();
    }

    public final void setVerticalPadding(int i7) {
        this.verticalPadding = i7;
    }

    public /* synthetic */ ChannelSpineView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelSpineView(@NotNull Context context, AttributeSet attributeSet) {
        int colorCompat;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        if (!isInEditMode()) {
            colorCompat = ThemeManagerKt.getTheme().getSpineDefault();
        } else {
            colorCompat = ColorUtilsKt.getColorCompat(context, com.discord.theme.R.color.primary_500);
        }
        paint.setColor(colorCompat);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getResources().getDimension(R.dimen.spine_width));
        paint.setStyle(Paint.Style.STROKE);
        this.spinePaint = paint;
        this.verticalPadding = SizeUtilsKt.getDpToPx(8);
        this.horizontalPadding = SizeUtilsKt.getDpToPx(0);
        this.arcRect = new RectF();
        this.paths = n0.f14659d;
        setWillNotDraw(false);
    }
}
