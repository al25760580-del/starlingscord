package com.discord.chat.presentation.message.view.polls;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006JW\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t20\u0010\u0010\u001a,\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\fH&¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollAnswerViewHolder;", "Landroidx/viewbinding/ViewBinding;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "<init>", "(Landroidx/viewbinding/ViewBinding;)V", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "accessory", "Lkotlin/Function0;", "", "onTapAnswer", "Lkotlin/Function6;", "", "", "Lcom/discord/chat/reactevents/ViewResizeMode;", "onLongPressImage", "bind", "(Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function6;)V", "Landroidx/viewbinding/ViewBinding;", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "getPollAnswerAdapter", "()Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "pollAnswerAdapter", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PollAnswerViewHolder<T extends ViewBinding> extends RecyclerView.ViewHolder {

    @NotNull
    private final T binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAnswerViewHolder(@NotNull T binding) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public abstract void bind(@NotNull PollAnswerAccessory accessory, @NotNull Function0<Unit> onTapAnswer, @NotNull Function6 onLongPressImage);

    @NotNull
    public final T getBinding() {
        return this.binding;
    }

    @NotNull
    public final PollAnswerAdapter<?> getPollAnswerAdapter() {
        RecyclerView.Adapter bindingAdapter = getBindingAdapter();
        Intrinsics.checkNotNull(bindingAdapter, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.polls.PollAnswerAdapter<*>");
        return (PollAnswerAdapter) bindingAdapter;
    }
}
