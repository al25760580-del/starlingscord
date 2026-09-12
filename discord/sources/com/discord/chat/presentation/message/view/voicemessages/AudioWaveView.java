package com.discord.chat.presentation.message.view.voicemessages;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ar.b0;
import ar.k0;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\f\u00105\u001a\u00020,*\u00020,H\u0002J\u001a\u0010\u001b\u001a\u0002062\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u00107\u001a\u00020&H\u0016J\b\u00107\u001a\u000206H\u0002J$\u0010>\u001a\u0002062\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0006\u0010?\u001a\u00020&H\u0002J&\u0010@\u001a\u000206*\u00020A2\u0006\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020,2\b\b\u0002\u0010D\u001a\u00020&H\u0002J\u0010\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020AH\u0014J\u0018\u0010G\u001a\u0002062\u0006\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\bH\u0014J0\u0010J\u001a\u0002062\u0006\u0010K\u001a\u00020&2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\bH\u0014J\u0006\u0010P\u001a\u000206R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0011R&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u00198\u0002@BX\u0083\u000e¢\u0006\n\n\u0002\u0010\u001d\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\u001e@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020&X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010-\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0016@VX\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0014R\u000e\u00101\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R&\u00102\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0016@VX\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u0010\u0014R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006R"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;", "Landroid/view/View;", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioProgressView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationManager", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveAnimationManager;", "value", "", "downSampleData", "setDownSampleData", "([B)V", "numChunks", "setNumChunks", "(I)V", "originalSampleData", "getOriginalSampleData", "()[B", "setOriginalSampleData", "", "audioProgress", "setAudioProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "", "duration", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "shouldAnimate", "", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "defaultPaint", "Landroid/graphics/Paint;", "defaultPaintColor", "getDefaultPaintColor", "()I", "setDefaultPaintColor", "audioProgressPaint", "audioProgressPaintColor", "getAudioProgressPaintColor", "setAudioProgressPaintColor", "init", "", "finishAnimation", "animationJob", "Lkotlinx/coroutines/Job;", "getAnimationJob", "()Lkotlinx/coroutines/Job;", "setAnimationJob", "(Lkotlinx/coroutines/Job;)V", "recalculateSampleData", "downSample", "draw", "Landroid/graphics/Canvas;", ReactProgressBarViewManager.PROP_PROGRESS, "paint", "animate", "onDraw", "canvas", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "reset", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioWaveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioWaveView.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioWaveView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,273:1\n13547#2,3:274\n27#3,7:277\n376#4,2:284\n388#4,2:286\n*S KotlinDebug\n*F\n+ 1 AudioWaveView.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioWaveView\n*L\n168#1:274,3\n210#1:277,7\n227#1:284,2\n227#1:286,2\n*E\n"})
public final class AudioWaveView extends View implements AudioProgressView {
    private static final float CHUNK_MAX_HEIGHT;
    private static final float CHUNK_MIN_HEIGHT;
    private static final int CHUNK_SIZE;
    private static final int CHUNK_SPACING;
    private static final int CHUNK_WIDTH;
    private static final int FINISH_ANIMATION_NUM_REPEAT = 10;
    private static final long MAX_DURATION;
    private static final int MAX_WIDTH;
    private static final int MIN_CHUNK_NUMBER = 5;
    private static final int MIN_WIDTH;
    private Job animationJob;

    @NotNull
    private final AudioWaveAnimationManager animationManager;
    private Float audioProgress;

    @NotNull
    private final Paint audioProgressPaint;
    private int audioProgressPaintColor;

    @NotNull
    private final Paint defaultPaint;
    private int defaultPaintColor;

    @NotNull
    private byte[] downSampleData;
    private Long duration;
    private int numChunks;

    @NotNull
    private byte[] originalSampleData;
    private boolean shouldAnimate;
    private static final int CHUNK_RADIUS = SizeUtilsKt.getDpToPx(8);

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1", f = "AudioWaveView.kt", l = {122}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = AudioWaveView.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0033  */
        /* JADX WARN: Code duplicated, block: B:12:0x004b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x0052  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:13:0x004c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0033
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // xn.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                wn.a r0 = wn.a.f22354d
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                int r1 = r8.I$1
                int r3 = r8.I$0
                java.lang.Object r4 = r8.L$1
                com.discord.chat.presentation.message.view.voicemessages.AudioWaveView r4 = (com.discord.chat.presentation.message.view.voicemessages.AudioWaveView) r4
                java.lang.Object r5 = r8.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                ib.a.L(r9)
                goto L4c
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                ib.a.L(r9)
                java.lang.Object r9 = r8.L$0
                kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
                com.discord.chat.presentation.message.view.voicemessages.AudioWaveView r1 = com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.this
                r3 = 10
                r4 = 0
                r5 = r4
                r4 = r1
                r1 = r5
                r5 = r9
            L31:
                if (r1 >= r3) goto L57
                hr.e r9 = ar.k0.f2938a
                com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1$1$1 r6 = new com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$finishAnimation$1$1$1
                r7 = 0
                r6.<init>(r7)
                r8.L$0 = r5
                r8.L$1 = r4
                r8.I$0 = r3
                r8.I$1 = r1
                r8.label = r2
                java.lang.Object r9 = ar.b0.A(r9, r6, r8)
                if (r9 != r0) goto L4c
                return r0
            L4c:
                boolean r9 = ar.b0.s(r5)
                if (r9 == 0) goto L55
                r4.invalidate()
            L55:
                int r1 = r1 + r2
                goto L31
            L57:
                kotlin.Unit r9 = kotlin.Unit.f14616a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1", f = "AudioWaveView.kt", l = {140}, m = "invokeSuspend")
    public static final class C01171 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ int $numChunks;
        final /* synthetic */ byte[] $originalSampleData;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @xn.d(c = "com.discord.chat.presentation.message.view.voicemessages.AudioWaveView$recalculateSampleData$1$1", f = "AudioWaveView.kt", l = {}, m = "invokeSuspend")
        public static final class C00291 extends xn.h implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ int $numChunks;
            final /* synthetic */ byte[] $originalSampleData;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00291(byte[] bArr, int i7, Continuation continuation) {
                super(2, continuation);
                this.$originalSampleData = bArr;
                this.$numChunks = i7;
            }

