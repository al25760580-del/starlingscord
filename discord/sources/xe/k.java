package xe;

import af.w;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public class k extends DialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dialog f22932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DialogInterface.OnCancelListener f22933e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AlertDialog f22934i;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f22933e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f22932d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f22934i == null) {
            Context context = getContext();
            w.g(context);
            this.f22934i = new AlertDialog.Builder(context).create();
        }
        return this.f22934i;
    }
}
