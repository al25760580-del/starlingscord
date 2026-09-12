package com.discord.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.discord.image.animated_image.apng.APNGImageView;
import com.discord.image.animated_image.apng.APNGView;
import com.discord.sticker.sticker_types.PNGStickerView;
import com.discord.sticker.sticker_types.RLottieImageView;
import com.discord.sticker.sticker_types.RLottieStubView;
import com.discord.sticker.sticker_types.RLottieUtils;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0002\u0010\u0015J9\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0019J@\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J7\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\rH\u0016J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0018H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/discord/sticker/StickerView;", "Lcom/discord/image/animated_image/apng/APNGImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pngView", "Lcom/discord/sticker/sticker_types/PNGStickerView;", "lottieView", "Landroid/view/View;", "asPng", "", "url", "", "widthDp", "heightDp", ViewProps.ACCESSIBILITY_LABEL, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "asApng", "animate", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)V", "asLottie", "asset", "renderMode", "asGif", "inflatePngView", "inflateLottieView", "recycleChild", "child", "showLoading", "sticker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StickerView extends APNGImageView {
    private View lottieView;
    private PNGStickerView pngView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void asApng(@NotNull String url, Integer widthDp, Integer heightDp, boolean animate, String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(url, "url");
        APNGImageView.inflateApngView$default(this, false, 1, null);
        getApngView().loadImage(new APNGView.Config(url, animate, false, widthDp, heightDp, "stickers", 4, null));
        if (accessibilityLabel != null) {
            getApngView().setContentDescription(accessibilityLabel);
        }
        APNGImageView.resetViews$default(this, getApngView(), false, 2, null);
    }

    public final void asGif(@NotNull String url, Integer widthDp, Integer heightDp, boolean animate, @NotNull String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessibilityLabel, "accessibilityLabel");
        inflatePngView();
        PNGStickerView pNGStickerView = this.pngView;
        if (pNGStickerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pngView");
            pNGStickerView = null;
        }
        pNGStickerView.loadGifImage(url, widthDp, heightDp, animate);
        PNGStickerView pNGStickerView2 = this.pngView;
        if (pNGStickerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pngView");
            pNGStickerView2 = null;
        }
        pNGStickerView2.setContentDescription(accessibilityLabel);
        PNGStickerView pNGStickerView3 = this.pngView;
        if (pNGStickerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pngView");
            pNGStickerView3 = null;
        }
        APNGImageView.resetViews$default(this, pNGStickerView3, false, 2, null);
    }

    public final void asLottie(@NotNull String url, int widthDp, int heightDp, boolean animate, @NotNull String asset, int renderMode, String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(asset, "asset");
        inflateLottieView();
        View view = this.lottieView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieView");
            view = null;
        }
        RLottieImageView rLottieImageView = view instanceof RLottieImageView ? (RLottieImageView) view : null;
        if (rLottieImageView == null) {
            return;
        }
        rLottieImageView.loadImage(new RLottieImageView.Config(url, animate, widthDp, heightDp, asset, renderMode));
        if (accessibilityLabel != null) {
            rLottieImageView.setContentDescription(accessibilityLabel);
        }
        APNGImageView.resetViews$default(this, rLottieImageView, false, 2, null);
    }

    public final void asPng(@NotNull String url, Integer widthDp, Integer heightDp, @NotNull String accessibilityLabel) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessibilityLabel, "accessibilityLabel");
        inflatePngView();
        PNGStickerView pNGStickerView = this.pngView;
        if (pNGStickerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pngView");
            pNGStickerView = null;
        }
        pNGStickerView.loadImage(url, widthDp, heightDp);
        PNGStickerView pNGStickerView2 = this.pngView;
        if (pNGStickerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pngView");
            pNGStickerView2 = null;
        }
        pNGStickerView2.setContentDescription(accessibilityLabel);
        PNGStickerView pNGStickerView3 = this.pngView;
        if (pNGStickerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pngView");
            pNGStickerView3 = null;
        }
        APNGImageView.resetViews$default(this, pNGStickerView3, false, 2, null);
    }

    public final void inflateLottieView() {
        if (this.lottieView == null) {
            View view = null;
            if (RLottieUtils.INSTANCE.getInitialized$sticker_release()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                RLottieImageView rLottieImageView = new RLottieImageView(context);
                RLottieImageView.recycle$default(rLottieImageView, false, 1, null);
                this.lottieView = rLottieImageView;
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.lottieView = new RLottieStubView(context2);
            }
            View view2 = this.lottieView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lottieView");
            } else {
                view = view2;
            }
            addView(view);
        }
    }

    public final void inflatePngView() {
        if (this.pngView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PNGStickerView pNGStickerView = new PNGStickerView(context);
            this.pngView = pNGStickerView;
            addView(pNGStickerView);
        }
    }

    @Override // com.discord.image.animated_image.apng.APNGImageView
    public void recycleChild(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.recycleChild(child);
        RLottieImageView rLottieImageView = child instanceof RLottieImageView ? (RLottieImageView) child : null;
        if (rLottieImageView != null) {
            rLottieImageView.recycle(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StickerView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    @Override // com.discord.image.animated_image.apng.APNGImageView
    public void recycleChild(@NotNull View child, boolean showLoading) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.recycleChild(child);
        RLottieImageView rLottieImageView = child instanceof RLottieImageView ? (RLottieImageView) child : null;
        if (rLottieImageView != null) {
            rLottieImageView.recycle(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
