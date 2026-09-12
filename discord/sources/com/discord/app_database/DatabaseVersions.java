package com.discord.app_database;

import com.discord.sticker.sticker_types.c;
import i5.a;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.m1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002&'B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J.\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/discord/app_database/DatabaseVersions;", "", "guildVersions", "", "Lcom/discord/app_database/GuildVersion;", "nonGuildVersions", "Lcom/discord/app_database/NonGuildVersion;", "<init>", "([Lcom/discord/app_database/GuildVersion;[Lcom/discord/app_database/NonGuildVersion;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lcom/discord/app_database/GuildVersion;[Lcom/discord/app_database/NonGuildVersion;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getGuildVersions", "()[Lcom/discord/app_database/GuildVersion;", "[Lcom/discord/app_database/GuildVersion;", "getNonGuildVersions", "()[Lcom/discord/app_database/NonGuildVersion;", "[Lcom/discord/app_database/NonGuildVersion;", "component1", "component2", "copy", "([Lcom/discord/app_database/GuildVersion;[Lcom/discord/app_database/NonGuildVersion;)Lcom/discord/app_database/DatabaseVersions;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_database_release", "Companion", "$serializer", "app_database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DatabaseVersions {

    @NotNull
    private static final Lazy[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final DatabaseVersions EMPTY;

    @NotNull
    private final GuildVersion[] guildVersions;

    @NotNull
    private final NonGuildVersion[] nonGuildVersions;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/discord/app_database/DatabaseVersions$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/discord/app_database/DatabaseVersions;", "getEMPTY", "()Lcom/discord/app_database/DatabaseVersions;", "serializer", "Lkotlinx/serialization/KSerializer;", "app_database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DatabaseVersions getEMPTY() {
            return DatabaseVersions.EMPTY;
        }

        @NotNull
        public final KSerializer serializer() {
            return DatabaseVersions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        m mVar = m.f19486e;
        $childSerializers = new Lazy[]{l.a(mVar, new c(29)), l.a(mVar, new a(0))};
        EMPTY = new DatabaseVersions(new GuildVersion[0], new NonGuildVersion[0]);
    }

    public /* synthetic */ DatabaseVersions(int i7, GuildVersion[] guildVersionArr, NonGuildVersion[] nonGuildVersionArr, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, DatabaseVersions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.guildVersions = guildVersionArr;
        this.nonGuildVersions = nonGuildVersionArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new m1(Reflection.getOrCreateKotlinClass(GuildVersion.class), GuildVersion$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new m1(Reflection.getOrCreateKotlinClass(NonGuildVersion.class), NonGuildVersion$$serializer.INSTANCE);
    }

    public static /* synthetic */ DatabaseVersions copy$default(DatabaseVersions databaseVersions, GuildVersion[] guildVersionArr, NonGuildVersion[] nonGuildVersionArr, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            guildVersionArr = databaseVersions.guildVersions;
        }
        if ((i7 & 2) != 0) {
            nonGuildVersionArr = databaseVersions.nonGuildVersions;
        }
        return databaseVersions.copy(guildVersionArr, nonGuildVersionArr);
    }

    public static final /* synthetic */ void write$Self$app_database_release(DatabaseVersions self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.g(serialDesc, 0, (KSerializer) lazyArr[0].getValue(), self.guildVersions);
        output.g(serialDesc, 1, (KSerializer) lazyArr[1].getValue(), self.nonGuildVersions);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GuildVersion[] getGuildVersions() {
        return this.guildVersions;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NonGuildVersion[] getNonGuildVersions() {
        return this.nonGuildVersions;
    }

    @NotNull
    public final DatabaseVersions copy(@NotNull GuildVersion[] guildVersions, @NotNull NonGuildVersion[] nonGuildVersions) {
        Intrinsics.checkNotNullParameter(guildVersions, "guildVersions");
        Intrinsics.checkNotNullParameter(nonGuildVersions, "nonGuildVersions");
        return new DatabaseVersions(guildVersions, nonGuildVersions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatabaseVersions)) {
            return false;
        }
        DatabaseVersions databaseVersions = (DatabaseVersions) other;
        return Intrinsics.areEqual(this.guildVersions, databaseVersions.guildVersions) && Intrinsics.areEqual(this.nonGuildVersions, databaseVersions.nonGuildVersions);
    }

    @NotNull
    public final GuildVersion[] getGuildVersions() {
        return this.guildVersions;
    }

    @NotNull
    public final NonGuildVersion[] getNonGuildVersions() {
        return this.nonGuildVersions;
    }

    public int hashCode() {
        return Arrays.hashCode(this.nonGuildVersions) + (Arrays.hashCode(this.guildVersions) * 31);
    }

    @NotNull
    public String toString() {
        return g.f("DatabaseVersions(guildVersions=", Arrays.toString(this.guildVersions), ", nonGuildVersions=", Arrays.toString(this.nonGuildVersions), ")");
    }

    public DatabaseVersions(@NotNull GuildVersion[] guildVersions, @NotNull NonGuildVersion[] nonGuildVersions) {
        Intrinsics.checkNotNullParameter(guildVersions, "guildVersions");
        Intrinsics.checkNotNullParameter(nonGuildVersions, "nonGuildVersions");
        this.guildVersions = guildVersions;
        this.nonGuildVersions = nonGuildVersions;
    }
}
