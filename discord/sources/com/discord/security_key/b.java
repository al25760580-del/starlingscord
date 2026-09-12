package com.discord.security_key;

import ig.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebAuthn f4581e;

    public /* synthetic */ b(WebAuthn webAuthn, int i7) {
        this.f4580d = i7;
        this.f4581e = webAuthn;
    }

    @Override // ig.c
    public final void onFailure(Exception exc) {
        switch (this.f4580d) {
            case 0:
                WebAuthn.authenticateSecurityKey$lambda$5(this.f4581e, exc);
                break;
            default:
                WebAuthn.registerSecurityKey$lambda$2(this.f4581e, exc);
                break;
        }
    }
}
