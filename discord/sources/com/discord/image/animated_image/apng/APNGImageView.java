package com.discord.image.animated_image.apng;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.x0;
import co.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0014J\u001a\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0017J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001dH\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/discord/image/animated_image/apng/APNGImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "apngView", "Lcom/discord/image/animated_image/apng/APNGView;", "getApngView", "()Lcom/discord/image/animated_image/apng/APNGView;", "setApngView", "(Lcom/discord/image/animated_image/apng/APNGView;)V", "eventHandler", "Lcom/discord/image/animated_image/apng/APNGImageView$APNGImageViewEventHandler;", "getEventHandler", "()Lcom/discord/image/animated_image/apng/APNGImageView$APNGImageViewEventHandler;", "setEventHandler", "(Lcom/discord/image/animated_image/apng/APNGImageView$APNGImageViewEventHandler;)V", "recycle", "", "inflateApngView", "showLoading", "", "resetViews", "visibleView", "Landroid/view/View;", "recycleChild", "child", "APNGImageViewEventHandler", "animated_image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAPNGImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APNGImageView.kt\ncom/discord/image/animated_image/apng/APNGImageView\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,61:1\n1321#2:62\n1322#2:65\n257#3,2:63\n*S KotlinDebug\n*F\n+ 1 APNGImageView.kt\ncom/discord/image/animated_image/apng/APNGImageView\n*L\n42#1:62\n42#1:65\n47#1:63,2\n*E\n"})
public abstract class APNGImageView extends FrameLayout {
    protected APNGView apngView;
    private APNGImageViewEventHandler eventHandler;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/image/animated_image/apng/APNGImageView$APNGImageViewEventHandler;", "", "onImageLoaded", "", "url", "", "animated_image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface APNGImageViewEventHandler {
        void onImageLoaded(@NotNull String url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public APNGImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void inflateApngView$default(APNGImageView aPNGImageView, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inflateApngView");
        }
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        aPNGImageView.inflateApngView(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inflateApngView$lambda$0(APNGImageView aPNGImageView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        APNGImageViewEventHandler aPNGImageViewEventHandler = aPNGImageView.eventHandler;
        if (aPNGImageViewEventHandler != null) {
            aPNGImageViewEventHandler.onImageLoaded(url);
        }
        return Unit.f14616a;
    }

    public static /* synthetic */ void recycleChild$default(APNGImageView aPNGImageView, View view, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recycleChild");
        }
        if ((i7 & 2) != 0) {
            z5 = true;
        }
        aPNGImageView.recycleChild(view, z5);
    }

    public static /* synthetic */ void resetViews$default(APNGImageView aPNGImageView, View view, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetViews");
        }
        if ((i7 & 1) != 0) {
            view = null;
        }
        if ((i7 & 2) != 0) {
            z5 = true;
        }
        aPNGImageView.resetViews(view, z5);
    }

    @NotNull
    public final APNGView getApngView() {
        APNGView aPNGView = this.apngView;
        if (aPNGView != null) {
            return aPNGView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apngView");
        return null;
    }

    public final APNGImageViewEventHandler getEventHandler() {
        return this.eventHandler;
    }

    public final void inflateApngView(boolean showLoading) {
        if (this.apngView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setApngView(new APNGView(context));
            getApngView().recycle(false, showLoading);
            getApngView().setId(View.generateViewId());
            getApngView().setOnImageLoaded(new s(13, this));
            addView(getApngView());
        }
    }

    public final void recycle() {
        resetViews$default(this, null, false, 3, null);
    }

    public void recycleChild(@NotNull View child, boolean showLoading) {
        Intrinsics.checkNotNullParameter(child, "child");
        APNGView aPNGView = child instanceof APNGView ? (APNGView) child : null;
        if (aPNGView != null) {
            aPNGView.recycle(true, showLoading);
        }
    }

    public void resetViews(View visibleView, boolean showLoading) {
        for (View view : new x0(this)) {
            boolean zAreEqual = Intrinsics.areEqual(view, visibleView);
            if (!zAreEqual) {
                recycleChild(view, showLoading);
            }
            view.setVisibility(zAreEqual ? 0 : 8);
        }
    }

    public final void setApngView(@NotNull APNGView aPNGView) {
        Intrinsics.checkNotNullParameter(aPNGView, "<set-?>");
        this.apngView = aPNGView;
    }

    public final void setEventHandler(APNGImageViewEventHandler aPNGImageViewEventHandler) {
        this.eventHandler = aPNGImageViewEventHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public APNGImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void recycleChild(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        APNGView aPNGView = child instanceof APNGView ? (APNGView) child : null;
        if (aPNGView != null) {
            APNGView.recycle$default(aPNGView, true, false, 2, null);
        }
    }

    public /* synthetic */ APNGImageView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGImageView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
