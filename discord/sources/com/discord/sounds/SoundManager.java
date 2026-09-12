package com.discord.sounds;

import android.app.NotificationManager;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010 \u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/discord/sounds/SoundManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "usage", "soundResId", "", "filePath", "Lkotlin/Function1;", "", "soundResIdPrepared", "prepare", "(IILjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "play", "(I)V", "pause", "stop", "release", "numberOfLoops", "setNumberOfLoops", "(II)V", "", "volume", "setVolume", "(IF)V", "pan", "setPan", "time", "setCurrentTime", "Landroid/content/Context;", "", "Lcom/discord/sounds/SoundPlayer;", "soundPlayers", "Ljava/util/Map;", "Companion", "sounds_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SoundManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String logTag;

    @NotNull
    private final Context context;

    @NotNull
    private Map<Integer, SoundPlayer> soundPlayers;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/sounds/SoundManager$Companion;", "", "<init>", "()V", "logTag", "", "getLogTag", "()Ljava/lang/String;", "sounds_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getLogTag() {
            return SoundManager.logTag;
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("SoundManager", "getSimpleName(...)");
        logTag = "SoundManager";
    }

    public SoundManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.soundPlayers = new LinkedHashMap();
    }

    public final void pause(int key) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.pause();
    }

    public final void play(int key) {
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        SoundPlayer soundPlayer2 = soundPlayer;
        boolean z5 = ((NotificationManager) systemService).getCurrentInterruptionFilter() == 1;
        boolean z6 = soundPlayer2.getUsage() == 5;
        if (z5 || !z6) {
            soundPlayer2.play();
        }
    }

    public final void prepare(int key, int usage, Integer soundResId, String filePath, @NotNull Function1<? super Integer, Unit> soundResIdPrepared) {
        Intrinsics.checkNotNullParameter(soundResIdPrepared, "soundResIdPrepared");
        if (this.soundPlayers.containsKey(Integer.valueOf(key))) {
            throw new IllegalAccessError("Trying to prepare an already prepared asset.");
        }
        this.soundPlayers.put(Integer.valueOf(key), new SoundPlayer(this.context, usage, soundResId, filePath, soundResIdPrepared));
    }

    public final void release(int key) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.release();
        this.soundPlayers.remove(Integer.valueOf(key));
    }

    public final void setCurrentTime(int key, int time) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.setCurrentTime(time);
    }

    public final void setNumberOfLoops(int key, int numberOfLoops) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.setNumberOfLoops(numberOfLoops);
    }

    public final void setPan(int key, float pan) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.setPan(pan);
    }

    public final void setVolume(int key, float volume) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.setVolume(volume);
    }

    public final void stop(int key) {
        SoundPlayer soundPlayer = this.soundPlayers.get(Integer.valueOf(key));
        Intrinsics.checkNotNull(soundPlayer);
        soundPlayer.stop();
    }
}
