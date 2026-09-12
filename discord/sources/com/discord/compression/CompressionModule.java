package com.discord.compression;

import a3.e;
import com.discord.codegen.NativeCompressionModuleSpec;
import com.discord.logging.Log;
import com.discord.misc.utilities.time.TimeElapsed;
import com.discord.resource_usage.DeviceResourceUsageRecorder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.github.luben.zstd.ZstdBufferDecompressingStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007H\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/discord/compression/CompressionModule;", "Lcom/discord/codegen/NativeCompressionModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "zlibInflaters", "", "", "Ljava/util/zip/Inflater;", "zstdInflaters", "Lcom/discord/compression/CompressionModule$ZstdInflater;", "webSocketModule", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "getTypedExportedConstants", "", "", "enableZlibStreamSupport", "", "socketId", "", "disableZlibStreamSupport", "enableZstdStreamSupport", "ZlibContentHandler", "ZstdInflater", "ZstdContentHandler", "Companion", "compression_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompressionModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressionModule.kt\ncom/discord/compression/CompressionModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,195:1\n384#2,7:196\n384#2,7:203\n*S KotlinDebug\n*F\n+ 1 CompressionModule.kt\ncom/discord/compression/CompressionModule\n*L\n35#1:196,7\n60#1:203,7\n*E\n"})
public final class CompressionModule extends NativeCompressionModuleSpec {
    private static final String logTag = "CompressionModule";

    @NotNull
    private final Map<Integer, Inflater> zlibInflaters;

    @NotNull
    private final Map<Integer, ZstdInflater> zstdInflaters;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0014R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/compression/CompressionModule$ZstdInflater;", "Lcom/github/luben/zstd/ZstdBufferDecompressingStream;", "<init>", "()V", "nextBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "decompress", "", "byteString", "Lokio/ByteString;", "refill", "currentBuffer", "Companion", "compression_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZstdInflater extends ZstdBufferDecompressingStream {
        private static final int INITIAL_BUFFER_SIZE_MULTIPLIER = 2;
        private ByteBuffer nextBuffer;

        public ZstdInflater() {
            super(ByteBuffer.allocate(0));
            this.nextBuffer = ByteBuffer.allocate(0);
        }

        @NotNull
        public final String decompress(@NotNull ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            this.nextBuffer = ByteBuffer.wrap(byteString.j());
            ArrayList<ByteBuffer> arrayListJ0 = CollectionsKt.j0(n0.f14659d);
            int iMax = Math.max(byteString.c() * 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMax);
            if (read(byteBufferAllocate) != 0) {
                throw new UnsupportedOperationException("Error in zstd: still had data when trying to refill buffer");
            }
            int i7 = 0;
            for (int i10 = 1; i10 < 51; i10++) {
                int i11 = read(byteBufferAllocate);
                i7 += i11;
                if (i11 == 0) {
                    if (arrayListJ0.size() == 1) {
                        byte[] bArrArray = ((ByteBuffer) arrayListJ0.get(0)).array();
                        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
                        return new String(bArrArray, 0, i7, Charsets.UTF_8);
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i7);
                    for (ByteBuffer byteBuffer : arrayListJ0) {
                        byteBuffer.flip();
                        byteBufferAllocate2.put(byteBuffer);
                    }
                    byte[] bArrArray2 = byteBufferAllocate2.array();
                    Intrinsics.checkNotNullExpressionValue(bArrArray2, "array(...)");
                    return new String(bArrArray2, Charsets.UTF_8);
                }
                iMax = Math.max(iMax, i11 * 2);
                Intrinsics.checkNotNull(byteBufferAllocate);
                arrayListJ0.add(byteBufferAllocate);
                byteBufferAllocate = ByteBuffer.allocate(iMax);
            }
            throw new UnsupportedOperationException("Unable to decompress");
        }

        @Override // com.github.luben.zstd.ZstdBufferDecompressingStream
        @NotNull
        public ByteBuffer refill(@NotNull ByteBuffer currentBuffer) {
            Intrinsics.checkNotNullParameter(currentBuffer, "currentBuffer");
            ByteBuffer nextBuffer = this.nextBuffer;
            Intrinsics.checkNotNullExpressionValue(nextBuffer, "nextBuffer");
            return nextBuffer;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressionModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.zlibInflaters = new ConcurrentHashMap();
        this.zstdInflaters = new ConcurrentHashMap();
    }

