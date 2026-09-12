package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements TextWatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.swmansion.rnscreens.c f1095d;

    public r2(com.swmansion.rnscreens.c cVar) {
        this.f1095d = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        com.swmansion.rnscreens.c cVar = this.f1095d;
        Editable text = cVar.M.getText();
        cVar.f974y0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        cVar.w(!zIsEmpty);
        int i12 = 8;
        if (cVar.f972w0 && !cVar.f965p0 && zIsEmpty) {
            cVar.R.setVisibility(8);
            i12 = 0;
        }
        cVar.T.setVisibility(i12);
        cVar.s();
        cVar.v();
        if (cVar.f960k0 != null && !TextUtils.equals(charSequence, cVar.f973x0)) {
            z2 z2Var = cVar.f960k0;
            String string = charSequence.toString();
            com.swmansion.rnscreens.v0 v0Var = (com.swmansion.rnscreens.v0) ((u4.b) z2Var).f20945e;
            v0Var.k(new nm.e(v0Var.J, string, v0Var.getId(), 0));
        }
        cVar.f973x0 = charSequence.toString();
    }
}
