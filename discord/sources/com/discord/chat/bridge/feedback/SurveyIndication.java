package com.discord.chat.bridge.feedback;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/discord/chat/bridge/feedback/SurveyIndication;", "", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "feedbackIconUrl", "", "<init>", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getFeedbackIconUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SurveyIndication {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final StructurableText content;

    @NotNull
    private final String feedbackIconUrl;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/feedback/SurveyIndication$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SurveyIndication$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SurveyIndication(int i7, StructurableText structurableText, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i7 & 3)) {
            e1.l(i7, 3, SurveyIndication$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.content = structurableText;
        this.feedbackIconUrl = str;
    }

    public static /* synthetic */ SurveyIndication copy$default(SurveyIndication surveyIndication, StructurableText structurableText, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            structurableText = surveyIndication.content;
        }
        if ((i7 & 2) != 0) {
            str = surveyIndication.feedbackIconUrl;
        }
        return surveyIndication.copy(structurableText, str);
    }

    public static final /* synthetic */ void write$Self$chat_release(SurveyIndication self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, StructurableTextSerializer.INSTANCE, self.content);
        output.q(serialDesc, 1, self.feedbackIconUrl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StructurableText getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeedbackIconUrl() {
        return this.feedbackIconUrl;
    }

    @NotNull
    public final SurveyIndication copy(@NotNull StructurableText content, @NotNull String feedbackIconUrl) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(feedbackIconUrl, "feedbackIconUrl");
        return new SurveyIndication(content, feedbackIconUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyIndication)) {
            return false;
        }
        SurveyIndication surveyIndication = (SurveyIndication) other;
        return Intrinsics.areEqual(this.content, surveyIndication.content) && Intrinsics.areEqual(this.feedbackIconUrl, surveyIndication.feedbackIconUrl);
    }

    @NotNull
    public final StructurableText getContent() {
        return this.content;
    }

    @NotNull
    public final String getFeedbackIconUrl() {
        return this.feedbackIconUrl;
    }

    public int hashCode() {
        return this.feedbackIconUrl.hashCode() + (this.content.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SurveyIndication(content=" + this.content + ", feedbackIconUrl=" + this.feedbackIconUrl + ")";
    }

    public SurveyIndication(@NotNull StructurableText content, @NotNull String feedbackIconUrl) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(feedbackIconUrl, "feedbackIconUrl");
        this.content = content;
        this.feedbackIconUrl = feedbackIconUrl;
    }
}
