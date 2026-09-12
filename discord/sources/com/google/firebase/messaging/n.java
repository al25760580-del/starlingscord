package com.google.firebase.messaging;

import android.app.ApplicationExitInfo;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.shell.MainReactPackage;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements ig.a, sb.e, com.horcrux.svg.d, d0.h, QueueThreadExceptionHandler, gc.f, mi.e, Provider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6598d;

    public /* synthetic */ n(int i7) {
        this.f6598d = i7;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo c(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    @Override // mi.e
    public Object a(zl.e eVar) {
        Set setF = eVar.f(mi.q.a(fj.a.class));
        fj.c cVar = fj.c.f9265i;
        if (cVar == null) {
            synchronized (fj.c.class) {
                try {
                    cVar = fj.c.f9265i;
                    if (cVar == null) {
                        cVar = new fj.c(0);
                        fj.c.f9265i = cVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new fj.b(setF, cVar);
    }

    @Override // sb.e
    public Object apply(Object obj) {
        ej.e eVar = (ej.e) obj;
        n8.f fVar = q.f6607a;
        fVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fVar.O(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // gc.f
    public gc.g b(Bundle bundle) {
        switch (this.f6598d) {
            case 13:
                int i7 = bundle.getInt(fe.h.f9091v, -1);
                int[] intArray = bundle.getIntArray(fe.h.f9092w);
                int i10 = bundle.getInt(fe.h.f9093x, -1);
                je.b.g(i7 >= 0 && i10 >= 0);
                intArray.getClass();
                return new fe.h(i7, i10, intArray);
            default:
                Bundle bundle2 = bundle.getBundle(fe.s.f9117i);
                bundle2.getClass();
                x0 x0Var = (x0) x0.E.b(bundle2);
                int[] intArray2 = bundle.getIntArray(fe.s.f9118v);
                intArray2.getClass();
                return new fe.s(x0Var, intArray2.length == 0 ? Collections.EMPTY_LIST : new gi.a(0, intArray2.length, intArray2));
        }
    }

    @Override // ig.a
    public Object f(Task task) throws IOException {
        Bundle bundle = (Bundle) task.j();
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.f6598d) {
            case 17:
                return MainReactPackage.viewManagersMap$lambda$4();
            case 18:
                return MainReactPackage.viewManagersMap$lambda$5();
            case 19:
                return MainReactPackage.viewManagersMap$lambda$6();
            case 20:
                return MainReactPackage.viewManagersMap$lambda$7();
            case 21:
                return MainReactPackage.viewManagersMap$lambda$8();
            case 22:
                return MainReactPackage.viewManagersMap$lambda$9();
            case 23:
                return MainReactPackage.viewManagersMap$lambda$0();
            case 24:
                return MainReactPackage.viewManagersMap$lambda$10();
            case 25:
                return MainReactPackage.viewManagersMap$lambda$11();
            case 26:
                return MainReactPackage.viewManagersMap$lambda$12();
            case 27:
                return MainReactPackage.viewManagersMap$lambda$13();
            case 28:
                return MainReactPackage.viewManagersMap$lambda$14();
            default:
                return MainReactPackage.viewManagersMap$lambda$1();
        }
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public void handleException(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // d0.h
    public double invoke(double d6) {
        double d7;
        switch (this.f6598d) {
            case 4:
                double dPow = d6 < 0.0d ? -d6 : d6;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d7 = 0.9478672985781991d;
                } else {
                    d7 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d7, d6);
            case 5:
                double d8 = d6 < 0.0d ? -d6 : d6;
                return Math.copySign(d8 >= 0.04045d ? Math.pow((0.9478672985781991d * d8) + 0.05213270142180095d, 2.4d) : d8 * 0.07739938080495357d, d6);
            default:
                return d6;
        }
    }

    public /* synthetic */ n(af.c cVar) {
        this.f6598d = 0;
    }
}
