package com.discord.tti_manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u000eH\u0002J\b\u0010'\u001a\u00020#H\u0002J \u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0002J \u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020#H\u0002J \u0010-\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0011H\u0002J\u001c\u00101\u001a\u00020.*\u0002022\u0006\u0010+\u001a\u00020\u00052\u0006\u00103\u001a\u00020#H\u0002J\u0010\u00104\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0002J\u0010\u00105\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0002J\u0010\u00106\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/discord/tti_manager/ArtProfileTelemetry;", "", "<init>", "()V", "PREFERENCES_NAME", "", "KEY_PACKAGE_LAST_UPDATE_TIME_MS", "KEY_LAUNCH_INDEX", "REFERENCE_PROFILE_PREFIX", "CURRENT_PROFILE_PREFIX", "PROFILE_FILE_NAME", "REFERENCE_PROFILE_BASE_PATH", "CURRENT_PROFILE_BASE_PATH", "PER_USER_UID_RANGE", "", "lock", "cachedTelemetry", "Lcom/discord/tti_manager/AndroidArtProfileTelemetry;", "collect", "context", "Landroid/content/Context;", "collectUncached", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "isSamePackageUpdate", "", "preferences", "Landroid/content/SharedPreferences;", "lastUpdateTimeMs", "", "getNextLaunchIndex", "getReferenceProfilePath", "packageName", "getCurrentProfilePath", "readProfileMetadata", "Lcom/discord/tti_manager/ArtProfileFileMetadata;", "path", "getUnavailableProfileMetadata", "errno", "getInaccessibleProfileMetadata", "profileChanged", "referenceProfile", "currentProfile", "prefix", "profile", "persistObservation", "", "packageLastUpdateTimeMs", "telemetry", "putProfileMetadata", "Landroid/content/SharedPreferences$Editor;", "metadata", "statusKey", "sizeKey", "lastModifiedKey", "tti_manager_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArtProfileTelemetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtProfileTelemetry.kt\ncom/discord/tti_manager/ArtProfileTelemetry\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,272:1\n40#2,13:273\n*S KotlinDebug\n*F\n+ 1 ArtProfileTelemetry.kt\ncom/discord/tti_manager/ArtProfileTelemetry\n*L\n223#1:273,13\n*E\n"})
public final class ArtProfileTelemetry {

    @NotNull
    private static final String CURRENT_PROFILE_BASE_PATH = "/data/misc/profiles/cur";

    @NotNull
    private static final String CURRENT_PROFILE_PREFIX = "current_profile";

    @NotNull
    private static final String KEY_LAUNCH_INDEX = "launch_index";

    @NotNull
    private static final String KEY_PACKAGE_LAST_UPDATE_TIME_MS = "package_last_update_time_ms";
    private static final int PER_USER_UID_RANGE = 100000;

    @NotNull
    private static final String PREFERENCES_NAME = "art_profile_telemetry";

    @NotNull
    private static final String PROFILE_FILE_NAME = "primary.prof";

    @NotNull
    private static final String REFERENCE_PROFILE_BASE_PATH = "/data/misc/profiles/ref";

    @NotNull
    private static final String REFERENCE_PROFILE_PREFIX = "reference_profile";
    private static volatile AndroidArtProfileTelemetry cachedTelemetry;

    @NotNull
    public static final ArtProfileTelemetry INSTANCE = new ArtProfileTelemetry();

    @NotNull
    private static final Object lock = new Object();

    private ArtProfileTelemetry() {
    }

