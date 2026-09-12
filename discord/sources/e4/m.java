package e4;

import a5.l0;
import af.w;
import ag.a1;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.w0;
import androidx.work.impl.WorkDatabase_Impl;
import bp.b0;
import bp.z;
import com.android.billingclient.api.BillingFlowParams;
import com.discord.R;
import com.discord.ads.AdsModule;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.react.modules.core.PermissionListener;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.gms.internal.play_billing.s;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.henninghall.date_picker.pickers.AndroidNative;
import com.reactnativecommunity.webview.RNCWebViewModule;
import ic.p0;
import io.sentry.l6;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.Adler32;
import javax.inject.Provider;
import je.e0;
import k2.u;
import k2.v;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.c0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.i0;
import lq.q0;
import lq.t0;
import md.g0;
import md.z0;
import vo.r0;
import x0.x;

/* JADX INFO: loaded from: classes.dex */
public class m implements xb.b, bd.l, ma.a, PermissionListener, vd.f, m1.f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static m f7991w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7993e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7994i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7995v;

    public /* synthetic */ m(int i7) {
        this.f7992d = i7;
    }

    public static m E(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new m(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static void I(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static boolean v(Editable editable, KeyEvent keyEvent, boolean z5) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public EditText A() {
        View viewFindViewById = ((com.swmansion.rnscreens.c) this.f7993e).findViewById(R.id.search_src_text);
        if (viewFindViewById instanceof EditText) {
            return (EditText) viewFindViewById;
        }
        return null;
    }

    public boolean B() {
        com.google.firebase.messaging.o oVar;
        if (((u4.c) this.f7995v).k("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f7994i;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strU = ((u4.c) this.f7995v).u("gcm.n.image");
        if (TextUtils.isEmpty(strU)) {
            oVar = null;
        } else {
            try {
                oVar = new com.google.firebase.messaging.o(new URL(strU));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strU);
                oVar = null;
            }
        }
        if (oVar != null) {
            ExecutorService executorService = (ExecutorService) this.f7993e;
            ig.g gVar = new ig.g();
            oVar.f6600e = executorService.submit(new a1.k(29, oVar, gVar));
            oVar.f6601i = gVar.f11763a;
        }
        com.google.firebase.messaging.h hVarA = com.google.firebase.messaging.e.a((FirebaseMessagingService) this.f7994i, (u4.c) this.f7995v);
        NotificationCompat$Builder notificationCompat$Builder = (NotificationCompat$Builder) hVarA.f6588a;
        if (oVar != null) {
            try {
                ig.l lVar = oVar.f6601i;
                w.g(lVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Bitmap bitmap = (Bitmap) l0.i(lVar, 5L);
                notificationCompat$Builder.h(bitmap);
                x xVar = new x();
                xVar.f22575e = bitmap == null ? null : IconCompat.c(bitmap);
                xVar.f22576f = null;
                xVar.f22577g = true;
                notificationCompat$Builder.j(xVar);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                oVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e10) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                oVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f7994i).getSystemService("notification")).notify((String) hVarA.f6589b, 0, ((NotificationCompat$Builder) hVarA.f6588a).c());
        return true;
    }

    public boolean C(CharSequence charSequence, int i7, int i10, u uVar) {
        if ((uVar.f14268c & 3) == 0) {
            k2.f fVar = (k2.f) this.f7995v;
            l2.a aVarB = uVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f1674v).getShort(iA + aVarB.f1671d);
            }
            k2.c cVar = (k2.c) fVar;
            cVar.getClass();
            ThreadLocal threadLocal = k2.c.f14227b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i7 < i10) {
                sb2.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = cVar.f14228a;
            String string = sb2.toString();
            int i11 = b1.d.f3025a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i12 = uVar.f14268c & 4;
            uVar.f14268c = zHasGlyph ? i12 | 2 : i12 | 1;
        }
        return (uVar.f14268c & 3) == 2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    public void D(DataSource dataSource, Uri uri, Map map, long j, long j5, g0 g0Var) throws z0 {
        pc.k[] kVarArr;
        pc.h hVar = new pc.h(dataSource, j, j5);
        this.f7995v = hVar;
        if (((pc.k) this.f7994i) != null) {
            return;
        }
        pc.i iVar = (pc.i) this.f7993e;
        synchronized (iVar) {
            try {
                int[] iArr = pc.i.f17899b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                int iZ = je.b.z((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iZ != -1) {
                    iVar.a(iZ, arrayList);
                }
                int iA = je.b.A(uri);
                if (iA != -1 && iA != iZ) {
                    iVar.a(iA, arrayList);
                }
                for (int i7 = 0; i7 < 16; i7++) {
                    int i10 = iArr[i7];
                    if (i10 != iZ && i10 != iA) {
                        iVar.a(i10, arrayList);
                    }
                }
                kVarArr = (pc.k[]) arrayList.toArray(new pc.k[arrayList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z5 = true;
        if (kVarArr.length == 1) {
            this.f7994i = kVarArr[0];
        } else {
            for (pc.k kVar : kVarArr) {
                try {
                    if (kVar.f(hVar)) {
                        this.f7994i = kVar;
                        hVar.f17897x = 0;
                        break;
                    }
                    boolean z6 = ((pc.k) this.f7994i) != null || hVar.f17895v == j;
                    je.b.k(z6);
                    hVar.f17897x = 0;
                } catch (EOFException unused) {
                    if (((pc.k) this.f7994i) != null || hVar.f17895v == j) {
                    }
                } catch (Throwable th3) {
                    if (((pc.k) this.f7994i) == null && hVar.f17895v != j) {
                        z5 = false;
                    }
                    je.b.k(z5);
                    hVar.f17897x = 0;
                    throw th3;
                }
                je.b.k(z6);
                hVar.f17897x = 0;
            }
            if (((pc.k) this.f7994i) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i11 = e0.f13788a;
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < kVarArr.length; i12++) {
                    sb3.append(kVarArr[i12].getClass().getSimpleName());
                    if (i12 < kVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new z0(sb2.toString(), null, false, 1);
            }
        }
        ((pc.k) this.f7994i).e(g0Var);
    }

    public void F(androidx.lifecycle.n nVar) {
        w0 w0Var = (w0) this.f7995v;
        if (w0Var != null) {
            w0Var.run();
        }
        w0 w0Var2 = new w0((LifecycleRegistry) this.f7993e, nVar);
        this.f7995v = w0Var2;
        Handler handler = (Handler) this.f7994i;
        Intrinsics.checkNotNull(w0Var2);
        handler.postAtFrontOfQueue(w0Var2);
    }

    public Object G(CharSequence charSequence, int i7, int i10, int i11, boolean z5, k2.n nVar) {
        int i12;
        char c8;
        k2.o oVar = new k2.o((k2.r) ((com.google.firebase.messaging.r) this.f7994i).f6612i);
        int iCodePointAt = Character.codePointAt(charSequence, i7);
        int i13 = 0;
        boolean zN = true;
        int iCharCount = i7;
        loop0: while (true) {
            i12 = iCharCount;
            while (true) {
                if (iCharCount < i10 && i13 < i11 && zN) {
                    SparseArray sparseArray = oVar.f14247c.f14259a;
                    k2.r rVar = sparseArray == null ? null : (k2.r) sparseArray.get(iCodePointAt);
                    if (oVar.f14245a == 2) {
                        if (rVar != null) {
                            oVar.f14247c = rVar;
                            oVar.f14250f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                oVar.a();
                            } else if (iCodePointAt != 65039) {
                                k2.r rVar2 = oVar.f14247c;
                                if (rVar2.f14260b != null) {
                                    if (oVar.f14250f != 1) {
                                        oVar.f14248d = rVar2;
                                        oVar.a();
                                    } else if (oVar.b()) {
                                        oVar.f14248d = oVar.f14247c;
                                        oVar.a();
                                    } else {
                                        oVar.a();
                                    }
                                    c8 = 3;
                                } else {
                                    oVar.a();
                                }
                            }
                            c8 = 1;
                        }
                        c8 = 2;
                    } else if (rVar == null) {
                        oVar.a();
                        c8 = 1;
                    } else {
                        oVar.f14245a = 2;
                        oVar.f14247c = rVar;
                        oVar.f14250f = 1;
                        c8 = 2;
                    }
                    oVar.f14249e = iCodePointAt;
                    if (c8 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                        if (iCharCount >= i10) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c8 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i10) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c8 == 3) {
                        if (!z5 && C(charSequence, i12, iCharCount, oVar.f14248d.f14260b)) {
                            break;
                        }
                        zN = nVar.n(charSequence, i12, iCharCount, oVar.f14248d.f14260b);
                        i13++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (oVar.f14245a == 2 && oVar.f14247c.f14260b != null && ((oVar.f14250f > 1 || oVar.b()) && i13 < i11 && zN && (z5 || !C(charSequence, i12, iCharCount, oVar.f14247c.f14260b)))) {
            nVar.n(charSequence, i12, iCharCount, oVar.f14247c.f14260b);
        }
        return nVar.getResult();
    }

    public void H() {
        ((TypedArray) this.f7994i).recycle();
    }

    public void J(vb.i iVar, int i7, boolean z5) {
        bc.b bVar = (bc.b) this.f7995v;
        Context context = (Context) this.f7993e;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f21529a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(fc.a.a(iVar.f21531c)).array());
        byte[] bArr = iVar.f21530b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z5) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i10 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i10 < i7) {
                        break;
                    }
                    io.sentry.config.a.k(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((cc.h) ((cc.d) this.f7994i)).c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{iVar.f21529a, String.valueOf(fc.a.a(iVar.f21531c))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            sb.d dVar = iVar.f21531c;
            builder.setMinimumLatency(bVar.a(dVar, jLongValue, i7));
            Set set = ((bc.c) bVar.f3090b.get(dVar)).f3093c;
            if (set.contains(bc.d.f3094d)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(bc.d.f3096i)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(bc.d.f3095e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i7);
            persistableBundle.putString("backendName", iVar.f21529a);
            persistableBundle.putInt("priority", fc.a.a(dVar));
            byte[] bArr2 = iVar.f21530b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, jLongValue, i7)), lValueOf, Integer.valueOf(i7)};
            String strF = io.sentry.config.a.F("JobInfoScheduler");
            if (Log.isLoggable(strF, 3)) {
                Log.d(strF, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public FileOutputStream K() throws IOException {
        File file = (File) this.f7994i;
        File file2 = (File) this.f7995v;
        if (file2.exists()) {
            I(file2, (File) this.f7993e);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + file, e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public d1 L(bp.h arrayType, jp.a attr, boolean z5) {
        so.k kVarD;
        boolean z6 = attr.f13993d;
        i iVar = (i) this.f7993e;
        hp.a aVar = (hp.a) iVar.f7980e;
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        b0 b0Var = arrayType.f3355b;
        z zVar = b0Var instanceof z ? (z) b0Var : null;
        if (zVar != null) {
            Class cls = zVar.f3374a;
            if (Intrinsics.areEqual(cls, Void.TYPE)) {
                kVarD = null;
            } else {
                kVarD = cq.c.b(cls.getName()).d();
            }
        } else {
            kVarD = null;
        }
        hp.c cVar = new hp.c(iVar, arrayType, true);
        if (kVarD != null) {
            d0 d0VarR = aVar.f10969o.f().r(kVarD);
            Intrinsics.checkNotNull(d0VarR);
            lq.z zVarF = c9.a.F(d0VarR, new wo.i(new wo.h[]{d0VarR.getAnnotations(), cVar}));
            Intrinsics.checkNotNull(zVarF, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            d0 d0Var = (d0) zVarF;
            return z6 ? d0Var : lq.c.e(d0Var, d0Var.x0(true));
        }
        lq.z zVarM = M(b0Var, xr.m.S(lq.z0.f15271e, z6, null, 6));
        if (z6) {
            d0 d0VarI = aVar.f10969o.f().i(z5 ? e1.OUT_VARIANCE : e1.INVARIANT, zVarM, cVar);
            Intrinsics.checkNotNullExpressionValue(d0VarI, "getArrayType(...)");
            return d0VarI;
        }
        d0 d0VarI2 = aVar.f10969o.f().i(e1.INVARIANT, zVarM, cVar);
        Intrinsics.checkNotNullExpressionValue(d0VarI2, "getArrayType(...)");
        return lq.c.e(d0VarI2, aVar.f10969o.f().i(e1.OUT_VARIANCE, zVarM, cVar).x0(true));
    }

    public lq.z M(lp.d dVar, jp.a attr) {
        lq.z zVarM;
        hp.a aVar = (hp.a) ((i) this.f7993e).f7980e;
        Intrinsics.checkNotNullParameter(attr, "attr");
        if (dVar instanceof z) {
            Class cls = ((z) dVar).f3374a;
            so.k kVarD = Intrinsics.areEqual(cls, Void.TYPE) ? null : cq.c.b(cls.getName()).d();
            d0 d0VarT = kVarD != null ? aVar.f10969o.f().t(kVarD) : aVar.f10969o.f().x();
            Intrinsics.checkNotNull(d0VarT);
            return d0VarT;
        }
        boolean z5 = false;
        if (dVar instanceof bp.q) {
            bp.q qVar = (bp.q) dVar;
            if (!attr.f13993d && attr.f13990a != lq.z0.f15270d) {
                z5 = true;
            }
            Type type = qVar.f3366a;
            boolean zD = qVar.d();
            if (!zD && !z5) {
                d0 d0VarU = u(qVar, attr, null);
                return d0VarU != null ? d0VarU : nq.l.c(nq.k.UNRESOLVED_JAVA_CLASS, type.toString());
            }
            d0 d0VarU2 = u(qVar, attr.b(jp.b.f13998i), null);
            if (d0VarU2 == null) {
                return nq.l.c(nq.k.UNRESOLVED_JAVA_CLASS, type.toString());
            }
            d0 d0VarU3 = u(qVar, attr.b(jp.b.f13997e), d0VarU2);
            if (d0VarU3 == null) {
                return nq.l.c(nq.k.UNRESOLVED_JAVA_CLASS, type.toString());
            }
            return zD ? new jp.i(d0VarU2, d0VarU3) : lq.c.e(d0VarU2, d0VarU3);
        }
        if (dVar instanceof bp.h) {
            return L((bp.h) dVar, attr, false);
        }
        if (dVar instanceof bp.e0) {
            b0 b0VarC = ((bp.e0) dVar).c();
            if (b0VarC != null && (zVarM = M(b0VarC, attr)) != null) {
                return zVarM;
            }
            d0 d0VarN = aVar.f10969o.f().n();
            Intrinsics.checkNotNullExpressionValue(d0VarN, "getDefaultBound(...)");
            return d0VarN;
        }
        if (dVar == null) {
            d0 d0VarN2 = aVar.f10969o.f().n();
            Intrinsics.checkNotNullExpressionValue(d0VarN2, "getDefaultBound(...)");
            return d0VarN2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + dVar);
    }

    public void N(bc.i iVar) throws IOException {
        File file = (File) this.f7994i;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                n8.b os = new n8.b(fileOutputStream);
                os.f16508d = 0L;
                EncodedImage encodedImage = (EncodedImage) iVar.f3116e;
                ga.b this$0 = (ga.b) iVar.f3117i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(os, "os");
                Intrinsics.checkNotNull(encodedImage);
                InputStream inputStream = encodedImage.getInputStream();
                if (inputStream == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this$0.f9526c.p(inputStream, os);
                os.flush();
                long j = os.f16508d;
                fileOutputStream.close();
                if (file.length() == j) {
                    return;
                }
                long length = file.length();
                StringBuilder sbM = kk.b.m(j, "File was not written completely. Expected: ", ", found: ");
                sbM.append(length);
                throw new a1(sbM.toString());
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            i8.b bVar = ((j8.b) this.f7995v).f13675d;
            int i7 = j8.b.f13671g;
            bVar.getClass();
            throw e10;
        }
    }

    public void O(String str, Object obj) {
        m mVar = new m(4);
        ((m) this.f7995v).f7995v = mVar;
        this.f7995v = mVar;
        mVar.f7994i = obj;
        mVar.f7993e = str;
    }

    @Override // bd.l
    public void a(ke.h hVar, Handler handler) {
        ((MediaCodec) this.f7993e).setOnFrameRenderedListener(new bd.a(this, hVar, 1), handler);
    }

    @Override // ma.a
    public Drawable b(na.c cVar) {
        try {
            sa.a.w();
            if (cVar instanceof na.d) {
                na.d dVar = (na.d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) this.f7993e, ((na.g) dVar).f16528w);
                if ((((na.g) dVar).f16530y == 0 || ((na.g) dVar).f16530y == -1) && (((na.g) dVar).E == 1 || ((na.g) dVar).E == 0)) {
                    return bitmapDrawable;
                }
                return new com.facebook.drawee.drawable.f(bitmapDrawable, ((na.g) dVar).f16530y, ((na.g) dVar).E);
            }
            ma.a aVar = (ma.a) this.f7994i;
            if (aVar != null && aVar.n(cVar)) {
                return ((ma.a) this.f7994i).b(cVar);
            }
            ma.a aVar2 = (ma.a) this.f7995v;
            if (aVar2 == null || !aVar2.n(cVar)) {
                return null;
            }
            return ((ma.a) this.f7995v).b(cVar);
        } finally {
            sa.a.w();
        }
    }

    @Override // m1.f
    public Uri c() {
        return (Uri) this.f7993e;
    }

    @Override // bd.l
    public void d(int i7, lc.c cVar, long j) {
        ((MediaCodec) this.f7993e).queueSecureInputBuffer(i7, 0, cVar.f15008i, j, 0);
    }

    @Override // m1.f
    public Uri e() {
        return (Uri) this.f7995v;
    }

    @Override // vd.f
    public int f(long j) {
        long[] jArr = (long[]) this.f7995v;
        int iB = e0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // bd.l
    public void flush() {
        ((MediaCodec) this.f7993e).flush();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new m((Context) ((Provider) this.f7993e).get(), (cc.d) ((Provider) this.f7994i).get(), (bc.b) ((k8.a) this.f7995v).get(), 9);
    }

    @Override // m1.f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f7994i;
    }

    @Override // bd.l
    public ByteBuffer getInputBuffer(int i7) {
        return e0.f13788a >= 21 ? ((MediaCodec) this.f7993e).getInputBuffer(i7) : ((ByteBuffer[]) this.f7994i)[i7];
    }

    @Override // bd.l
    public ByteBuffer getOutputBuffer(int i7) {
        return e0.f13788a >= 21 ? ((MediaCodec) this.f7993e).getOutputBuffer(i7) : ((ByteBuffer[]) this.f7995v)[i7];
    }

    @Override // bd.l
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.f7993e).getOutputFormat();
    }

    @Override // vd.f
    public long h(int i7) {
        long[] jArr = (long[]) this.f7995v;
        je.b.g(i7 >= 0);
        je.b.g(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // bd.l
    public void i(long j, int i7, int i10, int i11) {
        ((MediaCodec) this.f7993e).queueInputBuffer(i7, 0, i10, j, i11);
    }

    @Override // bd.l
    public void j(int i7, long j) {
        ((MediaCodec) this.f7993e).releaseOutputBuffer(i7, j);
    }

    @Override // bd.l
    public int k() {
        return ((MediaCodec) this.f7993e).dequeueInputBuffer(0L);
    }

    @Override // vd.f
    public List l(long j) {
        List list = (List) this.f7993e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            long[] jArr = (long[]) this.f7994i;
            int i10 = i7 * 2;
            if (jArr[i10] <= j && j < jArr[i10 + 1]) {
                ee.d dVar = (ee.d) list.get(i7);
                vd.c cVar = dVar.f8158a;
                if (cVar.f21643w == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, new cl.b(4));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            vd.b bVarA = ((ee.d) arrayList2.get(i11)).f8158a.a();
            bVarA.f21622e = (-1) - i11;
            bVarA.f21623f = 1;
            arrayList.add(bVarA.a());
        }
        return arrayList;
    }

    @Override // bd.l
    public int m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        MediaCodec mediaCodec = (MediaCodec) this.f7993e;
        do {
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && e0.f13788a < 21) {
                this.f7995v = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // ma.a
    public boolean n(na.c cVar) {
        return true;
    }

    @Override // vd.f
    public int o() {
        return ((long[]) this.f7995v).length;
    }

    @Override // com.facebook.react.modules.core.PermissionListener
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        RNCWebViewModule rNCWebViewModule = (RNCWebViewModule) this.f7995v;
        if (i7 != 1) {
            return false;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(rNCWebViewModule.getCurrentActivity().getApplicationContext(), (String) this.f7994i, 1).show();
            return true;
        }
        if (rNCWebViewModule.downloadRequest != null) {
            rNCWebViewModule.downloadFile((String) this.f7993e);
        }
        return true;
    }

    @Override // bd.l
    public void p(int i7) {
        ((MediaCodec) this.f7993e).setVideoScalingMode(i7);
    }

    @Override // m1.f
    public Object q() {
        return null;
    }

    public void r(Calendar calendar) {
        kk.c cVar = (kk.c) this.f7994i;
        for (mk.e eVar : cVar.a()) {
            if (!eVar.h()) {
                ik.e eVar2 = eVar.f15871d;
                eVar.f15872e.setTimeZone(eVar.f15868a.l());
                eVar.f15869b = calendar;
                int iB = eVar.b(calendar);
                if (iB > -1) {
                    if (eVar2.getValue() == 0) {
                        eVar2.setValue(iB);
                    } else {
                        ((AndroidNative) eVar2).t(iB);
                    }
                }
            }
        }
        for (mk.e eVar3 : cVar.a()) {
            if (eVar3.h()) {
                ((AndroidNative) eVar3.f15871d).t(eVar3.b(calendar));
            }
        }
    }

    @Override // bd.l
    public void release() {
        this.f7994i = null;
        this.f7995v = null;
        ((MediaCodec) this.f7993e).release();
    }

    @Override // bd.l
    public void releaseOutputBuffer(int i7, boolean z5) {
        ((MediaCodec) this.f7993e).releaseOutputBuffer(i7, z5);
    }

    public BillingFlowParams s() {
        s sVarM;
        ArrayList arrayList = (ArrayList) this.f7994i;
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        ArrayList arrayList2 = (ArrayList) this.f7994i;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((a5.e) it.next()) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
        }
        BillingFlowParams billingFlowParams = new BillingFlowParams();
        short s2 = 0;
        int i7 = 1;
        billingFlowParams.f3783a = !((a5.e) ((ArrayList) this.f7994i).get(0)).f178a.f3792b.optString("packageName").isEmpty();
        billingFlowParams.f3784b = (String) this.f7993e;
        a5.f fVar = (a5.f) this.f7995v;
        boolean z5 = (TextUtils.isEmpty((String) fVar.f182c) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z5 && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!fVar.f181b && !z5 && zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        a5.b0 b0Var = new a5.b0(i7, s2);
        b0Var.f174i = (String) fVar.f182c;
        b0Var.f173e = fVar.f180a;
        billingFlowParams.f3785c = b0Var;
        billingFlowParams.f3787e = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f7994i;
        if (arrayList3 != null) {
            sVarM = s.m(arrayList3);
        } else {
            com.google.android.gms.internal.play_billing.p pVar = s.f6118e;
            sVarM = com.google.android.gms.internal.play_billing.w.f6169w;
        }
        billingFlowParams.f3786d = sVarM;
        return billingFlowParams;
    }

    @Override // bd.l
    public void setOutputSurface(Surface surface) {
        ((MediaCodec) this.f7993e).setOutputSurface(surface);
    }

    @Override // bd.l
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f7993e).setParameters(bundle);
    }

    public h8.a t() throws m8.d {
        j8.b bVar = (j8.b) this.f7995v;
        bVar.f13676e.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = bVar.i((String) this.f7993e);
        try {
            xr.m.P((File) this.f7994i, file);
            if (file.exists()) {
                file.setLastModified(jCurrentTimeMillis);
            }
            Intrinsics.checkNotNullParameter(file, "file");
            return new h8.a(file);
        } catch (m8.d e10) {
            e10.getCause();
            i8.b bVar2 = bVar.f13675d;
            int i7 = j8.b.f13671g;
            bVar2.getClass();
            throw e10;
        }
    }

    public String toString() {
        switch (this.f7992d) {
            case 5:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f7993e);
                sb2.append('{');
                m mVar = (m) ((m) this.f7994i).f7995v;
                String str = "";
                while (mVar != null) {
                    Object obj = mVar.f7994i;
                    sb2.append(str);
                    String str2 = (String) mVar.f7993e;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    mVar = (m) mVar.f7995v;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f7993e);
                sb3.append('{');
                e eVar = (e) ((e) this.f7994i).f7972i;
                String str3 = "";
                while (eVar != null) {
                    Object obj2 = eVar.f7971e;
                    sb3.append(str3);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    eVar = (e) eVar.f7972i;
                    str3 = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            case 17:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f7993e);
                sb4.append('{');
                c cVar = (c) ((c) this.f7994i).f7967i;
                String str4 = "";
                while (cVar != null) {
                    AdsModule.AnonymousClass1 anonymousClass1 = (AdsModule.AnonymousClass1) cVar.f7966e;
                    sb4.append(str4);
                    if (anonymousClass1 == null || !AdsModule.AnonymousClass1.class.isArray()) {
                        sb4.append(anonymousClass1);
                    } else {
                        String strDeepToString3 = Arrays.deepToString(new Object[]{anonymousClass1});
                        sb4.append((CharSequence) strDeepToString3, 1, strDeepToString3.length() - 1);
                    }
                    cVar = (c) cVar.f7967i;
                    str4 = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x022c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [lq.q0] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, kotlin.Lazy] */
    public d0 u(bp.q qVar, jp.a aVar, d0 d0Var) {
        lq.l0 l0VarC;
        i iVar;
        lq.l0 l0Var;
        d0 d0Var2;
        q0 q0VarN;
        q0 q0Var;
        Iterator it;
        List list;
        i c8;
        boolean z5;
        t0 i0Var;
        Object next;
        wo.h iVar2;
        List listI0;
        m mVar;
        q0 q0Var2;
        t0 t0VarA;
        vo.f readOnly;
        e1 variance;
        m mVar2 = this;
        bp.q qVar2 = qVar;
        lq.z0 z0Var = aVar.f13990a;
        jp.b bVar = aVar.f13991b;
        boolean z6 = aVar.f13993d;
        i iVar3 = (i) mVar2.f7993e;
        hp.a aVar2 = (hp.a) iVar3.f7980e;
        if (d0Var == null || (l0VarC = d0Var.q0()) == null) {
            l0VarC = lq.c.C(new hp.c(iVar3, qVar2, false));
        }
        bp.s sVar = qVar2.f3367b;
        if (sVar == null) {
            qVar2.getClass();
            throw new UnsupportedOperationException("Type not found: " + qVar2.f3366a);
        }
        boolean z7 = false;
        if (sVar instanceof bp.o) {
            bp.o javaClass = (bp.o) sVar;
            d0Var2 = null;
            up.c cVarC = javaClass.c();
            if (cVarC == null) {
                throw new AssertionError("Class type should have a FQ name: " + sVar);
            }
            if (z6 && Intrinsics.areEqual(cVarC, jp.d.f14005a)) {
                so.n types = aVar2.f10970p;
                so.m mVar3 = types.f20362c;
                KProperty property = so.n.f20359e[0];
                mVar3.getClass();
                l0Var = l0VarC;
                Intrinsics.checkNotNullParameter(types, "types");
                Intrinsics.checkNotNullParameter(property, "property");
                up.e eVarE = up.e.e(m3.m.i(property.getName()));
                Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                iVar = iVar3;
                vo.i iVarG = ((eq.o) types.f20361b.getValue()).g(eVarE, dp.c.f7694e);
                vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
                readOnly = fVar == null ? types.f20360a.d(new up.b(so.p.f20401i, eVarE), c0.c(1)) : fVar;
            } else {
                iVar = iVar3;
                l0Var = l0VarC;
                readOnly = uo.e.c(cVarC, aVar2.f10969o.f());
                if (readOnly == null) {
                    readOnly = null;
                } else {
                    Intrinsics.checkNotNullParameter(readOnly, "readOnly");
                    String str = uo.d.f21197a;
                    up.d dVarG = xp.e.g(readOnly);
                    HashMap map = uo.d.k;
                    if (map.containsKey(dVarG)) {
                        if (bVar == jp.b.f13998i || z0Var == lq.z0.f15270d) {
                            readOnly = uo.e.a(readOnly);
                        } else {
                            lp.d dVar = (lp.d) CollectionsKt.S(qVar2.c());
                            bp.e0 e0Var = dVar instanceof bp.e0 ? (bp.e0) dVar : null;
                            if (e0Var != null && e0Var.c() != null) {
                                Type[] upperBounds = e0Var.f3350a.getUpperBounds();
                                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                                if (Intrinsics.areEqual(y.t(upperBounds), Object.class)) {
                                    Intrinsics.checkNotNullParameter(readOnly, "readOnly");
                                    up.d dVarG2 = xp.e.g(readOnly);
                                    String str2 = uo.d.f21197a;
                                    up.c cVar = (up.c) map.get(dVarG2);
                                    if (cVar == null) {
                                        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
                                    }
                                    vo.f fVarJ = bq.e.e(readOnly).j(cVar);
                                    Intrinsics.checkNotNullExpressionValue(fVarJ, "getBuiltInClassByFqName(...)");
                                    List parameters = fVarJ.n().getParameters();
                                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                                    r0 r0Var = (r0) CollectionsKt.S(parameters);
                                    if (r0Var != null && (variance = r0Var.getVariance()) != null && variance != e1.OUT_VARIANCE) {
                                        readOnly = uo.e.a(readOnly);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (readOnly == null) {
                u4.b bVar2 = aVar2.k;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(javaClass, "javaClass");
                u4.c cVar2 = (u4.c) bVar2.f20945e;
                if (cVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resolver");
                    cVar2 = null;
                }
                readOnly = cVar2.y(javaClass);
            }
            if (readOnly == null || (q0VarN = readOnly.n()) == null) {
                qVar2.getClass();
                throw new UnsupportedOperationException("Type not found: " + qVar2.f3366a);
            }
        } else {
            iVar = iVar3;
            l0Var = l0VarC;
            d0Var2 = null;
            if (!(sVar instanceof bp.c0)) {
                throw new IllegalStateException("Unknown classifier kind: " + sVar);
            }
            r0 r0VarA = ((hp.f) mVar2.f7994i).a((bp.c0) sVar);
            q0VarN = r0VarA != null ? r0VarA.n() : null;
        }
        if (q0VarN == null) {
            return d0Var2;
        }
        boolean z10 = (bVar == jp.b.f13998i || z6 || z0Var == lq.z0.f15270d) ? false : true;
        if (Intrinsics.areEqual(d0Var != null ? d0Var.r0() : d0Var2, q0VarN) && !qVar2.d() && z10) {
            return d0Var.x0(true);
        }
        boolean z11 = true;
        if (!qVar2.d()) {
            if (qVar2.c().isEmpty()) {
                List parameters2 = q0VarN.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                if (parameters2.isEmpty()) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        List<r0> parameters3 = q0VarN.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
        if (z11) {
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(parameters3, 10));
            for (r0 r0Var2 : parameters3) {
                if (c9.a.x(r0Var2, d0Var2, aVar.f13994e)) {
                    t0VarA = b1.k(r0Var2, aVar);
                    q0Var2 = q0VarN;
                    mVar = mVar2;
                } else {
                    q0 q0Var3 = q0VarN;
                    mVar = mVar2;
                    q0Var2 = q0Var3;
                    t0VarA = jp.e.a(r0Var2, jp.a.a(aVar, null, qVar.d(), null, null, 59), (io.sentry.internal.debugmeta.c) mVar.f7995v, new lq.b0(aVar2.f10957a, new jp.c(mVar2, r0Var2, aVar, q0Var3, qVar2)));
                }
                arrayList.add(t0VarA);
                qVar2 = qVar;
                q0VarN = q0Var2;
                mVar2 = mVar;
                d0Var2 = null;
            }
            q0Var = q0VarN;
            listI0 = arrayList;
        } else {
            q0Var = q0VarN;
            if (parameters3.size() != qVar.c().size()) {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(parameters3, 10));
                Iterator it2 = parameters3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new i0(nq.l.c(nq.k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((r0) it2.next()).getName().b())));
                }
                listI0 = CollectionsKt.i0(arrayList2);
            } else {
                kotlin.collections.x xVarM0 = CollectionsKt.m0(qVar.c());
                ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(xVarM0, 10));
                Iterator it3 = xVarM0.iterator();
                while (true) {
                    kotlin.collections.r0 r0Var3 = (kotlin.collections.r0) it3;
                    if (r0Var3.f14666e.hasNext()) {
                        IndexedValue indexedValue = (IndexedValue) r0Var3.next();
                        int i7 = indexedValue.f14622a;
                        lp.d dVar2 = (lp.d) indexedValue.f14623b;
                        parameters3.size();
                        r0 r0Var4 = (r0) parameters3.get(i7);
                        jp.a aVarS = xr.m.S(lq.z0.f15271e, z7, null, 7);
                        Intrinsics.checkNotNull(r0Var4);
                        if (dVar2 instanceof bp.e0) {
                            bp.e0 wildcardType = (bp.e0) dVar2;
                            b0 b0VarC = wildcardType.c();
                            Type[] upperBounds2 = wildcardType.f3350a.getUpperBounds();
                            Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
                            e1 e1Var = !Intrinsics.areEqual(y.t(upperBounds2), Object.class) ? e1.OUT_VARIANCE : e1.IN_VARIANCE;
                            if (b0VarC == null || !(r0Var4.getVariance() == e1.INVARIANT || e1Var == r0Var4.getVariance())) {
                                it = it3;
                                list = parameters3;
                                c8 = iVar;
                                z5 = false;
                                i0Var = b1.k(r0Var4, aVarS);
                                Intrinsics.checkNotNullExpressionValue(i0Var, "makeStarProjection(...)");
                            } else {
                                c8 = iVar;
                                Intrinsics.checkNotNullParameter(c8, "c");
                                Intrinsics.checkNotNullParameter(wildcardType, "wildcardType");
                                if (wildcardType.c() == null) {
                                    throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                }
                                Iterator it4 = new hp.c(c8, wildcardType, false).iterator();
                                while (true) {
                                    xq.d dVar3 = (xq.d) it4;
                                    if (!dVar3.hasNext()) {
                                        it = it3;
                                        list = parameters3;
                                        next = null;
                                        break;
                                    }
                                    next = dVar3.next();
                                    wo.b bVar3 = (wo.b) next;
                                    up.c[] cVarArr = ep.s.f8587b;
                                    it = it3;
                                    int length = cVarArr.length;
                                    list = parameters3;
                                    int i10 = 0;
                                    while (i10 < length) {
                                        int i11 = length;
                                        int i12 = i10;
                                        if (Intrinsics.areEqual(bVar3.a(), cVarArr[i10])) {
                                            break;
                                        }
                                        i10 = i12 + 1;
                                        length = i11;
                                    }
                                    it3 = it;
                                    parameters3 = list;
                                }
                                wo.b bVar4 = (wo.b) next;
                                lq.z zVarM = mVar2.M(b0VarC, xr.m.S(lq.z0.f15271e, false, null, 7));
                                if (bVar4 != null) {
                                    ArrayList annotations = CollectionsKt.U(zVarM.getAnnotations(), bVar4);
                                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                                    if (annotations.isEmpty()) {
                                        iVar2 = wo.g.f22379a;
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        iVar2 = new wo.i(0, annotations);
                                    }
                                    zVarM = c9.a.F(zVarM, iVar2);
                                } else {
                                    z5 = false;
                                }
                                i0Var = c9.a.m(zVarM, e1Var, r0Var4);
                            }
                        } else {
                            it = it3;
                            list = parameters3;
                            c8 = iVar;
                            z5 = false;
                            i0Var = new i0(mVar2.M(dVar2, aVarS), e1.INVARIANT);
                        }
                        arrayList3.add(i0Var);
                        it3 = it;
                        parameters3 = list;
                        iVar = c8;
                        z7 = z5;
                    } else {
                        listI0 = CollectionsKt.i0(arrayList3);
                    }
                }
            }
        }
        return lq.c.t(listI0, l0Var, q0Var, z10);
    }

    public ColorStateList w(int i7) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.f7994i;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListC = y0.b.c((Context) this.f7993e, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateListC;
    }

    public Drawable x(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f7994i;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : mf.f.u((Context) this.f7993e, resourceId);
    }

    public Drawable y(int i7) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f7994i).hasValue(i7) || (resourceId = ((TypedArray) this.f7994i).getResourceId(i7, 0)) == 0) {
            return null;
        }
        androidx.appcompat.widget.w wVarA = androidx.appcompat.widget.w.a();
        Context context = (Context) this.f7993e;
        synchronized (wVarA) {
            drawableD = wVarA.f1148a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface z(int i7, int i10, androidx.appcompat.widget.t0 t0Var) {
        int resourceId = ((TypedArray) this.f7994i).getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f7995v) == null) {
            this.f7995v = new TypedValue();
        }
        Context context = (Context) this.f7993e;
        TypedValue typedValue = (TypedValue) this.f7995v;
        ThreadLocal threadLocal = a1.n.f42a;
        if (context.isRestricted()) {
            return null;
        }
        return a1.n.a(context, resourceId, typedValue, i10, t0Var, true, false);
    }

    public /* synthetic */ m(int i7, Object obj, Object obj2, String str) {
        this.f7992d = i7;
        this.f7995v = obj;
        this.f7993e = str;
        this.f7994i = obj2;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7) {
        this.f7992d = i7;
        this.f7993e = obj;
        this.f7994i = obj2;
        this.f7995v = obj3;
    }

    public m(String str, int i7) {
        this.f7992d = i7;
        switch (i7) {
            case 12:
                e eVar = new e((char) 0, 5);
                this.f7994i = eVar;
                this.f7995v = eVar;
                this.f7993e = str;
                break;
            case 17:
                c cVar = new c(6, false);
                this.f7994i = cVar;
                this.f7995v = cVar;
                this.f7993e = str;
                break;
            default:
                m mVar = new m(4);
                this.f7994i = mVar;
                this.f7995v = mVar;
                this.f7993e = str;
                break;
        }
    }

    public m(np.e resolver, ue.i kotlinClassFinder) {
        this.f7992d = 8;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f7993e = resolver;
        this.f7994i = kotlinClassFinder;
        this.f7995v = new ConcurrentHashMap();
    }

    public m(p pVar, fk.n nVar) {
        this.f7992d = 27;
        this.f7993e = pVar;
        kk.c cVar = new kk.c(pVar, nVar);
        this.f7994i = cVar;
        hp.e eVar = new hp.e(cVar, pVar, this, nVar);
        this.f7995v = eVar;
        fj.c cVar2 = new fj.c(25, eVar);
        Iterator it = cVar.a().iterator();
        while (it.hasNext()) {
            ik.e eVar2 = ((mk.e) it.next()).f15871d;
            ue.i iVar = new ue.i();
            iVar.f21117d = cVar2;
            eVar2.setOnValueChangedListener(iVar);
        }
    }

    @Override // m1.f
    public void g() {
    }

    public m(androidx.lifecycle.w provider) {
        this.f7992d = 7;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f7993e = new LifecycleRegistry(provider);
        this.f7994i = new Handler();
    }

    public m(WorkDatabase_Impl database) {
        this.f7992d = 0;
        this.f7993e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        new b(database, false, 4);
        this.f7994i = new h(database, 2);
        this.f7995v = new h(database, 3);
    }

    public m(i c8, hp.f typeParameterResolver) {
        this.f7992d = 24;
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.f7993e = c8;
        this.f7994i = typeParameterResolver;
        this.f7995v = new io.sentry.internal.debugmeta.c(new jp.e());
    }

    public m(ArrayList arrayList) {
        this.f7992d = 18;
        this.f7993e = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f7994i = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ee.d dVar = (ee.d) arrayList.get(i7);
            int i10 = i7 * 2;
            long[] jArr = (long[]) this.f7994i;
            jArr[i10] = dVar.f8159b;
            jArr[i10 + 1] = dVar.f8160c;
        }
        long[] jArr2 = (long[]) this.f7994i;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f7995v = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public m(FirebaseMessagingService firebaseMessagingService, u4.c cVar, ExecutorService executorService) {
        this.f7992d = 14;
        this.f7993e = executorService;
        this.f7994i = firebaseMessagingService;
        this.f7995v = cVar;
    }

    public m(File file) {
        this.f7992d = 25;
        this.f7993e = file;
        this.f7994i = new File(file.getPath() + ".new");
        this.f7995v = new File(file.getPath() + ".bak");
    }

    public m(pc.i iVar) {
        this.f7992d = 29;
        this.f7993e = iVar;
    }

    public m(Context context, TypedArray typedArray) {
        this.f7992d = 6;
        this.f7993e = context;
        this.f7994i = typedArray;
    }

    public m(Context context, LocationManager locationManager) {
        this.f7992d = 19;
        this.f7995v = new i.g0();
        this.f7993e = context;
        this.f7994i = locationManager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m() {
        this(new io.sentry.protocol.v(), new l6(), (io.sentry.c) null);
        this.f7992d = 21;
    }

    public m(MediaCodec mediaCodec) {
        this.f7992d = 10;
        this.f7993e = mediaCodec;
        if (e0.f13788a < 21) {
            this.f7994i = mediaCodec.getInputBuffers();
            this.f7995v = mediaCodec.getOutputBuffers();
        }
    }

    public m(io.sentry.protocol.v vVar, l6 l6Var, io.sentry.c cVar) {
        this.f7992d = 21;
        this.f7993e = vVar;
        this.f7994i = l6Var;
        this.f7995v = gn.h.u(cVar, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(m mVar) {
        this((io.sentry.protocol.v) mVar.f7993e, (l6) mVar.f7994i, (io.sentry.c) mVar.f7995v);
        this.f7992d = 21;
    }

    public m(ic.n[] nVarArr) {
        this.f7992d = 20;
        p0 p0Var = new p0();
        ic.r0 r0Var = new ic.r0();
        r0Var.f11633c = 1.0f;
        r0Var.f11634d = 1.0f;
        ic.l lVar = ic.l.f11561e;
        r0Var.f11635e = lVar;
        r0Var.f11636f = lVar;
        r0Var.f11637g = lVar;
        r0Var.f11638h = lVar;
        ByteBuffer byteBuffer = ic.n.f11577a;
        r0Var.k = byteBuffer;
        r0Var.f11640l = byteBuffer.asShortBuffer();
        r0Var.f11641m = byteBuffer;
        r0Var.f11632b = -1;
        ic.n[] nVarArr2 = new ic.n[nVarArr.length + 2];
        this.f7993e = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.f7994i = p0Var;
        this.f7995v = r0Var;
        nVarArr2[nVarArr.length] = p0Var;
        nVarArr2[nVarArr.length + 1] = r0Var;
    }

    public m(com.google.firebase.messaging.r rVar, k8.a aVar, k2.c cVar, Set set) {
        this.f7992d = 26;
        this.f7993e = aVar;
        this.f7994i = rVar;
        this.f7995v = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            G(str, 0, str.length(), 1, true, new cg.b(str, (byte) 0));
        }
    }
}
