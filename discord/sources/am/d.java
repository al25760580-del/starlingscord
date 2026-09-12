package am;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.f643d = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f643d) {
            case 0:
                return ((e) this.receiver).getKeyboardCallback();
            case 1:
                ((OnBackPressedDispatcher) this.receiver).f();
                return Unit.f14616a;
            default:
                ((OnBackPressedDispatcher) this.receiver).f();
                return Unit.f14616a;
        }
    }
}
