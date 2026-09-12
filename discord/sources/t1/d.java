package t1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import n1.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20573a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f20574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20576d = 0;

    static {
        Integer[] elements = {7, 20};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f20574b = y.J(elements);
        f20575c = 1;
    }

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(ResultReceiver resultReceiver, Intent hiddenIntent, String typeTag) {
        Intrinsics.checkNotNullParameter(resultReceiver, "resultReceiver");
        Intrinsics.checkNotNullParameter(hiddenIntent, "hiddenIntent");
        Intrinsics.checkNotNullParameter(typeTag, "typeTag");
        hiddenIntent.putExtra("TYPE", typeTag);
        hiddenIntent.putExtra("ACTIVITY_REQUEST_CODE", f20575c);
        hiddenIntent.putExtra("RESULT_RECEIVER", d(resultReceiver));
        hiddenIntent.setFlags(65536);
    }

    public static boolean b(Bundle resultData, Function2 conversionFn, Executor executor, h callback, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(conversionFn, "conversionFn");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!resultData.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        c.a(cancellationSignal, new com.discord.chat.presentation.list.delegate.c(executor, callback, conversionFn.invoke(resultData.getString("EXCEPTION_TYPE"), resultData.getString("EXCEPTION_MESSAGE")), 6));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, o1.h] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, o1.b] */
    public static final boolean c(int i7, Function2 cancelOnError, Function1 onError, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (i7 == -1) {
            return false;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new o1.h(s0.g.d(i7, "activity with result code: ", " indicating not RESULT_OK"));
        if (i7 == 0) {
            objectRef.element = new o1.b("activity is cancelled by the user.");
        }
        cancelOnError.invoke(cancellationSignal, new b(onError, objectRef, 0));
        return true;
    }

    public static ResultReceiver d(ResultReceiver resultReceiver) {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        Intrinsics.checkNotNull(resultReceiver);
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }
}