            @Override // xn.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00291(this.$originalSampleData, this.$numChunks, continuation);
            }

            @Override // xn.a
            public final Object invokeSuspend(Object obj) {
                wn.a aVar = wn.a.f22354d;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                return Sampler.INSTANCE.downSample(this.$originalSampleData, this.$numChunks);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C00291) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01171(byte[] bArr, int i7, Continuation continuation) {
            super(2, continuation);
            this.$originalSampleData = bArr;
            this.$numChunks = i7;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return AudioWaveView.this.new C01171(this.$originalSampleData, this.$numChunks, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AudioWaveView audioWaveView;
            wn.a aVar = wn.a.f22354d;
            int i7 = this.label;
            if (i7 == 0) {
                ib.a.L(obj);
                AudioWaveView audioWaveView2 = AudioWaveView.this;
                hr.e eVar = k0.f2938a;
                C00291 c00291 = new C00291(this.$originalSampleData, this.$numChunks, null);
                this.L$0 = audioWaveView2;
                this.label = 1;
                Object objA = b0.A(eVar, c00291, this);
                if (objA == aVar) {
                    return aVar;
                }
                audioWaveView = audioWaveView2;
                obj = objA;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                audioWaveView = (AudioWaveView) this.L$0;
                ib.a.L(obj);
            }
            audioWaveView.setDownSampleData((byte[]) obj);
            AudioWaveView.this.invalidate();
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C01171) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(2);
        CHUNK_WIDTH = dpToPx;
        int dpToPx2 = SizeUtilsKt.getDpToPx(4);
        CHUNK_SPACING = dpToPx2;
        CHUNK_MIN_HEIGHT = SizeUtilsKt.getDpToPx(1);
        CHUNK_MAX_HEIGHT = SizeUtilsKt.getDpToPx(12);
        int i7 = dpToPx + dpToPx2;
        CHUNK_SIZE = i7;
        yq.a aVar = Duration.f14747e;
        MAX_DURATION = Duration.d(yq.c.g(30, yq.d.SECONDS));
        MIN_WIDTH = i7 * 5;
        MAX_WIDTH = SizeUtilsKt.getDpToPx(600);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void draw(Canvas canvas, float f2, Paint paint, boolean z5) {
        if (f2 == 0.0f || this.duration == null) {
            return;
        }
        int height = canvas.getHeight() / 2;
        byte[] bArr = this.downSampleData;
        float length = 1 / bArr.length;
        int length2 = bArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length2) {
            byte b10 = bArr[i7];
            int i11 = i10 + 1;
            float f7 = i10;
            float f10 = f7 * length;
            if (f10 > f2) {
                this.animationManager.resetIndex(i10);
                return;
            }
            float abs = (SamplerKt.getAbs(b10) / 127) * CHUNK_MAX_HEIGHT;
            float f11 = CHUNK_MIN_HEIGHT;
            float fMax = (Math.max(abs, f11) - f11) + f11;
            paint.setAlpha(255);
            if (z5) {
                fMax = this.animationManager.getAnimationValues(i10, (f2 - f10) / length, fMax);
            }
            int i12 = CHUNK_SIZE;
            float f12 = f7 * i12;
            float f13 = height;
            int i13 = CHUNK_RADIUS;
            canvas.drawRoundRect(f12, f13 - fMax, (i10 * i12) + CHUNK_WIDTH, f13 + fMax, i13, i13, paint);
            i7++;
            i10 = i11;
        }
    }

    public static /* synthetic */ void draw$default(AudioWaveView audioWaveView, Canvas canvas, float f2, Paint paint, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z5 = true;
        }
        audioWaveView.draw(canvas, f2, paint, z5);
    }

    private final void finishAnimation() {
        Job job = this.animationJob;
        if (job != null) {
            job.f(null);
        }
        this.animationJob = b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, new AnonymousClass1(null), 3);
    }

    private final Paint init(Paint paint) {
        paint.setAntiAlias(true);
        paint.setStrokeWidth(0.0f);
        return paint;
    }

    private final void recalculateSampleData(byte[] originalSampleData, int numChunks, boolean downSample) {
        if (!downSample || numChunks == this.downSampleData.length) {
            invalidate();
        } else {
            b0.t(CoroutineViewUtilsKt.getAttachedScope(this), null, new C01171(originalSampleData, numChunks, null), 3);
        }
    }

    public static /* synthetic */ void recalculateSampleData$default(AudioWaveView audioWaveView, byte[] bArr, int i7, boolean z5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = audioWaveView.originalSampleData;
        }
        if ((i10 & 2) != 0) {
            i7 = audioWaveView.numChunks;
        }
        audioWaveView.recalculateSampleData(bArr, i7, z5);
    }

    private final void setAudioProgress(Float f2) {
        this.audioProgress = f2;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDownSampleData(byte[] bArr) {
        this.animationManager.setData(bArr);
        this.downSampleData = bArr;
    }

    private final void setNumChunks(int i7) {
        recalculateSampleData$default(this, null, i7, this.numChunks != i7, 1, null);
        this.numChunks = i7;
    }

    public final Job getAnimationJob() {
        return this.animationJob;
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public int getAudioProgressPaintColor() {
        return this.audioProgressPaintColor;
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public int getDefaultPaintColor() {
        return this.defaultPaintColor;
    }

    public final Long getDuration() {
        return this.duration;
    }

    @NotNull
    public final byte[] getOriginalSampleData() {
        return this.originalSampleData;
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.numChunks != this.downSampleData.length) {
            recalculateSampleData$default(this, null, 0, true, 3, null);
            return;
        }
        int iSave = canvas.save();
        try {
            draw(canvas, 1.0f, this.defaultPaint, false);
            Float f2 = this.audioProgress;
            draw(canvas, f2 != null ? f2.floatValue() : 0.0f, this.audioProgressPaint, getShouldAnimate());
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            int width = getWidth();
            int i7 = CHUNK_SIZE;
            int i10 = width % i7 > CHUNK_WIDTH ? 1 : 0;
            int i11 = this.numChunks;
            int width2 = (getWidth() / i7) + i10;
            if (width2 < 5) {
                width2 = 5;
            }
            setNumChunks(width2);
            recalculateSampleData$default(this, null, 0, i11 != this.numChunks, 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f2;
        int size;
        Long l6 = this.duration;
        long jLongValue = l6 != null ? l6.longValue() : 0L;
        if (jLongValue != 0) {
            long j = MAX_DURATION;
            if (jLongValue > j) {
                f2 = 1.0f;
            } else {
                f2 = jLongValue / j;
            }
        } else {
            f2 = 1.0f;
        }
        if (View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int marginStart = size2 - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            size = (int) ((marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0)) * f2);
        } else {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        int i7 = MAX_WIDTH;
        if (size > i7) {
            size = i7;
        }
        int i10 = MIN_WIDTH;
        if (size < i10) {
            size = i10;
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(heightMeasureSpec));
    }

    public final void reset() {
        this.animationManager.reset();
    }

    public final void setAnimationJob(Job job) {
        this.animationJob = job;
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public void setAudioProgressPaintColor(int i7) {
        if (i7 != this.audioProgressPaintColor) {
            this.audioProgressPaint.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            postInvalidate();
        }
        this.audioProgressPaintColor = i7;
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public void setDefaultPaintColor(int i7) {
        if (i7 != this.defaultPaintColor) {
            this.defaultPaint.setColor(i7);
            postInvalidate();
        }
        this.defaultPaintColor = i7;
    }

    public final void setDuration(Long l6) {
        this.duration = l6;
        requestLayout();
    }

    public final void setOriginalSampleData(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        recalculateSampleData$default(this, value, 0, !Arrays.equals(this.originalSampleData, value), 2, null);
        this.originalSampleData = value;
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public void setShouldAnimate(boolean z5) {
        this.shouldAnimate = z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AudioWaveView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    @Override // com.discord.chat.presentation.message.view.voicemessages.AudioProgressView
    public void setAudioProgress(float audioProgress, boolean finishAnimation) {
        setAudioProgress(Float.valueOf(audioProgress));
        if (getShouldAnimate() && finishAnimation) {
            finishAnimation();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animationManager = new AudioWaveAnimationManager();
        this.downSampleData = new byte[0];
        this.originalSampleData = new byte[0];
        this.shouldAnimate = true;
        Paint paintInit = init(new Paint());
        this.defaultPaint = paintInit;
        this.defaultPaintColor = ThemeManagerKt.getTheme().getInteractiveTextDefault();
        Paint paintInit2 = init(new Paint());
        this.audioProgressPaint = paintInit2;
        this.audioProgressPaintColor = ThemeManagerKt.getTheme().getInteractiveTextActive();
        paintInit.setColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        paintInit2.setColorFilter(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getInteractiveTextActive(), PorterDuff.Mode.SRC_IN));
    }
}
