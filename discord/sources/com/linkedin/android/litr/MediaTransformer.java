package com.linkedin.android.litr;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.e1;
import bd.d;
import com.discord.media.utils.Transcoder$convertCompress$3$2;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import m3.m;
import ok.b;
import org.webrtc.MediaStreamTrack;
import s0.g;
import uk.a;
import vk.e;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f6889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Looper f6890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6891d;

    public MediaTransformer(Context context) {
        Looper mainLooper = Looper.getMainLooper();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f6888a = context.getApplicationContext();
        this.f6891d = new HashMap(10);
        this.f6890c = mainLooper;
        this.f6889b = executorServiceNewSingleThreadExecutor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[RETURN] */
    public static boolean a(a aVar, int i7, String str) {
        if (str != null) {
            MediaFormat trackFormat = aVar.getTrackFormat(i7);
            switch (str) {
                case "video/hevc":
                case "video/avc":
                    if (trackFormat.containsKey("mime") && TextUtils.equals(trackFormat.getString("mime"), "audio/raw")) {
                        return true;
                    }
                    break;
                case "video/x-vnd.on2.vp8":
                case "video/x-vnd.on2.vp9":
                    if (trackFormat.containsKey("mime") && !TextUtils.equals(trackFormat.getString("mime"), "audio/opus") && !TextUtils.equals(trackFormat.getString("mime"), "audio/vorbis")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static boolean b(String str, boolean z5) {
        if (str != null) {
            return !z5 || str.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) || str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
        Log.e("MediaTransformer", "Mime type is null for track ");
        return false;
    }

    public final void c(String str, ArrayList arrayList, Transcoder$convertCompress$3$2 transcoder$convertCompress$3$2, int i7) {
        String str2;
        String string;
        int i10;
        String str3;
        e eVar;
        MediaFormat mediaFormat;
        MediaFormat mediaFormatCreateAudioFormat;
        String str4;
        HashMap map = this.f6891d;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(g.e("Request with id ", str, " already exists"));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
            if (i11 >= size) {
                string = null;
                break;
            }
            ok.a aVar = (ok.a) arrayList.get(i11);
            MediaFormat trackFormat = aVar.f17274a.getTrackFormat(aVar.f17280g);
            MediaFormat mediaFormat2 = aVar.f17279f;
            if (mediaFormat2 == null || !mediaFormat2.containsKey("mime") || !mediaFormat2.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                if (trackFormat.containsKey("mime") && trackFormat.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    string = trackFormat.getString("mime");
                    break;
                }
                i11++;
            } else {
                string = mediaFormat2.getString("mime");
                break;
            }
        }
        int i12 = 0;
        while (i12 < size) {
            ok.a aVar2 = (ok.a) arrayList.get(i12);
            MediaFormat mediaFormat3 = aVar2.f17279f;
            a aVar3 = aVar2.f17274a;
            int i13 = aVar2.f17280g;
            if (mediaFormat3 != null || (((eVar = aVar2.f17276c) == null || !eVar.a()) && !a(aVar3, i13, string))) {
                i10 = size;
                str3 = str2;
            } else {
                MediaFormat format = aVar3.getTrackFormat(i13);
                String string2 = format.containsKey("mime") ? format.getString("mime") : null;
                if (string2 != null) {
                    if (string2.startsWith(str2)) {
                        i10 = size;
                        str3 = str2;
                        mediaFormatCreateAudioFormat = MediaFormat.createVideoFormat(string2, format.getInteger("width"), format.getInteger("height"));
                        int iX = m.x(aVar3, i13);
                        if (iX <= 0) {
                            iX = 10000000;
                        }
                        mediaFormatCreateAudioFormat.setInteger("bitrate", iX);
                        mediaFormatCreateAudioFormat.setInteger("i-frame-interval", format.containsKey("i-frame-interval") ? format.getInteger("i-frame-interval") : 5);
                        Number defaultValue = 30;
                        Intrinsics.checkNotNullParameter(format, "format");
                        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
                        Number numberC = e1.c(format, "frame-rate");
                        defaultValue = numberC != null ? numberC : 30;
                        mediaFormatCreateAudioFormat.setInteger("frame-rate", defaultValue.intValue());
                    } else {
                        i10 = size;
                        str3 = str2;
                        if (string2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                            if (a(aVar3, i13, string)) {
                                string.getClass();
                                switch (string) {
                                    case "video/hevc":
                                    case "video/avc":
                                        str4 = "audio/mp4a-latm";
                                        string2 = str4;
                                        break;
                                    case "video/x-vnd.on2.vp8":
                                    case "video/x-vnd.on2.vp9":
                                        str4 = "audio/opus";
                                        string2 = str4;
                                        break;
                                    default:
                                        string2 = null;
                                        break;
                                }
                            }
                            mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(string2, format.getInteger("sample-rate"), format.getInteger("channel-count"));
                            mediaFormatCreateAudioFormat.setInteger("bitrate", format.containsKey("bitrate") ? format.getInteger("bitrate") : 256000);
                            if (format.containsKey("durationUs")) {
                                mediaFormatCreateAudioFormat.setLong("durationUs", format.getLong("durationUs"));
                            }
                        }
                        arrayList.set(i12, new ok.a(aVar2.f17280g, aVar2.f17281h, mediaFormat, aVar2.f17275b, aVar2.f17277d, aVar3, aVar2.f17278e, aVar2.f17276c));
                    }
                    mediaFormat = mediaFormatCreateAudioFormat;
                    arrayList.set(i12, new ok.a(aVar2.f17280g, aVar2.f17281h, mediaFormat, aVar2.f17275b, aVar2.f17277d, aVar3, aVar2.f17278e, aVar2.f17276c));
                } else {
                    i10 = size;
                    str3 = str2;
                }
                mediaFormat = null;
                arrayList.set(i12, new ok.a(aVar2.f17280g, aVar2.f17281h, mediaFormat, aVar2.f17275b, aVar2.f17277d, aVar3, aVar2.f17278e, aVar2.f17276c));
            }
            i12++;
            size = i10;
            str2 = str3;
        }
        r rVar = new r();
        rVar.f6612i = new Bundle();
        rVar.f6610d = map;
        rVar.f6611e = transcoder$convertCompress$3$2;
        Looper looper = this.f6890c;
        if (looper != null) {
            rVar.f6613v = new d(looper, transcoder$convertCompress$3$2);
        }
        map.put(str, this.f6889b.submit(new b(str, arrayList, i7, rVar)));
    }
}
