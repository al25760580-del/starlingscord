package com.discord.tti_manager;

import android.content.SharedPreferences;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010\n\u001a#\u0010\u0006\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"getNullableLong", "", "Landroid/content/SharedPreferences;", "key", "", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Long;", "putNullableLong", "", "Landroid/content/SharedPreferences$Editor;", "value", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/facebook/react/bridge/WritableMap;", "(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Long;)V", "tti_manager_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ArtProfileTelemetryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getNullableLong(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains(str)) {
            return Long.valueOf(sharedPreferences.getLong(str, 0L));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putNullableLong(SharedPreferences.Editor editor, String str, Long l6) {
        if (l6 == null) {
            editor.remove(str);
        } else {
            editor.putLong(str, l6.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putNullableLong(WritableMap writableMap, String str, Long l6) {
        if (l6 == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putLong(str, l6.longValue());
        }
    }
}
