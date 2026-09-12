package com.discord.chat.presentation.message.view.botuikit.components;

import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.core.view.g0;
import androidx.core.view.u0;
import com.discord.R;
import com.discord.chat.bridge.botuikit.ContentInventoryEntry;
import com.discord.chat.bridge.botuikit.ContentInventoryEntryClickable;
import com.discord.chat.presentation.message.d;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.UserId;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"applyClickable", "", "Landroid/view/View;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "entry", "Lcom/discord/chat/bridge/botuikit/ContentInventoryEntry;", "clickable", "Lcom/discord/chat/bridge/botuikit/ContentInventoryEntryClickable;", "tappedElement", "", "getContentControllerListener", "Lcom/facebook/drawee/controller/ControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "imageView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "chat_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContentInventoryComponentViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyClickable(View view, ComponentContext componentContext, ContentInventoryEntry contentInventoryEntry, ContentInventoryEntryClickable contentInventoryEntryClickable, String str) {
        if (contentInventoryEntryClickable == null) {
            view.setOnClickListener(null);
        } else {
            view.setContentDescription(contentInventoryEntryClickable.getAriaDescription());
            view.setOnClickListener(new d(componentContext, contentInventoryEntry, str));
        }
        boolean z5 = contentInventoryEntryClickable != null;
        WeakHashMap weakHashMap = u0.f1729a;
        new g0(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view, Boolean.valueOf(z5));
        view.setClickable(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyClickable$lambda$0(ComponentContext componentContext, ContentInventoryEntry contentInventoryEntry, String str, View view) {
        componentContext.getComponentActionEventHandlers().getOnTapContentInventoryEntry().invoke(UserId.m1208boximpl(contentInventoryEntry.m299getAuthorIdre6GcUE()), contentInventoryEntry.getContentId(), str);
    }

    @NotNull
    public static final ControllerListener getContentControllerListener(@NotNull final SimpleDraweeView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        return new ControllerListener() { // from class: com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentViewKt.getContentControllerListener.1
            @Override // com.facebook.drawee.controller.ControllerListener
            public void onFailure(String id2, Throwable throwable) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public void onIntermediateImageFailed(String id2, Throwable throwable) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public void onIntermediateImageSet(String id2, ImageInfo imageInfo) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public void onRelease(String id2) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public void onSubmit(String id2, Object callerContext) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public void onFinalImageSet(String id2, ImageInfo imageInfo, Animatable animatable) {
                if (imageInfo != null) {
                    imageView.getLayoutParams().width = -2;
                    imageView.getLayoutParams().height = SizeUtilsKt.getDpToPx(64);
                    imageView.setAspectRatio(imageInfo.getWidth() / imageInfo.getHeight());
                }
            }
        };
    }
}
