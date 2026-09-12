package com.discord.chat.presentation.message.messagepart;

import a3.e;
import android.content.res.Resources;
import android.view.View;
import com.discord.chat.R;
import com.discord.chat.presentation.list.a;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextType;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.reactions.ShortcutsFlexbox;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "", "leftMarginPx", "", "rightMarginPx", "embedContentMarginPx", "<init>", "(III)V", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "renderContentOnly", "", "(Landroid/content/res/Resources;Lcom/discord/chat/presentation/root/MessageContext;Z)V", "getLeftMarginPx", "()I", "getRightMarginPx", "getEmbedContentMarginPx", "view", "Landroid/view/View;", "isForwardedMessage", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageMargins {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int FORWARD_BAR_SPACING;
    private static final int FORWARD_BAR_WIDTH;
    private final int embedContentMarginPx;
    private final int leftMarginPx;
    private final int rightMarginPx;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\u00020\u0005*\u00020\u000bH\u0002J\f\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002J\f\u0010\r\u001a\u00020\u0005*\u00020\u000bH\u0002J\u001c\u0010\u000e\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u0005*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012J\u001a\u0010\u0017\u001a\u00020\u0005*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageMargins$Companion;", "", "<init>", "()V", "FORWARD_BAR_WIDTH", "", "getFORWARD_BAR_WIDTH", "()I", "FORWARD_BAR_SPACING", "getFORWARD_BAR_SPACING", "defaultMarginMessageStart", "Landroid/content/res/Resources;", "defaultMargin", "defaultMarginEmbedContent", "getLeftMargin", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "renderContentOnly", "", "getWidth", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "constrainedWidth", "isForwardedContent", "getWidthForEmbedContent", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int defaultMargin(Resources resources) {
            return resources.getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int defaultMarginEmbedContent(Resources resources) {
            return resources.getDimensionPixelSize(R.dimen.message_embed_margin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int defaultMarginMessageStart(Resources resources) {
            return resources.getDimensionPixelSize(R.dimen.message_start_guideline);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getLeftMargin(Resources resources, MessageContext messageContext, boolean z5) {
            if (messageContext.getContextType() == MessageContextType.SEARCH) {
                return 0;
            }
            return z5 ? defaultMargin(resources) : defaultMarginMessageStart(resources);
        }

        public final int getFORWARD_BAR_SPACING() {
            return MessageMargins.FORWARD_BAR_SPACING;
        }

        public final int getFORWARD_BAR_WIDTH() {
            return MessageMargins.FORWARD_BAR_WIDTH;
        }

        public final int getWidth(@NotNull MessageMargins messageMargins, int i7, boolean z5) {
            Intrinsics.checkNotNullParameter(messageMargins, "<this>");
            int leftMarginPx = (i7 - messageMargins.getLeftMarginPx()) - messageMargins.getRightMarginPx();
            return z5 ? leftMarginPx - getFORWARD_BAR_SPACING() : leftMarginPx;
        }

        public final int getWidthForEmbedContent(@NotNull MessageMargins messageMargins, int i7, boolean z5) {
            Intrinsics.checkNotNullParameter(messageMargins, "<this>");
            return getWidth(messageMargins, i7, z5) - (messageMargins.getEmbedContentMarginPx() * 2);
        }

        private Companion() {
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(4);
        FORWARD_BAR_WIDTH = dpToPx;
        FORWARD_BAR_SPACING = SizeUtilsKt.getDpToPx(16) + dpToPx;
    }

    public MessageMargins(int i7, int i10, int i11) {
        this.leftMarginPx = i7;
        this.rightMarginPx = i10;
        this.embedContentMarginPx = i11;
    }

    public static /* synthetic */ MessageMargins copy$default(MessageMargins messageMargins, int i7, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i7 = messageMargins.leftMarginPx;
        }
        if ((i12 & 2) != 0) {
            i10 = messageMargins.rightMarginPx;
        }
        if ((i12 & 4) != 0) {
            i11 = messageMargins.embedContentMarginPx;
        }
        return messageMargins.copy(i7, i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeftMarginPx() {
        return this.leftMarginPx;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRightMarginPx() {
        return this.rightMarginPx;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEmbedContentMarginPx() {
        return this.embedContentMarginPx;
    }

    @NotNull
    public final MessageMargins copy(int leftMarginPx, int rightMarginPx, int embedContentMarginPx) {
        return new MessageMargins(leftMarginPx, rightMarginPx, embedContentMarginPx);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageMargins)) {
            return false;
        }
        MessageMargins messageMargins = (MessageMargins) other;
        return this.leftMarginPx == messageMargins.leftMarginPx && this.rightMarginPx == messageMargins.rightMarginPx && this.embedContentMarginPx == messageMargins.embedContentMarginPx;
    }

    public final int getEmbedContentMarginPx() {
        return this.embedContentMarginPx;
    }

    public final int getLeftMarginPx() {
        return this.leftMarginPx;
    }

    public final int getRightMarginPx() {
        return this.rightMarginPx;
    }

    public int hashCode() {
        return Integer.hashCode(this.embedContentMarginPx) + a.u(this.rightMarginPx, Integer.hashCode(this.leftMarginPx) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i7 = this.leftMarginPx;
        int i10 = this.rightMarginPx;
        return b.l(e.r(i7, "MessageMargins(leftMarginPx=", i10, ", rightMarginPx=", ", embedContentMarginPx="), this.embedContentMarginPx, ")");
    }

    public final int getLeftMarginPx(@NotNull View view, boolean isForwardedMessage) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!isForwardedMessage) {
            return this.leftMarginPx;
        }
        if (!(view instanceof ShortcutsFlexbox) && !(view instanceof ThreadEmbedView)) {
            return this.leftMarginPx + FORWARD_BAR_SPACING;
        }
        return this.leftMarginPx;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageMargins(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Companion companion = INSTANCE;
        this(companion.defaultMarginMessageStart(resources), companion.defaultMargin(resources), companion.defaultMarginEmbedContent(resources));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageMargins(@NotNull Resources resources, @NotNull MessageContext messageContext, boolean z5) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        Companion companion = INSTANCE;
        this(companion.getLeftMargin(resources, messageContext, z5), companion.defaultMargin(resources), companion.defaultMarginEmbedContent(resources));
    }
}
