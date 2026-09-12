package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class v implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f2259d;

    public v(DialogFragment dialogFragment) {
        this.f2259d = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f2259d;
        if (dialogFragment.mDialog != null) {
            dialogFragment.onDismiss(dialogFragment.mDialog);
        }
    }
}
