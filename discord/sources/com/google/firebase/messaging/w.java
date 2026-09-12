package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f6628b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zl.e f6629a;

    public final synchronized v a() {
        String str;
        v vVar;
        zl.e eVar = this.f6629a;
        synchronized (((ArrayDeque) eVar.f24047v)) {
            str = (String) ((ArrayDeque) eVar.f24047v).peek();
        }
        Pattern pattern = v.f6624d;
        vVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                vVar = new v(strArrSplit[0], strArrSplit[1]);
            }
        }
        return vVar;
    }
}
