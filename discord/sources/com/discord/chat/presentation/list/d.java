package com.discord.chat.presentation.list;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ChatListView f4089e;

    public /* synthetic */ d(ChatListView chatListView, int i7) {
        this.f4088d = i7;
        this.f4089e = chatListView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4088d) {
            case 0:
                return ChatListView.chatListAdapter$lambda$0(this.f4089e);
            case 1:
                return ChatListView.scrollToPosition$lambda$9(this.f4089e);
            case 2:
                return ChatListView.scrollToPosition$lambda$11(this.f4089e);
            case 3:
                return ChatListView.chatListAdapter$lambda$1(this.f4089e);
            case 4:
                return this.f4089e.componentProvider;
            case 5:
                return ChatListView._init_$lambda$5(this.f4089e);
            case 6:
                return ChatListView._init_$lambda$6(this.f4089e);
            case 7:
                return ChatListView.forceRecreateAllViewHolders$lambda$12(this.f4089e);
            case 8:
                return ChatListView.forceRecreateAllViewHolders$lambda$13(this.f4089e);
            default:
                return this.f4089e.componentProvider;
        }
    }
}
