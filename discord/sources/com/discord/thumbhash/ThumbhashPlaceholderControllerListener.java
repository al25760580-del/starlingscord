package com.discord.thumbhash;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ar.b0;
import ar.k0;
import com.discord.image.fresco.listeners.ControllerListener;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.appstate.AppStateModule;
import hr.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/discord/thumbhash/ThumbhashPlaceholderControllerListener;", "Lcom/discord/image/fresco/listeners/ControllerListener;", "draweeView", "Lcom/facebook/drawee/view/SimpleDraweeView;", AppStateModule.APP_STATE_BACKGROUND, "Landroid/graphics/drawable/Drawable;", "placeholder", "", "placeholderVersion", "", "<init>", "(Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onSubmit", "", StackTraceHelper.ID_KEY, "callerContext", "", "onFailure", "throwable", "", "Companion", "thumbhash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThumbhashPlaceholderControllerListener extends ControllerListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Drawable background;

    @NotNull
    private final SimpleDraweeView draweeView;
    private final String placeholder;
    private final Integer placeholderVersion;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/discord/thumbhash/ThumbhashPlaceholderControllerListener$Companion;", "", "<init>", "()V", "canDisplay", "", "placeholder", "", "placeholderVersion", "", "(Ljava/lang/String;Ljava/lang/Integer;)Z", "thumbhash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canDisplay(String placeholder, Integer placeholderVersion) {
            return (placeholderVersion == null || placeholderVersion.intValue() != 1 || placeholder == null) ? false : true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.discord.thumbhash.ThumbhashPlaceholderControllerListener$onSubmit$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.thumbhash.ThumbhashPlaceholderControllerListener$onSubmit$1", f = "ThumbhashPlaceholderControllerListener.kt", l = {ChatViewRecyclerTypes.FORWARD_BREADCRUMB}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nThumbhashPlaceholderControllerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbhashPlaceholderControllerListener.kt\ncom/discord/thumbhash/ThumbhashPlaceholderControllerListener$onSubmit$1\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,63:1\n27#2:64\n*S KotlinDebug\n*F\n+ 1 ThumbhashPlaceholderControllerListener.kt\ncom/discord/thumbhash/ThumbhashPlaceholderControllerListener$onSubmit$1\n*L\n53#1:64\n*E\n"})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ThumbhashPlaceholderControllerListener.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            a aVar = a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                e eVar = k0.f2938a;
                ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1 thumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1 = new ThumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1(ThumbhashPlaceholderControllerListener.this, null);
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objA = b0.A(eVar, thumbhashPlaceholderControllerListener$onSubmit$1$bitmap$1, this);
                if (objA == aVar) {
                    return aVar;
                }
                coroutineScope = coroutineScope2;
                obj = objA;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ib.a.L(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (!b0.s(coroutineScope)) {
                return Unit.f14616a;
            }
            Intrinsics.checkNotNull(bitmap);
            Resources resources = ThumbhashPlaceholderControllerListener.this.draweeView.getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ((GenericDraweeHierarchy) ThumbhashPlaceholderControllerListener.this.draweeView.getHierarchy()).k(new BitmapDrawable(resources, bitmap), 1);
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    public ThumbhashPlaceholderControllerListener(@NotNull SimpleDraweeView draweeView, @NotNull Drawable background, String str, Integer num) {
        Intrinsics.checkNotNullParameter(draweeView, "draweeView");
        Intrinsics.checkNotNullParameter(background, "background");
        this.draweeView = draweeView;
        this.background = background;
        this.placeholder = str;
        this.placeholderVersion = num;
    }

    @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onFailure(String id2, Throwable throwable) {
        ((GenericDraweeHierarchy) this.draweeView.getHierarchy()).k(this.background, 0);
    }

    @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String id2, Object callerContext) {
        ((GenericDraweeHierarchy) this.draweeView.getHierarchy()).k(null, 1);
        if (!INSTANCE.canDisplay(this.placeholder, this.placeholderVersion)) {
            ((GenericDraweeHierarchy) this.draweeView.getHierarchy()).k(this.background, 0);
        } else {
            ((GenericDraweeHierarchy) this.draweeView.getHierarchy()).k(null, 0);
            b0.t(CoroutineViewUtilsKt.getAttachedScope(this.draweeView), null, new AnonymousClass1(null), 3);
        }
    }
}
