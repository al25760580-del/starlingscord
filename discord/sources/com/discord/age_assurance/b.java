package com.discord.age_assurance;

import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ig.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Promise f3936e;

    public /* synthetic */ b(Promise promise, int i7) {
        this.f3935d = i7;
        this.f3936e = promise;
    }

    @Override // ig.c
    public final void onFailure(Exception exc) {
        switch (this.f3935d) {
            case 0:
                PlayAgeSignalsModule.getAgeSignals$lambda$2(this.f3936e, exc);
                break;
            default:
                PlayAgeSignalsModule.retrieveAgeSignals$lambda$5(this.f3936e, exc);
                break;
        }
    }
}
