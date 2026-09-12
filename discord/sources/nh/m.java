package nh;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f16861a;

    public m(n nVar) {
        this.f16861a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f16861a;
        l lVar = nVar.S;
        if (nVar.P == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.P;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.P.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.P.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.P = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().l(nVar.P);
        nVar.j(nVar.b());
    }
}
