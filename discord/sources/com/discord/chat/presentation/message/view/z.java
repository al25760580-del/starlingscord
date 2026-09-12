package com.discord.chat.presentation.message.view;

import com.discord.chat.presentation.message.viewholder.ReactionsViewHolder;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.reactions.ReactionView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.margelo.nitro.rive.HybridViewModelColorProperty;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f4293e;

    public /* synthetic */ z(Function1 function1, int i7) {
        this.f4292d = i7;
        this.f4293e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4292d) {
            case 0:
                return SpoilerView.onObscureVerifyAgeClick$lambda$4(this.f4293e, ((Boolean) obj).booleanValue());
            case 1:
                return ReactionsViewHolder.bind$lambda$0(this.f4293e, (ReactionView.Reaction) obj);
            case 2:
                return ReactionsViewHolder.bind$lambda$1(this.f4293e, (ReactionView.Reaction) obj);
            case 3:
                return SystemLogUtils.fetchLastTombstone$lambda$0(this.f4293e, (LinkedList) obj);
            case 4:
                return DefaultTurboModuleManagerDelegate.Builder.addCxxReactPackage$lambda$3$lambda$2(this.f4293e, (ReactApplicationContext) obj);
            default:
                return HybridViewModelColorProperty.addListener$lambda$0(this.f4293e, ((Integer) obj).intValue());
        }
    }
}
