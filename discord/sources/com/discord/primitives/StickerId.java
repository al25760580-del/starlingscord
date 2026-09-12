package com.discord.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.discord.snowflake.SnowflakePrimitive;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kr.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001d\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006%"}, d2 = {"Lcom/discord/primitives/StickerId;", "Lcom/discord/snowflake/SnowflakePrimitive;", "snowflake", "", "Lcom/discord/snowflake/Snowflake;", "constructor-impl", "(J)J", "getSnowflake", "()J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "isValid", "", "isValid-impl", "(J)Z", "describeContents", "", "describeContents-impl", "(J)I", "equals", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(JLandroid/os/Parcel;I)V", "$serializer", "Companion", "primitives_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StickerId implements SnowflakePrimitive {
    private final long snowflake;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<StickerId> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/primitives/StickerId$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/primitives/StickerId;", "primitives_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return StickerId$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StickerId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ StickerId createFromParcel(Parcel parcel) {
            return StickerId.m1195boximpl(m1207createFromParcelaEuejx8(parcel));
        }

        /* JADX INFO: renamed from: createFromParcel-aEuejx8, reason: not valid java name */
        public final long m1207createFromParcelaEuejx8(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return StickerId.m1196constructorimpl(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerId[] newArray(int i7) {
            return new StickerId[i7];
        }
    }

    private /* synthetic */ StickerId(long j) {
        this.snowflake = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StickerId m1195boximpl(long j) {
        return new StickerId(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1196constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: describeContents-impl, reason: not valid java name */
    public static final int m1197describeContentsimpl(long j) {
        return 0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1198equalsimpl(long j, Object obj) {
        return (obj instanceof StickerId) && j == ((StickerId) obj).m1204unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1199equalsimpl0(long j, long j5) {
        return j == j5;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1200hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isValid-impl, reason: not valid java name */
    public static boolean m1201isValidimpl(long j) {
        return j > 0;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1202toStringimpl(long j) {
        return String.valueOf(j);
    }

    /* JADX INFO: renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m1203writeToParcelimpl(long j, @NotNull Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m1197describeContentsimpl(this.snowflake);
    }

    public boolean equals(Object obj) {
        return m1198equalsimpl(this.snowflake, obj);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public long getSnowflake() {
        return this.snowflake;
    }

    public int hashCode() {
        return m1200hashCodeimpl(this.snowflake);
    }

    @Override // com.discord.snowflake.SnowflakePrimitive
    public boolean isValid() {
        return m1201isValidimpl(this.snowflake);
    }

    @NotNull
    public String toString() {
        return m1202toStringimpl(this.snowflake);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1204unboximpl() {
        return this.snowflake;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        m1203writeToParcelimpl(this.snowflake, dest, i7);
    }
}
