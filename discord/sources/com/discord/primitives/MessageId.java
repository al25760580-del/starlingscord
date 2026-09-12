package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.discord.snowflake.SnowflakeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001d\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006#"}, d2 = {"Lcom/discord/primitives/MessageId;", "Landroid/os/Parcelable;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "toSnowflake", "Lcom/discord/primitives/MessageIdSnowflake;", "toSnowflake-wDbSO-A", "(Ljava/lang/String;)Lcom/discord/primitives/MessageIdSnowflake;", "describeContents", "", "describeContents-impl", "(Ljava/lang/String;)I", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageId implements Parcelable {

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<MessageId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/primitives/MessageId$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/MessageId;", "primitives_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessageId$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MessageId createFromParcel(Parcel parcel) {
            return MessageId.m1156boximpl(m1168createFromParcelMpY7Jxs(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-MpY7Jxs, reason: not valid java name */
        public final String m1168createFromParcelMpY7Jxs(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return MessageId.m1157constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageId[] newArray(int i7) {
            return new MessageId[i7];
        }
    }

    private /* synthetic */ MessageId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MessageId m1156boximpl(String str) {
        return new MessageId(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m1157constructorimpl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: describeContents-impl, reason: not valid java name */
    public static final int m1158describeContentsimpl(String str) {
        return 0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1159equalsimpl(String str, Object obj) {
        return (obj instanceof MessageId) && Intrinsics.areEqual(str, ((MessageId) obj).m1165unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1160equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1161hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toSnowflake-wDbSO-A, reason: not valid java name */
    public static final MessageIdSnowflake m1162toSnowflakewDbSOA(String str) {
        Long snowflake = SnowflakeUtils.INSTANCE.toSnowflake(str);
        if (snowflake != null) {
            return MessageIdSnowflake.m1169boximpl(MessageIdSnowflake.m1170constructorimpl(snowflake.longValue()));
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1163toStringimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m1164writeToParcelimpl(String str, @NotNull Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m1158describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m1159equalsimpl(this.value, obj);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1161hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m1163toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1165unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        m1164writeToParcelimpl(this.value, dest, i7);
    }
}
