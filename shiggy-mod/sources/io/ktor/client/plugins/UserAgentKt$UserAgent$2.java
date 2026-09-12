package io.ktor.client.plugins;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: UserAgent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* synthetic */ class UserAgentKt$UserAgent$2 extends AdaptedFunctionReference implements Function0<UserAgentConfig> {
    public static final UserAgentKt$UserAgent$2 INSTANCE = new UserAgentKt$UserAgent$2();

    UserAgentKt$UserAgent$2() {
        super(0, UserAgentConfig.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final UserAgentConfig invoke() {
        return new UserAgentConfig(null, 1, null);
    }
}
