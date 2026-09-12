package n6;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.contact_sync.react.ContactSyncSerializerKt;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.react.utilities.PromiseWrapper;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nModule;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.react_strings.RenderContext;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ShortcutsFlexbox;
import com.discord.serialization.SerializerUtils;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsLocalAccessor;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import pr.j;
import qr.c0;
import y.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16504d;

    public /* synthetic */ e(int i7) {
        this.f16504d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16504d) {
            case 0:
                return TextUtilsKt.toSpannable$lambda$1((LinkContentNode) obj);
            case 1:
                return NativeMapExtensionsKt.json$lambda$0((JsonBuilder) obj);
            case 2:
                return PromiseWrapper._init_$lambda$0(obj);
            case 3:
                return PromiseWrapper._init_$lambda$1((PromiseWrapper.Rejection) obj);
            case 4:
                Throwable th2 = (Throwable) obj;
                String simpleName = th2.getClass().getSimpleName();
                String message = th2.getMessage();
                if (message == null) {
                    message = "no message";
                }
                return kk.b.k(simpleName, ": ", message);
            case 5:
                mr.a buildSerialDescriptor = (mr.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                mr.a.a(buildSerialDescriptor, "JsonPrimitive", new j(new o5.a(6)));
                mr.a.a(buildSerialDescriptor, "JsonNull", new j(new o5.a(7)));
                mr.a.a(buildSerialDescriptor, "JsonLiteral", new j(new o5.a(8)));
                mr.a.a(buildSerialDescriptor, "JsonObject", new j(new o5.a(9)));
                mr.a.a(buildSerialDescriptor, "JsonArray", new j(new o5.a(10)));
                return Unit.f14616a;
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                c0.a(str, sb2);
                sb2.append(':');
                sb2.append(jsonElement);
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            case 7:
                return ContactSyncSerializerKt.serializeHasContactPermissionsResult$lambda$0(obj);
            case 8:
                return I18nModule.keysRequest$lambda$0((I18nMessage) obj);
            case 9:
                return I18nUtilsKt.i18nFormat$lambda$3((RenderContext) obj);
            case 10:
                return I18nUtilsKt.i18nContentDescription$lambda$2((RenderContext) obj);
            case 11:
                return I18nUtilsKt.i18nContentDescription$lambda$0((RenderContext) obj);
            case 12:
                return I18nUtilsKt.i18nSetText$lambda$1((RenderContext) obj);
            case 13:
                t3.b it = (t3.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            case 14:
                return ReactionView.configureLabels$lambda$0((RenderContext) obj);
            case 15:
                return ShortcutsFlexbox.setReactions$lambda$1((ReactionView.Reaction) obj);
            case 16:
                return AnimatedImageStateManager.updateWorker$lambda$5((AnimatedImageStateManager) obj);
            case 17:
                return MessageViewManagers.json$lambda$0((JsonBuilder) obj);
            case 18:
                Sequence it2 = (Sequence) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.iterator();
            case 19:
                Iterable it3 = (Iterable) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.iterator();
            case 20:
                return obj;
            case 21:
                return Boolean.valueOf(obj == null);
            case 22:
                synchronized (f.f23112b) {
                    f.f23117g.getClass();
                }
                return Unit.f14616a;
            case 23:
                return Unit.f14616a;
            case 24:
                return SerializerUtils.findErroringFields$lambda$0((JsonBuilder) obj);
            case 25:
                return ReactNativeFeatureFlagsLocalAccessor.override$lambda$0((String) obj);
            default:
                return ReactNativeFeatureFlagsLocalAccessor.getAccessedFeatureFlags$lambda$1((String) obj);
        }
    }
}
