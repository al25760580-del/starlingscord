package com.discord.crash_reporting;

import a3.e;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0010H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/discord/crash_reporting/CrashPersistence;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cache", "Landroid/content/SharedPreferences;", "getCache", "()Landroid/content/SharedPreferences;", "isStaff", "", "setStaff", "", "setLastCrashInfo", "info", "Lcom/discord/crash_reporting/CrashPersistence$LastCrashInfo;", "getLastCrashInfo", "markCrashHandled", CrashPersistence.FIELD_EVENT_ID, "", "toJson", "LastCrashInfo", "Companion", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrashPersistence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashPersistence.kt\ncom/discord/crash_reporting/CrashPersistence\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,116:1\n40#2,13:117\n45#2,8:130\n*S KotlinDebug\n*F\n+ 1 CrashPersistence.kt\ncom/discord/crash_reporting/CrashPersistence\n*L\n27#1:117,13\n33#1:130,8\n*E\n"})
public final class CrashPersistence {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FIELD_ERROR_MESSAGE = "errorMessage";

    @NotNull
    private static final String FIELD_ERROR_STACK = "errorStack";

    @NotNull
    private static final String FIELD_EVENT_ID = "eventId";

    @NotNull
    private static final String FIELD_IS_NATIVE = "isNative";

    @NotNull
    private static final String FIELD_LEVEL = "level";

    @NotNull
    private static final String FIELD_ORIGIN = "origin";

    @NotNull
    private static final String FIELD_TIMESTAMP_MS = "timestampMs";

    @NotNull
    private static final String KEY_LAST_CRASH_INFO = "lastCrashInfo";
    private static CrashPersistence instance;

