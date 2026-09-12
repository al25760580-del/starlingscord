package androidx.activity;

import e.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ComponentActivity componentActivity) {
        super(0);
        this.f720d = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ComponentActivity componentActivity = this.f720d;
        return new FullyDrawnReporter(componentActivity.reportFullyDrawnExecutor, new h(componentActivity, 1));
    }
}
