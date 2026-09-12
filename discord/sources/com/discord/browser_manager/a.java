package com.discord.browser_manager;

import com.discord.chrome_custom_tabs.TrackedCustomTab;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f3994b;

    public /* synthetic */ a(Function1 function1, int i7) {
        this.f3993a = i7;
        this.f3994b = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f3993a) {
            case 0:
                return BrowserManager.openUrlExternally$lambda$3(this.f3994b, (Throwable) obj);
            default:
                return TrackedCustomTab.launch$lambda$1(this.f3994b, (Throwable) obj);
        }
    }
}
