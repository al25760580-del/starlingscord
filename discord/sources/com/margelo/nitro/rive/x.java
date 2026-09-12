package com.margelo.nitro.rive;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridRiveView f6997e;

    public /* synthetic */ x(HybridRiveView hybridRiveView, int i7) {
        this.f6996d = i7;
        this.f6997e = hybridRiveView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6996d) {
            case 0:
                return Boolean.valueOf(HybridRiveFile.unregisterView$lambda$0(this.f6997e, (WeakReference) obj));
            case 1:
                return HybridRiveView._set_stateMachineName_$lambda$1(this.f6997e, (String) obj);
            case 2:
                return HybridRiveView._set_file_$lambda$3(this.f6997e, (HybridRiveFileSpec) obj);
            case 3:
                return HybridRiveView._set_artboardName_$lambda$0(this.f6997e, (String) obj);
            default:
                return HybridRiveView._set_autoPlay_$lambda$2(this.f6997e, (Boolean) obj);
        }
    }
}
