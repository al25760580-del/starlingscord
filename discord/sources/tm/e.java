package tm;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rn.n;
import wp.k;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends io.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20838e;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(f fVar, int i7) {
        this.f20837d = i7;
        switch (i7) {
            case 1:
                d dVar = d.f20834d;
                this.f20838e = fVar;
                super(dVar);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.f20838e = fVar;
                super(bool);
                break;
        }
    }

    @Override // io.c
    public void afterChange(KProperty property, Object obj, Object obj2) {
        c preventNativeDismissChangeObserver$react_native_screens_release;
        sm.j jVar;
        switch (this.f20837d) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((Boolean) obj).booleanValue() == ((Boolean) obj2).booleanValue() || (preventNativeDismissChangeObserver$react_native_screens_release = ((f) this.f20838e).getPreventNativeDismissChangeObserver$react_native_screens_release()) == null) {
                    return;
                }
                ((b) preventNativeDismissChangeObserver$react_native_screens_release).a();
                return;
            case 1:
                f stackScreen = (f) this.f20838e;
                Intrinsics.checkNotNullParameter(property, "property");
                if (((d) obj) == ((d) obj2) || (jVar = stackScreen.getStackHost$react_native_screens_release().get()) == null) {
                    return;
                }
                e4.e eVar = jVar.f20294i;
                Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                int iOrdinal = stackScreen.getActivityMode().ordinal();
                if (iOrdinal == 0) {
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                    ((ArrayList) eVar.f7972i).add(new sm.d(stackScreen));
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new n();
                    }
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                    ((ArrayList) eVar.f7971e).add(new sm.e(stackScreen));
                    return;
                }
            default:
                super.afterChange(property, obj, obj2);
                return;
        }
    }

    @Override // io.c
    public boolean beforeChange(KProperty property, Object obj, Object obj2) {
        switch (this.f20837d) {
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((k) this.f20838e).f22437a) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            default:
                return super.beforeChange(property, obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, k kVar) {
        super(obj);
        this.f20837d = 2;
        this.f20838e = kVar;
    }
}
