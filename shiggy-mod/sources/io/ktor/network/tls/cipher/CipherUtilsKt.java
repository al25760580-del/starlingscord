package io.ktor.network.tls.cipher;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.network.util.PoolsKt;
import io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import io.ktor.utils.io.pool.ByteBufferPool;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;

/* JADX INFO: compiled from: CipherUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/io/Source;", "Ljavax/crypto/Cipher;", "cipher", "Lkotlin/Function1;", "Lkotlinx/io/Sink;", "", "Lkotlin/ExtensionFunctionType;", "header", "cipherLoop", "(Lkotlinx/io/Source;Ljavax/crypto/Cipher;Lkotlin/jvm/functions/Function1;)Lkotlinx/io/Source;", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "CryptoBufferPool", "Lio/ktor/utils/io/pool/ObjectPool;", "getCryptoBufferPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CipherUtilsKt {
    private static final ObjectPool<ByteBuffer> CryptoBufferPool = new ByteBufferPool(128, 65536);

    public static final ObjectPool<ByteBuffer> getCryptoBufferPool() {
        return CryptoBufferPool;
    }

    public static /* synthetic */ Source cipherLoop$default(Source source, Cipher cipher, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.network.tls.cipher.CipherUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CipherUtilsKt.cipherLoop$lambda$0((Sink) obj2);
                }
            };
        }
        return cipherLoop(source, cipher, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cipherLoop$lambda$0(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return Unit.INSTANCE;
    }

    public static final Source cipherLoop(Source source, Cipher cipher, Function1<? super Sink, Unit> header) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(header, "header");
        ByteBuffer byteBufferBorrow = PoolsKt.getDefaultByteBufferPool().borrow();
        ByteBuffer byteBufferBorrow2 = CryptoBufferPool.borrow();
        boolean z = true;
        try {
            Buffer buffer = new Buffer();
            Buffer buffer2 = buffer;
            byteBufferBorrow.clear();
            header.invoke(buffer2);
            while (true) {
                int available = byteBufferBorrow.hasRemaining() ? ByteReadPacketExtensions_jvmKt.readAvailable(source, byteBufferBorrow) : 0;
                byteBufferBorrow.flip();
                if (!byteBufferBorrow.hasRemaining() && (available == -1 || source.exhausted())) {
                    break;
                }
                byteBufferBorrow2.clear();
                if (cipher.getOutputSize(byteBufferBorrow.remaining()) > byteBufferBorrow2.remaining()) {
                    if (z) {
                        CryptoBufferPool.recycle(byteBufferBorrow2);
                    }
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cipher.getOutputSize(byteBufferBorrow.remaining()));
                    Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
                    byteBufferBorrow2 = byteBufferAllocate;
                    z = false;
                }
                cipher.update(byteBufferBorrow, byteBufferBorrow2);
                byteBufferBorrow2.flip();
                BytePacketBuilderExtensions_jvmKt.writeFully(buffer2, byteBufferBorrow2);
                byteBufferBorrow.compact();
            }
            byteBufferBorrow.hasRemaining();
            byteBufferBorrow2.hasRemaining();
            int outputSize = cipher.getOutputSize(0);
            if (outputSize != 0) {
                if (outputSize > byteBufferBorrow2.capacity()) {
                    byte[] bArrDoFinal = cipher.doFinal();
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                    BytePacketBuilderKt.writeFully$default(buffer2, bArrDoFinal, 0, 0, 6, null);
                } else {
                    byteBufferBorrow2.clear();
                    cipher.doFinal(CipherKt.getEmptyByteBuffer(), byteBufferBorrow2);
                    byteBufferBorrow2.flip();
                    if (!byteBufferBorrow2.hasRemaining()) {
                        byte[] bArrDoFinal2 = cipher.doFinal();
                        Intrinsics.checkNotNullExpressionValue(bArrDoFinal2, "doFinal(...)");
                        BytePacketBuilderKt.writeFully$default(buffer2, bArrDoFinal2, 0, 0, 6, null);
                    } else {
                        BytePacketBuilderExtensions_jvmKt.writeFully(buffer2, byteBufferBorrow2);
                    }
                }
            }
            return buffer;
        } finally {
            PoolsKt.getDefaultByteBufferPool().recycle(byteBufferBorrow);
            if (z) {
                CryptoBufferPool.recycle(byteBufferBorrow2);
            }
        }
    }
}
