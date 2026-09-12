package e;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f7836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(OnBackPressedDispatcher onBackPressedDispatcher, int i7) {
        super(1);
        this.f7835d = i7;
        this.f7836e = onBackPressedDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x0063: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:24:0x0062, B:37:0x0063] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0059: CHECK_CAST (androidx.activity.OnBackPressedCallback) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f7835d
            switch(r0) {
                case 0: goto L3b;
                default: goto L5;
            }
        L5:
            androidx.activity.BackEventCompat r5 = (androidx.activity.BackEventCompat) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.activity.OnBackPressedDispatcher r0 = r4.f7836e
            androidx.activity.OnBackPressedCallback r1 = r0.f711c
            if (r1 != 0) goto L33
            kotlin.collections.ArrayDeque r0 = r0.f710b
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.previous()
            r2 = r1
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L1c
            goto L31
        L30:
            r1 = 0
        L31:
            androidx.activity.OnBackPressedCallback r1 = (androidx.activity.OnBackPressedCallback) r1
        L33:
            if (r1 == 0) goto L38
            r1.handleOnBackProgressed(r5)
        L38:
            kotlin.Unit r5 = kotlin.Unit.f14616a
            return r5
        L3b:
            androidx.activity.BackEventCompat r5 = (androidx.activity.BackEventCompat) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.activity.OnBackPressedDispatcher r0 = r4.f7836e
            kotlin.collections.ArrayDeque r1 = r0.f710b
            int r2 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4e:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.previous()
            r3 = r2
            androidx.activity.OnBackPressedCallback r3 = (androidx.activity.OnBackPressedCallback) r3
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L4e
            goto L63
        L62:
            r2 = 0
        L63:
            androidx.activity.OnBackPressedCallback r2 = (androidx.activity.OnBackPressedCallback) r2
            androidx.activity.OnBackPressedCallback r1 = r0.f711c
            if (r1 == 0) goto L6c
            r0.c()
        L6c:
            r0.f711c = r2
            if (r2 == 0) goto L73
            r2.handleOnBackStarted(r5)
        L73:
            kotlin.Unit r5 = kotlin.Unit.f14616a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o.invoke(java.lang.Object):java.lang.Object");
    }
}
