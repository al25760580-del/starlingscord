package com.discord.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import ar.b0;
import ar.d0;
import ar.k0;
import com.discord.logging.Log;
import fr.q;
import hr.e;
import java.util.concurrent.ConcurrentHashMap;
import jr.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/core/ThumbnailLoader;", "", "<init>", "()V", "TAG", "", "inFlightRequests", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/Deferred;", "Landroid/graphics/Bitmap;", "mapMutex", "Lkotlinx/coroutines/sync/Mutex;", "createRequestKey", "uri", "Landroid/net/Uri;", "size", "Landroid/util/Size;", "loadThumbnail", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroid/net/Uri;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThumbnailLoader {

    @NotNull
    private static final String TAG = "ThumbnailLoader";

    @NotNull
    public static final ThumbnailLoader INSTANCE = new ThumbnailLoader();

    @NotNull
    private static final ConcurrentHashMap<String, Deferred> inFlightRequests = new ConcurrentHashMap<>();

    @NotNull
    private static final Mutex mapMutex = new b();

    /* JADX INFO: renamed from: com.discord.core.ThumbnailLoader$loadThumbnail$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.core.ThumbnailLoader$loadThumbnail$2", f = "ThumbnailLoader.kt", l = {118, 108, 109}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nThumbnailLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailLoader.kt\ncom/discord/core/ThumbnailLoader$loadThumbnail$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n116#2,8:113\n125#2,2:122\n1#3:121\n*S KotlinDebug\n*F\n+ 1 ThumbnailLoader.kt\ncom/discord/core/ThumbnailLoader$loadThumbnail$2\n*L\n53#1:113,8\n53#1:122,2\n*E\n"})
    public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Size $size;
        final /* synthetic */ Uri $uri;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX INFO: renamed from: com.discord.core.ThumbnailLoader$loadThumbnail$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.core.ThumbnailLoader$loadThumbnail$2$2", f = "ThumbnailLoader.kt", l = {}, m = "invokeSuspend")
        public static final class C00302 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Bitmap $bitmap;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00302(Bitmap bitmap, Continuation continuation) {
                super(2, continuation);
                this.$bitmap = bitmap;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00302(this.$bitmap, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                return this.$bitmap;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00302) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Uri uri, Size size, Context context, Continuation continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.$size = size;
            this.$context = context;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$uri, this.$size, this.$context, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0131 A[RETURN] */
        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            String string;
            String strCreateRequestKey;
            Mutex mutex;
            Size size;
            Context context;
            Uri uri;
            Size size2;
            String str;
            Pair pair;
            Object objZ;
            Object objA;
            a aVar = a.f22354d;
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    string = this.$uri.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    strCreateRequestKey = ThumbnailLoader.INSTANCE.createRequestKey(this.$uri, this.$size);
                    mutex = ThumbnailLoader.mapMutex;
                    size = this.$size;
                    Context context2 = this.$context;
                    Uri uri2 = this.$uri;
                    this.L$0 = coroutineScope;
                    this.L$1 = string;
                    this.L$2 = strCreateRequestKey;
                    this.L$3 = mutex;
                    this.L$4 = size;
                    this.L$5 = context2;
                    this.L$6 = uri2;
                    this.label = 1;
                    if (mutex.a(this) != aVar) {
                        context = context2;
                        uri = uri2;
                    }
                    return aVar;
                }
                if (i7 == 1) {
                    Uri uri3 = (Uri) this.L$6;
                    Context context3 = (Context) this.L$5;
                    size = (Size) this.L$4;
                    mutex = (Mutex) this.L$3;
                    strCreateRequestKey = (String) this.L$2;
                    string = (String) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ib.a.L(obj);
                    uri = uri3;
                    context = context3;
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.a.L(obj);
                        return obj;
                    }
                    ib.a.L(obj);
                    objZ = obj;
                }
                e eVar = k0.f2938a;
                br.d dVar = q.f9394a;
                C00302 c00302 = new C00302((Bitmap) objZ, null);
                this.label = 3;
                objA = b0.A(dVar, c00302, this);
                if (objA != aVar) {
                    return aVar;
                }
                return objA;
                Deferred deferred = (Deferred) ThumbnailLoader.inFlightRequests.get(strCreateRequestKey);
                if (deferred != null) {
                    pair = new Pair(deferred, Boolean.TRUE);
                } else {
                    e eVar2 = k0.f2938a;
                    d0 d0VarD = b0.d(coroutineScope, hr.d.f11103i, new ThumbnailLoader$loadThumbnail$2$1$1(str, size2, context, uri, strCreateRequestKey, null), 2);
                    ThumbnailLoader.inFlightRequests.put(strCreateRequestKey, d0VarD);
                    pair = new Pair(d0VarD, Boolean.FALSE);
                }
                mutex.b(null);
                Deferred deferred2 = (Deferred) pair.f14612d;
                if (((Boolean) pair.f14613e).booleanValue()) {
                    Log log = Log.INSTANCE;
                    String strC = kotlin.text.b0.C(20, str);
                    int width = this.$size.getWidth();
                    int height = this.$size.getHeight();
                    StringBuilder sbT = a3.e.t("♻ REUSING REQUEST - URI: ", strC, " - Size: ", width, "x");
                    sbT.append(height);
                    Log.i$default(log, ThumbnailLoader.TAG, sbT.toString(), (Throwable) null, 4, (Object) null);
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 2;
                objZ = deferred2.z(this);
                if (objZ != aVar) {
                    e eVar3 = k0.f2938a;
                    br.d dVar2 = q.f9394a;
                    C00302 c00303 = new C00302((Bitmap) objZ, null);
                    this.label = 3;
                    objA = b0.A(dVar2, c00303, this);
                    if (objA != aVar) {
                        return objA;
                    }
                }
                return aVar;
            } catch (Throwable th2) {
                mutex.b(null);
                throw th2;
            }
            size2 = size;
            str = string;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private ThumbnailLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String createRequestKey(Uri uri, Size size) {
        return uri + "_" + size.getWidth() + "_" + size.getHeight();
    }

    public final Object loadThumbnail(@NotNull Context context, @NotNull Uri uri, @NotNull Size size, @NotNull Continuation continuation) {
        return b0.i(new AnonymousClass2(uri, size, context, null), continuation);
    }
}
