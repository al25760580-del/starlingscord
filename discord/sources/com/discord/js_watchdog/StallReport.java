package com.discord.js_watchdog;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006&"}, d2 = {"Lcom/discord/js_watchdog/StallReport;", "Lcom/discord/reactevents/ReactEvent;", "stallTime", "", "sessionId", "", SharedPreferencesKey.TRACE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStallTime", "()I", "getSessionId", "()Ljava/lang/String;", "getTrace", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$js_watchdog_release", "$serializer", "Companion", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StallReport implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String sessionId;
    private final int stallTime;
    private final String trace;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/js_watchdog/StallReport$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/js_watchdog/StallReport;", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return StallReport$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StallReport(int i7, int i10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, StallReport$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stallTime = i10;
        this.sessionId = str;
        this.trace = str2;
    }

    public static /* synthetic */ StallReport copy$default(StallReport stallReport, int i7, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = stallReport.stallTime;
        }
        if ((i10 & 2) != 0) {
            str = stallReport.sessionId;
        }
        if ((i10 & 4) != 0) {
            str2 = stallReport.trace;
        }
        return stallReport.copy(i7, str, str2);
    }

    public static final /* synthetic */ void write$Self$js_watchdog_release(StallReport self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.l(0, self.stallTime, serialDesc);
        output.q(serialDesc, 1, self.sessionId);
        output.r(serialDesc, 2, s1.f17602a, self.trace);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStallTime() {
        return this.stallTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrace() {
        return this.trace;
    }

    @NotNull
    public final StallReport copy(int stallTime, @NotNull String sessionId, String trace) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new StallReport(stallTime, sessionId, trace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StallReport)) {
            return false;
        }
        StallReport stallReport = (StallReport) other;
        return this.stallTime == stallReport.stallTime && Intrinsics.areEqual(this.sessionId, stallReport.sessionId) && Intrinsics.areEqual(this.trace, stallReport.trace);
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getStallTime() {
        return this.stallTime;
    }

    public final String getTrace() {
        return this.trace;
    }

    public int hashCode() {
        int iD = e.d(Integer.hashCode(this.stallTime) * 31, 31, this.sessionId);
        String str = this.trace;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    @NotNull
    public String toString() {
        int i7 = this.stallTime;
        String str = this.sessionId;
        return a.k(a.o("StallReport(stallTime=", ", sessionId=", str, i7, ", trace="), this.trace, ")");
    }

    public StallReport(int i7, @NotNull String sessionId, String str) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.stallTime = i7;
        this.sessionId = sessionId;
        this.trace = str;
    }
}
