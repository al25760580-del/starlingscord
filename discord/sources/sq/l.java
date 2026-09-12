package sq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f20518d = new l("must be a member function", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f20519e = new l("must be a member or an extension function", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i7) {
        super(str, 0);
        this.f20520c = i7;
    }

    @Override // sq.e
    public final boolean a(gp.e functionDescriptor) {
        switch (this.f20520c) {
            case 0:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return functionDescriptor.H != null;
            default:
                Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
                return (functionDescriptor.H == null && functionDescriptor.G == null) ? false : true;
        }
    }
}
