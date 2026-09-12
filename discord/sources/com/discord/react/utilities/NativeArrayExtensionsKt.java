package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import lo.j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0000\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\n\u0010\u0005\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\f¢\u0006\u0004\b\n\u0010\r\u001a)\u0010\u0011\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u000e*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u000f0\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e*\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u0010\u0006*\u00020\u00182\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u0010\u0006*\u00020\u00182\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010!\u001aK\u0010%\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0010\b\u0001\u0010#*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"*\u00020\u00182\u0006\u0010$\u001a\u00028\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00000\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aQ\u0010%\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0006\"\u0010\b\u0001\u0010#*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"*\u00020\u00182\u0006\u0010$\u001a\u00028\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010'\u001a+\u0010)\u001a\u00020\u0015*\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a1\u0010)\u001a\u00020\u0015*\u00020\u00182\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150 H\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010+\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001d*\u00020\u0018¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001d*\u00020\u0018¢\u0006\u0004\b/\u0010-\u001a\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001d*\u00020\u0018¢\u0006\u0004\b1\u0010-\u001a\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d*\u00020\u0018¢\u0006\u0004\b2\u0010-\u001a\u0011\u00104\u001a\u000203*\u00020\u0018¢\u0006\u0004\b4\u00105\u001a\u0011\u00106\u001a\u00020\u0010*\u00020\u0018¢\u0006\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"", "", "elements", "Lcom/facebook/react/bridge/ReadableNativeArray;", "nativeArrayOf", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/ReadableNativeArray;", "T", "", "Lkotlin/Function1;", ViewProps.TRANSFORM, "toNativeArray", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/bridge/ReadableNativeArray;", "", "([I)Lcom/facebook/react/bridge/ReadableNativeArray;", "V", "", "", "toNativeArrayOfMaps", "(Ljava/util/Collection;)Lcom/facebook/react/bridge/ReadableNativeArray;", "Lcom/facebook/react/bridge/WritableArray;", "value", "", "push", "(Lcom/facebook/react/bridge/WritableArray;Ljava/lang/Object;)V", "Lcom/facebook/react/bridge/ReadableArray;", "Lkotlin/ranges/IntRange;", "sizeRange", "(Lcom/facebook/react/bridge/ReadableArray;)Lkotlin/ranges/IntRange;", "", "", "map", "(Lcom/facebook/react/bridge/ReadableArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlin/Function2;", "(Lcom/facebook/react/bridge/ReadableArray;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "C", "destination", "mapTo", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Ljava/util/Collection;", "action", "forEach", "(Lcom/facebook/react/bridge/ReadableArray;Lkotlin/jvm/functions/Function1;)V", "(Lcom/facebook/react/bridge/ReadableArray;Lkotlin/jvm/functions/Function2;)V", "toIntList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "", "toDoubleList", "", "toBooleanList", "toStringList", "Lorg/json/JSONArray;", "toJson", "(Lcom/facebook/react/bridge/ReadableArray;)Lorg/json/JSONArray;", "toJsonString", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;", "react_utilities_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNativeArrayExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeArrayExtensions.kt\ncom/discord/react/utilities/NativeArrayExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n97#1:167\n119#1:180\n97#1:183\n97#1:188\n97#1:193\n97#1:198\n13472#2,2:151\n13472#2,2:155\n13493#2,2:157\n1869#3,2:153\n1563#3:159\n1634#3,3:160\n1563#3:163\n1634#3,3:164\n1563#3:168\n1634#3,3:169\n1634#3,3:172\n1634#3,3:175\n1869#3,2:178\n1869#3,2:181\n1563#3:184\n1634#3,3:185\n1563#3:189\n1634#3,3:190\n1563#3:194\n1634#3,3:195\n1563#3:199\n1634#3,3:200\n*S KotlinDebug\n*F\n+ 1 NativeArrayExtensions.kt\ncom/discord/react/utilities/NativeArrayExtensionsKt\n*L\n100#1:167\n122#1:180\n126#1:183\n128#1:188\n130#1:193\n132#1:198\n20#1:151,2\n35#1:155,2\n40#1:157,2\n28#1:153,2\n47#1:159\n47#1:160,3\n97#1:163\n97#1:164,3\n100#1:168\n100#1:169,3\n108#1:172,3\n114#1:175,3\n119#1:178,2\n122#1:181,2\n126#1:184\n126#1:185,3\n128#1:189\n128#1:190,3\n130#1:194\n130#1:195,3\n132#1:199\n132#1:200,3\n*E\n"})
public final class NativeArrayExtensionsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void forEach(@NotNull ReadableArray readableArray, @NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator it = sizeRange(readableArray).iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @NotNull
    public static final <T> List<T> map(@NotNull ReadableArray readableArray, @NotNull Function1<? super Integer, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        IntRange intRangeSizeRange = sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator<T> it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C mapTo(@NotNull ReadableArray readableArray, @NotNull C destination, @NotNull Function1<? super Integer, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<T> it = sizeRange(readableArray).iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @NotNull
    public static final ReadableNativeArray nativeArrayOf(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : elements) {
            push(writableNativeArray, obj);
        }
        return writableNativeArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V> void push(@NotNull WritableArray writableArray, V v6) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        if (v6 instanceof String) {
            writableArray.pushString((String) v6);
            return;
        }
        if (v6 instanceof Integer) {
            writableArray.pushInt(((Number) v6).intValue());
            return;
        }
        if (v6 instanceof Double) {
            writableArray.pushDouble(((Number) v6).doubleValue());
            return;
        }
        if (v6 instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) v6).booleanValue());
            return;
        }
        if (v6 instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) v6);
            return;
        }
        if (v6 instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) v6);
        } else if (v6 instanceof Long) {
            writableArray.pushDouble(((Number) v6).longValue());
        } else {
            if (v6 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            writableArray.pushNull();
        }
    }

    @NotNull
    public static final IntRange sizeRange(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        return j.i(0, readableArray.size());
    }

    @NotNull
    public static final List<Boolean> toBooleanList(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        IntRange intRangeSizeRange = sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(readableArray.getBoolean(((s0) it).nextInt())));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> toDoubleList(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        IntRange intRangeSizeRange = sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(readableArray.getDouble(((s0) it).nextInt())));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> toIntList(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        IntRange intRangeSizeRange = sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(readableArray.getInt(((s0) it).nextInt())));
        }
        return arrayList;
    }

    @NotNull
    public static final JSONArray toJson(@NotNull ReadableArray readableArray) throws JSONException {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i7).ordinal()]) {
                case 1:
                    Unit unit = Unit.f14616a;
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i7));
                    break;
                case 3:
                    jSONArray.put(readableArray.getDouble(i7));
                    break;
                case 4:
                    jSONArray.put(readableArray.getString(i7));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i7);
                    Intrinsics.checkNotNull(map);
                    jSONArray.put(NativeMapExtensionsKt.toJson(map));
                    break;
                case 6:
                    ReadableArray array = readableArray.getArray(i7);
                    Intrinsics.checkNotNull(array);
                    jSONArray.put(toJson(array));
                    break;
                default:
                    throw new n();
            }
        }
        return jSONArray;
    }

    @NotNull
    public static final String toJsonString(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        String string = toJson(readableArray).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final <T> ReadableNativeArray toNativeArray(@NotNull Collection<? extends T> collection, Function1<? super T, ? extends Object> function1) {
        Object objInvoke;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : collection) {
            if (function1 != null && (objInvoke = function1.invoke(obj)) != null) {
                obj = objInvoke;
            }
            push(writableNativeArray, obj);
        }
        return writableNativeArray;
    }

    public static /* synthetic */ ReadableNativeArray toNativeArray$default(Collection collection, Function1 function1, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            function1 = null;
        }
        return toNativeArray(collection, function1);
    }

    @NotNull
    public static final <V> ReadableNativeArray toNativeArrayOfMaps(@NotNull Collection<? extends Map<String, ? extends V>> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends Map<String, ? extends V>> collection2 = collection;
        ArrayList arrayList = new ArrayList(e0.l(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeMapExtensionsKt.toNativeMap((Map) it.next()));
        }
        return toNativeArray$default(arrayList, null, 1, null);
    }

    @NotNull
    public static final List<String> toStringList(@NotNull ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        IntRange intRangeSizeRange = sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            String string = readableArray.getString(((s0) it).nextInt());
            Intrinsics.checkNotNull(string);
            arrayList.add(string);
        }
        return arrayList;
    }

    public static final void forEach(@NotNull ReadableArray readableArray, @NotNull Function2<? super Integer, ? super ReadableArray, Unit> action) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator it = sizeRange(readableArray).iterator();
        while (it.hasNext()) {
            action.invoke(Integer.valueOf(((s0) it).nextInt()), readableArray);
        }
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C mapTo(@NotNull ReadableArray readableArray, @NotNull C destination, @NotNull Function2<? super Integer, ? super ReadableArray, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<T> it = sizeRange(readableArray).iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(Integer.valueOf(((s0) it).nextInt()), readableArray));
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> map(@NotNull ReadableArray readableArray, @NotNull Function2<? super Integer, ? super ReadableArray, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(readableArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        IntRange intRangeSizeRange = sizeRange(readableArray);
        ArrayList arrayList = new ArrayList(e0.l(intRangeSizeRange, 10));
        Iterator<T> it = intRangeSizeRange.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(Integer.valueOf(((s0) it).nextInt()), readableArray));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> ReadableNativeArray toNativeArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t5 : tArr) {
            push(writableNativeArray, t5);
        }
        return writableNativeArray;
    }

    @NotNull
    public static final ReadableNativeArray toNativeArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i7 : iArr) {
            push(writableNativeArray, Integer.valueOf(i7));
        }
        return writableNativeArray;
    }
}
