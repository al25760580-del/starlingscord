package jk;

import com.facebook.react.bridge.Dynamic;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13918b;

    @Override // jk.c
    public final Object a(Dynamic dynamic) {
        String strReplace = dynamic.asString().replace('-', '_');
        this.f13918b = strReplace;
        try {
            return ts.a.d(strReplace);
        } catch (Exception unused) {
            return ts.a.d(strReplace.substring(0, strReplace.indexOf("_")));
        }
    }
}
