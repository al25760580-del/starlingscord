package com.discord.chat.presentation.message.viewholder;

import android.content.Context;
import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.s;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerUtilsKt;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.media_player.MediaSource;
import com.discord.primitives.UserId;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/AudioPlayerViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "accessory", "Lcom/discord/media_player/MediaSource;", "mediaSource", "", "configureVisibilityObservers", "(Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;Lcom/discord/media_player/MediaSource;)V", "onViewRecycled", "()V", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lkotlin/Function2;", "", "", "onLongClicked", "bind", "(Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;Lcom/discord/chat/presentation/events/ChatEventHandler;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "Lcom/discord/media_player/MediaPlayerManagerModule;", "mediaPlayerManagerModule", "Lcom/discord/media_player/MediaPlayerManagerModule;", "Landroid/view/View$OnAttachStateChangeListener;", "onAttachStateChangeListener", "Landroid/view/View$OnAttachStateChangeListener;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioPlayerViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioPlayerViewHolder.kt\ncom/discord/chat/presentation/message/viewholder/AudioPlayerViewHolder\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n8#2:140\n1#3:141\n*S KotlinDebug\n*F\n+ 1 AudioPlayerViewHolder.kt\ncom/discord/chat/presentation/message/viewholder/AudioPlayerViewHolder\n*L\n19#1:140\n*E\n"})
public final class AudioPlayerViewHolder extends MessagePartViewHolder {
    private final MediaPlayerManagerModule mediaPlayerManagerModule;

    @NotNull
    private View.OnAttachStateChangeListener onAttachStateChangeListener;

    @NotNull
    private final AudioPlayerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerViewHolder(@NotNull AudioPlayerView view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemedReactContext themedReactContext = (ThemedReactContext) (context instanceof ThemedReactContext ? context : null);
        this.mediaPlayerManagerModule = themedReactContext != null ? (MediaPlayerManagerModule) themedReactContext.getNativeModule(MediaPlayerManagerModule.class) : null;
        this.onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder$onAttachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$4$lambda$3$lambda$2(Function2 function2, AudioAttachmentMessageAccessory audioAttachmentMessageAccessory, View view) {
        if (function2 == null) {
            return true;
        }
        String id2 = audioAttachmentMessageAccessory.getAttachment().getId();
        if (id2 == null) {
            id2 = "";
        }
        function2.invoke(id2, Integer.valueOf(audioAttachmentMessageAccessory.getAttachmentIndex()));
        return true;
    }

    private final void configureVisibilityObservers(final AudioAttachmentMessageAccessory accessory, final MediaSource mediaSource) {
        this.onAttachStateChangeListener.onViewDetachedFromWindow(this.view);
        this.view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder.configureVisibilityObservers.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                MediaPlayerManagerModule mediaPlayerManagerModule = AudioPlayerViewHolder.this.mediaPlayerManagerModule;
                if (mediaPlayerManagerModule != null) {
                    mediaPlayerManagerModule.m1013onMediaPlayerViewWillAppearLJLSWy8(accessory.m588getChannelIdo4g7jtM(), mediaSource);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                MediaPlayerManagerModule mediaPlayerManagerModule = AudioPlayerViewHolder.this.mediaPlayerManagerModule;
                if (mediaPlayerManagerModule != null) {
                    mediaPlayerManagerModule.m1012onMediaPlayerViewDetachedLJLSWy8(accessory.m588getChannelIdo4g7jtM(), mediaSource);
                }
            }
        };
        this.onAttachStateChangeListener = onAttachStateChangeListener;
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.onAttachStateChangeListener.onViewAttachedToWindow(this.view);
    }

