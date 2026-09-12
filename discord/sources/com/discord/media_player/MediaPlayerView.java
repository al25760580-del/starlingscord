package com.discord.media_player;

import a3.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.discord.media_player.databinding.PlayerViewWithSurfaceViewBinding;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u00168@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/discord/media_player/MediaPlayerView;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "getPlayerView", "()Lcom/google/android/exoplayer2/ui/PlayerView;", "value", "", "isVisible", "()Z", "setVisible", "(Z)V", "Lcom/google/android/exoplayer2/Player;", "player", "getPlayer$media_player_release", "()Lcom/google/android/exoplayer2/Player;", "setPlayer$media_player_release", "(Lcom/google/android/exoplayer2/Player;)V", "reset", "", "assignViewToPlayer", "ControlView", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaPlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayerView.kt\ncom/discord/media_player/MediaPlayerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n255#2:92\n257#2,2:93\n1#3:95\n*S KotlinDebug\n*F\n+ 1 MediaPlayerView.kt\ncom/discord/media_player/MediaPlayerView\n*L\n39#1:92\n41#1:93,2\n*E\n"})
public final class MediaPlayerView {

    @NotNull
    private View view;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/media_player/MediaPlayerView$ControlView;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "playerControlView", "Lcom/google/android/exoplayer2/ui/PlayerControlView;", "value", "Lcom/google/android/exoplayer2/Player;", "player", "getPlayer$media_player_release", "()Lcom/google/android/exoplayer2/Player;", "setPlayer$media_player_release", "(Lcom/google/android/exoplayer2/Player;)V", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ControlView {

        @NotNull
        private PlayerControlView playerControlView;

        public ControlView(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.playerControlView = new PlayerControlView(context, null);
        }

        public final Player getPlayer$media_player_release() {
            return this.playerControlView.getPlayer();
        }

        public final void setPlayer$media_player_release(Player player) {
            this.playerControlView.setPlayer(player);
        }
    }

    public MediaPlayerView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PlayerView root = PlayerViewWithSurfaceViewBinding.inflate(LayoutInflater.from(context)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.view = root;
        getPlayerView().setResizeMode(3);
        getPlayerView().setUseController(false);
        assignViewToPlayer(getPlayer$media_player_release());
    }

    private final PlayerView getPlayerView() {
        View view = this.view;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.exoplayer2.ui.PlayerView");
        return (PlayerView) view;
    }

    public final void assignViewToPlayer(Player player) {
        View videoSurfaceView = getPlayerView().getVideoSurfaceView();
        if (videoSurfaceView instanceof SurfaceView) {
            if (player != null) {
                player.p((SurfaceView) videoSurfaceView);
            }
        } else if (!(videoSurfaceView instanceof TextureView)) {
            if (videoSurfaceView == null) {
            } else {
                throw new IllegalStateException(e.l("Unsupported surface view type: ", videoSurfaceView != null ? videoSurfaceView.getClass().getSimpleName() : null).toString());
            }
        } else if (player != null) {
            player.P((TextureView) videoSurfaceView);
        }
    }

    public final Player getPlayer$media_player_release() {
        return getPlayerView().getPlayer();
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final boolean isVisible() {
        return this.view.getVisibility() == 0;
    }

    public final void reset() {
        setPlayer$media_player_release(null);
    }

    public final void setPlayer$media_player_release(Player player) {
        getPlayerView().setPlayer(player);
    }

    public final void setView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.view = view;
    }

    public final void setVisible(boolean z5) {
        this.view.setVisibility(z5 ? 0 : 8);
    }
}
