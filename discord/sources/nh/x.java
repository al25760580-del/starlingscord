package nh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends androidx.core.view.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f16922a;

    public x(TextInputLayout textInputLayout) {
        this.f16922a = textInputLayout;
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TextInputLayout textInputLayout = this.f16922a;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z5 = textInputLayout.S0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z6 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        v vVar = textInputLayout.f6447e;
        AppCompatTextView appCompatTextView = vVar.f16913e;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfoCompat.f1613a.setLabelFor(appCompatTextView);
            accessibilityNodeInfoCompat.f1613a.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfoCompat.f1613a.setTraversalAfter(vVar.f16915v);
        }
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f1613a;
        if (!zIsEmpty) {
            accessibilityNodeInfoCompat.A(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfoCompat.A(string);
            if (!z5 && placeholderText != null) {
                accessibilityNodeInfoCompat.A(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfoCompat.A(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfoCompat.u(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                accessibilityNodeInfoCompat.A(string);
            }
            accessibilityNodeInfoCompat.z(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z6) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.H.f16901y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfoCompat.f1613a.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f6451i.b().m(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.b
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.f16922a.f6451i.b().n(accessibilityEvent);
    }
}
