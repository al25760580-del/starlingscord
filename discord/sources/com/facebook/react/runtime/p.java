package com.facebook.react.runtime;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.contentnode.TimestampContentNode;
import com.discord.chat.presentation.textutils.EmojiRendererKt;
import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chatreplay.logger.DebugRowLogger;
import com.discord.phone_verification.SmsAutofillManagerModule;
import com.discord.qr.scanner.QRScanner;
import com.discord.qr.scanner.QRScannerViewManager;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.runtime.internal.bolts.Task;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5323e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5324i;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.f5322d = i7;
        this.f5323e = obj;
        this.f5324i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5322d) {
            case 0:
                return ReactHostImpl.loadBundle$lambda$20((ReactHostImpl) this.f5323e, "loadBundle()", (JSBundleLoader) this.f5324i, (ReactInstance) obj);
            case 1:
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$45$lambda$43((ReactHostImpl) this.f5323e, (String) this.f5324i, (Task) obj);
            case 2:
                return Boolean.valueOf(ScreenStack.d((Ref.ObjectRef) this.f5323e, (ScreenStack) this.f5324i, (ScreenFragmentWrapper) obj));
            case 3:
                return SmsAutofillManagerModule.smsAutofillManager$lambda$0((SmsAutofillManagerModule) this.f5323e, (ReactApplicationContext) this.f5324i, (String) obj);
            case 4:
                return QRScannerViewManager.createViewInstance$lambda$2$lambda$0((QRScannerViewManager) this.f5323e, (QRScanner) this.f5324i, (String) obj);
            case 5:
                return EmojiRendererKt.renderEmoji$lambda$0((RenderContext) this.f5323e, (EmojiContentNode) this.f5324i, (View) obj);
            case 6:
                return TextUtilsKt.toSpannable$lambda$71$lambda$64((RenderContext) this.f5323e, (TimestampContentNode) this.f5324i, (View) obj);
            case 7:
                return TextUtilsKt.toSpannable$lambda$71$lambda$67((RenderContext) this.f5323e, (SoundmojiContentNode) this.f5324i, (View) obj);
            case 8:
                return TextUtilsKt.toSpannable$lambda$71$lambda$20((RenderContext) this.f5323e, (InlineCodeContentNode) this.f5324i, (View) obj);
            case 9:
                ol.d dVar = (ol.d) this.f5323e;
                File file = (File) this.f5324i;
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    throw new FileNotFoundException("No input stream was found for the source file");
                }
                if (((Number) dVar.f17444b.invoke(inputStream, new FileOutputStream(file))).longValue() != 0) {
                    return Unit.f14616a;
                }
                throw new IOException("No data was copied to the destination file");
            case 10:
                return DebugRowLogger.writeJson$lambda$3$lambda$2((Ref.BooleanRef) this.f5323e, (OutputStreamWriter) this.f5324i, (String) obj);
            case 11:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f5323e;
                u1.d dVar2 = (u1.d) this.f5324i;
                Context context = dVar2.f20917e;
                re.f fVar = (re.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (s1.f.a(cancellationSignal)) {
                    return Unit.f14616a;
                }
                Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                t1.d.a(dVar2.f20921i, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f19380d);
                try {
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                    i6.a onResultOrException = new i6.a(10, dVar2);
                    Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!s1.f.a(cancellationSignal)) {
                        onResultOrException.invoke();
                    }
                }
                return Unit.f14616a;
            case 12:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f5323e;
                v1.h hVar = (v1.h) this.f5324i;
                Context context2 = hVar.f21362e;
                PendingIntent result = (PendingIntent) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (s1.f.a(cancellationSignal2)) {
                    return Unit.f14616a;
                }
                Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                t1.d.a(hVar.f21366i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                try {
                    context2.startActivity(intent2);
                    break;
                } catch (Exception unused2) {
                    i6.a onResultOrException2 = new i6.a(11, hVar);
                    Intrinsics.checkNotNullParameter(onResultOrException2, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!s1.f.a(cancellationSignal2)) {
                        onResultOrException2.invoke();
                    }
                }
                return Unit.f14616a;
            case 13:
                Function1 function1 = (Function1) this.f5323e;
                Function1 function2 = (Function1) this.f5324i;
                function1.invoke(obj);
                function2.invoke(obj);
                return Unit.f14616a;
            default:
                CancellationSignal cancellationSignal3 = (CancellationSignal) this.f5323e;
                y1.a aVar = (y1.a) this.f5324i;
                Context context3 = aVar.f23129e;
                rf.m mVar = (rf.m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (s1.f.a(cancellationSignal3)) {
                    return Unit.f14616a;
                }
                Intent intent3 = new Intent(context3, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                intent3.setFlags(65536);
                intent3.putExtra("RESULT_RECEIVER", t1.d.d(aVar.f23133i));
                intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f19411d);
                intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                context3.startActivity(intent3);
                return Unit.f14616a;
        }
    }
}
