package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.henninghall.date_picker.pickers.AndroidNative;

/* JADX INFO: loaded from: classes.dex */
public final class t2 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1121b;

    public /* synthetic */ t2(ViewGroup viewGroup, int i7) {
        this.f1120a = i7;
        this.f1121b = viewGroup;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        switch (this.f1120a) {
            case 0:
                com.swmansion.rnscreens.c cVar = (com.swmansion.rnscreens.c) this.f1121b;
                View.OnFocusChangeListener onFocusChangeListener = cVar.f962m0;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(cVar, z5);
                }
                break;
            default:
                AndroidNative androidNative = (AndroidNative) this.f1121b;
                EditText editText = androidNative.f10067e;
                if (!z5) {
                    editText.setSelection(0, 0);
                    String strValueOf = String.valueOf(((TextView) view).getText());
                    if (!TextUtils.isEmpty(strValueOf)) {
                        androidNative.n(androidNative.e(strValueOf.toString()), true);
                    } else {
                        androidNative.q();
                    }
                } else {
                    editText.selectAll();
                }
                break;
        }
    }
}
