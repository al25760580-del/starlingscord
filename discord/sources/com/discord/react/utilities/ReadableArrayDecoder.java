package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import rr.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/discord/react/utilities/ReadableArrayDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "array", "Lcom/facebook/react/bridge/ReadableArray;", "hasBegunStructure", "", "<init>", "(Lcom/facebook/react/bridge/ReadableArray;Z)V", "decodeIndex", "", "elementIndex", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeBoolean", "decodeDouble", "", "decodeFloat", "", "decodeInt", "decodeString", "", "decodeNotNullMark", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeSequentially", "decodeCollectionSize", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReadableArrayDecoder extends AbstractDecoder {

    @NotNull
    private final ReadableArray array;
    private int decodeIndex;
    private int elementIndex;

    @NotNull
    private final SerializersModule serializersModule;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReadableArrayDecoder(@NotNull ReadableArray array, boolean z5) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
        this.decodeIndex = z5 ? 0 : -1;
        this.serializersModule = b.f19552a;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i7 = this.decodeIndex;
        if (i7 < 0) {
            this.decodeIndex = i7 + 1;
            return new ReadableArrayDecoder(this.array, true);
        }
        ReadableType type = this.array.getType(i7);
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            ReadableArray readableArray = this.array;
            int i11 = this.decodeIndex;
            this.decodeIndex = i11 + 1;
            ReadableMap map = readableArray.getMap(i11);
            if (map != null) {
                return new ReadableMapDecoder(map);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i10 == 2) {
            ReadableArray readableArray2 = this.array;
            int i12 = this.decodeIndex;
            this.decodeIndex = i12 + 1;
            ReadableArray array = readableArray2.getArray(i12);
            if (array != null) {
                return new ReadableArrayDecoder(array, true);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new UnsupportedOperationException("Didn't expect beginStructure @ " + this.decodeIndex + " (" + type + ")");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        ReadableArray readableArray = this.array;
        int i7 = this.decodeIndex;
        this.decodeIndex = i7 + 1;
        return readableArray.getBoolean(i7);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public int decodeCollectionSize(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.array.size();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        ReadableArray readableArray = this.array;
        int i7 = this.decodeIndex;
        this.decodeIndex = i7 + 1;
        return readableArray.getDouble(i7);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.elementIndex >= this.array.size()) {
            return -1;
        }
        int i7 = this.elementIndex;
        this.elementIndex = i7 + 1;
        return i7;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        ReadableArray readableArray = this.array;
        int i7 = this.decodeIndex;
        this.decodeIndex = i7 + 1;
        return (float) readableArray.getDouble(i7);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        ReadableArray readableArray = this.array;
        int i7 = this.decodeIndex;
        this.decodeIndex = i7 + 1;
        return readableArray.getInt(i7);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        if (!this.array.isNull(this.decodeIndex)) {
            return true;
        }
        this.decodeIndex++;
        return false;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public boolean decodeSequentially() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        ReadableArray readableArray = this.array;
        int i7 = this.decodeIndex;
        this.decodeIndex = i7 + 1;
        String string = readableArray.getString(i7);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public /* synthetic */ ReadableArrayDecoder(ReadableArray readableArray, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(readableArray, (i7 & 2) != 0 ? false : z5);
    }
}
