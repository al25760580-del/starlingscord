package com.discord.sounds;

import a3.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.URLUtil;
import com.discord.logging.Log;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.sounds.SoundManagerModule;
import com.discord.sounds.utils.SoundExtensionsKt;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import kk.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J\u001e\u0010\u001c\u001a\u00020\u000f*\u00020\u001d2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/discord/sounds/SoundManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "soundManager", "Lcom/discord/sounds/SoundManager;", "getName", "", "prepare", "", "fileName", "usage", "key", "", "callback", "Lcom/facebook/react/bridge/Callback;", "play", "pause", "stop", "release", "setVolume", "value", "", "setPan", "setNumberOfLoops", "setCurrentTime", "resolveRawResId", "Landroid/content/Context;", "type", "sounds_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSoundManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundManagerModule.kt\ncom/discord/sounds/SoundManagerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public final class SoundManagerModule extends ReactContextBaseJavaModule {

    @NotNull
    private final SoundManager soundManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.soundManager = new SoundManager(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepare$lambda$0(Callback callback, int i7) {
        callback.invoke(null, NativeMapExtensionsKt.nativeMapOf(new Pair("duration", Integer.valueOf(i7)), new Pair("numberOfChannels", -1)));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepare$lambda$1(Callback callback, int i7) {
        callback.invoke(null, NativeMapExtensionsKt.nativeMapOf(new Pair("duration", Integer.valueOf(i7)), new Pair("numberOfChannels", -1)));
        return Unit.f14616a;
    }

    @SuppressLint({"DiscouragedApi"})
    private final int resolveRawResId(Context context, String str, String str2) {
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier > 0) {
            return identifier;
        }
        String packageName = context.getPackageName();
        StringBuilder sbU = e.u("Failed requirement, resId should not be zero - fileName: ", str, ", type: ", str2, ", packageName: ");
        sbU.append(packageName);
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    public static /* synthetic */ int resolveRawResId$default(SoundManagerModule soundManagerModule, Context context, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = "raw";
        }
        return soundManagerModule.resolveRawResId(context, str, str2);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "DCDSoundManager";
    }

    @ReactMethod
    public final void pause(int key) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), b.h(key, "Pause "), (Throwable) null, 4, (Object) null);
        this.soundManager.pause(key);
    }

    @ReactMethod
    public final void play(int key) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), b.h(key, "Play "), (Throwable) null, 4, (Object) null);
        this.soundManager.play(key);
    }

    @ReactMethod
    public final void prepare(@NotNull String fileName, String usage, int key, @NotNull final Callback callback) {
        Integer numValueOf;
        String absolutePath;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), "Prepare " + fileName + " with " + key + ".", (Throwable) null, 4, (Object) null);
        int i7 = 5;
        if (usage != null) {
            switch (usage.hashCode()) {
                case 103772132:
                    if (usage.equals("media")) {
                        i7 = 1;
                    }
                    break;
                case 112386354:
                    if (usage.equals("voice")) {
                        i7 = 2;
                    }
                    break;
                case 301372961:
                    if (usage.equals("ring_tone")) {
                        i7 = 6;
                    }
                    break;
                case 595233003:
                    usage.equals("notification");
                    break;
            }
        }
        int i10 = i7;
        if (URLUtil.isValidUrl(fileName)) {
            String remoteSoundFilename = SoundExtensionsKt.getRemoteSoundFilename(fileName);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            File file = new File(SoundExtensionsKt.getSoundsCacheDirectory(reactApplicationContext), remoteSoundFilename);
            if (!file.exists()) {
                ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
                Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
                final int i11 = 0;
                SoundExtensionsKt.fetchSound(reactApplicationContext2, fileName, this.soundManager, key, i10, new Function1() { // from class: a8.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i12 = i11;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i12) {
                            case 0:
                                return SoundManagerModule.prepare$lambda$0(callback, iIntValue);
                            default:
                                return SoundManagerModule.prepare$lambda$1(callback, iIntValue);
                        }
                    }
                });
                return;
            }
            file.setLastModified(System.currentTimeMillis());
            absolutePath = file.getAbsolutePath();
            numValueOf = null;
        } else {
            ReactApplicationContext reactApplicationContext3 = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext3, "getReactApplicationContext(...)");
            numValueOf = Integer.valueOf(resolveRawResId$default(this, reactApplicationContext3, fileName, null, 2, null));
            absolutePath = null;
        }
        final int i12 = 1;
        this.soundManager.prepare(key, i10, numValueOf, absolutePath, new Function1() { // from class: a8.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = i12;
                int iIntValue = ((Integer) obj).intValue();
                switch (i13) {
                    case 0:
                        return SoundManagerModule.prepare$lambda$0(callback, iIntValue);
                    default:
                        return SoundManagerModule.prepare$lambda$1(callback, iIntValue);
                }
            }
        });
    }

    @ReactMethod
    public final void release(int key) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), b.h(key, "Release "), (Throwable) null, 4, (Object) null);
        this.soundManager.release(key);
    }

    @ReactMethod
    public final void setCurrentTime(int key, int value) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), e.g(key, value, "Set current time for ", " with value "), (Throwable) null, 4, (Object) null);
        this.soundManager.setCurrentTime(key, value);
    }

    @ReactMethod
    public final void setNumberOfLoops(int key, int value) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), e.g(key, value, "Set number of loops for ", " with value "), (Throwable) null, 4, (Object) null);
        this.soundManager.setNumberOfLoops(key, value);
    }

    @ReactMethod
    public final void setPan(int key, int value) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), e.g(key, value, "Set pan for ", " with value "), (Throwable) null, 4, (Object) null);
        this.soundManager.setPan(key, value);
    }

    @ReactMethod
    public final void setVolume(int key, float value) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), "Set volume for " + key + " with value " + value, (Throwable) null, 4, (Object) null);
        this.soundManager.setVolume(key, value);
    }

    @ReactMethod
    public final void stop(int key) {
        Log.i$default(Log.INSTANCE, SoundManager.INSTANCE.getLogTag(), b.h(key, "Stop "), (Throwable) null, 4, (Object) null);
        this.soundManager.stop(key);
    }
}
