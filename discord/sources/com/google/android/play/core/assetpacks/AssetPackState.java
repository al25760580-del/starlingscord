package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import sa.a;
import sh.g1;
import sh.p0;
import sh.q;
import sh.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AssetPackState {
    public static w a(String str, int i7, int i10, long j, long j5, double d6, int i11, String str2, String str3) {
        return new w(str, i7, i10, j, j5, (int) Math.rint(100.0d * d6), i11, str2, str3);
    }

    public static w d(Bundle bundle, String str, p0 p0Var, g1 g1Var, q qVar) {
        int iK = qVar.k(bundle.getInt(a.a("status", str)));
        int i7 = bundle.getInt(a.a("error_code", str));
        long j = bundle.getLong(a.a("bytes_downloaded", str));
        long j5 = bundle.getLong(a.a("total_bytes_to_download", str));
        double dA = p0Var.a(str);
        long j7 = bundle.getLong(a.a("pack_version", str));
        long j10 = bundle.getLong(a.a("pack_base_version", str));
        int i10 = 1;
        if (iK == 4) {
            if (j10 != 0 && j10 != j7) {
                i10 = 2;
            }
            iK = 4;
        }
        return a(str, iK, i7, j, j5, dA, i10, bundle.getString(a.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), g1Var.a(str));
    }

    public abstract String b();

    public abstract long c();

    public abstract int e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public abstract long i();

    public abstract int j();

    public abstract int k();
}
