package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.transition.Transition;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.bridge.spoiler.SpoilerType;
import com.discord.chat.databinding.SpoilerViewBinding;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0016J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010)\u001a\u00020\u001b¢\u0006\u0004\b*\u0010\u001eR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010.R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\f0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\f0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101¨\u00064"}, d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showImage", "Landroid/view/View;", "overlayView", "", "toggleContentVisibility", "(ZLandroid/view/View;)V", "Lkotlin/Function1;", "onTapObscureToggle", "onObscureToggleVisibilityClick", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "onObscureVerifyAgeClick", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "resetOverlays", "()V", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "config", "configureSpoilerOverlay", "(Lcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "Landroid/view/ViewGroup;", "parent", "configureObscureOverlay", "(Lcom/discord/chat/bridge/spoiler/SpoilerConfig;Landroid/view/ViewGroup;)V", "isVisible", "setRevealButtonVisible", "(Z)V", "setOpaqueBackgroundVisible", "makeObscureHideButtonHidden", "setObscureLabelVisible", "isAwaitingScan", "handleObscureAwaitingScan", "isOverlayVisible", "()Z", "viewToBlur", "configure", "Lcom/discord/chat/databinding/SpoilerViewBinding;", "binding", "Lcom/discord/chat/databinding/SpoilerViewBinding;", "Z", "Lkotlin/Function0;", "onReveal", "Lkotlin/jvm/functions/Function0;", "onHide", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpoilerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerView.kt\ncom/discord/chat/presentation/message/view/SpoilerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,182:1\n257#2,2:183\n257#2,2:185\n257#2,2:187\n257#2,2:189\n257#2,2:191\n257#2,2:193\n257#2,2:195\n*S KotlinDebug\n*F\n+ 1 SpoilerView.kt\ncom/discord/chat/presentation/message/view/SpoilerView\n*L\n60#1:183,2\n78#1:185,2\n79#1:187,2\n84#1:189,2\n106#1:191,2\n152#1:193,2\n155#1:195,2\n*E\n"})
public final class SpoilerView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SpoilerViewBinding binding;
    private boolean isOverlayVisible;

    @NotNull
    private Function0<Unit> onHide;

    @NotNull
    private Function0<Unit> onReveal;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerView$Companion;", "", "<init>", "()V", "createAndAttachSpoilerView", "Lcom/discord/chat/presentation/message/view/SpoilerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "radiusPx", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final SpoilerView createAndAttachSpoilerView(@NotNull ConstraintLayout constraintLayout, int i7) {
            Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SpoilerView spoilerView = new SpoilerView(context, null, 2, 0 == true ? 1 : 0);
            spoilerView.setId(View.generateViewId());
            ViewClippingUtilsKt.clipToRoundedRectangle(spoilerView, i7);
            spoilerView.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
            constraintLayout.addView(spoilerView);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.c(constraintLayout);
            constraintSet.d(spoilerView.getId(), 6, 6);
            constraintSet.d(spoilerView.getId(), 7, 7);
            constraintSet.d(spoilerView.getId(), 3, 3);
            constraintSet.d(spoilerView.getId(), 4, 4);
            constraintSet.a(constraintLayout);
            return spoilerView;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpoilerType.values().length];
            try {
                iArr[SpoilerType.OBSCURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.SpoilerView$configure$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, SpoilerConfig.class, "onReveal", "onReveal()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m753invoke();
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m753invoke() {
            ((SpoilerConfig) this.receiver).onReveal();
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.SpoilerView$configure$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, SpoilerConfig.class, "onHide", "onHide()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m754invoke();
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m754invoke() {
            ((SpoilerConfig) this.receiver).onHide();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpoilerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureObscureOverlay(SpoilerConfig config, ViewGroup parent) {
        SpoilerAttributes attributes = config.getAttributes();
        final Function1<Boolean, Unit> function1OnObscureVerifyAgeClick = Intrinsics.areEqual(attributes.getVerifyAge(), Boolean.TRUE) ? onObscureVerifyAgeClick(config.getOnTapObscureToggle()) : onObscureToggleVisibilityClick(this.binding.obscure.getOverlayView(), config.getOnTapObscureToggle());
        ObscureOverlayView obscure = this.binding.obscure;
        Intrinsics.checkNotNullExpressionValue(obscure, "obscure");
        obscure.setVisibility(0);
        ObscureOverlayView obscureOverlayView = this.binding.obscure;
        Function1<Context, String> label = attributes.getLabel();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = (String) label.invoke(context);
        Function1<Context, String> description = attributes.getDescription();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String str2 = (String) description.invoke(context2);
        boolean z5 = this.isOverlayVisible;
        final int i7 = 0;
        Function0<Unit> function0 = new Function0() { // from class: com.discord.chat.presentation.message.view.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return SpoilerView.configureObscureOverlay$lambda$6(function1OnObscureVerifyAgeClick);
                    default:
                        return SpoilerView.configureObscureOverlay$lambda$7(function1OnObscureVerifyAgeClick);
                }
            }
        };
        final int i10 = 1;
        obscureOverlayView.configure(str, str2, parent, z5, function0, new Function0() { // from class: com.discord.chat.presentation.message.view.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return SpoilerView.configureObscureOverlay$lambda$6(function1OnObscureVerifyAgeClick);
                    default:
                        return SpoilerView.configureObscureOverlay$lambda$7(function1OnObscureVerifyAgeClick);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureObscureOverlay$lambda$6(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureObscureOverlay$lambda$7(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f14616a;
    }

    private final void configureSpoilerOverlay(SpoilerConfig config) {
        View overlayView = this.binding.spoiler.getOverlayView();
        SpoilerOverlayView spoiler = this.binding.spoiler;
        Intrinsics.checkNotNullExpressionValue(spoiler, "spoiler");
        spoiler.setVisibility(0);
        SpoilerOverlayView spoilerOverlayView = this.binding.spoiler;
        Function1<Context, String> label = config.getAttributes().getLabel();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String str = (String) label.invoke(context);
        Function1<Context, String> description = config.getAttributes().getDescription();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        spoilerOverlayView.configure(str, (String) description.invoke(context2), new c6.a(5, this, overlayView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureSpoilerOverlay$lambda$5(SpoilerView spoilerView, View view) {
        spoilerView.toggleContentVisibility(true, view);
        return Unit.f14616a;
    }

    private final Function1<Boolean, Unit> onObscureToggleVisibilityClick(View overlayView, Function1<? super Boolean, Unit> onTapObscureToggle) {
        return new com.discord.age_assurance.a(this, overlayView, onTapObscureToggle, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onObscureToggleVisibilityClick$lambda$3(SpoilerView spoilerView, View view, Function1 function1, boolean z5) {
        spoilerView.toggleContentVisibility(z5, view);
        function1.invoke(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    private final Function1<Boolean, Unit> onObscureVerifyAgeClick(Function1<? super Boolean, Unit> onTapObscureToggle) {
        return new z(onTapObscureToggle, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onObscureVerifyAgeClick$lambda$4(Function1 function1, boolean z5) {
        function1.invoke(Boolean.valueOf(z5));
        return Unit.f14616a;
    }

    private final void resetOverlays() {
        SpoilerOverlayView spoiler = this.binding.spoiler;
        Intrinsics.checkNotNullExpressionValue(spoiler, "spoiler");
        spoiler.setVisibility(8);
        ObscureOverlayView obscure = this.binding.obscure;
        Intrinsics.checkNotNullExpressionValue(obscure, "obscure");
        obscure.setVisibility(8);
    }

    private final void toggleContentVisibility(final boolean showImage, View overlayView) {
        ViewParent parent;
        if (getParent().getParent() instanceof ViewGroup) {
            parent = getParent().getParent();
        } else {
            parent = getParent() instanceof ViewGroup ? getParent() : this;
        }
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        m3.f fVar = new m3.f(showImage ? 2 : 1);
        fVar.f2785i = 150L;
        fVar.a(new m3.u() { // from class: com.discord.chat.presentation.message.view.SpoilerView$toggleContentVisibility$transition$1$1
            @Override // m3.u, m3.s
            public void onTransitionEnd(Transition transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                if (showImage) {
                    this.onReveal.invoke();
                    this.isOverlayVisible = false;
                } else {
                    this.onHide.invoke();
                    this.isOverlayVisible = true;
                }
            }

            @Override // m3.s
            public void onTransitionStart(Transition transition, boolean z5) {
                onTransitionStart(transition);
            }

            @Override // m3.s
            public void onTransitionEnd(Transition transition, boolean z5) {
                onTransitionEnd(transition);
            }
        });
        m3.x.a(viewGroup, fVar);
        overlayView.setVisibility(!showImage ? 0 : 8);
    }

    public final void configure(SpoilerConfig config, @NotNull ViewGroup viewToBlur) {
        Intrinsics.checkNotNullParameter(viewToBlur, "viewToBlur");
        if (config == null) {
            this.isOverlayVisible = false;
            setVisibility(8);
            return;
        }
        resetOverlays();
        this.isOverlayVisible = SpoilerManager.INSTANCE.m450isNotRevealedV2PEE7g(config.getAttributes().m439getIdentifierBq9X6Gg());
        if (WhenMappings.$EnumSwitchMapping$0[config.getAttributes().getType().ordinal()] == 1) {
            configureObscureOverlay(config, viewToBlur);
        } else {
            configureSpoilerOverlay(config);
        }
        this.onReveal = new AnonymousClass1(config);
        this.onHide = new AnonymousClass2(config);
        setVisibility(0);
    }

    public final void handleObscureAwaitingScan(boolean isAwaitingScan) {
        this.binding.obscure.handleObscureAwaitingScan(isAwaitingScan);
    }

    /* JADX INFO: renamed from: isOverlayVisible, reason: from getter */
    public final boolean getIsOverlayVisible() {
        return this.isOverlayVisible;
    }

    public final void makeObscureHideButtonHidden() {
        this.binding.obscure.makeHideButtonHidden();
    }

    public final void setObscureLabelVisible(boolean isVisible) {
        this.binding.obscure.setLabelVisible(isVisible);
    }

    public final void setOpaqueBackgroundVisible(boolean isVisible) {
        this.binding.obscure.setOpaqueBackgroundVisible(isVisible);
    }

    public final void setRevealButtonVisible(boolean isVisible) {
        this.binding.obscure.setRevealButtonVisible(isVisible);
    }

    public /* synthetic */ SpoilerView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        SpoilerViewBinding spoilerViewBindingInflate = SpoilerViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(spoilerViewBindingInflate, "inflate(...)");
        this.binding = spoilerViewBindingInflate;
        this.onReveal = new com.discord.chat.presentation.list.f(17);
        this.onHide = new com.discord.chat.presentation.list.f(18);
    }
}
