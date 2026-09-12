package ar;

import android.view.View;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.view.WindowInsetsCompat;
import com.discord.MainApplication;
import com.discord.chat.presentation.message.MessageView;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.view.ActivityRichPresenceInviteEmbedView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;
import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.notifications.renderer.NotificationChannels;
import com.discord.react_gesture_handler.DiscordGestureHandlerEnabledRootView;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.LogBoxDialog;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2961d;

    public /* synthetic */ s(int i7) {
        this.f2961d = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2961d) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((CoroutineContext) obj).n((CoroutineContext.Element) obj2);
            case 2:
                return ((CoroutineContext) obj).n((CoroutineContext.Element) obj2);
            case 3:
                return MainApplication.performInitialization$lambda$10$lambda$9((String) obj, (Map) obj2);
            case 4:
                return Integer.valueOf(MessageView.generateMessageAccessories$lambda$42((MessageAccessory) obj, (MessageAccessory) obj2));
            case 5:
                return ActivityRichPresenceInviteEmbedView.setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$10((String) obj, (String) obj2);
            case 6:
                return FlaggedMessageEmbedView.configureMessageContent$lambda$18$lambda$8((String) obj, (String) obj2);
            case 7:
                return NotificationChannels.migrateOrCreateNotificationChannel$lambda$13((NotificationChannelCompat) obj, (NotificationChannelCompat.Builder) obj2);
            case 8:
                return DynamicFromMap.asMap$lambda$6((ReadableMap) obj, (String) obj2);
            case 9:
                return Integer.valueOf(DynamicFromMap.asInt$lambda$3((ReadableMap) obj, (String) obj2));
            case 10:
                return Boolean.valueOf(DynamicFromMap.asBoolean$lambda$1((ReadableMap) obj, (String) obj2));
            case 11:
                return DynamicFromMap.asString$lambda$4((ReadableMap) obj, (String) obj2);
            case 12:
                return DynamicFromMap._get_type_$lambda$7((ReadableMap) obj, (String) obj2);
            case 13:
                return DynamicFromMap.asArray$lambda$5((ReadableMap) obj, (String) obj2);
            case 14:
                return Boolean.valueOf(DynamicFromMap._get_isNull_$lambda$0((ReadableMap) obj, (String) obj2));
            case 15:
                return Double.valueOf(DynamicFromMap.asDouble$lambda$2((ReadableMap) obj, (String) obj2));
            case 16:
                return LogBoxDialog.onCreate$lambda$3$lambda$1(647, (View) obj, (WindowInsetsCompat) obj2);
            case 17:
                return Integer.valueOf(ViewGroupDrawingOrderHelper.getChildDrawingOrder$lambda$0((View) obj, (View) obj2));
            case 18:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 19:
                return ComponentContextDefaults.GENERAL_HANDLERS$lambda$0((String) obj, (String) obj2);
            case 20:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$7((String) obj, (String) obj2);
            case 21:
                return ComponentContextDefaults.MEDIA_HANDLERS$lambda$17((String) obj, (Integer) obj2);
            case 22:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof r1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
            case 23:
                r1 r1Var = (r1) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (r1Var != null) {
                    return r1Var;
                }
                if (element2 instanceof r1) {
                    return (r1) element2;
                }
                return null;
            case 24:
                return (fr.z) obj;
            case 25:
                KClass clazz = (KClass) obj;
                final List types = (List) obj2;
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                Intrinsics.checkNotNullParameter(types, "types");
                ArrayList arrayListH = ls.d.H(rr.b.f19552a, types, true);
                Intrinsics.checkNotNull(arrayListH);
                final int i7 = 0;
                return ls.d.u(clazz, arrayListH, new Function0() { // from class: kr.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                break;
                        }
                        return ((KType) types.get(0)).getClassifier();
                    }
                });
            case 26:
                KClass clazz2 = (KClass) obj;
                final List types2 = (List) obj2;
                Intrinsics.checkNotNullParameter(clazz2, "clazz");
                Intrinsics.checkNotNullParameter(types2, "types");
                ArrayList arrayListH2 = ls.d.H(rr.b.f19552a, types2, true);
                Intrinsics.checkNotNull(arrayListH2);
                final int i10 = 1;
                KSerializer kSerializerU = ls.d.u(clazz2, arrayListH2, new Function0() { // from class: kr.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                break;
                        }
                        return ((KType) types2.get(0)).getClassifier();
                    }
                });
                if (kSerializerU != null) {
                    return com.facebook.imagepipeline.nativecode.b.p(kSerializerU);
                }
                return null;
            case 27:
                return TextUtilsKt.toSpannable$lambda$5((String) obj, (String) obj2);
            case 28:
                return DiscordGestureHandlerEnabledRootView.Companion.initNestedScrollOnTouchListeners$lambda$0((View) obj, (Function1) obj2);
            default:
                return DiscordGestureHandlerEnabledRootView.Companion.initNestedScrollOnTouchListeners$lambda$1((View) obj, (Function1) obj2);
        }
    }
}
