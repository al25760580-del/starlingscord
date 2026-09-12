package com.discord.chat.input.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.bridge.ChatInputNodeFontWeight;
import com.discord.chat.input.bridge.ChatInputNodeStyle;
import com.discord.chat.input.spans.DCDBackgroundSpan;
import com.discord.chat.input.spans.DCDBoldSpan;
import com.discord.chat.input.spans.DCDColorSpan;
import com.discord.chat.input.spans.DCDDeleteOnBackspaceSpan;
import com.discord.chat.input.spans.DCDInputSpan;
import com.discord.chat.input.spans.DCDNoSelectionSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0000¨\u0006\u0011"}, d2 = {"addEllipsizedHint", "", "Landroid/widget/EditText;", "hint", "", "hintTruncateAt", "Landroid/text/TextUtils$TruncateAt;", "removeEllipsizedHint", "maxLines", "", "setChatInputNodeStyle", "Landroid/text/Editable;", "node", "Lcom/discord/chat/input/bridge/ChatInputNode;", "applyDCDSpan", "span", "Lcom/discord/chat/input/spans/DCDInputSpan;", "chat_input_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EditTextUtilsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatInputNodeFontWeight.values().length];
            try {
                iArr[ChatInputNodeFontWeight.Bold.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addEllipsizedHint(@NotNull EditText editText, CharSequence charSequence, @NotNull TextUtils.TruncateAt hintTruncateAt) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(hintTruncateAt, "hintTruncateAt");
        if (editText.getMaxLines() != 1) {
            editText.setMaxLines(1);
        }
        editText.setEllipsize(hintTruncateAt);
        editText.setHint(charSequence);
    }

    public static /* synthetic */ void addEllipsizedHint$default(EditText editText, CharSequence charSequence, TextUtils.TruncateAt truncateAt, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            truncateAt = TextUtils.TruncateAt.END;
        }
        addEllipsizedHint(editText, charSequence, truncateAt);
    }

    public static final void applyDCDSpan(@NotNull Editable editable, @NotNull DCDInputSpan span, @NotNull ChatInputNode node) {
        Intrinsics.checkNotNullParameter(editable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.getLocation() <= editable.length()) {
            if (node.getLength() + node.getLocation() <= editable.length()) {
                editable.setSpan(span, node.getLocation(), node.getLength() + node.getLocation(), 33);
            }
        }
    }

    public static final void removeEllipsizedHint(@NotNull EditText editText, int i7) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        if (editText.getMaxLines() != i7) {
            editText.setMaxLines(i7);
        }
        editText.setEllipsize(null);
        editText.setHint((CharSequence) null);
    }

    public static final void setChatInputNodeStyle(@NotNull Editable editable, @NotNull ChatInputNode node) {
        Intrinsics.checkNotNullParameter(editable, "<this>");
        Intrinsics.checkNotNullParameter(node, "node");
        ChatInputNodeStyle style = node.getStyle();
        if (style != null) {
            applyDCDSpan(editable, new DCDColorSpan(style.getColor()), node);
            if (style.getBackgroundStyle() != null) {
                applyDCDSpan(editable, new DCDBackgroundSpan(style.getBackgroundStyle()), node);
            }
            ChatInputNodeFontWeight fontWeight = style.getFontWeight();
            if ((fontWeight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()]) == 1) {
                applyDCDSpan(editable, new DCDBoldSpan(), node);
            }
        }
        if (node.getDeleteNodeOnBackspace()) {
            applyDCDSpan(editable, new DCDDeleteOnBackspaceSpan(), node);
        }
        if (node.getEditDisabled()) {
            applyDCDSpan(editable, new DCDNoSelectionSpan(), node);
        }
    }
}
