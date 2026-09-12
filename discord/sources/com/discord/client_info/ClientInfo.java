package com.discord.client_info;

import android.content.Context;
import com.discord.chat.presentation.list.f;
import java.util.Locale;
import kk.b;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u000e\u0010\u0016\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0011\u0010!\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u001b\u0010\"\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010 R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/discord/client_info/ClientInfo;", "", "<init>", "()V", "versionName", "", "getVersionName", "()Ljava/lang/String;", "setVersionName", "(Ljava/lang/String;)V", "versionCode", "getVersionCode", "setVersionCode", "otaManifestETag", "getOtaManifestETag", "setOtaManifestETag", "otaVersion", "getOtaVersion", "setOtaVersion", "packageName", "getPackageName", "setPackageName", "flavor", "buildType", "releaseChannel", "getReleaseChannel", "SENTRY_DSN", "SENTRY_STAFF_DSN", "SENTRY_ALPHA_BETA_DSN", "SENTRY_RELEASE", "isDebugBuild", "", "()Z", "isDeveloperBuild", "isProdBuild", "isProdBuild$delegate", "Lkotlin/Lazy;", "PROGUARD_UUID", "init", "", "context", "Landroid/content/Context;", "", "otaManifest", "client_info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClientInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientInfo.kt\ncom/discord/client_info/ClientInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class ClientInfo {

    @NotNull
    public static final String PROGUARD_UUID = "7eae4825-3c4e-4f2c-80c9-30c83bc18c15";

    @NotNull
    public static final String SENTRY_ALPHA_BETA_DSN = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375";

    @NotNull
    public static final String SENTRY_DSN = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";

    @NotNull
    public static final String SENTRY_RELEASE = "discord_android@344.13.0-0+344013";

    @NotNull
    public static final String SENTRY_STAFF_DSN = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375";
    private static String buildType;
    private static String flavor;
    public static String otaManifestETag;
    public static String otaVersion;
    public static String packageName;
    public static String versionCode;
    public static String versionName;

    @NotNull
    public static final ClientInfo INSTANCE = new ClientInfo();

    /* JADX INFO: renamed from: isProdBuild$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isProdBuild = l.b(new f(29));

    private ClientInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isProdBuild_delegate$lambda$1() {
        if (!INSTANCE.isDebugBuild()) {
            String str = flavor;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("flavor");
                str = null;
            }
            if (!StringsKt.D(str, "beta", false)) {
                String str3 = flavor;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("flavor");
                } else {
                    str2 = str3;
                }
                if (!StringsKt.D(str2, "canary", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String getOtaManifestETag() {
        String str = otaManifestETag;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otaManifestETag");
        return null;
    }

    @NotNull
    public final String getOtaVersion() {
        String str = otaVersion;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otaVersion");
        return null;
    }

    @NotNull
    public final String getPackageName() {
        String str = packageName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("packageName");
        return null;
    }

    @NotNull
    public final String getReleaseChannel() {
        String str = flavor;
        String string = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flavor");
            str = null;
        }
        String str2 = buildType;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildType");
        } else {
            string = str2;
        }
        if (string.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            String strValueOf = String.valueOf(string.charAt(0));
            Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append((Object) upperCase);
            String strSubstring = string.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            string = sb2.toString();
        }
        return b.j(str, string);
    }

    @NotNull
    public final String getVersionCode() {
        String str = versionCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("versionCode");
        return null;
    }

    @NotNull
    public final String getVersionName() {
        String str = versionName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("versionName");
        return null;
    }

    public final void init(@NotNull Context context, @NotNull String versionName2, int versionCode2, @NotNull String flavor2, @NotNull String buildType2, @NotNull String otaManifest, @NotNull String otaVersion2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(versionName2, "versionName");
        Intrinsics.checkNotNullParameter(flavor2, "flavor");
        Intrinsics.checkNotNullParameter(buildType2, "buildType");
        Intrinsics.checkNotNullParameter(otaManifest, "otaManifest");
        Intrinsics.checkNotNullParameter(otaVersion2, "otaVersion");
        setVersionName(versionName2);
        setVersionCode(String.valueOf(versionCode2));
        setOtaManifestETag(otaManifest);
        setOtaVersion(otaVersion2);
        flavor = flavor2;
        buildType = buildType2;
        setPackageName(context.getPackageName());
        ClientUserAgent.INSTANCE.init(context, "Discord-Android/" + versionCode2 + ";RNA");
    }

    public final boolean isDebugBuild() {
        String str = buildType;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildType");
            str = null;
        }
        return Intrinsics.areEqual(str, "debug");
    }

    public final boolean isDeveloperBuild() {
        String str = flavor;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flavor");
            str = null;
        }
        return Intrinsics.areEqual(str, "developer");
    }

    public final boolean isProdBuild() {
        return ((Boolean) isProdBuild.getValue()).booleanValue();
    }

    public final void setOtaManifestETag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        otaManifestETag = str;
    }

    public final void setOtaVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        otaVersion = str;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        packageName = str;
    }

    public final void setVersionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        versionCode = str;
    }

    public final void setVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        versionName = str;
    }
}
