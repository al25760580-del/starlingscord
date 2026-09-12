package io.ktor.client.statement;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.charsets.EncodingKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Source;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\"\u0010\b\u001a\u00020\u0007*\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000e\u0010\f\"\u001e\u0010\u0012\u001a\u00020\n*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0016\u001a\u00020\u0013*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "", "complete", "(Lio/ktor/client/statement/HttpResponse;)V", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "fallbackCharset", "", "bodyAsText", "(Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "bodyAsChannel", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "bodyAsBytes", "getContent", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/utils/io/ByteReadChannel;", "getContent$annotations", "content", "Lio/ktor/client/request/HttpRequest;", "getRequest", "(Lio/ktor/client/statement/HttpResponse;)Lio/ktor/client/request/HttpRequest;", "request", "ktor-client-core"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HttpResponseKt {

    /* JADX INFO: renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsBytes$1, reason: invalid class name */
    /* JADX INFO: compiled from: HttpResponse.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0, 0, 0}, l = {147}, m = "bodyAsBytes", n = {"$this$bodyAsBytes", "$this$body$iv", "$i$f$body"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsBytes(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HttpResponse.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0, 0, 0}, l = {147}, m = "bodyAsChannel", n = {"$this$bodyAsChannel", "$this$body$iv", "$i$f$body"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    static final class C00941 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00941(Continuation<? super C00941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.statement.HttpResponseKt$bodyAsText$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HttpResponse.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0, 0, 0, 0, 0, 0}, l = {147}, m = "bodyAsText", n = {"$this$bodyAsText", "fallbackCharset", "originCharset", "decoder", "$this$body$iv", "$i$f$body"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
    static final class C00951 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C00951(Continuation<? super C00951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpResponseKt.bodyAsText(null, null, this);
        }
    }

    @Deprecated(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @ReplaceWith(expression = "readRawBytes()", imports = {}))
    public static /* synthetic */ void getContent$annotations(HttpResponse httpResponse) {
    }

    public static final ByteReadChannel getContent(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getRawContent();
    }

    public static final HttpRequest getRequest(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }

    public static final void complete(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        Job job = JobKt.getJob(httpResponse.getCoroutineContext());
        Intrinsics.checkNotNull(job, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((CompletableJob) job).complete();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object bodyAsText(HttpResponse httpResponse, Charset charset, Continuation<? super String> continuation) throws Throwable {
        C00951 c00951;
        KType kTypeTypeOf;
        CharsetDecoder charsetDecoder;
        if (continuation instanceof C00951) {
            c00951 = (C00951) continuation;
            if ((c00951.label & Integer.MIN_VALUE) != 0) {
                c00951.label -= Integer.MIN_VALUE;
            } else {
                c00951 = new C00951(continuation);
            }
        } else {
            c00951 = new C00951(continuation);
        }
        Object objBodyNullable = c00951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00951.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            Charset charset2 = HttpMessagePropertiesKt.charset(httpResponse);
            if (charset2 == null) {
                charset2 = charset;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset2.newDecoder();
            HttpClientCall call = httpResponse.getCall();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            try {
                kTypeTypeOf = Reflection.typeOf(Source.class);
            } catch (Throwable unused) {
                kTypeTypeOf = null;
            }
            TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kTypeTypeOf);
            c00951.L$0 = SpillingKt.nullOutSpilledVariable(httpResponse);
            c00951.L$1 = SpillingKt.nullOutSpilledVariable(charset);
            c00951.L$2 = SpillingKt.nullOutSpilledVariable(charset2);
            c00951.L$3 = charsetDecoderNewDecoder;
            c00951.L$4 = SpillingKt.nullOutSpilledVariable(httpResponse);
            c00951.I$0 = 0;
            c00951.label = 1;
            objBodyNullable = call.bodyNullable(typeInfo, c00951);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
            charsetDecoder = charsetDecoderNewDecoder;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = c00951.I$0;
            charsetDecoder = (CharsetDecoder) c00951.L$3;
            ResultKt.throwOnFailure(objBodyNullable);
        }
        if (objBodyNullable != null) {
            Intrinsics.checkNotNull(charsetDecoder);
            return EncodingKt.decode$default(charsetDecoder, (Source) objBodyNullable, 0, 2, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return bodyAsText(httpResponse, charset, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object bodyAsChannel(HttpResponse httpResponse, Continuation<? super ByteReadChannel> continuation) throws Throwable {
        C00941 c00941;
        KType kTypeTypeOf;
        if (continuation instanceof C00941) {
            c00941 = (C00941) continuation;
            if ((c00941.label & Integer.MIN_VALUE) != 0) {
                c00941.label -= Integer.MIN_VALUE;
            } else {
                c00941 = new C00941(continuation);
            }
        } else {
            c00941 = new C00941(continuation);
        }
        Object objBodyNullable = c00941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00941.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            HttpClientCall call = httpResponse.getCall();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ByteReadChannel.class);
            try {
                kTypeTypeOf = Reflection.typeOf(ByteReadChannel.class);
            } catch (Throwable unused) {
                kTypeTypeOf = null;
            }
            TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kTypeTypeOf);
            c00941.L$0 = SpillingKt.nullOutSpilledVariable(httpResponse);
            c00941.L$1 = SpillingKt.nullOutSpilledVariable(httpResponse);
            c00941.I$0 = 0;
            c00941.label = 1;
            objBodyNullable = call.bodyNullable(typeInfo, c00941);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = c00941.I$0;
            ResultKt.throwOnFailure(objBodyNullable);
        }
        if (objBodyNullable != null) {
            return (ByteReadChannel) objBodyNullable;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object bodyAsBytes(HttpResponse httpResponse, Continuation<? super byte[]> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        KType kTypeTypeOf;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objBodyNullable = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objBodyNullable);
            HttpClientCall call = httpResponse.getCall();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
            try {
                kTypeTypeOf = Reflection.typeOf(byte[].class);
            } catch (Throwable unused) {
                kTypeTypeOf = null;
            }
            TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kTypeTypeOf);
            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(httpResponse);
            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(httpResponse);
            anonymousClass1.I$0 = 0;
            anonymousClass1.label = 1;
            objBodyNullable = call.bodyNullable(typeInfo, anonymousClass1);
            if (objBodyNullable == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = anonymousClass1.I$0;
            ResultKt.throwOnFailure(objBodyNullable);
        }
        if (objBodyNullable != null) {
            return (byte[]) objBodyNullable;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
    }
}
