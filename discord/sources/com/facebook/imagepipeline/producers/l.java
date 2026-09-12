package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Executor executor, e4.e eVar, int i7) {
        super(executor, eVar);
        this.f5027c = i7;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final EncodedImage d(ImageRequest imageRequest) {
        boolean zEquals;
        byte[] bytes;
        switch (this.f5027c) {
            case 0:
                String string = imageRequest.getSourceUri().toString();
                n8.i.a(Boolean.valueOf(string.substring(0, 5).equals("data:")));
                int iIndexOf = string.indexOf(44);
                String strSubstring = string.substring(iIndexOf + 1, string.length());
                String strSubstring2 = string.substring(0, iIndexOf);
                if (strSubstring2.contains(";")) {
                    String[] strArrSplit = strSubstring2.split(";");
                    zEquals = strArrSplit[strArrSplit.length - 1].equals("base64");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    bytes = Base64.decode(strSubstring, 0);
                } else {
                    String strDecode = Uri.decode(strSubstring);
                    strDecode.getClass();
                    bytes = strDecode.getBytes();
                }
                return c(new ByteArrayInputStream(bytes), bytes.length);
            default:
                Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
                return c(new FileInputStream(imageRequest.getSourceFile().toString()), (int) imageRequest.getSourceFile().length());
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final String e() {
        switch (this.f5027c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }
}
