package com.facebook.yoga;

import com.facebook.imagepipeline.nativecode.b;
import ga.k;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.facebook.yoga.YogaDirection[], still in use, count: 1, list:
  (r0v1 com.facebook.yoga.YogaDirection[]) from 0x0024: INVOKE (r0v1 com.facebook.yoga.YogaDirection[]) STATIC call: com.facebook.imagepipeline.nativecode.b.l(java.lang.Enum[]):yn.a A[MD:(java.lang.Enum[]):yn.a (m)] (LINE:37)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f5430e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5435d;

    static {
        b.l(yogaDirectionArr);
        f5430e = new k();
    }

    public YogaDirection(int i7) {
        super(str, i);
        this.f5435d = i7;
    }

    public static YogaDirection valueOf(String str) {
        return (YogaDirection) Enum.valueOf(YogaDirection.class, str);
    }

    public static YogaDirection[] values() {
        return (YogaDirection[]) f5434x.clone();
    }
}
