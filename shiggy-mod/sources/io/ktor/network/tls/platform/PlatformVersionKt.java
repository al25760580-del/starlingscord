package io.ktor.network.tls.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformVersion.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/ktor/network/tls/platform/PlatformVersion;", "platformVersion$delegate", "Lkotlin/Lazy;", "getPlatformVersion", "()Lio/ktor/network/tls/platform/PlatformVersion;", "platformVersion", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PlatformVersionKt {
    private static final Lazy platformVersion$delegate = LazyKt.lazy(new Function0() { // from class: io.ktor.network.tls.platform.PlatformVersionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PlatformVersionKt.platformVersion_delegate$lambda$0();
        }
    });

    public static final PlatformVersion getPlatformVersion() {
        return (PlatformVersion) platformVersion$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformVersion platformVersion_delegate$lambda$0() {
        PlatformVersion.Companion companion = PlatformVersion.INSTANCE;
        String property = System.getProperty("java.version");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        return companion.invoke(property);
    }
}
