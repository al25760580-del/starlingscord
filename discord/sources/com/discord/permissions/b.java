package com.discord.permissions;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import il.e;
import il.f;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4543e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4544i;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f4542d = i7;
        this.f4543e = obj;
        this.f4544i = obj2;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        Long lValueOf;
        switch (this.f4542d) {
            case 0:
                NativePermissionPromise.generate$lambda$0((Function0) this.f4543e, (Function0) this.f4544i, objArr);
                break;
            default:
                e eVar = (e) this.f4543e;
                String str = (String) this.f4544i;
                f fVar = eVar.f11849c0;
                String str2 = (String) objArr[0];
                try {
                    Bitmap bitmapV = eVar.v(Uri.fromFile(new File(str2)));
                    long jLastModified = new File(str2).lastModified();
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(str2);
                        lValueOf = Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
                    } catch (Exception unused) {
                        lValueOf = -1L;
                    }
                    long jLongValue = lValueOf.longValue();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("width", bitmapV.getWidth());
                    writableNativeMap.putInt("height", bitmapV.getHeight());
                    writableNativeMap.putString("mime", str);
                    writableNativeMap.putInt("size", (int) new File(str2).length());
                    writableNativeMap.putInt("duration", (int) jLongValue);
                    writableNativeMap.putString("path", "file://" + str2);
                    writableNativeMap.putString("modificationDate", String.valueOf(jLastModified));
                    fVar.d(writableNativeMap);
                } catch (Exception e10) {
                    fVar.b("E_NO_IMAGE_DATA_FOUND", e10);
                }
                break;
        }
    }
}
