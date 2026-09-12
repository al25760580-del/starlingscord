package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.u;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements u {
    @Override // androidx.core.view.u
    public final ContentInfoCompat a(View view, ContentInfoCompat contentInfoCompat) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat);
        }
        androidx.core.view.g gVar = contentInfoCompat.f1583a;
        androidx.core.view.g gVar2 = contentInfoCompat.f1583a;
        if (gVar.d() == 2) {
            return contentInfoCompat;
        }
        ClipData clipDataF = gVar2.f();
        int iG = gVar2.g();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z5 = false;
        for (int i7 = 0; i7 < clipDataF.getItemCount(); i7++) {
            ClipData.Item itemAt = clipDataF.getItemAt(i7);
            if ((iG & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z5) {
                    editable.insert(Selection.getSelectionEnd(editable), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z5 = true;
                }
            }
        }
        return null;
    }
}
