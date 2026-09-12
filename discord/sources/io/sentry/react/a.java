package io.sentry.react;

import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.h5;
import io.sentry.r3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements h5, r3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13097e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f13098i;

    public /* synthetic */ a(int i7, String str, String str2) {
        this.f13096d = i7;
        this.f13097e = str;
        this.f13098i = str2;
    }

    @Override // io.sentry.h5
    public Breadcrumb execute(Breadcrumb breadcrumb, Hint hint) {
        return RNSentryModuleImpl.lambda$getSentryAndroidOptions$2(this.f13097e, this.f13098i, breadcrumb, hint);
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        switch (this.f13096d) {
            case 1:
                iScope.j(this.f13097e, this.f13098i);
                break;
            default:
                iScope.f(this.f13097e, this.f13098i);
                break;
        }
    }
}
