package com.discord.chat.presentation.list;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/presentation/list/AccessoriesViewPool;", "Lcom/discord/chat/presentation/list/NoneClearingRecycledViewPool;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccessoriesViewPool extends NoneClearingRecycledViewPool {
    public AccessoriesViewPool() {
        setMaxRecycledViews(0, 50);
        setMaxRecycledViews(26, 20);
        setMaxRecycledViews(1, 20);
        setMaxRecycledViews(4, 15);
        setMaxRecycledViews(46, 20);
        setMaxRecycledViews(49, 20);
        setMaxRecycledViews(50, 20);
    }
}
