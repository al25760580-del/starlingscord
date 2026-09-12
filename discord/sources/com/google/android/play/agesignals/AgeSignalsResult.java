package com.google.android.play.agesignals;

import android.os.Bundle;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AgeSignalsResult {
    public static Integer g(String str, Bundle bundle) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public abstract Integer a();

    public abstract Integer b();

    public abstract Integer c();

    public abstract String d();

    public abstract Date e();

    public abstract Integer f();
}
