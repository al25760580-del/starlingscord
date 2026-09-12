package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum q implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);


    @NonNull
    public static final Parcelable.Creator<q> CREATOR = new s0(21);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18855d;

    q(int i7) {
        this.f18855d = i7;
    }

    public static q a(int i7) throws p {
        for (q qVar : values()) {
            if (i7 == qVar.f18855d) {
                return qVar;
            }
        }
        Locale locale = Locale.US;
        throw new p(s0.g.d(i7, "Error code ", " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18855d);
    }
}
