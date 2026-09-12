package mc;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.Format;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import ei.r0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import md.l0;
import md.x0;
import md.y0;
import org.webrtc.EglThread;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements r, gc.f, nh.y, mi.e, EglThread.ReleaseMonitor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15571d;

    public /* synthetic */ q(int i7) {
        this.f15571d = i7;
    }

    @Override // mi.e
    public Object a(zl.e eVar) {
        switch (this.f15571d) {
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6522a.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6524c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6523b.get();
            case 17:
                mi.m mVar = ExecutorsRegistrar.f6522a;
                return ni.i.f16951d;
            case 18:
            default:
                return TransportRegistrar.lambda$getComponents$2(eVar);
            case 19:
                return TransportRegistrar.lambda$getComponents$0(eVar);
            case 20:
                return TransportRegistrar.lambda$getComponents$1(eVar);
        }
    }

    @Override // gc.f
    public gc.g b(Bundle bundle) {
        r0 r0VarV;
        nd.a[] aVarArr;
        switch (this.f15571d) {
            case 3:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(x0.f15725x);
                if (parcelableArrayList == null) {
                    ei.c0 c0Var = ei.e0.f8303e;
                    r0VarV = r0.f8352w;
                } else {
                    r0VarV = je.b.v(Format.M0, parcelableArrayList);
                }
                return new x0(bundle.getString(x0.f15726y, ""), (Format[]) r0VarV.toArray(new Format[0]));
            case 4:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(y0.f15736w);
                return parcelableArrayList2 == null ? new y0(new x0[0]) : new y0((x0[]) je.b.v(x0.E, parcelableArrayList2).toArray(new x0[0]));
            case 11:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(nd.b.E);
                if (parcelableArrayList3 == null) {
                    aVarArr = new nd.a[0];
                } else {
                    nd.a[] aVarArr2 = new nd.a[parcelableArrayList3.size()];
                    for (int i7 = 0; i7 < parcelableArrayList3.size(); i7++) {
                        aVarArr2[i7] = (nd.a) nd.a.N.b((Bundle) parcelableArrayList3.get(i7));
                    }
                    aVarArr = aVarArr2;
                }
                return new nd.b(aVarArr, bundle.getLong(nd.b.F, 0L), bundle.getLong(nd.b.G, -9223372036854775807L), bundle.getInt(nd.b.H, 0));
            default:
                long j = bundle.getLong(nd.a.F);
                int i10 = bundle.getInt(nd.a.G);
                int i11 = bundle.getInt(nd.a.M);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(nd.a.H);
                int[] intArray = bundle.getIntArray(nd.a.I);
                long[] longArray = bundle.getLongArray(nd.a.J);
                long j5 = bundle.getLong(nd.a.K);
                boolean z5 = bundle.getBoolean(nd.a.L);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList4 == null ? new Uri[0] : (Uri[]) parcelableArrayList4.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new nd.a(j, i10, i11, iArr, uriArr, longArray, j5, z5);
        }
    }

    public void c(Object obj) {
        ((l0) obj).f15660b.release();
    }

    public Constructor d() {
        switch (this.f15571d) {
            case 23:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(pc.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(pc.k.class).getConstructor(null);
        }
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    @Override // mc.r
    public void release() {
    }
}
