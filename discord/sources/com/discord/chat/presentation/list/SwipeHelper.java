package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import com.discord.chat.R;
import com.discord.device.utils.DeviceReducedMotion;
import com.discord.misc.utilities.drawable.GetDrawableCompatKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lo.j;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001SB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010'\u001a\u00020\u0012H\u0002J\u0018\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0016J \u0010,\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000eH\u0016J\u001a\u0010.\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000e2\u0006\u0010/\u001a\u00020\u0019H\u0016J\b\u00100\u001a\u00020\u001bH\u0016J\b\u00101\u001a\u00020\u001bH\u0016J\u0018\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0019H\u0016J\u001a\u00104\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0016J(\u00105\u001a\u0002062\u0006\u0010)\u001a\u00020*2\u0006\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0012H\u0016J$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120;2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0012H\u0016J@\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020@2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u001bH\u0016J\u0010\u0010C\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u000eH\u0002J\u0018\u0010D\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0002J\u0010\u0010E\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010F\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u000eH\u0002J\u0018\u0010H\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0002J\u0018\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0002J\u0010\u0010L\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0002J\u0010\u0010M\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0002J\u0010\u0010N\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0002J\u0010\u0010O\u001a\u00020\u00062\u0006\u0010P\u001a\u00020@H\u0002J\u0018\u0010Q\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000eH\u0002J\b\u0010R\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper;", "Lcom/discord/chat/presentation/list/ChatListCallback;", "context", "Landroid/content/Context;", "onStart", "Lkotlin/Function0;", "", "onEnd", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "replyIcon", "Landroid/graphics/drawable/Drawable;", "editIcon", "currentItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "dX", "", "easterEggArrowAnimator", "Landroid/animation/ValueAnimator;", "easterEggArrowScale", "easterEggArrowRotationAnimator", "easterEggArrowRotationDegrees", "easterEggPullCount", "", "easterEggIsAnimating", "", "swipeBack", "shouldPerformHapticFeedback", "shouldTriggerReply", "isActive", "isCompleted", "actionType", "Lcom/discord/chat/presentation/list/SwipeActionType;", "editCircleScaleAnimator", "editCircleScale", "handler", "Landroid/os/Handler;", "getSwipeProgress", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "onMove", "target", "onSelectedChanged", "actionState", "shouldReturnToOriginalPosition", "shouldUseSpringyExit", "onSwiped", "direction", "onReleased", "getAnimationDuration", "", "animationType", "animateDx", "animateDy", "getEffectiveDxDy", "Landroid/util/Pair;", "rawDx", "rawDy", "onChildDraw", "c", "Landroid/graphics/Canvas;", "dY", "isCurrentlyActive", "shouldStartEditEntrance", "updateEditTransition", "triggerEditExitTransition", "triggerEditEntranceTransition", "updateShadow", "easterEggStartAnimation", "getLeftBevelRadius", ReactProgressBarViewManager.PROP_PROGRESS, "contentHeight", "getArrowContainerBaseSize", "getArrowContainerGrowthRatio", "getArrowIconBaseSize", "drawContextArea", "canvas", "updateHapticFeedbackTrigger", "updateReplyTrigger", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwipeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeHelper.kt\ncom/discord/chat/presentation/list/SwipeHelper\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,549:1\n29#2:550\n85#2,18:551\n29#2:569\n85#2,18:570\n404#3:588\n74#4,15:589\n27#4,7:604\n*S KotlinDebug\n*F\n+ 1 SwipeHelper.kt\ncom/discord/chat/presentation/list/SwipeHelper\n*L\n267#1:550\n267#1:551,18\n344#1:569\n344#1:570,18\n463#1:588\n468#1:589,15\n515#1:604,7\n*E\n"})
public final class SwipeHelper extends ChatListCallback {
    private static final long ANIM_RETURN_DURATION = 300;

    @NotNull
    private static final String ANIM_VALUE_ARROW_ROTATION = "arrow-rotation";

    @NotNull
    private static final String ANIM_VALUE_ARROW_SCALE = "arrow-scale";

