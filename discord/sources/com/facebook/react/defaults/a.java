package com.facebook.react.defaults;

import app.rive.runtime.kotlin.core.ViewModelTriggerProperty;
import com.discord.chat.presentation.message.view.botuikit.react.SelectActionComponentViewManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.rive.HybridViewModelImageProperty;
import com.margelo.nitro.rive.HybridViewModelListProperty;
import com.margelo.nitro.rive.HybridViewModelTriggerProperty;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f5158e;

    public /* synthetic */ a(int i7, Function0 function0) {
        this.f5157d = i7;
        this.f5158e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f5157d) {
            case 0:
                return DefaultTurboModuleManagerDelegate.Builder.addCxxReactPackage$lambda$1$lambda$0(this.f5158e, (ReactApplicationContext) it);
            case 1:
                return HybridViewModelImageProperty.addListener$lambda$0(this.f5158e, (Unit) it);
            case 2:
                return HybridViewModelListProperty.addListener$lambda$0(this.f5158e, (Unit) it);
            case 3:
                return HybridViewModelTriggerProperty.addListener$lambda$0(this.f5158e, (ViewModelTriggerProperty.TriggerUnit) it);
            case 4:
                return SelectActionComponentViewManager.createSelectComponentContext$lambda$1(this.f5158e, (String) it);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f5158e.invoke();
        }
    }
}
