package com.discord.p000native.engine;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/VideoInputDeviceFacing;", "", "(Ljava/lang/String;I)V", "Unknown", "Front", "Back", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum VideoInputDeviceFacing {
    Unknown,
    Front,
    Back;

    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }
}
