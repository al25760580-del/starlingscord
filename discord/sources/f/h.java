package f;

import af.m;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new m(29);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IntentSender f8774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Intent f8775e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8776i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8777v;

    public h(IntentSender intentSender, Intent intent, int i7, int i10) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f8774d = intentSender;
        this.f8775e = intent;
        this.f8776i = i7;
        this.f8777v = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f8774d, i7);
        dest.writeParcelable(this.f8775e, i7);
        dest.writeInt(this.f8776i);
        dest.writeInt(this.f8777v);
    }
}
