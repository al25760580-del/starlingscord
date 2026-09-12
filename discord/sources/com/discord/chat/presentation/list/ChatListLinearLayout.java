package com.discord.chat.presentation.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/list/ChatListLinearLayout;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/presentation/list/ChatListChildView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lastKey", "", "getLastKey", "()Ljava/lang/Object;", "setLastKey", "(Ljava/lang/Object;)V", "currentKey", "getCurrentKey", "setCurrentKey", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "superOnMeasure", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ChatListLinearLayout extends LinearLayout implements ChatListChildView {
    private Object currentKey;
    private Object lastKey;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatListLinearLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    public void bindKey(@NotNull Object obj) {
        ChatListChildView.DefaultImpls.bindKey(this, obj);
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    public Object getCurrentKey() {
        return this.currentKey;
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    public Object getLastKey() {
        return this.lastKey;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        onMeasureConsiderFrozen(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    public void onMeasureConsiderFrozen(int i7, int i10) {
        ChatListChildView.DefaultImpls.onMeasureConsiderFrozen(this, i7, i10);
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    public void setCurrentKey(Object obj) {
        this.currentKey = obj;
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    public void setLastKey(Object obj) {
        this.lastKey = obj;
    }

    @Override // com.discord.chat.presentation.list.ChatListChildView
    @SuppressLint({"WrongCall"})
    public void superOnMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public /* synthetic */ ChatListLinearLayout(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