    public final void bind(@NotNull final AudioAttachmentMessageAccessory accessory, @NotNull final ChatEventHandler eventHandler, Function2<? super String, ? super Integer, Unit> onLongClicked) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        final AudioPlayerManager.AudioSource audioSource = AudioPlayerUtilsKt.toAudioSource(accessory);
        configureVisibilityObservers(accessory, AudioPlayerUtilsKt.toMediaSource$default(audioSource, null, 1, null));
        final Attachment attachment = accessory.getAttachment();
        UploadItemProps uploadItemProps = accessory.getUploadItemProps(new AudioPlayerViewHolder$bind$1$uploadItemProps$1(eventHandler));
        AudioPlayerView audioPlayerView = this.view;
        audioPlayerView.setSourceUrl(accessory);
        byte[] waveformByteArray = attachment.getWaveformByteArray();
        if (waveformByteArray != null) {
            audioPlayerView.setSampleData(waveformByteArray);
        } else {
            audioPlayerView.setAudioFileDetails(accessory.getAttachment());
        }
        Float durationSecs = attachment.getDurationSecs();
        if (durationSecs != null) {
            audioPlayerView.setDurationMs((long) (durationSecs.floatValue() * 1000));
        } else {
            audioPlayerView.setUnknownDuration();
        }
        audioPlayerView.setUploadProgress(uploadItemProps);
        audioPlayerView.setOnLongPress(new s(4, onLongClicked, accessory));
        audioPlayerView.shouldAnimate(attachment.isAnimated());
        audioPlayerView.setContainerBackgroundColor(accessory.getColor());
        audioPlayerView.setListener(new AudioPlayerView.Listener() { // from class: com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder$bind$1$1$4
            @Override // com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.Listener
            public void mediaAttachmentPlaybackEnded(float endDurationSecs, float durationListeningSecs) {
                float fDurationMs;
                Float durationSecs2 = attachment.getDurationSecs();
                if (durationSecs2 != null) {
                    fDurationMs = durationSecs2.floatValue();
                } else {
                    MediaPlayer player = AudioPlayerManager.INSTANCE.getPlayer(audioSource);
                    fDurationMs = (player != null ? player.durationMs() : 0L) * 1000.0f;
                }
                float f2 = fDurationMs;
                ChatEventHandler chatEventHandler = eventHandler;
                String messageId = accessory.getMessageId();
                UserId userIdM587getAuthorIdwUX8bhU = accessory.m587getAuthorIdwUX8bhU();
                if (userIdM587getAuthorIdwUX8bhU != null) {
                    long jM1217unboximpl = userIdM587getAuthorIdwUX8bhU.m1217unboximpl();
                    boolean zIsVoiceMessage = accessory.isVoiceMessage();
                    String id2 = accessory.getAttachment().getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    chatEventHandler.mo462mediaAttachmentPlaybackEndedO97gnAM(messageId, f2, endDurationSecs, jM1217unboximpl, durationListeningSecs, zIsVoiceMessage, id2);
                }
            }

            @Override // com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.Listener
            public void mediaAttachmentPlaybackStarted(float startedDurationSecs) {
                float fDurationMs;
                Float durationSecs2 = attachment.getDurationSecs();
                if (durationSecs2 != null) {
                    fDurationMs = durationSecs2.floatValue();
                } else {
                    MediaPlayer player = AudioPlayerManager.INSTANCE.getPlayer(audioSource);
                    fDurationMs = (player != null ? player.durationMs() : 0L) * 1000.0f;
                }
                float f2 = fDurationMs;
                ChatEventHandler chatEventHandler = eventHandler;
                String messageId = accessory.getMessageId();
                UserId userIdM587getAuthorIdwUX8bhU = accessory.m587getAuthorIdwUX8bhU();
                if (userIdM587getAuthorIdwUX8bhU != null) {
                    long jM1217unboximpl = userIdM587getAuthorIdwUX8bhU.m1217unboximpl();
                    boolean zIsVoiceMessage = accessory.isVoiceMessage();
                    String id2 = accessory.getAttachment().getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    chatEventHandler.mo463mediaAttachmentPlaybackStartedjd4C3YQ(messageId, f2, startedDurationSecs, jM1217unboximpl, zIsVoiceMessage, id2);
                }
            }

            @Override // com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.Listener
            public void voiceMessagePlaybackFailed(String errorMessage) {
                if (accessory.isVoiceMessage()) {
                    eventHandler.mo520voiceMessagePlaybackFailedntcYbpo(accessory.getMessageId(), errorMessage);
                }
            }
        });
    }

    public final void onViewRecycled() {
        this.view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
        this.onAttachStateChangeListener.onViewDetachedFromWindow(this.view);
    }
}