    @NotNull
    private static final String ANIM_VALUE_EDIT_CIRCLE_SCALE = "edit-circle-scale";
    private static final int EDIT_OFFSET_X;
    private static final int HAPTIC_RESET_X;
    private static final int HAPTIC_TRIGGER_X;
    private static final int MAX_CONTEXT_AREA_WIDTH;
    private static final int MAX_LEFT_BEVEL_RADIUS;
    private static final int MAX_RIGHT_BEVEL_WIDTH;
    private static final int REPLY_RESET_X;
    private static final int RIGHT_BEVEL_HEIGHT;
    private static final int SWIPE_STOP_OFFSET_X;

    @NotNull
    private SwipeActionType actionType;

    @NotNull
    private final Context context;
    private RecyclerView.ViewHolder currentItemViewHolder;
    private float dX;
    private ValueAnimator easterEggArrowAnimator;
    private ValueAnimator easterEggArrowRotationAnimator;
    private float easterEggArrowRotationDegrees;
    private float easterEggArrowScale;
    private boolean easterEggIsAnimating;
    private int easterEggPullCount;
    private float editCircleScale;
    private ValueAnimator editCircleScaleAnimator;
    private Drawable editIcon;

    @NotNull
    private final Handler handler;
    private boolean isActive;
    private boolean isCompleted;
    private View mView;

    @NotNull
    private final Function0<Unit> onEnd;

