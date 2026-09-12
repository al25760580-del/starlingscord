package com.discord.chat.presentation.message;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.HeadingContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView;
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager;
import com.discord.chat.presentation.message.viewholder.MessageComponentsViewHolder;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.emoji_picker.EmojiPickerScroller;
import com.discord.fastest_list.android.FastestListSections;
import com.discord.fastest_list.android.FastestListView;
import com.discord.permissions.NativePermissionManagerModule;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.react.bridge.Promise;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4136e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4137i;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        this.f4135d = i7;
        this.f4136e = obj;
        this.f4137i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4135d) {
            case 0:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$39$lambda$38((h) this.f4136e, (AudioAttachmentMessageAccessory) this.f4137i, (String) obj, (Integer) obj2);
            case 1:
                return MessageComponentsViewHolder.bind$lambda$0((ChatEventHandler) this.f4136e, (String) this.f4137i, (String) obj, (String) obj2);
            case 2:
                return EmojiPickerScroller.scrollListenerVelocityTracker$lambda$0((EmojiPickerScroller) this.f4136e, (Function0) this.f4137i, (RecyclerView) obj, ((Float) obj2).floatValue());
            case 3:
                return FastestListView.typedAdapter$lambda$1((Function3) this.f4136e, (FastestListView) this.f4137i, (FastestListSections.Entry) obj, ((Integer) obj2).intValue());
            case 4:
                return NativePermissionManagerModule.requestMultiplePermissionsWithDeduplication$lambda$6((NativePermissionManagerModule) this.f4136e, (List) this.f4137i, (String) obj, (Promise) obj2);
            case 5:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$7((TextDisplayComponentViewManager) this.f4136e, (TextDisplayComponentView) this.f4137i, (String) obj, (String) obj2);
            default:
                return TextUtilsKt.toSpannable$lambda$71$lambda$53$lambda$52((HeadingContentNode) this.f4136e, (DraweeSpanStringBuilder) this.f4137i, (DraweeSpanStringBuilder) obj, (RenderContext) obj2);
        }
    }
}
