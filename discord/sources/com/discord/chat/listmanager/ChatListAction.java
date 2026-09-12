package com.discord.chat.listmanager;

import com.discord.chat.presentation.list.a;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction;", "", "<init>", "()V", "ScrollTo", "StickToBottomIfAtBottom", "Clear", "Noop", "Lcom/discord/chat/listmanager/ChatListAction$Clear;", "Lcom/discord/chat/listmanager/ChatListAction$Noop;", "Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;", "Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ChatListAction {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$Clear;", "Lcom/discord/chat/listmanager/ChatListAction;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Clear extends ChatListAction {

        @NotNull
        public static final Clear INSTANCE = new Clear();

        private Clear() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$Noop;", "Lcom/discord/chat/listmanager/ChatListAction;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Noop extends ChatListAction {

        @NotNull
        public static final Noop INSTANCE = new Noop();

        private Noop() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;", "Lcom/discord/chat/listmanager/ChatListAction;", ViewProps.POSITION, "", "animate", "", "highlight", "<init>", "(IZZ)V", "getPosition", "()I", "getAnimate", "()Z", "getHighlight", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScrollTo extends ChatListAction {
        private final boolean animate;
        private final boolean highlight;
        private final int position;

        public ScrollTo(int i7, boolean z5, boolean z6) {
            super(null);
            this.position = i7;
            this.animate = z5;
            this.highlight = z6;
        }

        public static /* synthetic */ ScrollTo copy$default(ScrollTo scrollTo, int i7, boolean z5, boolean z6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i7 = scrollTo.position;
            }
            if ((i10 & 2) != 0) {
                z5 = scrollTo.animate;
            }
            if ((i10 & 4) != 0) {
                z6 = scrollTo.highlight;
            }
            return scrollTo.copy(i7, z5, z6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getHighlight() {
            return this.highlight;
        }

        @NotNull
        public final ScrollTo copy(int position, boolean animate, boolean highlight) {
            return new ScrollTo(position, animate, highlight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollTo)) {
                return false;
            }
            ScrollTo scrollTo = (ScrollTo) other;
            return this.position == scrollTo.position && this.animate == scrollTo.animate && this.highlight == scrollTo.highlight;
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        public final boolean getHighlight() {
            return this.highlight;
        }

        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return Boolean.hashCode(this.highlight) + a.g(Integer.hashCode(this.position) * 31, 31, this.animate);
        }

        @NotNull
        public String toString() {
            int i7 = this.position;
            boolean z5 = this.animate;
            boolean z6 = this.highlight;
            StringBuilder sb2 = new StringBuilder("ScrollTo(position=");
            sb2.append(i7);
            sb2.append(", animate=");
            sb2.append(z5);
            sb2.append(", highlight=");
            return a.m(sb2, z6, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;", "Lcom/discord/chat/listmanager/ChatListAction;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StickToBottomIfAtBottom extends ChatListAction {

        @NotNull
        public static final StickToBottomIfAtBottom INSTANCE = new StickToBottomIfAtBottom();

        private StickToBottomIfAtBottom() {
            super(null);
        }
    }

    public /* synthetic */ ChatListAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChatListAction() {
    }
}
