package m2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f15367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f15368e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15369i = true;

    public i(EditText editText) {
        this.f15367d = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k2.i iVarA = k2.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                iVarA.getClass();
                length = editableText.length();
            }
            iVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) throws Throwable {
        EditText editText = this.f15367d;
        if (editText.isInEditMode() || !this.f15369i || k2.i.k == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = k2.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                k2.i.a().e((Spannable) charSequence, i7, i11 + i7);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        k2.i iVarA = k2.i.a();
        if (this.f15368e == null) {
            this.f15368e = new h(editText);
        }
        iVarA.f(this.f15368e);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
