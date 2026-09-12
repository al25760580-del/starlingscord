package qf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    a0 EF5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a0[] f18789d = {new a0("PUBLIC_KEY", 0)};

    @NonNull
    public static final Parcelable.Creator<a0> CREATOR = new jf.b(27);

    public static a0 a(String str) throws z {
        for (a0 a0Var : values()) {
            a0Var.getClass();
            if (str.equals("public-key")) {
                return a0Var;
            }
        }
        throw new z(s0.g.e("PublicKeyCredentialType ", str, " not supported"));
    }

    @NonNull
    public static a0 valueOf(@NonNull String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    @NonNull
    public static a0[] values() {
        return (a0[]) f18789d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString("public-key");
    }
}
