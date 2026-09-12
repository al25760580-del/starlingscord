package com.discord.chat.bridge.ctabutton;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006*"}, d2 = {"Lcom/discord/chat/bridge/ctabutton/CtaButton;", "", "text", "", "textColor", "", ViewProps.BACKGROUND_COLOR, "callback", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "getCallback", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/discord/chat/bridge/ctabutton/CtaButton;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CtaButton {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer backgroundColor;
    private final String callback;

    @NotNull
    private final String text;
    private final Integer textColor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/ctabutton/CtaButton$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/ctabutton/CtaButton;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return CtaButton$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CtaButton(int i7, String str, Integer num, Integer num2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i7 & 1)) {
            e1.l(i7, 1, CtaButton$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i7 & 2) == 0) {
            this.textColor = null;
        } else {
            this.textColor = num;
        }
        if ((i7 & 4) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = num2;
        }
        if ((i7 & 8) == 0) {
            this.callback = null;
        } else {
            this.callback = str2;
        }
    }

    public static /* synthetic */ CtaButton copy$default(CtaButton ctaButton, String str, Integer num, Integer num2, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = ctaButton.text;
        }
        if ((i7 & 2) != 0) {
            num = ctaButton.textColor;
        }
        if ((i7 & 4) != 0) {
            num2 = ctaButton.backgroundColor;
        }
        if ((i7 & 8) != 0) {
            str2 = ctaButton.callback;
        }
        return ctaButton.copy(str, num, num2, str2);
    }

    public static final /* synthetic */ void write$Self$chat_release(CtaButton self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.text);
        if (output.u(serialDesc, 1) || self.textColor != null) {
            output.r(serialDesc, 1, m0.f17573a, self.textColor);
        }
        if (output.u(serialDesc, 2) || self.backgroundColor != null) {
            output.r(serialDesc, 2, m0.f17573a, self.backgroundColor);
        }
        if (!output.u(serialDesc, 3) && self.callback == null) {
            return;
        }
        output.r(serialDesc, 3, s1.f17602a, self.callback);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCallback() {
        return this.callback;
    }

    @NotNull
    public final CtaButton copy(@NotNull String text, Integer textColor, Integer backgroundColor, String callback) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new CtaButton(text, textColor, backgroundColor, callback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtaButton)) {
            return false;
        }
        CtaButton ctaButton = (CtaButton) other;
        return Intrinsics.areEqual(this.text, ctaButton.text) && Intrinsics.areEqual(this.textColor, ctaButton.textColor) && Intrinsics.areEqual(this.backgroundColor, ctaButton.backgroundColor) && Intrinsics.areEqual(this.callback, ctaButton.callback);
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCallback() {
        return this.callback;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.textColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.callback;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CtaButton(text=" + this.text + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", callback=" + this.callback + ")";
    }

    public CtaButton(@NotNull String text, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textColor = num;
        this.backgroundColor = num2;
        this.callback = str;
    }

    public /* synthetic */ CtaButton(String str, Integer num, Integer num2, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? null : str2);
    }
}
