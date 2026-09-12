package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.bridge.roleicons.RoleIcon;
import com.discord.chat.databinding.RoleIconViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.emoji.RenderableEmoji;
import com.discord.emoji.RenderableEmojiKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/RoleIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/RoleIconViewBinding;", "configureRoleIcon", "", "roleIcon", "Lcom/discord/chat/bridge/roleicons/RoleIcon;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoleIconView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleIconView.kt\ncom/discord/chat/presentation/message/RoleIconView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,49:1\n1#2:50\n257#3,2:51\n*S KotlinDebug\n*F\n+ 1 RoleIconView.kt\ncom/discord/chat/presentation/message/RoleIconView\n*L\n27#1:51,2\n*E\n"})
public final class RoleIconView extends FrameLayout {

    @NotNull
    private final RoleIconViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoleIconView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        RoleIconViewBinding roleIconViewBindingInflate = RoleIconViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(roleIconViewBindingInflate, "inflate(...)");
        this.binding = roleIconViewBindingInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureRoleIcon$lambda$3$lambda$2(ChatEventHandler chatEventHandler, RoleIcon roleIcon, RenderableEmoji renderableEmoji, View view) {
        chatEventHandler.onTapRoleIcon(roleIcon.getName(), renderableEmoji.getUrl(true, roleIcon.getSize()));
    }

    public final void configureRoleIcon(@NotNull RoleIcon roleIcon, @NotNull ChatEventHandler eventHandler) {
        RenderableEmoji renderableEmoji;
        Intrinsics.checkNotNullParameter(roleIcon, "roleIcon");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        String source = roleIcon.getSource();
        if (source == null || (renderableEmojiUnicode = RenderableEmoji.INSTANCE.customWithUrl(source, roleIcon.getAlt())) == null) {
            String unicodeEmoji = roleIcon.getUnicodeEmoji();
            if (unicodeEmoji != null) {
                RenderableEmoji renderableEmojiUnicode = RenderableEmoji.INSTANCE.unicode(unicodeEmoji);
                renderableEmoji = renderableEmojiUnicode;
            } else {
                renderableEmoji = null;
            }
        } else {
            renderableEmoji = renderableEmojiUnicode;
        }
        setVisibility(renderableEmoji != null ? 0 : 8);
        if (renderableEmoji == null) {
            return;
        }
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.roleIconViewUnicodeEmoji;
        Context context = simpleDraweeSpanTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        simpleDraweeSpanTextView.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(renderableEmoji, context, SizeUtilsKt.getSpToPx(roleIcon.getSize()), true, 0, null, 48, null));
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeSpanTextView, false, new d(eventHandler, roleIcon, renderableEmoji, 2), 1, null);
    }
}
