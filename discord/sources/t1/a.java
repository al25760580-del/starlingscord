package t1;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;
import o1.h;
import o1.j;
import o1.l;
import o1.m;
import o1.o;
import o1.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static o1.d a(String str, String str2) {
        if (Intrinsics.areEqual(str, "CREATE_CANCELED")) {
            return new o1.b(str2);
        }
        return Intrinsics.areEqual(str, "CREATE_INTERRUPTED") ? new o1.e(str2) : new h(str2);
    }

    public static l b(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new q(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new m(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new j(str2);
            }
        }
        return new o(str2);
    }

    public static void c(ResultReceiver resultReceiver, String errName, String errMsg) {
        Intrinsics.checkNotNullParameter(resultReceiver, "<this>");
        Intrinsics.checkNotNullParameter(errName, "errName");
        Intrinsics.checkNotNullParameter(errMsg, "errMsg");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", errName);
        bundle.putString("EXCEPTION_MESSAGE", errMsg);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }

    public static void d(ResultReceiver resultReceiver, int i7, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(resultReceiver, "<this>");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i7);
        bundle.putParcelable("RESULT_DATA", intent);
        resultReceiver.send(i10, bundle);
    }
}
