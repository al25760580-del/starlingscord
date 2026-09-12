package com.discord.chat.presentation.message.system;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import androidx.lifecycle.Lifecycle;
import ar.b0;
import ar.k0;
import ar.w;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.CallSystemMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.chat.presentation.message.AddSystemMessageCardStyleKt;
import com.discord.chat.presentation.message.n;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.media.engine.MediaEngine;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.time.IntervalFlowKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import er.s;
import hr.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import xn.d;
import xn.h;
import yq.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\tH\u0016J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/system/CallSystemMessageView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "greenIconColor", "", "redIconColor", "grayIconColor", "binding", "Lcom/discord/chat/databinding/CallSystemMessageViewBinding;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "setBackgroundColor", "", ViewProps.COLOR, "setMessage", "message", "Lcom/discord/chat/bridge/Message;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCallSystemMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1563#2:172\n1634#2,3:173\n*S KotlinDebug\n*F\n+ 1 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView\n*L\n133#1:172\n133#1:173,3\n*E\n"})
public final class CallSystemMessageView extends ChatListConstraintLayout {

    @NotNull
    private final CallSystemMessageViewBinding binding;

    @NotNull
    private final GradientDrawable gradientDrawable;
    private final int grayIconColor;
    private final int greenIconColor;
    private final int redIconColor;

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1", f = "CallSystemMessageView.kt", l = {107}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Message $message;
        final /* synthetic */ long $start;
        int label;

