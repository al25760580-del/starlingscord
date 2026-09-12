package vm;

import android.graphics.drawable.ColorDrawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends io.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f21755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i7, boolean z5) {
        super(null);
        this.f21754d = i7;
        this.f21755e = eVar;
    }

    @Override // io.c
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f21754d) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Float) obj, (Float) obj2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (String) obj, (String) obj2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (String) obj, (String) obj2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (String) obj, (String) obj2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(property, "property");
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj;
                if (bool.booleanValue() != bool2.booleanValue()) {
                    e eVar = this.f21755e;
                    eVar.e(null);
                    e.c(eVar, bool2, bool);
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(property, "property");
                Integer num = (Integer) obj2;
                if (!Intrinsics.areEqual(num, (Integer) obj)) {
                    this.f21755e.setBackground(num != null ? new ColorDrawable(num.intValue()) : null);
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(property, "property");
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                e.c(this.f21755e, bool4, bool3);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (String) obj, (String) obj2);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Integer) obj, (Integer) obj2);
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                e.c(this.f21755e, (Float) obj, (Float) obj2);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(e eVar, int i7) {
        this.f21754d = i7;
        switch (i7) {
            case 9:
                Boolean bool = Boolean.TRUE;
                this.f21755e = eVar;
                super(bool);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.f21755e = eVar;
                super(bool2);
                break;
        }
    }
}
