package ik;

import android.util.Log;
import com.facebook.datasource.DataSubscriber;
import com.henninghall.date_picker.pickers.AndroidNative;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11827d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11828e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11829i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11830v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f11831w;

    public b(AndroidNative androidNative, AndroidNative androidNative2, boolean z5, boolean z6) {
        this.f11831w = androidNative;
        this.f11830v = androidNative2;
        this.f11828e = z5;
        this.f11829i = z6;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[PHI: r0
      0x0062: PHI (r0v6 int) = (r0v3 int), (r0v4 int), (r0v5 int), (r0v10 int) binds: [B:26:0x0060, B:39:0x0088, B:35:0x007e, B:31:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        int value;
        int i7 = this.f11827d;
        boolean z5 = this.f11829i;
        boolean z6 = this.f11828e;
        Object obj = this.f11830v;
        Object obj2 = this.f11831w;
        switch (i7) {
            case 0:
                AndroidNative androidNative = (AndroidNative) obj2;
                AndroidNative androidNative2 = (AndroidNative) obj;
                int i10 = AndroidNative.M0;
                androidNative.getClass();
                int i11 = -1;
                try {
                    try {
                        try {
                            Method declaredMethod = androidNative.getClass().getSuperclass().getDeclaredMethod("changeValueByOne", Boolean.TYPE);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(androidNative2, Boolean.valueOf(z6));
                        } catch (IllegalAccessException e10) {
                            Log.w("changeValueByOne", e10);
                            value = androidNative.getValue();
                            if (z6) {
                                i11 = 1;
                            }
                            androidNative.setValue((value + i11) % androidNative.getMaxValue());
                        } catch (IllegalArgumentException e11) {
                            Log.w("changeValueByOne", e11);
                            value = androidNative.getValue();
                            if (z6) {
                                i11 = 1;
                            }
                            androidNative.setValue((value + i11) % androidNative.getMaxValue());
                        }
                        break;
                    } catch (NoSuchMethodException e12) {
                        Log.w("changeValueByOne", e12);
                        value = androidNative.getValue();
                        if (z6) {
                            i11 = 1;
                        }
                        androidNative.setValue((value + i11) % androidNative.getMaxValue());
                    } catch (InvocationTargetException e13) {
                        Log.w("changeValueByOne", e13);
                        value = androidNative.getValue();
                        if (z6) {
                            i11 = 1;
                        }
                        androidNative.setValue((value + i11) % androidNative.getMaxValue());
                    }
                    if (z5) {
                        androidNative.s();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    androidNative.setValue((androidNative.getValue() + (z6 ? 1 : -1)) % androidNative.getMaxValue());
                    throw th2;
                }
            default:
                x8.a aVar = (x8.a) obj2;
                DataSubscriber dataSubscriber = (DataSubscriber) obj;
                if (z6) {
                    dataSubscriber.onFailure(aVar);
                    return;
                } else if (z5) {
                    dataSubscriber.onCancellation(aVar);
                    return;
                } else {
                    dataSubscriber.onNewResult(aVar);
                    return;
                }
        }
    }

    public b(x8.a aVar, boolean z5, DataSubscriber dataSubscriber, boolean z6) {
        this.f11831w = aVar;
        this.f11828e = z5;
        this.f11830v = dataSubscriber;
        this.f11829i = z6;
    }
}
