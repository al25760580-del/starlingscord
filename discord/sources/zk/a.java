package zk;

import android.hardware.HardwareBuffer;
import com.margelo.nitro.utils.HardwareBufferUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static HardwareBuffer a(HardwareBuffer hardwareBuffer) {
        Intrinsics.checkNotNullParameter(hardwareBuffer, "hardwareBuffer");
        Object objCopyHardwareBuffer = HardwareBufferUtils.copyHardwareBuffer(hardwareBuffer);
        Intrinsics.checkNotNull(objCopyHardwareBuffer, "null cannot be cast to non-null type android.hardware.HardwareBuffer");
        return (HardwareBuffer) objCopyHardwareBuffer;
    }
}
