package com.discord.chat.input.plugins;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import com.discord.chat.input.spans.DCDDeleteOnBackspaceSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J*\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher;", "Landroid/text/TextWatcher;", "<init>", "()V", "deleteEvent", "Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;", "getDeleteEvent", "()Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;", "setDeleteEvent", "(Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;)V", "ignoreUpdate", "", "getIgnoreUpdate", "()Z", "setIgnoreUpdate", "(Z)V", "beforeTextChanged", "", "s", "", ViewProps.START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "editable", "Landroid/text/Editable;", "DeleteEvent", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeleteNodeOnBackspaceTextWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteNodeOnBackspaceTextWatcher.kt\ncom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,95:1\n18#2:96\n*S KotlinDebug\n*F\n+ 1 DeleteNodeOnBackspaceTextWatcher.kt\ncom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher\n*L\n36#1:96\n*E\n"})
public final class DeleteNodeOnBackspaceTextWatcher implements TextWatcher {
    private DeleteEvent deleteEvent;
    private boolean ignoreUpdate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/input/plugins/DeleteNodeOnBackspaceTextWatcher$DeleteEvent;", "", ViewProps.START, "", ViewProps.END, "<init>", "(II)V", "getStart", "()I", "getEnd", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteEvent {
        private final int end;
        private final int start;

        public DeleteEvent(int i7, int i10) {
            this.start = i7;
            this.end = i10;
        }

        public static /* synthetic */ DeleteEvent copy$default(DeleteEvent deleteEvent, int i7, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = deleteEvent.start;
            }
            if ((i11 & 2) != 0) {
                i10 = deleteEvent.end;
            }
            return deleteEvent.copy(i7, i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final DeleteEvent copy(int start, int end) {
            return new DeleteEvent(start, end);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteEvent)) {
                return false;
            }
            DeleteEvent deleteEvent = (DeleteEvent) other;
            return this.start == deleteEvent.start && this.end == deleteEvent.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
        }

        @NotNull
        public String toString() {
            return g.c(this.start, "DeleteEvent(start=", this.end, ", end=", ")");
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        DeleteEvent deleteEvent;
        if (this.ignoreUpdate || editable == null || (deleteEvent = this.deleteEvent) == null) {
            return;
        }
        this.ignoreUpdate = true;
        editable.delete(deleteEvent.getStart(), deleteEvent.getEnd());
        this.deleteEvent = null;
        this.ignoreUpdate = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s2, int start, int count, int after) {
        Integer numValueOf = null;
        Spanned spanned = s2 instanceof Spanned ? (Spanned) s2 : null;
        if (this.ignoreUpdate || spanned == null || after != 0 || count <= 0) {
            return;
        }
        int i7 = after + start;
        int i10 = start + count;
        Object[] spans = spanned.getSpans(i7, i10, DCDDeleteOnBackspaceSpan.class);
        if (spans == null) {
            spans = new DCDDeleteOnBackspaceSpan[0];
        }
        Integer numValueOf2 = null;
        for (DCDDeleteOnBackspaceSpan dCDDeleteOnBackspaceSpan : (DCDDeleteOnBackspaceSpan[]) spans) {
            int spanStart = spanned.getSpanStart(dCDDeleteOnBackspaceSpan);
            int spanEnd = spanned.getSpanEnd(dCDDeleteOnBackspaceSpan);
            if (numValueOf == null || numValueOf.intValue() > spanStart) {
                numValueOf = Integer.valueOf(spanStart);
            }
            if (numValueOf2 == null) {
                numValueOf2 = Integer.valueOf(spanEnd);
            } else if (numValueOf2.intValue() < spanEnd) {
                numValueOf2 = Integer.valueOf(spanEnd);
            }
        }
        if (numValueOf == null || numValueOf2 == null) {
            return;
        }
        this.deleteEvent = new DeleteEvent(Math.min(numValueOf.intValue(), i7), Math.max(numValueOf2.intValue(), i10) - (i10 - i7));
    }

    public final DeleteEvent getDeleteEvent() {
        return this.deleteEvent;
    }

    public final boolean getIgnoreUpdate() {
        return this.ignoreUpdate;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s2, int start, int before, int count) {
    }

    public final void setDeleteEvent(DeleteEvent deleteEvent) {
        this.deleteEvent = deleteEvent;
    }

    public final void setIgnoreUpdate(boolean z5) {
        this.ignoreUpdate = z5;
    }
}
