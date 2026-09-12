package com.discord.share;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import ar.b0;
import ar.k0;
import com.discord.codegen.NativeShareManagerModuleSpec;
import com.discord.lifecycle.AppEntryActivityRegistry;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import hr.e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016JJ\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!H\u0016J8\u0010+\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010,\u001a\u00020\u000fH\u0016J\b\u0010-\u001a\u00020\u000fH\u0016J\b\u0010.\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/discord/share/ShareManagerModule;", "Lcom/discord/codegen/NativeShareManagerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "shareBroadcastReceiver", "Lcom/discord/share/ShareBroadcastReceiver;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "currentShareJob", "Lkotlinx/coroutines/Job;", "invalidate", "", "addListener", "eventName", "", "removeListeners", "count", "", "setAuthenticationToken", "authenticationToken", "superProperties", "setSelectedChannel", "channelJSON", "guildJSON", "sharedAttachments", "shareID", "attachmentManifest", "Lcom/facebook/react/bridge/ReadableArray;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "share", "text", "url", "chooserText", "location", "mediaStagingOptions", "Lcom/facebook/react/bridge/ReadableMap;", "onStagingComplete", "Lcom/facebook/react/bridge/Callback;", "presentShare", "cancelPendingShare", "close", "launchApp", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareManagerModule.kt\ncom/discord/share/ShareManagerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
public final class ShareManagerModule extends NativeShareManagerModuleSpec {
    private Job currentShareJob;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final ShareBroadcastReceiver shareBroadcastReceiver;

