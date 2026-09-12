package ne;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends RecyclerView.LayoutParams implements b {
    public static final Parcelable.Creator<e> CREATOR = new jf.b(7);
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f16573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16574y;

    public e(int i7) {
        super(-2, i7);
        this.f16572w = 0.0f;
        this.f16573x = 1.0f;
        this.f16574y = -1;
        this.E = -1.0f;
        this.H = 16777215;
        this.I = 16777215;
    }

    @Override // ne.b
    public final int c() {
        return this.f16574y;
    }

    @Override // ne.b
    public final float d() {
        return this.f16573x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ne.b
    public final int f() {
        return this.F;
    }

    @Override // ne.b
    public final void g(int i7) {
        this.F = i7;
    }

    @Override // ne.b
    public final int getHeight() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // ne.b
    public final int getOrder() {
        return 1;
    }

    @Override // ne.b
    public final int getWidth() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // ne.b
    public final int j() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // ne.b
    public final int k() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // ne.b
    public final int l() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // ne.b
    public final void m(int i7) {
        this.G = i7;
    }

    @Override // ne.b
    public final float n() {
        return this.f16572w;
    }

    @Override // ne.b
    public final float o() {
        return this.E;
    }

    @Override // ne.b
    public final int p() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // ne.b
    public final int q() {
        return this.G;
    }

    @Override // ne.b
    public final boolean r() {
        return this.J;
    }

    @Override // ne.b
    public final int s() {
        return this.I;
    }

    @Override // ne.b
    public final int u() {
        return this.H;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f16572w);
        parcel.writeFloat(this.f16573x);
        parcel.writeInt(this.f16574y);
        parcel.writeFloat(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeByte(this.J ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
