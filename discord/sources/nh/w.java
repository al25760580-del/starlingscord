package nh;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements TextWatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EditText f16920e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f16921i;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.f16921i = textInputLayout;
        this.f16920e = editText;
        this.f16919d = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f16921i;
        textInputLayout.w(!textInputLayout.Y0, false);
        if (textInputLayout.I) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.Q) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f16920e;
        int lineCount = editText.getLineCount();
        int i7 = this.f16919d;
        if (lineCount != i7) {
            if (lineCount < i7) {
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.R0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.f16919d = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
