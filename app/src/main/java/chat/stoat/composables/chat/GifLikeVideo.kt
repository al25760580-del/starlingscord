package chat.stoat.composables.chat

import android.view.ViewGroup
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import chat.stoat.core.model.schemas.Embed

/**
 * Renders an MP4/WebM (Tenor "gifv" embeds, video attachments) as an
 * autoplaying, looping, muted, control-less video — the way the official
 * clients treat GIF links.
 */
@Composable
fun GifLikeVideo(embed: Embed, modifier: Modifier = Modifier) {
    val url = embed.video?.url ?: embed.url ?: return
    val context = LocalContext.current

    val player = remember(url) {
        ExoPlayer.Builder(context).build().apply {
            setMediaItem(MediaItem.fromUri(url))
            repeatMode = Player.REPEAT_MODE_ALL
            volume = 0f
            playWhenReady = true
            prepare()
        }
    }
    DisposableEffect(url) {
        onDispose { player.release() }
    }

    val w = embed.video?.width?.toFloat() ?: embed.width?.toFloat() ?: 16f
    val h = embed.video?.height?.toFloat() ?: embed.height?.toFloat() ?: 9f
    val ratio = if (w > 0f && h > 0f) w / h else 16f / 9f

    AndroidView(
        factory = {
            PlayerView(it).apply {
                useController = false
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                )
            }
        },
        update = { it.player = player },
        modifier = modifier
            .widthIn(max = 320.dp)
            .aspectRatio(ratio)
            .clip(MaterialTheme.shapes.medium),
    )
}
