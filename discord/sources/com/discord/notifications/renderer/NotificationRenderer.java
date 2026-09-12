package com.discord.notifications.renderer;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import ar.b0;
import ar.e;
import com.discord.device.utils.IsMetaQuestKt;
import com.discord.icons.IconUrlUtils;
import com.discord.image.fresco.FrescoFetchDecodedImageKt;
import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.DismissCallAction;
import com.discord.notifications.api.ConfiguredNotifChannel;
import com.discord.notifications.api.ConfiguredNotifGroup;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.api.NotificationDataDeserializationUtilsKt;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.notifications.renderer.utils.NotificationImageCacheKt;
import com.discord.notifications.renderer.utils.NotificationManagerUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageIdSnowflake;
import com.discord.primitives.UserId;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.shortcuts.ShortcutUtilsKt;
import com.discord.snowflake.SnowflakeUtils;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.h0;
import kotlin.collections.w0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import x0.q0;
import x0.y;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u0001:\u00019B)\u0012 \u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0003¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0005J*\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0007J\u0016\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J(\u0010\"\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&H\u0007J\u0016\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0007J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u0017J \u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u0017H\u0007J$\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0005H\u0007J.\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0005H\u0002Jf\u00101\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u00010\u00072\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00052\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00108\u001a\u00020&H\u0007R(\u0010\u0002\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006:"}, d2 = {"Lcom/discord/notifications/renderer/NotificationRenderer;", "", "getNotifTypeMappings", "Lkotlin/Function1;", "Landroid/content/Context;", "", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "fullscreenIntent", "Landroid/app/PendingIntent;", "getFullscreenIntent", "()Landroid/app/PendingIntent;", "setFullscreenIntent", "(Landroid/app/PendingIntent;)V", "initNotificationCategories", "", "context", "localizedCategoryNames", "localizedGroupNames", "initNotificationGroupsAndChannels", "groups", "", "Lcom/discord/notifications/api/ConfiguredNotifGroup;", "channels", "Lcom/discord/notifications/api/ConfiguredNotifChannel;", "initFresco", "initIconUrlUtils", "setIncomingRingtone", StackTraceHelper.NAME_KEY, "clear", "notificationTag", "clearAllNotifications", "markNotificationAsDirectReply", "tag", "channelId", "shouldIgnoreAck", "", "handleReactionAcks", "handleAcks", "notification", "Lcom/discord/notifications/api/NotificationData;", "handleCallAck", "channelIds", "Lcom/discord/primitives/ChannelId;", "handleCallRingEnd", "displayLocal", "notificationDataMap", ViewProps.DISPLAY, "currentUsername", "behaviors", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "makeOrUpdateShortcut", "notifyEveryTime", "accountLabel", "preserveAccountLabel", "Companion", "notification_renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,506:1\n1869#2,2:507\n1869#2:509\n1869#2,2:510\n1870#2:512\n1869#2:513\n1869#2,2:514\n1870#2:516\n*S KotlinDebug\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer\n*L\n138#1:507,2\n191#1:509\n195#1:510,2\n191#1:512\n213#1:513\n217#1:514,2\n213#1:516\n*E\n"})
public final class NotificationRenderer {

    @NotNull
    public static final String CHANNEL_NAME = "channelName";

    @NotNull
    public static final String IGNORE_ACK_KEY = "ignoreAck";

    @NotNull
    public static final String IS_DM = "isDM";

    @NotNull
    public static final String LATEST_MESSAGE_ID_KEY = "latestMessageId";

    @NotNull
    public static final String USERNAME = "username";
    private PendingIntent fullscreenIntent;

    @NotNull
    private final Function1<Context, Map<Integer, String>> getNotifTypeMappings;

    /* JADX INFO: renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.renderer.NotificationRenderer$display$1", f = "NotificationRenderer.kt", l = {343, 351}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nNotificationRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer$display$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,506:1\n1#2:507\n1#2:522\n1011#3,2:508\n1869#3,2:510\n1617#3,9:512\n1869#3:521\n1870#3:523\n1626#3:524\n*S KotlinDebug\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer$display$1\n*L\n486#1:522\n445#1:508,2\n446#1:510,2\n486#1:512,9\n486#1:521\n486#1:523\n486#1:524\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $accountLabel;
        final /* synthetic */ NotificationBehaviors $behaviors;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $currentUsername;
        final /* synthetic */ boolean $makeOrUpdateShortcut;
        final /* synthetic */ NotificationData $notification;
        final /* synthetic */ Map<String, String> $notificationDataMap;
        final /* synthetic */ boolean $notifyEveryTime;
        final /* synthetic */ boolean $preserveAccountLabel;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ NotificationRenderer this$0;

