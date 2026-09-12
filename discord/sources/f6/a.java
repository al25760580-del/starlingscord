package f6;

import android.graphics.PointF;
import android.view.View;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.presentation.message.view.botuikit.react.ComponentContextDefaults;
import com.discord.chat.presentation.message.view.botuikit.react.TextDisplayComponentViewManager;
import com.discord.chat.presentation.message.view.botuikit.react.deserialization.ComponentDeserializerKt;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.notifications.api.DirectReplyMessage;
import com.discord.notifications.api.NotificationMessageSerializer;
import com.discord.qr.scanner.QRScanner;
import im.f;
import im.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonBuilder;
import or.e1;
import vi.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8873d;

    public /* synthetic */ a(int i7) {
        this.f8873d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8873d) {
            case 0:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$12((String) obj);
            case 1:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$13((InlineCodeContentNode) obj);
            case 2:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$14((EmojiContentNode) obj);
            case 3:
                return ComponentContextDefaults.MARKDOWN_HANDLERS$lambda$15((SoundmojiContentNode) obj);
            case 4:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$9((CommandMentionContentNode) obj);
            case 5:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$10((CommandMentionContentNode) obj);
            case 6:
                return TextDisplayComponentViewManager.createTextDisplayComponentContext$lambda$15((SoundmojiContentNode) obj);
            case 7:
                return DirectReplyMessage.json$lambda$0((JsonBuilder) obj);
            case 8:
                return NotificationMessageSerializer.json$lambda$0((JsonBuilder) obj);
            case 9:
                return ComponentDeserializerKt.json$lambda$0((JsonBuilder) obj);
            case 10:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.getId());
            case 11:
                return ViewAttachedListener._init_$lambda$0(((Boolean) obj).booleanValue());
            case 12:
                f it2 = (f) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                PointF pointF = g.f11913p;
                return Boolean.valueOf(d.e(it2.f11896h) && !it2.M);
            case 13:
                KClass it3 = (KClass) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                KSerializer kSerializerG = ls.d.G(it3);
                if (kSerializerG != null) {
                    return kSerializerG;
                }
                if (e1.h(it3)) {
                    return new kr.d(it3);
                }
                return null;
            case 14:
                KClass it4 = (KClass) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                KSerializer kSerializerG2 = ls.d.G(it4);
                if (kSerializerG2 == null) {
                    kSerializerG2 = e1.h(it4) ? new kr.d(it4) : null;
                }
                if (kSerializerG2 != null) {
                    return com.facebook.imagepipeline.nativecode.b.p(kSerializerG2);
                }
                return null;
            case 15:
                return QRScanner.onCodeFound$lambda$1((String) obj);
            case 16:
                return Float.valueOf(0.0f);
            case 17:
                Intrinsics.checkNotNullParameter((mr.a) obj, "<this>");
                return Unit.f14616a;
            case 18:
                return RenderContext._init_$lambda$0((GameMentionContentNode) obj);
            case 19:
                return RenderContext._init_$lambda$1((SoundmojiContentNode) obj);
            case 20:
                return TextUtilsKt.toSpannable$lambda$0((LinkContentNode) obj);
            case 21:
                return TextUtilsKt.toSpannable$lambda$4((String) obj);
            case 22:
                return TextUtilsKt.toSpannable$lambda$7((CommandMentionContentNode) obj);
            case 23:
                return TextUtilsKt.toSpannable$lambda$8((CommandMentionContentNode) obj);
            case 24:
                return TextUtilsKt.toSpannable$lambda$9((GameMentionContentNode) obj);
            case 25:
                return TextUtilsKt.toSpannable$lambda$10((String) obj);
            case 26:
                return TextUtilsKt.toSpannable$lambda$11((InlineCodeContentNode) obj);
            case 27:
                return TextUtilsKt.toSpannable$lambda$12((EmojiContentNode) obj);
            case 28:
                return TextUtilsKt.toSpannable$lambda$13((LinkContentNode) obj);
            default:
                return TextUtilsKt.toSpannable$lambda$15((SoundmojiContentNode) obj);
        }
    }
}
