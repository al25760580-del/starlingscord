package ShiggyXposed.xposed.modules.appearance;

import ShiggyXposed.xposed.Utils;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientKt;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.engine.cio.CIO;
import io.ktor.client.plugins.UserAgentConfig;
import io.ktor.client.plugins.UserAgentKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.reflect.TypeInfo;
import java.io.File;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: FontsModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "ShiggyXposed.xposed.modules.appearance.FontsModule$onLoad$1$5$1$1", f = "FontsModule.kt", i = {0, 0, 1}, l = {244, 245}, m = "invokeSuspend", n = {"url", "file", "url"}, s = {"L$0", "L$1", "L$0"})
final class FontsModule$onLoad$1$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FontDefinition $fontDef;
    final /* synthetic */ String $name;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontsModule$onLoad$1$5$1$1(FontDefinition fontDefinition, String str, Continuation<? super FontsModule$onLoad$1$5$1$1> continuation) {
        super(2, continuation);
        this.$fontDef = fontDefinition;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FontsModule$onLoad$1$5$1$1(this.$fontDef, this.$name, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FontsModule$onLoad$1$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f6 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #3 {all -> 0x003a, blocks: (B:14:0x0035, B:34:0x00e4, B:36:0x00f6, B:38:0x0102), top: B:61:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0117  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #1 {all -> 0x0022, blocks: (B:7:0x001d, B:43:0x011b, B:47:0x012a, B:44:0x0121, B:45:0x0128), top: B:59:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0121 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:7:0x001d, B:43:0x011b, B:47:0x012a, B:44:0x0121, B:45:0x0128), top: B:59:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Throwable th;
        String str2;
        File file;
        HttpResponse httpResponse;
        File file2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        KType kTypeTypeOf = null;
        if (i != 0) {
            if (i == 1) {
                file = (File) this.L$1;
                str2 = (String) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    httpResponse = (HttpResponse) obj;
                    if (Intrinsics.areEqual(httpResponse.getStatus(), HttpStatusCode.INSTANCE.getOK())) {
                        HttpClientCall call = httpResponse.getCall();
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                        try {
                            kTypeTypeOf = Reflection.typeOf(byte[].class);
                        } catch (Throwable unused) {
                        }
                        this.L$0 = str2;
                        this.L$1 = file;
                        this.label = 2;
                        obj = call.bodyNullable(new TypeInfo(orCreateKotlinClass, kTypeTypeOf), this);
                        if (obj != coroutine_suspended) {
                            file2 = file;
                        }
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = str2;
                    Utils.Log.INSTANCE.e("Failed to download fonts (" + this.$name + " from " + str + ')', th);
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file2 = (File) this.L$1;
                str = (String) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Utils.Log.INSTANCE.e("Failed to download fonts (" + this.$name + " from " + str + ')', th);
                    return Unit.INSTANCE;
                }
            }
            if (obj != null) {
                FilesKt.writeBytes(file2, (byte[]) obj);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String str3 = (String) MapsKt.getValue(this.$fontDef.getMain(), this.$name);
            try {
                Utils.Log.INSTANCE.i("Downloading " + this.$name + " from " + str3);
                File file3 = FontsModule.fontsDir;
                if (file3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fontsDir");
                    file3 = null;
                }
                StringBuilder sbAppend = new StringBuilder().append(this.$name);
                String[] strArr = FontsModule.FILE_EXTENSIONS;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        String str4 = strArr[i2];
                        if (StringsKt.endsWith$default(str3, str4, false, 2, (Object) null)) {
                            File file4 = new File(file3, sbAppend.append(str4).toString());
                            FontsModule.INSTANCE.asFile(file4);
                            if (file4.exists()) {
                                return Unit.INSTANCE;
                            }
                            HttpClient HttpClient = HttpClientKt.HttpClient(CIO.INSTANCE, new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.FontsModule$onLoad$1$5$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return FontsModule$onLoad$1$5$1$1.invokeSuspend$lambda$3((HttpClientConfig) obj2);
                                }
                            });
                            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                            HttpRequestKt.url(httpRequestBuilder, str3);
                            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                            this.L$0 = str3;
                            this.L$1 = file4;
                            this.label = 1;
                            Object objExecute = new HttpStatement(httpRequestBuilder, HttpClient).execute(this);
                            if (objExecute != coroutine_suspended) {
                                str2 = str3;
                                obj = objExecute;
                                file = file4;
                                break;
                            }
                            return coroutine_suspended;
                        }
                        i2++;
                    } else {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                httpResponse = (HttpResponse) obj;
                if (Intrinsics.areEqual(httpResponse.getStatus(), HttpStatusCode.INSTANCE.getOK())) {
                    HttpClientCall call2 = httpResponse.getCall();
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(byte[].class);
                    kTypeTypeOf = Reflection.typeOf(byte[].class);
                    this.L$0 = str2;
                    this.L$1 = file;
                    this.label = 2;
                    obj = call2.bodyNullable(new TypeInfo(orCreateKotlinClass2, kTypeTypeOf), this);
                    if (obj != coroutine_suspended) {
                        file2 = file;
                        if (obj != null) {
                            FilesKt.writeBytes(file2, (byte[]) obj);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    }
                    return coroutine_suspended;
                }
            } catch (Throwable th4) {
                str = str3;
                th = th4;
                Utils.Log.INSTANCE.e("Failed to download fonts (" + this.$name + " from " + str + ')', th);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(HttpClientConfig httpClientConfig) {
        httpClientConfig.install(UserAgentKt.getUserAgent(), new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.FontsModule$onLoad$1$5$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FontsModule$onLoad$1$5$1$1.invokeSuspend$lambda$3$lambda$2((UserAgentConfig) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(UserAgentConfig userAgentConfig) {
        userAgentConfig.setAgent("ShiggyXposed");
        return Unit.INSTANCE;
    }
}
