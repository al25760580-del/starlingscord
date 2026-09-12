package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.MediaVisualPlaceholderViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MediaVisualPlaceholderViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MediaVisualPlaceholderViewBinding;", "targetSize", "Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView$TargetSize;", "setContent", "", "state", "Lcom/discord/chat/presentation/message/view/VisualPlaceholderState;", "width", "", "height", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "radiusPx", "getSingleAspectRatio", "", "setMosaicSize", "TargetSize", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaVisualPlaceholderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaVisualPlaceholderView.kt\ncom/discord/chat/presentation/message/view/MediaVisualPlaceholderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,91:1\n311#2:92\n327#2,4:93\n312#2:97\n*S KotlinDebug\n*F\n+ 1 MediaVisualPlaceholderView.kt\ncom/discord/chat/presentation/message/view/MediaVisualPlaceholderView\n*L\n85#1:92\n85#1:93,4\n85#1:97\n*E\n"})
public final class MediaVisualPlaceholderView extends FrameLayout implements MosaicView {

    @NotNull
    private final MediaVisualPlaceholderViewBinding binding;
    private TargetSize targetSize;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaVisualPlaceholderView$TargetSize;", "", "width", "", "height", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "<init>", "(IILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;)V", "getWidth", "()I", "getHeight", "getResizeMode", "()Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TargetSize {
        private final int height;

        @NotNull
        private final MediaContainingViewResizer.ResizeMode resizeMode;
        private final int width;

        public TargetSize(int i7, int i10, @NotNull MediaContainingViewResizer.ResizeMode resizeMode) {
            Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
            this.width = i7;
            this.height = i10;
            this.resizeMode = resizeMode;
        }

        public static /* synthetic */ TargetSize copy$default(TargetSize targetSize, int i7, int i10, MediaContainingViewResizer.ResizeMode resizeMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = targetSize.width;
            }
            if ((i11 & 2) != 0) {
                i10 = targetSize.height;
            }
            if ((i11 & 4) != 0) {
                resizeMode = targetSize.resizeMode;
            }
            return targetSize.copy(i7, i10, resizeMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MediaContainingViewResizer.ResizeMode getResizeMode() {
            return this.resizeMode;
        }

        @NotNull
        public final TargetSize copy(int width, int height, @NotNull MediaContainingViewResizer.ResizeMode resizeMode) {
            Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
            return new TargetSize(width, height, resizeMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetSize)) {
                return false;
            }
            TargetSize targetSize = (TargetSize) other;
            return this.width == targetSize.width && this.height == targetSize.height && this.resizeMode == targetSize.resizeMode;
        }

        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final MediaContainingViewResizer.ResizeMode getResizeMode() {
            return this.resizeMode;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.resizeMode.hashCode() + com.discord.chat.presentation.list.a.u(this.height, Integer.hashCode(this.width) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.width;
            int i10 = this.height;
            MediaContainingViewResizer.ResizeMode resizeMode = this.resizeMode;
            StringBuilder sbR = a3.e.r(i7, "TargetSize(width=", i10, ", height=", ", resizeMode=");
            sbR.append(resizeMode);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisualPlaceholderState.values().length];
            try {
                iArr[VisualPlaceholderState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisualPlaceholderState.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisualPlaceholderState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaVisualPlaceholderView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final MediaVisualPlaceholderViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
    public float getSingleAspectRatio() {
        TargetSize targetSize = this.targetSize;
        TargetSize targetSize2 = null;
        if (targetSize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetSize");
            targetSize = null;
        }
        float width = targetSize.getWidth();
        TargetSize targetSize3 = this.targetSize;
        if (targetSize3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetSize");
        } else {
            targetSize2 = targetSize3;
        }
        return width / targetSize2.getHeight();
    }

    public final void setContent(@NotNull VisualPlaceholderState state, int width, int height, @NotNull MediaContainingViewResizer.ResizeMode resizeMode, int radiusPx) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
        this.targetSize = new TargetSize(width, height, resizeMode);
        ConstraintLayout container = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewClippingUtilsKt.clipToRoundedRectangle(container, radiusPx);
        this.binding.container.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModNormal());
        this.binding.imageInvalid.setVisibility(8);
        int i7 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new rn.n();
                }
                this.binding.imageInvalid.setVisibility(0);
                ((GenericDraweeHierarchy) this.binding.imageInvalid.getHierarchy()).j(com.facebook.drawee.drawable.o.f4692f);
                this.binding.imageInvalid.clearColorFilter();
                SimpleDraweeView imageInvalid = this.binding.imageInvalid;
                Intrinsics.checkNotNullExpressionValue(imageInvalid, "imageInvalid");
                ReactAssetUtilsKt.setReactAsset(imageInvalid, ThemeManager.INSTANCE.isThemeDark() ? ReactAsset.PoopDark : ReactAsset.PoopLight);
                return;
            }
            this.binding.imageInvalid.setVisibility(0);
            ((GenericDraweeHierarchy) this.binding.imageInvalid.getHierarchy()).j(com.facebook.drawee.drawable.o.f4688b);
            SimpleDraweeView imageInvalid2 = this.binding.imageInvalid;
            Intrinsics.checkNotNullExpressionValue(imageInvalid2, "imageInvalid");
            ColorUtilsKt.setTintColor(imageInvalid2, Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundModMuted()));
            SimpleDraweeView imageInvalid3 = this.binding.imageInvalid;
            Intrinsics.checkNotNullExpressionValue(imageInvalid3, "imageInvalid");
            ReactAssetUtilsKt.setReactAsset(imageInvalid3, ReactAsset.ImageBrokenIcon);
        }
    }

    @Override // com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
    public void setMosaicSize(int width, int height) {
        ConstraintLayout container = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = width;
        layoutParams.height = height;
        container.setLayoutParams(layoutParams);
    }

    public /* synthetic */ MediaVisualPlaceholderView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVisualPlaceholderView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        MediaVisualPlaceholderViewBinding mediaVisualPlaceholderViewBindingInflate = MediaVisualPlaceholderViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(mediaVisualPlaceholderViewBindingInflate, "inflate(...)");
        this.binding = mediaVisualPlaceholderViewBindingInflate;
    }
}
