package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.reactions.ReactionView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessageAccessoriesAdapter f4131e;

    public /* synthetic */ g(MessageAccessoriesAdapter messageAccessoriesAdapter, int i7) {
        this.f4130d = i7;
        this.f4131e = messageAccessoriesAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4130d) {
            case 0:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$27(this.f4131e, (ReactionView.Reaction) obj);
            case 1:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$28(this.f4131e, (ReactionView.Reaction) obj);
            case 2:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$10(this.f4131e, (String) obj);
            case 3:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$11(this.f4131e, (String) obj);
            case 4:
                return MessageAccessoriesAdapter.onCreateViewHolder$lambda$2(this.f4131e, (MessagePartViewHolder) obj);
            case 5:
                return MessageAccessoriesAdapter.onTapSpoiler$lambda$1(this.f4131e, (MessagePartViewHolder) obj);
            case 6:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$19(this.f4131e, (ReactionView.Reaction) obj);
            default:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$20(this.f4131e, (ReactionView.Reaction) obj);
        }
    }
}
