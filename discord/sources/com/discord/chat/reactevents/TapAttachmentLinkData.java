package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.s1;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006!"}, d2 = {"Lcom/discord/chat/reactevents/TapAttachmentLinkData;", "Lcom/discord/reactevents/ReactEvent;", "attachmentUrl", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAttachmentUrl", "()Ljava/lang/String;", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TapAttachmentLinkData implements ReactEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String attachmentUrl;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/reactevents/TapAttachmentLinkData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapAttachmentLinkData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TapAttachmentLinkData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TapAttachmentLinkData() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ TapAttachmentLinkData copy$default(TapAttachmentLinkData tapAttachmentLinkData, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = tapAttachmentLinkData.attachmentUrl;
        }
        return tapAttachmentLinkData.copy(str);
    }

    public static final /* synthetic */ void write$Self$chat_release(TapAttachmentLinkData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (!output.u(serialDesc, 0) && self.attachmentUrl == null) {
            return;
        }
        output.r(serialDesc, 0, s1.f17602a, self.attachmentUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    @NotNull
    public final TapAttachmentLinkData copy(String attachmentUrl) {
        return new TapAttachmentLinkData(attachmentUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TapAttachmentLinkData) && Intrinsics.areEqual(this.attachmentUrl, ((TapAttachmentLinkData) other).attachmentUrl);
    }

    public final String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public int hashCode() {
        String str = this.attachmentUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    @NotNull
    /* JADX INFO: renamed from: serialize */
    public WritableMap getData() {
        return NativeMapExtensionsKt.nativeMapOf(new Pair("data", NativeMapExtensionsKt.nativeMapOf(new Pair("attachmentUrl", this.attachmentUrl))));
    }

    @NotNull
    public String toString() {
        return g.e("TapAttachmentLinkData(attachmentUrl=", this.attachmentUrl, ")");
    }

    public /* synthetic */ TapAttachmentLinkData(int i7, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.attachmentUrl = null;
        } else {
            this.attachmentUrl = str;
        }
    }

    public TapAttachmentLinkData(String str) {
        this.attachmentUrl = str;
    }

    public /* synthetic */ TapAttachmentLinkData(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }
}
