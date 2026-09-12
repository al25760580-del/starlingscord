package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.databinding.AppMessageEmbedViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0014\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/view/ActivityInstanceEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/AppMessageEmbedViewBinding;", "appMessageEmbedView", "Lcom/discord/chat/presentation/message/view/AppMessageEmbedView;", "initAppMessageEmbed", "", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "data", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "constrainedWidth", "setParticipantAvatarUris", "avatarUris", "", "", "setParticipantText", "text", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityInstanceEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityInstanceEmbedView.kt\ncom/discord/chat/presentation/message/view/ActivityInstanceEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n257#2,2:58\n257#2,2:64\n1563#3:60\n1634#3,3:61\n*S KotlinDebug\n*F\n+ 1 ActivityInstanceEmbedView.kt\ncom/discord/chat/presentation/message/view/ActivityInstanceEmbedView\n*L\n46#1:58,2\n53#1:64,2\n48#1:60\n48#1:61,3\n*E\n"})
public final class ActivityInstanceEmbedView extends ConstraintLayout {

    @NotNull
    private final AppMessageEmbedView appMessageEmbedView;

    @NotNull
    private AppMessageEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityInstanceEmbedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void initAppMessageEmbed(@NotNull MessageMargins margins, @NotNull AppMessageEmbedImpl data, @NotNull ChatEventHandler eventHandler, int constrainedWidth) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.appMessageEmbedView.initView(margins, data, eventHandler, constrainedWidth);
    }

    public final void setParticipantAvatarUris(@NotNull List<String> avatarUris) {
        Intrinsics.checkNotNullParameter(avatarUris, "avatarUris");
        boolean zIsEmpty = avatarUris.isEmpty();
        OverlappingCirclesView participants = this.binding.participants;
        Intrinsics.checkNotNullExpressionValue(participants, "participants");
        participants.setVisibility(!zIsEmpty ? 0 : 8);
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        ArrayList arrayList = new ArrayList(e0.l(avatarUris, 10));
        Iterator<T> it = avatarUris.iterator();
        while (it.hasNext()) {
            arrayList.add(new OverlappingItem((String) it.next()));
        }
        overlappingCirclesView.setItems(arrayList);
    }

    public final void setParticipantText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView participantsText = this.binding.participantsText;
        Intrinsics.checkNotNullExpressionValue(participantsText, "participantsText");
        participantsText.setVisibility(0);
        this.binding.participantsText.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityInstanceEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActivityInstanceEmbedView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityInstanceEmbedView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        AppMessageEmbedViewBinding appMessageEmbedViewBindingInflate = AppMessageEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(appMessageEmbedViewBindingInflate, "inflate(...)");
        this.binding = appMessageEmbedViewBindingInflate;
        AppMessageEmbedView appMessageEmbedView = new AppMessageEmbedView(context, attributeSet, i7);
        this.appMessageEmbedView = appMessageEmbedView;
        appMessageEmbedView.setView(this.binding);
        this.binding.header.setMaxLines(2);
    }
}
