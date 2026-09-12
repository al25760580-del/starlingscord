package app.rive.runtime.kotlin.core;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0019\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0082 J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0082 J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0019\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0082 J\u0019\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0082 J\u0019\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0082 J\u0011\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0082 J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0082 J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u0011\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0086\u0002J\b\u0010!\u001a\u00020\u0002H\u0014J\u0015\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u0010'\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006)"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelListProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "unsafeCppPointer", "", "(J)V", "cachedItems", "", "Lapp/rive/runtime/kotlin/core/ViewModelListProperty$CacheEntry;", "size", "", "getSize", "()I", "add", "item", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "index", "boundsCheck", "cppAdd", "cppPointer", "itemPointer", "cppAddAt", "cppDelete", "pointer", "cppElementAt", "cppRemove", "cppRemoveAt", "cppSize", "cppSwap", "index1", "index2", "elementAt", "get", "nativeGetValue", "nativeSetValue", "value", "(Lkotlin/Unit;)V", "remove", "removeAt", "swap", "CacheEntry", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModelInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelListProperty\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,766:1\n1863#2,2:767\n1#3:769\n381#4,7:770\n381#4,7:777\n*S KotlinDebug\n*F\n+ 1 ViewModelInstance.kt\napp/rive/runtime/kotlin/core/ViewModelListProperty\n*L\n533#1:767,2\n582#1:770,7\n602#1:777,7\n*E\n"})
public final class ViewModelListProperty extends ViewModelProperty<Unit> {
    public static final int $stable = 8;

    @NotNull
    private Map<Long, CacheEntry> cachedItems;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelListProperty$CacheEntry;", "", "instance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "count", "", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;I)V", "getCount", "()I", "setCount", "(I)V", "getInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CacheEntry {
        private int count;

        @NotNull
        private final ViewModelInstance instance;

        public CacheEntry(@NotNull ViewModelInstance instance, int i7) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            this.instance = instance;
            this.count = i7;
        }

        public static /* synthetic */ CacheEntry copy$default(CacheEntry cacheEntry, ViewModelInstance viewModelInstance, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewModelInstance = cacheEntry.instance;
            }
            if ((i10 & 2) != 0) {
                i7 = cacheEntry.count;
            }
            return cacheEntry.copy(viewModelInstance, i7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final CacheEntry copy(@NotNull ViewModelInstance instance, int count) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            return new CacheEntry(instance, count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheEntry)) {
                return false;
            }
            CacheEntry cacheEntry = (CacheEntry) other;
            return Intrinsics.areEqual(this.instance, cacheEntry.instance) && this.count == cacheEntry.count;
        }

        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        public int hashCode() {
            return Integer.hashCode(this.count) + (this.instance.hashCode() * 31);
        }

        public final void setCount(int i7) {
            this.count = i7;
        }

        @NotNull
        public String toString() {
            return "CacheEntry(instance=" + this.instance + ", count=" + this.count + ")";
        }
    }

    public ViewModelListProperty(long j) {
        super(j);
        this.cachedItems = new LinkedHashMap();
    }

    private final void boundsCheck(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index out of bounds for ViewModelListProperty.");
        }
    }

    private final native void cppAdd(long cppPointer, long itemPointer);

    private final native void cppAddAt(long cppPointer, int index, long itemPointer);

    private final native long cppElementAt(long cppPointer, int index);

    private final native void cppRemove(long cppPointer, long itemPointer);

    private final native void cppRemoveAt(long cppPointer, int index);

    private final native int cppSize(long cppPointer);

    private final native void cppSwap(long cppPointer, int index1, int index2);

    public final void add(@NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!item.getHasCppObject()) {
            throw new IllegalArgumentException("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
        }
        Map<Long, CacheEntry> map = this.cachedItems;
        Long lValueOf = Long.valueOf(item.getCppPointer());
        CacheEntry cacheEntry = map.get(lValueOf);
        if (cacheEntry == null) {
            item.acquire();
            cacheEntry = new CacheEntry(item, 0);
            map.put(lValueOf, cacheEntry);
        }
        CacheEntry cacheEntry2 = cacheEntry;
        cacheEntry2.setCount(cacheEntry2.getCount() + 1);
        cppAdd(getCppPointer(), item.getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public void cppDelete(long pointer) {
        super.cppDelete(pointer);
        Iterator<T> it = this.cachedItems.values().iterator();
        while (it.hasNext()) {
            ((CacheEntry) it.next()).getInstance().release();
        }
        this.cachedItems.clear();
    }

    @NotNull
    public final ViewModelInstance elementAt(int index) {
        ViewModelInstance cacheEntry;
        boundsCheck(index);
        long jCppElementAt = cppElementAt(getCppPointer(), index);
        CacheEntry cacheEntry2 = this.cachedItems.get(Long.valueOf(jCppElementAt));
        if (cacheEntry2 != null && (cacheEntry = cacheEntry2.getInstance()) != null) {
            return cacheEntry;
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppElementAt);
        this.cachedItems.put(Long.valueOf(jCppElementAt), new CacheEntry(viewModelInstance, 1));
        return viewModelInstance;
    }

    @NotNull
    public final ViewModelInstance get(int index) {
        return elementAt(index);
    }

    public final int getSize() {
        return cppSize(getCppPointer());
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(@NotNull Unit value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public final void remove(@NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!item.getHasCppObject()) {
            throw new IllegalArgumentException("Cannot remove a disposed ViewModelProperty from ViewModelListProperty.");
        }
        CacheEntry cacheEntryRemove = this.cachedItems.remove(Long.valueOf(item.getCppPointer()));
        if (cacheEntryRemove != null) {
            cacheEntryRemove.getInstance().release();
        }
        cppRemove(getCppPointer(), item.getCppPointer());
    }

    public final void removeAt(int index) {
        CacheEntry cacheEntryRemove;
        boundsCheck(index);
        long jCppElementAt = cppElementAt(getCppPointer(), index);
        CacheEntry cacheEntry = this.cachedItems.get(Long.valueOf(jCppElementAt));
        if (cacheEntry != null) {
            cacheEntry.setCount(cacheEntry.getCount() - 1);
            if (cacheEntry.getCount() == 0 && (cacheEntryRemove = this.cachedItems.remove(Long.valueOf(jCppElementAt))) != null) {
                cacheEntryRemove.getInstance().release();
            }
        }
        cppRemoveAt(getCppPointer(), index);
    }

    public final void swap(int index1, int index2) {
        boundsCheck(index1);
        boundsCheck(index2);
        if (index1 == index2) {
            return;
        }
        cppSwap(getCppPointer(), index1, index2);
    }

    @Override // app.rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ Unit nativeGetValue() {
        nativeGetValue2();
        return Unit.f14616a;
    }

    public final void add(int index, @NotNull ViewModelInstance item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boundsCheck(index);
        if (item.getHasCppObject()) {
            Map<Long, CacheEntry> map = this.cachedItems;
            Long lValueOf = Long.valueOf(item.getCppPointer());
            CacheEntry cacheEntry = map.get(lValueOf);
            if (cacheEntry == null) {
                item.acquire();
                cacheEntry = new CacheEntry(item, 0);
                map.put(lValueOf, cacheEntry);
            }
            CacheEntry cacheEntry2 = cacheEntry;
            cacheEntry2.setCount(cacheEntry2.getCount() + 1);
            cppAddAt(getCppPointer(), index, item.getCppPointer());
            return;
        }
        throw new IllegalArgumentException("Cannot add a disposed ViewModelProperty to ViewModelListProperty.");
    }
}
