package ac;

import a5.l0;
import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.b4;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import cc.f;
import cc.h;
import com.discord.crash_reporting.CrashReporting;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.modal.ReactModalHostView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.r;
import com.google.firebase.messaging.t;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.e6;
import io.sentry.f1;
import io.sentry.g6;
import io.sentry.h4;
import io.sentry.h6;
import io.sentry.i6;
import io.sentry.k;
import io.sentry.k6;
import io.sentry.n3;
import io.sentry.o3;
import io.sentry.protocol.p;
import io.sentry.protocol.v;
import io.sentry.r3;
import io.sentry.w5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import o1.j;
import o1.m;
import o1.o;
import vb.i;
import vb.l;
import yb.e;
import yb.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements dc.b, f, r3, ReactModalHostView.OnRequestCloseListener, ig.f, n3, k6, o3, ig.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f306e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f307i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f308v;

    public /* synthetic */ b(h hVar, Object obj, i iVar, int i7) {
        this.f305d = i7;
        this.f308v = hVar;
        this.f306e = obj;
        this.f307i = iVar;
    }

    @Override // io.sentry.n3
    public void a(h6 h6Var) {
        ConcurrentHashMap concurrentHashMap;
        h4 h4Var = (h4) this.f308v;
        SentryEvent sentryEvent = (SentryEvent) this.f307i;
        Hint hint = (Hint) this.f306e;
        if (h6Var == null) {
            ((w5) h4Var.f12711b).getLogger().q(SentryLevel.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strC = null;
        g6 g6Var = sentryEvent.e() != null ? g6.Crashed : null;
        boolean z5 = g6.Crashed == g6Var || sentryEvent.f();
        p pVar = sentryEvent.f12673v;
        String str = (pVar == null || (concurrentHashMap = pVar.f13018x) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) sentryEvent.f12673v.f13018x.get("user-agent");
        Object objB = hint.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.a) {
            strC = ((io.sentry.hints.a) objB).c();
            g6Var = g6.Abnormal;
        }
        if (!h6Var.d(g6Var, str, z5, strC) || h6Var.f12722y == g6.Ok) {
            return;
        }
        h6Var.b(io.sentry.config.a.y());
    }

    @Override // cc.f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        yb.c cVar;
        int i7 = this.f305d;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        yb.c cVar2 = yb.c.CACHE_FULL;
        int i13 = 2;
        int i14 = 1;
        Object obj2 = this.f306e;
        Object obj3 = this.f307i;
        int i15 = 0;
        h hVar = (h) this.f308v;
        switch (i7) {
            case 1:
                vb.h hVar2 = (vb.h) obj2;
                l lVar = hVar2.f21525c;
                String str = hVar2.f21523a;
                i iVar = (i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                cc.a aVar = hVar.f3581v;
                if (jSimpleQueryForLong >= aVar.f3565a) {
                    hVar.l(1L, cVar2, str);
                    return -1L;
                }
                Long lF = h.f(sQLiteDatabase, iVar);
                if (lF != null) {
                    jInsert = lF.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f21529a);
                    contentValues.put("priority", Integer.valueOf(fc.a.a(iVar.f21531c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f21530b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.f3569e;
                byte[] bArr2 = lVar.f21540b;
                boolean z5 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.f21526d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.f21527e));
                contentValues2.put("payload_encoding", lVar.f21539a.f19822a);
                contentValues2.put("code", hVar2.f21524b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z5));
                contentValues2.put("payload", z5 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z5) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i16));
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar2.f21528f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(StackTraceHelper.NAME_KEY, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                i iVar2 = (i) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i14 : 0;
                    af.c cVar3 = new af.c();
                    cVar3.f397w = new HashMap();
                    String string = cursor2.getString(i14);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    cVar3.f395i = string;
                    cVar3.f394e = Long.valueOf(cursor2.getLong(i13));
                    cVar3.f396v = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        cVar3.f393d = new l(string2 == null ? h.f3577x : new sb.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        sb.c cVar4 = string3 == null ? h.f3577x : new sb.c(string3);
                        Cursor cursorQuery = hVar.c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i19 = 0;
                            int length2 = 0;
                            while (i19 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i19);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i19++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            cVar3.f393d = new l(cVar4, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        cVar3.f398x = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new cc.b(j, iVar2, cVar3.m()));
                    i13 = 2;
                    i14 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                r rVar = (r) obj2;
                ArrayList arrayList4 = (ArrayList) rVar.f6612i;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i20 = cursor3.getInt(1);
                    yb.c cVar5 = yb.c.REASON_UNKNOWN;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            cVar5 = yb.c.MESSAGE_TOO_OLD;
                        } else if (i20 == 2) {
                            cVar = cVar2;
                        } else if (i20 == i12) {
                            cVar5 = yb.c.PAYLOAD_TOO_BIG;
                        } else if (i20 == i11) {
                            cVar5 = yb.c.MAX_RETRIES_REACHED;
                        } else if (i20 == i10) {
                            cVar5 = yb.c.INVALID_PAYLOD;
                        } else if (i20 == 6) {
                            cVar5 = yb.c.SERVER_ERROR;
                        } else {
                            io.sentry.config.a.k(Integer.valueOf(i20), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cVar = cVar5;
                    } else {
                        cVar = cVar5;
                    }
                    long j5 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new yb.d(j5, cVar));
                    i15 = 0;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i21 = e.f23230c;
                    new ArrayList();
                    arrayList4.add(new e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jB = hVar.f3579e.b();
                SQLiteDatabase sQLiteDatabaseC = hVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        g gVar = new g(cursorRawQuery.getLong(0), jB);
                        cursorRawQuery.close();
                        sQLiteDatabaseC.setTransactionSuccessful();
                        sQLiteDatabaseC.endTransaction();
                        rVar.f6611e = gVar;
                        rVar.f6613v = new yb.b(new yb.f(hVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong(), cc.a.f3564f.f3565a));
                        rVar.f6610d = (String) hVar.f3582w.get();
                        return new yb.a((g) rVar.f6611e, Collections.unmodifiableList(arrayList4), (yb.b) rVar.f6613v, (String) rVar.f6610d);
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    sQLiteDatabaseC.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // io.sentry.o3
    public void b(f1 f1Var) {
        io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.f308v;
        IScope iScope = (IScope) this.f307i;
        f1 f1Var2 = (f1) this.f306e;
        if (f1Var == null) {
            iScope.O(f1Var2);
        } else {
            fVar.f12236i.getLogger().q(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", f1Var2.getName());
        }
    }

    @Override // io.sentry.k6
    public void c(i6 i6Var) {
        io.sentry.android.core.c cVarC;
        e6 e6Var = (e6) this.f308v;
        k6 k6Var = (k6) this.f307i;
        AtomicReference atomicReference = (AtomicReference) this.f306e;
        if (k6Var != null) {
            k6Var.c(i6Var);
        }
        io.sentry.android.core.e eVar = e6Var.f12657r.f13095i;
        if (eVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) eVar.f12175d;
            WeakReference weakReference = (WeakReference) eVar.f12176e;
            String str = (String) eVar.f12177i;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                b4 b4Var = activityLifecycleIntegration.N;
                v vVar = e6Var.f12642a;
                io.sentry.r rVarA = ((io.sentry.util.a) b4Var.f914x).a();
                try {
                    if (b4Var.d()) {
                        io.sentry.android.core.c cVar = null;
                        b4Var.e(null, new io.sentry.android.core.b(b4Var, activity, 1));
                        io.sentry.android.core.c cVar2 = (io.sentry.android.core.c) ((WeakHashMap) b4Var.f912v).remove(activity);
                        if (cVar2 != null && (cVarC = b4Var.c()) != null) {
                            cVar = new io.sentry.android.core.c(cVarC.f12157a - cVar2.f12157a, cVarC.f12158b - cVar2.f12158b, cVarC.f12159c - cVar2.f12159c);
                        }
                        if (cVar != null) {
                            int i7 = cVar.f12159c;
                            int i10 = cVar.f12158b;
                            int i11 = cVar.f12157a;
                            if (i11 != 0 || i10 != 0 || i7 != 0) {
                                io.sentry.protocol.l lVar = new io.sentry.protocol.l(Integer.valueOf(i11), ViewProps.NONE);
                                io.sentry.protocol.l lVar2 = new io.sentry.protocol.l(Integer.valueOf(i10), ViewProps.NONE);
                                io.sentry.protocol.l lVar3 = new io.sentry.protocol.l(Integer.valueOf(i7), ViewProps.NONE);
                                HashMap map = new HashMap();
                                map.put("frames_total", lVar);
                                map.put("frames_slow", lVar2);
                                map.put("frames_frozen", lVar3);
                                ((ConcurrentHashMap) b4Var.f911i).put(vVar, map);
                            }
                        }
                    }
                    rVarA.close();
                } catch (Throwable th2) {
                    try {
                        rVarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f12074v;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        k kVar = e6Var.f12656q;
        if (kVar != null) {
            atomicReference.set(kVar.f(e6Var));
        }
    }

    @Override // dc.b
    public Object execute() {
        c cVar = (c) this.f308v;
        i iVar = (i) this.f307i;
        vb.h hVar = (vb.h) this.f306e;
        h hVar2 = (h) cVar.f313d;
        hVar2.getClass();
        sb.d dVar = iVar.f21531c;
        String str = hVar.f21523a;
        String str2 = iVar.f21529a;
        String strF = io.sentry.config.a.F("SQLiteEventStore");
        if (Log.isLoggable(strF, 3)) {
            Log.d(strF, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.g(new b(hVar2, (Object) hVar, iVar, 1))).longValue();
        cVar.f310a.J(iVar, 1, false);
        return null;
    }

    @Override // io.sentry.r3
    public void g(IScope iScope) {
        CrashReporting.captureMessage$lambda$17((String) this.f308v, (String) this.f307i, (CrashReporting.ErrorLevel) this.f306e, iScope);
    }

    @Override // ig.f
    public ig.l i(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f308v;
        String str = (String) this.f307i;
        t tVar = (t) this.f306e;
        String str2 = (String) obj;
        ue.i iVarC = FirebaseMessaging.c(firebaseMessaging.f6532b);
        ji.f fVar = firebaseMessaging.f6531a;
        fVar.a();
        String strC = "[DEFAULT]".equals(fVar.f13891b) ? "" : fVar.c();
        String strB = firebaseMessaging.f6538h.b();
        synchronized (iVarC) {
            String strA = t.a(System.currentTimeMillis(), str2, strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) iVarC.f21117d).edit();
                editorEdit.putString(strC + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f6617a)) {
            ji.f fVar2 = firebaseMessaging.f6531a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f13891b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    fVar2.a();
                    sb2.append(fVar2.f13891b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.h(firebaseMessaging.f6532b).b(intent);
            }
        }
        return l0.v(str2);
    }

    @Override // ig.c
    public void onFailure(Exception e10) {
        o1.l oVar;
        CancellationSignal cancellationSignal = (CancellationSignal) this.f308v;
        Executor executor = (Executor) this.f307i;
        n1.h hVar = (n1.h) this.f306e;
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10 instanceof ye.e) {
            int i7 = ((ye.e) e10).f23289d.f5936d;
            if (i7 == 16) {
                oVar = new j(e10.getMessage());
            } else if (t1.d.f20574b.contains(Integer.valueOf(i7))) {
                oVar = new m(e10.getMessage());
            } else {
                oVar = new o("Get digital credential failed, failure: " + e10);
            }
        } else {
            oVar = new o("Get digital credential failed, failure: " + e10);
        }
        t1.f onResultOrException = new t1.f(executor, hVar, oVar, 1);
        Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (s1.f.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView.OnRequestCloseListener
    public void onRequestClose(DialogInterface dialogInterface) {
        ReactModalHostManager.addEventEmitters$lambda$0((EventDispatcher) this.f308v, (ThemedReactContext) this.f307i, (ReactModalHostView) this.f306e, dialogInterface);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i7) {
        this.f305d = i7;
        this.f308v = obj;
        this.f307i = obj2;
        this.f306e = obj3;
    }

    public /* synthetic */ b(y1.a aVar, CancellationSignal cancellationSignal, Executor executor, n1.h hVar) {
        this.f305d = 12;
        this.f308v = cancellationSignal;
        this.f307i = executor;
        this.f306e = hVar;
    }
}
