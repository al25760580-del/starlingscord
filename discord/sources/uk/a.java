package uk;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.linkedin.android.litr.io.MediaRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private final long duration;
    private final MediaExtractor mediaExtractor;
    private final MediaRange mediaRange;
    private int orientationHint;
    private long size;

    public a(Context context, Uri uri, MediaRange mediaRange) throws rk.b {
        StringBuilder sb2;
        this.mediaRange = mediaRange;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.mediaExtractor = mediaExtractor;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = null;
        try {
            mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
            mediaMetadataRetriever.setDataSource(context, uri);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
            if (strExtractMetadata != null) {
                this.orientationHint = Integer.parseInt(strExtractMetadata);
            }
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
            long length = -1;
            this.duration = strExtractMetadata2 != null ? Long.parseLong(strExtractMetadata2) : -1L;
            try {
                if ("content".equals(uri.getScheme())) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                        long statSize = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor().getStatSize() : 0L;
                        length = statSize >= 0 ? statSize : -1L;
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            try {
                                assetFileDescriptorOpenAssetFileDescriptor.close();
                            } catch (IOException e10) {
                                e = e10;
                                sb2 = new StringBuilder("Unable to close file descriptor from targetFile: ");
                                sb2.append(uri);
                                Log.e("m", sb2.toString(), e);
                            }
                        }
                    } catch (FileNotFoundException | IllegalStateException e11) {
                        Log.e("m", "Unable to extract length from targetFile: " + uri, e11);
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            try {
                                assetFileDescriptorOpenAssetFileDescriptor.close();
                            } catch (IOException e12) {
                                e = e12;
                                sb2 = new StringBuilder("Unable to close file descriptor from targetFile: ");
                                sb2.append(uri);
                                Log.e("m", sb2.toString(), e);
                            }
                        }
                    }
                } else if ("file".equals(uri.getScheme()) && uri.getPath() != null) {
                    length = new File(uri.getPath()).length();
                }
                this.size = length;
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (IOException e13) {
                        Log.e("m", "Unable to close file descriptor from targetFile: " + uri, e13);
                    }
                }
                throw th2;
            }
        } catch (IOException e14) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw new rk.b(uri, e14);
        }
    }

    public void advance() {
        this.mediaExtractor.advance();
    }

    public long getDuration() {
        return this.duration;
    }

    public int getOrientationHint() {
        return this.orientationHint;
    }

    public int getSampleFlags() {
        return this.mediaExtractor.getSampleFlags();
    }

    public long getSampleTime() {
        return this.mediaExtractor.getSampleTime();
    }

    public int getSampleTrackIndex() {
        return this.mediaExtractor.getSampleTrackIndex();
    }

    @NonNull
    public MediaRange getSelection() {
        return this.mediaRange;
    }

    public long getSize() {
        return this.size;
    }

    public int getTrackCount() {
        return this.mediaExtractor.getTrackCount();
    }

    @NonNull
    public MediaFormat getTrackFormat(int i7) {
        return this.mediaExtractor.getTrackFormat(i7);
    }

    public int readSampleData(@NonNull ByteBuffer byteBuffer, int i7) {
        return this.mediaExtractor.readSampleData(byteBuffer, i7);
    }

    public void release() {
        this.mediaExtractor.release();
    }

    public void seekTo(long j, int i7) {
        this.mediaExtractor.seekTo(j, i7);
    }

    public void selectTrack(int i7) {
        this.mediaExtractor.selectTrack(i7);
    }
}
