package pc;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public interface x {
    int a(he.k kVar, int i7, boolean z5);

    default int b(he.k kVar, int i7, boolean z5) {
        return a(kVar, i7, z5);
    }

    void c(long j, int i7, int i10, int i11, w wVar);

    void d(int i7, je.w wVar);

    void e(Format format);
}
