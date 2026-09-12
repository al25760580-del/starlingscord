package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromArray;", "Lcom/facebook/react/bridge/Dynamic;", "<init>", "()V", "array", "Lcom/facebook/react/bridge/ReadableArray;", "index", "", "recycle", "", "type", "Lcom/facebook/react/bridge/ReadableType;", "getType", "()Lcom/facebook/react/bridge/ReadableType;", "isNull", "", "()Z", "asArray", "asBoolean", "asDouble", "", "asInt", "asMap", "Lcom/facebook/react/bridge/ReadableMap;", "asString", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicFromArray implements Dynamic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThreadLocal<Pools$SimplePool> pool = new ThreadLocal<Pools$SimplePool>() { // from class: com.facebook.react.bridge.DynamicFromArray$Companion$pool$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Pools$SimplePool initialValue() {
            return new Pools$SimplePool(10);
        }
    };
    private ReadableArray array;
    private int index;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromArray$Companion;", "", "<init>", "()V", "pool", "Ljava/lang/ThreadLocal;", "Landroidx/core/util/Pools$SimplePool;", "Lcom/facebook/react/bridge/DynamicFromArray;", "create", "array", "Lcom/facebook/react/bridge/ReadableArray;", "index", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DynamicFromArray create(@NotNull ReadableArray array, int index) {
            DynamicFromArray dynamicFromArray;
            Intrinsics.checkNotNullParameter(array, "array");
            Pools$SimplePool pools$SimplePool = (Pools$SimplePool) DynamicFromArray.pool.get();
            if (pools$SimplePool == null || (dynamicFromArray = (DynamicFromArray) pools$SimplePool.acquire()) == null) {
                dynamicFromArray = new DynamicFromArray(null);
            }
            dynamicFromArray.array = array;
            dynamicFromArray.index = index;
            return dynamicFromArray;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicFromArray(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final DynamicFromArray create(@NotNull ReadableArray readableArray, int i7) {
        return INSTANCE.create(readableArray, i7);
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableArray asArray() {
        ReadableArray array;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (array = readableArray.getArray(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return array;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getBoolean(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getDouble(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getInt(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableMap asMap() {
        ReadableMap map;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (map = readableArray.getMap(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return map;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public String asString() {
        String string;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (string = readableArray.getString(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return string;
    }

    @Override // com.facebook.react.bridge.Dynamic
    @NotNull
    public ReadableType getType() {
        ReadableType type;
        ReadableArray readableArray = this.array;
        if (readableArray == null || (type = readableArray.getType(this.index)) == null) {
            throw new IllegalStateException("This dynamic value has been recycled");
        }
        return type;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.isNull(this.index);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.array = null;
        this.index = -1;
        Pools$SimplePool pools$SimplePool = pool.get();
        if (pools$SimplePool != null) {
            pools$SimplePool.release(this);
        }
    }

    private DynamicFromArray() {
        this.index = -1;
    }
}
