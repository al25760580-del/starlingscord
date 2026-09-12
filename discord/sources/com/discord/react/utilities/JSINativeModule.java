package com.discord.react.utilities;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0083 J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/discord/react/utilities/JSINativeModule;", "", "<init>", "()V", "nativeInstall", "", "jsi", "", "loaded", "", "Ljava/lang/Boolean;", "install", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSINativeModule {

    @NotNull
    public static final JSINativeModule INSTANCE = new JSINativeModule();
    private static Boolean loaded;

    private JSINativeModule() {
    }

    private static final native void nativeInstall(long jsi);

    public final boolean install(long jsi) {
        Boolean bool;
        if (loaded == null) {
            try {
                System.loadLibrary("react_utilities");
                nativeInstall(jsi);
                bool = Boolean.TRUE;
            } catch (Exception unused) {
                bool = Boolean.FALSE;
            }
            loaded = bool;
        }
        Boolean bool2 = loaded;
        Intrinsics.checkNotNull(bool2);
        return bool2.booleanValue();
    }
}
