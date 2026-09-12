package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.codegen.NativeAudioPlayerModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerModule;", "Lcom/discord/codegen/NativeAudioPlayerModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "pauseCurrentPlayer", "", "storePauseState", "", "maybePlayCurrentPlayer", "handleVoiceMessageDeleted", StackTraceHelper.ID_KEY, "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioPlayerModule extends NativeAudioPlayerModuleSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPlayerModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybePlayCurrentPlayer$lambda$1() {
        AudioPlayerManager.INSTANCE.maybePlayCurrentPlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseCurrentPlayer$lambda$0(boolean z5) {
        AudioPlayerManager.INSTANCE.pauseCurrentPlayer(z5);
    }

    @Override // com.discord.codegen.NativeAudioPlayerModuleSpec
    public void handleVoiceMessageDeleted(String id2) {
    }

    @Override // com.discord.codegen.NativeAudioPlayerModuleSpec
    public void maybePlayCurrentPlayer() {
        this.reactContext.runOnUiQueueThread(new bc.a(2));
    }

    @Override // com.discord.codegen.NativeAudioPlayerModuleSpec
    public void pauseCurrentPlayer(boolean storePauseState) {
        this.reactContext.runOnUiQueueThread(new b(storePauseState, 0));
    }
}