        /* JADX INFO: renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @d(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1", f = "CallSystemMessageView.kt", l = {MediaEngine.MAX_SUPPORTED_PROTOCOL_VERSION}, m = "invokeSuspend")
        @SourceDebugExtension({"SMAP\nCallSystemMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,171:1\n49#2:172\n51#2:176\n46#3:173\n51#3:175\n105#4:174\n*S KotlinDebug\n*F\n+ 1 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1\n*L\n109#1:172\n109#1:176\n109#1:173\n109#1:175\n109#1:174\n*E\n"})
        public static final class C00231 extends h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ Message $message;
            final /* synthetic */ long $start;
            int label;
            final /* synthetic */ CallSystemMessageView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(long j, CallSystemMessageView callSystemMessageView, Message message, Continuation continuation) {
                super(2, continuation);
                this.$start = j;
                this.this$0 = callSystemMessageView;
                this.$message = message;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00231(this.$start, this.this$0, this.$message, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                int i7 = this.label;
                if (i7 == 0) {
                    ib.a.L(obj);
                    yq.a aVar2 = Duration.f14747e;
                    long jG = c.g(1, yq.d.SECONDS);
                    Duration.f14747e.getClass();
                    final Flow flowM1024intervalFlowQTBD994 = IntervalFlowKt.m1024intervalFlowQTBD994(jG, 0L);
                    final long j = this.$start;
                    Flow flowA = new Flow() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1

                        /* JADX INFO: renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1\n*L\n1#1,49:1\n50#2:50\n110#3,3:51\n*E\n"})
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ long $start$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* JADX INFO: renamed from: com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @d(c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2", f = "CallSystemMessageView.kt", l = {50}, m = "emit")
                            public static final class AnonymousClass1 extends xn.c {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // xn.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, long j) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$start$inlined = j;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i7 = anonymousClass1.label;
                                    if ((i7 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i7 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                                Object obj2 = anonymousClass1.result;
                                wn.a aVar = wn.a.f22354d;
                                int i10 = anonymousClass1.label;
                                if (i10 == 0) {
                                    ib.a.L(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    yq.a aVar2 = Duration.f14747e;
                                    Duration duration = new Duration(c.h(System.currentTimeMillis() - this.$start$inlined, yq.d.MILLISECONDS));
                                    Duration.f14747e.getClass();
                                    Duration minimumValue = new Duration(0L);
                                    Intrinsics.checkNotNullParameter(duration, "<this>");
                                    Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
                                    if (duration.compareTo(minimumValue) < 0) {
                                        duration = minimumValue;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(duration, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ib.a.L(obj2);
                                }
                                return Unit.f14616a;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = flowM1024intervalFlowQTBD994.collect(new AnonymousClass2(flowCollector, j), continuation);
                            return objCollect == wn.a.f22354d ? objCollect : Unit.f14616a;
                        }
                    };
                    e eVar = k0.f2938a;
                    if (eVar.l(w.f2975e) != null) {
                        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + eVar).toString());
                    }
                    if (!Intrinsics.areEqual(eVar, g.f14681d)) {
                        flowA = flowA instanceof s ? er.c.a((s) flowA, eVar, 0, null, 6) : new er.g(flowA, eVar, 0, null, 12);
                    }
                    final CallSystemMessageView callSystemMessageView = this.this$0;
                    final Message message = this.$message;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView.setMessage.1.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return m726emitVtjQ1oo(((Duration) obj2).f14750d, continuation);
                        }

                        /* JADX INFO: renamed from: emit-VtjQ1oo, reason: not valid java name */
                        public final Object m726emitVtjQ1oo(long j5, Continuation continuation) {
                            CallSystemMessageView callSystemMessageView2 = callSystemMessageView;
                            Message message2 = message;
                            yq.a aVar3 = Duration.f14747e;
                            long jK = Duration.k(j5, yq.d.HOURS);
                            int iE = Duration.e(j5);
                            int iG = Duration.g(j5);
                            Duration.f(j5);
                            TextView textView = callSystemMessageView2.binding.info;
                            String str = String.format("%02d:%02d:%02d%s", Arrays.copyOf(new Object[]{new Long(jK), new Integer(iE), new Integer(iG), message2.getDescription()}, 4));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                            textView.setText(str);
                            return Unit.f14616a;
                        }
                    };
                    this.label = 1;
                    if (flowA.collect(flowCollector, this) == aVar) {
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
                return ((C00231) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Message message, Continuation continuation) {
            super(2, continuation);
            this.$start = j;
            this.$message = message;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return CallSystemMessageView.this.new AnonymousClass1(this.$start, this.$message, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) {
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                CallSystemMessageView callSystemMessageView = CallSystemMessageView.this;
                Lifecycle.State state = Lifecycle.State.f2298v;
                C00231 c00231 = new C00231(this.$start, callSystemMessageView, this.$message, null);
                this.label = 1;
                if (CoroutineViewUtilsKt.repeatOnLifecycleOwner(callSystemMessageView, state, c00231, this) == aVar) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CallSystemMessageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessage$lambda$4(ChatEventHandler chatEventHandler, Message message, View view) {
        chatEventHandler.mo481onTapCallpfaIj0E(message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM());
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.gradientDrawable.setColor(color);
    }

    public final void setMessage(@NotNull Message message, @NotNull ChatEventHandler eventHandler) {
        int i7;
        CallSystemMessageView callSystemMessageView;
        Message message2;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        SimpleDraweeView icon = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        Boolean missed = message.getMissed();
        Boolean bool = Boolean.TRUE;
        ReactAssetUtilsKt.setReactAsset(icon, Intrinsics.areEqual(missed, bool) ? ReactAsset.PhoneHangUpIcon : ReactAsset.PhoneCallIcon);
        SimpleDraweeView icon2 = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon2, "icon");
        if (Intrinsics.areEqual(message.isCallActive(), bool)) {
            i7 = this.greenIconColor;
        } else {
            i7 = Intrinsics.areEqual(message.getMissed(), bool) ? this.redIconColor : this.grayIconColor;
        }
        ColorUtilsKt.setTintColor(icon2, Integer.valueOf(i7));
        this.binding.message.setText(message.getTitle());
        AttachedViewCoroutineScope.cancelAllWork$default(CoroutineViewUtilsKt.getAttachedScope(this), "Binding CallSystemMessageView", null, 2, null);
        if (Intrinsics.areEqual(message.isCallActive(), bool)) {
            Long rawMilliseconds = message.getRawMilliseconds();
            Intrinsics.checkNotNull(rawMilliseconds);
            callSystemMessageView = this;
            message2 = message;
            b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, callSystemMessageView.new AnonymousClass1(rawMilliseconds.longValue(), message2, null), 3);
        } else {
            callSystemMessageView = this;
            message2 = message;
            callSystemMessageView.binding.info.setText(message2.getDescription());
        }
        OverlappingCirclesView overlappingCirclesView = callSystemMessageView.binding.participants;
        List<String> avatarURLs = message2.getAvatarURLs();
        if (avatarURLs == null) {
            avatarURLs = n0.f14659d;
        }
        ArrayList arrayList = new ArrayList(e0.l(avatarURLs, 10));
        Iterator<T> it = avatarURLs.iterator();
        while (it.hasNext()) {
            arrayList.add(new OverlappingItem((String) it.next()));
        }
        overlappingCirclesView.setItems(arrayList);
        final n nVar = new n(eventHandler, message2);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, nVar);
        u0.p(this, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.system.CallSystemMessageView.setMessage.3
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                Context context = CallSystemMessageView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                info.w(I18nUtilsKt.i18nFormat$default(context, I18nMessage.A11Y_ROLE_BUTTON, null, 2, null));
            }

            @Override // androidx.core.view.b
            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                Intrinsics.checkNotNullParameter(host, "host");
                if (action == 16) {
                    nVar.onClick(host);
                }
                return super.performAccessibilityAction(host, action, args);
            }
        });
    }

    public /* synthetic */ CallSystemMessageView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSystemMessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.greenIconColor = ThemeManagerKt.getTheme().getIconVoiceConnected();
        this.redIconColor = ThemeManagerKt.getTheme().getIconVoiceDisconnected();
        this.grayIconColor = ThemeManagerKt.getTheme().getInteractiveTextDefault();
        CallSystemMessageViewBinding callSystemMessageViewBindingInflate = CallSystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(callSystemMessageViewBindingInflate, "inflate(...)");
        this.binding = callSystemMessageViewBindingInflate;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        this.gradientDrawable = gradientDrawable;
        AddSystemMessageCardStyleKt.addSystemMessageCardStyle(this);
        setForeground(gradientDrawable);
        TextView textView = callSystemMessageViewBindingInflate.message;
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        textView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        TextView textView2 = callSystemMessageViewBindingInflate.info;
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryNormal);
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
