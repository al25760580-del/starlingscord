package com.margelo.nitro.rive;

import app.rive.runtime.kotlin.core.File;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f6977c;

    public s(File file, LinkedHashMap cache, x1 x1Var) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f6975a = file;
        this.f6976b = cache;
        this.f6977c = x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f6975a, sVar.f6975a) && Intrinsics.areEqual(this.f6976b, sVar.f6976b) && Intrinsics.areEqual(this.f6977c, sVar.f6977c);
    }

    public final int hashCode() {
        int iHashCode = (this.f6976b.hashCode() + (this.f6975a.hashCode() * 31)) * 31;
        x1 x1Var = this.f6977c;
        return iHashCode + (x1Var == null ? 0 : x1Var.hashCode());
    }

    public final String toString() {
        return "FileAndCache(file=" + this.f6975a + ", cache=" + this.f6976b + ", loader=" + this.f6977c + ")";
    }
}
