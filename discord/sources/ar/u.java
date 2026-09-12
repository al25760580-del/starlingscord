package ar;

import android.animation.Animator;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.View;
import com.discord.age_assurance.PlayIntegrityModuleKt;
import com.discord.billing.BillingManager;
import com.discord.bridge.DCDPackageList;
import com.discord.browser_manager.BrowserManager;
import com.discord.bundle_updater.BundleUpdaterUtilsKt;
import com.discord.chat.ChatModule;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.input.ChatInputViewManager;
import com.discord.chat.presentation.list.ChannelChatListAdapter;
import com.discord.chat.presentation.list.ChatListHighlightItemAtPositionKt;
import com.discord.chat.presentation.list.PortalViewUpdate;
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDrawer;
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2969d;

    public /* synthetic */ u(int i7) {
        this.f2969d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2969d) {
            case 0:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 1:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof kotlinx.coroutines.c) {
                    return (kotlinx.coroutines.c) element2;
                }
                return null;
            case 2:
                return BackgroundHighlightDrawer._init_$lambda$0((ChatListItem) obj);
            case 3:
                return BackgroundHighlightDrawer._init_$lambda$1((ChatListItem) obj);
            case 4:
                return Boolean.valueOf(BackgroundHighlightDrawer._init_$lambda$2((ChatListItem) obj));
            case 5:
                return SpannableStringBuilderExtensionsKt.debugSpans$lambda$7(obj);
            case 6:
                return Boolean.valueOf(ClickableSpan._init_$lambda$0((View) obj));
            case 7:
                return PlayIntegrityModuleKt.sha256Hex$lambda$0(((Byte) obj).byteValue());
            case 8:
                return BillingManager.loadPurchases$lambda$8((Exception) obj);
            case 9:
                return DCDPackageList.getPackages$lambda$0((ReactApplicationContext) obj);
            case 10:
                return DCDPackageList.getPackages$lambda$9((ReactApplicationContext) obj);
            case 11:
                return DCDPackageList.getPackages$lambda$10((ReactApplicationContext) obj);
            case 12:
                return DCDPackageList.getPackages$lambda$1((ReactApplicationContext) obj);
            case 13:
                return DCDPackageList.getPackages$lambda$2((ReactApplicationContext) obj);
            case 14:
                return DCDPackageList.getPackages$lambda$3((ReactApplicationContext) obj);
            case 15:
                return DCDPackageList.getPackages$lambda$4((ReactApplicationContext) obj);
            case 16:
                return DCDPackageList.getPackages$lambda$5((ReactApplicationContext) obj);
            case 17:
                return DCDPackageList.getPackages$lambda$6((ReactApplicationContext) obj);
            case 18:
                return DCDPackageList.getPackages$lambda$7((ReactApplicationContext) obj);
            case 19:
                return DCDPackageList.getPackages$lambda$8((ReactApplicationContext) obj);
            case 20:
                return BrowserManager.openUrlExternally$lambda$1((ResolveInfo) obj);
            case 21:
                return BundleUpdaterUtilsKt.json$lambda$0((JsonBuilder) obj);
            case 22:
                return ChatModule.json$lambda$0((JsonBuilder) obj);
            case 23:
                return SpoilerAttributes.configure$lambda$1(((Boolean) obj).booleanValue());
            case 24:
                return SpoilerAttributes.Companion.forItem$lambda$5$lambda$3((Context) obj);
            case 25:
                return ChatInputViewManager.json$lambda$0((JsonBuilder) obj);
            case 26:
                return ChannelChatListAdapter.setItems$lambda$4(((Boolean) obj).booleanValue());
            case 27:
                return ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$lambda$0((Animator) obj);
            case 28:
                return PortalViewUpdate._init_$lambda$0(((Boolean) obj).booleanValue());
            default:
                return BaseChatListItemDelegate._init_$lambda$0((View) obj);
        }
    }
}
