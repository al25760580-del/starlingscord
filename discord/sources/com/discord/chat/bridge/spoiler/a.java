package com.discord.chat.bridge.spoiler;

import android.content.Context;
import com.discord.chat.presentation.message.MessageViewAccessibilityDelegate;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.react_strings.RenderContext;
import com.discord.socialrpc.SocialRpcSessionManager;
import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4069e;

    public /* synthetic */ a(String str, int i7) {
        this.f4068d = i7;
        this.f4069e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4068d) {
            case 0:
                return SpoilerAttributes.Companion.forItem$lambda$2$lambda$0(this.f4069e, (Context) obj);
            case 1:
                return SpoilerAttributes.Companion.forItem$lambda$2$lambda$1(this.f4069e, (Context) obj);
            case 2:
                return SpoilerAttributes.Companion.forItem$lambda$5$lambda$4(this.f4069e, (Context) obj);
            case 3:
                return MessageViewAccessibilityDelegate.getReferencedMessageLabel$lambda$0(this.f4069e, (RenderContext) obj);
            case 4:
                return NotificationDataUtilsKt.getSystemMessageUserJoin__NT_lnE$lambda$22$lambda$21(this.f4069e, (RenderContext) obj);
            case 5:
                return NotificationDataUtilsKt.getMissedCallText$lambda$33(this.f4069e, (RenderContext) obj);
            case 6:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$11(this.f4069e, (Promise) obj);
            default:
                return SocialRpcSessionManager.errorActivity$lambda$22$lambda$21(this.f4069e, (JsonObjectBuilder) obj);
        }
    }
}
