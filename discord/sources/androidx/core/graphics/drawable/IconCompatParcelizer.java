package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o3.a;
import o3.b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1560a = aVar.f(iconCompat.f1560a, 1);
        byte[] bArr = iconCompat.f1562c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f17109e;
            int i7 = parcel.readInt();
            if (i7 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i7];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1562c = bArr;
        iconCompat.f1563d = aVar.g(iconCompat.f1563d, 3);
        iconCompat.f1564e = aVar.f(iconCompat.f1564e, 4);
        iconCompat.f1565f = aVar.f(iconCompat.f1565f, 5);
        iconCompat.f1566g = (ColorStateList) aVar.g(iconCompat.f1566g, 6);
        String string = iconCompat.f1568i;
        if (aVar.e(7)) {
            string = ((b) aVar).f17109e.readString();
        }
        iconCompat.f1568i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f17109e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f1567h = PorterDuff.Mode.valueOf(iconCompat.f1568i);
        switch (iconCompat.f1560a) {
            case -1:
                Parcelable parcelable = iconCompat.f1563d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1561b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1563d;
                if (parcelable2 != null) {
                    iconCompat.f1561b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1562c;
                iconCompat.f1561b = bArr3;
                iconCompat.f1560a = 3;
                iconCompat.f1564e = 0;
                iconCompat.f1565f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1562c, Charset.forName("UTF-16"));
                iconCompat.f1561b = str;
                if (iconCompat.f1560a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1561b = iconCompat.f1562c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1568i = iconCompat.f1567h.name();
        switch (iconCompat.f1560a) {
            case -1:
                iconCompat.f1563d = (Parcelable) iconCompat.f1561b;
                break;
            case 1:
            case 5:
                iconCompat.f1563d = (Parcelable) iconCompat.f1561b;
                break;
            case 2:
                iconCompat.f1562c = ((String) iconCompat.f1561b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1562c = (byte[]) iconCompat.f1561b;
                break;
            case 4:
            case 6:
                iconCompat.f1562c = iconCompat.f1561b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f1560a;
        if (-1 != i7) {
            aVar.j(i7, 1);
        }
        byte[] bArr = iconCompat.f1562c;
        if (bArr != null) {
            aVar.i(2);
            Parcel parcel = ((b) aVar).f17109e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1563d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i10 = iconCompat.f1564e;
        if (i10 != 0) {
            aVar.j(i10, 4);
        }
        int i11 = iconCompat.f1565f;
        if (i11 != 0) {
            aVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f1566g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f1568i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f17109e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f17109e.writeString(str2);
        }
    }
}
