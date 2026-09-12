package fe;

import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector$MappedTrackInfo;
import gc.p1;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1[] f9146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p[] f9147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Tracks f9148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9149e;

    public u(p1[] p1VarArr, p[] pVarArr, Tracks tracks, MappingTrackSelector$MappedTrackInfo mappingTrackSelector$MappedTrackInfo) {
        this.f9146b = p1VarArr;
        this.f9147c = (p[]) pVarArr.clone();
        this.f9148d = tracks;
        this.f9149e = mappingTrackSelector$MappedTrackInfo;
        this.f9145a = p1VarArr.length;
    }

    public final boolean a(u uVar, int i7) {
        return uVar != null && e0.a(this.f9146b[i7], uVar.f9146b[i7]) && e0.a(this.f9147c[i7], uVar.f9147c[i7]);
    }

    public final boolean b(int i7) {
        return this.f9146b[i7] != null;
    }
}
