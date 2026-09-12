package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentResolver f5011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Executor executor, e4.e pooledByteBufferFactory, ContentResolver contentResolver, int i7) {
        super(executor, pooledByteBufferFactory);
        this.f5010c = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(executor, "executor");
                Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
                super(executor, pooledByteBufferFactory);
                this.f5011d = contentResolver;
                break;
            default:
                Intrinsics.checkNotNullParameter(executor, "executor");
                Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
                Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
                this.f5011d = contentResolver;
                break;
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final EncodedImage d(ImageRequest imageRequest) throws IOException {
        EncodedImage encodedImage;
        InputStream inputStreamCreateInputStream;
        int i7 = this.f5010c;
        ContentResolver contentResolver = this.f5011d;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        switch (i7) {
            case 0:
                Uri sourceUri = imageRequest.getSourceUri();
                Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
                Uri uri = v8.a.f21502a;
                if (sourceUri.getPath() == null || !"content".equals(v8.a.b(sourceUri)) || !"com.android.contacts".equals(sourceUri.getAuthority()) || sourceUri.getPath().startsWith(v8.a.f21502a.getPath())) {
                    String string = sourceUri.toString();
                    if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(sourceUri, "r");
                            if (parcelFileDescriptorOpenFileDescriptor == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            EncodedImage encodedImageC = c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                            Intrinsics.checkNotNullExpressionValue(encodedImageC, "getEncodedImage(...)");
                            parcelFileDescriptorOpenFileDescriptor.close();
                            encodedImage = encodedImageC;
                            if (encodedImage != null) {
                                return encodedImage;
                            }
                        } catch (FileNotFoundException unused) {
                            encodedImage = null;
                        }
                    }
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(sourceUri);
                    if (inputStreamOpenInputStream != null) {
                        return c(inputStreamOpenInputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                String string2 = sourceUri.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                if (kotlin.text.x.h(string2, "/photo", false)) {
                    inputStreamCreateInputStream = contentResolver.openInputStream(sourceUri);
                } else {
                    String string3 = sourceUri.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    if (kotlin.text.x.h(string3, "/display_photo", false)) {
                        try {
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(sourceUri, "r");
                            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                        } catch (IOException unused2) {
                            throw new IOException("Contact photo does not exist: " + sourceUri);
                        }
                    } else {
                        InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, sourceUri);
                        if (inputStreamOpenContactPhotoInputStream == null) {
                            throw new IOException("Contact photo does not exist: " + sourceUri);
                        }
                        inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
                    }
                }
                if (inputStreamCreateInputStream != null) {
                    return c(inputStreamCreateInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.");
            default:
                InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(imageRequest.getSourceUri());
                if (inputStreamOpenInputStream2 == null) {
                    throw new IllegalStateException("ContentResolver returned null InputStream");
                }
                EncodedImage encodedImageC2 = c(inputStreamOpenInputStream2, -1);
                Intrinsics.checkNotNullExpressionValue(encodedImageC2, "getEncodedImage(...)");
                return encodedImageC2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public final String e() {
        switch (this.f5010c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
