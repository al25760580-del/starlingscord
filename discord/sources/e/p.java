package e;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f7838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(OnBackPressedDispatcher onBackPressedDispatcher, int i7) {
        super(0);
        this.f7837d = i7;
        this.f7838e = onBackPressedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7837d) {
            case 0:
                this.f7838e.d();
                break;
            case 1:
                this.f7838e.c();
                break;
            default:
                this.f7838e.d();
                break;
        }
        return Unit.f14616a;
    }
}
