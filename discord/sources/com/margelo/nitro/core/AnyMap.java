package com.margelo.nitro.core;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001UB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tJ0\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\fH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011H\u0087 ¢\u0006\u0004\b\u001b\u0010\u0003J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b \u0010\u0018J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b!\u0010\u0018J\u0018\u0010\"\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\"\u0010\u0018J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b#\u0010\u0018J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b$\u0010\u0018J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b%\u0010\u0018J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b)\u0010\u0018J\u0018\u0010+\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b-\u0010.J\"\u00101\u001a\f\u0012\u0004\u0012\u00020/0\u001cj\u0002`02\u0006\u0010\u000f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b1\u00102J(\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020/03j\u0002`42\u0006\u0010\u000f\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b7\u0010\u001aJ \u00108\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020&H\u0087 ¢\u0006\u0004\b8\u00109J \u0010:\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0016H\u0087 ¢\u0006\u0004\b:\u0010;J \u0010<\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020*H\u0087 ¢\u0006\u0004\b<\u0010=J \u0010>\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b>\u0010?J*\u0010@\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020/0\u001cj\u0002`0H\u0086 ¢\u0006\u0004\b@\u0010AJ0\u0010B\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020/03j\u0002`4H\u0086 ¢\u0006\u0004\bB\u0010CJ\u0018\u0010E\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\bE\u0010FJ.\u0010I\u001a\u00020\u00112\u0014\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001032\u0006\u0010H\u001a\u00020\u0016H\u0082 ¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020/2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\bK\u0010LJ \u0010M\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020/H\u0082 ¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\bO\u0010PJ\u0018\u0010O\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\bO\u0010QR\u0014\u0010R\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/margelo/nitro/core/AnyMap;", "", "<init>", "()V", "", "preallocatedSize", "(I)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "toHashMap", "()Ljava/util/HashMap;", "key", "value", "", "setAny", "(Ljava/lang/String;Ljava/lang/Object;)V", "getAny", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contains", "(Ljava/lang/String;)Z", "remove", "(Ljava/lang/String;)V", "clear", "", "getAllKeys", "()[Ljava/lang/String;", "isNull", "isDouble", "isBoolean", "isInt64", "isString", "isArray", "isObject", "", "getDouble", "(Ljava/lang/String;)D", "getBoolean", "", "getInt64", "(Ljava/lang/String;)J", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/margelo/nitro/core/AnyValue;", "Lcom/margelo/nitro/core/AnyArray;", "getAnyArray", "(Ljava/lang/String;)[Lcom/margelo/nitro/core/AnyValue;", "", "Lcom/margelo/nitro/core/AnyObject;", "getAnyObject", "(Ljava/lang/String;)Ljava/util/Map;", "setNull", "setDouble", "(Ljava/lang/String;D)V", "setBoolean", "(Ljava/lang/String;Z)V", "setInt64", "(Ljava/lang/String;J)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setAnyArray", "(Ljava/lang/String;[Lcom/margelo/nitro/core/AnyValue;)V", "setAnyObject", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "merge", "(Lcom/margelo/nitro/core/AnyMap;)V", "map", "ignoreIncompatible", "fromHashMap", "(Ljava/util/Map;Z)V", "getAnyValue", "(Ljava/lang/String;)Lcom/margelo/nitro/core/AnyValue;", "setAnyValue", "(Ljava/lang/String;Lcom/margelo/nitro/core/AnyValue;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "(I)Lcom/facebook/jni/HybridData;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "com/margelo/nitro/core/a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyMap {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    private final HybridData mHybridData;

    public AnyMap() {
        this.mHybridData = initHybrid();
    }

    private final native void fromHashMap(Map<String, ? extends Object> map, boolean ignoreIncompatible);

    @NotNull
    public static final native AnyMap fromMap(@NotNull Map<String, ? extends Object> map, boolean z5);

    private final native AnyValue getAnyValue(String key);

    private final native HybridData initHybrid();

    private final native HybridData initHybrid(int preallocatedSize);

    private final native void setAnyValue(String key, AnyValue value);

    @FastNative
    public final native void clear();

    @FastNative
    public final native boolean contains(@NotNull String key);

    @NotNull
    public final native String[] getAllKeys();

    public final Object getAny(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getAnyValue(key).toAny();
    }

    @NotNull
    public final native AnyValue[] getAnyArray(@NotNull String key);

    @NotNull
    public final native Map<String, AnyValue> getAnyObject(@NotNull String key);

    @FastNative
    public final native boolean getBoolean(@NotNull String key);

    @FastNative
    public final native double getDouble(@NotNull String key);

    @FastNative
    public final native long getInt64(@NotNull String key);

    @NotNull
    public final native String getString(@NotNull String key);

    @FastNative
    public final native boolean isArray(@NotNull String key);

    @FastNative
    public final native boolean isBoolean(@NotNull String key);

    @FastNative
    public final native boolean isDouble(@NotNull String key);

    @FastNative
    public final native boolean isInt64(@NotNull String key);

    @FastNative
    public final native boolean isNull(@NotNull String key);

    @FastNative
    public final native boolean isObject(@NotNull String key);

    @FastNative
    public final native boolean isString(@NotNull String key);

    public final native void merge(@NotNull AnyMap other);

    @FastNative
    public final native void remove(@NotNull String key);

    public final void setAny(@NotNull String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        AnyValue.Companion.getClass();
        setAnyValue(key, b.a(value));
    }

    public final native void setAnyArray(@NotNull String key, @NotNull AnyValue[] value);

    public final native void setAnyObject(@NotNull String key, @NotNull Map<String, AnyValue> value);

    @FastNative
    public final native void setBoolean(@NotNull String key, boolean value);

    @FastNative
    public final native void setDouble(@NotNull String key, double value);

    @FastNative
    public final native void setInt64(@NotNull String key, long value);

    @FastNative
    public final native void setNull(@NotNull String key);

    @FastNative
    public final native void setString(@NotNull String key, @NotNull String value);

    @NotNull
    public final native HashMap<String, Object> toHashMap();

    public AnyMap(int i7) {
        this.mHybridData = initHybrid(i7);
    }

    private AnyMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
