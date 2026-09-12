package org.webrtc;

import android.graphics.ImageFormat;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(ReactFontManager.TypefaceStyle.NORMAL, 240), new Size(DiscordVideoMediaSource.DEFAULT_HEIGHT, 320), new Size(DiscordVideoMediaSource.DEFAULT_WIDTH, 360), new Size(DiscordVideoMediaSource.DEFAULT_WIDTH, DiscordVideoMediaSource.DEFAULT_HEIGHT), new Size(768, DiscordVideoMediaSource.DEFAULT_HEIGHT), new Size(854, DiscordVideoMediaSource.DEFAULT_HEIGHT), new Size(800, 600), new Size(960, 540), new Size(960, DiscordVideoMediaSource.DEFAULT_WIDTH), new Size(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 576), new Size(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 600), new Size(1280, 720), new Size(1280, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)));
    private static final String TAG = "CameraEnumerationAndroid";

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i7, int i10) {
                this.min = i7;
                this.max = i10;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i7, int i10, int i11, int i12) {
            this.width = i7;
            this.height = i10;
            this.framerate = new FramerateRange(i11, i12);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            return this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate);
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return this.framerate.hashCode() + (((this.width * 65497) + this.height) * 251) + 1;
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + String.valueOf(this.framerate);
        }

        public static int frameSize(int i7, int i10, int i11) {
            if (i11 != 17) {
                throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
            }
            return (ImageFormat.getBitsPerPixel(i11) * (i7 * i10)) / 8;
        }

        public CaptureFormat(int i7, int i10, FramerateRange framerateRange) {
            this.width = i7;
            this.height = i10;
            this.framerate = framerateRange;
        }
    }

    public static abstract class ClosestComparator<T> implements Comparator<T> {
        public /* synthetic */ ClosestComparator(int i7) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(T t5, T t10) {
            return diff(t5) - diff(t10);
        }

        public abstract int diff(T t5);

        private ClosestComparator() {
        }
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i7) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: org.webrtc.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            private int progressivePenalty(int i10, int i11, int i12, int i13) {
                if (i10 < i11) {
                    return i10 * i12;
                }
                return ((i10 - i11) * i13) + (i12 * i11);
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, MIN_FPS_THRESHOLD, 1, 4) + progressivePenalty(Math.abs((i7 * 1000) - framerateRange.max), MAX_FPS_DIFF_THRESHOLD, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i7, final int i10) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: org.webrtc.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i10 - size.height) + Math.abs(i7 - size.width);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}
