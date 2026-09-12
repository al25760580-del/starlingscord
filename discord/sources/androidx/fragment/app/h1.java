package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Parcelable {
    public static final Parcelable.Creator<h1> CREATOR = new af.m(18);
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final int I;
    public final String J;
    public final int K;
    public final boolean L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2154e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2155i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2156v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2159y;

    public h1(Fragment fragment) {
        this.f2153d = fragment.getClass().getName();
        this.f2154e = fragment.mWho;
        this.f2155i = fragment.mFromLayout;
        this.f2156v = fragment.mInDynamicContainer;
        this.f2157w = fragment.mFragmentId;
        this.f2158x = fragment.mContainerId;
        this.f2159y = fragment.mTag;
        this.E = fragment.mRetainInstance;
        this.F = fragment.mRemoving;
        this.G = fragment.mDetached;
        this.H = fragment.mHidden;
        this.I = fragment.mMaxState.ordinal();
        this.J = fragment.mTargetWho;
        this.K = fragment.mTargetRequestCode;
        this.L = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb2.append("FragmentState{");
        sb2.append(this.f2153d);
        sb2.append(" (");
        sb2.append(this.f2154e);
        sb2.append(")}:");
        if (this.f2155i) {
            sb2.append(" fromLayout");
        }
        if (this.f2156v) {
            sb2.append(" dynamicContainer");
        }
        int i7 = this.f2158x;
        if (i7 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i7));
        }
        String str = this.f2159y;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.E) {
            sb2.append(" retainInstance");
        }
        if (this.F) {
            sb2.append(" removing");
        }
        if (this.G) {
            sb2.append(" detached");
        }
        if (this.H) {
            sb2.append(" hidden");
        }
        String str2 = this.J;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.K);
        }
        if (this.L) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2153d);
        parcel.writeString(this.f2154e);
        parcel.writeInt(this.f2155i ? 1 : 0);
        parcel.writeInt(this.f2156v ? 1 : 0);
        parcel.writeInt(this.f2157w);
        parcel.writeInt(this.f2158x);
        parcel.writeString(this.f2159y);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L ? 1 : 0);
    }

    public h1(Parcel parcel) {
        this.f2153d = parcel.readString();
        this.f2154e = parcel.readString();
        this.f2155i = parcel.readInt() != 0;
        this.f2156v = parcel.readInt() != 0;
        this.f2157w = parcel.readInt();
        this.f2158x = parcel.readInt();
        this.f2159y = parcel.readString();
        this.E = parcel.readInt() != 0;
        this.F = parcel.readInt() != 0;
        this.G = parcel.readInt() != 0;
        this.H = parcel.readInt() != 0;
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt() != 0;
    }
}
