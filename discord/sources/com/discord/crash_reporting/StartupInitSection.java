package com.discord.crash_reporting;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/discord/crash_reporting/StartupInitSection;", "", "<init>", "(Ljava/lang/String;I)V", "ReactInstanceManager", "ReactBridgeLoading", "NativeModuleInitialization", "NativeModuleSetup", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum StartupInitSection {
    ReactInstanceManager,
    ReactBridgeLoading,
    NativeModuleInitialization,
    NativeModuleSetup;

    private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
