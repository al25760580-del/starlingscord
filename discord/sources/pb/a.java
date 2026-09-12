package pb;

import com.github.yamill.orientation.OrientationModule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OrientationModule f17851e;

    public /* synthetic */ a(OrientationModule orientationModule, int i7) {
        this.f17850d = i7;
        this.f17851e = orientationModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17850d) {
            case 0:
                return OrientationModule._init_$lambda$1(this.f17851e);
            default:
                return OrientationModule._init_$lambda$2(this.f17851e);
        }
    }
}
