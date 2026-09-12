package fj;

import ad.f;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowInsetsAnimationController;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.t3;
import androidx.core.view.MenuProvider;
import androidx.core.view.q1;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.discord.R;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.b1;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.playagerangedeclaration.PlayAgeRangeDeclarationResult;
import e2.z;
import e5.e;
import fk.n;
import g0.k;
import ga.l;
import he.f0;
import he.h0;
import he.k0;
import he.s;
import i.e0;
import i0.b0;
import io.sentry.i1;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.v4;
import io.sentry.w5;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import javax.inject.Provider;
import je.y;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import n.h;
import n.j;
import n.u;
import o9.d;
import okhttp3.Headers;
import pa.p;
import pa.r;
import pd.g;
import ue.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ActivityResultCallback, h, xb.b, g0, ig.c, e, k, u, i1, io.sentry.featureflags.b, f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile c f9265i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9267e;

    public /* synthetic */ c(int i7, Object obj) {
        this.f9266d = i7;
        this.f9267e = obj;
    }

    @Override // n.h
    public void R(j jVar) {
        h hVar = ((ActionMenuView) this.f9267e).S;
        if (hVar != null) {
            hVar.R(jVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.imagepipeline.producers.g0
    public void a(EncodedImage encodedImage, int i7) {
        b1 b1Var = (b1) this.f9267e;
        Consumer consumer = b1Var.f5061b;
        if (encodedImage == null) {
            consumer.b(i7, null);
            return;
        }
        ta.a aVarCreateImageTranscoder = b1Var.f4948d.createImageTranscoder(encodedImage.getImageFormat(), b1Var.f4947c);
        aVarCreateImageTranscoder.getClass();
        ProducerContext producerContext = b1Var.f4949e;
        producerContext.O().c(producerContext, "ResizeAndRotateProducer");
        ImageRequest imageRequestG = producerContext.g();
        e4.e eVar = b1Var.f4952h.f4958b;
        eVar.getClass();
        p pVar = (p) eVar.f7971e;
        r rVar = new r(pVar, pVar.G[0]);
        try {
            try {
                d dVarD = aVarCreateImageTranscoder.d(encodedImage, rVar, imageRequestG.getRotationOptions(), imageRequestG.getResizeOptions(), encodedImage.getColorSpace());
                int i10 = dVarD.f17185e;
                if (i10 == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                n8.e eVarL = b1Var.l(encodedImage, imageRequestG.getResizeOptions(), dVarD, aVarCreateImageTranscoder.a());
                r8.b bVarB = CloseableReference.B(rVar.f());
                try {
                    EncodedImage encodedImage2 = new EncodedImage(bVarB);
                    encodedImage2.setImageFormat(z9.b.f23618a);
                    try {
                        encodedImage2.parseMetaData();
                        producerContext.O().i(producerContext, "ResizeAndRotateProducer", eVarL);
                        if (i10 != 1) {
                            i7 |= 16;
                        }
                        consumer.b(i7, encodedImage2);
                        EncodedImage.closeSafely(encodedImage2);
                        CloseableReference.l(bVarB);
                        rVar.close();
                    } catch (Throwable th2) {
                        EncodedImage.closeSafely(encodedImage2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    CloseableReference.l(bVarB);
                    throw th3;
                }
            } catch (Exception e10) {
                producerContext.O().k(producerContext, "ResizeAndRotateProducer", e10, null);
                if (com.facebook.imagepipeline.producers.c.d(i7)) {
                    consumer.onFailure(e10);
                }
                rVar.close();
            }
        } catch (Throwable th4) {
            rVar.close();
            throw th4;
        }
    }

    @Override // n.u
    public void b(j jVar, boolean z5) {
        ((androidx.appcompat.app.a) this.f9267e).I(jVar);
    }

    public void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        zs.a.m(name);
        zs.a.n(value, name);
        m(name, value);
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone */
    public io.sentry.featureflags.b m1258clone() {
        return new c(21);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void d(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f9267e;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f8760e;
        int i7 = com.google.android.gms.internal.play_billing.r.e(intent, "ProxyBillingActivityV2").f3788a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.I;
        if (resultReceiver != null) {
            resultReceiver.send(i7, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f8759d;
        if (i10 != -1 || i7 != 0) {
            com.google.android.gms.internal.play_billing.r.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i10 + " and billing's responseCode: " + i7);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // he.f0
    public void e(h0 h0Var, long j, long j5) {
        boolean z5;
        i iVar = (i) this.f9267e;
        synchronized (je.b.f13766i) {
            z5 = je.b.j;
        }
        if (z5) {
            iVar.n();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        g gVar = (g) iVar.f21117d;
        je.b.s("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.y(true);
    }

    @Override // n.u
    public boolean f(j jVar) {
        Window.Callback callback = ((androidx.appcompat.app.a) this.f9267e).I.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, jVar);
        return true;
    }

    @Override // g0.k
    public long g() {
        b0 b0Var = (b0) this.f9267e;
        return ib.a.b(b0Var.f9451d, b0Var.f9452e);
    }

    @Override // javax.inject.Provider
    public Object get() {
        String packageName = ((Context) ((Provider) this.f9267e).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.protocol.h h() {
        ((io.sentry.util.a) this.f9267e).a().close();
        return null;
    }

    @Override // g0.k
    public k i() {
        ((b0) this.f9267e).E.I();
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true");
    }

    @Override // io.sentry.i1
    public boolean j() {
        if (io.sentry.internal.a.f12753c == null) {
            io.sentry.r rVarA = io.sentry.internal.a.f12754d.a();
            try {
                if (io.sentry.internal.a.f12753c == null) {
                    io.sentry.internal.a.f12753c = new io.sentry.internal.a();
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
        }
        io.sentry.internal.a aVar = io.sentry.internal.a.f12753c;
        if (!aVar.f12755a) {
            try {
                io.sentry.r rVarA2 = aVar.f12756b.a();
                try {
                    if (!aVar.f12755a) {
                        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                        while (resources.hasMoreElements()) {
                            try {
                                Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                                if (mainAttributes != null) {
                                    String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                    String value2 = mainAttributes.getValue("Implementation-Version");
                                    String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                    String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                    if (value != null && value2 != null) {
                                        String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                        if (value5 != null) {
                                            v4.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                            v4.d().a("OpenTelemetry");
                                        }
                                        String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                        if (value6 != null) {
                                            v4.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                            v4.d().a("OpenTelemetry-Agent");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless")) {
                                            v4.d().a("OpenTelemetry-Agentless");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                            v4.d().a("OpenTelemetry-Agentless-Spring");
                                        }
                                    }
                                    if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                        v4.d().b(value4, value2);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    rVarA2.close();
                } catch (Throwable th4) {
                    try {
                        rVarA2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException unused2) {
            } catch (Throwable th6) {
                aVar.f12755a = true;
                throw th6;
            }
            aVar.f12755a = true;
        }
        return v4.d().c(((w5) this.f9267e).getFatalLogger());
    }

    @Override // g0.k
    public com.facebook.imagepipeline.nativecode.b k(k sourceCoordinates) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        ((b0) this.f9267e).E.k(sourceCoordinates);
        throw null;
    }

    public void l(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        int I = StringsKt.I(line, ':', 1, 4);
        if (I != -1) {
            String strSubstring = line.substring(0, I);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = line.substring(I + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            m(strSubstring, strSubstring2);
            return;
        }
        if (line.charAt(0) != ':') {
            m("", line);
            return;
        }
        String strSubstring3 = line.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
        m("", strSubstring3);
    }

    public void m(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = (ArrayList) this.f9267e;
        arrayList.add(name);
        arrayList.add(StringsKt.b0(value).toString());
    }

    @Override // he.f0
    public f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        g gVar = (g) ((i) this.f9267e).f21117d;
        je.b.s("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.y(true);
        return k0.f10619w;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[RETURN] */
    @Override // n.h
    public boolean o(j jVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        q qVar = ((ActionMenuView) this.f9267e).a0;
        if (qVar != null) {
            Toolbar toolbar = (Toolbar) ((l) qVar).f9547e;
            Iterator it = toolbar.f870g0.f1594b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).a(menuItem)) {
                    zOnMenuItemSelected = true;
                    if (zOnMenuItemSelected) {
                        return true;
                    }
                }
            }
            t3 t3Var = toolbar.f872i0;
            zOnMenuItemSelected = t3Var != null ? ((e0) ((u4.b) t3Var).f20945e).f11201b.onMenuItemSelected(0, menuItem) : false;
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // ig.c
    public void onFailure(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        String message = e10.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        String str = message;
        ar.k kVar = (ar.k) this.f9267e;
        rn.q qVar = Result.f14614e;
        kVar.resumeWith(new PlayAgeRangeDeclarationResult(false, null, null, str, null, null, null));
    }

    public void q(b3.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (b3.a aVar : migrations) {
            int i7 = aVar.f3055a;
            int i10 = aVar.f3056b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f9267e;
            Integer numValueOf = Integer.valueOf(i7);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i10))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i10)) + " with " + aVar);
            }
            treeMap2.put(Integer.valueOf(i10), aVar);
        }
    }

    public Headers r() {
        Object[] array = ((ArrayList) this.f9267e).toArray(new String[0]);
        if (array != null) {
            return new Headers((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public void s(boolean z5) {
        ((q1) this.f9267e).D(z5);
    }

    public String t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = (ArrayList) this.f9267e;
        int size = arrayList.size() - 2;
        int iA = zn.c.a(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (true) {
            int i7 = size - 2;
            if (x.i(name, (String) arrayList.get(size), true)) {
                return (String) arrayList.get(size + 1);
            }
            if (size == iA) {
                return null;
            }
            size = i7;
        }
    }

    public ArrayList u(Map map, ArrayList arrayList, boolean z5, boolean z6) {
        ArrayList arrayListJ;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z7 = (thread == threadCurrentThread && !z5) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z5);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            c0 c0Var = new c0();
            c0Var.f12927i = thread2.getName();
            c0Var.f12926e = Integer.valueOf(thread2.getPriority());
            c0Var.f12925d = Long.valueOf(thread2.getId());
            c0Var.f12931y = Boolean.valueOf(thread2.isDaemon());
            c0Var.f12928v = thread2.getState().name();
            c0Var.f12929w = Boolean.valueOf(z7);
            if (z6 && (arrayListJ = ((i) this.f9267e).j(stackTraceElementArr, false)) != null && !arrayListJ.isEmpty()) {
                a0 a0Var = new a0(arrayListJ);
                a0Var.f12916i = Boolean.TRUE;
                c0Var.F = a0Var;
            }
            arrayList2.add(c0Var);
        }
        return arrayList2;
    }

    public void v(String name) {
        ArrayList arrayList = (ArrayList) this.f9267e;
        Intrinsics.checkNotNullParameter(name, "name");
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (x.i(name, (String) arrayList.get(i7), true)) {
                arrayList.remove(i7);
                arrayList.remove(i7);
                i7 -= 2;
            }
            i7 += 2;
        }
    }

    public /* synthetic */ c(int i7, boolean z5) {
        this.f9266d = i7;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m1245clone() {
        switch (this.f9266d) {
            case 21:
                return new c(21);
            default:
                return super.clone();
        }
    }

    public c(ap.b kotlinJvmBinaryClass) {
        this.f9266d = 29;
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
        this.f9267e = kotlinJvmBinaryClass;
    }

    public c(n nVar) {
        this.f9266d = 23;
        LinearLayout linearLayout = (LinearLayout) nVar.findViewById(R.id.pickerWrapper);
        this.f9267e = linearLayout;
        linearLayout.setWillNotDraw(false);
    }

    public c(ReactApplicationContext reactApplicationContext) {
        this.f9266d = 10;
        bd.c cVar = new bd.c(reactApplicationContext);
        this.f9267e = new s((Context) cVar.f3134i, (HashMap) cVar.f3135v, cVar.f3132d, (y) cVar.f3136w, cVar.f3133e);
    }

    public c(int i7) {
        this.f9266d = i7;
        switch (i7) {
            case 1:
                this.f9267e = new LinkedHashMap();
                break;
            case 9:
                this.f9267e = new ArrayList(20);
                break;
            case 21:
                this.f9267e = new io.sentry.util.a();
                break;
            default:
                this.f9267e = new HashSet();
                break;
        }
    }

    public c(b0 lookaheadDelegate) {
        this.f9266d = 12;
        Intrinsics.checkNotNullParameter(lookaheadDelegate, "lookaheadDelegate");
        this.f9267e = lookaheadDelegate;
    }

    public c(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f9266d = 4;
        this.f9267e = new q1(windowInsetsAnimationController);
    }

    public c(z delegate) {
        this.f9266d = 14;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f9267e = delegate;
    }

    @Override // he.f0
    public void p(h0 h0Var, long j, long j5, boolean z5) {
    }
}
