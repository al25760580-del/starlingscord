package com.discord.chat.presentation.media;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/media/MediaContainingViewResizer;", "", "<init>", "()V", "resizeLayoutParams", "", "Landroid/view/View;", "targetWidthPx", "", "targetHeightPx", "maxWidthPx", "maxHeightPx", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "ResizeMode", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaContainingViewResizer {

    @NotNull
    public static final MediaContainingViewResizer INSTANCE = new MediaContainingViewResizer();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "", "<init>", "(Ljava/lang/String;I)V", "Fill", "Wrap", "Cover", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ResizeMode {
        Fill,
        Wrap,
        Cover;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    private MediaContainingViewResizer() {
    }

    public static /* synthetic */ void resizeLayoutParams$default(MediaContainingViewResizer mediaContainingViewResizer, View view, int i7, int i10, int i11, int i12, ResizeMode resizeMode, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            resizeMode = ResizeMode.Fill;
        }
        mediaContainingViewResizer.resizeLayoutParams(view, i7, i10, i11, i12, resizeMode);
    }

    public final void resizeLayoutParams(@NotNull View view, int i7, int i10, int i11, int i12, @NotNull ResizeMode resizeMode) {
        float fMin;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
        boolean z5 = resizeMode == ResizeMode.Fill || resizeMode == ResizeMode.Cover || i7 > i11 || i10 > i12;
        float f2 = view.getResources().getDisplayMetrics().density;
        float fMin2 = 1.0f;
        if (z5) {
            float f7 = i7;
            fMin = Math.min(i11, f7 * f2) / f7;
        } else {
            fMin = 1.0f;
        }
        if (z5) {
            float f10 = i10;
            fMin2 = Math.min(i12, f2 * f10) / f10;
        }
        float fMin3 = Math.min(fMin2, fMin);
        int iMax = (int) (i7 * fMin3);
        int i13 = (int) (i10 * fMin3);
        if (resizeMode == ResizeMode.Cover) {
            iMax = Math.max(iMax, i13);
            i13 = iMax;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(iMax, i13));
            return;
        }
        if (iMax != layoutParams.width || i13 != layoutParams.height) {
            layoutParams.width = iMax;
            layoutParams.height = i13;
        }
        view.setLayoutParams(layoutParams);
    }
}
