package com.facebook.react.devsupport;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5206e;

    public /* synthetic */ p(int i7, Object obj) {
        this.f5205d = i7;
        this.f5206e = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5205d) {
            case 0:
                ((DevSupportManagerBase) this.f5206e).devOptionsDialog = null;
                break;
            case 1:
                LogBoxDialogSurfaceDelegate.show$lambda$1$lambda$0((LogBoxDialogSurfaceDelegate) this.f5206e, dialogInterface);
                break;
            default:
                RedBoxDialogSurfaceDelegate.show$lambda$4$lambda$3((RedBoxDialogSurfaceDelegate) this.f5206e, dialogInterface);
                break;
        }
    }
}
