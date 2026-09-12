package io.ktor.client.engine.cio;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.cio.ConnectionOptions;
import io.ktor.http.cio.HttpBodyKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1", f = "utils.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"}, v = 1)
final class UtilsKt$readResponse$2$1$body$httpBodyParser$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConnectionOptions $connectionType;
    final /* synthetic */ long $contentLength;
    final /* synthetic */ ByteReadChannel $input;
    final /* synthetic */ String $transferEncoding;
    final /* synthetic */ HttpProtocolVersion $version;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$readResponse$2$1$body$httpBodyParser$1(HttpProtocolVersion httpProtocolVersion, long j, String str, ConnectionOptions connectionOptions, ByteReadChannel byteReadChannel, Continuation<? super UtilsKt$readResponse$2$1$body$httpBodyParser$1> continuation) {
        super(2, continuation);
        this.$version = httpProtocolVersion;
        this.$contentLength = j;
        this.$transferEncoding = str;
        this.$connectionType = connectionOptions;
        this.$input = byteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UtilsKt$readResponse$2$1$body$httpBodyParser$1 utilsKt$readResponse$2$1$body$httpBodyParser$1 = new UtilsKt$readResponse$2$1$body$httpBodyParser$1(this.$version, this.$contentLength, this.$transferEncoding, this.$connectionType, this.$input, continuation);
        utilsKt$readResponse$2$1$body$httpBodyParser$1.L$0 = obj;
        return utilsKt$readResponse$2$1$body$httpBodyParser$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((UtilsKt$readResponse$2$1$body$httpBodyParser$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WriterScope writerScope = (WriterScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = SpillingKt.nullOutSpilledVariable(writerScope);
            this.label = 1;
            if (HttpBodyKt.parseHttpBody(this.$version, this.$contentLength, this.$transferEncoding, this.$connectionType, this.$input, writerScope.getChannel(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
