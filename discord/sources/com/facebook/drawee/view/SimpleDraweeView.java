package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import k9.b;
import n8.i;
import sa.a;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SimpleDraweeView extends b {
    private static Supplier sDraweecontrollerbuildersupplier;
    private AbstractDraweeControllerBuilder mControllerBuilder;

    public SimpleDraweeView(Context context) {
        super(context);
        inflateHierarchy(context, null);
        c(context, null);
    }

    public static void initialize(Supplier supplier) {
        sDraweecontrollerbuildersupplier = supplier;
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            a.w();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                i.d(sDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                this.mControllerBuilder = (AbstractDraweeControllerBuilder) sDraweecontrollerbuildersupplier.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9.a.f3083b);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(1)) {
                        setImageURI(Uri.parse(typedArrayObtainStyledAttributes.getString(1)), (Object) null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            a.w();
        } catch (Throwable th3) {
            a.w();
            throw th3;
        }
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public void setActualImageResource(int i7) {
        setActualImageResource(i7, null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.mControllerBuilder;
        abstractDraweeControllerBuilder.f4633b = imageRequest;
        abstractDraweeControllerBuilder.f4638g = getController();
        setController(abstractDraweeControllerBuilder.a());
    }

    @Override // k9.a, android.widget.ImageView
    public void setImageResource(int i7) {
        super.setImageResource(i7);
    }

    @Override // k9.a, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void setActualImageResource(int i7, Object obj) {
        Uri uri = v8.a.f21502a;
        setImageURI(new Uri.Builder().scheme("res").path(String.valueOf(i7)).build(), obj);
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public void setImageURI(Uri uri, Object obj) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.mControllerBuilder;
        abstractDraweeControllerBuilder.f4632a = obj;
        PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) abstractDraweeControllerBuilder;
        if (uri == null) {
            pipelineDraweeControllerBuilder.f4633b = null;
        } else {
            ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
            imageRequestBuilderD.f5130e = RotationOptions.f4821e;
            pipelineDraweeControllerBuilder.f4633b = imageRequestBuilderD.a();
        }
        pipelineDraweeControllerBuilder.f4638g = getController();
        setController(pipelineDraweeControllerBuilder.a());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
        c(context, attributeSet);
    }

    public void setImageURI(String str, Object obj) {
        setImageURI(str != null ? Uri.parse(str) : null, obj);
    }
}
