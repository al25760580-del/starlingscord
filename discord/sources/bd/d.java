package bd;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.discord.media.utils.Transcoder$convertCompress$3$2;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.exoplayer2.SimpleExoPlayer;
import ei.c0;
import ei.e0;
import gc.v1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3138b;

    public /* synthetic */ d() {
        this.f3137a = 2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SimpleExoPlayer simpleExoPlayer;
        Set set;
        e eVar = null;
        eVar = null;
        eVar = null;
        switch (this.f3137a) {
            case 0:
                f fVar = (f) this.f3138b;
                fVar.getClass();
                int i7 = message.what;
                if (i7 == 0) {
                    e eVar2 = (e) message.obj;
                    try {
                        fVar.f3146a.queueInputBuffer(eVar2.f3139a, 0, eVar2.f3140b, eVar2.f3142d, eVar2.f3143e);
                        break;
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = fVar.f3149d;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                    eVar = eVar2;
                } else if (i7 == 1) {
                    e eVar3 = (e) message.obj;
                    int i10 = eVar3.f3139a;
                    MediaCodec.CryptoInfo cryptoInfo = eVar3.f3141c;
                    long j = eVar3.f3142d;
                    int i11 = eVar3.f3143e;
                    try {
                        synchronized (f.f3145h) {
                            try {
                                fVar.f3146a.queueSecureInputBuffer(i10, 0, cryptoInfo, j, i11);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference2 = fVar.f3149d;
                        while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                        }
                    }
                    eVar = eVar3;
                } else if (i7 != 2) {
                    AtomicReference atomicReference3 = fVar.f3149d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    fVar.f3150e.p();
                }
                if (eVar != null) {
                    ArrayDeque arrayDeque = f.f3144g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(eVar);
                        break;
                    }
                    return;
                }
                return;
            case 1:
                e5.i iVar = (e5.i) this.f3138b;
                if (message.what == 1 && (simpleExoPlayer = iVar.F) != null && simpleExoPlayer.w() == 3 && iVar.F.g()) {
                    long jS = iVar.F.S();
                    long duration = (iVar.F.getDuration() * ((long) iVar.F.U())) / 100;
                    e5.j jVar = iVar.f8057d;
                    double d6 = jS;
                    double d7 = duration;
                    double duration2 = iVar.F.getDuration();
                    v1 v1Var = new v1();
                    if (!iVar.F.J().p()) {
                        iVar.F.J().n(iVar.F.D(), v1Var);
                    }
                    double d8 = v1Var.f9914x + jS;
                    jVar.getClass();
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putDouble("currentTime", d6 / 1000.0d);
                    writableMapCreateMap.putDouble("playableDuration", d7 / 1000.0d);
                    writableMapCreateMap.putDouble("seekableDuration", duration2 / 1000.0d);
                    writableMapCreateMap.putDouble("currentPlaybackTime", d8);
                    jVar.c("onVideoProgress", writableMapCreateMap);
                    sendMessageDelayed(obtainMessage(1), Math.round(iVar.f8070o0));
                    return;
                }
                return;
            case 2:
                int i12 = message.what;
                if (i12 == -3 || i12 == -2 || i12 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f3138b).get(), message.what);
                    return;
                } else {
                    if (i12 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 3:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i13 = message.what;
                if (i13 == 0) {
                    mc.c cVar = (mc.c) this.f3138b;
                    e4.e eVar4 = cVar.f15497c;
                    if (obj == cVar.f15516x) {
                        if (cVar.f15507o == 2 || cVar.h()) {
                            cVar.f15516x = null;
                            if (obj2 instanceof Exception) {
                                eVar4.L((Exception) obj2, false);
                                return;
                            }
                            try {
                                cVar.f15496b.q((byte[]) obj2);
                                eVar4.f7972i = null;
                                HashSet hashSet = (HashSet) eVar4.f7971e;
                                e0 e0VarK = e0.k(hashSet);
                                hashSet.clear();
                                c0 c0VarListIterator = e0VarK.listIterator(0);
                                while (c0VarListIterator.hasNext()) {
                                    mc.c cVar2 = (mc.c) c0VarListIterator.next();
                                    if (cVar2.k()) {
                                        cVar2.g(true);
                                    }
                                }
                                return;
                            } catch (Exception e12) {
                                eVar4.L(e12, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i13 != 1) {
                    return;
                }
                mc.c cVar3 = (mc.c) this.f3138b;
                if (obj == cVar3.f15515w && cVar3.h()) {
                    cVar3.f15515w = null;
                    if (obj2 instanceof Exception) {
                        cVar3.j((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArrP = cVar3.f15496b.p(cVar3.f15513u, (byte[]) obj2);
                        if (cVar3.f15514v != null && bArrP != null && bArrP.length != 0) {
                            cVar3.f15514v = bArrP;
                        }
                        cVar3.f15507o = 4;
                        je.d dVar = cVar3.f15502h;
                        synchronized (dVar.f13777d) {
                            set = dVar.f13779i;
                            break;
                        }
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((mc.n) it.next()).a();
                        }
                        return;
                    } catch (Exception e13) {
                        cVar3.j(e13, true);
                        return;
                    }
                }
                return;
            case 4:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (mc.c cVar4 : ((mc.f) this.f3138b).f15538m) {
                    cVar4.m();
                    if (Arrays.equals(cVar4.f15513u, bArr)) {
                        if (message.what == 2 && cVar4.f15507o == 4) {
                            int i14 = je.e0.f13788a;
                            cVar4.g(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                Transcoder$convertCompress$3$2 transcoder$convertCompress$3$2 = (Transcoder$convertCompress$3$2) this.f3138b;
                Object obj3 = message.obj;
                List list = obj3 != null ? (List) obj3 : null;
                Bundle data = message.getData();
                String string = data.getString("jobId");
                if (string == null) {
                    throw new IllegalArgumentException("Handler message doesn't contain an id!");
                }
                int i15 = message.what;
                if (i15 == 0) {
                    transcoder$convertCompress$3$2.onStarted(string);
                    return;
                }
                if (i15 == 1) {
                    transcoder$convertCompress$3$2.onCompleted(string, list);
                    return;
                }
                if (i15 == 2) {
                    transcoder$convertCompress$3$2.onError(string, (Throwable) data.getSerializable("throwable"), list);
                    return;
                }
                if (i15 == 3) {
                    transcoder$convertCompress$3$2.onProgress(string, data.getFloat(ReactProgressBarViewManager.PROP_PROGRESS));
                    return;
                } else {
                    if (i15 == 4) {
                        transcoder$convertCompress$3$2.onCancelled(string, list);
                        return;
                    }
                    Log.e("r", "Unknown event received: " + message.what);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Looper looper, int i7) {
        super(looper);
        this.f3137a = i7;
        this.f3138b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, Transcoder$convertCompress$3$2 transcoder$convertCompress$3$2) {
        super(looper);
        this.f3137a = 5;
        this.f3138b = transcoder$convertCompress$3$2;
    }

    public d(e5.i iVar) {
        this.f3137a = 1;
        this.f3138b = iVar;
    }
}
