package c0;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kh.f;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f3407d = new f(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f3408e;

    static {
        a(1.0f);
        a(-1.0f);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        f3408e = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f2) {
        int i7;
        f3407d.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i10 = iFloatToRawIntBits >>> 31;
        int i11 = (iFloatToRawIntBits >>> 23) & 255;
        int i12 = 8388607 & iFloatToRawIntBits;
        int i13 = 31;
        int i14 = 0;
        if (i11 != 255) {
            int i15 = i11 - 112;
            if (i15 >= 31) {
                i13 = 49;
            } else {
                if (i15 > 0) {
                    i14 = i12 >> 13;
                    if ((iFloatToRawIntBits & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i7 = (((i15 << 10) | i14) + 1) | (i10 << 15);
                    } else {
                        i13 = i15;
                    }
                    return (short) i7;
                }
                if (i15 >= -10) {
                    int i16 = (8388608 | i12) >> (1 - i15);
                    if ((i16 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i16 += 8192;
                    }
                    i13 = 0;
                    i14 = i16 >> 13;
                } else {
                    i13 = 0;
                }
            }
        } else if (i12 != 0) {
            i14 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        i7 = (i10 << 15) | (i13 << 10) | i14;
        return (short) i7;
    }

    public static final float b(short s2) {
        int i7;
        int i10;
        int i11;
        int i12 = Short.MIN_VALUE & s2;
        int i13 = ((65535 & s2) >>> 10) & 31;
        int i14 = s2 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i7 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i7 = i13 + 112;
            }
            int i16 = i7;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - f3408e;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        int i17 = (i11 << 23) | (i12 << 16) | i10;
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i17);
    }
}
