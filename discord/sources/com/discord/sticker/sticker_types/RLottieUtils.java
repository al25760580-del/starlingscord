package com.discord.sticker.sticker_types;

import com.discord.logging.Log;
import com.discord.rlottie.RLottie;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\r\u001a\u00020\u000b*\u00020\u000eH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/discord/sticker/sticker_types/RLottieUtils;", "", "<init>", "()V", "initialized", "", "getInitialized$sticker_release", "()Z", "setInitialized$sticker_release", "(Z)V", "init", "", "initAsync", "warn", "Ljava/lang/UnsatisfiedLinkError;", "sticker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RLottieUtils {

    @NotNull
    public static final RLottieUtils INSTANCE = new RLottieUtils();
    private static boolean initialized;

    private RLottieUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$0() {
        INSTANCE.initAsync();
        return Unit.f14616a;
    }

    private final void initAsync() {
        try {
            RLottie.INSTANCE.init();
            initialized = true;
        } catch (UnsatisfiedLinkError e10) {
            warn(e10);
        }
    }

    private final void warn(UnsatisfiedLinkError unsatisfiedLinkError) {
        Log.INSTANCE.w("RLottie", "Unable to load animated sticker library.", unsatisfiedLinkError);
    }

    public final boolean getInitialized$sticker_release() {
        return initialized;
    }

    public final void init() {
        q.B("RLottieLoader", 0, new c(0), 23);
    }

    public final void setInitialized$sticker_release(boolean z5) {
        initialized = z5;
    }
}
