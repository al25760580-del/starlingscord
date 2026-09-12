package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callback f4445e;

    public /* synthetic */ s(Callback callback, int i7) {
        this.f4444d = i7;
        this.f4445e = callback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.f4444d) {
            case 0:
                return MediaEngineModule.C01651.invokeSuspend$lambda$0(this.f4445e, str, (String) obj2);
            case 1:
                return MediaEngineModule.C01691.invokeSuspend$lambda$0(this.f4445e, str, (String) obj2);
            case 2:
                return MediaEngineModule.C01931.invokeSuspend$lambda$0(this.f4445e, str, ((Integer) obj2).intValue());
            default:
                return MediaEngineModule.createVoiceConnectionWithOptions$lambda$1(this.f4445e, str, (Map) obj2);
        }
    }
}
