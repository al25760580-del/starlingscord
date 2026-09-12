package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class u implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f2255d;

    public u(DialogFragment dialogFragment) {
        this.f2255d = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.f2255d;
        if (dialogFragment.mDialog != null) {
            dialogFragment.onCancel(dialogFragment.mDialog);
        }
    }
}
