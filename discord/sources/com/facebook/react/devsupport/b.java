package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.view.View;
import com.facebook.react.devsupport.interfaces.DevSupportManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5163e;

    public /* synthetic */ b(int i7, Object obj) {
        this.f5162d = i7;
        this.f5163e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5162d) {
            case 0:
                ((AlertDialog) this.f5163e).dismiss();
                break;
            default:
                ((DevSupportManager.PausedInDebuggerOverlayCommandListener) this.f5163e).onResume();
                break;
        }
    }
}
