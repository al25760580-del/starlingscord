package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import java.util.List;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4435e;

    public /* synthetic */ m(int i7, Object obj) {
        this.f4434d = i7;
        this.f4435e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f4434d) {
            case 0:
                return MediaEngineModule.C01441.invokeSuspend$lambda$0((Callback) this.f4435e, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (String) obj3);
            case 1:
                return MediaEngineModule.C01481.invokeSuspend$lambda$0((Callback) this.f4435e, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue(), (String) obj3);
            default:
                return MediaEngineModule.C01721.invokeSuspend$lambda$3((MediaEngineModule) this.f4435e, (List) obj, (List) obj2, (List) obj3);
        }
    }
}
