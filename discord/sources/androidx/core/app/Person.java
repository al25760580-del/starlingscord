package androidx.core.app;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Person {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f1519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f1520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1524f;

    public static Person a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence(StackTraceHelper.NAME_KEY);
        IconCompat iconCompatA = bundle2 != null ? IconCompat.a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z5 = bundle.getBoolean("isBot");
        boolean z6 = bundle.getBoolean("isImportant");
        Person person = new Person();
        person.f1519a = charSequence;
        person.f1520b = iconCompatA;
        person.f1521c = string;
        person.f1522d = string2;
        person.f1523e = z5;
        person.f1524f = z6;
        return person;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence(StackTraceHelper.NAME_KEY, this.f1519a);
        IconCompat iconCompat = this.f1520b;
        if (iconCompat != null) {
            bundle = new Bundle();
            switch (iconCompat.f1560a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.f1561b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.f1561b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.f1561b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.f1561b);
                    break;
            }
            bundle.putInt("type", iconCompat.f1560a);
            bundle.putInt("int1", iconCompat.f1564e);
            bundle.putInt("int2", iconCompat.f1565f);
            bundle.putString("string1", iconCompat.j);
            ColorStateList colorStateList = iconCompat.f1566g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1567h;
            if (mode != IconCompat.k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.f1521c);
        bundle2.putString("key", this.f1522d);
        bundle2.putBoolean("isBot", this.f1523e);
        bundle2.putBoolean("isImportant", this.f1524f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String str = this.f1522d;
        String str2 = person.f1522d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f1519a), Objects.toString(person.f1519a)) && Objects.equals(this.f1521c, person.f1521c) && Boolean.valueOf(this.f1523e).equals(Boolean.valueOf(person.f1523e)) && Boolean.valueOf(this.f1524f).equals(Boolean.valueOf(person.f1524f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f1522d;
        return str != null ? str.hashCode() : Objects.hash(this.f1519a, this.f1521c, Boolean.valueOf(this.f1523e), Boolean.valueOf(this.f1524f));
    }
}
