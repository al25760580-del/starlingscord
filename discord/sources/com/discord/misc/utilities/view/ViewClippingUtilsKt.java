package com.discord.misc.utilities.view;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\r"}, d2 = {"circleOutlineProvider", "com/discord/misc/utilities/view/ViewClippingUtilsKt$circleOutlineProvider$1", "Lcom/discord/misc/utilities/view/ViewClippingUtilsKt$circleOutlineProvider$1;", "clipToCircle", "", "Landroid/view/View;", "clipToRoundedRectangle", "radiusPx", "", "clipToRoundedStartEdge", "clipToOutline", "outlineProvider", "Landroid/view/ViewOutlineProvider;", "misc_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ViewClippingUtilsKt {

    @NotNull
    private static final ViewClippingUtilsKt$circleOutlineProvider$1 circleOutlineProvider = new ViewOutlineProvider() { // from class: com.discord.misc.utilities.view.ViewClippingUtilsKt$circleOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), view.getHeight() / 2.0f);
        }
    };

    public static final void clipToCircle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        clipToOutline(view, circleOutlineProvider);
    }

    private static final void clipToOutline(View view, ViewOutlineProvider viewOutlineProvider) {
        view.setClipToOutline(true);
        view.setOutlineProvider(viewOutlineProvider);
    }

    public static final void clipToRoundedRectangle(@NotNull View view, final int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        clipToOutline(view, new ViewOutlineProvider() { // from class: com.discord.misc.utilities.view.ViewClippingUtilsKt.clipToRoundedRectangle.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), i7);
            }
        });
    }

    public static final void clipToRoundedStartEdge(@NotNull View view, final int i7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        clipToOutline(view, new ViewOutlineProvider() { // from class: com.discord.misc.utilities.view.ViewClippingUtilsKt.clipToRoundedStartEdge.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                int layoutDirection = view2.getLayoutDirection();
                if (layoutDirection == 0) {
                    outline.setRoundRect(0, 0, view2.getWidth() + i7, view2.getHeight(), i7);
                } else {
                    if (layoutDirection != 1) {
                        return;
                    }
                    outline.setRoundRect(-i7, 0, view2.getWidth(), view2.getHeight(), i7);
                }
            }
        });
    }
}
