package com.facebook.react.devsupport;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RedBoxContentView f5215e;

    public /* synthetic */ s(RedBoxContentView redBoxContentView, int i7) {
        this.f5214d = i7;
        this.f5215e = redBoxContentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5214d) {
            case 0:
                RedBoxContentView.reportButtonOnClickListener$lambda$0(this.f5215e, view);
                break;
            case 1:
                RedBoxContentView.init$lambda$2(this.f5215e, view);
                break;
            default:
                RedBoxContentView.init$lambda$3(this.f5215e, view);
                break;
        }
    }
}
