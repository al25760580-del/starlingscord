package f;

import af.m;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new m(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Intent f8760e;

    public a(int i7, Intent intent) {
        this.f8759d = i7;
        this.f8760e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f8759d;
        if (i7 != -1) {
            strValueOf = i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb2.append(strValueOf);
        sb2.append(", data=");
        sb2.append(this.f8760e);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f8759d);
        Intent intent = this.f8760e;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i7);
        }
    }
}
