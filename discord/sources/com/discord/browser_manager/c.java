package com.discord.browser_manager;

import java.util.function.BiConsumer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f4001b;

    public /* synthetic */ c(int i7, Function2 function2) {
        this.f4000a = i7;
        this.f4001b = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f4000a) {
            case 0:
                ((b) this.f4001b).invoke(obj, obj2);
                break;
            default:
                ((com.discord.chat.input.views.a) this.f4001b).invoke(obj, obj2);
                break;
        }
    }
}
