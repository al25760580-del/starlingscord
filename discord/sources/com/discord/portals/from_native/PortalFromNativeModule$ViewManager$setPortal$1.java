package com.discord.portals.from_native;

import ar.b0;
import ar.k0;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import hr.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@d(c = "com.discord.portals.from_native.PortalFromNativeModule$ViewManager$setPortal$1", f = "PortalFromNativeModule.kt", l = {ChatViewRecyclerTypes.GUILD_PROFILE_INVITE}, m = "invokeSuspend")
public final class PortalFromNativeModule$ViewManager$setPortal$1 extends h implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ double $portal;
    final /* synthetic */ PortalHolderViewGroup $portalView;
    int label;
    final /* synthetic */ PortalFromNativeModule.ViewManager this$0;

    /* JADX INFO: renamed from: com.discord.portals.from_native.PortalFromNativeModule$ViewManager$setPortal$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.portals.from_native.PortalFromNativeModule$ViewManager$setPortal$1$1", f = "PortalFromNativeModule.kt", l = {ChatViewRecyclerTypes.APP_MESSAGE_EMBED}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                this.label = 1;
                if (b0.j(50L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalFromNativeModule$ViewManager$setPortal$1(double d6, PortalHolderViewGroup portalHolderViewGroup, PortalFromNativeModule.ViewManager viewManager, Continuation continuation) {
        super(2, continuation);
        this.$portal = d6;
        this.$portalView = portalHolderViewGroup;
        this.this$0 = viewManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PortalFromNativeModule.ViewManager viewManager, PortalHolderViewGroup portalHolderViewGroup, double d6) {
        viewManager.reactEvents.emitEvent(portalHolderViewGroup, new PortalFromNativeModule.OnPortalViewLoadedEvent(d6));
        return Unit.f14616a;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new PortalFromNativeModule$ViewManager$setPortal$1(this.$portal, this.$portalView, this.this$0, continuation);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.label;
        if (i7 == 0) {
            ib.a.L(obj);
            e eVar = k0.f2938a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (b0.A(eVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        PortalFromNativeContextManager portalFromNativeContextManager = PortalFromNativeContextManager.INSTANCE;
        final double d6 = this.$portal;
        final PortalHolderViewGroup portalHolderViewGroup = this.$portalView;
        final PortalFromNativeModule.ViewManager viewManager = this.this$0;
        portalFromNativeContextManager.registerView(d6, portalHolderViewGroup, new Function0() { // from class: com.discord.portals.from_native.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortalFromNativeModule$ViewManager$setPortal$1.invokeSuspend$lambda$0(viewManager, portalHolderViewGroup, d6);
            }
        });
        return Unit.f14616a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PortalFromNativeModule$ViewManager$setPortal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }
}