        /* JADX INFO: renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.notifications.renderer.NotificationRenderer$display$1$1", f = "NotificationRenderer.kt", l = {344}, m = "invokeSuspend")
        public static final class C00391 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ Ref.ObjectRef<String> $iconUrl;
            final /* synthetic */ Ref.ObjectRef<PostProcessor> $postProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00391(Ref.ObjectRef<String> objectRef, Context context, Ref.ObjectRef<PostProcessor> objectRef2, Continuation continuation) {
                super(2, continuation);
                this.$iconUrl = objectRef;
                this.$context = context;
                this.$postProcessor = objectRef2;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00391(this.$iconUrl, this.$context, this.$postProcessor, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                Context context = this.$context;
                Ref.ObjectRef<PostProcessor> objectRef = this.$postProcessor;
                String str = this.$iconUrl.element;
                this.label = 1;
                Object objInvokeSuspend$fetchImage = AnonymousClass1.invokeSuspend$fetchImage(context, objectRef, str, this);
                return objInvokeSuspend$fetchImage == aVar ? aVar : objInvokeSuspend$fetchImage;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX INFO: renamed from: com.discord.notifications.renderer.NotificationRenderer$display$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.notifications.renderer.NotificationRenderer$display$1$2", f = "NotificationRenderer.kt", l = {345}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ NotificationData $notification;
            final /* synthetic */ Ref.ObjectRef<PostProcessor> $postProcessor;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(NotificationData notificationData, Context context, Ref.ObjectRef<PostProcessor> objectRef, Continuation continuation) {
                super(2, continuation);
                this.$notification = notificationData;
                this.$context = context;
                this.$postProcessor = objectRef;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.$notification, this.$context, this.$postProcessor, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                Context context = this.$context;
                Ref.ObjectRef<PostProcessor> objectRef = this.$postProcessor;
                String iconUrlForAvatar = NotificationDataUtilsKt.getIconUrlForAvatar(this.$notification, context);
                this.label = 1;
                Object objInvokeSuspend$fetchImage = AnonymousClass1.invokeSuspend$fetchImage(context, objectRef, iconUrlForAvatar, this);
                return objInvokeSuspend$fetchImage == aVar ? aVar : objInvokeSuspend$fetchImage;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NotificationData notificationData, Context context, NotificationRenderer notificationRenderer, boolean z5, Map<String, String> map, NotificationBehaviors notificationBehaviors, boolean z6, String str, String str2, boolean z7, Continuation continuation) {
            super(2, continuation);
            this.$notification = notificationData;
            this.$context = context;
            this.this$0 = notificationRenderer;
            this.$notifyEveryTime = z5;
            this.$notificationDataMap = map;
            this.$behaviors = notificationBehaviors;
            this.$preserveAccountLabel = z6;
            this.$accountLabel = str;
            this.$currentUsername = str2;
            this.$makeOrUpdateShortcut = z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$fetchImage(Context context, Ref.ObjectRef<PostProcessor> objectRef, String str, Continuation continuation) {
            return FrescoFetchDecodedImageKt.fetchDecodedImage(context, str, objectRef.element, true, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$notification, this.$context, this.this$0, this.$notifyEveryTime, this.$notificationDataMap, this.$behaviors, this.$preserveAccountLabel, this.$accountLabel, this.$currentUsername, this.$makeOrUpdateShortcut, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0398  */
        /* JADX WARN: Code duplicated, block: B:105:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:109:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:112:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:113:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:117:0x0327 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:0x0334 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:120:0x0319 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x0319 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x03a5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0141  */
        /* JADX WARN: Code duplicated, block: B:32:0x019a  */
        /* JADX WARN: Code duplicated, block: B:34:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:40:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:45:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:52:0x0214  */
        /* JADX WARN: Code duplicated, block: B:54:0x022e  */
        /* JADX WARN: Code duplicated, block: B:60:0x0248  */
        /* JADX WARN: Code duplicated, block: B:63:0x025b  */
        /* JADX WARN: Code duplicated, block: B:66:0x027e  */
        /* JADX WARN: Code duplicated, block: B:68:0x0282  */
        /* JADX WARN: Code duplicated, block: B:69:0x0286  */
        /* JADX WARN: Code duplicated, block: B:77:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:79:0x02d5  */
        /* JADX WARN: Code duplicated, block: B:80:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:83:0x030d  */
        /* JADX WARN: Code duplicated, block: B:87:0x031f  */
        /* JADX WARN: Code duplicated, block: B:94:0x033e  */
        /* JADX WARN: Code duplicated, block: B:96:0x034e  */
        /* JADX WARN: Code duplicated, block: B:97:0x0351  */
        /* JADX WARN: Code duplicated, block: B:99:0x0359  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v8, types: [T] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r5v5, types: [int] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [androidx.core.graphics.drawable.IconCompat, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [T, com.discord.image.fresco.postprocessors.PostProcessor$Circle] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            ?? r10;
            Bitmap bitmap;
            Bitmap bitmap2;
            CharSequence content;
            int activeNotificationMessageCount;
            Pair pair;
            Object objStoreRemoteImageViaFileProvider;
            int i7;
            NotificationCompat$Builder notificationBuilderOrCreate;
            boolean z5;
            String str;
            NotificationCompat$Builder legacyNotificationBehaviors;
            NotificationData notificationData;
            Context context;
            NotificationRenderer notificationRenderer;
            Map<String, String> map;
            String str2;
            boolean z6;
            String strM1092getMessageIdN_6c4I0;
            Long l6;
            Bitmap bitmap3;
            Map<String, String> map2;
            boolean z7;
            ArrayList arrayList;
            ?? r5;
            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle;
            ?? r7;
            CharSequence charSequenceI18nFormat$default;
            Notification activeNotification;
            ArrayList<q0> arrayList2;
            ArrayList arrayList3;
            NotificationCompat$MessagingStyle messagingStyle;
            ArrayList arrayList4;
            MessageIdSnowflake messageIdSnowflakeM1162toSnowflakewDbSOA;
            String channelName;
            Integer channelType;
            boolean z10;
            PowerManager powerManager;
            int i10;
            wn.a aVar = wn.a.f22354d;
            int i11 = this.label;
            if (i11 == 0) {
                ib.a.L(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = PostProcessor.Circle.INSTANCE;
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = NotificationDataUtilsKt.getIconUrl(this.$notification, this.$context);
                if (this.$notification.getImageAttachmentUrl() != null) {
                    String imageAttachmentUrl = this.$notification.getImageAttachmentUrl();
                    if (imageAttachmentUrl == null) {
                        r10 = imageAttachmentUrl;
                        r10 = "";
                    }
                    r10 = imageAttachmentUrl;
                    objectRef2.element = r10;
                    objectRef.element = null;
                }
                Deferred[] deferredArr = {b0.d(coroutineScope, null, new C00391(objectRef2, this.$context, objectRef, null), 3), b0.d(coroutineScope, null, new AnonymousClass2(this.$notification, this.$context, objectRef, null), 3)};
                this.label = 1;
                objA = new e(deferredArr).a(this);
                if (objA != aVar) {
                }
                return aVar;
            }
            if (i11 == 1) {
                ib.a.L(obj);
                objA = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = this.I$0;
                content = (CharSequence) this.L$2;
                bitmap2 = (Bitmap) this.L$1;
                bitmap = (Bitmap) this.L$0;
                ib.a.L(obj);
                objStoreRemoteImageViaFileProvider = obj;
            }
            pair = (Pair) objStoreRemoteImageViaFileProvider;
            activeNotificationMessageCount = i7;
            Context context2 = this.$context;
            notificationBuilderOrCreate = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context2, NotificationChannels.INSTANCE.getNotificationChannelId(this.$notification, context2, (Map) this.this$0.getNotifTypeMappings.invoke(this.$context)), NotificationManagerUtilsKt.getActiveNotification(this.$context, NotificationDataUtilsKt.getTag(this.$notification)));
            notificationBuilderOrCreate.g(16, true);
            Notification notification = notificationBuilderOrCreate.N;
            notificationBuilderOrCreate.g(8, !this.$notifyEveryTime);
            notification.icon = NotificationDataUtilsKt.getSmallIcon(this.$notification);
            notificationBuilderOrCreate.D = ColorUtilsKt.getColorCompat(this.$context, com.discord.theme.R.color.brand_500);
            notificationBuilderOrCreate.B = NotificationDataUtilsKt.getNotificationCategory(this.$notification);
            notificationBuilderOrCreate.f1487e = NotificationCompat$Builder.e(NotificationDataUtilsKt.getTitle(this.$notification, this.$context));
            z5 = this.$preserveAccountLabel;
            str = this.$accountLabel;
            if (!z5) {
                notificationBuilderOrCreate.f1497q = NotificationCompat$Builder.e(str);
            }
            notificationBuilderOrCreate.f1488f = NotificationCompat$Builder.e(content);
            notificationBuilderOrCreate.f1502v = NotificationDataUtilsKt.getGroupKey(this.$notification);
            notificationBuilderOrCreate.f1492l = activeNotificationMessageCount;
            notificationBuilderOrCreate.h(bitmap);
            notification.deleteIntent = NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context);
            notificationBuilderOrCreate.f1490h = NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap);
            Intrinsics.checkNotNullExpressionValue(notificationBuilderOrCreate, "setContentIntent(...)");
            Context context3 = this.$context;
            legacyNotificationBehaviors = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(notificationBuilderOrCreate, context3, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, context3));
            legacyNotificationBehaviors.f1484b.clear();
            notificationData = this.$notification;
            context = this.$context;
            notificationRenderer = this.this$0;
            map = this.$notificationDataMap;
            str2 = this.$currentUsername;
            z6 = this.$makeOrUpdateShortcut;
            if (!NotificationDataUtilsKt.isCallRinging(notificationData)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    powerManager = (PowerManager) context.getSystemService(PowerManager.class);
                    KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
                    if (powerManager.isInteractive() || keyguardManager.isKeyguardLocked()) {
                        notificationRenderer.setFullscreenIntent(notificationRenderer.getFullscreenIntent(context, notificationData, map));
                        legacyNotificationBehaviors.f1491i = notificationRenderer.getFullscreenIntent();
                        i10 = 1;
                        legacyNotificationBehaviors.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, true);
                        legacyNotificationBehaviors.g(16, false);
                    } else {
                        i10 = 1;
                    }
                    legacyNotificationBehaviors.f1493m = i10;
                }
                channelName = notificationData.getChannelName();
                Pair pair2 = new Pair(NotificationRenderer.USERNAME, notificationData.getUserUsername());
                if (!NotificationDataUtilsKt.isCall(notificationData)) {
                    channelName = kk.b.k(channelName, ", ", notificationData.getGuildName());
                }
                Pair pair3 = new Pair(NotificationRenderer.CHANNEL_NAME, channelName);
                channelType = notificationData.getChannelType();
                if (channelType == null && channelType.intValue() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                legacyNotificationBehaviors.b(zs.a.f(pair2, pair3, new Pair(NotificationRenderer.IS_DM, Boolean.valueOf(z10))));
            }
            strM1092getMessageIdN_6c4I0 = notificationData.m1092getMessageIdN_6c4I0();
            if (strM1092getMessageIdN_6c4I0 != null || (messageIdSnowflakeM1162toSnowflakewDbSOA = MessageId.m1162toSnowflakewDbSOA(strM1092getMessageIdN_6c4I0)) == null) {
                l6 = null;
            } else {
                l6 = new Long(messageIdSnowflakeM1162toSnowflakewDbSOA.m1178unboximpl());
            }
            bitmap3 = bitmap;
            int i12 = activeNotificationMessageCount;
            legacyNotificationBehaviors.b(zs.a.f(new Pair(NotificationRenderer.LATEST_MESSAGE_ID_KEY, new Long(Math.max(l6 != null ? l6.longValue() : 0L, legacyNotificationBehaviors.d().getLong(NotificationRenderer.LATEST_MESSAGE_ID_KEY, 0L))))));
            if (NotificationDataUtilsKt.shouldUseMessagingStyle(notificationData)) {
                map2 = map;
                if (NotificationDataUtilsKt.shouldUseBigText(notificationData)) {
                    z7 = false;
                    y yVar = new y(0);
                    yVar.f22580f = NotificationCompat$Builder.e(content);
                    legacyNotificationBehaviors.j(yVar);
                }
                List<NotificationCompat$Action> listG = d0.g(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context), NotificationDataUtilsKt.getCallAction(notificationData, context, z7, map2), NotificationDataUtilsKt.getCallAction(notificationData, context, true, map2), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context, i12), NotificationDataUtilsKt.getBotDMMuteAction(notificationData, context));
                arrayList = new ArrayList();
                for (NotificationCompat$Action notificationCompat$Action : listG) {
                    if (notificationCompat$Action != null) {
                        legacyNotificationBehaviors.f1484b.add(notificationCompat$Action);
                    }
                    arrayList.add(legacyNotificationBehaviors);
                }
                Intrinsics.checkNotNullExpressionValue(legacyNotificationBehaviors, "also(...)");
                if (IsMetaQuestKt.isMetaQuest()) {
                    legacyNotificationBehaviors.f1493m = 1;
                }
                if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                    r5 = 4;
                } else {
                    r5 = z7;
                }
                NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), legacyNotificationBehaviors, r5);
                return Unit.f14616a;
            }
            if (str2 != 0) {
                charSequenceI18nFormat$default = str2;
                r7 = 0;
            } else {
                r7 = 0;
                charSequenceI18nFormat$default = I18nUtilsKt.i18nFormat$default(context, I18nMessage.ME, null, 2, null);
            }
            Person person = new Person();
            person.f1519a = charSequenceI18nFormat$default;
            person.f1520b = r7;
            person.f1521c = r7;
            person.f1522d = "me";
            person.f1523e = false;
            person.f1524f = false;
            notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(person);
            notificationCompat$MessagingStyle.f1510h = NotificationDataUtilsKt.getConversationTitle(notificationData);
            notificationCompat$MessagingStyle.f1511i = Boolean.valueOf(NotificationDataUtilsKt.isGroupConversation(notificationData));
            activeNotification = NotificationManagerUtilsKt.getActiveNotification(context, NotificationDataUtilsKt.getTag(notificationData));
            if (activeNotification != null || (messagingStyle = NotificationManagerUtilsKt.getMessagingStyle(activeNotification)) == null || (arrayList4 = messagingStyle.f1507e) == null) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = CollectionsKt.j0(arrayList4);
            }
            if (pair != null) {
                Uri uri = (Uri) pair.f14612d;
                String str3 = (String) pair.f14613e;
                q0 q0Var = new q0("", NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2));
                q0Var.f22548e = str3;
                q0Var.f22549f = uri;
                arrayList2.add(q0Var);
            }
            arrayList2.add(new q0(content, NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2)));
            if (arrayList2.size() > 1) {
                h0.n(arrayList2, new Comparator() { // from class: com.discord.notifications.renderer.NotificationRenderer$display$1$invokeSuspend$lambda$6$lambda$4$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t10) {
                        return tn.a.a(Long.valueOf(((q0) t5).f22545b), Long.valueOf(((q0) t10).f22545b));
                    }
                });
            }
            for (q0 q0Var2 : arrayList2) {
                if (q0Var2 != null) {
                    arrayList3 = notificationCompat$MessagingStyle.f1507e;
                    arrayList3.add(q0Var2);
                    if (arrayList3.size() > 25) {
                        arrayList3.remove(0);
                    }
                }
            }
            legacyNotificationBehaviors.j(notificationCompat$MessagingStyle);
            if (z6) {
                Intrinsics.checkNotNull(legacyNotificationBehaviors);
                map2 = map;
                ShortcutUtilsKt.addShortcut(legacyNotificationBehaviors, context, NotificationDataUtilsKt.getShortcutInfo(notificationData, context, map2, bitmap3, bitmap2));
            } else {
                map2 = map;
            }
            z7 = false;
            List<NotificationCompat$Action> listG2 = d0.g(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context), NotificationDataUtilsKt.getCallAction(notificationData, context, z7, map2), NotificationDataUtilsKt.getCallAction(notificationData, context, true, map2), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context, i12), NotificationDataUtilsKt.getBotDMMuteAction(notificationData, context));
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (notificationCompat$Action != null) {
                    legacyNotificationBehaviors.f1484b.add(notificationCompat$Action);
                }
                arrayList.add(legacyNotificationBehaviors);
            }
            Intrinsics.checkNotNullExpressionValue(legacyNotificationBehaviors, "also(...)");
            if (IsMetaQuestKt.isMetaQuest()) {
                legacyNotificationBehaviors.f1493m = 1;
            }
            if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                r5 = 4;
            } else {
                r5 = z7;
            }
            NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), legacyNotificationBehaviors, r5);
            return Unit.f14616a;
            List list = (List) objA;
            bitmap = (Bitmap) list.get(0);
            bitmap2 = (Bitmap) list.get(1);
            content = NotificationDataUtilsKt.getContent(this.$notification, this.$context, false);
            activeNotificationMessageCount = NotificationManagerUtilsKt.getActiveNotificationMessageCount(this.$context, NotificationDataUtilsKt.getTag(this.$notification)) + 1;
            String ergoImageAttachmentUrl = this.$notification.getErgoImageAttachmentUrl();
            if (ergoImageAttachmentUrl != null) {
                Context context4 = this.$context;
                this.L$0 = bitmap;
                this.L$1 = bitmap2;
                this.L$2 = content;
                this.I$0 = activeNotificationMessageCount;
                this.label = 2;
                objStoreRemoteImageViaFileProvider = NotificationImageCacheKt.storeRemoteImageViaFileProvider(context4, ergoImageAttachmentUrl, this);
                if (objStoreRemoteImageViaFileProvider != aVar) {
                    i7 = activeNotificationMessageCount;
                    pair = (Pair) objStoreRemoteImageViaFileProvider;
                    activeNotificationMessageCount = i7;
                }
                return aVar;
            }
            pair = null;
            Context context5 = this.$context;
            notificationBuilderOrCreate = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context5, NotificationChannels.INSTANCE.getNotificationChannelId(this.$notification, context5, (Map) this.this$0.getNotifTypeMappings.invoke(this.$context)), NotificationManagerUtilsKt.getActiveNotification(this.$context, NotificationDataUtilsKt.getTag(this.$notification)));
            notificationBuilderOrCreate.g(16, true);
            Notification notification2 = notificationBuilderOrCreate.N;
            notificationBuilderOrCreate.g(8, !this.$notifyEveryTime);
            notification2.icon = NotificationDataUtilsKt.getSmallIcon(this.$notification);
            notificationBuilderOrCreate.D = ColorUtilsKt.getColorCompat(this.$context, com.discord.theme.R.color.brand_500);
            notificationBuilderOrCreate.B = NotificationDataUtilsKt.getNotificationCategory(this.$notification);
            notificationBuilderOrCreate.f1487e = NotificationCompat$Builder.e(NotificationDataUtilsKt.getTitle(this.$notification, this.$context));
            z5 = this.$preserveAccountLabel;
            str = this.$accountLabel;
            if (!z5) {
                notificationBuilderOrCreate.f1497q = NotificationCompat$Builder.e(str);
            }
            notificationBuilderOrCreate.f1488f = NotificationCompat$Builder.e(content);
            notificationBuilderOrCreate.f1502v = NotificationDataUtilsKt.getGroupKey(this.$notification);
            notificationBuilderOrCreate.f1492l = activeNotificationMessageCount;
            notificationBuilderOrCreate.h(bitmap);
            notification2.deleteIntent = NotificationDataUtilsKt.getDeletePendingIntent(this.$notification, this.$context);
            notificationBuilderOrCreate.f1490h = NotificationDataUtilsKt.getContentPendingIntent(this.$notification, this.$context, this.$notificationDataMap);
            Intrinsics.checkNotNullExpressionValue(notificationBuilderOrCreate, "setContentIntent(...)");
            Context context6 = this.$context;
            legacyNotificationBehaviors = NotificationManagerUtilsKt.setLegacyNotificationBehaviors(notificationBuilderOrCreate, context6, this.$behaviors, NotificationDataUtilsKt.getSound(this.$notification, context6));
            legacyNotificationBehaviors.f1484b.clear();
            notificationData = this.$notification;
            context = this.$context;
            notificationRenderer = this.this$0;
            map = this.$notificationDataMap;
            str2 = this.$currentUsername;
            z6 = this.$makeOrUpdateShortcut;
            if (!NotificationDataUtilsKt.isCallRinging(notificationData)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    powerManager = (PowerManager) context.getSystemService(PowerManager.class);
                    KeyguardManager keyguardManager2 = (KeyguardManager) context.getSystemService(KeyguardManager.class);
                    if (powerManager.isInteractive()) {
                        notificationRenderer.setFullscreenIntent(notificationRenderer.getFullscreenIntent(context, notificationData, map));
                        legacyNotificationBehaviors.f1491i = notificationRenderer.getFullscreenIntent();
                        i10 = 1;
                        legacyNotificationBehaviors.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, true);
                        legacyNotificationBehaviors.g(16, false);
                    } else {
                        notificationRenderer.setFullscreenIntent(notificationRenderer.getFullscreenIntent(context, notificationData, map));
                        legacyNotificationBehaviors.f1491i = notificationRenderer.getFullscreenIntent();
                        i10 = 1;
                        legacyNotificationBehaviors.g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, true);
                        legacyNotificationBehaviors.g(16, false);
                    }
                    legacyNotificationBehaviors.f1493m = i10;
                }
                channelName = notificationData.getChannelName();
                Pair pair4 = new Pair(NotificationRenderer.USERNAME, notificationData.getUserUsername());
                if (!NotificationDataUtilsKt.isCall(notificationData)) {
                    channelName = kk.b.k(channelName, ", ", notificationData.getGuildName());
                }
                Pair pair5 = new Pair(NotificationRenderer.CHANNEL_NAME, channelName);
                channelType = notificationData.getChannelType();
                if (channelType == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                legacyNotificationBehaviors.b(zs.a.f(pair4, pair5, new Pair(NotificationRenderer.IS_DM, Boolean.valueOf(z10))));
            }
            strM1092getMessageIdN_6c4I0 = notificationData.m1092getMessageIdN_6c4I0();
            if (strM1092getMessageIdN_6c4I0 != null) {
                l6 = null;
            } else {
                l6 = null;
            }
            bitmap3 = bitmap;
            int i13 = activeNotificationMessageCount;
            legacyNotificationBehaviors.b(zs.a.f(new Pair(NotificationRenderer.LATEST_MESSAGE_ID_KEY, new Long(Math.max(l6 != null ? l6.longValue() : 0L, legacyNotificationBehaviors.d().getLong(NotificationRenderer.LATEST_MESSAGE_ID_KEY, 0L))))));
            if (NotificationDataUtilsKt.shouldUseMessagingStyle(notificationData)) {
                map2 = map;
                if (NotificationDataUtilsKt.shouldUseBigText(notificationData)) {
                    z7 = false;
                    y yVar2 = new y(0);
                    yVar2.f22580f = NotificationCompat$Builder.e(content);
                    legacyNotificationBehaviors.j(yVar2);
                }
                List<NotificationCompat$Action> listG3 = d0.g(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context), NotificationDataUtilsKt.getCallAction(notificationData, context, z7, map2), NotificationDataUtilsKt.getCallAction(notificationData, context, true, map2), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context, i13), NotificationDataUtilsKt.getBotDMMuteAction(notificationData, context));
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    if (notificationCompat$Action != null) {
                        legacyNotificationBehaviors.f1484b.add(notificationCompat$Action);
                    }
                    arrayList.add(legacyNotificationBehaviors);
                }
                Intrinsics.checkNotNullExpressionValue(legacyNotificationBehaviors, "also(...)");
                if (IsMetaQuestKt.isMetaQuest()) {
                    legacyNotificationBehaviors.f1493m = 1;
                }
                if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                    r5 = 4;
                } else {
                    r5 = z7;
                }
                NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), legacyNotificationBehaviors, r5);
                return Unit.f14616a;
            }
            if (str2 != 0) {
                charSequenceI18nFormat$default = str2;
                r7 = 0;
            } else {
                r7 = 0;
                charSequenceI18nFormat$default = I18nUtilsKt.i18nFormat$default(context, I18nMessage.ME, null, 2, null);
            }
            Person person2 = new Person();
            person2.f1519a = charSequenceI18nFormat$default;
            person2.f1520b = r7;
            person2.f1521c = r7;
            person2.f1522d = "me";
            person2.f1523e = false;
            person2.f1524f = false;
            notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(person2);
            notificationCompat$MessagingStyle.f1510h = NotificationDataUtilsKt.getConversationTitle(notificationData);
            notificationCompat$MessagingStyle.f1511i = Boolean.valueOf(NotificationDataUtilsKt.isGroupConversation(notificationData));
            activeNotification = NotificationManagerUtilsKt.getActiveNotification(context, NotificationDataUtilsKt.getTag(notificationData));
            if (activeNotification != null) {
                arrayList2 = new ArrayList();
            } else {
                arrayList2 = new ArrayList();
            }
            if (pair != null) {
                Uri uri2 = (Uri) pair.f14612d;
                String str4 = (String) pair.f14613e;
                q0 q0Var3 = new q0("", NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2));
                q0Var3.f22548e = str4;
                q0Var3.f22549f = uri2;
                arrayList2.add(q0Var3);
            }
            arrayList2.add(new q0(content, NotificationDataUtilsKt.getSendTime(notificationData), NotificationDataUtilsKt.getSenderForMessageNotification(notificationData, bitmap2)));
            if (arrayList2.size() > 1) {
                h0.n(arrayList2, new Comparator() { // from class: com.discord.notifications.renderer.NotificationRenderer$display$1$invokeSuspend$lambda$6$lambda$4$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t10) {
                        return tn.a.a(Long.valueOf(((q0) t5).f22545b), Long.valueOf(((q0) t10).f22545b));
                    }
                });
            }
            while (r2.hasNext()) {
                if (q0Var2 != null) {
                    arrayList3 = notificationCompat$MessagingStyle.f1507e;
                    arrayList3.add(q0Var2);
                    if (arrayList3.size() > 25) {
                        arrayList3.remove(0);
                    }
                }
            }
            legacyNotificationBehaviors.j(notificationCompat$MessagingStyle);
            if (z6) {
                Intrinsics.checkNotNull(legacyNotificationBehaviors);
                map2 = map;
                ShortcutUtilsKt.addShortcut(legacyNotificationBehaviors, context, NotificationDataUtilsKt.getShortcutInfo(notificationData, context, map2, bitmap3, bitmap2));
            } else {
                map2 = map;
            }
            z7 = false;
            List<NotificationCompat$Action> listG4 = d0.g(NotificationDataUtilsKt.getMarkAsReadAction(notificationData, context), NotificationDataUtilsKt.getDirectReplyAction(notificationData, context), NotificationDataUtilsKt.getCallAction(notificationData, context, z7, map2), NotificationDataUtilsKt.getCallAction(notificationData, context, true, map2), NotificationDataUtilsKt.getTimedMuteAction(notificationData, context, i13), NotificationDataUtilsKt.getBotDMMuteAction(notificationData, context));
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (notificationCompat$Action != null) {
                    legacyNotificationBehaviors.f1484b.add(notificationCompat$Action);
                }
                arrayList.add(legacyNotificationBehaviors);
            }
            Intrinsics.checkNotNullExpressionValue(legacyNotificationBehaviors, "also(...)");
            if (IsMetaQuestKt.isMetaQuest()) {
                legacyNotificationBehaviors.f1493m = 1;
            }
            if (NotificationDataUtilsKt.isCallRinging(this.$notification)) {
                r5 = 4;
            } else {
                r5 = z7;
            }
            NotificationManagerUtilsKt.notify(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(this.$notification), legacyNotificationBehaviors, r5);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.notifications.renderer.NotificationRenderer$displayLocal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.renderer.NotificationRenderer$displayLocal$1", f = "NotificationRenderer.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nNotificationRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer$displayLocal$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,506:1\n216#2,2:507\n*S KotlinDebug\n*F\n+ 1 NotificationRenderer.kt\ncom/discord/notifications/renderer/NotificationRenderer$displayLocal$1\n*L\n252#1:507,2\n*E\n"})
    public static final class C02071 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Map<String, Object> $notification;
        int label;
        final /* synthetic */ NotificationRenderer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02071(Map<String, ? extends Object> map, Context context, NotificationRenderer notificationRenderer, Continuation continuation) {
            super(2, continuation);
            this.$notification = map;
            this.$context = context;
            this.this$0 = notificationRenderer;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C02071(this.$notification, this.$context, this.this$0, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            NotificationData notificationDataLocalNotificationData = NotificationDataDeserializationUtilsKt.localNotificationData(NotificationData.INSTANCE, this.$notification);
            LinkedHashMap linkedHashMapN = w0.n(notificationDataLocalNotificationData.getUserInfo());
            for (Map.Entry<String, Object> entry : this.$notification.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMapN.put(key, value);
                }
            }
            Context context = this.$context;
            NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(context, NotificationChannels.INSTANCE.getNotificationChannelId(notificationDataLocalNotificationData, context, (Map) this.this$0.getNotifTypeMappings.invoke(this.$context)));
            notificationCompat$Builder.N.icon = NotificationDataUtilsKt.getSmallIcon(notificationDataLocalNotificationData);
            notificationCompat$Builder.D = ColorUtilsKt.getColorCompat(this.$context, com.discord.theme.R.color.brand_500);
            notificationCompat$Builder.B = NotificationDataUtilsKt.getNotificationCategory(notificationDataLocalNotificationData);
            notificationCompat$Builder.f1487e = NotificationCompat$Builder.e(notificationDataLocalNotificationData.getTitle());
            notificationCompat$Builder.f1488f = NotificationCompat$Builder.e(notificationDataLocalNotificationData.getSubtitle());
            notificationCompat$Builder.f1502v = NotificationDataUtilsKt.getGroupKey(notificationDataLocalNotificationData);
            notificationCompat$Builder.O = notificationDataLocalNotificationData.getSilent();
            notificationCompat$Builder.f1493m = 0;
            notificationCompat$Builder.f1490h = NotificationDataUtilsKt.getContentPendingIntent(notificationDataLocalNotificationData, this.$context, linkedHashMapN);
            notificationCompat$Builder.g(16, true);
            Intrinsics.checkNotNullExpressionValue(notificationCompat$Builder, "setAutoCancel(...)");
            NotificationManagerUtilsKt.notify$default(NotificationManagerUtilsKt.getNotificationManagerCompat(this.$context), NotificationDataUtilsKt.getTag(notificationDataLocalNotificationData), notificationCompat$Builder, 0, 4, null);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02071) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationRenderer(@NotNull Function1<? super Context, ? extends Map<Integer, String>> getNotifTypeMappings) {
        Intrinsics.checkNotNullParameter(getNotifTypeMappings, "getNotifTypeMappings");
        this.getNotifTypeMappings = getNotifTypeMappings;
    }

    public final void clear(@NotNull Context context, @NotNull String notificationTag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notificationTag, "notificationTag");
        NotificationManagerUtilsKt.getNotificationManagerCompat(context).f1518b.cancel(notificationTag, 0);
    }

    public final void clearAllNotifications(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManagerUtilsKt.getNotificationManagerCompat(context).f1518b.cancelAll();
    }

    public final void display(@NotNull Context context, @NotNull NotificationData notification, String currentUsername, @NotNull Map<String, String> notificationDataMap, NotificationBehaviors behaviors, boolean makeOrUpdateShortcut, boolean notifyEveryTime, String accountLabel, boolean preserveAccountLabel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(notificationDataMap, "notificationDataMap");
        b0.w(g.f14681d, new AnonymousClass1(notification, context, this, notifyEveryTime, notificationDataMap, behaviors, preserveAccountLabel, accountLabel, currentUsername, makeOrUpdateShortcut, null));
    }

    public final void displayLocal(@NotNull Context context, @NotNull Map<String, ? extends Object> notification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        b0.w(g.f14681d, new C02071(notification, context, this, null));
    }

    public final PendingIntent getFullscreenIntent() {
        return this.fullscreenIntent;
    }

    public final void handleAcks(@NotNull Context context, @NotNull NotificationData notification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        long jFromTimestamp = SnowflakeUtils.INSTANCE.fromTimestamp(notification.getSentAtMillis());
        Iterator<ChannelId> it = notification.getAckChannelIds().iterator();
        while (it.hasNext()) {
            String strL = a3.e.l(NotificationData.TYPE_MESSAGE_CREATE, ChannelId.m1137toStringimpl(it.next().m1139unboximpl()));
            NotificationChannels notificationChannels = NotificationChannels.INSTANCE;
            NotificationCompat$Builder notificationBuilderOrCreate = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, notificationChannels.getNotificationChannelId(notification, context, (Map) this.getNotifTypeMappings.invoke(context)), NotificationManagerUtilsKt.getActiveNotification(context, strL));
            if (notificationBuilderOrCreate.d().getLong(LATEST_MESSAGE_ID_KEY, 0L) <= jFromTimestamp) {
                if (notificationBuilderOrCreate.d().getBoolean(IGNORE_ACK_KEY, false)) {
                    markNotificationAsDirectReply(context, strL, notificationChannels.getNotificationChannelId(notification, context, (Map) this.getNotifTypeMappings.invoke(context)), false);
                } else {
                    clear(context, strL);
                }
            }
        }
    }

    public final void handleCallAck(@NotNull Context context, @NotNull List<ChannelId> channelIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelIds, "channelIds");
        if (Build.VERSION.SDK_INT < 26 || channelIds.isEmpty()) {
            return;
        }
        for (ChannelId channelId : channelIds) {
            if (channelId != null) {
                List<StatusBarNotification> listM1116getCallNotificationsmJqaSGE = NotificationManagerUtilsKt.m1116getCallNotificationsmJqaSGE(context, channelId.m1139unboximpl());
                if (listM1116getCallNotificationsmJqaSGE != null) {
                    Iterator<T> it = listM1116getCallNotificationsmJqaSGE.iterator();
                    while (it.hasNext()) {
                        String tag = ((StatusBarNotification) it.next()).getTag();
                        Intrinsics.checkNotNullExpressionValue(tag, "getTag(...)");
                        clear(context, tag);
                    }
                }
                IncomingCallActivity.Companion companion = IncomingCallActivity.INSTANCE;
                if (companion.getSelfIntent() != null) {
                    IncomingCallActivity selfIntent = companion.getSelfIntent();
                    Intrinsics.checkNotNull(selfIntent);
                    selfIntent.finishAndRemoveTask();
                }
            }
        }
    }

    public final void handleCallRingEnd(@NotNull Context context, @NotNull List<ChannelId> channelIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelIds, "channelIds");
        if (Build.VERSION.SDK_INT < 26 || channelIds.isEmpty()) {
            return;
        }
        for (ChannelId channelId : channelIds) {
            if (channelId != null) {
                List<StatusBarNotification> listM1116getCallNotificationsmJqaSGE = NotificationManagerUtilsKt.m1116getCallNotificationsmJqaSGE(context, channelId.m1139unboximpl());
                if (listM1116getCallNotificationsmJqaSGE != null) {
                    for (StatusBarNotification statusBarNotification : listM1116getCallNotificationsmJqaSGE) {
                        String string = statusBarNotification.getNotification().extras.getString(USERNAME);
                        if (string == null) {
                            return;
                        }
                        String string2 = statusBarNotification.getNotification().extras.getString(CHANNEL_NAME);
                        String missedCallText = NotificationDataUtilsKt.getMissedCallText(context, string, statusBarNotification.getNotification().extras.getBoolean(IS_DM));
                        String channelId2 = statusBarNotification.getNotification().getChannelId();
                        Intrinsics.checkNotNullExpressionValue(channelId2, "getChannelId(...)");
                        NotificationCompat$Builder notificationBuilderOrCreate = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, channelId2, statusBarNotification.getNotification());
                        notificationBuilderOrCreate.G = NotificationChannels.INSTANCE.getSilenceCallChannelId();
                        notificationBuilderOrCreate.f1488f = NotificationCompat$Builder.e(missedCallText);
                        if (string2 != null) {
                            string = string2;
                        }
                        notificationBuilderOrCreate.f1487e = NotificationCompat$Builder.e(string);
                        notificationBuilderOrCreate.f1484b.clear();
                        NotificationManagerCompat notificationManagerCompat = NotificationManagerUtilsKt.getNotificationManagerCompat(context);
                        String tag = statusBarNotification.getTag();
                        Intrinsics.checkNotNullExpressionValue(tag, "getTag(...)");
                        NotificationManagerUtilsKt.notify$default(notificationManagerCompat, tag, notificationBuilderOrCreate, 0, 4, null);
                    }
                }
                IncomingCallActivity.Companion companion = IncomingCallActivity.INSTANCE;
                if (companion.getSelfIntent() != null) {
                    IncomingCallActivity selfIntent = companion.getSelfIntent();
                    Intrinsics.checkNotNull(selfIntent);
                    selfIntent.finishAndRemoveTask();
                }
            }
        }
    }

