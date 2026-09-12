package co.discord.media_engine;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoDecoderFactory;
import org.webrtc.PlatformSoftwareVideoDecoderFactory;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;

/* JADX INFO: loaded from: classes.dex */
public class DiscordVideoDecoderFactory implements VideoDecoderFactory {
    private final VideoDecoderFactory hardwareVideoDecoderFactory;
    private final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    private final VideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();

    public DiscordVideoDecoderFactory(EglBase.Context context) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getSupportedCodecs$0(VideoCodecInfo videoCodecInfo) {
        return videoCodecInfo.name.equals("VP8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getSupportedCodecs$1(VideoCodecInfo videoCodecInfo) {
        return videoCodecInfo.name.equals("H264");
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(@NonNull VideoCodecInfo videoCodecInfo) {
        VideoDecoderFactory videoDecoderFactory;
        VideoDecoder videoDecoderCreateDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder videoDecoderCreateDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (videoDecoderCreateDecoder == null && (videoDecoderFactory = this.platformSoftwareVideoDecoderFactory) != null) {
            videoDecoderCreateDecoder = videoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (videoDecoderCreateDecoder2 == null || videoDecoderCreateDecoder == null) {
            return videoDecoderCreateDecoder2 != null ? videoDecoderCreateDecoder2 : videoDecoderCreateDecoder;
        }
        return new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderCreateDecoder2);
    }

    @Override // org.webrtc.VideoDecoderFactory
    @NonNull
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        final int i7 = 0;
        Arrays.stream(this.softwareVideoDecoderFactory.getSupportedCodecs()).filter(new Predicate() { // from class: co.discord.media_engine.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
                switch (i7) {
                    case 0:
                        return DiscordVideoDecoderFactory.lambda$getSupportedCodecs$0(videoCodecInfo);
                    default:
                        return DiscordVideoDecoderFactory.lambda$getSupportedCodecs$1(videoCodecInfo);
                }
            }
        }).forEach(new b(0, linkedHashSet));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        final int i10 = 1;
        Arrays.stream(this.platformSoftwareVideoDecoderFactory.getSupportedCodecs()).filter(new Predicate() { // from class: co.discord.media_engine.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
                switch (i10) {
                    case 0:
                        return DiscordVideoDecoderFactory.lambda$getSupportedCodecs$0(videoCodecInfo);
                    default:
                        return DiscordVideoDecoderFactory.lambda$getSupportedCodecs$1(videoCodecInfo);
                }
            }
        }).forEach(new b(0, linkedHashSet));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
