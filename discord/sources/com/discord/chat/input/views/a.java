package com.discord.chat.input.views;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import ar.i1;
import ar.n;
import ar.w;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.h;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView;
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chatreplay.ReplayProviderActivity;
import com.discord.emoji_picker.EmojiPickerView;
import com.discord.media.MediaManagerModule;
import com.discord.permissions.NativePermissionManagerModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.runtime.ReactSurfaceImpl;
import er.v;
import fr.t;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4073e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f4072d = i7;
        this.f4073e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4072d) {
            case 0:
                return ChatInputRootView._init_$lambda$2((ChatInputRootView) this.f4073e, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            case 1:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$31((MessageAccessoriesAdapter) this.f4073e, (String) obj, (String) obj2);
            case 2:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$34$lambda$33((h) this.f4073e, (String) obj, (Integer) obj2);
            case 3:
                return EmojiPickerView._init_$lambda$7((EmojiPickerView) this.f4073e, (Integer) obj, (Integer) obj2);
            case 4:
                return MediaManagerModule.mediaResolver$lambda$0((MediaManagerModule) this.f4073e, (Uri) obj, ((Integer) obj2).intValue());
            case 5:
                return NativePermissionManagerModule.requestPermissionWithDeduplication$lambda$5((NativePermissionManagerModule) this.f4073e, (String) obj, (Promise) obj2);
            case 6:
                return DefaultReactNativeHost.toReactHost$lambda$1((DefaultReactNativeHost) this.f4073e, (Context) obj, (ReactSurfaceImpl) obj2);
            case 7:
                return MediaGalleryDisplayComponentView._init_$lambda$1((MediaGalleryDisplayComponentView) this.f4073e, (MediaGalleryDisplayComponent) obj, (MediaGalleryItem) obj2);
            case 8:
                v vVar = (v) this.f4073e;
                int iIntValue = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                f key = element.getKey();
                CoroutineContext.Element elementL = vVar.f8715e.l(key);
                if (key == w.f2975e) {
                    Job job = (Job) elementL;
                    Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                    Job job2 = (Job) element;
                    while (true) {
                        Job parent = null;
                        if (job2 == null) {
                            job2 = null;
                        } else if (job2 != job && (job2 instanceof t)) {
                            n nVar = (n) i1.f2929e.get((t) job2);
                            if (nVar != null) {
                                parent = nVar.getParent();
                            }
                            job2 = parent;
                        }
                    }
                    if (job2 != job) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + job2 + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (job != null) {
                        iIntValue++;
                    }
                } else if (element != elementL) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 9:
                return AttachmentMediaMosaicContainerView.attachmentAdapter$lambda$0((AttachmentMediaMosaicContainerView) this.f4073e, (MessageAttachmentAccessory) obj, (MessagePartViewHolder) obj2);
            default:
                return ReplayProviderActivity.Companion.requestReplayList$lambda$0((Activity) this.f4073e, (Unit) obj, (Throwable) obj2);
        }
    }
}
