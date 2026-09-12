package gk;

import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import com.henninghall.date_picker.pickers.AndroidNative;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends NumberKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidNative f10051a;

    public c(AndroidNative androidNative) {
        this.f10051a = androidNative;
    }

    @Override // android.text.method.NumberKeyListener, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        AndroidNative androidNative = this.f10051a;
        g gVar = androidNative.f10064c0;
        if (gVar != null && gVar.f10058v) {
            gVar.f10055d.removeCallbacks(gVar);
            gVar.f10058v = false;
        }
        if (androidNative.H == null) {
            CharSequence charSequenceFilter = super.filter(charSequence, i7, i10, spanned, i11, i12);
            if (charSequenceFilter == null) {
                charSequenceFilter = charSequence.subSequence(i7, i10);
            }
            String str = String.valueOf(spanned.subSequence(0, i11)) + ((Object) charSequenceFilter) + ((Object) spanned.subSequence(i12, spanned.length()));
            if ("".equals(str)) {
                return str;
            }
            if (androidNative.e(str) <= androidNative.J && str.length() <= String.valueOf(androidNative.J).length()) {
                return charSequenceFilter;
            }
        } else {
            String strValueOf = String.valueOf(charSequence.subSequence(i7, i10));
            if (!TextUtils.isEmpty(strValueOf)) {
                String str2 = String.valueOf(spanned.subSequence(0, i11)) + ((Object) strValueOf) + ((Object) spanned.subSequence(i12, spanned.length()));
                String lowerCase = String.valueOf(str2).toLowerCase();
                for (String str3 : androidNative.H) {
                    if (str3.toLowerCase().startsWith(lowerCase)) {
                        int length = str2.length();
                        int length2 = str3.length();
                        if (androidNative.f10064c0 == null) {
                            androidNative.f10064c0 = new g(androidNative.f10067e);
                        }
                        g gVar2 = androidNative.f10064c0;
                        gVar2.f10056e = length;
                        gVar2.f10057i = length2;
                        if (!gVar2.f10058v) {
                            gVar2.f10055d.post(gVar2);
                            gVar2.f10058v = true;
                        }
                        return str3.subSequence(i11, str3.length());
                    }
                }
            }
        }
        return "";
    }

    @Override // android.text.method.NumberKeyListener
    public final char[] getAcceptedChars() {
        return i.F0;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return 1;
    }
}
