package xe;

import af.w;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dialog f22914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DialogInterface.OnCancelListener f22915e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AlertDialog f22916i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f22915e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f22914d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f22916i == null) {
            Activity activity = getActivity();
            w.g(activity);
            this.f22916i = new AlertDialog.Builder(activity).create();
        }
        return this.f22916i;
    }
}
