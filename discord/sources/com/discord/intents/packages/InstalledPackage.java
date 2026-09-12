package com.discord.intents.packages;

import a3.e;
import com.discord.intents.BuildConfig;
import com.facebook.imagepipeline.nativecode.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0080\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, d2 = {"Lcom/discord/intents/packages/InstalledPackage;", "", "appName", "", "appPackage", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAppPackage", "()Ljava/lang/String;", "TWITTER", "WHATSAPP", "GMAIL", "LINE", "MESSENGER", "TELEGRAM", "ROBLOX", "MINECRAFT", "FORTNITE", "GENSHIN", "PUBG_MOBILE", "CALL_OF_DUTY_MOBILE", "CLASH_OF_CLANS", "MOBILE_LEGENDS_BANG_BANG", "GARENA_FREE_FIRE", "POKEMON_GO", "POKEMON_TCG_POCKET", "CLASH_ROYALE", "AMONG_US", "MONOPOLY_GO", "BRAWL_STARS", "BRAWLHALLA", "WUTHERING_WAVES", "Companion", "intents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum InstalledPackage {
    TWITTER("twitter", BuildConfig.PACKAGE_TWITTER),
    WHATSAPP("whatsapp", BuildConfig.PACKAGE_WHATSAPP),
    GMAIL("googlegmail", null),
    LINE("line", BuildConfig.PACKAGE_LINE),
    MESSENGER("fb-messenger", BuildConfig.PACKAGE_FACEBOOK),
    TELEGRAM("tg", BuildConfig.PACKAGE_TELEGRAM),
    ROBLOX("roblox", BuildConfig.PACKAGE_ROBLOX),
    MINECRAFT("minecraft", BuildConfig.PACKAGE_MINECRAFT),
    FORTNITE("fortnite", BuildConfig.PACKAGE_FORTNITE),
    GENSHIN("genshin", BuildConfig.PACKAGE_GENSHIN),
    PUBG_MOBILE("pubgmobile", BuildConfig.PACKAGE_PUBG_MOBILE),
    CALL_OF_DUTY_MOBILE("codm", BuildConfig.PACKAGE_CALL_OF_DUTY_MOBILE),
    CLASH_OF_CLANS("clashofclans", BuildConfig.PACKAGE_CLASH_OF_CLANS),
    MOBILE_LEGENDS_BANG_BANG("mobilelegends", BuildConfig.PACKAGE_MOBILE_LEGENDS_BANG_BANG),
    GARENA_FREE_FIRE("garenafreefire", BuildConfig.PACKAGE_GARENA_FREE_FIRE),
    POKEMON_GO("pokemongo", BuildConfig.PACKAGE_POKEMON_GO),
    POKEMON_TCG_POCKET("pokemontcgp", BuildConfig.PACKAGE_POKEMON_TCG_POCKET),
    CLASH_ROYALE("clashroyale", BuildConfig.PACKAGE_CLASH_ROYALE),
    AMONG_US("amongus", BuildConfig.PACKAGE_AMONG_US),
    MONOPOLY_GO("monopolygo", BuildConfig.PACKAGE_MONOPOLY_GO),
    BRAWL_STARS("brawlstars", BuildConfig.PACKAGE_BRAWL_STARS),
    BRAWLHALLA("brawlhalla", BuildConfig.PACKAGE_BRAWLHALLA),
    WUTHERING_WAVES("wutheringwaves", BuildConfig.PACKAGE_WUTHERING_WAVES);


    @NotNull
    private final String appName;
    private final String appPackage;
    private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/intents/packages/InstalledPackage$Companion;", "", "<init>", "()V", "parse", "Lcom/discord/intents/packages/InstalledPackage;", "appName", "", "intents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInstalledPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstalledPackage.kt\ncom/discord/intents/packages/InstalledPackage$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n295#2,2:40\n*S KotlinDebug\n*F\n+ 1 InstalledPackage.kt\ncom/discord/intents/packages/InstalledPackage$Companion\n*L\n35#1:40,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InstalledPackage parse(@NotNull String appName) {
            Object next;
            Intrinsics.checkNotNullParameter(appName, "appName");
            Iterator<E> it = InstalledPackage.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((InstalledPackage) next).appName, appName));
            InstalledPackage installedPackage = (InstalledPackage) next;
            if (installedPackage != null) {
                return installedPackage;
            }
            throw new IllegalArgumentException(e.l("Unknown app name ", appName));
        }

        private Companion() {
        }
    }

    InstalledPackage(String str, String str2) {
        this.appName = str;
        this.appPackage = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }
}
