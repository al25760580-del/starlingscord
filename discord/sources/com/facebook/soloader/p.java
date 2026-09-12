package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f5416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5417f;

    public p(Context context, String str, File file) {
        super(context, str, true);
        this.f5416e = file;
        this.f5417f = "^lib/([^/]+)/([^/]+\\.so)$";
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.b0
    public final String b() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.i0
    public final h0 g() {
        return new o(this, this);
    }

    @Override // com.facebook.soloader.e, com.facebook.soloader.b0
    public final String toString() {
        File file = this.f5416e;
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return file.getName();
        }
    }
}
