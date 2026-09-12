package ok;

import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.core.view.e1;
import bd.d;
import com.discord.media.utils.Transcoder$convertCompress$3$2;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.firebase.messaging.r;
import ga.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m3.m;
import org.webrtc.MediaStreamTrack;
import pa.s;
import rk.e;
import vk.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {
    public final String E;
    public final r F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17282d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17284i;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pc.r f17287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f17288y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17283e = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f17285v = new k();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f17286w = new s();

    public b(String str, ArrayList arrayList, int i7, r rVar) {
        this.E = str;
        this.f17288y = arrayList;
        this.f17284i = i7;
        this.F = rVar;
        pc.r rVar2 = new pc.r();
        rVar2.f17922d = new ArrayList(2);
        this.f17287x = rVar2;
    }

    public final void a() {
        pc.r rVar = this.f17287x;
        String str = this.E;
        r rVar2 = this.F;
        try {
            try {
                f();
                d();
                b();
            } catch (Exception e10) {
                Log.e("b", "cancel: ", e10);
            }
        } finally {
            rVar2.n(str, (ArrayList) rVar.f17922d);
        }
    }

    public final void b() {
        Iterator it = this.f17288y.iterator();
        while (it.hasNext()) {
            try {
                uk.b bVar = ((a) it.next()).f17278e;
                if (!TextUtils.isEmpty("")) {
                    new File("").delete();
                }
            } catch (Exception e10) {
                Log.e("b", "deleteOutputFiles: ", e10);
            }
        }
    }

    public final void c(Exception exc) {
        pc.r rVar = this.f17287x;
        String str = this.E;
        r rVar2 = this.F;
        try {
            try {
                f();
                d();
                b();
            } catch (Exception e10) {
                Log.e("b", "error: ", e10);
            }
        } finally {
            rVar2.o(str, exc, (ArrayList) rVar.f17922d);
        }
    }

    public final void d() {
        if (this.f17282d != null) {
            for (int i7 = 0; i7 < this.f17282d.size(); i7++) {
                try {
                    ((wk.c) this.f17282d.get(i7)).g();
                } catch (Exception e10) {
                    Log.e("b", "release: Exception when stopping track transcoder: ", e10);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashSet<uk.b> hashSet2 = new HashSet();
        for (a aVar : this.f17288y) {
            hashSet.add(aVar.f17274a);
            hashSet2.add(aVar.f17278e);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ((uk.a) it.next()).release();
            } catch (Exception e11) {
                Log.e("b", "release: Exception when releasing media source: ", e11);
            }
        }
        for (uk.b bVar : hashSet2) {
            bVar.getClass();
            try {
                bVar.f21176c.release();
                try {
                    ParcelFileDescriptor parcelFileDescriptor = bVar.f21178e;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                        bVar.f21178e = null;
                    }
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                try {
                    ParcelFileDescriptor parcelFileDescriptor2 = bVar.f21178e;
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                        bVar.f21178e = null;
                    }
                } catch (IOException unused2) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x03da  */
    /* JADX WARN: Code duplicated, block: B:142:0x03de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [wk.b] */
    /* JADX WARN: Type inference failed for: r7v15, types: [wk.a, wk.c] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, wk.c] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    public final void e() throws e, rk.a {
        ArrayList arrayList;
        pc.r rVar;
        String str;
        long j;
        long availableBytes;
        boolean z5;
        ?? bVar;
        long j5;
        int i7;
        r rVar2 = this.F;
        Transcoder$convertCompress$3$2 transcoder$convertCompress$3$2 = (Transcoder$convertCompress$3$2) rVar2.f6611e;
        d dVar = (d) rVar2.f6613v;
        Bundle bundle = (Bundle) rVar2.f6612i;
        int i10 = 0;
        while (true) {
            arrayList = this.f17288y;
            int size = arrayList.size();
            rVar = this.f17287x;
            if (i10 >= size) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            aVar.f17274a.getTrackFormat(aVar.f17280g);
            rVar.getClass();
            ArrayList arrayList2 = (ArrayList) rVar.f17922d;
            arrayList2.add(new pk.a());
            ((pk.a) arrayList2.get(i10)).getClass();
            i10++;
        }
        Iterator it = arrayList.iterator();
        long jMax = 0;
        while (it.hasNext()) {
            jMax = Math.max(m.A((a) it.next()), jMax);
        }
        Iterator it2 = arrayList.iterator();
        float f2 = 0.0f;
        while (true) {
            str = "mime";
            if (!it2.hasNext()) {
                break;
            }
            a aVar2 = (a) it2.next();
            MediaFormat trackFormat = aVar2.f17274a.getTrackFormat(aVar2.f17280g);
            int integer = trackFormat.containsKey("bitrate") ? trackFormat.getInteger("bitrate") : -1;
            long jA = m.A(aVar2);
            Iterator it3 = it2;
            long j7 = jMax;
            if (jA < 0) {
                Log.d("m", "Track duration is not available, using maximum duration");
                j5 = j7;
            } else {
                j5 = jA;
            }
            String string = trackFormat.containsKey("mime") ? trackFormat.getString("mime") : null;
            if (string != null) {
                MediaFormat mediaFormat = aVar2.f17279f;
                if (mediaFormat != null) {
                    integer = mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : -1;
                } else if (string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) && integer < 0) {
                    integer = 320000;
                }
            }
            if (integer < 0) {
                Log.d("m", "Bitrate is not available, cannot use that track to estimate size");
                i7 = 0;
            } else {
                i7 = integer;
            }
            f2 += (j5 / 1000000.0f) * i7;
            it2 = it3;
            jMax = j7;
        }
        long j10 = (long) (f2 / 8.0f);
        long j11 = (long) (j10 * 1.1f);
        this.f17286w.getClass();
        try {
            j = -1;
            try {
                availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes();
            } catch (Exception unused) {
                Log.e("s", "Could not get Available Disk Space");
                availableBytes = j;
            }
        } catch (Exception unused2) {
            j = -1;
        }
        if (availableBytes != j && availableBytes < j11) {
            throw new rk.a(j10, availableBytes);
        }
        int size2 = arrayList.size();
        this.f17282d = new ArrayList(size2);
        if (size2 < 1) {
            throw new e(9, null, null);
        }
        int i11 = 0;
        while (i11 < size2) {
            a aVar3 = (a) arrayList.get(i11);
            int i12 = aVar3.f17280g;
            int i13 = aVar3.f17281h;
            uk.a aVar4 = aVar3.f17274a;
            qk.b bVar2 = aVar3.f17275b;
            int i14 = size2;
            vk.e eVar = aVar3.f17276c;
            qk.b encoder = aVar3.f17277d;
            uk.b bVar3 = aVar3.f17278e;
            MediaFormat mediaFormat2 = aVar3.f17279f;
            ArrayList arrayList3 = arrayList;
            this.f17285v.getClass();
            if (mediaFormat2 == null) {
                bVar = new wk.b(aVar4, i12, bVar3, i13);
            } else {
                String string2 = mediaFormat2.getString(str);
                if (string2 == null) {
                    throw new e(8, mediaFormat2, null);
                }
                if (string2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) || string2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    if (bVar2 == null) {
                        throw new e(12, mediaFormat2, null);
                    }
                    if (encoder == null) {
                        throw new e(13, mediaFormat2, null);
                    }
                }
                if (!string2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    str = str;
                    vk.e bVar4 = eVar;
                    if (string2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                        if (bVar4 == null) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            bVar4 = new vk.b(encoder);
                        }
                        vk.e eVar2 = bVar4;
                        bVar = new wk.a(i12, i13, mediaFormat2, bVar2, encoder, aVar4, bVar3, eVar2);
                        bVar.f22319m = 2;
                        bVar.f22320n = 2;
                        bVar.f22321o = 2;
                        bVar.f22322p = aVar4.getTrackFormat(i12);
                        encoder.a(bVar.j);
                        eVar2.c(null, bVar.f22322p, bVar.j);
                        MediaFormat mediaFormat3 = bVar.f22322p;
                        bVar2.getClass();
                        bVar2.f18918b = xk.a.c(mediaFormat3, null, false, 5, 1, 2);
                        bVar2.f18920d = false;
                    } else {
                        Log.i("k", "Unsupported track mime type: " + string2 + ", will use passthrough transcoder");
                        bVar = new wk.b(aVar4, i12, bVar3, i13);
                    }
                } else {
                    if (eVar == null) {
                        throw new e(14, mediaFormat2, null);
                    }
                    wk.d dVar2 = new wk.d(i12, i13, mediaFormat2, bVar2, encoder, aVar4, bVar3, eVar);
                    dVar2.f22336m = 2;
                    dVar2.f22337n = 2;
                    dVar2.f22338o = 2;
                    dVar2.f22341r = mediaFormat2;
                    if (!(eVar instanceof vk.d)) {
                        throw new IllegalArgumentException("Cannot use non-OpenGL video renderer in ".concat(wk.d.class.getSimpleName()));
                    }
                    vk.d dVar3 = (vk.d) eVar;
                    dVar2.f22339p = dVar3;
                    MediaFormat trackFormat2 = aVar4.getTrackFormat(i12);
                    dVar2.f22340q = trackFormat2;
                    Number numberC = e1.c(trackFormat2, "frame-rate");
                    Number numberC2 = e1.c(dVar2.f22341r, "frame-rate");
                    if (numberC2 == null || numberC2.intValue() < 1) {
                        numberC2 = numberC;
                    }
                    dVar2.f22342s = (numberC == null || numberC.intValue() <= numberC2.intValue()) ? null : new vk.c(numberC.intValue(), numberC2.intValue());
                    encoder.a(dVar2.j);
                    dVar3.c(encoder.f18918b.createInputSurface(), dVar2.f22340q, dVar2.f22341r);
                    MediaFormat mediaFormat4 = dVar2.f22340q;
                    f fVar = dVar3.f21719b;
                    Surface surface = fVar != null ? fVar.f21725e : null;
                    bVar2.getClass();
                    bVar2.f18918b = xk.a.c(mediaFormat4, surface, false, 5, 1, 2);
                    bVar2.f18920d = false;
                    bVar = dVar2;
                }
                this.f17282d.add(bVar);
                bVar.c();
                bVar.d();
                ((pk.a) ((ArrayList) rVar.f17922d).get(i11)).getClass();
                i11++;
                size2 = i14;
                arrayList = arrayList3;
                str = str;
            }
            this.f17282d.add(bVar);
            bVar.c();
            bVar.d();
            ((pk.a) ((ArrayList) rVar.f17922d).get(i11)).getClass();
            i11++;
            size2 = i14;
            arrayList = arrayList3;
            str = str;
        }
        ArrayList arrayList4 = arrayList;
        Iterator it4 = this.f17282d.iterator();
        while (it4.hasNext()) {
            ((wk.c) it4.next()).f();
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            uk.a aVar5 = ((a) it5.next()).f17274a;
            aVar5.getSelection().getClass();
            aVar5.seekTo(0L, 0);
        }
        String str2 = this.E;
        if (dVar == null) {
            transcoder$convertCompress$3$2.onStarted(str2);
        } else {
            Message messageObtain = Message.obtain(dVar, 0);
            messageObtain.obj = null;
            bundle.putString("jobId", str2);
            messageObtain.setData(bundle);
            messageObtain.sendToTarget();
        }
        this.f17283e = 0.0f;
        do {
            z5 = true;
            for (int i15 = 0; i15 < this.f17282d.size(); i15++) {
                wk.c cVar = (wk.c) this.f17282d.get(i15);
                System.currentTimeMillis();
                z5 &= cVar.e() == 4;
                System.currentTimeMillis();
                ((pk.a) ((ArrayList) rVar.f17922d).get(i15)).getClass();
            }
            Iterator it6 = this.f17282d.iterator();
            float f7 = 0.0f;
            while (it6.hasNext()) {
                f7 += ((wk.c) it6.next()).f22335l;
            }
            float size3 = f7 / this.f17282d.size();
            int i16 = this.f17284i;
            if (i16 == 0 && size3 != this.f17283e) {
                if (dVar == null) {
                    transcoder$convertCompress$3$2.onProgress(str2, size3);
                } else {
                    Message messageObtain2 = Message.obtain(dVar, 3);
                    messageObtain2.obj = null;
                    bundle.putString("jobId", str2);
                    bundle.putFloat(ReactProgressBarViewManager.PROP_PROGRESS, size3);
                    messageObtain2.setData(bundle);
                    messageObtain2.sendToTarget();
                }
                this.f17283e = size3;
            } else if (i16 != 0) {
                if (size3 >= (1.0f / i16) + this.f17283e) {
                    if (dVar == null) {
                        transcoder$convertCompress$3$2.onProgress(str2, size3);
                    } else {
                        Message messageObtain3 = Message.obtain(dVar, 3);
                        messageObtain3.obj = null;
                        bundle.putString("jobId", str2);
                        bundle.putFloat(ReactProgressBarViewManager.PROP_PROGRESS, size3);
                        messageObtain3.setData(bundle);
                        messageObtain3.sendToTarget();
                    }
                    this.f17283e = size3;
                }
            }
            if (Thread.interrupted()) {
                a();
                z5 = false;
                break;
            }
        } while (!z5);
        if (z5) {
            f();
            d();
            ArrayList arrayList5 = (ArrayList) rVar.f17922d;
            ((Map) rVar2.f6610d).remove(str2);
            if (dVar == null) {
                transcoder$convertCompress$3$2.onCompleted(str2, arrayList5);
                return;
            }
            Message messageObtain4 = Message.obtain(dVar, 1);
            messageObtain4.obj = arrayList5;
            bundle.putString("jobId", str2);
            messageObtain4.setData(bundle);
            messageObtain4.sendToTarget();
        }
    }

    public final void f() {
        if (this.f17282d != null) {
            for (int i7 = 0; i7 < this.f17282d.size(); i7++) {
                MediaFormat mediaFormat = ((wk.c) this.f17282d.get(i7)).j;
                ((pk.a) ((ArrayList) this.f17287x.f17922d).get(i7)).getClass();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e();
        } catch (RuntimeException e10) {
            Log.e("b", "Transformation job error", e10);
            if (e10.getCause() instanceof InterruptedException) {
                a();
            } else {
                c(e10);
            }
        } catch (rk.d e11) {
            Log.e("b", "Transformation job error", e11);
            e11.f19437d = this.E;
            c(e11);
        }
    }
}
