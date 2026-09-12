package com.facebook.react.common.mapbuffer;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ViewProps;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import rn.h0;
import rn.i0;
import rn.n;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB\u0019\b\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000#2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100.H\u0096\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u0010\"J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0002¢\u0006\u0004\b6\u0010\u000eJ\u0017\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u0005H\u0002¢\u0006\u0004\b8\u0010\u0015J\u001f\u0010:\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010@\u001a\u00020=2\u0006\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\bA\u0010\u001cJ\u0017\u0010B\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\bB\u0010\u000eJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\bC\u0010\u0019J\u0017\u0010D\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010\fJ\u0017\u0010E\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0005H\u0002¢\u0006\u0004\bE\u0010\u001fJ\u0017\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0005H\u0002¢\u0006\u0004\bG\u0010\"J\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000#2\u0006\u0010F\u001a\u00020\u0005H\u0002¢\u0006\u0004\bH\u0010%J\u0017\u0010I\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H\u0002¢\u0006\u0004\bI\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010KR$\u0010M\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010'R\u0014\u0010P\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010'¨\u0006S"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "Ljava/nio/ByteBuffer;", "buffer", "", "offsetToMapBuffer", "<init>", "(Ljava/nio/ByteBuffer;I)V", "key", "", "contains", "(I)Z", "getKeyOffset", "(I)I", "offset", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "entryAt", "(I)Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getType", "(I)Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "getInt", "", "getLong", "(I)J", "", "getDouble", "(I)D", "", "getString", "(I)Ljava/lang/String;", "getBoolean", "getMapBuffer", "(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "", "getMapBufferList", "(I)Ljava/util/List;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "cloneWithOffset", "", "readHeader", "()V", "intKey", "getBucketIndexForKey", "bucketIndex", "readDataType", "expected", "getTypedValueOffsetForKey", "(ILcom/facebook/react/common/mapbuffer/MapBuffer$DataType;)I", "bufferPosition", "Lrn/i0;", "readUnsignedShort-BwKQO78", "(I)S", "readUnsignedShort", "readDoubleValue", "readIntValue", "readLongValue", "readBooleanValue", "readStringValue", ViewProps.POSITION, "readMapBufferValue", "readMapBufferListValue", "getKeyOffsetForBucketIndex", "Ljava/nio/ByteBuffer;", "I", "value", "count", "getCount", "getOffsetForDynamicData", "offsetForDynamicData", "Companion", "MapBufferEntry", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadableMapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadableMapBuffer.kt\ncom/facebook/react/common/mapbuffer/ReadableMapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
public final class ReadableMapBuffer extends HybridClassBase implements MapBuffer {
    private static final int ALIGNMENT = 254;
    private static final int BUCKET_SIZE = 12;

    @NotNull
    private static final MapBuffer.DataType[] DATA_TYPES = MapBuffer.DataType.values();
    private static final int HEADER_SIZE = 8;
    private static final int TYPE_OFFSET = 2;
    private static final int VALUE_OFFSET = 4;

