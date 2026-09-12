package com.discord.notifications.renderer.utils;

import com.discord.notifications.api.NotificationData;
import com.discord.react_strings.RenderContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NotificationData f4536e;

    public /* synthetic */ a(NotificationData notificationData, int i7) {
        this.f4535d = i7;
        this.f4536e = notificationData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4535d) {
            case 0:
                return NotificationDataUtilsKt.getTitle$lambda$0(this.f4536e, (RenderContext) obj);
            case 1:
                return NotificationDataUtilsKt.renderMessageContent$lambda$8(this.f4536e, (RenderContext) obj);
            case 2:
                return NotificationDataUtilsKt.renderMessageContent$lambda$9(this.f4536e, (RenderContext) obj);
            case 3:
                return NotificationDataUtilsKt.renderMessageContent$lambda$10(this.f4536e, (RenderContext) obj);
            case 4:
                return NotificationDataUtilsKt.renderMessageContent$lambda$13(this.f4536e, (RenderContext) obj);
            case 5:
                return NotificationDataUtilsKt.getContent$lambda$14(this.f4536e, (RenderContext) obj);
            case 6:
                return NotificationDataUtilsKt.getContent$lambda$15(this.f4536e, (RenderContext) obj);
            case 7:
                return NotificationDataUtilsKt.getContent$lambda$16(this.f4536e, (RenderContext) obj);
            case 8:
                return NotificationDataUtilsKt.getContent$lambda$17(this.f4536e, (RenderContext) obj);
            case 9:
                return NotificationDataUtilsKt.getContent$lambda$18(this.f4536e, (RenderContext) obj);
            case 10:
                return NotificationDataUtilsKt.getTitle$lambda$1(this.f4536e, (RenderContext) obj);
            case 11:
                return NotificationDataUtilsKt.getContent$lambda$19(this.f4536e, (RenderContext) obj);
            case 12:
                return NotificationDataUtilsKt.getContent$lambda$20(this.f4536e, (RenderContext) obj);
            case 13:
                return NotificationDataUtilsKt.getBotDMMuteAction$lambda$28(this.f4536e, (RenderContext) obj);
            case 14:
                return NotificationDataUtilsKt.getTitle$lambda$2(this.f4536e, (RenderContext) obj);
            case 15:
                return NotificationDataUtilsKt.getTitle$lambda$3(this.f4536e, (RenderContext) obj);
            case 16:
                return NotificationDataUtilsKt.getTitle$lambda$4(this.f4536e, (RenderContext) obj);
            case 17:
                return NotificationDataUtilsKt.getTitle$lambda$5(this.f4536e, (RenderContext) obj);
            default:
                return NotificationDataUtilsKt.renderMessageContent$lambda$7(this.f4536e, (RenderContext) obj);
        }
    }
}
