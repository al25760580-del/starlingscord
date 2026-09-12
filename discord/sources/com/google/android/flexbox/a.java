package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
        layoutParams.f5876d = 1;
        layoutParams.f5877e = 0.0f;
        layoutParams.f5878i = 1.0f;
        layoutParams.f5879v = -1;
        layoutParams.f5880w = -1.0f;
        layoutParams.f5881x = -1;
        layoutParams.f5882y = -1;
        layoutParams.E = 16777215;
        layoutParams.F = 16777215;
        layoutParams.f5876d = parcel.readInt();
        layoutParams.f5877e = parcel.readFloat();
        layoutParams.f5878i = parcel.readFloat();
        layoutParams.f5879v = parcel.readInt();
        layoutParams.f5880w = parcel.readFloat();
        layoutParams.f5881x = parcel.readInt();
        layoutParams.f5882y = parcel.readInt();
        layoutParams.E = parcel.readInt();
        layoutParams.F = parcel.readInt();
        layoutParams.G = parcel.readByte() != 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
        return layoutParams;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new FlexboxLayout.LayoutParams[i7];
    }
}
