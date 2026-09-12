package ta;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20669a;

    public d(boolean z5) {
        this.f20669a = z5;
    }

    @Override // ta.b
    public final a createImageTranscoder(z9.c imageFormat, boolean z5) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        boolean z6 = this.f20669a;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(RecyclerView.ItemAnimator.FLAG_MOVED), Boolean.FALSE, Boolean.valueOf(z6));
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            a aVarCreateImageTranscoder = ((b) objNewInstance).createImageTranscoder(imageFormat, z5);
            if (aVarCreateImageTranscoder != null) {
                return aVarCreateImageTranscoder;
            }
            e eVar = new e(z5);
            Intrinsics.checkNotNullExpressionValue(eVar, "createImageTranscoder(...)");
            return eVar;
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e11);
        } catch (IllegalArgumentException e12) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e13);
        } catch (NoSuchMethodException e14) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e14);
        } catch (SecurityException e15) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e15);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e16);
        }
    }
}
