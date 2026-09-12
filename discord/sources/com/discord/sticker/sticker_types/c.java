package com.discord.sticker.sticker_types;

import com.discord.app_database.DatabaseVersions;
import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.notifications.api.ConfiguredNotifChannel;
import com.discord.notifications.api.Embed;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.api.NotificationMessage;
import com.discord.notifications.react.events.LocalNotificationEvent;
import com.discord.user_search_worker.UserSearchQuerySetPayload;
import com.discord.user_search_worker.UserSearchUpdateUsersData;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.react.DebugCorePackage;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.KeyEvent;
import com.facebook.react.views.text.TextLayoutManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerDetectorViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import rn.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4592d;

    public /* synthetic */ c(int i7) {
        this.f4592d = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4592d) {
            case 0:
                return RLottieUtils.init$lambda$0();
            case 1:
                return UserSearchQuerySetPayload._childSerializers$_anonymous_();
            case 2:
                return UserSearchQuerySetPayload._childSerializers$_anonymous_$0();
            case 3:
                return UserSearchQuerySetPayload._childSerializers$_anonymous_$1();
            case 4:
                return UserSearchUpdateUsersData._childSerializers$_anonymous_();
            case 5:
                return BitmapUtil.DECODE_BUFFERS_delegate$lambda$0();
            case 6:
                return DebugCorePackage.viewManagersMap_delegate$lambda$1();
            case 7:
                return UiThreadUtil.mainHandler_delegate$lambda$0();
            case 8:
                return KeyEvent.CODE_MAP_delegate$lambda$0();
            case 9:
                return KeyEvent.KEY_NAME_MAP_delegate$lambda$1();
            case 10:
                return TextLayoutManager.setUseBoundsForWidthMethod_delegate$lambda$0();
            case 11:
                dn.c cVar = ScreenDummyLayoutHelper.G;
                return "[RNScreens] Context was null-ed before dummy layout was initialized";
            case 12:
                dn.c cVar2 = ScreenDummyLayoutHelper.G;
                return "[RNScreens] ReactContext missing in onHostResume! This should not happen.";
            case 13:
                dn.c cVar3 = ScreenDummyLayoutHelper.G;
                return "[RNScreens] Attempt to require missing react context";
            case 14:
                return ComponentContextDefaults.GENERAL_HANDLERS$lambda$1();
            case 15:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$11();
            case 16:
                return ComponentContextDefaults.MEDIA_HANDLERS$lambda$18();
            case 17:
                return ConfiguredNotifChannel._childSerializers$_anonymous_();
            case 18:
                return Embed._childSerializers$_anonymous_();
            case 19:
                return KvMessageEntry._childSerializers$_anonymous_();
            case 20:
                return KvMessageEntry._childSerializers$_anonymous_$0();
            case 21:
                return NotificationData._childSerializers$_anonymous_();
            case 22:
                return NotificationMessage._childSerializers$_anonymous_();
            case 23:
                return NotificationMessage._childSerializers$_anonymous_$0();
            case 24:
                return NotificationMessage._childSerializers$_anonymous_$1();
            case 25:
                return NotificationMessage._childSerializers$_anonymous_$2();
            case 26:
                return LocalNotificationEvent._childSerializers$_anonymous_();
            case 27:
                u uVar = BytesRange.f4806c;
                return Pattern.compile("[-/ ]");
            case 28:
                ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
                return w0.g(new Pair(RNGestureHandlerRootViewManager.REACT_CLASS, companion.viewManagerSpec(new hm.a(0))), new Pair(RNGestureHandlerButtonViewManager.REACT_CLASS, companion.viewManagerSpec(new hm.a(1))), new Pair(RNGestureHandlerDetectorViewManager.REACT_CLASS, companion.viewManagerSpec(new hm.a(2))));
            default:
                return DatabaseVersions._childSerializers$_anonymous_();
        }
    }
}
