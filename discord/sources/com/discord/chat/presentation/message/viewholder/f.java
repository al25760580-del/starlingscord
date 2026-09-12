package com.discord.chat.presentation.message.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.fastest_list.android.FastestListView;
import com.discord.primitives.UserId;
import com.discord.user_search_worker.UserSearchWorkerManagerModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4312e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4313i;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f4311d = i7;
        this.f4312e = obj;
        this.f4313i = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4311d) {
            case 0:
                return MessageComponentsViewHolder.bind$lambda$5((ChatEventHandler) this.f4312e, (String) this.f4313i, (UserId) obj, (String) obj2, (String) obj3);
            case 1:
                return FastestListView.onScrollListener$lambda$2((FastestListView) this.f4312e, (Function2) this.f4313i, (RecyclerView) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            default:
                return UserSearchWorkerManagerModule.worker$lambda$0((UserSearchWorkerManagerModule) this.f4312e, (ReactApplicationContext) this.f4313i, (List) obj, (String) obj2, (String) obj3);
        }
    }
}
