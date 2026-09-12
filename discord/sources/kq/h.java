package kq;

import a5.i0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f14777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f14778e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Object f14779i;

    public h(l lVar, Function0 function0) {
        if (lVar == null) {
            a(0);
            throw null;
        }
        this.f14779i = k.f14783d;
        this.f14777d = lVar;
        this.f14778e = function0;
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 2 || i7 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "computable";
        } else if (i7 == 2 || i7 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i7 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i7 != 2 && i7 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public i0 c(boolean z5) {
        i0 i0VarE = this.f14777d.e(null, "in a lazy value");
        if (i0VarE != null) {
            return i0VarE;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0075, B:36:0x0076, B:37:0x007c, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0075, B:36:0x0076, B:37:0x007c, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // kotlin.jvm.functions.Function0
    public Object invoke() throws Throwable {
        Object objInvoke;
        i0 i0VarC;
        k kVar = k.f14785i;
        k kVar2 = k.f14784e;
        Object obj = this.f14779i;
        if (!(obj instanceof k)) {
            vq.m.l(obj);
            return obj;
        }
        this.f14777d.f14789a.lock();
        try {
            Object obj2 = this.f14779i;
            if (!(obj2 instanceof k)) {
                vq.m.l(obj2);
                this.f14777d.f14789a.unlock();
                return obj2;
            }
            if (obj2 == kVar2) {
                this.f14779i = kVar;
                i0 i0VarC2 = c(true);
                if (!i0VarC2.f214e) {
                    objInvoke = i0VarC2.f215i;
                } else if (obj2 == kVar) {
                    i0VarC = c(false);
                    if (i0VarC.f214e) {
                        this.f14779i = kVar2;
                        try {
                            objInvoke = this.f14778e.invoke();
                            b(objInvoke);
                            this.f14779i = objInvoke;
                        } catch (Throwable th2) {
                            if (vq.m.j(th2)) {
                                this.f14779i = k.f14783d;
                                throw th2;
                            }
                            if (this.f14779i == kVar2) {
                                this.f14779i = new vq.l(th2);
                            }
                            this.f14777d.f14790b.a(th2);
                            throw null;
                        }
                    } else {
                        objInvoke = i0VarC.f215i;
                    }
                } else {
                    this.f14779i = kVar2;
                    objInvoke = this.f14778e.invoke();
                    b(objInvoke);
                    this.f14779i = objInvoke;
                }
            } else if (obj2 == kVar) {
                i0VarC = c(false);
                if (i0VarC.f214e) {
                    objInvoke = i0VarC.f215i;
                } else {
                    this.f14779i = kVar2;
                    objInvoke = this.f14778e.invoke();
                    b(objInvoke);
                    this.f14779i = objInvoke;
                }
            } else {
                this.f14779i = kVar2;
                objInvoke = this.f14778e.invoke();
                b(objInvoke);
                this.f14779i = objInvoke;
            }
            this.f14777d.f14789a.unlock();
            return objInvoke;
        } catch (Throwable th3) {
            this.f14777d.f14789a.unlock();
            throw th3;
        }
    }

    public void b(Object obj) {
    }
}
