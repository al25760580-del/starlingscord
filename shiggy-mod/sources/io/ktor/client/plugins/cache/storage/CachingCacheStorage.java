package io.ktor.client.plugins.cache.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileCacheStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0016R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "<init>", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "", "store", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CachingCacheStorage implements CacheStorage {
    private final CacheStorage delegate;
    private final ConcurrentMap<Url, Set<CachedResponseData>> store;

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {47}, m = "find", n = {"url", "varyKeys"}, s = {"L$0", "L$1"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.find(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {57}, m = "findAll", n = {"url"}, s = {"L$0"}, v = 1)
    static final class C00451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C00451(Continuation<? super C00451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.findAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1}, l = {HtmlCompat.FROM_HTML_MODE_COMPACT, 64}, m = "remove", n = {"url", "varyKeys", "url", "varyKeys"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    static final class C00461 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00461(Continuation<? super C00461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.remove(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {68}, m = "removeAll", n = {"url"}, s = {"L$0"}, v = 1)
    static final class C00471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00471(Continuation<? super C00471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.removeAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1}, l = {41, 42}, m = "store", n = {"url", "data", "url", "data"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    static final class C00481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00481(Continuation<? super C00481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.store(null, null, this);
        }
    }

    public CachingCacheStorage(CacheStorage delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.store = new ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, Continuation<? super Unit> continuation) throws Throwable {
        C00481 c00481;
        Map map;
        if (continuation instanceof C00481) {
            c00481 = (C00481) continuation;
            if ((c00481.label & Integer.MIN_VALUE) != 0) {
                c00481.label -= Integer.MIN_VALUE;
            } else {
                c00481 = new C00481(continuation);
            }
        } else {
            c00481 = new C00481(continuation);
        }
        Object obj = c00481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00481.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CacheStorage cacheStorage = this.delegate;
            c00481.L$0 = url;
            c00481.L$1 = SpillingKt.nullOutSpilledVariable(cachedResponseData);
            c00481.label = 1;
            if (cacheStorage.store(url, cachedResponseData, c00481) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            cachedResponseData = (CachedResponseData) c00481.L$1;
            url = (Url) c00481.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c00481.L$3;
            map = (Map) c00481.L$2;
            ResultKt.throwOnFailure(obj);
        }
        map.put(url, obj);
        return Unit.INSTANCE;
        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
        CacheStorage cacheStorage2 = this.delegate;
        c00481.L$0 = SpillingKt.nullOutSpilledVariable(url);
        c00481.L$1 = SpillingKt.nullOutSpilledVariable(cachedResponseData);
        c00481.L$2 = concurrentMap;
        c00481.L$3 = url;
        c00481.label = 2;
        Object objFindAll = cacheStorage2.findAll(url, c00481);
        if (objFindAll != coroutine_suspended) {
            obj = objFindAll;
            map = concurrentMap;
            map.put(url, obj);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:22:0x007d->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:1: B:28:0x0099->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object find(Url url, Map<String, String> map, Continuation<? super CachedResponseData> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Map<String, String> map2;
        Map map3;
        Url url2;
        CachedResponseData cachedResponseData;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.store.containsKey(url)) {
                ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
                CacheStorage cacheStorage = this.delegate;
                anonymousClass1.L$0 = url;
                anonymousClass1.L$1 = map;
                anonymousClass1.L$2 = concurrentMap;
                anonymousClass1.L$3 = url;
                anonymousClass1.label = 1;
                Object objFindAll = cacheStorage.findAll(url, anonymousClass1);
                if (objFindAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map2 = map;
                map3 = concurrentMap;
                obj = objFindAll;
                url2 = url;
            }
            for (Object obj2 : (Set) MapsKt.getValue(this.store, url)) {
                cachedResponseData = (CachedResponseData) obj2;
                if (map.isEmpty()) {
                    return obj2;
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(entry.getKey()), entry.getValue())) {
                    }
                }
                return obj2;
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        url = (Url) anonymousClass1.L$3;
        map3 = (Map) anonymousClass1.L$2;
        map2 = (Map) anonymousClass1.L$1;
        url2 = (Url) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        map3.put(url, obj);
        url = url2;
        map = map2;
        while (r6.hasNext()) {
            cachedResponseData = (CachedResponseData) obj2;
            if (map.isEmpty()) {
                return obj2;
            }
            while (r1.hasNext()) {
                if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(entry.getKey()), entry.getValue())) {
                }
            }
            return obj2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object findAll(Url url, Continuation<? super Set<CachedResponseData>> continuation) throws Throwable {
        C00451 c00451;
        Map map;
        Url url2;
        if (continuation instanceof C00451) {
            c00451 = (C00451) continuation;
            if ((c00451.label & Integer.MIN_VALUE) != 0) {
                c00451.label -= Integer.MIN_VALUE;
            } else {
                c00451 = new C00451(continuation);
            }
        } else {
            c00451 = new C00451(continuation);
        }
        Object obj = c00451.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00451.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.store.containsKey(url)) {
                ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
                CacheStorage cacheStorage = this.delegate;
                c00451.L$0 = url;
                c00451.L$1 = concurrentMap;
                c00451.L$2 = url;
                c00451.label = 1;
                Object objFindAll = cacheStorage.findAll(url, c00451);
                if (objFindAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map = concurrentMap;
                obj = objFindAll;
                url2 = url;
            }
            return MapsKt.getValue(this.store, url);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        url = (Url) c00451.L$2;
        map = (Map) c00451.L$1;
        url2 = (Url) c00451.L$0;
        ResultKt.throwOnFailure(obj);
        map.put(url, obj);
        url = url2;
        return MapsKt.getValue(this.store, url);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object remove(Url url, Map<String, String> map, Continuation<? super Unit> continuation) throws Throwable {
        C00461 c00461;
        Map map2;
        if (continuation instanceof C00461) {
            c00461 = (C00461) continuation;
            if ((c00461.label & Integer.MIN_VALUE) != 0) {
                c00461.label -= Integer.MIN_VALUE;
            } else {
                c00461 = new C00461(continuation);
            }
        } else {
            c00461 = new C00461(continuation);
        }
        Object obj = c00461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00461.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CacheStorage cacheStorage = this.delegate;
            c00461.L$0 = url;
            c00461.L$1 = SpillingKt.nullOutSpilledVariable(map);
            c00461.label = 1;
            if (cacheStorage.remove(url, map, c00461) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            map = (Map) c00461.L$1;
            url = (Url) c00461.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c00461.L$3;
            map2 = (Map) c00461.L$2;
            ResultKt.throwOnFailure(obj);
        }
        map2.put(url, obj);
        return Unit.INSTANCE;
        ConcurrentMap<Url, Set<CachedResponseData>> concurrentMap = this.store;
        CacheStorage cacheStorage2 = this.delegate;
        c00461.L$0 = SpillingKt.nullOutSpilledVariable(url);
        c00461.L$1 = SpillingKt.nullOutSpilledVariable(map);
        c00461.L$2 = concurrentMap;
        c00461.L$3 = url;
        c00461.label = 2;
        Object objFindAll = cacheStorage2.findAll(url, c00461);
        if (objFindAll != coroutine_suspended) {
            obj = objFindAll;
            map2 = concurrentMap;
            map2.put(url, obj);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object removeAll(Url url, Continuation<? super Unit> continuation) throws Throwable {
        C00471 c00471;
        if (continuation instanceof C00471) {
            c00471 = (C00471) continuation;
            if ((c00471.label & Integer.MIN_VALUE) != 0) {
                c00471.label -= Integer.MIN_VALUE;
            } else {
                c00471 = new C00471(continuation);
            }
        } else {
            c00471 = new C00471(continuation);
        }
        Object obj = c00471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00471.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CacheStorage cacheStorage = this.delegate;
            c00471.L$0 = url;
            c00471.label = 1;
            if (cacheStorage.removeAll(url, c00471) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (Url) c00471.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.store.remove(url);
        return Unit.INSTANCE;
    }
}
