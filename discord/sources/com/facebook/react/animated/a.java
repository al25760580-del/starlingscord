package com.facebook.react.animated;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements AnimatedNodeValueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAnimatedModule f5146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5147c;

    public /* synthetic */ a(NativeAnimatedModule nativeAnimatedModule, int i7, int i10) {
        this.f5145a = i10;
        this.f5146b = nativeAnimatedModule;
        this.f5147c = i7;
    }

    @Override // com.facebook.react.animated.AnimatedNodeValueListener
    public final void onValueUpdate(double d6, double d7) {
        switch (this.f5145a) {
            case 0:
                NativeAnimatedModule.startListeningToAnimatedNodeValue$lambda$4(this.f5146b, this.f5147c, d6, d7);
                break;
            default:
                NativeAnimatedModule.C02351.execute$lambda$1(this.f5146b, this.f5147c, d6, d7);
                break;
        }
    }
}
