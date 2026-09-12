package com.discord.key_commands;

import com.discord.codegen.NativeKeyCommandsModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0014¨\u0006\n"}, d2 = {"Lcom/discord/key_commands/KeyCommandsModule;", "Lcom/discord/codegen/NativeKeyCommandsModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "key_commands_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyCommandsModule extends NativeKeyCommandsModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyCommandsModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeKeyCommandsModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return w0.h(new Pair("keyModifierAlphaShift", 65536), new Pair("keyModifierShift", 131072), new Pair("keyModifierControl", 262144), new Pair("keyModifierAlternate", 524288), new Pair("keyModifierCommand", 1048576), new Pair("keyModifierNumericPad", 2097152));
    }
}
