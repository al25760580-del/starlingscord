package com.discord.react.utilities;

import a3.e;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import rr.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/discord/react/utilities/ReadableMapDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lcom/facebook/react/bridge/ReadableMap;", "map", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "T", "Lkotlin/Function2;", "", "reader", "read", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeBoolean", "()Z", "", "decodeDouble", "()D", "", "decodeFloat", "()F", "decodeInt", "()I", "decodeString", "()Ljava/lang/String;", "decodeNotNullMark", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "keysIterator", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "currentKey", "Ljava/lang/String;", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "react_utilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSerde.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serde.kt\ncom/discord/react/utilities/ReadableMapDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n115#1,2:127\n115#1,2:130\n115#1,2:133\n115#1,2:136\n115#1,2:139\n115#1,2:142\n1#2:129\n1#2:132\n1#2:135\n1#2:138\n1#2:141\n1#2:144\n1#2:145\n*S KotlinDebug\n*F\n+ 1 Serde.kt\ncom/discord/react/utilities/ReadableMapDecoder\n*L\n93#1:127,2\n95#1:130,2\n97#1:133,2\n99#1:136,2\n101#1:139,2\n103#1:142,2\n93#1:129\n95#1:132\n97#1:135\n99#1:138\n101#1:141\n103#1:144\n*E\n"})
public final class ReadableMapDecoder extends AbstractDecoder {
    private String currentKey;

    @NotNull
    private final ReadableMapKeySetIterator keysIterator;

    @NotNull
    private final ReadableMap map;

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

    public ReadableMapDecoder(@NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.keysIterator = map.keySetIterator();
        this.serializersModule = b.f19552a;
    }

    private final <T> T read(Function2<? super ReadableMap, ? super String, ? extends T> reader) {
        String str = this.currentKey;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        T t5 = (T) reader.invoke(this.map, str);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException(e.l("Expected to have a value for ", this.currentKey).toString());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String str = this.currentKey;
        if (str == null) {
            return new ReadableMapDecoder(this.map);
        }
        ReadableType type = this.map.getType(str);
        int i7 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i7 == 1) {
            ReadableMap map = this.map.getMap(str);
            if (map != null) {
                return new ReadableMapDecoder(map);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i7 == 2) {
            ReadableArray array = this.map.getArray(str);
            if (array != null) {
                return new ReadableArrayDecoder(array, true);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new UnsupportedOperationException("Didn't expect beginStructure @ " + str + " (" + type + ")");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        String str = this.currentKey;
        if (str != null) {
            return this.map.getBoolean(str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        String str = this.currentKey;
        if (str != null) {
            return this.map.getDouble(str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.keysIterator.hasNextKey()) {
            return -1;
        }
        String strNextKey = this.keysIterator.nextKey();
        this.currentKey = strNextKey;
        return descriptor.f(strNextKey);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        String str = this.currentKey;
        if (str != null) {
            return (float) this.map.getDouble(str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        String str = this.currentKey;
        if (str != null) {
            return this.map.getInt(str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        String str = this.currentKey;
        if (str != null) {
            return !this.map.isNull(str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String decodeString() {
        String str = this.currentKey;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = this.map.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException(e.l("Expected to have a value for ", this.currentKey).toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