    /* JADX INFO: renamed from: com.discord.share.ShareManagerModule$share$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.share.ShareManagerModule$share$1", f = "ShareManagerModule.kt", l = {91, 101}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nShareManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareManagerModule.kt\ncom/discord/share/ShareManagerModule$share$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $chooserText;
        final /* synthetic */ String $fileExtension;
        final /* synthetic */ String $location;
        final /* synthetic */ String $mediaType;
        final /* synthetic */ Callback $onStagingComplete;
        final /* synthetic */ Long $presentDelayMs;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $stagingUrl;
        final /* synthetic */ String $text;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, Promise promise, String str4, Callback callback, Long l6, String str5, String str6, String str7, Continuation continuation) {
            super(2, continuation);
            this.$stagingUrl = str;
            this.$fileExtension = str2;
            this.$mediaType = str3;
            this.$promise = promise;
            this.$url = str4;
            this.$onStagingComplete = callback;
            this.$presentDelayMs = l6;
            this.$text = str5;
            this.$chooserText = str6;
            this.$location = str7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return ShareManagerModule.this.new AnonymousClass1(this.$stagingUrl, this.$fileExtension, this.$mediaType, this.$promise, this.$url, this.$onStagingComplete, this.$presentDelayMs, this.$text, this.$chooserText, this.$location, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            if (ar.b0.j(r4, r8) == r2) goto L30;
         */
        @Override // xn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r1 = "share_"
                wn.a r2 = wn.a.f22354d
                int r0 = r8.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L30
                if (r0 == r4) goto L21
                if (r0 != r3) goto L19
                java.lang.Object r0 = r8.L$0
                java.lang.String r0 = (java.lang.String) r0
                ib.a.L(r9)
                goto L97
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                ib.a.L(r9)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                goto L4d
            L25:
                r0 = move-exception
                r9 = r0
                goto Laf
            L29:
                r0 = move-exception
                r9 = r0
                goto L5c
            L2c:
                r0 = move-exception
                r9 = r0
                goto La8
            L30:
                ib.a.L(r9)
                com.discord.share.ShareManagerModule r9 = com.discord.share.ShareManagerModule.this     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                com.facebook.react.bridge.ReactApplicationContext r9 = com.discord.share.ShareManagerModule.access$getReactApplicationContext(r9)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                java.lang.String r0 = "access$getReactApplicationContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                java.lang.String r0 = r8.$stagingUrl     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                java.lang.String r6 = r8.$fileExtension     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                java.lang.String r7 = r8.$mediaType     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                r8.label = r4     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                java.lang.Object r9 = com.discord.share.util.MediaShareUtilsKt.stageShareableMedia(r9, r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                if (r9 != r2) goto L4d
                goto L96
            L4d:
                android.net.Uri r9 = (android.net.Uri) r9     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
                com.facebook.react.bridge.Callback r0 = r8.$onStagingComplete
                java.lang.Object[] r1 = new java.lang.Object[r5]
                r0.invoke(r1)
            L5a:
                r0 = r9
                goto L84
            L5c:
                com.discord.logging.Log r0 = com.discord.logging.Log.INSTANCE     // Catch: java.lang.Throwable -> L25
                java.lang.Class<com.discord.share.ShareManagerModule> r4 = com.discord.share.ShareManagerModule.class
                kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r4)     // Catch: java.lang.Throwable -> L25
                java.lang.String r6 = r8.$mediaType     // Catch: java.lang.Throwable -> L25
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
                r7.<init>(r1)     // Catch: java.lang.Throwable -> L25
                r7.append(r6)     // Catch: java.lang.Throwable -> L25
                java.lang.String r1 = "_failed: staging failed, sharing link instead"
                r7.append(r1)     // Catch: java.lang.Throwable -> L25
                java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L25
                r0.w(r4, r1, r9)     // Catch: java.lang.Throwable -> L25
                java.lang.String r9 = r8.$url     // Catch: java.lang.Throwable -> L25
                com.facebook.react.bridge.Callback r0 = r8.$onStagingComplete
                java.lang.Object[] r1 = new java.lang.Object[r5]
                r0.invoke(r1)
                goto L5a
            L84:
                java.lang.Long r9 = r8.$presentDelayMs
                if (r9 == 0) goto L97
                long r4 = r9.longValue()
                r8.L$0 = r0
                r8.label = r3
                java.lang.Object r9 = ar.b0.j(r4, r8)
                if (r9 != r2) goto L97
            L96:
                return r2
            L97:
                r3 = r0
                com.discord.share.ShareManagerModule r1 = com.discord.share.ShareManagerModule.this
                java.lang.String r2 = r8.$text
                java.lang.String r4 = r8.$chooserText
                java.lang.String r5 = r8.$location
                com.facebook.react.bridge.Promise r6 = r8.$promise
                com.discord.share.ShareManagerModule.access$presentShare(r1, r2, r3, r4, r5, r6)
                kotlin.Unit r9 = kotlin.Unit.f14616a
                return r9
            La8:
                com.facebook.react.bridge.Promise r0 = r8.$promise     // Catch: java.lang.Throwable -> L25
                r1 = 0
                r0.resolve(r1)     // Catch: java.lang.Throwable -> L25
                throw r9     // Catch: java.lang.Throwable -> L25
            Laf:
                com.facebook.react.bridge.Callback r0 = r8.$onStagingComplete
                java.lang.Object[] r1 = new java.lang.Object[r5]
                r0.invoke(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.share.ShareManagerModule.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareManagerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.shareBroadcastReceiver = new ShareBroadcastReceiver(reactContext);
        e eVar = k0.f2938a;
        this.scope = b0.b(hr.d.f11103i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    public final void presentShare(String text, String url, String chooserText, String location, Promise promise) {
        Uri uri;
        if ((text == null || StringsKt.K(text)) && (url == null || StringsKt.K(url))) {
            promise.reject("SHARE_NO_ITEMS", "Cannot share without text or a URL");
            return;
        }
        if (url == null) {
            uri = null;
        } else {
            String str = x.o(url, "content://", false) ? url : null;
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (uri != null) {
            String type = getReactApplicationContext().getContentResolver().getType(uri);
            if (type == null) {
                type = "*/*";
            }
            intent.setType(type);
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setClipData(ClipData.newRawUri(null, uri));
            if (text != null && !StringsKt.K(text)) {
                intent.putExtra("android.intent.extra.TEXT", text);
            }
            intent.addFlags(1);
        } else {
            intent.setType("text/plain");
            String[] elements = {text, url};
            Intrinsics.checkNotNullParameter(elements, "elements");
            intent.putExtra("android.intent.extra.TEXT", CollectionsKt.O(y.r(elements), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, null, 62));
        }
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
            if (chooserText == null) {
                chooserText = "";
            }
            ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            Intent intentCreateChooser = Intent.createChooser(intent, chooserText, companion.getPendingIntentSender(reactApplicationContext, location));
            Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
            ActivityUtilities.startActivityAsync$default(activityUtilities, currentActivity, intentCreateChooser, null, 4, null);
        }
        promise.resolve(null);
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.register(reactApplicationContext, this.shareBroadcastReceiver);
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void cancelPendingShare() {
        Job job = this.currentShareJob;
        if (job != null) {
            job.f(null);
        }
        this.currentShareJob = null;
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void close() {
        Activity activityForAppEntry = AppEntryActivityRegistry.INSTANCE.getActivityForAppEntry("share");
        if (activityForAppEntry == null) {
            return;
        }
        ThreadUtilsKt.getUiExecutor().execute(new a(activityForAppEntry, 0));
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        b0.f(this.scope, new CancellationException("Module destroyed"));
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void launchApp() {
        Intent launchIntentForPackage = this.reactContext.getPackageManager().getLaunchIntentForPackage(this.reactContext.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        ActivityUtilities.startActivityAsync$default(ActivityUtilities.INSTANCE, this.reactContext, launchIntentForPackage, null, 4, null);
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void removeListeners(double count) {
        try {
            ShareBroadcastReceiver.Companion companion = ShareBroadcastReceiver.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            companion.unregister(reactApplicationContext, this.shareBroadcastReceiver);
        } catch (Exception unused) {
        }
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void setAuthenticationToken(String authenticationToken, String superProperties) {
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void setSelectedChannel(String channelJSON, String guildJSON) {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void share(String text, String url, String chooserText, String location, ReadableMap mediaStagingOptions, @NotNull Callback onStagingComplete, @NotNull Promise promise) {
        Long lValueOf;
        ReadableMap readableMap = mediaStagingOptions;
        Intrinsics.checkNotNullParameter(onStagingComplete, "onStagingComplete");
        Intrinsics.checkNotNullParameter(promise, "promise");
        cancelPendingShare();
        String string = readableMap != null ? readableMap.getString("url") : null;
        String string2 = readableMap != null ? readableMap.getString("mediaType") : null;
        String string3 = readableMap != null ? readableMap.getString("fileExtension") : null;
        if (string == null || string2 == null || string3 == null) {
            presentShare(text, url, chooserText, location, promise);
            return;
        }
        if (readableMap == null) {
            lValueOf = null;
        } else {
            if (!readableMap.hasKey("presentDelayMs")) {
                readableMap = null;
            }
            if (readableMap != null) {
                lValueOf = Long.valueOf(readableMap.getInt("presentDelayMs"));
            } else {
                lValueOf = null;
            }
        }
        this.currentShareJob = b0.t(this.scope, null, new AnonymousClass1(string, string3, string2, promise, url, onStagingComplete, lValueOf, text, chooserText, location, null), 3);
    }

    @Override // com.discord.codegen.NativeShareManagerModuleSpec
    public void sharedAttachments(@NotNull String shareID, @NotNull ReadableArray attachmentManifest, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(shareID, "shareID");
        Intrinsics.checkNotNullParameter(attachmentManifest, "attachmentManifest");
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Arguments.createArray());
    }
}
