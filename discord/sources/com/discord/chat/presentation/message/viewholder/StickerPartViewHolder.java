package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JH\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "onStickerClicked", "Lkotlin/Function1;", "onStickerLongClicked", "widthDp", "", "heightDp", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStickerPartViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerPartViewHolder.kt\ncom/discord/chat/presentation/message/viewholder/StickerPartViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,35:1\n176#2,2:36\n*S KotlinDebug\n*F\n+ 1 StickerPartViewHolder.kt\ncom/discord/chat/presentation/message/viewholder/StickerPartViewHolder\n*L\n18#1:36,2\n*E\n"})
public abstract class StickerPartViewHolder extends MessagePartViewHolder {
    public static final int DEFAULT_CHAT_STICKER_SIZE_DP = 160;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_STICKER_PADDING_PX = SizeUtilsKt.getDpToPx(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_CHAT_STICKER_SIZE_DP", "", "DEFAULT_STICKER_PADDING_PX", "getDEFAULT_STICKER_PADDING_PX", "()I", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_STICKER_PADDING_PX() {
            return StickerPartViewHolder.DEFAULT_STICKER_PADDING_PX;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPartViewHolder(@NotNull View view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLayoutParams(new RecyclerView.LayoutParams(SizeUtilsKt.getDpToPx(160), SizeUtilsKt.getDpToPx(160)));
        int i7 = DEFAULT_STICKER_PADDING_PX;
        view.setPadding(i7, i7, i7, i7);
        RippleUtilsKt.addRipple$default(view, false, 0, 3, null);
    }

    public abstract void bind(@NotNull Sticker sticker, @NotNull Function1<? super Sticker, Unit> onStickerClicked, @NotNull Function1<? super Sticker, Unit> onStickerLongClicked, int widthDp, int heightDp);
}