    public final void handleReactionAcks(@NotNull Context context, @NotNull String channelId) {
        List<StatusBarNotification> activeReactionNotifications;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        if (Build.VERSION.SDK_INT >= 26 && (activeReactionNotifications = NotificationManagerUtilsKt.getActiveReactionNotifications(context, channelId)) != null) {
            for (StatusBarNotification statusBarNotification : activeReactionNotifications) {
                String channelId2 = statusBarNotification.getNotification().getChannelId();
                Intrinsics.checkNotNullExpressionValue(channelId2, "getChannelId(...)");
                if (!NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, channelId2, statusBarNotification.getNotification()).d().getBoolean(IGNORE_ACK_KEY, false)) {
                    String tag = statusBarNotification.getTag();
                    Intrinsics.checkNotNullExpressionValue(tag, "getTag(...)");
                    clear(context, tag);
                }
            }
        }
    }

    public final void initFresco(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrescoModuleDiscord.INSTANCE.initializeFresco(context);
    }

    public final void initIconUrlUtils(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IconUrlUtils.init$default(IconUrlUtils.INSTANCE, context, null, null, 6, null);
    }

    public final void initNotificationCategories(@NotNull Context context, @NotNull Map<String, String> localizedCategoryNames, @NotNull Map<String, String> localizedGroupNames) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localizedCategoryNames, "localizedCategoryNames");
        Intrinsics.checkNotNullParameter(localizedGroupNames, "localizedGroupNames");
        NotificationChannels.INSTANCE.init(context, localizedCategoryNames, localizedGroupNames);
    }

    public final void initNotificationGroupsAndChannels(@NotNull Context context, @NotNull List<ConfiguredNotifGroup> groups, @NotNull List<ConfiguredNotifChannel> channels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(channels, "channels");
        NotificationChannels.INSTANCE.initNotificationGroupsAndChannels(context, groups, channels);
    }

    public final void markNotificationAsDirectReply(@NotNull Context context, @NotNull String tag, @NotNull String channelId, boolean shouldIgnoreAck) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Notification activeNotification = NotificationManagerUtilsKt.getActiveNotification(context, tag);
        if (activeNotification != null) {
            NotificationCompat$Builder notificationBuilderOrCreate = NotificationManagerUtilsKt.getNotificationBuilderOrCreate(context, channelId, activeNotification);
            notificationBuilderOrCreate.b(zs.a.f(new Pair(IGNORE_ACK_KEY, Boolean.valueOf(shouldIgnoreAck))));
            Intrinsics.checkNotNullExpressionValue(notificationBuilderOrCreate, "addExtras(...)");
            NotificationManagerUtilsKt.notify$default(NotificationManagerUtilsKt.getNotificationManagerCompat(context), tag, notificationBuilderOrCreate, 0, 4, null);
        }
    }

    public final void setFullscreenIntent(PendingIntent pendingIntent) {
        this.fullscreenIntent = pendingIntent;
    }

    public final void setIncomingRingtone(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        NotificationChannels.INSTANCE.setIncomingRingtone(context, name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    public final PendingIntent getFullscreenIntent(Context context, NotificationData notification, Map<String, String> notificationDataMap) {
        boolean z5;
        Intent intentAddFlags = new Intent(context, (Class<?>) IncomingCallActivity.class).addFlags(268468224);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        Pair pair = new Pair(USERNAME, notification.getUserUsername());
        Pair pair2 = new Pair(CHANNEL_NAME, NotificationDataUtilsKt.isCall(notification) ? notification.getChannelName() : kk.b.k(notification.getChannelName(), ", ", notification.getGuildName()));
        Integer channelType = notification.getChannelType();
        if (channelType != null) {
            z5 = channelType.intValue() == 1;
        }
        Pair pair3 = new Pair(IS_DM, Boolean.valueOf(z5));
        Pair pair4 = new Pair("userAvatar", notification.getUserAvatar());
        Pair pair5 = new Pair("userDiscriminator", notification.getUserDiscriminator());
        Pair pair6 = new Pair("userId", String.valueOf(notification.m1095getUserIdwUX8bhU()));
        Pair pair7 = new Pair("guildId", String.valueOf(notification.m1091getGuildIdqOKuAAo()));
        Pair pair8 = new Pair("userGuildAvatar", notification.getUserGuildAvatar());
        String tag = NotificationDataUtilsKt.getTag(notification);
        LinkedHashMap linkedHashMapN = w0.n(notificationDataMap);
        linkedHashMapN.put("type", NotificationData.TYPE_CALL_CONNECT);
        linkedHashMapN.put("is_fullscreen_call_ui", "true");
        Unit unit = Unit.f14616a;
        Pair pair9 = new Pair("acceptAction", new ContentAction(tag, linkedHashMapN));
        String tag2 = NotificationDataUtilsKt.getTag(notification);
        ChannelId channelIdM1090getChannelIdqMVnFVQ = notification.m1090getChannelIdqMVnFVQ();
        Intrinsics.checkNotNull(channelIdM1090getChannelIdqMVnFVQ);
        long jM1139unboximpl = channelIdM1090getChannelIdqMVnFVQ.m1139unboximpl();
        GuildId guildIdM1091getGuildIdqOKuAAo = notification.m1091getGuildIdqOKuAAo();
        UserId userIdM1095getUserIdwUX8bhU = notification.m1095getUserIdwUX8bhU();
        Intrinsics.checkNotNull(userIdM1095getUserIdwUX8bhU);
        intentAddFlags.putExtras(zs.a.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("dismissAction", new DismissCallAction(tag2, jM1139unboximpl, true, guildIdM1091getGuildIdqOKuAAo, userIdM1095getUserIdwUX8bhU.m1217unboximpl(), null))));
        return PendingIntent.getActivity(context, 0, intentAddFlags, 335544320);
    }
}
