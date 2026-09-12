package io.ktor.client.request.forms;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* JADX INFO: compiled from: FormDataContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "BOUNDARY_BYTES", "[B", "LAST_BOUNDARY_BYTES", "", "BODY_OVERHEAD_SIZE", "I", "PART_OVERHEAD_SIZE", "Lio/ktor/client/request/forms/PreparedPart;", "rawParts", "Ljava/util/List;", "", "value", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final String boundary;
    private Long contentLength;
    private final ContentType contentType;
    private final List<PreparedPart> rawParts;

    /* JADX INFO: renamed from: io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1, reason: invalid class name */
    /* JADX INFO: compiled from: FormDataContent.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9}, l = {124, 125, 126, 131, 135, 139, 142, 146, 146, 146}, m = "writeTo", n = {"channel", "part", "channel", "part", "channel", "part", "channel", "part", "input", "$i$a$-use-MultiPartFormDataContent$writeTo$2", "channel", "part", "channel", "part", "channel", "channel", "channel", "channel"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$4", "I$0", "L$0", "L$2", "L$0", "L$2", "L$0", "L$0", "L$0", "L$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiPartFormDataContent.this.writeTo(null, this);
        }
    }

    public MultiPartFormDataContent(List<? extends PartData> parts, String boundary, ContentType contentType) {
        PreparedPart channelPart;
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        Long l = null;
        byte[] byteArray$default = StringsKt.toByteArray$default("--" + boundary + ServerSentEventKt.END_OF_LINE, null, 1, null);
        this.BOUNDARY_BYTES = byteArray$default;
        byte[] byteArray$default2 = StringsKt.toByteArray$default("--" + boundary + "--\r\n", null, 1, null);
        this.LAST_BOUNDARY_BYTES = byteArray$default2;
        this.BODY_OVERHEAD_SIZE = byteArray$default2.length;
        this.PART_OVERHEAD_SIZE = (FormDataContentKt.RN_BYTES.length * 2) + byteArray$default.length;
        List<? extends PartData> list = parts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PartData partData : list) {
            Sink sinkBytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
            for (Map.Entry<String, List<String>> entry : partData.getHeaders().entries()) {
                StringsKt.writeText$default(sinkBytePacketBuilder, entry.getKey() + ": " + CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, (Charset) null, 14, (Object) null);
                BytePacketBuilderKt.writeFully$default(sinkBytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, null);
            }
            String str = partData.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
            Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (partData instanceof PartData.FileItem) {
                byte[] byteArray = SourcesKt.readByteArray(BytePacketBuilderKt.build(sinkBytePacketBuilder));
                channelPart = new PreparedPart.ChannelPart(byteArray, ((PartData.FileItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.PART_OVERHEAD_SIZE) + ((long) byteArray.length)) : null);
            } else if (partData instanceof PartData.BinaryItem) {
                byte[] byteArray2 = SourcesKt.readByteArray(BytePacketBuilderKt.build(sinkBytePacketBuilder));
                channelPart = new PreparedPart.InputPart(byteArray2, ((PartData.BinaryItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.PART_OVERHEAD_SIZE) + ((long) byteArray2.length)) : null);
            } else if (!(partData instanceof PartData.FormItem)) {
                if (!(partData instanceof PartData.BinaryChannelItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                byte[] byteArray3 = SourcesKt.readByteArray(BytePacketBuilderKt.build(sinkBytePacketBuilder));
                channelPart = new PreparedPart.ChannelPart(byteArray3, ((PartData.BinaryChannelItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.PART_OVERHEAD_SIZE) + ((long) byteArray3.length)) : null);
            } else {
                Buffer buffer = new Buffer();
                StringsKt.writeText$default(buffer, ((PartData.FormItem) partData).getValue(), 0, 0, (Charset) null, 14, (Object) null);
                final byte[] byteArray4 = SourcesKt.readByteArray(buffer);
                Function0 function0 = new Function0() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiPartFormDataContent.rawParts$lambda$0$1(byteArray4);
                    }
                };
                if (lValueOf == null) {
                    StringsKt.writeText$default(sinkBytePacketBuilder, HttpHeaders.INSTANCE.getContentLength() + ": " + byteArray4.length, 0, 0, (Charset) null, 14, (Object) null);
                    BytePacketBuilderKt.writeFully$default(sinkBytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, null);
                }
                byte[] byteArray5 = SourcesKt.readByteArray(BytePacketBuilderKt.build(sinkBytePacketBuilder));
                channelPart = new PreparedPart.InputPart(byteArray5, function0, Long.valueOf(byteArray4.length + this.PART_OVERHEAD_SIZE + byteArray5.length));
            }
            arrayList.add(channelPart);
        }
        ArrayList arrayList2 = arrayList;
        this.rawParts = arrayList2;
        Long lValueOf2 = 0L;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                l = lValueOf2;
                break;
            }
            Long size = ((PreparedPart) it.next()).getSize();
            if (size == null) {
                break;
            } else {
                lValueOf2 = lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + size.longValue()) : null;
            }
        }
        this.contentLength = l != null ? Long.valueOf(l.longValue() + ((long) this.BODY_OVERHEAD_SIZE)) : l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MultiPartFormDataContent(List list, String str, ContentType contentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 2) != 0 ? FormDataContentKt.generateBoundary() : str;
        this(list, str, (i & 4) != 0 ? ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
    }

    public final String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e9 A[Catch: all -> 0x0230, TRY_LEAVE, TryCatch #5 {all -> 0x0230, blocks: (B:49:0x00e3, B:51:0x00e9, B:106:0x0207), top: B:139:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #9 {all -> 0x00d4, blocks: (B:65:0x014c, B:67:0x0150, B:73:0x0186, B:85:0x019d, B:87:0x01a1, B:98:0x01f1, B:99:0x01f6, B:26:0x0077, B:36:0x00ac, B:39:0x00bd, B:42:0x00ce), top: B:147:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #9 {all -> 0x00d4, blocks: (B:65:0x014c, B:67:0x0150, B:73:0x0186, B:85:0x019d, B:87:0x01a1, B:98:0x01f1, B:99:0x01f6, B:26:0x0077, B:36:0x00ac, B:39:0x00bd, B:42:0x00ce), top: B:147:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a1 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #9 {all -> 0x00d4, blocks: (B:65:0x014c, B:67:0x0150, B:73:0x0186, B:85:0x019d, B:87:0x01a1, B:98:0x01f1, B:99:0x01f6, B:26:0x0077, B:36:0x00ac, B:39:0x00bd, B:42:0x00ce), top: B:147:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #9 {all -> 0x00d4, blocks: (B:65:0x014c, B:67:0x0150, B:73:0x0186, B:85:0x019d, B:87:0x01a1, B:98:0x01f1, B:99:0x01f6, B:26:0x0077, B:36:0x00ac, B:39:0x00bd, B:42:0x00ce), top: B:147:0x0026 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e9 -> B:22:0x0064). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.MultiPartFormDataContent.writeTo(io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Source rawParts$lambda$0$1(byte[] bArr) {
        Buffer buffer = new Buffer();
        BytePacketBuilderKt.writeFully$default(buffer, bArr, 0, 0, 6, null);
        return buffer;
    }
}
