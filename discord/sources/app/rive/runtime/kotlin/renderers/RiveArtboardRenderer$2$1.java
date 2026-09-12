package app.rive.runtime.kotlin.renderers;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class RiveArtboardRenderer$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public RiveArtboardRenderer$2$1(Object obj) {
        super(0, obj, RiveArtboardRenderer.class, ViewProps.START, "start()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m237invoke();
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m237invoke() {
        ((RiveArtboardRenderer) this.receiver).start();
    }
}
