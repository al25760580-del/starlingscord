package com.facebook.soloader;

import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends a0 {
    public static z a(String str, Context context, b0[] b0VarArr) {
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i7 = 0; i7 < b0VarArr.length; i7++) {
            sbN.append("\n\t\tSoSource ");
            sbN.append(i7);
            sbN.append(": ");
            sbN.append(b0VarArr[i7].toString());
        }
        if (context != null) {
            sbN.append("\n\tNative lib dir: ");
            sbN.append(context.getApplicationInfo().nativeLibraryDir);
            sbN.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return new z(str, sbN.toString());
    }
}
