package sq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20551c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20552d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(int i7) {
        StringBuilder sbS = a3.e.s(i7, "must have at least ", " value parameter");
        sbS.append(i7 > 1 ? "s" : "");
        super(sbS.toString(), 1);
        this.f20552d = i7;
    }

    @Override // sq.e
    public final boolean a(gp.e functionDescriptor) {
        switch (this.f20551c) {
            case 0:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return functionDescriptor.L().size() >= this.f20552d;
            default:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return functionDescriptor.L().size() == this.f20552d;
        }
    }

    public w() {
        super("must have exactly 2 value parameters", 1);
        this.f20552d = 2;
    }
}
