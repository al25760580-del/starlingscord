package es;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a3.f f8741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8743i;
    public final /* synthetic */ h j;

    public e(h this$0, String key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "key");
        this.j = this$0;
        this.f8735a = key;
        this$0.getClass();
        this.f8736b = new long[2];
        this.f8737c = new ArrayList();
        this.f8738d = new ArrayList();
        StringBuilder sb2 = new StringBuilder(key);
        sb2.append('.');
        int length = sb2.length();
        for (int i7 = 0; i7 < 2; i7++) {
            sb2.append(i7);
            this.f8737c.add(new File(this.j.f8750d, sb2.toString()));
            sb2.append(".tmp");
            this.f8738d.add(new File(this.j.f8750d, sb2.toString()));
            sb2.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [rs.b] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final f a() {
        byte[] bArr = ds.b.f7815a;
        if (!this.f8739e) {
            return null;
        }
        h hVar = this.j;
        if (!hVar.H && (this.f8741g != null || this.f8740f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.f8736b.clone();
        int i7 = 0;
        while (i7 < 2) {
            int i10 = i7 + 1;
            try {
                File file = (File) this.f8737c.get(i7);
                Intrinsics.checkNotNullParameter(file, "file");
                ?? L = v.l(file);
                if (!hVar.H) {
                    this.f8742h++;
                    L = new d(L, hVar, this);
                }
                arrayList.add(L);
                i7 = i10;
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ds.b.c((Source) it.next());
                }
                try {
                    hVar.O(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new f(this.j, this.f8735a, this.f8743i, arrayList, jArr);
    }
}
