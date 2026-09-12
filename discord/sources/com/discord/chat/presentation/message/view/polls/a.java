package com.discord.chat.presentation.message.view.polls;

import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4234e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4235i;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f4233d = i7;
        this.f4234e = obj;
        this.f4235i = obj2;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.f4233d) {
            case 0:
                return BasePollWithRecyclerView.bind$lambda$4((Function8) this.f4234e, (PollMessageAccessory) this.f4235i, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), ((Integer) obj5).intValue(), (ViewResizeMode) obj6);
            default:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$8((TextDisplayComponentViewManager) this.f4234e, (TextDisplayComponentView) this.f4235i, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
        }
    }
}
