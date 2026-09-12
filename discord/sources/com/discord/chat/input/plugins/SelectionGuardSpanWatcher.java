package com.discord.chat.input.plugins;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.discord.chat.input.spans.DCDNoSelectionSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J<\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J)\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/input/plugins/SelectionGuardSpanWatcher;", "Landroid/text/SpanWatcher;", "<init>", "()V", "onSpanAdded", "", "text", "Landroid/text/Spannable;", "what", "", ViewProps.START, "", ViewProps.END, "onSpanRemoved", "onSpanChanged", "ostart", "oend", "nstart", "nend", "checkSelections", "selectionStart", "selectionEnd", "(Landroid/text/Spannable;Ljava/lang/Integer;Ljava/lang/Integer;)V", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionGuardSpanWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGuardSpanWatcher.kt\ncom/discord/chat/input/plugins/SelectionGuardSpanWatcher\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,80:1\n34#2:81\n13472#3,2:82\n*S KotlinDebug\n*F\n+ 1 SelectionGuardSpanWatcher.kt\ncom/discord/chat/input/plugins/SelectionGuardSpanWatcher\n*L\n49#1:81\n58#1:82,2\n*E\n"})
public final class SelectionGuardSpanWatcher implements SpanWatcher {
    private final void checkSelections(Spannable text, Integer selectionStart, Integer selectionEnd) {
        if (selectionStart == null && selectionEnd == null) {
            return;
        }
        boolean z5 = false;
        DCDNoSelectionSpan[] dCDNoSelectionSpanArr = (DCDNoSelectionSpan[]) text.getSpans(selectionStart != null ? selectionStart.intValue() : selectionEnd != null ? selectionEnd.intValue() : 0, selectionEnd != null ? selectionEnd.intValue() : selectionStart != null ? selectionStart.intValue() : 0, DCDNoSelectionSpan.class);
        if (dCDNoSelectionSpanArr.length == 0) {
            return;
        }
        int iIntValue = selectionStart != null ? selectionStart.intValue() : selectionEnd != null ? selectionEnd.intValue() : 0;
        boolean z6 = false;
        for (DCDNoSelectionSpan dCDNoSelectionSpan : dCDNoSelectionSpanArr) {
            int spanEnd = text.getSpanEnd(dCDNoSelectionSpan);
            int spanStart = text.getSpanStart(dCDNoSelectionSpan);
            if (iIntValue > spanStart && iIntValue < spanEnd) {
                if (spanEnd - iIntValue > iIntValue - spanStart) {
                    spanEnd = spanStart;
                }
                z6 = true;
                iIntValue = spanEnd;
            }
        }
        boolean z7 = (selectionStart == null || selectionStart.intValue() == iIntValue) ? false : true;
        if (selectionEnd != null && selectionEnd.intValue() != iIntValue) {
            z5 = true;
        }
        if (z6) {
            if (z5 || z7) {
                Selection.setSelection(text, iIntValue);
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable text, Object what, int start, int end) {
        if (text != null && (what instanceof DCDNoSelectionSpan)) {
            checkSelections(text, Integer.valueOf(text.getSpanStart(Selection.SELECTION_START)), Integer.valueOf(text.getSpanEnd(Selection.SELECTION_END)));
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable text, Object what, int ostart, int oend, int nstart, int nend) {
        if (text == null) {
            return;
        }
        if (Intrinsics.areEqual(what, Selection.SELECTION_START)) {
            checkSelections(text, Integer.valueOf(nstart), null);
        } else if (Intrinsics.areEqual(what, Selection.SELECTION_END)) {
            checkSelections(text, null, Integer.valueOf(nstart));
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable text, Object what, int start, int end) {
    }
}