    @NotNull
    private final SharedPreferences cache;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/crash_reporting/CrashPersistence$Companion;", "", "<init>", "()V", "instance", "Lcom/discord/crash_reporting/CrashPersistence;", "KEY_LAST_CRASH_INFO", "", "FIELD_EVENT_ID", "FIELD_TIMESTAMP_MS", "FIELD_ORIGIN", "FIELD_IS_NATIVE", "FIELD_ERROR_MESSAGE", "FIELD_ERROR_STACK", "FIELD_LEVEL", "getInstance", "context", "Landroid/content/Context;", "getNullableString", "Lorg/json/JSONObject;", "key", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getNullableString(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        @NotNull
        public final CrashPersistence getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CrashPersistence.instance == null) {
                CrashPersistence.instance = new CrashPersistence(context);
            }
            CrashPersistence crashPersistence = CrashPersistence.instance;
            Intrinsics.checkNotNull(crashPersistence);
            return crashPersistence;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006$"}, d2 = {"Lcom/discord/crash_reporting/CrashPersistence$LastCrashInfo;", "", CrashPersistence.FIELD_EVENT_ID, "", CrashPersistence.FIELD_TIMESTAMP_MS, "", CrashPersistence.FIELD_ORIGIN, CrashPersistence.FIELD_IS_NATIVE, "", CrashPersistence.FIELD_ERROR_MESSAGE, CrashPersistence.FIELD_ERROR_STACK, CrashPersistence.FIELD_LEVEL, "<init>", "(Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getTimestampMs", "()J", "getOrigin", "()Z", "getErrorMessage", "getErrorStack", "getLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LastCrashInfo {
        private final String errorMessage;
        private final String errorStack;

        @NotNull
        private final String eventId;
        private final boolean isNative;
        private final String level;
        private final String origin;
        private final long timestampMs;

        public LastCrashInfo(@NotNull String eventId, long j, String str, boolean z5, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.eventId = eventId;
            this.timestampMs = j;
            this.origin = str;
            this.isNative = z5;
            this.errorMessage = str2;
            this.errorStack = str3;
            this.level = str4;
        }

        public static /* synthetic */ LastCrashInfo copy$default(LastCrashInfo lastCrashInfo, String str, long j, String str2, boolean z5, String str3, String str4, String str5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = lastCrashInfo.eventId;
            }
            if ((i7 & 2) != 0) {
                j = lastCrashInfo.timestampMs;
            }
            if ((i7 & 4) != 0) {
                str2 = lastCrashInfo.origin;
            }
            if ((i7 & 8) != 0) {
                z5 = lastCrashInfo.isNative;
            }
            if ((i7 & 16) != 0) {
                str3 = lastCrashInfo.errorMessage;
            }
            if ((i7 & 32) != 0) {
                str4 = lastCrashInfo.errorStack;
            }
            if ((i7 & 64) != 0) {
                str5 = lastCrashInfo.level;
            }
            String str6 = str5;
            String str7 = str3;
            String str8 = str2;
            return lastCrashInfo.copy(str, j, str8, z5, str7, str4, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOrigin() {
            return this.origin;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsNative() {
            return this.isNative;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getErrorStack() {
            return this.errorStack;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        @NotNull
        public final LastCrashInfo copy(@NotNull String eventId, long timestampMs, String origin, boolean isNative, String errorMessage, String errorStack, String level) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new LastCrashInfo(eventId, timestampMs, origin, isNative, errorMessage, errorStack, level);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastCrashInfo)) {
                return false;
            }
            LastCrashInfo lastCrashInfo = (LastCrashInfo) other;
            return Intrinsics.areEqual(this.eventId, lastCrashInfo.eventId) && this.timestampMs == lastCrashInfo.timestampMs && Intrinsics.areEqual(this.origin, lastCrashInfo.origin) && this.isNative == lastCrashInfo.isNative && Intrinsics.areEqual(this.errorMessage, lastCrashInfo.errorMessage) && Intrinsics.areEqual(this.errorStack, lastCrashInfo.errorStack) && Intrinsics.areEqual(this.level, lastCrashInfo.level);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getErrorStack() {
            return this.errorStack;
        }

        @NotNull
        public final String getEventId() {
            return this.eventId;
        }

        public final String getLevel() {
            return this.level;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            int iH = com.discord.chat.presentation.list.a.h(this.timestampMs, this.eventId.hashCode() * 31, 31);
            String str = this.origin;
            int iG = com.discord.chat.presentation.list.a.g((iH + (str == null ? 0 : str.hashCode())) * 31, 31, this.isNative);
            String str2 = this.errorMessage;
            int iHashCode = (iG + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorStack;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.level;
            return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean isNative() {
            return this.isNative;
        }

        @NotNull
        public String toString() {
            String str = this.eventId;
            long j = this.timestampMs;
            String str2 = this.origin;
            boolean z5 = this.isNative;
            String str3 = this.errorMessage;
            String str4 = this.errorStack;
            String str5 = this.level;
            StringBuilder sb2 = new StringBuilder("LastCrashInfo(eventId=");
            sb2.append(str);
            sb2.append(", timestampMs=");
            sb2.append(j);
            sb2.append(", origin=");
            sb2.append(str2);
            sb2.append(", isNative=");
            sb2.append(z5);
            e.A(sb2, ", errorMessage=", str3, ", errorStack=", str4);
            return e.o(sb2, ", level=", str5, ")");
        }
    }

    public CrashPersistence(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("crash_reporting", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.cache = sharedPreferences;
    }

    private final String toJson(LastCrashInfo lastCrashInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FIELD_EVENT_ID, lastCrashInfo.getEventId());
        jSONObject.put(FIELD_TIMESTAMP_MS, lastCrashInfo.getTimestampMs());
        jSONObject.put(FIELD_IS_NATIVE, lastCrashInfo.isNative());
        if (lastCrashInfo.getErrorMessage() != null) {
            jSONObject.put(FIELD_ERROR_MESSAGE, lastCrashInfo.getErrorMessage());
        }
        if (lastCrashInfo.getErrorStack() != null) {
            jSONObject.put(FIELD_ERROR_STACK, lastCrashInfo.getErrorStack());
        }
        if (lastCrashInfo.getLevel() != null) {
            jSONObject.put(FIELD_LEVEL, lastCrashInfo.getLevel());
        }
        if (lastCrashInfo.getOrigin() != null) {
            jSONObject.put(FIELD_ORIGIN, lastCrashInfo.getOrigin());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final SharedPreferences getCache() {
        return this.cache;
    }

    public final LastCrashInfo getLastCrashInfo() {
        String string = this.cache.getString(KEY_LAST_CRASH_INFO, null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            String string2 = jSONObject.getString(FIELD_EVENT_ID);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            long j = jSONObject.getLong(FIELD_TIMESTAMP_MS);
            Companion companion = INSTANCE;
            return new LastCrashInfo(string2, j, companion.getNullableString(jSONObject, FIELD_ORIGIN), jSONObject.optBoolean(FIELD_IS_NATIVE, false), companion.getNullableString(jSONObject, FIELD_ERROR_MESSAGE), companion.getNullableString(jSONObject, FIELD_ERROR_STACK), companion.getNullableString(jSONObject, FIELD_LEVEL));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean isStaff() {
        return this.cache.getBoolean("staff", false);
    }

    public final void markCrashHandled(@NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        LastCrashInfo lastCrashInfo = getLastCrashInfo();
        if (lastCrashInfo != null && Intrinsics.areEqual(lastCrashInfo.getEventId(), eventId)) {
            setLastCrashInfo(null);
        }
    }

    public final void setLastCrashInfo(LastCrashInfo info) {
        SharedPreferences.Editor editorEdit = this.cache.edit();
        if (info == null) {
            editorEdit.remove(KEY_LAST_CRASH_INFO);
        } else {
            editorEdit.putString(KEY_LAST_CRASH_INFO, toJson(info));
        }
        editorEdit.commit();
    }

    public final void setStaff(boolean isStaff) {
        SharedPreferences.Editor editorEdit = this.cache.edit();
        editorEdit.putBoolean("staff", isStaff);
        editorEdit.apply();
    }
}
