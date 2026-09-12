package ol;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends xn.h implements Function2 {
    public final /* synthetic */ g E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WritableArray f17445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f17446e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f17447i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f17449w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f17450x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f17451y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, f fVar, Context context, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f17449w = list;
        this.f17450x = fVar;
        this.f17451y = context;
        this.E = gVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f17449w, this.f17450x, this.f17451y, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0055 -> B:15:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xn.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            wn.a r0 = wn.a.f22354d
            int r1 = r11.f17448v
            ol.f r6 = r11.f17450x
            r9 = 1
            if (r1 == 0) goto L1d
            if (r1 != r9) goto L15
            android.net.Uri r1 = r11.f17447i
            java.util.Iterator r2 = r11.f17446e
            com.facebook.react.bridge.WritableArray r3 = r11.f17445d
            ib.a.L(r12)
            goto L59
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            ib.a.L(r12)
            com.facebook.react.bridge.WritableArray r12 = com.facebook.react.bridge.Arguments.createArray()
            java.util.List r1 = r11.f17449w
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            r4 = r2
            android.net.Uri r4 = (android.net.Uri) r4
            r11.f17445d = r12
            r11.f17446e = r1
            r11.f17447i = r4
            r11.f17448v = r9
            hr.e r2 = ar.k0.f2938a
            hr.d r10 = hr.d.f11103i
            com.margelo.nitro.rive.w1 r2 = new com.margelo.nitro.rive.w1
            r7 = 0
            r8 = 1
            android.content.Context r3 = r11.f17451y
            ol.g r5 = r11.E
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r2 = ar.b0.A(r10, r2, r11)
            if (r2 != r0) goto L55
            return r0
        L55:
            r3 = r12
            r12 = r2
            r2 = r1
            r1 = r4
        L59:
            ol.b r12 = (ol.b) r12
            java.util.LinkedHashMap r4 = r6.f17452a
            java.lang.String r5 = r1.toString()
            r4.put(r5, r1)
            com.facebook.react.bridge.WritableMap r12 = r12.a()
            r3.pushMap(r12)
            r1 = r2
            r12 = r3
            goto L2a
        L6e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
