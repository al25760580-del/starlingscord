package com.discord.chat.presentation.message.view.voicemessages;

import a1.k;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import ar.b0;
import ar.k0;
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import fr.q;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import lo.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"com/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureGestures$onTouchListener$1", "Landroid/view/View$OnTouchListener;", "isLongPress", "", "value", "isScrubbing", "setScrubbing", "(Z)V", "hasMoved", "initialX", "", "initialY", "longPressJob", "Lkotlinx/coroutines/Job;", "longPressRunnable", "Ljava/lang/Runnable;", "onTouch", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioPlayerView.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureGestures$onTouchListener$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,740:1\n255#2:741\n*S KotlinDebug\n*F\n+ 1 AudioPlayerView.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureGestures$onTouchListener$1\n*L\n226#1:741\n*E\n"})
public final class AudioPlayerView$configureGestures$onTouchListener$1 implements View.OnTouchListener {
    private boolean hasMoved;
    private float initialX;
    private float initialY;
    private boolean isLongPress;
    private boolean isScrubbing;
    private Job longPressJob;
    private final Runnable longPressRunnable;
    final /* synthetic */ AudioPlayerView this$0;

    public AudioPlayerView$configureGestures$onTouchListener$1(AudioPlayerView audioPlayerView) {
        this.this$0 = audioPlayerView;
        this.longPressRunnable = new k(12, this, audioPlayerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void longPressRunnable$lambda$0(AudioPlayerView$configureGestures$onTouchListener$1 audioPlayerView$configureGestures$onTouchListener$1, AudioPlayerView audioPlayerView) {
        if (audioPlayerView$configureGestures$onTouchListener$1.hasMoved) {
            return;
        }
        audioPlayerView$configureGestures$onTouchListener$1.isLongPress = true;
        View.OnLongClickListener onLongClickListener = audioPlayerView.onLongPress;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(audioPlayerView.getBinding().audioProgressView);
        }
    }

    private final void setScrubbing(boolean z5) {
        if (this.isScrubbing != z5) {
            this.isScrubbing = z5;
            LinearLayout audioDetailsView = this.this$0.getBinding().audioDetailsView;
            Intrinsics.checkNotNullExpressionValue(audioDetailsView, "audioDetailsView");
            if (audioDetailsView.getVisibility() == 0) {
                this.this$0.getBinding().audioProgressBar.setScrubbing$chat_release(z5);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        Job job;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        float fC = j.c(event.getX(), 0.0f, this.this$0.getBinding().audioProgressView.getWidth()) / this.this$0.getBinding().audioProgressView.getWidth();
        float fAbs = Math.abs(event.getX() - this.initialX);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int action = event.getAction();
        if (action == 0) {
            this.initialX = event.getX();
            this.initialY = event.getY();
            setScrubbing(false);
            this.hasMoved = false;
            this.isLongPress = false;
            this.this$0.getBinding().audioProgressView.requestDisallowInterceptTouchEvent(true);
            AttachedViewCoroutineScope attachedScope = CoroutineViewUtilsKt.getAttachedScope(this.this$0);
            hr.e eVar = k0.f2938a;
            this.longPressJob = b0.t(attachedScope, q.f9394a, new AudioPlayerView$configureGestures$onTouchListener$1$onTouch$1(this, null), 2);
            return true;
        }
        if (action == 1) {
            job = this.longPressJob;
            if (job != null) {
                job.f(null);
            }
            if (this.isScrubbing) {
                this.this$0.onAudioProgressChange(new AudioProgressEvent(fC, event.getAction()));
                setScrubbing(false);
                return true;
            }
            if (!this.isLongPress && !this.hasMoved) {
                this.this$0.getBinding().buttonContainer.startAnimation(this.this$0.getBounceAnimator());
                if (this.this$0.state.getPlayer$chat_release() == null) {
                    AudioPlayerView audioPlayerView = this.this$0;
                    audioPlayerView.prepareAudio(audioPlayerView.state);
                    return true;
                }
                if (!this.this$0.state.isPlaying$chat_release(this.this$0.wasPlayingBeforeBeingPaused)) {
                    this.this$0.state.play$chat_release();
                    return true;
                }
                this.this$0.state.pause$chat_release();
            }
        } else if (action == 2) {
            if (!this.isScrubbing && fAbs > scaledTouchSlop) {
                this.hasMoved = true;
                if (!this.this$0.isScrubbingEnabled) {
                    return false;
                }
                setScrubbing(true);
                this.this$0.pauseForScrubbing();
            }
            if (this.isScrubbing) {
                Job job2 = this.longPressJob;
                if (job2 != null) {
                    CancellationException cancellationException = new CancellationException("scrubbing");
                    cancellationException.initCause(null);
                    job2.f(cancellationException);
                }
                this.this$0.onAudioProgressChange(new AudioProgressEvent(fC, event.getAction()));
                return true;
            }
        } else if (action == 3) {
            job = this.longPressJob;
            if (job != null) {
                job.f(null);
            }
            if (this.isScrubbing) {
                this.this$0.onAudioProgressChange(new AudioProgressEvent(fC, event.getAction()));
                setScrubbing(false);
                return true;
            }
            if (!this.isLongPress) {
                this.this$0.getBinding().buttonContainer.startAnimation(this.this$0.getBounceAnimator());
                if (this.this$0.state.getPlayer$chat_release() == null) {
                    AudioPlayerView audioPlayerView2 = this.this$0;
                    audioPlayerView2.prepareAudio(audioPlayerView2.state);
                    return true;
                }
                if (!this.this$0.state.isPlaying$chat_release(this.this$0.wasPlayingBeforeBeingPaused)) {
                    this.this$0.state.play$chat_release();
                    return true;
                }
                this.this$0.state.pause$chat_release();
            }
        }
        return true;
    }
}
