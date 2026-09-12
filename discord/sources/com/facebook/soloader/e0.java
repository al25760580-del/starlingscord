package com.facebook.soloader;

import java.io.File;
import java.io.FilenameFilter;
import sh.o1;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5389a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f5389a) {
            case 0:
                return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
            default:
                return o1.f20142a.matcher(str).matches();
        }
    }
}
