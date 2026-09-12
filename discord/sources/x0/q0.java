package x0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.Person;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f22544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Person f22546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f22547d = new Bundle();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f22549f;

    public q0(CharSequence charSequence, long j, Person person) {
        this.f22544a = charSequence;
        this.f22545b = j;
        this.f22546c = person;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            q0 q0Var = (q0) arrayList.get(i7);
            Person person = q0Var.f22546c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = q0Var.f22544a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", q0Var.f22545b);
            if (person != null) {
                bundle.putCharSequence("sender", person.f1519a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", p0.a(m.h(person)));
                } else {
                    bundle.putBundle("person", person.b());
                }
            }
            String str = q0Var.f22548e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = q0Var.f22549f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = q0Var.f22547d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i7] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        Person personB;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                q0 q0Var = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            personB = Person.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            personB = m.b((android.app.Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            Person person = new Person();
                            person.f1519a = charSequence;
                            person.f1520b = null;
                            person.f1521c = null;
                            person.f1522d = null;
                            person.f1523e = false;
                            person.f1524f = false;
                            personB = person;
                        } else {
                            personB = null;
                        }
                        q0 q0Var2 = new q0(bundle.getCharSequence("text"), bundle.getLong("time"), personB);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            q0Var2.f22548e = string;
                            q0Var2.f22549f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            q0Var2.f22547d.putAll(bundle.getBundle("extras"));
                        }
                        q0Var = q0Var2;
                    }
                } catch (ClassCastException unused) {
                }
                if (q0Var != null) {
                    arrayList.add(q0Var);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i7 = Build.VERSION.SDK_INT;
        long j = this.f22545b;
        CharSequence charSequence = this.f22544a;
        Person person = this.f22546c;
        if (i7 >= 28) {
            messageA = p0.b(charSequence, j, person != null ? m.h(person) : null);
        } else {
            messageA = o0.a(charSequence, j, person != null ? person.f1519a : null);
        }
        String str = this.f22548e;
        if (str != null) {
            o0.b(messageA, str, this.f22549f);
        }
        return messageA;
    }
}
