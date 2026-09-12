package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Callback f4433e;

    public /* synthetic */ l(Callback callback, int i7) {
        this.f4432d = i7;
        this.f4433e = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4432d) {
            case 0:
                return MediaEngineModule.C01381.invokeSuspend$lambda$0(this.f4433e, (String[]) obj);
            case 1:
                return MediaEngineModule.C01391.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 2:
                return MediaEngineModule.C01401.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 3:
                return MediaEngineModule.C01411.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 4:
                return MediaEngineModule.C01421.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 5:
                return MediaEngineModule.C01471.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 6:
                return MediaEngineModule.C01661.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 7:
                return MediaEngineModule.C01671.invokeSuspend$lambda$0(this.f4433e, (String) obj);
            case 8:
                return MediaEngineModule.C01681.invokeSuspend$lambda$0(this.f4433e, (List) obj);
            case 9:
                return MediaEngineModule.C01701.invokeSuspend$lambda$0(this.f4433e, (List) obj);
            case 10:
                return MediaEngineModule.C01711.invokeSuspend$lambda$0(this.f4433e, (List) obj);
            case 11:
                return MediaEngineModule.C01741.invokeSuspend$lambda$0(this.f4433e, (String[]) obj);
            default:
                return MediaEngineModule.C01901.invokeSuspend$lambda$0(this.f4433e, ((Boolean) obj).booleanValue());
        }
    }
}
