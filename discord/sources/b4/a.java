package b4;

import android.os.Build;
import c4.i;
import e4.o;
import kotlin.jvm.internal.Intrinsics;
import v3.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c4.a tracker) {
        super(tracker);
        this.f3057b = 0;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3058c = 6;
    }

    @Override // b4.e
    public final int a() {
        switch (this.f3057b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f3058c;
    }

    @Override // b4.e
    public final boolean b(o workSpec) {
        switch (this.f3057b) {
            case 0:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f21395b;
            case 1:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f21397d;
            case 2:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f21394a == r.f21421e;
            case 3:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                r rVar = workSpec.j.f21394a;
                return rVar == r.f21422i || (Build.VERSION.SDK_INT >= 30 && rVar == r.f21425x);
            default:
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                return workSpec.j.f21398e;
        }
    }

    @Override // b4.e
    public final boolean c(Object obj) {
        boolean zBooleanValue;
        switch (this.f3057b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                a4.d value = (a4.d) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                return Build.VERSION.SDK_INT < 26 ? !value.f122a : !(value.f122a && value.f123b);
            case 3:
                a4.d value2 = (a4.d) obj;
                Intrinsics.checkNotNullParameter(value2, "value");
                return !value2.f122a || value2.f124c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c4.a tracker, byte b10) {
        super(tracker);
        this.f3057b = 1;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3058c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c4.a tracker, char c8) {
        super(tracker);
        this.f3057b = 4;
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3058c = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i tracker, int i7) {
        super(tracker);
        this.f3057b = i7;
        switch (i7) {
            case 3:
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                super(tracker);
                this.f3058c = 7;
                break;
            default:
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                this.f3058c = 7;
                break;
        }
    }
}
