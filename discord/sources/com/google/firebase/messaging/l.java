package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements ig.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f6595e;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i7) {
        this.f6594d = i7;
        this.f6595e = firebaseMessaging;
    }

    @Override // ig.d
    public final void onSuccess(Object obj) {
        boolean z5;
        switch (this.f6594d) {
            case 0:
                y yVar = (y) obj;
                if (!this.f6595e.f6535e.m() || yVar.f6643h.a() == null) {
                    return;
                }
                synchronized (yVar) {
                    z5 = yVar.f6642g;
                }
                if (z5) {
                    return;
                }
                yVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f6595e;
                we.a aVar = (we.a) obj;
                ue.i iVar = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    xr.m.C(aVar.f22193d);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
