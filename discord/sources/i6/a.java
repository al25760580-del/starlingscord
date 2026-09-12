package i6;

import androidx.core.view.q1;
import com.discord.cache.Cache;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.phone_verification.AppSignatureHelper;
import com.discord.resource_usage.DeviceResourceUsageManager;
import im.q;
import io.sentry.h4;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kr.d;
import m3.m;
import mr.b;
import mr.c;
import mr.g;
import or.e1;
import sm.f;
import v1.e;
import v1.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11392e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f11391d = i7;
        this.f11392e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11391d) {
            case 0:
                return ViewAttachedListener.scrollStateListener_delegate$lambda$2((ViewAttachedListener) this.f11392e);
            case 1:
                q qVar = (q) this.f11392e;
                qVar.d();
                qVar.a(false);
                qVar.k();
                return Unit.f14616a;
            case 2:
                return Cache._init_$lambda$2((Cache) this.f11392e);
            case 3:
                return AppSignatureHelper.appSignatures_delegate$lambda$2((AppSignatureHelper) this.f11392e);
            case 4:
                return ArrayIteratorKt.iterator((Object[]) this.f11392e);
            case 5:
                return ((Iterable) this.f11392e).iterator();
            case 6:
                d dVar = (d) this.f11392e;
                g gVarG = m.g("kotlinx.serialization.Polymorphic", c.f16055b, new SerialDescriptor[0], new kotlin.collections.a(4, dVar));
                KClass context = dVar.f14798a;
                Intrinsics.checkNotNullParameter(gVarG, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                return new b(gVarG, context);
            case 7:
                g gVar = (g) this.f11392e;
                return Integer.valueOf(e1.f(gVar, gVar.k));
            case 8:
                return Float.valueOf(((q1) ((fj.c) this.f11392e).f9267e).F().f1559d);
            case 9:
                return new tl.a((h4) this.f11392e);
            case 10:
                u1.d dVar2 = (u1.d) this.f11392e;
                dVar2.g().execute(new f(2, dVar2));
                return Unit.f14616a;
            case 11:
                h hVar = (h) this.f11392e;
                Executor executor = hVar.f21364g;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor = null;
                }
                executor.execute(new e(hVar, 0));
                return Unit.f14616a;
            case 12:
                return Integer.valueOf(MessageViewManagers.getEventHandler$lambda$2((MessageRow) this.f11392e));
            case 13:
                return DeviceResourceUsageManager.start$lambda$1$lambda$0((DeviceResourceUsageManager) this.f11392e);
            case 14:
                return this.f11392e;
            default:
                return Long.valueOf(ChatListItem.recyclerItemId_delegate$lambda$0((ChatListItem) this.f11392e));
        }
    }
}
