package com.discord.notifications.renderer;

import android.app.KeyguardManager;
import android.app.KeyguardManager$KeyguardDismissCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import ar.b0;
import ar.e;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.icons.IconUrlUtils;
import com.discord.image.fresco.FrescoFetchDecodedImageKt;
import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.notifications.actions.NotificationActions;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.DismissCallAction;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_activities.ReactActivity;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetExtensionsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.snowflake.SnowflakeUtils;
import com.discord.telecom.TelecomModule;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.discord.tti_manager.TTIModule;
import i.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import xn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001)\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u0003JG\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0014¢\u0006\u0004\b%\u0010\u0003R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/discord/notifications/renderer/IncomingCallActivity;", "Li/h;", "<init>", "()V", "", "turnScreenOnAndKeyguardOff", "turnScreenOffAndKeyguardOn", "initView", "", "uri", "Landroid/graphics/Bitmap;", "fetchImage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureUser", "configureActions", "Landroid/content/Context;", "context", "userGuildAvatar", "Lcom/discord/primitives/GuildId;", "guildId", "Lcom/discord/primitives/UserId;", "userId", "userAvatar", "", "userDiscriminator", "getIconUrlForAvatar-r1nfqec", "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Ljava/lang/String;I)Ljava/lang/String;", "getIconUrlForAvatar", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "performAcceptAction$notification_renderer_release", "performAcceptAction", "onDestroy", "Lcom/discord/notifications/actions/intents/ContentAction;", "acceptAction", "Lcom/discord/notifications/actions/intents/ContentAction;", "com/discord/notifications/renderer/IncomingCallActivity$screenOffReceiver$1", "screenOffReceiver", "Lcom/discord/notifications/renderer/IncomingCallActivity$screenOffReceiver$1;", "Companion", "notification_renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIncomingCallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncomingCallActivity.kt\ncom/discord/notifications/renderer/IncomingCallActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1#2:312\n*E\n"})
public final class IncomingCallActivity extends h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static IncomingCallActivity selfIntent;
    private ContentAction acceptAction;

    @NotNull
    private final IncomingCallActivity$screenOffReceiver$1 screenOffReceiver = new BroadcastReceiver() { // from class: com.discord.notifications.renderer.IncomingCallActivity$screenOffReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finishAndRemoveTask();
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/discord/notifications/renderer/IncomingCallActivity$Companion;", "", "<init>", "()V", "selfIntent", "Lcom/discord/notifications/renderer/IncomingCallActivity;", "getSelfIntent", "()Lcom/discord/notifications/renderer/IncomingCallActivity;", "setSelfIntent", "(Lcom/discord/notifications/renderer/IncomingCallActivity;)V", "notification_renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IncomingCallActivity getSelfIntent() {
            return IncomingCallActivity.selfIntent;
        }

        public final void setSelfIntent(IncomingCallActivity incomingCallActivity) {
            IncomingCallActivity.selfIntent = incomingCallActivity;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$configureActions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.renderer.IncomingCallActivity$configureActions$1", f = "IncomingCallActivity.kt", l = {189}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nIncomingCallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncomingCallActivity.kt\ncom/discord/notifications/renderer/IncomingCallActivity$configureActions$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,311:1\n70#2,2:312\n70#2,2:314\n*S KotlinDebug\n*F\n+ 1 IncomingCallActivity.kt\ncom/discord/notifications/renderer/IncomingCallActivity$configureActions$1\n*L\n194#1:312,2\n198#1:314,2\n*E\n"})
    public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$configureActions$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.notifications.renderer.IncomingCallActivity$configureActions$1$1", f = "IncomingCallActivity.kt", l = {190}, m = "invokeSuspend")
        public static final class C00371 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ String $callDisconnectUrl;
            int label;
            final /* synthetic */ IncomingCallActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00371(IncomingCallActivity incomingCallActivity, String str, Continuation continuation) {
                super(2, continuation);
                this.this$0 = incomingCallActivity;
                this.$callDisconnectUrl = str;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00371(this.this$0, this.$callDisconnectUrl, continuation);
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
                IncomingCallActivity incomingCallActivity = this.this$0;
                String str = this.$callDisconnectUrl;
                this.label = 1;
                Object objFetchImage = incomingCallActivity.fetchImage(str, this);
                return objFetchImage == aVar ? aVar : objFetchImage;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$configureActions$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.notifications.renderer.IncomingCallActivity$configureActions$1$2", f = "IncomingCallActivity.kt", l = {191}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ String $callConnectUrl;
            int label;
            final /* synthetic */ IncomingCallActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(IncomingCallActivity incomingCallActivity, String str, Continuation continuation) {
                super(2, continuation);
                this.this$0 = incomingCallActivity;
                this.$callConnectUrl = str;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.this$0, this.$callConnectUrl, continuation);
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
                IncomingCallActivity incomingCallActivity = this.this$0;
                String str = this.$callConnectUrl;
                this.label = 1;
                Object objFetchImage = incomingCallActivity.fetchImage(str, this);
                return objFetchImage == aVar ? aVar : objFetchImage;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(IncomingCallActivity incomingCallActivity, DismissCallAction dismissCallAction, View view) {
            Intent intentAddCategory = IntentUtilsKt.putExtra(new Intent("com.discord.intent.action.NOTIFICATION_ACTION", null, incomingCallActivity.getBaseContext(), NotificationActions.class), Reflection.getOrCreateKotlinClass(DismissCallAction.class)).addCategory("android.intent.category.HOME");
            Intrinsics.checkNotNullExpressionValue(intentAddCategory, "addCategory(...)");
            incomingCallActivity.getBaseContext().sendBroadcast(IntentUtilsKt.putIntentParcelable(intentAddCategory, "action_intent_arg_key", dismissCallAction));
            incomingCallActivity.finishAndRemoveTask();
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = IncomingCallActivity.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            final DismissCallAction dismissCallAction;
            ImageButton imageButton;
            ImageButton imageButton2;
            TextView textView;
            int i7;
            ?? r5;
            Object objA;
            TextView textView2;
            wn.a aVar = wn.a.f22354d;
            int i10 = this.label;
            if (i10 == 0) {
                ib.a.L(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                IncomingCallActivity incomingCallActivity = IncomingCallActivity.this;
                Object parcelableExtra = incomingCallActivity.getIntent().getParcelableExtra("acceptAction", ContentAction.class);
                Intrinsics.checkNotNull(parcelableExtra, "null cannot be cast to non-null type com.discord.notifications.actions.intents.ContentAction");
                incomingCallActivity.acceptAction = (ContentAction) parcelableExtra;
                Object parcelableExtra2 = IncomingCallActivity.this.getIntent().getParcelableExtra("dismissAction", DismissCallAction.class);
                Intrinsics.checkNotNull(parcelableExtra2, "null cannot be cast to non-null type com.discord.notifications.actions.intents.DismissCallAction");
                dismissCallAction = (DismissCallAction) parcelableExtra2;
                imageButton = (ImageButton) IncomingCallActivity.this.findViewById(R.id.acceptCallContainer);
                imageButton2 = (ImageButton) IncomingCallActivity.this.findViewById(R.id.declineCallContainer);
                textView = (TextView) IncomingCallActivity.this.findViewById(R.id.acceptCallText);
                TextView textView3 = (TextView) IncomingCallActivity.this.findViewById(R.id.declineCallText);
                Context applicationContext = IncomingCallActivity.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                ReactAsset reactAsset = ReactAsset.PhoneHangUpIcon;
                Context applicationContext2 = IncomingCallActivity.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                String reactImageUrl = ReactAssetUtilsKt.getReactImageUrl(applicationContext, ReactAssetExtensionsKt.getUri(reactAsset, applicationContext2));
                Context applicationContext3 = IncomingCallActivity.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                ReactAsset reactAsset2 = ReactAsset.PhoneCallIcon;
                i7 = 0;
                Context applicationContext4 = IncomingCallActivity.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
                Deferred[] deferredArr = {b0.d(coroutineScope, null, new C00371(IncomingCallActivity.this, reactImageUrl, null), 3), b0.d(coroutineScope, null, new AnonymousClass2(IncomingCallActivity.this, ReactAssetUtilsKt.getReactImageUrl(applicationContext3, ReactAssetExtensionsKt.getUri(reactAsset2, applicationContext4)), null), 3)};
                this.L$0 = dismissCallAction;
                this.L$1 = imageButton;
                this.L$2 = imageButton2;
                this.L$3 = textView;
                this.L$4 = textView3;
                r5 = 1;
                this.label = 1;
                objA = new e(deferredArr).a(this);
                if (objA == aVar) {
                    return aVar;
                }
                textView2 = textView3;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                textView2 = (TextView) this.L$4;
                TextView textView4 = (TextView) this.L$3;
                imageButton2 = (ImageButton) this.L$2;
                imageButton = (ImageButton) this.L$1;
                dismissCallAction = (DismissCallAction) this.L$0;
                ib.a.L(obj);
                objA = obj;
                textView = textView4;
                r5 = 1;
                i7 = 0;
            }
            List list = (List) objA;
            Bitmap bitmap = (Bitmap) list.get(i7);
            Bitmap bitmap2 = (Bitmap) list.get(r5);
            Intrinsics.checkNotNull(bitmap);
            imageButton2.setImageBitmap(Bitmap.createScaledBitmap(bitmap, 110, 110, r5));
            imageButton2.setImageTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getWhite()));
            Intrinsics.checkNotNull(bitmap2);
            imageButton.setImageBitmap(Bitmap.createScaledBitmap(bitmap2, 110, 110, r5));
            imageButton.setImageTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getWhite()));
            imageButton.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getStatusPositive()));
            imageButton2.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundFeedbackCritical()));
            Context applicationContext5 = IncomingCallActivity.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext5, "getApplicationContext(...)");
            CharSequence charSequenceI18nFormat$default = I18nUtilsKt.i18nFormat$default(applicationContext5, I18nMessage.JOIN_CALL, null, 2, null);
            Context applicationContext6 = IncomingCallActivity.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext6, "getApplicationContext(...)");
            CharSequence charSequenceI18nFormat$default2 = I18nUtilsKt.i18nFormat$default(applicationContext6, I18nMessage.DECLINE, null, 2, null);
            imageButton.setContentDescription(charSequenceI18nFormat$default);
            imageButton2.setContentDescription(charSequenceI18nFormat$default2);
            textView.setText(charSequenceI18nFormat$default);
            Intrinsics.checkNotNull(textView);
            DiscordFont discordFont = DiscordFont.PrimaryMedium;
            DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
            textView.setTextColor(ThemeManagerKt.getTheme().getWhite());
            textView2.setText(charSequenceI18nFormat$default2);
            Intrinsics.checkNotNull(textView2);
            DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
            textView2.setTextColor(ThemeManagerKt.getTheme().getWhite());
            final IncomingCallActivity incomingCallActivity2 = IncomingCallActivity.this;
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.discord.notifications.renderer.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    incomingCallActivity2.performAcceptAction$notification_renderer_release();
                }
            });
            final IncomingCallActivity incomingCallActivity3 = IncomingCallActivity.this;
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.discord.notifications.renderer.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IncomingCallActivity.AnonymousClass1.invokeSuspend$lambda$1(incomingCallActivity3, dismissCallAction, view);
                }
            });
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$configureUser$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.renderer.IncomingCallActivity$configureUser$1", f = "IncomingCallActivity.kt", l = {169}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nIncomingCallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncomingCallActivity.kt\ncom/discord/notifications/renderer/IncomingCallActivity$configureUser$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1#2:312\n*E\n"})
    public static final class C02041 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$configureUser$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.notifications.renderer.IncomingCallActivity$configureUser$1$1", f = "IncomingCallActivity.kt", l = {170}, m = "invokeSuspend")
        public static final class C00381 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ GuildId $guildId;
            final /* synthetic */ String $userAvatar;
            final /* synthetic */ int $userDiscriminator;
            final /* synthetic */ String $userGuildAvatar;
            final /* synthetic */ UserId $userId;
            int label;
            final /* synthetic */ IncomingCallActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00381(IncomingCallActivity incomingCallActivity, String str, GuildId guildId, UserId userId, String str2, int i7, Continuation continuation) {
                super(2, continuation);
                this.this$0 = incomingCallActivity;
                this.$userGuildAvatar = str;
                this.$guildId = guildId;
                this.$userId = userId;
                this.$userAvatar = str2;
                this.$userDiscriminator = i7;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00381(this.this$0, this.$userGuildAvatar, this.$guildId, this.$userId, this.$userAvatar, this.$userDiscriminator, continuation);
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
                IncomingCallActivity incomingCallActivity = this.this$0;
                Context applicationContext = incomingCallActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                String strM1113getIconUrlForAvatarr1nfqec = incomingCallActivity.m1113getIconUrlForAvatarr1nfqec(applicationContext, this.$userGuildAvatar, this.$guildId, this.$userId, this.$userAvatar, this.$userDiscriminator);
                this.label = 1;
                Object objFetchImage = incomingCallActivity.fetchImage(strM1113getIconUrlForAvatarr1nfqec, this);
                return objFetchImage == aVar ? aVar : objFetchImage;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00381) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        public C02041(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            C02041 c02041 = IncomingCallActivity.this.new C02041(continuation);
            c02041.L$0 = obj;
            return c02041;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            Long snowflake;
            Long snowflake2;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String stringExtra = IncomingCallActivity.this.getIntent().getStringExtra(NotificationRenderer.USERNAME);
                String stringExtra2 = IncomingCallActivity.this.getIntent().getStringExtra("userId");
                UserId userIdM1208boximpl = (stringExtra2 == null || (snowflake2 = SnowflakeUtils.INSTANCE.toSnowflake(stringExtra2)) == null) ? null : UserId.m1208boximpl(UserId.m1209constructorimpl(snowflake2.longValue()));
                String stringExtra3 = IncomingCallActivity.this.getIntent().getStringExtra("userAvatar");
                String stringExtra4 = IncomingCallActivity.this.getIntent().getStringExtra("userGuildAvatar");
                int intExtra = IncomingCallActivity.this.getIntent().getIntExtra("userDiscriminator", 0);
                String stringExtra5 = IncomingCallActivity.this.getIntent().getStringExtra("guildId");
                GuildId guildIdM1143boximpl = (stringExtra5 == null || (snowflake = SnowflakeUtils.INSTANCE.toSnowflake(stringExtra5)) == null) ? null : GuildId.m1143boximpl(GuildId.m1144constructorimpl(snowflake.longValue()));
                TextView textView = (TextView) IncomingCallActivity.this.findViewById(R.id.userName);
                textView.setText(stringExtra);
                Intrinsics.checkNotNull(textView);
                DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
                textView.setTextColor(ThemeManagerKt.getTheme().getWhite());
                Deferred[] deferredArr = {b0.d(coroutineScope, null, new C00381(IncomingCallActivity.this, stringExtra4, guildIdM1143boximpl, userIdM1208boximpl, stringExtra3, intExtra, null), 3)};
                this.label = 1;
                obj = new e(deferredArr).a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            ((ImageView) IncomingCallActivity.this.findViewById(R.id.imageView)).setImageBitmap((Bitmap) ((List) obj).get(0));
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02041) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$initView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.notifications.renderer.IncomingCallActivity$initView$1", f = "IncomingCallActivity.kt", l = {}, m = "invokeSuspend")
    public static final class C02051 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public C02051(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return IncomingCallActivity.this.new C02051(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            wn.a aVar = wn.a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            boolean booleanExtra = IncomingCallActivity.this.getIntent().getBooleanExtra(NotificationRenderer.IS_DM, false);
            String stringExtra = IncomingCallActivity.this.getIntent().getStringExtra(NotificationRenderer.CHANNEL_NAME);
            View contentView = ActivityExtensionsKt.getContentView(IncomingCallActivity.this);
            if (contentView == null) {
                return Unit.f14616a;
            }
            contentView.setBackgroundColor(ThemeManagerKt.getTheme().getControlPrimaryBackgroundDefault());
            ViewBackgroundUtilsKt.setBackgroundDrawableRes(contentView, R.drawable.incoming_call_gradient);
            IncomingCallActivity.this.configureUser();
            TextView textView = (TextView) IncomingCallActivity.this.findViewById(R.id.textView);
            Context applicationContext = IncomingCallActivity.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            textView.setText(I18nUtilsKt.i18nFormat$default(applicationContext, I18nMessage.INCOMING_CALL, null, 2, null));
            Intrinsics.checkNotNull(textView);
            DiscordFont discordFont = DiscordFont.PrimaryMedium;
            DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
            Context applicationContext2 = IncomingCallActivity.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            textView.setTextColor(ColorUtilsKt.getColorCompat(applicationContext2, com.discord.theme.R.color.primary_330));
            if (!booleanExtra) {
                TextView textView2 = (TextView) IncomingCallActivity.this.findViewById(R.id.channelName);
                textView2.setText(stringExtra);
                Intrinsics.checkNotNull(textView2);
                DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
                Context applicationContext3 = IncomingCallActivity.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                textView2.setTextColor(ColorUtilsKt.getColorCompat(applicationContext3, com.discord.theme.R.color.primary_330));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                IncomingCallActivity.this.configureActions();
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C02051) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.notifications.renderer.IncomingCallActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class C02061 extends FunctionReferenceImpl implements Function0<Unit> {
        public C02061(Object obj) {
            super(0, obj, IncomingCallActivity.class, "performAcceptAction", "performAcceptAction$notification_renderer_release()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1114invoke();
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1114invoke() {
            ((IncomingCallActivity) this.receiver).performAcceptAction$notification_renderer_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureActions() throws Throwable {
        b0.w(g.f14681d, new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureUser() throws Throwable {
        b0.w(g.f14681d, new C02041(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchImage(String str, Continuation continuation) {
        FrescoModuleDiscord.Companion companion = FrescoModuleDiscord.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.initializeFresco(applicationContext);
        Context applicationContext2 = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        return FrescoFetchDecodedImageKt.fetchDecodedImage(applicationContext2, str, (PostProcessor) PostProcessor.Circle.INSTANCE, true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getIconUrlForAvatar-r1nfqec, reason: not valid java name */
    public final String m1113getIconUrlForAvatarr1nfqec(Context context, String userGuildAvatar, GuildId guildId, UserId userId, String userAvatar, int userDiscriminator) {
        IconUrlUtils iconUrlUtils = IconUrlUtils.INSTANCE;
        IconUrlUtils.init$default(iconUrlUtils, context, null, null, 6, null);
        String strM983getForGuildMember2tNb6hE$default = IconUrlUtils.m983getForGuildMember2tNb6hE$default(iconUrlUtils, userGuildAvatar, guildId, userId, null, false, 24, null);
        return strM983getForGuildMember2tNb6hE$default.length() == 0 ? IconUrlUtils.m984getForUser_fRzTXg$default(iconUrlUtils, context, userId, userAvatar, Integer.valueOf(userDiscriminator), false, null, 32, null) : strM983getForGuildMember2tNb6hE$default;
    }

    private final void initView() throws Throwable {
        b0.w(g.f14681d, new C02051(null));
    }

    private final void turnScreenOffAndKeyguardOn() {
        if (Build.VERSION.SDK_INT < 27) {
            getWindow().clearFlags(129);
        } else {
            setShowWhenLocked(false);
            setTurnScreenOn(false);
        }
    }

    private final void turnScreenOnAndKeyguardOff() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 27) {
            setShowWhenLocked(true);
            if (!((PowerManager) getSystemService(PowerManager.class)).isInteractive()) {
                setTurnScreenOn(true);
            }
        } else {
            getWindow().addFlags(129);
        }
        Object systemService = getSystemService("keyguard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        KeyguardManager keyguardManager = (KeyguardManager) systemService;
        if (i7 >= 26) {
            keyguardManager.requestDismissKeyguard(this, null);
        }
    }

    @Override // i.h, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        if (Build.VERSION.SDK_INT < 28) {
            TTIModule.Companion companion = TTIModule.INSTANCE;
            String name = IncomingCallActivity.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            companion.markActivityBeforeMain(name);
        }
        super.attachBaseContext(newBase);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incoming_call_screen);
        initView();
        turnScreenOnAndKeyguardOff();
        selfIntent = this;
        TelecomModule.INSTANCE.setAcceptIncomingCallHandler(new C02061(this));
        registerReceiver(this.screenOffReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // i.h, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IncomingCallActivity$screenOffReceiver$1 incomingCallActivity$screenOffReceiver$1 = this.screenOffReceiver;
        if (incomingCallActivity$screenOffReceiver$1 != null) {
            unregisterReceiver(incomingCallActivity$screenOffReceiver$1);
        }
        turnScreenOffAndKeyguardOn();
        if (Intrinsics.areEqual(selfIntent, this)) {
            selfIntent = null;
        }
        TelecomModule.INSTANCE.setAcceptIncomingCallHandler(null);
    }

    public final void performAcceptAction$notification_renderer_release() {
        ContentAction contentAction = this.acceptAction;
        if (contentAction == null) {
            return;
        }
        Intent intentAddFlags = IntentUtilsKt.putExtra(new Intent("android.intent.action.VIEW", null, getBaseContext(), ReactActivity.INSTANCE.getMainActivity()), Reflection.getOrCreateKotlinClass(ContentAction.class)).addCategory("android.intent.category.HOME").addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        final Intent intentPutIntentParcelable = IntentUtilsKt.putIntentParcelable(intentAddFlags, "action_intent_arg_key", contentAction);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
        if (!keyguardManager.isKeyguardLocked()) {
            ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
            Context baseContext = getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            ActivityUtilities.startActivityAsync$default(activityUtilities, baseContext, intentPutIntentParcelable, null, 4, null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            keyguardManager.requestDismissKeyguard(this, new KeyguardManager$KeyguardDismissCallback() { // from class: com.discord.notifications.renderer.IncomingCallActivity$performAcceptAction$1
                public void onDismissSucceeded() {
                    super.onDismissSucceeded();
                    ActivityUtilities activityUtilities2 = ActivityUtilities.INSTANCE;
                    Context baseContext2 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext2, "getBaseContext(...)");
                    ActivityUtilities.startActivityAsync$default(activityUtilities2, baseContext2, intentPutIntentParcelable, null, 4, null);
                }
            });
            return;
        }
        ActivityUtilities activityUtilities2 = ActivityUtilities.INSTANCE;
        Context baseContext2 = getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext2, "getBaseContext(...)");
        ActivityUtilities.startActivityAsync$default(activityUtilities2, baseContext2, intentPutIntentParcelable, null, 4, null);
    }
}