    @NotNull
    private final ByteBuffer buffer;
    private int count;
    private final int offsetToMapBuffer;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$MapBufferEntry;", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "bucketOffset", "", "<init>", "(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V", "assertType", "", "expected", "Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "key", "getKey", "()I", "type", "getType", "()Lcom/facebook/react/common/mapbuffer/MapBuffer$DataType;", "doubleValue", "", "getDoubleValue", "()D", "intValue", "getIntValue", "longValue", "", "getLongValue", "()J", "booleanValue", "", "getBooleanValue", "()Z", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "mapBufferValue", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "getMapBufferValue", "()Lcom/facebook/react/common/mapbuffer/MapBuffer;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class MapBufferEntry implements MapBuffer.Entry {
        private final int bucketOffset;

        public MapBufferEntry(int i7) {
            this.bucketOffset = i7;
        }

        private final void assertType(MapBuffer.DataType expected) {
            MapBuffer.DataType type = getType();
            if (expected == type) {
                return;
            }
            throw new IllegalStateException(("Expected " + expected + " for key: " + getKey() + " found " + type + " instead.").toString());
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public boolean getBooleanValue() {
            assertType(MapBuffer.DataType.BOOL);
            return ReadableMapBuffer.this.readBooleanValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public double getDoubleValue() {
            assertType(MapBuffer.DataType.DOUBLE);
            return ReadableMapBuffer.this.readDoubleValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getIntValue() {
            assertType(MapBuffer.DataType.INT);
            return ReadableMapBuffer.this.readIntValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public int getKey() {
            return ReadableMapBuffer.this.m1231readUnsignedShortBwKQO78(this.bucketOffset) & 65535;
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        public long getLongValue() {
            assertType(MapBuffer.DataType.LONG);
            return ReadableMapBuffer.this.readLongValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer getMapBufferValue() {
            assertType(MapBuffer.DataType.MAP);
            return ReadableMapBuffer.this.readMapBufferValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public String getStringValue() {
            assertType(MapBuffer.DataType.STRING);
            return ReadableMapBuffer.this.readStringValue(this.bucketOffset + 4);
        }

        @Override // com.facebook.react.common.mapbuffer.MapBuffer.Entry
        @NotNull
        public MapBuffer.DataType getType() {
            return ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations() ? ReadableMapBuffer.DATA_TYPES[65535 & ReadableMapBuffer.this.m1231readUnsignedShortBwKQO78(this.bucketOffset + 2)] : MapBuffer.DataType.values()[65535 & ReadableMapBuffer.this.m1231readUnsignedShortBwKQO78(this.bucketOffset + 2)];
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapBuffer.DataType.values().length];
            try {
                iArr[MapBuffer.DataType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapBuffer.DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapBuffer.DataType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapBuffer.DataType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapBuffer.DataType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MapBuffer.DataType.MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.common.mapbuffer.ReadableMapBuffer$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\t\u0010\r\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"com/facebook/react/common/mapbuffer/ReadableMapBuffer$iterator$1", "", "Lcom/facebook/react/common/mapbuffer/MapBuffer$Entry;", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "last", "getLast", "hasNext", "", "next", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<MapBuffer.Entry>, KMappedMarker {
        private int current;
        private final int last;

        public AnonymousClass1() {
            this.last = ReadableMapBuffer.this.getCount() - 1;
        }

        public final int getCurrent() {
            return this.current;
        }

        public final int getLast() {
            return this.last;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current <= this.last;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i7) {
            this.current = i7;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MapBuffer.Entry next() {
            ReadableMapBuffer readableMapBuffer = ReadableMapBuffer.this;
            int i7 = this.current;
            this.current = i7 + 1;
            return readableMapBuffer.new MapBufferEntry(readableMapBuffer.getKeyOffsetForBucketIndex(i7));
        }
    }

    @a
    private ReadableMapBuffer(ByteBuffer byteBuffer, int i7) {
        this.buffer = byteBuffer;
        this.offsetToMapBuffer = i7;
        readHeader();
    }

    private final ReadableMapBuffer cloneWithOffset(int offset) {
        ByteBuffer byteBufferDuplicate = this.buffer.duplicate();
        byteBufferDuplicate.position(offset);
        Intrinsics.checkNotNullExpressionValue(byteBufferDuplicate, "apply(...)");
        return new ReadableMapBuffer(byteBufferDuplicate, offset);
    }

    private final int getBucketIndexForKey(int intKey) {
        IntRange kEY_RANGE$ReactAndroid_release = MapBuffer.INSTANCE.getKEY_RANGE$ReactAndroid_release();
        int i7 = kEY_RANGE$ReactAndroid_release.f14688d;
        if (intKey <= kEY_RANGE$ReactAndroid_release.f14689e && i7 <= intKey) {
            short s2 = (short) intKey;
            h0 h0Var = i0.f19474e;
            int count = getCount() - 1;
            int i10 = 0;
            while (i10 <= count) {
                int i11 = (i10 + count) >>> 1;
                int iM1231readUnsignedShortBwKQO78 = m1231readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(i11)) & 65535;
                int i12 = 65535 & s2;
                if (Intrinsics.compare(iM1231readUnsignedShortBwKQO78, i12) < 0) {
                    i10 = i11 + 1;
                } else {
                    if (Intrinsics.compare(iM1231readUnsignedShortBwKQO78, i12) <= 0) {
                        return i11;
                    }
                    count = i11 - 1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyOffsetForBucketIndex(int bucketIndex) {
        return (bucketIndex * 12) + this.offsetToMapBuffer + 8;
    }

    private final int getOffsetForDynamicData() {
        return getKeyOffsetForBucketIndex(getCount());
    }

    private final int getTypedValueOffsetForKey(int key, MapBuffer.DataType expected) {
        int bucketIndexForKey = getBucketIndexForKey(key);
        if (bucketIndexForKey == -1) {
            throw new IllegalArgumentException(b.h(key, "Key not found: ").toString());
        }
        MapBuffer.DataType dataType = readDataType(bucketIndexForKey);
        if (dataType == expected) {
            return getKeyOffsetForBucketIndex(bucketIndexForKey) + 4;
        }
        throw new IllegalStateException(("Expected " + expected + " for key: " + key + ", found " + dataType + " instead.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readBooleanValue(int bufferPosition) {
        return readIntValue(bufferPosition) == 1;
    }

    private final MapBuffer.DataType readDataType(int bucketIndex) {
        int iM1231readUnsignedShortBwKQO78 = m1231readUnsignedShortBwKQO78(getKeyOffsetForBucketIndex(bucketIndex) + 2) & 65535;
        return ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations() ? DATA_TYPES[iM1231readUnsignedShortBwKQO78] : MapBuffer.DataType.values()[iM1231readUnsignedShortBwKQO78];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double readDoubleValue(int bufferPosition) {
        return this.buffer.getDouble(bufferPosition);
    }

    private final void readHeader() {
        if (this.buffer.getShort() != ALIGNMENT) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = m1231readUnsignedShortBwKQO78(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int readIntValue(int bufferPosition) {
        return this.buffer.getInt(bufferPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long readLongValue(int bufferPosition) {
        return this.buffer.getLong(bufferPosition);
    }

    private final List<ReadableMapBuffer> readMapBufferListValue(int position) {
        ArrayList arrayList = new ArrayList();
        int i7 = this.buffer.getInt(position) + getOffsetForDynamicData();
        int i10 = this.buffer.getInt(i7);
        int i11 = i7 + 4;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = this.buffer.getInt(i11 + i12);
            int i14 = i12 + 4;
            arrayList.add(cloneWithOffset(i11 + i14));
            i12 = i14 + i13;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMapBuffer readMapBufferValue(int position) {
        return cloneWithOffset(this.buffer.getInt(position) + getOffsetForDynamicData() + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String readStringValue(int bufferPosition) {
        int i7 = this.buffer.getInt(bufferPosition) + getOffsetForDynamicData();
        int i10 = this.buffer.getInt(i7);
        byte[] bArr = new byte[i10];
        this.buffer.position(i7 + 4);
        this.buffer.get(bArr, 0, i10);
        return new String(bArr, Charsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnsignedShort-BwKQO78, reason: not valid java name */
    public final short m1231readUnsignedShortBwKQO78(int bufferPosition) {
        short s2 = this.buffer.getShort(bufferPosition);
        h0 h0Var = i0.f19474e;
        return s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$5(MapBuffer.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(entry.getKey());
        sb2.append('=');
        switch (WhenMappings.$EnumSwitchMapping$0[entry.getType().ordinal()]) {
            case 1:
                sb2.append(entry.getBooleanValue());
                return sb2;
            case 2:
                sb2.append(entry.getIntValue());
                return sb2;
            case 3:
                sb2.append(entry.getLongValue());
                return sb2;
            case 4:
                sb2.append(entry.getDoubleValue());
                return sb2;
            case 5:
                sb2.append('\"');
                sb2.append(entry.getStringValue());
                sb2.append('\"');
                return sb2;
            case 6:
                sb2.append(entry.getMapBufferValue().toString());
                return sb2;
            default:
                throw new n();
        }
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean contains(int key) {
        return getBucketIndexForKey(key) != -1;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.Entry entryAt(int offset) {
        return new MapBufferEntry(getKeyOffsetForBucketIndex(offset));
    }

    public boolean equals(Object other) {
        if (!(other instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) other).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return Intrinsics.areEqual(byteBuffer, byteBuffer2);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public boolean getBoolean(int key) {
        return readBooleanValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.BOOL));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getCount() {
        return this.count;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public double getDouble(int key) {
        return readDoubleValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.DOUBLE));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getInt(int key) {
        return readIntValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.INT));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public int getKeyOffset(int key) {
        return getBucketIndexForKey(key);
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    public long getLong(int key) {
        return readLongValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.LONG));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public List<ReadableMapBuffer> getMapBufferList(int key) {
        return readMapBufferListValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.MAP));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public String getString(int key) {
        return readStringValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.STRING));
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public MapBuffer.DataType getType(int key) {
        int bucketIndexForKey = getBucketIndexForKey(key);
        if (bucketIndexForKey != -1) {
            return readDataType(bucketIndexForKey);
        }
        throw new IllegalArgumentException(b.h(key, "Key not found: ").toString());
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<MapBuffer.Entry> iterator() {
        return new AnonymousClass1();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        CollectionsKt.N(this, sb2, null, null, null, new com.discord.user_search_worker.a(4), 62);
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.facebook.react.common.mapbuffer.MapBuffer
    @NotNull
    public ReadableMapBuffer getMapBuffer(int key) {
        return readMapBufferValue(getTypedValueOffsetForKey(key, MapBuffer.DataType.MAP));
    }
}
