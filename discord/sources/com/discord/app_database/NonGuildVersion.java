package com.discord.app_database;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, d2 = {"Lcom/discord/app_database/NonGuildVersion;", "", StackTraceHelper.ID_KEY, "", "version", "", "versionString", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getVersion", "()J", "getVersionString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_database_release", "$serializer", "Companion", "app_database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NonGuildVersion {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String id;
    private final long version;
    private final String versionString;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/app_database/NonGuildVersion$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/app_database/NonGuildVersion;", "app_database_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return NonGuildVersion$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ NonGuildVersion(int i7, String str, long j, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, NonGuildVersion$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i7 & 2) == 0) {
            this.version = 0L;
        } else {
            this.version = j;
        }
        if ((i7 & 4) == 0) {
            this.versionString = null;
        } else {
            this.versionString = str2;
        }
    }

    public static /* synthetic */ NonGuildVersion copy$default(NonGuildVersion nonGuildVersion, String str, long j, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = nonGuildVersion.id;
        }
        if ((i7 & 2) != 0) {
            j = nonGuildVersion.version;
        }
        if ((i7 & 4) != 0) {
            str2 = nonGuildVersion.versionString;
        }
        return nonGuildVersion.copy(str, j, str2);
    }

    public static final /* synthetic */ void write$Self$app_database_release(NonGuildVersion self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        if (output.u(serialDesc, 1) || self.version != 0) {
            output.C(serialDesc, 1, self.version);
        }
        if (!output.u(serialDesc, 2) && self.versionString == null) {
            return;
        }
        output.r(serialDesc, 2, s1.f17602a, self.versionString);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersionString() {
        return this.versionString;
    }

    @NotNull
    public final NonGuildVersion copy(@NotNull String id2, long version, String versionString) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new NonGuildVersion(id2, version, versionString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonGuildVersion)) {
            return false;
        }
        NonGuildVersion nonGuildVersion = (NonGuildVersion) other;
        return Intrinsics.areEqual(this.id, nonGuildVersion.id) && this.version == nonGuildVersion.version && Intrinsics.areEqual(this.versionString, nonGuildVersion.versionString);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getVersionString() {
        return this.versionString;
    }

    public int hashCode() {
        int iH = a.h(this.version, this.id.hashCode() * 31, 31);
        String str = this.versionString;
        return iH + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        long j = this.version;
        String str2 = this.versionString;
        StringBuilder sb2 = new StringBuilder("NonGuildVersion(id=");
        sb2.append(str);
        sb2.append(", version=");
        sb2.append(j);
        return e.o(sb2, ", versionString=", str2, ")");
    }

    public NonGuildVersion(@NotNull String id2, long j, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.version = j;
        this.versionString = str;
    }

    public /* synthetic */ NonGuildVersion(String str, long j, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0L : j, (i7 & 4) != 0 ? null : str2);
    }
}
