package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f6624d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6627c;

    public v(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f6624d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(s0.g.e("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f6625a = strSubstring;
        this.f6626b = str;
        this.f6627c = kk.b.k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f6625a.equals(vVar.f6625a) && this.f6626b.equals(vVar.f6626b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6626b, this.f6625a});
    }
}
