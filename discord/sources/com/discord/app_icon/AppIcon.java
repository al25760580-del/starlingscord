package com.discord.app_icon;

import a3.e;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006&"}, d2 = {"Lcom/discord/app_icon/AppIcon;", "", StackTraceHelper.ID_KEY, "", "aliasSuffix", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "DEFAULT", "BRAND_INVERTED", "BRAND_DARK", "MATTE_LIGHT", "MATTE_DARK", "PASTEL", "PIRATE", "CAMO", "SUNSET", "GALAXY", "Y2K", "CHERRY_BLOSSOM", "BEANIE", "GAMING", "CIRCUIT", "HOLO_WAVES", "BLUSH", "ANGRY", "MANGA", "CONTROLLER", "MUSHROOM", "BLURPLE_TWILIGHT", "IN_RAINBOWS", "MIDNIGHT_PRISM", "COLOR_WAVE", "TREAT", "TRICK", "alias", "getAlias", "app_icon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum AppIcon {
    DEFAULT("AppIcon", "MainDefault"),
    BRAND_INVERTED("BrandInvertedIcon", "MainBrandInverted"),
    BRAND_DARK("BrandDarkIcon", "MainBrandDark"),
    MATTE_LIGHT("MatteLightIcon", "MainMatteLight"),
    MATTE_DARK("MatteDarkIcon", "MainMatteDark"),
    PASTEL("PastelIcon", "MainPastel"),
    PIRATE("PirateIcon", "MainPirate"),
    CAMO("CamoIcon", "MainCamo"),
    SUNSET("SunsetIcon", "MainSunset"),
    GALAXY("GalaxyIcon", "MainGalaxy"),
    Y2K("Y2KIcon", "MainY2K"),
    CHERRY_BLOSSOM("CherryBlossomIcon", "MainCherryBlossom"),
    BEANIE("BeanieIcon", "MainBeanie"),
    GAMING("GamingIcon", "MainGaming"),
    CIRCUIT("CircuitIcon", "MainCircuit"),
    HOLO_WAVES("HoloWavesIcon", "MainHoloWaves"),
    BLUSH("BlushIcon", "MainBlush"),
    ANGRY("AngryIcon", "MainAngry"),
    MANGA("MangaIcon", "MainManga"),
    CONTROLLER("ControllerIcon", "MainController"),
    MUSHROOM("MushroomIcon", "MainMushroom"),
    BLURPLE_TWILIGHT("BlurpleTwilightIcon", "MainBlurpleTwilight"),
    IN_RAINBOWS("InRainbowsIcon", "MainInRainbows"),
    MIDNIGHT_PRISM("MidnightPrismIcon", "MainMidnightPrism"),
    COLOR_WAVE("ColorWaveIcon", "MainColorWave"),
    TREAT("TreatIcon", "MainTreat"),
    TRICK("TrickIcon", "MainTrick");

    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    @NotNull
    private final String aliasSuffix;

    @NotNull
    private final String id;

    AppIcon(String str, String str2) {
        this.id = str;
        this.aliasSuffix = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getAlias() {
        return e.l("com.discord.main.", this.aliasSuffix);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
