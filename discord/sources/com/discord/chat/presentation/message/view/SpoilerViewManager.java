package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerViewManager;", "", "<init>", "()V", "spoilerView", "Lcom/discord/chat/presentation/message/view/SpoilerView;", "getSpoilerView", "()Lcom/discord/chat/presentation/message/view/SpoilerView;", "setSpoilerView", "(Lcom/discord/chat/presentation/message/view/SpoilerView;)V", "configureSpoiler", "", "spoilerConfig", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "parentView", "Landroid/view/ViewGroup;", "containerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewToHide", "Landroid/view/View;", "blurView", "obscureLabelVisible", "", "isObscureAwaitingScan", "showSpoiler", "radiusPx", "", "obscureHideControls", "obscureIsOpaque", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpoilerViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerViewManager.kt\ncom/discord/chat/presentation/message/view/SpoilerViewManager\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n257#2,2:73\n257#2,2:75\n*S KotlinDebug\n*F\n+ 1 SpoilerViewManager.kt\ncom/discord/chat/presentation/message/view/SpoilerViewManager\n*L\n50#1:73,2\n58#1:75,2\n*E\n"})
public final class SpoilerViewManager {
    private SpoilerView spoilerView;

    public final void configureSpoiler(SpoilerConfig spoilerConfig, @NotNull ViewGroup parentView, @NotNull ConstraintLayout containerView, @NotNull View viewToHide, View blurView, boolean obscureLabelVisible, boolean isObscureAwaitingScan, boolean showSpoiler, int radiusPx, boolean obscureHideControls, boolean obscureIsOpaque) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewToHide, "viewToHide");
        if (spoilerConfig == null && this.spoilerView == null) {
            return;
        }
        if (this.spoilerView == null) {
            this.spoilerView = SpoilerView.INSTANCE.createAndAttachSpoilerView(containerView, radiusPx);
        }
        SpoilerView spoilerView = this.spoilerView;
        if (spoilerView != null) {
            spoilerView.configure(spoilerConfig, parentView);
            if (!showSpoiler || !spoilerView.getIsOverlayVisible()) {
                if (blurView != null) {
                    blurView.setVisibility(8);
                }
                viewToHide.setImportantForAccessibility(0);
                if (showSpoiler) {
                    spoilerView.clearFocus();
                    viewToHide.requestFocus();
                    return;
                }
                return;
            }
            if (blurView != null) {
                blurView.setVisibility(0);
            }
            spoilerView.setObscureLabelVisible(obscureLabelVisible);
            spoilerView.handleObscureAwaitingScan(isObscureAwaitingScan);
            spoilerView.setRevealButtonVisible(!obscureHideControls);
            spoilerView.setOpaqueBackgroundVisible(obscureIsOpaque);
            viewToHide.setImportantForAccessibility(4);
            viewToHide.clearFocus();
        }
    }

    public final SpoilerView getSpoilerView() {
        return this.spoilerView;
    }

    public final void setSpoilerView(SpoilerView spoilerView) {
        this.spoilerView = spoilerView;
    }
}
