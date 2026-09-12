package fk;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f9275b;

    public e(String str, AlertDialog alertDialog) {
        this.f9274a = str;
        this.f9275b = alertDialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        String str = this.f9274a;
        if (str != null) {
            int color = Color.parseColor(str);
            AlertDialog alertDialog = this.f9275b;
            alertDialog.getButton(-1).setTextColor(color);
            alertDialog.getButton(-2).setTextColor(color);
        }
    }
}
