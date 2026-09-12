package com.discord.shortcuts;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.h1;
import kotlin.collections.m0;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import sn.e;
import sn.i;
import xq.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/shortcuts/ShortcutData;", "", "tag", "", "data", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getTag", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "shortcuts_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ShortcutData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_DATA = "discord_shortcut_data";

    @NotNull
    private static final String KEY_SHORTCUT = "discord_shortcut";

    @NotNull
    private static final String KEY_TAG = "discord_shortcut_tag";

    @NotNull
    private final Map<String, String> data;

    @NotNull
    private final String tag;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000eJ\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0005R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/shortcuts/ShortcutData$Companion;", "", "<init>", "()V", "createShortcutIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "", "clazz", "Ljava/lang/Class;", "tag", "data", "", "getShortcutIntentData", "Lcom/discord/shortcuts/ShortcutData;", "KEY_SHORTCUT", "KEY_TAG", "KEY_DATA", "shortcuts_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nShortcutData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutData.kt\ncom/discord/shortcuts/ShortcutData$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,60:1\n216#2,2:61\n37#3:63\n36#3,3:64\n1321#4,2:67\n*S KotlinDebug\n*F\n+ 1 ShortcutData.kt\ncom/discord/shortcuts/ShortcutData$Companion\n*L\n31#1:61,2\n37#1:63\n37#1:64,3\n48#1:67,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createShortcutIntent(@NotNull Context context, @NotNull String action, @NotNull Class<?> clazz, @NotNull String tag, @NotNull Map<String, String> data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(data, "data");
            Intent intentPutExtra = new Intent(action, null, context, clazz).putExtra(ShortcutData.KEY_SHORTCUT, true).putExtra(ShortcutData.KEY_TAG, tag);
            e eVarB = c0.b();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value != null) {
                    eVarB.add(key);
                    eVarB.add(value);
                }
            }
            Unit unit = Unit.f14616a;
            Intent intentPutExtra2 = intentPutExtra.putExtra(ShortcutData.KEY_DATA, (String[]) c0.a(eVarB).toArray(new String[0]));
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
            return intentPutExtra2;
        }

        public final ShortcutData getShortcutIntentData(@NotNull Intent intent) {
            Sequence sequenceO;
            Intrinsics.checkNotNullParameter(intent, "<this>");
            if (!intent.hasExtra(ShortcutData.KEY_SHORTCUT)) {
                return null;
            }
            String stringExtra = intent.getStringExtra(ShortcutData.KEY_TAG);
            if (stringExtra == null) {
                stringExtra = "";
            }
            i builder = new i();
            String[] stringArrayExtra = intent.getStringArrayExtra(ShortcutData.KEY_DATA);
            if (stringArrayExtra != null && (sequenceO = y.o(stringArrayExtra)) != null) {
                Intrinsics.checkNotNullParameter(sequenceO, "<this>");
                Intrinsics.checkNotNullParameter(sequenceO, "<this>");
                Intrinsics.checkNotNullParameter(sequenceO, "<this>");
                Iterator iterator = sequenceO.iterator();
                Intrinsics.checkNotNullParameter(iterator, "iterator");
                Iterator itA = !iterator.hasNext() ? m0.f14658d : l.a(new h1(iterator, null));
                while (itA.hasNext()) {
                    List list = (List) itA.next();
                    String str = (String) list.get(0);
                    String str2 = (String) list.get(1);
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(str2);
                    builder.put(str, str2);
                }
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ShortcutData(stringExtra, builder.b());
        }

        private Companion() {
        }
    }

    public ShortcutData(@NotNull String tag, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        this.tag = tag;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShortcutData copy$default(ShortcutData shortcutData, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = shortcutData.tag;
        }
        if ((i7 & 2) != 0) {
            map = shortcutData.data;
        }
        return shortcutData.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.data;
    }

    @NotNull
    public final ShortcutData copy(@NotNull String tag, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        return new ShortcutData(tag, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutData)) {
            return false;
        }
        ShortcutData shortcutData = (ShortcutData) other;
        return Intrinsics.areEqual(this.tag, shortcutData.tag) && Intrinsics.areEqual(this.data, shortcutData.data);
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.tag.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ShortcutData(tag=" + this.tag + ", data=" + this.data + ")";
    }
}
