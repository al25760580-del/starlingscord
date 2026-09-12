package app.rive.runtime.kotlin.core;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.m3;
import androidx.appcompat.widget.y2;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import bc.k;
import bd.o;
import bd.y;
import bd.z;
import c5.p;
import c5.t;
import cc.h;
import com.discord.MainApplication;
import com.discord.age_assurance.PlayIntegrityModule;
import com.discord.age_assurance.f;
import com.discord.chat.presentation.message.view.GuildInviteView;
import com.discord.libdiscore.LibdiscoreModuleClass;
import com.discord.libdiscore.LibdiscoreModuleProvider;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.inspector.TracingStateListener;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorUpdateListener;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.runtime.ReactHostInspectorTarget;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.reactnativecommunity.webview.g;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.n0;
import com.swmansion.rnscreens.v0;
import dc.b;
import di.j;
import e4.m;
import fe.r;
import ig.c;
import ig.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import vb.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p, b, y, LibdiscoreModuleProvider, d, c, AccessibilityViewCommand, UIManagerProvider, TracingStateListener, OnCompleteListener, PermissionListener, UIManagerModule.CustomEventNamesResolver, y2, UIBlock, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2877e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f2876d = i7;
        this.f2877e = obj;
    }

    @Override // bd.y
    public int a(Object obj) {
        Format format = (Format) this.f2877e;
        o oVar = (o) obj;
        String str = oVar.f3173b;
        return ((str.equals(format.I) || str.equals(z.b(format))) && oVar.c(format, false)) ? 1 : 0;
    }

    @Override // androidx.appcompat.widget.y2
    public boolean b() {
        switch (this.f2876d) {
            case 23:
                com.swmansion.rnscreens.c cVar = (com.swmansion.rnscreens.c) this.f2877e;
                y2 y2Var = cVar.H0;
                boolean zB = y2Var != null ? y2Var.b() : false;
                m3 m3Var = cVar.J0;
                if (m3Var.f1032a) {
                    ((com.swmansion.rnscreens.b) m3Var.f1035d).remove();
                    m3Var.f1032a = false;
                }
                return zB;
            default:
                v0.d((v0) this.f2877e);
                return false;
        }
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean c(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return GuildInviteView.setClickListeners$lambda$12((View.OnClickListener) this.f2877e, view, commandArguments);
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        return DefaultReactNativeHost.getUIManagerProvider$lambda$0((DefaultReactNativeHost) this.f2877e, reactApplicationContext);
    }

    @Override // c5.p
    public void d(t tVar) {
        CDNAssetLoader.loadContents$lambda$0((CDNAssetLoader) this.f2877e, tVar);
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        n0 n0Var = (n0) this.f2877e;
        if (nativeViewHierarchyManager == null) {
            return;
        }
        View viewResolveView = nativeViewHierarchyManager.resolveView(n0Var.getReactTag());
        if (viewResolveView instanceof ScreenContainer) {
            ((ScreenContainer) viewResolveView).performUpdates();
        }
    }

    @Override // com.discord.libdiscore.LibdiscoreModuleProvider, di.j
    public LibdiscoreModuleClass.LibdiscoreModule get() {
        return MainApplication.libdiscoreModuleProvider$lambda$6((MainApplication) this.f2877e);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f2876d) {
            case 18:
                b0.a((Intent) this.f2877e);
                break;
            case 19:
                ((d0) this.f2877e).f6574b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f2877e).cancel(false);
                break;
        }
    }

    @Override // ig.c
    public void onFailure(Exception exc) {
        PlayIntegrityModule.withTokenProvider$lambda$10((PlayIntegrityModule) this.f2877e, exc);
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        GeolocationPermissions.Callback callback;
        String str;
        g gVar = (g) this.f2877e;
        ArrayList arrayList5 = gVar.G;
        gVar.F = false;
        boolean z5 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            boolean z6 = iArr[i10] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = gVar.f7043y) != null && (str = gVar.E) != null) {
                if (z6) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                gVar.f7043y = null;
                gVar.E = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z6 && (arrayList4 = gVar.f7042x) != null) {
                    arrayList4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z5 = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z6 && (arrayList3 = gVar.f7042x) != null) {
                    arrayList3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z5 = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z6 && (arrayList2 = gVar.f7042x) != null) {
                    arrayList2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z5 = true;
            }
        }
        if (z5 && (permissionRequest = gVar.f7041w) != null && (arrayList = gVar.f7042x) != null) {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
            gVar.f7041w = null;
            gVar.f7042x = null;
        }
        if (arrayList5.isEmpty()) {
            return true;
        }
        gVar.a(arrayList5);
        return false;
    }

    @Override // com.facebook.react.devsupport.inspector.TracingStateListener
    public void onStateChanged(TracingState tracingState, boolean z5) {
        ReactHostInspectorTarget.addPerfMonitorListener$lambda$0((PerfMonitorUpdateListener) this.f2877e, tracingState, z5);
    }

    @Override // ig.d
    public void onSuccess(Object obj) {
        switch (this.f2876d) {
            case 7:
                ((com.discord.age_assurance.a) this.f2877e).invoke(obj);
                break;
            case 8:
                ((com.discord.age_assurance.c) this.f2877e).invoke(obj);
                break;
            case 9:
                ((com.discord.age_assurance.c) this.f2877e).invoke(obj);
                break;
            case 10:
                ((f) this.f2877e).invoke(obj);
                break;
            case 11:
            case 12:
            case 13:
            default:
                ((com.discord.security_key.a) this.f2877e).invoke(obj);
                break;
            case 14:
                ((com.discord.security_key.a) this.f2877e).invoke(obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
    public String resolveCustomEventName(String str) {
        return ((UIManager) this.f2877e).resolveCustomDirectEventName(str);
    }

    @Override // di.j
    public Object get() {
        switch (this.f2876d) {
            case 26:
                return (gc.j) this.f2877e;
            case 27:
                return (r) this.f2877e;
            case 28:
                return (gc.b) this.f2877e;
            default:
                return (he.g) this.f2877e;
        }
    }

    @Override // dc.b
    public Object execute() {
        int i7 = this.f2876d;
        Object obj = this.f2877e;
        switch (i7) {
            case 1:
                h hVar = (h) ((cc.c) obj);
                hVar.getClass();
                int i10 = yb.a.f23215e;
                com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r();
                rVar.f6611e = null;
                rVar.f6612i = new ArrayList();
                rVar.f6613v = null;
                rVar.f6610d = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseC = hVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    yb.a aVar = (yb.a) h.u(sQLiteDatabaseC.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ac.b(hVar, map, rVar, 3));
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            case 2:
                h hVar2 = (h) ((cc.d) obj);
                long jB = hVar2.f3579e.b() - hVar2.f3581v.f3568d;
                SQLiteDatabase sQLiteDatabaseC2 = hVar2.c();
                sQLiteDatabaseC2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jB)};
                    Cursor cursorRawQuery = sQLiteDatabaseC2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.l(cursorRawQuery.getInt(0), yb.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseC2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseC2.setTransactionSuccessful();
                    sQLiteDatabaseC2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th3) {
                    sQLiteDatabaseC2.endTransaction();
                    throw th3;
                }
            case 3:
                h hVar3 = (h) ((cc.c) ((k) obj).G);
                SQLiteDatabase sQLiteDatabaseC3 = hVar3.c();
                sQLiteDatabaseC3.beginTransaction();
                try {
                    sQLiteDatabaseC3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseC3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f3579e.b()).execute();
                    sQLiteDatabaseC3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseC3.endTransaction();
                }
            default:
                com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) obj;
                Iterator it = ((Iterable) ((h) ((cc.d) rVar2.f6611e)).g(new k1(11))).iterator();
                while (it.hasNext()) {
                    ((m) rVar2.f6612i).J((i) it.next(), 1, false);
                }
                return null;
        }
    }
}
