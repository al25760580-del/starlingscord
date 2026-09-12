package com.discord.chat.bridge.row;

import a3.e;
import com.discord.chat.presentation.list.a;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/discord/chat/bridge/row/LoadMoreButton;", "", "action", "Lcom/discord/chat/bridge/row/LoadingAction;", "text", "", ViewProps.BACKGROUND_COLOR, "", "cornerRadius", "<init>", "(Lcom/discord/chat/bridge/row/LoadingAction;Ljava/lang/String;ILjava/lang/Integer;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/row/LoadingAction;Ljava/lang/String;ILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAction", "()Lcom/discord/chat/bridge/row/LoadingAction;", "getText", "()Ljava/lang/String;", "getBackgroundColor", "()I", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/discord/chat/bridge/row/LoadingAction;Ljava/lang/String;ILjava/lang/Integer;)Lcom/discord/chat/bridge/row/LoadMoreButton;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LoadMoreButton {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LoadingAction action;
    private final int backgroundColor;
    private final Integer cornerRadius;

    @NotNull
    private final String text;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/row/LoadMoreButton$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/LoadMoreButton;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LoadMoreButton$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LoadMoreButton(int i7, LoadingAction loadingAction, String str, int i10, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i7 & 7)) {
            e1.l(i7, 7, LoadMoreButton$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.action = loadingAction;
        this.text = str;
        this.backgroundColor = i10;
        if ((i7 & 8) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = num;
        }
    }

    public static /* synthetic */ LoadMoreButton copy$default(LoadMoreButton loadMoreButton, LoadingAction loadingAction, String str, int i7, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loadingAction = loadMoreButton.action;
        }
        if ((i10 & 2) != 0) {
            str = loadMoreButton.text;
        }
        if ((i10 & 4) != 0) {
            i7 = loadMoreButton.backgroundColor;
        }
        if ((i10 & 8) != 0) {
            num = loadMoreButton.cornerRadius;
        }
        return loadMoreButton.copy(loadingAction, str, i7, num);
    }

    public static final /* synthetic */ void write$Self$chat_release(LoadMoreButton self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, LoadingAction$$serializer.INSTANCE, self.action);
        output.q(serialDesc, 1, self.text);
        output.l(2, self.backgroundColor, serialDesc);
        if (!output.u(serialDesc, 3) && self.cornerRadius == null) {
            return;
        }
        output.r(serialDesc, 3, m0.f17573a, self.cornerRadius);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoadingAction getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final LoadMoreButton copy(@NotNull LoadingAction action, @NotNull String text, int backgroundColor, Integer cornerRadius) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(text, "text");
        return new LoadMoreButton(action, text, backgroundColor, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadMoreButton)) {
            return false;
        }
        LoadMoreButton loadMoreButton = (LoadMoreButton) other;
        return Intrinsics.areEqual(this.action, loadMoreButton.action) && Intrinsics.areEqual(this.text, loadMoreButton.text) && this.backgroundColor == loadMoreButton.backgroundColor && Intrinsics.areEqual(this.cornerRadius, loadMoreButton.cornerRadius);
    }

    @NotNull
    public final LoadingAction getAction() {
        return this.action;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iU = a.u(this.backgroundColor, e.d(this.action.hashCode() * 31, 31, this.text), 31);
        Integer num = this.cornerRadius;
        return iU + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "LoadMoreButton(action=" + this.action + ", text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ")";
    }

    public LoadMoreButton(@NotNull LoadingAction action, @NotNull String text, int i7, Integer num) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(text, "text");
        this.action = action;
        this.text = text;
        this.backgroundColor = i7;
        this.cornerRadius = num;
    }

    public /* synthetic */ LoadMoreButton(LoadingAction loadingAction, String str, int i7, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(loadingAction, str, i7, (i10 & 8) != 0 ? null : num);
    }
}
