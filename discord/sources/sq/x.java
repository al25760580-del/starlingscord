package sq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f20553d = new x("must have no value parameters", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f20554e = new x("must have a single value parameter", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(String str, int i7) {
        super(str, 1);
        this.f20555c = i7;
    }

    @Override // sq.e
    public final boolean a(gp.e functionDescriptor) {
        switch (this.f20555c) {
            case 0:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return functionDescriptor.L().isEmpty();
            default:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return functionDescriptor.L().size() == 1;
        }
    }
}
