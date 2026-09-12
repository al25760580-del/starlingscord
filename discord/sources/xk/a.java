package xk;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import f4.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    static {
        HashMap map = new HashMap();
        int i7 = Build.VERSION.SDK_INT;
        map.put("video/avc", i7 >= 27 ? new int[]{65536, 1, 4, 2, 524288, 8, 16, 32, 64} : new int[]{1, 4, 2, 8, 16, 32, 64});
        map.put("video/x-vnd.on2.vp8", new int[]{1});
        map.put("video/hevc", i7 >= 29 ? new int[]{1, 2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 8192} : new int[]{1, 2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT});
        map.put("video/x-vnd.on2.vp9", i7 >= 29 ? new int[]{1, 2, 4, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 16384, 8, 8192, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS} : new int[]{1, 2, 4, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 8, 8192});
        if (i7 >= 29) {
            map.put("video/av01", new int[]{1, 2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 8192});
        }
    }

    public static MediaCodec a(MediaFormat mediaFormat, Surface surface, boolean z5, ArrayList arrayList) throws IOException {
        MediaCodec mediaCodec;
        Exception e10;
        Iterator it = arrayList.iterator();
        MediaCodec mediaCodec2 = null;
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                mediaCodec = (MediaCodec) ((Callable) it.next()).call();
                if (mediaCodec != null) {
                    try {
                        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, z5 ? 1 : 0);
                        mediaCodec2 = mediaCodec;
                        break;
                    } catch (Exception e11) {
                        e10 = e11;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                            mediaCodec = null;
                        }
                        if (e10 instanceof IOException) {
                            iOException = (IOException) e10;
                        }
                        mediaCodec2 = mediaCodec;
                    }
                } else {
                    continue;
                    mediaCodec2 = mediaCodec;
                }
            } catch (Exception e12) {
                mediaCodec = mediaCodec2;
                e10 = e12;
            }
        }
        if (mediaCodec2 != null) {
            return mediaCodec2;
        }
        if (iOException != null) {
            throw iOException;
        }
        throw new IllegalStateException();
    }

    public static ArrayList b(boolean z5, String str, MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() == z5) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (mediaFormat == null || capabilitiesForType.isFormatSupported(mediaFormat))) {
                        arrayList.add(new e(3, mediaCodecInfo));
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    public static MediaCodec c(MediaFormat mediaFormat, Surface surface, boolean z5, int i7, int i10, int i11) throws rk.e {
        try {
            try {
                ArrayList arrayListB = b(z5, mediaFormat.getString("mime"), mediaFormat);
                MediaCodec mediaCodecA = !arrayListB.isEmpty() ? a(mediaFormat, surface, z5, arrayListB) : null;
                if (mediaCodecA != null) {
                    return mediaCodecA;
                }
                throw new IllegalStateException("Try fallbackToGetCodecByType");
            } catch (IOException | IllegalStateException unused) {
                ArrayList arrayListB2 = b(z5, mediaFormat.getString("mime"), null);
                MediaCodec mediaCodecA2 = !arrayListB2.isEmpty() ? a(mediaFormat, surface, z5, arrayListB2) : null;
                if (mediaCodecA2 != null) {
                    return mediaCodecA2;
                }
                throw new rk.e(i7, mediaFormat, null);
            }
        } catch (IOException | IllegalStateException e10) {
            if (e10 instanceof IOException) {
                throw new rk.e(i10, mediaFormat, e10);
            }
            throw new rk.e(i11, mediaFormat, e10);
        }
        if (e10 instanceof IOException) {
            throw new rk.e(i10, mediaFormat, e10);
        }
        throw new rk.e(i11, mediaFormat, e10);
    }
}
