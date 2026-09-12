package io.ktor.client.plugins.cache.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.http.Url;
import io.ktor.util.CryptoKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.WritingKt;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.slf4j.Logger;

/* JADX INFO: compiled from: FileCacheStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00132\u001e\u0010 \u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001f0\u001eH\u0082H¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b#\u0010\u001dJ&\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0082@¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b(\u0010\u001dJ \u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\nH\u0082@¢\u0006\u0004\b,\u0010-J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010*\u001a\u00020.H\u0082@¢\u0006\u0004\b\u001c\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Ljava/io/File;", "directory", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ljava/io/File;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "", "store", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "removeAll", "key", "(Lio/ktor/http/Url;)Ljava/lang/String;", "urlHex", "readCache", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "transform", "updateCache", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCache", "caches", "", "writeCacheUnsafe", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readCacheUnsafe", "Lio/ktor/utils/io/ByteChannel;", "channel", "cache", "writeCache", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lio/ktor/util/collections/ConcurrentMap;", "Lkotlinx/coroutines/sync/Mutex;", "mutexes", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final class FileCacheStorage implements CacheStorage {
    private final File directory;
    private final CoroutineDispatcher dispatcher;
    private final ConcurrentMap<String, Mutex> mutexes;

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 0}, l = {252}, m = "deleteCache", n = {"urlHex", "mutex", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.deleteCache(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0}, l = {96}, m = "find", n = {"url", "varyKeys"}, s = {"L$0", "L$1"}, v = 1)
    static final class C00491 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C00491(Continuation<? super C00491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.find(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0}, l = {92}, m = "findAll", n = {"url"}, s = {"L$0"}, v = 1)
    static final class C00501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C00501(Continuation<? super C00501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.findAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {252, 118}, m = "readCache", n = {"urlHex", "mutex", "$this$withLock_u24default$iv", "$i$f$withLock", "urlHex", "mutex", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-FileCacheStorage$readCache$2"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
    static final class C00511 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C00511(Continuation<? super C00511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((String) null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3, reason: invalid class name */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {209, 210, 210, 211, 212, 215, 216, 219, 220, 221, 222, 225, 226, 230, 232}, m = "readCache", n = {"channel", "channel", "url", "channel", "url", "channel", "url", NotificationCompat.CATEGORY_STATUS, "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "headersCount", "j", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "key", "headersCount", "j", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "headersCount", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "headersCount", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "headersCount", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "headersCount", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u242", "headersCount", "varyKeysCount", "$i$a$-buildMap-FileCacheStorage$readCache$varyKeys$1", "j", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "$this$readCache_u24lambda_u242", "key", "headersCount", "varyKeysCount", "$i$a$-buildMap-FileCacheStorage$readCache$varyKeys$1", "j", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "headersCount", "varyKeysCount", "channel", "url", NotificationCompat.CATEGORY_STATUS, "version", "headers", "requestTime", "responseTime", "expirationTime", "varyKeys", "body", "headersCount", "varyKeysCount", "bodyCount"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2"}, v = 1)
    static final class AnonymousClass3 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((ByteReadChannel) null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {171, 174, 176}, m = "readCacheUnsafe", n = {"urlHex", "file", "it", "channel", "$i$a$-use-FileCacheStorage$readCacheUnsafe$2", "urlHex", "file", "it", "channel", "caches", "$i$a$-use-FileCacheStorage$readCacheUnsafe$2", "requestsCount", "i", "urlHex", "file", "it", "channel", "caches", "$i$a$-use-FileCacheStorage$readCacheUnsafe$2", "requestsCount"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 1)
    static final class C00521 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C00521(Continuation<? super C00521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCacheUnsafe(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {254, InputDeviceCompat.SOURCE_KEYBOARD, 258}, m = "remove", n = {"url", "varyKeys", "urlHex", "this_$iv", "urlHex$iv", "mutex$iv", "$this$withLock_u24default$iv$iv", "$i$f$updateCache", "$i$f$withLock", "url", "varyKeys", "urlHex", "this_$iv", "urlHex$iv", "mutex$iv", "$this$withLock_u24default$iv$iv", "$i$f$updateCache", "$i$f$withLock", "$i$a$-withLock$default-FileCacheStorage$updateCache$2$iv", "url", "varyKeys", "urlHex", "this_$iv", "urlHex$iv", "mutex$iv", "$this$withLock_u24default$iv$iv", "caches$iv", "$i$f$updateCache", "$i$f$withLock", "$i$a$-withLock$default-FileCacheStorage$updateCache$2$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 1)
    static final class C00531 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C00531(Continuation<? super C00531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.remove(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 13, 13, 13, 14, 14, 14}, l = {186, 187, 188, 189, 191, 193, 194, 196, 197, 198, 199, 201, 202, 204, 205}, m = "writeCache", n = {"channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "channel", "cache", "headers", "channel", "cache", "headers", "key", "value", "channel", "cache", "headers", "key", "value", "channel", "cache", "headers", "channel", "cache", "headers", "channel", "cache", "headers", "channel", "cache", "headers", "channel", "cache", "headers", "key", "value", "channel", "cache", "headers", "key", "value", "channel", "cache", "headers", "channel", "cache", "headers"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "L$0", "L$1", "L$2", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "L$0", "L$1", "L$2", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 1)
    static final class C00541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C00541(Continuation<? super C00541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.writeCache(null, null, this);
        }
    }

    public FileCacheStorage(File directory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.directory = directory;
        this.dispatcher = dispatcher;
        this.mutexes = new ConcurrentMap<>(0, 1, null);
        directory.mkdirs();
    }

    public /* synthetic */ FileCacheStorage(File file, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2, reason: invalid class name */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {254, InputDeviceCompat.SOURCE_KEYBOARD, 258}, m = "invokeSuspend", n = {"urlHex", "this_$iv", "urlHex$iv", "mutex$iv", "$this$withLock_u24default$iv$iv", "$i$f$updateCache", "$i$f$withLock", "urlHex", "this_$iv", "urlHex$iv", "mutex$iv", "$this$withLock_u24default$iv$iv", "$i$f$updateCache", "$i$f$withLock", "$i$a$-withLock$default-FileCacheStorage$updateCache$2$iv", "urlHex", "this_$iv", "urlHex$iv", "mutex$iv", "$this$withLock_u24default$iv$iv", "caches$iv", "$i$f$updateCache", "$i$f$withLock", "$i$a$-withLock$default-FileCacheStorage$updateCache$2$iv"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CachedResponseData $data;
        final /* synthetic */ Url $url;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Url url, CachedResponseData cachedResponseData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = url;
            this.$data = cachedResponseData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FileCacheStorage.this.new AnonymousClass2(this.$url, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x011a A[Catch: all -> 0x017b, TryCatch #1 {all -> 0x017b, blocks: (B:28:0x0104, B:29:0x0114, B:31:0x011a, B:33:0x0132, B:35:0x013a, B:25:0x00e1), top: B:47:0x00e1 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0132 A[Catch: all -> 0x017b, TryCatch #1 {all -> 0x017b, blocks: (B:28:0x0104, B:29:0x0114, B:31:0x011a, B:33:0x0132, B:35:0x013a, B:25:0x00e1), top: B:47:0x00e1 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0174  */
        /* JADX WARN: Code duplicated, block: B:53:0x0135 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            String str2;
            int i;
            FileCacheStorage fileCacheStorage;
            Mutex mutex;
            int i2;
            CachedResponseData cachedResponseData;
            Mutex mutex2;
            Object cacheUnsafe;
            Object obj2;
            Set set;
            ArrayList arrayList;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            int i4 = 0;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String strKey = FileCacheStorage.this.key(this.$url);
                    FileCacheStorage fileCacheStorage2 = FileCacheStorage.this;
                    CachedResponseData cachedResponseData2 = this.$data;
                    Mutex mutex3 = (Mutex) fileCacheStorage2.mutexes.computeIfAbsent(strKey, FileCacheStorage$updateCache$mutex$1.INSTANCE);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(strKey);
                    this.L$1 = fileCacheStorage2;
                    this.L$2 = strKey;
                    this.L$3 = cachedResponseData2;
                    this.L$4 = SpillingKt.nullOutSpilledVariable(mutex3);
                    this.L$5 = mutex3;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    if (mutex3.lock(null, this) != coroutine_suspended) {
                        str = strKey;
                        str2 = str;
                        i = 0;
                        fileCacheStorage = fileCacheStorage2;
                        mutex = mutex3;
                        i2 = 0;
                        cachedResponseData = cachedResponseData2;
                        mutex2 = mutex;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 = this.I$2;
                        int i5 = this.I$1;
                        int i6 = this.I$0;
                        Mutex mutex4 = (Mutex) this.L$5;
                        Mutex mutex5 = (Mutex) this.L$4;
                        CachedResponseData cachedResponseData3 = (CachedResponseData) this.L$3;
                        String str3 = (String) this.L$2;
                        FileCacheStorage fileCacheStorage3 = (FileCacheStorage) this.L$1;
                        String str4 = (String) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            i = i5;
                            mutex = mutex4;
                            str2 = str4;
                            fileCacheStorage = fileCacheStorage3;
                            str = str3;
                            cachedResponseData = cachedResponseData3;
                            mutex2 = mutex5;
                            i2 = i6;
                            cacheUnsafe = obj;
                            set = (Set) cacheUnsafe;
                            arrayList = new ArrayList();
                            for (Object obj4 : set) {
                                Set set2 = set;
                                if (!Intrinsics.areEqual(((CachedResponseData) obj4).getVaryKeys(), cachedResponseData.getVaryKeys())) {
                                    arrayList.add(obj4);
                                }
                                set = set2;
                            }
                            List listPlus = CollectionsKt.plus((Collection<? extends CachedResponseData>) arrayList, cachedResponseData);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(fileCacheStorage);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(str);
                            this.L$3 = SpillingKt.nullOutSpilledVariable(mutex2);
                            this.L$4 = mutex;
                            this.L$5 = SpillingKt.nullOutSpilledVariable(set);
                            this.I$0 = i2;
                            this.I$1 = i;
                            this.I$2 = i4;
                            this.label = 3;
                            obj3 = fileCacheStorage.writeCacheUnsafe(str, listPlus, this) != coroutine_suspended ? null : null;
                            return coroutine_suspended;
                        } catch (Throwable th) {
                            th = th;
                            mutex = mutex4;
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (Mutex) this.L$4;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    obj2 = null;
                    mutex.unlock(obj2);
                    throw th;
                }
                int i7 = this.I$1;
                int i8 = this.I$0;
                Mutex mutex6 = (Mutex) this.L$5;
                mutex2 = (Mutex) this.L$4;
                cachedResponseData = (CachedResponseData) this.L$3;
                str = (String) this.L$2;
                fileCacheStorage = (FileCacheStorage) this.L$1;
                str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i7;
                mutex = mutex6;
                i2 = i8;
                mutex.unlock(obj3);
                return Unit.INSTANCE;
                this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                this.L$1 = fileCacheStorage;
                this.L$2 = str;
                this.L$3 = cachedResponseData;
                this.L$4 = SpillingKt.nullOutSpilledVariable(mutex2);
                this.L$5 = mutex;
                this.I$0 = i2;
                this.I$1 = i;
                this.I$2 = 0;
                this.label = 2;
                cacheUnsafe = fileCacheStorage.readCacheUnsafe(str, this);
                if (cacheUnsafe != coroutine_suspended) {
                    set = (Set) cacheUnsafe;
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        Set set3 = set;
                        if (!Intrinsics.areEqual(((CachedResponseData) obj4).getVaryKeys(), cachedResponseData.getVaryKeys())) {
                            arrayList.add(obj4);
                        }
                        set = set3;
                    }
                    List listPlus2 = CollectionsKt.plus((Collection<? extends CachedResponseData>) arrayList, cachedResponseData);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str2);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(fileCacheStorage);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(str);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(mutex2);
                    this.L$4 = mutex;
                    this.L$5 = SpillingKt.nullOutSpilledVariable(set);
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.I$2 = i4;
                    this.label = 3;
                    if (fileCacheStorage.writeCacheUnsafe(str, listPlus2, this) != coroutine_suspended) {
                        mutex.unlock(obj3);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                obj2 = null;
            }
        }
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new AnonymousClass2(url, cachedResponseData, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object findAll(Url url, Continuation<? super Set<CachedResponseData>> continuation) throws Throwable {
        C00501 c00501;
        if (continuation instanceof C00501) {
            c00501 = (C00501) continuation;
            if ((c00501.label & Integer.MIN_VALUE) != 0) {
                c00501.label -= Integer.MIN_VALUE;
            } else {
                c00501 = new C00501(continuation);
            }
        } else {
            c00501 = new C00501(continuation);
        }
        Object cache = c00501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00501.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cache);
            String strKey = key(url);
            c00501.L$0 = SpillingKt.nullOutSpilledVariable(url);
            c00501.label = 1;
            cache = readCache(strKey, c00501);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cache);
        }
        return CollectionsKt.toSet((Iterable) cache);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object find(Url url, Map<String, String> map, Continuation<? super CachedResponseData> continuation) throws Throwable {
        C00491 c00491;
        if (continuation instanceof C00491) {
            c00491 = (C00491) continuation;
            if ((c00491.label & Integer.MIN_VALUE) != 0) {
                c00491.label -= Integer.MIN_VALUE;
            } else {
                c00491 = new C00491(continuation);
            }
        } else {
            c00491 = new C00491(continuation);
        }
        Object cache = c00491.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c00491.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cache);
            String strKey = key(url);
            c00491.L$0 = SpillingKt.nullOutSpilledVariable(url);
            c00491.L$1 = map;
            c00491.label = 1;
            cache = readCache(strKey, c00491);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c00491.L$1;
            ResultKt.throwOnFailure(cache);
        }
        for (Object obj : (Set) cache) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!Intrinsics.areEqual(cachedResponseData.getVaryKeys().get(entry.getKey()), entry.getValue())) {
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x014f A[Catch: all -> 0x01b3, TryCatch #1 {all -> 0x01b3, blocks: (B:35:0x0137, B:36:0x0149, B:38:0x014f, B:40:0x0163, B:42:0x016b, B:31:0x0108), top: B:54:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0163 A[Catch: all -> 0x01b3, TryCatch #1 {all -> 0x01b3, blocks: (B:35:0x0137, B:36:0x0149, B:38:0x014f, B:40:0x0163, B:42:0x016b, B:31:0x0108), top: B:54:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object remove(Url url, Map<String, String> map, Continuation<? super Unit> continuation) throws Throwable {
        C00531 c00531;
        Mutex mutex;
        String str;
        String str2;
        FileCacheStorage fileCacheStorage;
        Mutex mutex2;
        Map<String, String> map2;
        int i;
        int i2;
        Url url2;
        Map<String, String> map3;
        Url url3;
        int i3;
        int i4;
        Mutex mutex3;
        Object obj;
        Set set;
        ArrayList arrayList;
        Object obj2;
        if (continuation instanceof C00531) {
            c00531 = (C00531) continuation;
            if ((c00531.label & Integer.MIN_VALUE) != 0) {
                c00531.label -= Integer.MIN_VALUE;
            } else {
                c00531 = new C00531(continuation);
            }
        } else {
            c00531 = new C00531(continuation);
        }
        Object obj3 = c00531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c00531.label;
        int i6 = 0;
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj3);
                String strKey = key(url);
                mutex = (Mutex) this.mutexes.computeIfAbsent(strKey, FileCacheStorage$updateCache$mutex$1.INSTANCE);
                c00531.L$0 = SpillingKt.nullOutSpilledVariable(url);
                c00531.L$1 = map;
                c00531.L$2 = SpillingKt.nullOutSpilledVariable(strKey);
                c00531.L$3 = this;
                c00531.L$4 = strKey;
                c00531.L$5 = SpillingKt.nullOutSpilledVariable(mutex);
                c00531.L$6 = mutex;
                c00531.I$0 = 0;
                c00531.I$1 = 0;
                c00531.label = 1;
                if (mutex.lock(null, c00531) != coroutine_suspended) {
                    str = strKey;
                    str2 = str;
                    fileCacheStorage = this;
                    mutex2 = mutex;
                    map2 = map;
                    i = 0;
                    i2 = 0;
                    url2 = url;
                }
                return coroutine_suspended;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    i6 = c00531.I$2;
                    int i7 = c00531.I$1;
                    i4 = c00531.I$0;
                    Mutex mutex4 = (Mutex) c00531.L$6;
                    mutex2 = (Mutex) c00531.L$5;
                    str = (String) c00531.L$4;
                    fileCacheStorage = (FileCacheStorage) c00531.L$3;
                    str2 = (String) c00531.L$2;
                    map3 = (Map) c00531.L$1;
                    url3 = (Url) c00531.L$0;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        i3 = i7;
                        mutex = mutex4;
                        set = (Set) obj3;
                        arrayList = new ArrayList();
                        for (Object obj4 : set) {
                            Set set2 = set;
                            if (!Intrinsics.areEqual(((CachedResponseData) obj4).getVaryKeys(), map3)) {
                                arrayList.add(obj4);
                            }
                            set = set2;
                        }
                        c00531.L$0 = SpillingKt.nullOutSpilledVariable(url3);
                        c00531.L$1 = SpillingKt.nullOutSpilledVariable(map3);
                        c00531.L$2 = SpillingKt.nullOutSpilledVariable(str2);
                        c00531.L$3 = SpillingKt.nullOutSpilledVariable(fileCacheStorage);
                        c00531.L$4 = SpillingKt.nullOutSpilledVariable(str);
                        c00531.L$5 = SpillingKt.nullOutSpilledVariable(mutex2);
                        c00531.L$6 = mutex;
                        c00531.L$7 = SpillingKt.nullOutSpilledVariable(set);
                        c00531.I$0 = i4;
                        c00531.I$1 = i3;
                        c00531.I$2 = i6;
                        c00531.label = 3;
                        if (fileCacheStorage.writeCacheUnsafe(str, arrayList, c00531) != coroutine_suspended) {
                            mutex3 = mutex;
                            obj2 = null;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        mutex3 = mutex4;
                    }
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = c00531.I$2;
                    int i9 = c00531.I$1;
                    int i10 = c00531.I$0;
                    mutex3 = (Mutex) c00531.L$6;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        obj2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                obj = null;
                mutex3.unlock(obj);
                throw th;
            }
            int i11 = c00531.I$1;
            i2 = c00531.I$0;
            Mutex mutex5 = (Mutex) c00531.L$6;
            Mutex mutex6 = (Mutex) c00531.L$5;
            String str3 = (String) c00531.L$4;
            FileCacheStorage fileCacheStorage2 = (FileCacheStorage) c00531.L$3;
            String str4 = (String) c00531.L$2;
            map2 = (Map) c00531.L$1;
            url2 = (Url) c00531.L$0;
            ResultKt.throwOnFailure(obj3);
            i = i11;
            mutex = mutex5;
            mutex2 = mutex6;
            str = str3;
            fileCacheStorage = fileCacheStorage2;
            str2 = str4;
            mutex3.unlock(obj2);
            return Unit.INSTANCE;
            c00531.L$0 = SpillingKt.nullOutSpilledVariable(url2);
            c00531.L$1 = map2;
            c00531.L$2 = SpillingKt.nullOutSpilledVariable(str2);
            c00531.L$3 = fileCacheStorage;
            c00531.L$4 = str;
            c00531.L$5 = SpillingKt.nullOutSpilledVariable(mutex2);
            c00531.L$6 = mutex;
            c00531.I$0 = i2;
            c00531.I$1 = i;
            c00531.I$2 = 0;
            c00531.label = 2;
            Object cacheUnsafe = fileCacheStorage.readCacheUnsafe(str, c00531);
            if (cacheUnsafe != coroutine_suspended) {
                map3 = map2;
                url3 = url2;
                i3 = i;
                obj3 = cacheUnsafe;
                i4 = i2;
                set = (Set) obj3;
                arrayList = new ArrayList();
                while (r7.hasNext()) {
                    Set set3 = set;
                    if (!Intrinsics.areEqual(((CachedResponseData) obj4).getVaryKeys(), map3)) {
                        arrayList.add(obj4);
                    }
                    set = set3;
                }
                c00531.L$0 = SpillingKt.nullOutSpilledVariable(url3);
                c00531.L$1 = SpillingKt.nullOutSpilledVariable(map3);
                c00531.L$2 = SpillingKt.nullOutSpilledVariable(str2);
                c00531.L$3 = SpillingKt.nullOutSpilledVariable(fileCacheStorage);
                c00531.L$4 = SpillingKt.nullOutSpilledVariable(str);
                c00531.L$5 = SpillingKt.nullOutSpilledVariable(mutex2);
                c00531.L$6 = mutex;
                c00531.L$7 = SpillingKt.nullOutSpilledVariable(set);
                c00531.I$0 = i4;
                c00531.I$1 = i3;
                c00531.I$2 = i6;
                c00531.label = 3;
                if (fileCacheStorage.writeCacheUnsafe(str, arrayList, c00531) != coroutine_suspended) {
                    mutex3 = mutex;
                    obj2 = null;
                    mutex3.unlock(obj2);
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex3 = mutex;
            obj = null;
        }
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object removeAll(Url url, Continuation<? super Unit> continuation) throws Throwable {
        Object objDeleteCache = deleteCache(key(url), continuation);
        return objDeleteCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteCache : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String key(Url url) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(StringsKt.encodeToByteArray(url.getUrlString()));
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return CryptoKt.hex(bArrDigest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object readCache(String str, Continuation<? super Set<CachedResponseData>> continuation) throws Throwable {
        C00511 c00511;
        Mutex mutexComputeIfAbsent;
        Mutex mutex;
        int i;
        Throwable th;
        Mutex mutex2;
        if (continuation instanceof C00511) {
            c00511 = (C00511) continuation;
            if ((c00511.label & Integer.MIN_VALUE) != 0) {
                c00511.label -= Integer.MIN_VALUE;
            } else {
                c00511 = new C00511(continuation);
            }
        } else {
            c00511 = new C00511(continuation);
        }
        Object obj = c00511.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c00511.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutexComputeIfAbsent = this.mutexes.computeIfAbsent(str, new Function0() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FileCacheStorage.readCache$lambda$0();
                    }
                });
                c00511.L$0 = str;
                c00511.L$1 = SpillingKt.nullOutSpilledVariable(mutexComputeIfAbsent);
                c00511.L$2 = mutexComputeIfAbsent;
                c00511.I$0 = 0;
                c00511.label = 1;
                if (mutexComputeIfAbsent.lock(null, c00511) != coroutine_suspended) {
                    mutex = mutexComputeIfAbsent;
                    i = 0;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = c00511.I$1;
                int i4 = c00511.I$0;
                mutex2 = (Mutex) c00511.L$2;
                try {
                    ResultKt.throwOnFailure(obj);
                    Set set = (Set) obj;
                    mutex2.unlock(null);
                    return set;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            int i5 = c00511.I$0;
            Mutex mutex3 = (Mutex) c00511.L$2;
            mutex = (Mutex) c00511.L$1;
            String str2 = (String) c00511.L$0;
            ResultKt.throwOnFailure(obj);
            mutexComputeIfAbsent = mutex3;
            i = i5;
            str = str2;
            c00511.L$0 = SpillingKt.nullOutSpilledVariable(str);
            c00511.L$1 = SpillingKt.nullOutSpilledVariable(mutex);
            c00511.L$2 = mutexComputeIfAbsent;
            c00511.I$0 = i;
            c00511.I$1 = 0;
            c00511.label = 2;
            Object cacheUnsafe = readCacheUnsafe(str, c00511);
            if (cacheUnsafe != coroutine_suspended) {
                Mutex mutex4 = mutexComputeIfAbsent;
                obj = cacheUnsafe;
                mutex2 = mutex4;
                Set set2 = (Set) obj;
                mutex2.unlock(null);
                return set2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutexComputeIfAbsent;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex readCache$lambda$0() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    private final Object updateCache(String str, Function1<? super Set<CachedResponseData>, ? extends List<CachedResponseData>> function1, Continuation<? super Unit> continuation) {
        Mutex mutex = (Mutex) this.mutexes.computeIfAbsent(str, FileCacheStorage$updateCache$mutex$1.INSTANCE);
        mutex.lock(null, continuation);
        try {
            writeCacheUnsafe(str, function1.invoke((Set) readCacheUnsafe(str, null)), null);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object deleteCache(String str, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutexComputeIfAbsent;
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
            mutexComputeIfAbsent = this.mutexes.computeIfAbsent(str, new Function0() { // from class: io.ktor.client.plugins.cache.storage.FileCacheStorage$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FileCacheStorage.deleteCache$lambda$0();
                }
            });
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(mutexComputeIfAbsent);
            anonymousClass1.L$2 = mutexComputeIfAbsent;
            anonymousClass1.I$0 = 0;
            anonymousClass1.label = 1;
            if (mutexComputeIfAbsent.lock(null, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = anonymousClass1.I$0;
            Mutex mutex = (Mutex) anonymousClass1.L$2;
            String str2 = (String) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            mutexComputeIfAbsent = mutex;
            str = str2;
        }
        try {
            File file = new File(this.directory, str);
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Exception e) {
                    Logger logger = HttpCacheKt.getLOGGER();
                    if (LoggerJvmKt.isTraceEnabled(logger)) {
                        logger.trace("Exception during cache deletion in a file: " + ExceptionsKt.stackTraceToString(e));
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            mutexComputeIfAbsent.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexComputeIfAbsent.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mutex deleteCache$lambda$0() {
        return MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileCacheStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2", f = "FileCacheStorage.kt", i = {0, 0, 0, 0}, l = {157}, m = "invokeSuspend", n = {"$this$coroutineScope", "channel", "output", "$i$a$-use-FileCacheStorage$writeCacheUnsafe$2$1"}, s = {"L$0", "L$1", "L$3", "I$0"}, v = 1)
    static final class C00552 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ List<CachedResponseData> $caches;
        final /* synthetic */ String $urlHex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00552(String str, List<CachedResponseData> list, Continuation<? super C00552> continuation) {
            super(2, continuation);
            this.$urlHex = str;
            this.$caches = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C00552 c00552 = FileCacheStorage.this.new C00552(this.$urlHex, this.$caches, continuation);
            c00552.L$0 = obj;
            return c00552;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C00552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BufferedOutputStream bufferedOutputStream;
            Object objCopyTo$default;
            Closeable closeable;
            Throwable th;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ByteChannel byteChannel = new ByteChannel(false, 1, null);
                try {
                    OutputStream fileOutputStream = new FileOutputStream(new File(FileCacheStorage.this.directory, this.$urlHex));
                    bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
                    try {
                        BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FileCacheStorage$writeCacheUnsafe$2$1$1(byteChannel, this.$caches, FileCacheStorage.this, null), 3, null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(byteChannel);
                        this.L$2 = bufferedOutputStream;
                        this.L$3 = SpillingKt.nullOutSpilledVariable(bufferedOutputStream2);
                        this.I$0 = 0;
                        this.label = 1;
                        objCopyTo$default = WritingKt.copyTo$default(byteChannel, bufferedOutputStream2, 0L, this, 2, null);
                        if (objCopyTo$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        closeable = bufferedOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        throw th;
                    }
                } catch (Exception e) {
                    Logger logger = HttpCacheKt.getLOGGER();
                    if (LoggerJvmKt.isTraceEnabled(logger)) {
                        logger.trace("Exception during saving a cache to a file: " + ExceptionsKt.stackTraceToString(e));
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.L$2;
                try {
                    ResultKt.throwOnFailure(obj);
                    objCopyTo$default = obj;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = closeable;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(bufferedOutputStream, th);
                        throw th4;
                    }
                }
            }
            Long lBoxLong = Boxing.boxLong(((Number) objCopyTo$default).longValue());
            CloseableKt.closeFinally(closeable, null);
            return lBoxLong;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeCacheUnsafe(String str, List<CachedResponseData> list, Continuation<Object> continuation) {
        return CoroutineScopeKt.coroutineScope(new C00552(str, list, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:46:0x0134 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x004e, B:46:0x0134, B:52:0x017a), top: B:70:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x015e -> B:50:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object readCacheUnsafe(java.lang.String r25, kotlin.coroutines.Continuation<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r26) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCacheUnsafe(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r2 r12 r13
      0x004f: PHI (r2v51 io.ktor.utils.io.ByteChannel) = (r2v45 io.ktor.utils.io.ByteChannel), (r2v54 io.ktor.utils.io.ByteChannel) binds: [B:80:0x03e4, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r12v63 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>) = 
      (r12v54 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v68 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
     binds: [B:80:0x03e4, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r13v50 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v44 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v53 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:80:0x03e4, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0138 A[PHI: r12 r13
      0x0138: PHI (r12v12 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r12v9 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r12v17 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:42:0x01f7, B:26:0x012d] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r13v11 io.ktor.utils.io.ByteChannel) = (r13v8 io.ktor.utils.io.ByteChannel), (r13v14 io.ktor.utils.io.ByteChannel) binds: [B:42:0x01f7, B:26:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d4 A[PHI: r12 r13
      0x01d4: PHI (r12v9 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r12v6 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r12v11 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:39:0x01d0, B:28:0x013c] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r13v8 io.ktor.utils.io.ByteChannel) = (r13v5 io.ktor.utils.io.ByteChannel), (r13v10 io.ktor.utils.io.ByteChannel) binds: [B:39:0x01d0, B:28:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0227  */
    /* JADX WARN: Code duplicated, block: B:53:0x026c  */
    /* JADX WARN: Code duplicated, block: B:57:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x02cf A[PHI: r2 r12 r13
      0x02cf: PHI (r2v29 io.ktor.utils.io.ByteChannel) = (r2v23 io.ktor.utils.io.ByteChannel), (r2v31 io.ktor.utils.io.ByteChannel) binds: [B:58:0x02cb, B:21:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r12v36 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>) = 
      (r12v27 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v38 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
     binds: [B:58:0x02cb, B:21:0x00c8] A[DONT_GENERATE, DONT_INLINE]
      0x02cf: PHI (r13v28 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v22 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v30 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:58:0x02cb, B:21:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x02f0 A[PHI: r2 r12 r13
      0x02f0: PHI (r2v32 io.ktor.utils.io.ByteChannel) = (r2v29 io.ktor.utils.io.ByteChannel), (r2v34 io.ktor.utils.io.ByteChannel) binds: [B:61:0x02ec, B:20:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r12v39 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>) = 
      (r12v36 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v41 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
     binds: [B:61:0x02ec, B:20:0x00b7] A[DONT_GENERATE, DONT_INLINE]
      0x02f0: PHI (r13v31 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v28 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v33 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:61:0x02ec, B:20:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x030f A[PHI: r2 r12 r13
      0x030f: PHI (r2v35 io.ktor.utils.io.ByteChannel) = (r2v32 io.ktor.utils.io.ByteChannel), (r2v37 io.ktor.utils.io.ByteChannel) binds: [B:64:0x030b, B:19:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r12v42 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>) = 
      (r12v39 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
      (r12v44 java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>)
     binds: [B:64:0x030b, B:19:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r13v34 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v31 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v36 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:64:0x030b, B:19:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0342  */
    /* JADX WARN: Code duplicated, block: B:75:0x0388  */
    /* JADX WARN: Code duplicated, block: B:79:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0219, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r2, r5, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02a4, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(r5, r8, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x032c, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r2, r5, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03c1, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeStringUtf8(r5, r8, r0) == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x040d, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r2, r3, 0, 0, r6, 6, null) == r1) goto L84;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x02a4 -> B:23:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x03c1 -> B:16:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeCache(io.ktor.utils.io.ByteChannel r12, io.ktor.client.plugins.cache.storage.CachedResponseData r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.writeCache(io.ktor.utils.io.ByteChannel, io.ktor.client.plugins.cache.storage.CachedResponseData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0299  */
    /* JADX WARN: Code duplicated, block: B:40:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0310  */
    /* JADX WARN: Code duplicated, block: B:53:0x032d  */
    /* JADX WARN: Code duplicated, block: B:57:0x035a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x035a -> B:58:0x0364). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x04a8 -> B:83:0x04c2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object readCache(io.ktor.utils.io.ByteReadChannel r28, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r29) {
        /*
            Method dump skipped, instruction units count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
