package com.discord.jank_stats;

import com.facebook.react.animated.InterpolationAnimatedNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/jank_stats/RecordJson;", "", "<init>", "()V", "encodeRecord", "", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "Lcom/discord/jank_stats/JankRecordStore$SessionIdentity;", RecordJson.FIELD_TOTAL_FRAMES, "", RecordJson.FIELD_JANK_FRAMES, "decodeRecord", "Lcom/discord/jank_stats/JankRecordStore$PendingRecord;", "text", "FIELD_SESSION_ID", "FIELD_SESSION_START_WALL_MS", "FIELD_APP_VERSION_CODE", "FIELD_RELEASE_CHANNEL", "FIELD_TOTAL_FRAMES", "FIELD_JANK_FRAMES", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJankRecordStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JankRecordStore.kt\ncom/discord/jank_stats/RecordJson\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
final class RecordJson {

    @NotNull
    private static final String FIELD_APP_VERSION_CODE = "appVersionCode";

    @NotNull
    private static final String FIELD_JANK_FRAMES = "jankFrames";

    @NotNull
    private static final String FIELD_RELEASE_CHANNEL = "releaseChannel";

    @NotNull
    private static final String FIELD_SESSION_ID = "sessionId";

    @NotNull
    private static final String FIELD_SESSION_START_WALL_MS = "sessionStartWallMs";

    @NotNull
    private static final String FIELD_TOTAL_FRAMES = "totalFrames";

    @NotNull
    public static final RecordJson INSTANCE = new RecordJson();

    private RecordJson() {
    }

    public final JankRecordStore.PendingRecord decodeRecord(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            JSONObject jSONObject = new JSONObject(text);
            String strOptString = jSONObject.optString(FIELD_SESSION_ID);
            Intrinsics.checkNotNull(strOptString);
            String str = strOptString.length() > 0 ? strOptString : null;
            if (str == null) {
                return null;
            }
            long jOptLong = jSONObject.optLong(FIELD_SESSION_START_WALL_MS);
            int iOptInt = jSONObject.optInt(FIELD_APP_VERSION_CODE);
            String strOptString2 = jSONObject.optString(FIELD_RELEASE_CHANNEL);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            return new JankRecordStore.PendingRecord(str, jOptLong, iOptInt, strOptString2, jSONObject.optLong(FIELD_TOTAL_FRAMES), jSONObject.optLong(FIELD_JANK_FRAMES));
        } catch (JSONException unused) {
            return null;
        }
    }

    @NotNull
    public final String encodeRecord(@NotNull JankRecordStore.SessionIdentity identity, long totalFrames, long jankFrames) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        String string = new JSONObject().put(FIELD_SESSION_ID, identity.getSessionId()).put(FIELD_SESSION_START_WALL_MS, identity.getSessionStartWallMs()).put(FIELD_APP_VERSION_CODE, identity.getAppVersionCode()).put(FIELD_RELEASE_CHANNEL, identity.getReleaseChannel()).put(FIELD_TOTAL_FRAMES, totalFrames).put(FIELD_JANK_FRAMES, jankFrames).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
