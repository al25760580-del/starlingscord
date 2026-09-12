package fe;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements di.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DefaultTrackSelector f9085d;

    /* JADX WARN: Code duplicated, block: B:40:0x0062 A[Catch: all -> 0x0087, FALL_THROUGH, TryCatch #0 {all -> 0x0087, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:10:0x0017, B:34:0x0056, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:42:0x0066, B:44:0x006a, B:46:0x006e, B:48:0x0074, B:50:0x007c, B:56:0x008a), top: B:60:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0089  */
    @Override // di.g
    public final boolean apply(Object obj) {
        boolean z5;
        j jVar;
        j jVar2;
        DefaultTrackSelector defaultTrackSelector = this.f9085d;
        Format format = (Format) obj;
        synchronized (defaultTrackSelector.f5728d) {
            try {
                z5 = true;
                if (defaultTrackSelector.f5732h.f5754g0 && !defaultTrackSelector.f5731g) {
                    if (format.V > 2) {
                        String str = format.I;
                        if (str != null) {
                            switch (str) {
                                case "audio/eac3-joc":
                                case "audio/ac3":
                                case "audio/ac4":
                                case "audio/eac3":
                                    if (e0.f13788a >= 32 && (jVar2 = defaultTrackSelector.f5733i) != null && jVar2.f9099b) {
                                    }
                                default:
                                    if (e0.f13788a < 32) {
                                        z5 = false;
                                        break;
                                    } else {
                                        z5 = false;
                                        break;
                                    }
                                    break;
                            }
                        } else if (e0.f13788a < 32 || (jVar = defaultTrackSelector.f5733i) == null || !jVar.f9099b || !jVar.c() || !defaultTrackSelector.f5733i.d() || !defaultTrackSelector.f5733i.a(format, defaultTrackSelector.j)) {
                            z5 = false;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5;
    }
}
