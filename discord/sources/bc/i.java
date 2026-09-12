package bc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.os.Build;
import android.os.Trace;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener;
import com.discord.appreview.AppRatingRequester;
import com.discord.client_info.ClientUserAgent;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.inspector.TracingStateListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.network.OkHttpClientFactory;
import com.facebook.react.runtime.BridgelessAtomicRef;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactHostInspectorTarget;
import com.facebook.react.runtime.internal.bolts.TaskCompletionSource;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.analytics.AnalyticsListener$Events;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.EnhancedIntentService;
import ei.c0;
import ei.p;
import ei.q0;
import ei.r0;
import ei.y;
import fe.l;
import fe.n;
import hc.u;
import io.sentry.IScope;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.e6;
import io.sentry.f1;
import io.sentry.o3;
import io.sentry.q1;
import io.sentry.r3;
import io.sentry.w1;
import io.sentry.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import je.e0;
import md.x0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements dc.b, cc.f, OnCompleteListener, OkHttpClientFactory, BridgelessAtomicRef.Provider, TracingStateListener, PackagerStatusCallback, SwipeRefreshLayout$OnRefreshListener, ig.a, l, mi.e, je.j, je.k, q1, o3, r3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3116e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3117i;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        this.f3115d = i7;
        this.f3116e = obj;
        this.f3117i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // mi.e
    public Object a(zl.e eVar) {
        String strValueOf;
        switch (this.f3115d) {
            case 13:
                String str = (String) this.f3116e;
                io.sentry.react.b bVar = (io.sentry.react.b) this.f3117i;
                Context context = (Context) eVar.b(Context.class);
                switch (bVar.f13099d) {
                    case 2:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 3:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 4:
                        int i7 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        } else {
                            strValueOf = "";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new fj.a(str, strValueOf);
            default:
                String str2 = (String) this.f3116e;
                mi.b bVar2 = (mi.b) this.f3117i;
                try {
                    Trace.beginSection(str2);
                    return bVar2.f15804f.a(eVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // cc.f
    public Object apply(Object obj) {
        cc.h hVar = (cc.h) this.f3116e;
        vb.i iVar = (vb.i) this.f3117i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        cc.a aVar = hVar.f3581v;
        ArrayList arrayListI = hVar.i(sQLiteDatabase, iVar, aVar.f3566b);
        for (sb.d dVar : sb.d.values()) {
            if (dVar != iVar.f21531c) {
                int size = aVar.f3566b - arrayListI.size();
                if (size <= 0) {
                    break;
                }
                n8.f fVarA = vb.i.a();
                fVarA.h0(iVar.f21529a);
                if (dVar == null) {
                    throw new NullPointerException("Null priority");
                }
                fVarA.f16511i = dVar;
                fVarA.f16512v = iVar.f21530b;
                arrayListI.addAll(hVar.i(sQLiteDatabase, fVarA.J(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < arrayListI.size(); i7++) {
            sb2.append(((cc.b) arrayListI.get(i7)).f3570a);
            if (i7 < arrayListI.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", StackTraceHelper.NAME_KEY, "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new cc.g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListI.listIterator();
        while (listIterator.hasNext()) {
            cc.b bVar = (cc.b) listIterator.next();
            long j5 = bVar.f3570a;
            if (map.containsKey(Long.valueOf(j5))) {
                af.c cVarC = bVar.f3572c.c();
                for (cc.g gVar : (Set) map.get(Long.valueOf(j5))) {
                    cVarC.i(gVar.f3575a, gVar.f3576b);
                }
                listIterator.set(new cc.b(j5, bVar.f3571b, cVarC.m()));
            }
        }
        return arrayListI;
    }

    @Override // io.sentry.o3
    public void b(f1 f1Var) {
        switch (this.f3115d) {
            case 26:
                e6 e6Var = (e6) this.f3116e;
                IScope iScope = (IScope) this.f3117i;
                e6Var.getClass();
                if (f1Var == e6Var) {
                    iScope.r();
                }
                break;
            default:
                f1 f1Var2 = (f1) this.f3116e;
                IScope iScope2 = (IScope) this.f3117i;
                if (f1Var == f1Var2) {
                    iScope2.r();
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // fe.l
    public r0 c(int i7, x0 x0Var, int[] iArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object[] objArrCopyOf;
        x0 x0Var2 = x0Var;
        int i15 = this.f3115d;
        int i16 = 4;
        Object obj = this.f3117i;
        com.google.android.exoplayer2.trackselection.a aVar = (com.google.android.exoplayer2.trackselection.a) this.f3116e;
        switch (i15) {
            case 11:
                q0 q0Var = DefaultTrackSelector.k;
                int i17 = ((int[]) obj)[i7];
                int i18 = aVar.F;
                int i19 = aVar.G;
                boolean z5 = aVar.H;
                if (i18 == Integer.MAX_VALUE || i19 == Integer.MAX_VALUE) {
                    i10 = 4;
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = Integer.MAX_VALUE;
                    int i20 = 0;
                    while (i20 < x0Var2.f15727d) {
                        Format format = x0Var2.f15730v[i20];
                        int i21 = format.N;
                        int i22 = format.O;
                        if (i21 > 0 && i22 > 0) {
                            if (z5) {
                                if ((i21 > i22) != (i18 > i19)) {
                                    i14 = i18;
                                    i13 = i19;
                                } else {
                                    i13 = i18;
                                    i14 = i19;
                                }
                            } else {
                                i13 = i18;
                                i14 = i19;
                            }
                            int i23 = i21 * i14;
                            int i24 = i22 * i13;
                            Point point = i23 >= i24 ? new Point(i13, e0.f(i24, i21)) : new Point(e0.f(i23, i22), i14);
                            int i25 = format.N;
                            int i26 = i25 * i22;
                            if (i25 >= ((int) (point.x * 0.98f)) && i22 >= ((int) (point.y * 0.98f)) && i26 < i11) {
                                i11 = i26;
                            }
                        }
                        i20++;
                        i16 = 4;
                    }
                    i10 = i16;
                }
                p.c(i10, "initialCapacity");
                Object[] objArrCopyOf2 = new Object[i10];
                int i27 = 0;
                int i28 = 0;
                boolean z6 = false;
                while (i27 < x0Var2.f15727d) {
                    Format format2 = x0Var2.f15730v[i27];
                    int i29 = format2.N;
                    int i30 = (i29 == -1 || (i12 = format2.O) == -1) ? -1 : i29 * i12;
                    com.google.android.exoplayer2.trackselection.a aVar2 = aVar;
                    n nVar = new n(i7, x0Var2, i27, aVar2, iArr[i27], i17, i11 == Integer.MAX_VALUE || (i30 != -1 && i30 <= i11));
                    int i31 = i28 + 1;
                    if (objArrCopyOf2.length < i31) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, y.d(objArrCopyOf2.length, i31));
                    } else {
                        if (z6) {
                            objArrCopyOf2 = (Object[]) objArrCopyOf2.clone();
                        }
                        objArrCopyOf2[i28] = nVar;
                        i27++;
                        x0Var2 = x0Var;
                        i28++;
                        aVar = aVar2;
                    }
                    z6 = false;
                    objArrCopyOf2[i28] = nVar;
                    i27++;
                    x0Var2 = x0Var;
                    i28++;
                    aVar = aVar2;
                }
                return ei.e0.j(i28, objArrCopyOf2);
            default:
                String str = (String) obj;
                q0 q0Var2 = DefaultTrackSelector.k;
                c0 c0Var = ei.e0.f8303e;
                p.c(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i32 = 0;
                int i33 = 0;
                boolean z7 = false;
                while (i32 < x0Var2.f15727d) {
                    com.google.android.exoplayer2.trackselection.a aVar3 = aVar;
                    fe.k kVar = new fe.k(i7, x0Var2, i32, aVar3, iArr[i32], str);
                    int i34 = i33 + 1;
                    if (objArr.length < i34) {
                        objArrCopyOf = Arrays.copyOf(objArr, y.d(objArr.length, i34));
                    } else {
                        if (z7) {
                            objArrCopyOf = (Object[]) objArr.clone();
                        }
                        objArr[i33] = kVar;
                        i32++;
                        i33++;
                        aVar = aVar3;
                    }
                    objArr = objArrCopyOf;
                    z7 = false;
                    objArr[i33] = kVar;
                    i32++;
                    i33++;
                    aVar = aVar3;
                }
                return ei.e0.j(i33, objArr);
        }
    }

    @Override // com.facebook.react.modules.network.OkHttpClientFactory
    public OkHttpClient createNewNetworkModuleClient() {
        return ClientUserAgent.init$lambda$0((Context) this.f3116e, (String) this.f3117i);
    }

    @Override // io.sentry.q1
    public Object d() {
        w1 w1Var = (w1) this.f3116e;
        x1 x1Var = (x1) this.f3117i;
        w1Var.getClass();
        try {
            try {
                return Integer.valueOf(((io.sentry.vendor.gson.stream.a) x1Var.f13272e).P());
            } catch (Exception unused) {
                return Double.valueOf(((io.sentry.vendor.gson.stream.a) x1Var.f13272e).O());
            }
        } catch (Exception unused2) {
            return Long.valueOf(((io.sentry.vendor.gson.stream.a) x1Var.f13272e).Q());
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
    public void e() {
        SwipeRefreshLayoutManager.addEventEmitters$lambda$0((ThemedReactContext) this.f3116e, (ReactSwipeRefreshLayout) this.f3117i);
    }

    @Override // dc.b
    public Object execute() {
        switch (this.f3115d) {
            case 0:
                k kVar = (k) this.f3116e;
                Iterable iterable = (Iterable) this.f3117i;
                cc.h hVar = (cc.h) ((cc.d) kVar.f3124v);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.c().compileStatement("DELETE FROM events WHERE _id in " + cc.h.q(iterable)).execute();
                    break;
                }
                break;
            default:
                k kVar2 = (k) this.f3116e;
                for (Map.Entry entry : ((HashMap) this.f3117i).entrySet()) {
                    ((cc.h) ((cc.c) kVar2.G)).l(((Integer) entry.getValue()).intValue(), yb.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // ig.a
    public Object f(Task task) {
        com.google.firebase.messaging.h hVar = (com.google.firebase.messaging.h) this.f3116e;
        String str = (String) this.f3117i;
        synchronized (hVar) {
            ((s.e) hVar.f6589b).remove(str);
        }
        return task;
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        iScope.M(new io.sentry.android.core.e((ActivityLifecycleIntegration) this.f3116e, iScope, (f1) this.f3117i));
    }

    @Override // com.facebook.react.runtime.BridgelessAtomicRef.Provider
    public Object get() {
        return ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$41$lambda$38((ReactHostImpl) this.f3116e, (String) this.f3117i);
    }

    @Override // je.k
    public void h(Object obj, je.g gVar) {
        hc.b bVar = (hc.b) obj;
        bVar.onEvents((Player) this.f3117i, new AnalyticsListener$Events(gVar, ((u) this.f3116e).f10475w));
    }

    @Override // je.j
    public void invoke(Object obj) {
        switch (this.f3115d) {
            case 16:
                ((hc.b) obj).onMediaMetadataChanged((AnalyticsListener$EventTime) this.f3116e, (MediaMetadata) this.f3117i);
                break;
            case 17:
                ((hc.b) obj).onPlaybackParametersChanged((AnalyticsListener$EventTime) this.f3116e, (PlaybackParameters) this.f3117i);
                break;
            case 18:
            default:
                AnalyticsListener$EventTime analyticsListener$EventTime = (AnalyticsListener$EventTime) this.f3116e;
                VideoSize videoSize = (VideoSize) this.f3117i;
                hc.b bVar = (hc.b) obj;
                bVar.onVideoSizeChanged(analyticsListener$EventTime, videoSize);
                bVar.onVideoSizeChanged(analyticsListener$EventTime, videoSize.f5849d, videoSize.f5850e, videoSize.f5851i, videoSize.f5852v);
                break;
            case 19:
                ((hc.b) obj).onCues((AnalyticsListener$EventTime) this.f3116e, (CueGroup) this.f3117i);
                break;
            case 20:
                ((hc.b) obj).onAvailableCommandsChanged((AnalyticsListener$EventTime) this.f3116e, (Player.Commands) this.f3117i);
                break;
            case 21:
                ((hc.b) obj).onCues((AnalyticsListener$EventTime) this.f3116e, (List) this.f3117i);
                break;
            case 22:
                ((hc.b) obj).onTracksChanged((AnalyticsListener$EventTime) this.f3116e, (Tracks) this.f3117i);
                break;
            case 23:
                ((hc.b) obj).onMetadata((AnalyticsListener$EventTime) this.f3116e, (Metadata) this.f3117i);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i7 = this.f3115d;
        Object obj = this.f3117i;
        Object obj2 = this.f3116e;
        switch (i7) {
            case 3:
                AppRatingRequester.executeRequest$lambda$1((ReviewManager) obj2, (AppRatingRequester) obj, task);
                break;
            default:
                int i10 = EnhancedIntentService.f6528d;
                ((EnhancedIntentService) obj2).a((Intent) obj);
                break;
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
    public void onPackagerStatusFetched(boolean z5) {
        ReactHostImpl._get_isMetroRunning_$lambda$47((ReactHostImpl) this.f3116e, "isMetroRunning()", (TaskCompletionSource) this.f3117i, z5);
    }

    @Override // com.facebook.react.devsupport.inspector.TracingStateListener
    public void onStateChanged(TracingState tracingState, boolean z5) {
        ReactHostImpl.createReactHostInspectorTarget$lambda$69((ReactHostImpl) this.f3116e, (ReactHostInspectorTarget) this.f3117i, tracingState, z5);
    }
}