    private final AndroidArtProfileTelemetry collectUncached(Context context) throws PackageManager.NameNotFoundException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        PackageInfo packageInfo = getPackageInfo(context);
        boolean z5 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        Intrinsics.checkNotNull(sharedPreferences);
        boolean zIsSamePackageUpdate = isSamePackageUpdate(sharedPreferences, packageInfo.lastUpdateTime);
        long nextLaunchIndex = getNextLaunchIndex(sharedPreferences, zIsSamePackageUpdate);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String referenceProfilePath = getReferenceProfilePath(packageName);
        String packageName2 = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
        String currentProfilePath = getCurrentProfilePath(packageName2);
        ArtProfileFileMetadata profileMetadata = readProfileMetadata(referenceProfilePath);
        ArtProfileFileMetadata profileMetadata2 = readProfileMetadata(currentProfilePath);
        if (zIsSamePackageUpdate && profileChanged(sharedPreferences, profileMetadata, profileMetadata2)) {
            z5 = true;
        }
        AndroidArtProfileTelemetry androidArtProfileTelemetry = new AndroidArtProfileTelemetry(jCurrentTimeMillis - packageInfo.lastUpdateTime, nextLaunchIndex, profileMetadata, profileMetadata2, z5);
        persistObservation(sharedPreferences, packageInfo.lastUpdateTime, androidArtProfileTelemetry);
        return androidArtProfileTelemetry;
    }

    private final String getCurrentProfilePath(String packageName) {
        return "/data/misc/profiles/cur/" + (Process.myUid() / PER_USER_UID_RANGE) + "/" + packageName + "/primary.prof";
    }

    private final ArtProfileFileMetadata getInaccessibleProfileMetadata() {
        return new ArtProfileFileMetadata("INACCESSIBLE", null, null);
    }

    private final long getNextLaunchIndex(SharedPreferences preferences, boolean isSamePackageUpdate) {
        if (isSamePackageUpdate) {
            return preferences.getLong(KEY_LAUNCH_INDEX, 0L) + 1;
        }
        return 1L;
    }

    private final PackageInfo getPackageInfo(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "getPackageInfo(...)");
            return packageInfo;
        }
        PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
        Intrinsics.checkNotNullExpressionValue(packageInfoFlagsOf, "of(...)");
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, packageInfoFlagsOf);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "getPackageInfo(...)");
        return packageInfo2;
    }

    private final String getReferenceProfilePath(String packageName) {
        return g.e("/data/misc/profiles/ref/", packageName, "/primary.prof");
    }

    private final ArtProfileFileMetadata getUnavailableProfileMetadata(int errno) {
        if (errno == OsConstants.ENOENT) {
            return new ArtProfileFileMetadata("MISSING", null, null);
        }
        return (errno == OsConstants.EACCES || errno == OsConstants.EPERM) ? getInaccessibleProfileMetadata() : new ArtProfileFileMetadata("ERROR", null, null);
    }

    private final boolean isSamePackageUpdate(SharedPreferences preferences, long lastUpdateTimeMs) {
        return preferences.contains(KEY_PACKAGE_LAST_UPDATE_TIME_MS) && preferences.getLong(KEY_PACKAGE_LAST_UPDATE_TIME_MS, 0L) == lastUpdateTimeMs;
    }

    private final String lastModifiedKey(String prefix) {
        return b.j(prefix, "_last_modified_ms");
    }

    private final void persistObservation(SharedPreferences preferences, long packageLastUpdateTimeMs, AndroidArtProfileTelemetry telemetry) {
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putLong(KEY_PACKAGE_LAST_UPDATE_TIME_MS, packageLastUpdateTimeMs);
        editorEdit.putLong(KEY_LAUNCH_INDEX, telemetry.getLaunchIndexSincePackageUpdate());
        ArtProfileTelemetry artProfileTelemetry = INSTANCE;
        artProfileTelemetry.putProfileMetadata(editorEdit, REFERENCE_PROFILE_PREFIX, telemetry.getReferenceProfile());
        artProfileTelemetry.putProfileMetadata(editorEdit, CURRENT_PROFILE_PREFIX, telemetry.getCurrentProfile());
        editorEdit.apply();
    }

    private final boolean profileChanged(SharedPreferences preferences, ArtProfileFileMetadata referenceProfile, ArtProfileFileMetadata currentProfile) {
        return profileChanged(preferences, REFERENCE_PROFILE_PREFIX, referenceProfile) || profileChanged(preferences, CURRENT_PROFILE_PREFIX, currentProfile);
    }

    private final void putProfileMetadata(SharedPreferences.Editor editor, String str, ArtProfileFileMetadata artProfileFileMetadata) {
        editor.putString(statusKey(str), artProfileFileMetadata.getStatus());
        ArtProfileTelemetryKt.putNullableLong(editor, sizeKey(str), artProfileFileMetadata.getSizeBytes());
        ArtProfileTelemetryKt.putNullableLong(editor, lastModifiedKey(str), artProfileFileMetadata.getLastModifiedMs());
    }

    private final ArtProfileFileMetadata readProfileMetadata(String path) {
        try {
            StructStat structStatStat = Os.stat(path);
            return new ArtProfileFileMetadata("READABLE", Long.valueOf(structStatStat.st_size), Long.valueOf(structStatStat.st_mtime * 1000));
        } catch (ErrnoException e10) {
            return getUnavailableProfileMetadata(e10.errno);
        } catch (SecurityException unused) {
            return getInaccessibleProfileMetadata();
        }
    }

    private final String sizeKey(String prefix) {
        return b.j(prefix, "_size_bytes");
    }

    private final String statusKey(String prefix) {
        return b.j(prefix, "_status");
    }

    @NotNull
    public final AndroidArtProfileTelemetry collect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AndroidArtProfileTelemetry androidArtProfileTelemetry = cachedTelemetry;
        if (androidArtProfileTelemetry != null) {
            return androidArtProfileTelemetry;
        }
        synchronized (lock) {
            AndroidArtProfileTelemetry androidArtProfileTelemetry2 = cachedTelemetry;
            if (androidArtProfileTelemetry2 != null) {
                return androidArtProfileTelemetry2;
            }
            ArtProfileTelemetry artProfileTelemetry = INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            AndroidArtProfileTelemetry androidArtProfileTelemetryCollectUncached = artProfileTelemetry.collectUncached(applicationContext);
            cachedTelemetry = androidArtProfileTelemetryCollectUncached;
            return androidArtProfileTelemetryCollectUncached;
        }
    }

    private final boolean profileChanged(SharedPreferences preferences, String prefix, ArtProfileFileMetadata profile) {
        if (Intrinsics.areEqual(preferences.getString(statusKey(prefix), null), profile.getStatus()) && Intrinsics.areEqual(ArtProfileTelemetryKt.getNullableLong(preferences, sizeKey(prefix)), profile.getSizeBytes())) {
            return !Intrinsics.areEqual(ArtProfileTelemetryKt.getNullableLong(preferences, lastModifiedKey(prefix)), profile.getLastModifiedMs());
        }
        return true;
    }
}
