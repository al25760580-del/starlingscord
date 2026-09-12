package j8;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h8.a f13667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13669d;

    public a(File file, String str) {
        str.getClass();
        this.f13666a = str;
        Intrinsics.checkNotNullParameter(file, "file");
        this.f13667b = new h8.a(file);
        this.f13668c = -1L;
        this.f13669d = -1L;
    }

    public final long a() {
        if (this.f13669d < 0) {
            this.f13669d = this.f13667b.f10388a.lastModified();
        }
        return this.f13669d;
    }
}
