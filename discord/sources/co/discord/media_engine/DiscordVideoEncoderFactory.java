package co.discord.media_engine;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.k1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;

/* JADX INFO: loaded from: classes.dex */
public class DiscordVideoEncoderFactory implements VideoEncoderFactory {
    private static final HashSet<String> KNOWN_BAD_ENCODERS = new HashSet<>(Arrays.asList("c2.mtk.hevc.encoder", "omx.mtk.video.encoder.hevc"));
    private HardwareVideoEncoderFactory fwd;

    public DiscordVideoEncoderFactory(@NonNull EglBase.Context context) {
        this.fwd = new HardwareVideoEncoderFactory(context, false, true, new k1(12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(MediaCodecInfo mediaCodecInfo) {
        return !KNOWN_BAD_ENCODERS.contains(mediaCodecInfo.getName().toLowerCase(Locale.ROOT));
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(@NonNull VideoCodecInfo videoCodecInfo) {
        return this.fwd.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return this.fwd.getSupportedCodecs();
    }
}
