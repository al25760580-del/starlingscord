package com.discord.media.engine.video;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.types.VideoSink;
import com.discord.permissions.NativePermissionManagerModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import ls.l;
import n1.h;
import rf.f;
import rf.m;
import t1.d;
import w1.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4454e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4455i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4456v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4457w;

    public /* synthetic */ a(int i7, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f4453d = i7;
        this.f4455i = obj;
        this.f4456v = obj2;
        this.f4457w = obj3;
        this.f4454e = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4453d) {
            case 0:
                return AttachedVideoSinks.addSink$lambda$1((Ref.BooleanRef) this.f4455i, (VideoSink) this.f4456v, (MediaEngine) this.f4457w, (String) this.f4454e, (String) obj);
            case 1:
                return NativePermissionManagerModule.AnonymousClass1.reject$lambda$12((String) this.f4454e, (String) this.f4455i, (Throwable) this.f4456v, (WritableMap) this.f4457w, (Promise) obj);
            case 2:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f4455i;
                e eVar = (e) this.f4456v;
                Context context = eVar.f21993e;
                Executor executor = (Executor) this.f4457w;
                h hVar = (h) this.f4454e;
                f fVar = (f) obj;
                PendingIntent pendingIntent = fVar.f19392d;
                rf.h response = fVar.f19393e;
                if (pendingIntent == null && response == null) {
                    s1.b onResultOrException = new s1.b(executor, hVar, 6);
                    Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!s1.f.a(cancellationSignal)) {
                        onResultOrException.invoke();
                    }
                    return Unit.f14616a;
                }
                if (pendingIntent != null) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    d.a(eVar.f21997i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        w1.d onResultOrException2 = new w1.d(eVar, 1);
                        Intrinsics.checkNotNullParameter(onResultOrException2, "onResultOrException");
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!s1.f.a(cancellationSignal)) {
                            onResultOrException2.invoke();
                        }
                    }
                    break;
                }
                if (response != null) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    n1.c cVarO = l.o(response.f19400d, response.f19401e);
                    if (cVarO instanceof n1.f) {
                        com.discord.chat.presentation.list.delegate.c onResultOrException3 = new com.discord.chat.presentation.list.delegate.c(executor, hVar, (n1.f) cVarO, 8);
                        Intrinsics.checkNotNullParameter(onResultOrException3, "onResultOrException");
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!s1.f.a(cancellationSignal)) {
                            onResultOrException3.invoke();
                        }
                        return Unit.f14616a;
                    }
                }
                if (pendingIntent == null) {
                    s1.b onResultOrException4 = new s1.b(executor, hVar, 5);
                    Intrinsics.checkNotNullParameter(onResultOrException4, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!s1.f.a(cancellationSignal)) {
                        onResultOrException4.invoke();
                    }
                }
                return Unit.f14616a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f4455i;
                x1.a aVar = (x1.a) this.f4456v;
                Context context2 = aVar.f22587e;
                Executor executor2 = (Executor) this.f4457w;
                h hVar2 = (h) this.f4454e;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (s1.f.a(cancellationSignal2)) {
                    return Unit.f14616a;
                }
                Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                d.a(aVar.f22591i, intent2, "BEGIN_SIGN_IN");
                intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f19411d);
                try {
                    context2.startActivity(intent2);
                    break;
                } catch (Exception unused2) {
                    s1.b onResultOrException5 = new s1.b(executor2, hVar2, 7);
                    Intrinsics.checkNotNullParameter(onResultOrException5, "onResultOrException");
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!s1.f.a(cancellationSignal2)) {
                        onResultOrException5.invoke();
                    }
                }
                return Unit.f14616a;
        }
    }

    public /* synthetic */ a(String str, String str2, Throwable th2, WritableMap writableMap) {
        this.f4453d = 1;
        this.f4454e = str;
        this.f4455i = str2;
        this.f4456v = th2;
        this.f4457w = writableMap;
    }
}
