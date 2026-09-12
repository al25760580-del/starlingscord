package com.discord.image.fresco.tiled;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import ar.b0;
import ar.k0;
import ar.q1;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.request.ImageRequest;
import fr.q;
import hr.e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import na.c;
import na.g;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0010\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)¨\u00067"}, d2 = {"Lcom/discord/image/fresco/tiled/TiledDraweeController;", "Lcom/facebook/drawee/interfaces/DraweeController;", "Landroid/content/res/Resources;", "resources", "", "url", "Landroid/graphics/Shader$TileMode;", "tileMode", "<init>", "(Landroid/content/res/Resources;Ljava/lang/String;Landroid/graphics/Shader$TileMode;)V", "", "load", "()V", "Lcom/facebook/drawee/interfaces/DraweeHierarchy;", "getHierarchy", "()Lcom/facebook/drawee/interfaces/DraweeHierarchy;", "hierarchy", "setHierarchy", "(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V", "onAttach", "onDetach", "", "isVisibleInViewportHint", "onViewportVisibilityHint", "(Z)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/drawable/Animatable;", "getAnimatable", "()Landroid/graphics/drawable/Animatable;", "contentDescription", "setContentDescription", "(Ljava/lang/String;)V", "getContentDescription", "()Ljava/lang/String;", "other", "isSameImageRequest", "(Lcom/facebook/drawee/interfaces/DraweeController;)Z", "Landroid/content/res/Resources;", "Ljava/lang/String;", "Landroid/graphics/Shader$TileMode;", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/common/references/CloseableReference;", "Lna/c;", "myImageReference", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/drawee/generic/GenericDraweeHierarchy;", "Lcom/facebook/drawee/generic/GenericDraweeHierarchy;", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTiledDraweeController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiledDraweeController.kt\ncom/discord/image/fresco/tiled/TiledDraweeController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class TiledDraweeController implements DraweeController {
    private String contentDescription;
    private GenericDraweeHierarchy hierarchy;

    @NotNull
    private final CompletableJob job;
    private CloseableReference myImageReference;

    @NotNull
    private final Resources resources;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Shader.TileMode tileMode;

    @NotNull
    private final String url;

    /* JADX INFO: renamed from: com.discord.image.fresco.tiled.TiledDraweeController$load$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.image.fresco.tiled.TiledDraweeController$load$1", f = "TiledDraweeController.kt", l = {84}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nTiledDraweeController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiledDraweeController.kt\ncom/discord/image/fresco/tiled/TiledDraweeController$load$1\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,107:1\n27#2:108\n*S KotlinDebug\n*F\n+ 1 TiledDraweeController.kt\ncom/discord/image/fresco/tiled/TiledDraweeController$load$1\n*L\n92#1:108\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = TiledDraweeController.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            DataSource dataSourceA;
            long j;
            a aVar = a.f22354d;
            int i7 = this.label;
            BitmapDrawable bitmapDrawable = null;
            try {
                if (i7 == 0) {
                    ib.a.L(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    dataSourceA = c9.a.s().a(ImageRequest.fromUri(TiledDraweeController.this.url), coroutineScope, null, null, null);
                    e eVar = k0.f2938a;
                    hr.d dVar = hr.d.f11103i;
                    TiledDraweeController$load$1$closableImageReference$1 tiledDraweeController$load$1$closableImageReference$1 = new TiledDraweeController$load$1$closableImageReference$1(dataSourceA, null);
                    this.L$0 = dataSourceA;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    obj = b0.A(dVar, tiledDraweeController$load$1$closableImageReference$1, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    j = jCurrentTimeMillis;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    dataSourceA = (DataSource) this.L$0;
                    ib.a.L(obj);
                }
                CloseableReference closeableReference = (CloseableReference) obj;
                TiledDraweeController.this.myImageReference = closeableReference;
                c cVar = closeableReference != null ? (c) closeableReference.q() : null;
                na.d dVar2 = cVar instanceof na.d ? (na.d) cVar : null;
                Bitmap bitmap = dVar2 != null ? ((g) dVar2).f16528w : null;
                if (bitmap != null) {
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(TiledDraweeController.this.resources, bitmap);
                    TiledDraweeController tiledDraweeController = TiledDraweeController.this;
                    bitmapDrawable2.setTileModeXY(tiledDraweeController.tileMode, tiledDraweeController.tileMode);
                    bitmapDrawable = bitmapDrawable2;
                }
                boolean z5 = System.currentTimeMillis() - j >= 120;
                GenericDraweeHierarchy genericDraweeHierarchy = TiledDraweeController.this.hierarchy;
                if (genericDraweeHierarchy != null) {
                    genericDraweeHierarchy.m(bitmapDrawable, 1.0f, !z5);
                }
                dataSourceA.close();
                return Unit.f14616a;
            } catch (Throwable th2) {
                dataSourceA.close();
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public TiledDraweeController(@NotNull Resources resources, @NotNull String url, @NotNull Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(tileMode, "tileMode");
        this.resources = resources;
        this.url = url;
        this.tileMode = tileMode;
        q1 q1Var = new q1();
        this.job = q1Var;
        e eVar = k0.f2938a;
        this.scope = b0.b(kotlin.coroutines.e.c(q1Var, q.f9394a.f3388w));
    }

    private final void load() {
        b0.t(this.scope, null, new AnonymousClass1(null), 3);
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    @NotNull
    public Animatable getAnimatable() {
        throw new UnsupportedOperationException();
    }

    public String getContentDescription() {
        return this.contentDescription;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public DraweeHierarchy getHierarchy() {
        return this.hierarchy;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public boolean isSameImageRequest(DraweeController other) {
        CloseableReference closeableReference;
        TiledDraweeController tiledDraweeController = other instanceof TiledDraweeController ? (TiledDraweeController) other : null;
        return Intrinsics.areEqual(tiledDraweeController != null ? tiledDraweeController.url : null, this.url) && (closeableReference = this.myImageReference) != null && closeableReference.u();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void onAttach() {
        load();
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void onDetach() {
        GenericDraweeHierarchy genericDraweeHierarchy = this.hierarchy;
        if (genericDraweeHierarchy != null) {
            genericDraweeHierarchy.f4702f.setDrawable(genericDraweeHierarchy.f4697a);
            genericDraweeHierarchy.i();
        }
        CloseableReference closeableReference = this.myImageReference;
        if (closeableReference != null) {
            closeableReference.close();
        }
        this.myImageReference = null;
        Iterator it = this.job.q().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).f(null);
        }
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public void onViewportVisibilityHint(boolean isVisibleInViewportHint) {
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    @Override // com.facebook.drawee.interfaces.DraweeController
    public void setHierarchy(DraweeHierarchy hierarchy) {
        this.hierarchy = hierarchy != null ? (GenericDraweeHierarchy) hierarchy : null;
    }

    public /* synthetic */ TiledDraweeController(Resources resources, String str, Shader.TileMode tileMode, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, str, (i7 & 4) != 0 ? Shader.TileMode.REPEAT : tileMode);
    }
}