    private final WebSocketModule getWebSocketModule() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @Override // com.discord.codegen.NativeCompressionModuleSpec
    public void disableZlibStreamSupport(double socketId) {
        int i7 = (int) socketId;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i7, null);
        }
        this.zlibInflaters.remove(Integer.valueOf(i7));
        ZstdInflater zstdInflater = this.zstdInflaters.get(Integer.valueOf(i7));
        if (zstdInflater != null) {
            zstdInflater.close();
        }
        this.zstdInflaters.remove(Integer.valueOf(i7));
    }

    @Override // com.discord.codegen.NativeCompressionModuleSpec
    public void enableZlibStreamSupport(double socketId) {
        int i7 = (int) socketId;
        Map<Integer, Inflater> map = this.zlibInflaters;
        Integer numValueOf = Integer.valueOf(i7);
        Inflater inflater = map.get(numValueOf);
        if (inflater == null) {
            inflater = new Inflater();
            map.put(numValueOf, inflater);
        }
        Inflater inflater2 = inflater;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i7, new ZlibContentHandler(inflater2));
        }
    }

    @Override // com.discord.codegen.NativeCompressionModuleSpec
    public void enableZstdStreamSupport(double socketId) {
        int i7 = (int) socketId;
        Map<Integer, ZstdInflater> map = this.zstdInflaters;
        Integer numValueOf = Integer.valueOf(i7);
        ZstdInflater zstdInflater = map.get(numValueOf);
        if (zstdInflater == null) {
            zstdInflater = new ZstdInflater();
            map.put(numValueOf, zstdInflater);
        }
        ZstdInflater zstdInflater2 = zstdInflater;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i7, new ZstdContentHandler(zstdInflater2));
        }
    }

    @Override // com.discord.codegen.NativeCompressionModuleSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return w0.h(new Pair("supportsZstd", Boolean.TRUE));
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/compression/CompressionModule$ZlibContentHandler;", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "inflater", "Ljava/util/zip/Inflater;", "<init>", "(Ljava/util/zip/Inflater;)V", "onMessage", "", "text", "", "params", "Lcom/facebook/react/bridge/WritableMap;", "byteString", "Lokio/ByteString;", "ZLibByteStream", "compression_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZlibContentHandler implements WebSocketModule.ContentHandler {

        @NotNull
        private final Inflater inflater;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/discord/compression/CompressionModule$ZlibContentHandler$ZLibByteStream;", "Ljava/io/ByteArrayOutputStream;", "bytes", "Lokio/ByteString;", "inflater", "Ljava/util/zip/Inflater;", "<init>", "(Lokio/ByteString;Ljava/util/zip/Inflater;)V", "toDecodedString", "", "Companion", "compression_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ZLibByteStream extends ByteArrayOutputStream {
            private static final int INFLATE_BUFFER_SIZE = 4096;
            private static final int INITIAL_BUFFER_SIZE_MULTIPLIER = 2;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ZLibByteStream(@NotNull ByteString bytes, @NotNull Inflater inflater) throws IOException {
                super(bytes.c() * 2);
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                Intrinsics.checkNotNullParameter(inflater, "inflater");
                InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(this, inflater, 4096);
                bytes.l(inflaterOutputStream);
                inflaterOutputStream.flush();
            }

            @NotNull
            public final String toDecodedString() {
                byte[] buf = ((ByteArrayOutputStream) this).buf;
                Intrinsics.checkNotNullExpressionValue(buf, "buf");
                return new String(buf, 0, ((ByteArrayOutputStream) this).count, Charsets.UTF_8);
            }
        }

        public ZlibContentHandler(@NotNull Inflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this.inflater = inflater;
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
        public void onMessage(@NotNull String text, @NotNull WritableMap params) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(params, "params");
            params.putString("data", text);
            DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
            companion.setSocketBytesReceived(companion.getSocketBytesReceived() + ((long) text.length()));
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
        public void onMessage(@NotNull ByteString byteString, @NotNull WritableMap params) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            Intrinsics.checkNotNullParameter(params, "params");
            TimeElapsed timeElapsed = new TimeElapsed(0L, 1, null);
            String decodedString = new ZLibByteStream(byteString, this.inflater).toDecodedString();
            if (timeElapsed.getDurationMillis() > 100) {
                Log log = Log.INSTANCE;
                String str = CompressionModule.logTag;
                Intrinsics.checkNotNullExpressionValue(str, "access$getLogTag$cp(...)");
                Log.i$default(log, str, e.l("Decompressed ZLib message in ", timeElapsed.getDuration()), (Throwable) null, 4, (Object) null);
            }
            params.putString("type", "text");
            params.putString("data", decodedString);
            params.putInt("raw_length", byteString.c());
            DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
            companion.setSocketBytesReceived(companion.getSocketBytesReceived() + ((long) byteString.c()));
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/compression/CompressionModule$ZstdContentHandler;", "Lcom/facebook/react/modules/websocket/WebSocketModule$ContentHandler;", "inflater", "Lcom/discord/compression/CompressionModule$ZstdInflater;", "<init>", "(Lcom/discord/compression/CompressionModule$ZstdInflater;)V", "onMessage", "", "text", "", "params", "Lcom/facebook/react/bridge/WritableMap;", "byteString", "Lokio/ByteString;", "compression_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZstdContentHandler implements WebSocketModule.ContentHandler {

        @NotNull
        private final ZstdInflater inflater;

        public ZstdContentHandler(@NotNull ZstdInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this.inflater = inflater;
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
        public void onMessage(@NotNull String text, @NotNull WritableMap params) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(params, "params");
            params.putString("data", text);
            DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
            companion.setSocketBytesReceived(companion.getSocketBytesReceived() + ((long) text.length()));
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
        public void onMessage(@NotNull ByteString byteString, @NotNull WritableMap params) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            Intrinsics.checkNotNullParameter(params, "params");
            TimeElapsed timeElapsed = new TimeElapsed(0L, 1, null);
            String strDecompress = this.inflater.decompress(byteString);
            if (timeElapsed.getDurationMillis() > 100) {
                Log log = Log.INSTANCE;
                String str = CompressionModule.logTag;
                Intrinsics.checkNotNullExpressionValue(str, "access$getLogTag$cp(...)");
                Log.i$default(log, str, e.l("Decompressed ZLib message in ", timeElapsed.getDuration()), (Throwable) null, 4, (Object) null);
            }
            params.putString("type", "text");
            params.putString("data", strDecompress);
            params.putInt("raw_length", byteString.c());
            DeviceResourceUsageRecorder.Companion companion = DeviceResourceUsageRecorder.INSTANCE;
            companion.setSocketBytesReceived(companion.getSocketBytesReceived() + ((long) byteString.c()));
        }
    }
}
