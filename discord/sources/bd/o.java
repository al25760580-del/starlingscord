package bd;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f3175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3179h;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.f3172a = str;
        this.f3173b = str2;
        this.f3174c = str3;
        this.f3175d = codecCapabilities;
        this.f3178g = z5;
        this.f3176e = z6;
        this.f3177f = z7;
        this.f3179h = je.o.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i10, double d6) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(e0.f(i7, widthAlignment) * widthAlignment, e0.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        return (d6 == -1.0d || d6 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d6));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static o h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z5, boolean z6) {
        boolean z7;
        int i7;
        if (codecCapabilities == null || (i7 = e0.f13788a) < 19 || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z7 = false;
        } else {
            if (i7 <= 22) {
                String str4 = e0.f13791d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z7 = false;
                }
            }
            z7 = true;
        }
        if (codecCapabilities != null && e0.f13788a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new o(str, str2, str3, codecCapabilities, z5, z7, z6 || (codecCapabilities != null && e0.f13788a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final DecoderReuseEvaluation b(Format format, Format format2) {
        Format format3;
        Format format4;
        int i7 = !e0.a(format.I, format2.I) ? 8 : 0;
        if (this.f3179h) {
            if (format.Q != format2.Q) {
                i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            if (!this.f3176e && (format.N != format2.N || format.O != format2.O)) {
                i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            if (!e0.a(format.U, format2.U)) {
                i7 |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
            if (e0.f13791d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f3172a) && !format.b(format2)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new DecoderReuseEvaluation(this.f3172a, format, format2, format.b(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.V != format4.V) {
                i7 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            if (format3.W != format4.W) {
                i7 |= 8192;
            }
            if (format3.X != format4.X) {
                i7 |= 16384;
            }
            String str = this.f3173b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = z.d(format3);
                Pair pairD2 = z.d(format4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f3172a, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.b(format4)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new DecoderReuseEvaluation(this.f3172a, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f3172a, format3, format4, 0, i7);
    }

    public final boolean c(Format format, boolean z5) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = z.d(format);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(format.I);
            int i7 = 8;
            String str = this.f3173b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.f3179h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3175d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (e0.f13788a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    } else if (iIntValue3 >= 120000000) {
                        i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    } else if (iIntValue3 >= 60000000) {
                        i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    } else if (iIntValue3 >= 30000000) {
                        i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    } else if (iIntValue3 >= 18000000) {
                        i7 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i7 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i7 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i7 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i7;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z5)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = e0.f13789b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + format.F + ", " + this.f3174c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(Format format) {
        int i7;
        String str = format.I;
        String str2 = this.f3173b;
        boolean z5 = str2.equals(str) || str2.equals(z.b(format));
        int i10 = format.O;
        int i11 = format.N;
        if (!z5 || !c(format, true)) {
            return false;
        }
        if (!this.f3179h) {
            int i12 = e0.f13788a;
            if (i12 >= 21) {
                int i13 = format.W;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3175d;
                if (i13 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i13)) {
                        g("sampleRate.support, " + i13);
                        return false;
                    }
                }
                int i14 = format.V;
                if (i14 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i12 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i7 = 6;
                        } else {
                            i7 = "audio/eac3".equals(str2) ? 16 : 30;
                        }
                        StringBuilder sbT = a3.e.t("AssumedMaxChannelAdjustment: ", this.f3172a, ", [", maxInputChannelCount, " to ");
                        sbT.append(i7);
                        sbT.append("]");
                        je.b.N("MediaCodecInfo", sbT.toString());
                        maxInputChannelCount = i7;
                    }
                    if (maxInputChannelCount < i14) {
                        g("channelCount.support, " + i14);
                        return false;
                    }
                }
            }
        } else if (i11 > 0 && i10 > 0) {
            if (e0.f13788a >= 21) {
                return f(i11, format.P, i10);
            }
            boolean z6 = i11 * i10 <= z.i();
            if (!z6) {
                g("legacyFrameSize, " + i11 + "x" + i10);
            }
            return z6;
        }
        return true;
    }

    public final boolean e(Format format) {
        if (this.f3179h) {
            return this.f3176e;
        }
        Pair pairD = z.d(format);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(int i7, double d6, int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f3175d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (e0.f13788a >= 29) {
            int iA = n.a(videoCapabilities, i7, i10, d6);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbR = a3.e.r(i7, "sizeAndRate.cover, ", i10, "x", "@");
                sbR.append(d6);
                g(sbR.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i7, i10, d6)) {
            if (i7 < i10) {
                String str = this.f3172a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(e0.f13789b)) && a(videoCapabilities, i10, i7, d6)) {
                    StringBuilder sbR2 = a3.e.r(i7, "sizeAndRate.rotated, ", i10, "x", "@");
                    sbR2.append(d6);
                    StringBuilder sbU = a3.e.u("AssumedSupport [", sbR2.toString(), "] [", str, ", ");
                    sbU.append(this.f3173b);
                    sbU.append("] [");
                    sbU.append(e0.f13792e);
                    sbU.append("]");
                    je.b.q("MediaCodecInfo", sbU.toString());
                }
            }
            StringBuilder sbR3 = a3.e.r(i7, "sizeAndRate.support, ", i10, "x", "@");
            sbR3.append(d6);
            g(sbR3.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbN = com.discord.chat.presentation.list.a.n("NoSupport [", str, "] [");
        sbN.append(this.f3172a);
        sbN.append(", ");
        sbN.append(this.f3173b);
        sbN.append("] [");
        sbN.append(e0.f13792e);
        sbN.append("]");
        je.b.q("MediaCodecInfo", sbN.toString());
    }

    public final String toString() {
        return this.f3172a;
    }
}