    @NotNull
    private final Function0<Unit> onStart;
    private Drawable replyIcon;
    private boolean shouldPerformHapticFeedback;
    private boolean shouldTriggerReply;
    private boolean swipeBack;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeActionType.values().length];
            try {
                iArr[SwipeActionType.Reply.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeActionType.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(80);
        MAX_CONTEXT_AREA_WIDTH = dpToPx;
        int i7 = -dpToPx;
        SWIPE_STOP_OFFSET_X = i7;
        HAPTIC_TRIGGER_X = i7;
        int dpToPx2 = SizeUtilsKt.getDpToPx(-60);
        HAPTIC_RESET_X = dpToPx2;
        REPLY_RESET_X = dpToPx2;
        EDIT_OFFSET_X = SizeUtilsKt.getDpToPx(-130);
        MAX_RIGHT_BEVEL_WIDTH = SizeUtilsKt.getDpToPx(32);
        RIGHT_BEVEL_HEIGHT = SizeUtilsKt.getDpToPx(24);
        MAX_LEFT_BEVEL_RADIUS = SizeUtilsKt.getDpToPx(16);
    }

    public SwipeHelper(@NotNull Context context, @NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        this.context = context;
        this.onStart = onStart;
        this.onEnd = onEnd;
        this.replyIcon = GetDrawableCompatKt.getDrawableCompat(context, R.drawable.ic_swipe_reply);
        this.editIcon = GetDrawableCompatKt.getDrawableCompat(context, R.drawable.ic_swipe_edit);
        this.easterEggArrowScale = 1.0f;
        this.shouldPerformHapticFeedback = true;
        this.actionType = SwipeActionType.Reply;
        this.handler = new Handler(context.getMainLooper());
    }

    private final void drawContextArea(Canvas canvas) {
        if (this.currentItemViewHolder == null || this.dX == 0.0f) {
            return;
        }
        View view = this.mView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view = null;
        }
        float fAbs = Math.abs(view.getTranslationX());
        View view2 = this.mView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view2 = null;
        }
        float measuredHeight = view2.getMeasuredHeight();
        Paint paint = new Paint();
        RecyclerView.ViewHolder viewHolder = this.currentItemViewHolder;
        KeyEvent.Callback callback = viewHolder != null ? viewHolder.itemView : null;
        SwipeReplyInitiator swipeReplyInitiator = callback instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) callback : null;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        if (swipeReplyInitiator == null || !swipeReplyInitiator.getUsingGradientTheme()) {
            paint.setColor(ThemeManagerKt.getTheme().getChatSwipeToReplyBackground());
        } else {
            paint.setColor(ThemeManagerKt.getTheme().getChatSwipeToReplyGradientBackground());
        }
        canvas.save();
        float swipeProgress = getSwipeProgress();
        float leftBevelRadius = getLeftBevelRadius(swipeProgress, measuredHeight);
        float f2 = MAX_RIGHT_BEVEL_WIDTH * swipeProgress;
        View view3 = this.mView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view3 = null;
        }
        float measuredWidth = view3.getMeasuredWidth();
        View view4 = this.mView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view4 = null;
        }
        float translationX = view4.getTranslationX() + measuredWidth;
        float f7 = translationX - leftBevelRadius;
        float f10 = translationX + fAbs;
        float f11 = f10 - f2;
        View view5 = this.mView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view5 = null;
        }
        float top = view5.getTop();
        int i7 = RIGHT_BEVEL_HEIGHT;
        float f12 = top - i7;
        float f13 = f12 + i7;
        float f14 = f12 + measuredHeight + (i7 * 2);
        float f15 = f14 - i7;
        Path path = new Path();
        path.moveTo(f11, f15);
        path.lineTo(translationX, f15);
        path.lineTo(translationX, f13 + leftBevelRadius);
        float f16 = f7 - leftBevelRadius;
        float f17 = 2;
        path.addArc(f16, f13, translationX, (f17 * leftBevelRadius) + f13, 0.0f, -90.0f);
        path.lineTo(f11, f13);
        float f18 = (f2 * 0.55f) + f11;
        path.cubicTo(f18, f13, f10, (i7 * 0.55f) + f12, f10, f12);
        path.lineTo(f10, f14);
        path.cubicTo(f10, f14 - (i7 * 0.55f), f18, f15, f11, f15);
        canvas.save();
        canvas.clipPath(path);
        canvas.drawRect(f7, f12, f10, f14, paint);
        canvas.restore();
        canvas.save();
        path.reset();
        float f19 = f15 - leftBevelRadius;
        path.addCircle(f7, f19, leftBevelRadius, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawRect(f7, f19, translationX, f15, paint);
        canvas.restore();
        float arrowContainerBaseSize = getArrowContainerBaseSize(measuredHeight) / f17;
        int iD = j.d(((int) (JfifUtil.MARKER_SOFn * swipeProgress)) + 64, 0, 255);
        canvas.save();
        canvas.clipRect(translationX, 0.0f, f10, canvas.getHeight());
        canvas.translate((((fAbs / f17) + translationX) - arrowContainerBaseSize) + arrowContainerBaseSize, ((int) (((measuredHeight / f17) + f13) - arrowContainerBaseSize)) + arrowContainerBaseSize);
        float f20 = this.easterEggArrowScale;
        canvas.scale(f20, f20);
        float f21 = this.isCompleted ? 1.0f : swipeProgress;
        paint.setColor(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getBackgroundSurfaceHighest(), ColorUtilsKt.getColorCompat(this.context, com.discord.theme.R.color.brand_500), f21, 0.8f, 1.0f));
        paint.setStyle(style);
        paint.setAlpha(iD);
        paint.setShadowLayer(10.0f, 0.0f, 5.0f, Color.parseColor(ThemeManager.INSTANCE.isThemeLight() ? "#16000000" : "#24000000"));
        canvas.drawCircle(0.0f, 0.0f, arrowContainerBaseSize, paint);
        paint.clearShadowLayer();
        float f22 = this.editCircleScale;
        if (f22 > 0.0f) {
            int iSave = canvas.save();
            canvas.scale(f22, f22, 0.0f, 0.0f);
            try {
                paint.setColor(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getBackgroundSurfaceHighest(), ThemeManagerKt.getTheme().getInteractiveBackgroundSelected(), this.isCompleted ? 1.0f : swipeProgress, 0.8f, 1.0f));
                paint.setStyle(style);
                paint.setAlpha(255);
                canvas.drawCircle(0.0f, 0.0f, arrowContainerBaseSize, paint);
                canvas.restoreToCount(iSave);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave);
                throw th2;
            }
        }
        canvas.save();
        float fMax = Math.max(0.0f, Float.min(1.0f, 1 - this.editCircleScale));
        float arrowIconBaseSize = getArrowIconBaseSize(measuredHeight);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getInteractiveTextDefault(), ColorUtilsKt.getColorCompat(this.context, com.discord.theme.R.color.white), f21, 0.8f, 1.0f), PorterDuff.Mode.SRC_ATOP);
        Drawable drawable = this.replyIcon;
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilter);
        }
        float f23 = DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context) ? 0.0f : (1.0f - swipeProgress) * 90.0f;
        float f24 = this.easterEggArrowRotationDegrees;
        canvas.translate(-1.0f, -1.0f);
        float f25 = f23 + f24;
        canvas.rotate(f25);
        canvas.scale(fMax, fMax);
        int i10 = (int) (arrowIconBaseSize / 2.0f);
        int i11 = -i10;
        Rect rect = new Rect(i11, i11, i10, i10);
        Drawable drawable2 = this.replyIcon;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        Drawable drawable3 = this.replyIcon;
        if (drawable3 != null) {
            drawable3.setAlpha(iD);
        }
        Drawable drawable4 = this.replyIcon;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
        canvas.restore();
        if (this.editCircleScale > 0.0f) {
            int iSave2 = canvas.save();
            try {
                Drawable drawable5 = this.editIcon;
                if (drawable5 != null) {
                    drawable5.setColorFilter(porterDuffColorFilter);
                }
                canvas.rotate(f25);
                float f26 = this.editCircleScale;
                canvas.scale(f26, f26);
                Drawable drawable6 = this.editIcon;
                if (drawable6 != null) {
                    drawable6.setBounds(rect);
                }
                Drawable drawable7 = this.editIcon;
                if (drawable7 != null) {
                    drawable7.setAlpha(255);
                }
                Drawable drawable8 = this.editIcon;
                if (drawable8 != null) {
                    drawable8.draw(canvas);
                }
                canvas.restoreToCount(iSave2);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave2);
                throw th3;
            }
        }
        canvas.restore();
    }

    private final void easterEggStartAnimation(final RecyclerView recyclerView, final RecyclerView.ViewHolder viewHolder) {
        if (DeviceReducedMotion.INSTANCE.isReducedMotionEnabled(this.context)) {
            return;
        }
        View view = this.mView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view = null;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_SCALE, 1.0f, getArrowContainerGrowthRatio(view.getMeasuredHeight()), 1.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfFloat);
        valueAnimator.setDuration(ANIM_RETURN_DURATION);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new g(this, recyclerView, 0));
        this.easterEggArrowAnimator = valueAnimator;
        valueAnimator.start();
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_ROTATION, 720.0f, 0.0f);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setValues(propertyValuesHolderOfFloat2);
        valueAnimator2.setDuration(800L);
        valueAnimator2.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f));
        valueAnimator2.addUpdateListener(new g(this, recyclerView, 1));
        valueAnimator2.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.SwipeHelper$easterEggStartAnimation$lambda$9$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.easterEggIsAnimating = false;
                this.this$0.easterEggPullCount = 0;
                if (this.this$0.shouldStartEditEntrance(viewHolder)) {
                    this.this$0.triggerEditEntranceTransition(recyclerView);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.easterEggArrowRotationAnimator = valueAnimator2;
        valueAnimator2.start();
        this.easterEggIsAnimating = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void easterEggStartAnimation$lambda$6$lambda$5(SwipeHelper swipeHelper, RecyclerView recyclerView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_ARROW_SCALE);
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        swipeHelper.easterEggArrowScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void easterEggStartAnimation$lambda$9$lambda$7(SwipeHelper swipeHelper, RecyclerView recyclerView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_ARROW_ROTATION);
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        swipeHelper.easterEggArrowRotationDegrees = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final float getArrowContainerBaseSize(float contentHeight) {
        return Float.min(contentHeight - SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(40));
    }

    private final float getArrowContainerGrowthRatio(float contentHeight) {
        float arrowContainerBaseSize = getArrowContainerBaseSize(contentHeight);
        if (arrowContainerBaseSize * 1.3f > contentHeight) {
            return contentHeight / arrowContainerBaseSize;
        }
        return 1.3f;
    }

    private final float getArrowIconBaseSize(float contentHeight) {
        return getArrowContainerBaseSize(contentHeight) * 0.6f;
    }

    private final float getLeftBevelRadius(float progress, float contentHeight) {
        return Float.min(MAX_LEFT_BEVEL_RADIUS, (contentHeight - 8) / 2.0f) * progress;
    }

    private final float getSwipeProgress() {
        View view = this.mView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view = null;
        }
        return Math.max(0.0f, Float.min(view.getTranslationX() / SWIPE_STOP_OFFSET_X, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldStartEditEntrance(RecyclerView.ViewHolder viewHolder) {
        ValueAnimator valueAnimator;
        if (this.actionType == SwipeActionType.Reply) {
            View view = this.mView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            if (view.getTranslationX() <= EDIT_OFFSET_X && (((valueAnimator = this.editCircleScaleAnimator) == null || !valueAnimator.isRunning()) && !this.easterEggIsAnimating)) {
                KeyEvent.Callback callback = viewHolder.itemView;
                SwipeReplyInitiator swipeReplyInitiator = callback instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) callback : null;
                if (swipeReplyInitiator != null && swipeReplyInitiator.getEnableSwipeToEdit()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerEditEntranceTransition(RecyclerView recyclerView) {
        View view = this.mView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            view = null;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_EDIT_CIRCLE_SCALE, this.editCircleScale, getArrowContainerGrowthRatio(view.getMeasuredHeight()), 1.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfFloat);
        valueAnimator.setDuration(ANIM_RETURN_DURATION);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new g(this, recyclerView, 3));
        this.editCircleScaleAnimator = valueAnimator;
        valueAnimator.start();
        this.actionType = SwipeActionType.Edit;
        View view3 = this.mView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        } else {
            view2 = view3;
        }
        view2.performHapticFeedback(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerEditEntranceTransition$lambda$4$lambda$3(SwipeHelper swipeHelper, RecyclerView recyclerView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_EDIT_CIRCLE_SCALE);
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        swipeHelper.editCircleScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void triggerEditExitTransition(RecyclerView recyclerView) {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_EDIT_CIRCLE_SCALE, this.editCircleScale, 0.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(propertyValuesHolderOfFloat);
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new g(this, recyclerView, 2));
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.SwipeHelper$triggerEditExitTransition$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.actionType = SwipeActionType.Reply;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.editCircleScaleAnimator = valueAnimator;
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void triggerEditExitTransition$lambda$2$lambda$0(SwipeHelper swipeHelper, RecyclerView recyclerView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_EDIT_CIRCLE_SCALE);
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        swipeHelper.editCircleScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void updateEditTransition(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        ValueAnimator valueAnimator;
        if (this.isCompleted) {
            return;
        }
        if (this.actionType == SwipeActionType.Edit) {
            View view = this.mView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view = null;
            }
            if (view.getTranslationX() > REPLY_RESET_X && ((valueAnimator = this.editCircleScaleAnimator) == null || !valueAnimator.isRunning())) {
                triggerEditExitTransition(recyclerView);
                return;
            }
        }
        if (shouldStartEditEntrance(viewHolder)) {
            triggerEditEntranceTransition(recyclerView);
        }
    }

    private final void updateHapticFeedbackTrigger(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view = null;
        if (this.shouldPerformHapticFeedback) {
            View view2 = this.mView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view2 = null;
            }
            if (view2.getTranslationX() <= HAPTIC_TRIGGER_X) {
                View view3 = this.mView;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mView");
                } else {
                    view = view3;
                }
                view.performHapticFeedback(0);
                this.shouldPerformHapticFeedback = false;
                int i7 = this.easterEggPullCount + 1;
                this.easterEggPullCount = i7;
                if (i7 != 3 || this.easterEggIsAnimating) {
                    return;
                }
                easterEggStartAnimation(recyclerView, viewHolder);
                return;
            }
        }
        if (this.shouldPerformHapticFeedback) {
            return;
        }
        View view4 = this.mView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        } else {
            view = view4;
        }
        if (view.getTranslationX() >= HAPTIC_RESET_X) {
            this.shouldPerformHapticFeedback = true;
        }
    }

    private final void updateReplyTrigger() {
        View view = null;
        if (this.shouldTriggerReply) {
            View view2 = this.mView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                view2 = null;
            }
            if (view2.getTranslationX() > REPLY_RESET_X) {
                this.shouldTriggerReply = false;
                return;
            }
        }
        if (this.shouldTriggerReply) {
            return;
        }
        View view3 = this.mView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        } else {
            view = view3;
        }
        if (view.getTranslationX() <= HAPTIC_TRIGGER_X) {
            this.shouldTriggerReply = true;
        }
    }

    private final void updateShadow(RecyclerView.ViewHolder viewHolder) {
        KeyEvent.Callback callback = viewHolder.itemView;
        View view = null;
        SwipeReplyInitiator swipeReplyInitiator = callback instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) callback : null;
        if (swipeReplyInitiator != null) {
            float swipeProgress = getSwipeProgress();
            float dpToPx = SizeUtilsKt.getDpToPx(12) * swipeProgress;
            View view2 = this.mView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
            } else {
                view = view2;
            }
            swipeReplyInitiator.getShadowView().setParams(dpToPx, getLeftBevelRadius(swipeProgress, view.getMeasuredHeight()), ThemeManager.INSTANCE.isThemeLight() ? "#1F000000" : "#3E000000");
        }
    }

    @Override // androidx.recyclerview.widget.h0
    public long getAnimationDuration(@NotNull RecyclerView recyclerView, int animationType, float animateDx, float animateDy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        return ANIM_RETURN_DURATION;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    @NotNull
    public Pair<Float, Float> getEffectiveDxDy(float rawDx, float rawDy) {
        int i7 = SWIPE_STOP_OFFSET_X;
        if (rawDx >= i7) {
            return new Pair<>(Float.valueOf(rawDx), Float.valueOf(rawDy));
        }
        return new Pair<>(Float.valueOf(i7 - (((float) Math.atan(Math.abs(rawDx - i7) / 120.0f)) * 120.0f)), Float.valueOf(rawDy));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.h0
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        this.mView = view;
        SwipeReplyInitiator swipeReplyInitiator = view instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) view : null;
        return h0.makeMovementFlags(0, (swipeReplyInitiator == null || !swipeReplyInitiator.getEnableSwipeToReply()) ? 0 : 4);
    }

    @Override // androidx.recyclerview.widget.h0
    public void onChildDraw(@NotNull Canvas c8, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDraw(c8, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        this.dX = dX;
        this.currentItemViewHolder = viewHolder;
        drawContextArea(c8);
        updateHapticFeedbackTrigger(recyclerView, viewHolder);
        updateReplyTrigger();
        updateShadow(viewHolder);
        updateEditTransition(recyclerView, viewHolder);
        if (this.swipeBack && this.isActive && dX >= -1.0f) {
            this.onEnd.invoke();
            KeyEvent.Callback callback = viewHolder.itemView;
            SwipeReplyInitiator swipeReplyInitiator = callback instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) callback : null;
            if (swipeReplyInitiator != null) {
                swipeReplyInitiator.onSwipeEnd();
            }
            this.isActive = false;
        }
    }

    @Override // androidx.recyclerview.widget.h0
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public void onReleased(@NotNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.swipeBack = true;
        if (this.shouldTriggerReply) {
            KeyEvent.Callback callback = viewHolder != null ? viewHolder.itemView : null;
            SwipeReplyInitiator swipeReplyInitiator = callback instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) callback : null;
            if (swipeReplyInitiator != null) {
                int i7 = WhenMappings.$EnumSwitchMapping$0[this.actionType.ordinal()];
                if (i7 == 1) {
                    swipeReplyInitiator.getOnInitiateReply().invoke();
                } else {
                    if (i7 != 2) {
                        throw new n();
                    }
                    swipeReplyInitiator.getOnInitiateEdit().invoke();
                }
                this.isCompleted = true;
            }
        }
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.recyclerview.widget.h0
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        this.swipeBack = viewHolder == null && actionState == 0;
        if (actionState != 1 || this.isActive) {
            return;
        }
        this.onStart.invoke();
        View view = viewHolder != null ? viewHolder.itemView : null;
        SwipeReplyInitiator swipeReplyInitiator = view instanceof SwipeReplyInitiator ? (SwipeReplyInitiator) view : null;
        if (swipeReplyInitiator != null) {
            swipeReplyInitiator.onSwipeStart();
            this.isCompleted = false;
            this.actionType = SwipeActionType.Reply;
            this.editCircleScale = 0.0f;
        }
        this.easterEggPullCount = 0;
        this.isActive = true;
    }

    @Override // androidx.recyclerview.widget.h0
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int direction) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public boolean shouldReturnToOriginalPosition() {
        return true;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    /* JADX INFO: renamed from: shouldUseSpringyExit, reason: from getter */
    public boolean getShouldTriggerReply() {
        return this.shouldTriggerReply;
    }
}
