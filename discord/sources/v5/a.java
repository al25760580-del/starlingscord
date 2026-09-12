package v5;

import com.discord.chat.input.bridge.ChatInputNodeStyle;
import com.discord.resource_usage.utils.ProcfsStats;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsForTests;
import kotlin.jvm.functions.Function0;
import z9.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21501d;

    public /* synthetic */ a(int i7) {
        this.f21501d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21501d) {
            case 0:
                return ChatInputNodeStyle._childSerializers$_anonymous_();
            case 1:
                return ProcfsStats.statFile_delegate$lambda$0();
            case 2:
                return new d();
            case 3:
                return ReactNativeFeatureFlags.accessorProvider$lambda$0();
            default:
                return ReactNativeFeatureFlagsForTests.setUp$lambda$0();
        }
    }
}
