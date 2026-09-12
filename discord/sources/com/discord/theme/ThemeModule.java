package com.discord.theme;

import a3.e;
import android.app.Activity;
import com.discord.codegen.NativeThemeModuleSpec;
import com.discord.theme.utils.ActivityThemeUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/theme/ThemeModule;", "Lcom/discord/codegen/NativeThemeModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "updateTheme", "", "theme", "", "updateSaturation", "saturationFactor", "", "setVisualRefreshEnabled", ViewProps.ENABLED, "", "theme_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThemeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeModule.kt\ncom/discord/theme/ThemeModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class ThemeModule extends NativeThemeModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscordTheme.values().length];
            try {
                iArr[DiscordTheme.DARK_LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscordTheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscordTheme.MIDNIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiscordTheme.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTheme$lambda$1(ThemeModule themeModule) {
        Activity currentActivity = themeModule.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            ActivityThemeUtils.INSTANCE.updateActivityTheming$theme_release(currentActivity);
        }
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.discord.codegen.NativeThemeModuleSpec
    public void setVisualRefreshEnabled(boolean enabled) {
        ThemeManager.INSTANCE.setVisualRefreshEnabled(enabled);
    }

    @Override // com.discord.codegen.NativeThemeModuleSpec
    public void updateSaturation(double saturationFactor) {
        ThemeManager.INSTANCE.setSaturationFactor(saturationFactor);
    }

    @Override // com.discord.codegen.NativeThemeModuleSpec
    public void updateTheme(String theme) {
        DiscordTheme discordThemeFromThemeName = theme != null ? DiscordTheme.INSTANCE.fromThemeName(theme) : null;
        int i7 = discordThemeFromThemeName == null ? -1 : WhenMappings.$EnumSwitchMapping$0[discordThemeFromThemeName.ordinal()];
        if (i7 == -1) {
            throw new IllegalArgumentException(e.l("Invalid theme: ", theme));
        }
        if (i7 == 1) {
            ThemeManager.INSTANCE.setDarkLegacyTheme();
        } else if (i7 == 2) {
            ThemeManager.INSTANCE.setDarkTheme();
        } else if (i7 == 3) {
            ThemeManager.INSTANCE.setMidnightTheme();
        } else {
            if (i7 != 4) {
                throw new n();
            }
            ThemeManager.INSTANCE.setLightTheme();
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new s(11, this));
        }
    }
}
