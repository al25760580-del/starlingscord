package x0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Person f22531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f22532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f22533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PendingIntent f22534i;
    public boolean j;
    public Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f22535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IconCompat f22536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f22537n;

    @Override // x0.v0
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", this.f22530e);
        bundle.putBoolean("android.callIsVideo", this.j);
        Person person = this.f22531f;
        if (person != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", g0.b(m.h(person)));
            } else {
                bundle.putParcelable("android.callPersonCompat", person.b());
            }
        }
        IconCompat iconCompat = this.f22536m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", f0.a(iconCompat.i(this.f22571a.f1483a)));
        }
        bundle.putCharSequence("android.verificationText", this.f22537n);
        bundle.putParcelable("android.answerIntent", this.f22532g);
        bundle.putParcelable("android.declineIntent", this.f22533h);
        bundle.putParcelable("android.hangUpIntent", this.f22534i);
        Integer num = this.k;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f22535l;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    @Override // x0.v0
    public final void b(hp.e eVar) {
        Notification.Builder builder = (Notification.Builder) eVar.f10989i;
        int i7 = Build.VERSION.SDK_INT;
        String string = null;
        callStyleA = null;
        Notification.CallStyle callStyleA = null;
        if (i7 < 31) {
            Person person = this.f22531f;
            builder.setContentTitle(person != null ? person.f1519a : null);
            Bundle bundle = this.f22571a.C;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f22571a.C.getCharSequence("android.text");
            if (charSequence == null) {
                int i10 = this.f22530e;
                if (i10 == 1) {
                    string = this.f22571a.f1483a.getResources().getString(R.string.call_notification_incoming_text);
                } else if (i10 == 2) {
                    string = this.f22571a.f1483a.getResources().getString(R.string.call_notification_ongoing_text);
                } else if (i10 == 3) {
                    string = this.f22571a.f1483a.getResources().getString(R.string.call_notification_screening_text);
                }
                charSequence = string;
            }
            builder.setContentText(charSequence);
            Person person2 = this.f22531f;
            if (person2 != null) {
                IconCompat iconCompat = person2.f1520b;
                if (iconCompat != null) {
                    f0.b(builder, iconCompat.i(this.f22571a.f1483a));
                }
                if (i7 >= 28) {
                    Person person3 = this.f22531f;
                    person3.getClass();
                    g0.a(builder, m.h(person3));
                } else {
                    e0.a(builder, this.f22531f.f1521c);
                }
            }
            e0.b(builder, "call");
            return;
        }
        int i11 = this.f22530e;
        if (i11 == 1) {
            Person person4 = this.f22531f;
            person4.getClass();
            callStyleA = h0.a(m.h(person4), this.f22533h, this.f22532g);
        } else if (i11 == 2) {
            Person person5 = this.f22531f;
            person5.getClass();
            callStyleA = h0.b(m.h(person5), this.f22534i);
        } else if (i11 == 3) {
            Person person6 = this.f22531f;
            person6.getClass();
            callStyleA = h0.c(m.h(person6), this.f22534i, this.f22532g);
        } else if (Log.isLoggable("NotifCompat", 3)) {
            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f22530e));
        }
        if (callStyleA != null) {
            callStyleA.setBuilder(builder);
            Integer num = this.k;
            if (num != null) {
                h0.d(callStyleA, num.intValue());
            }
            Integer num2 = this.f22535l;
            if (num2 != null) {
                h0.e(callStyleA, num2.intValue());
            }
            h0.h(callStyleA, this.f22537n);
            IconCompat iconCompat2 = this.f22536m;
            if (iconCompat2 != null) {
                h0.g(callStyleA, iconCompat2.i(this.f22571a.f1483a));
            }
            h0.f(callStyleA, this.j);
        }
    }

    @Override // x0.v0
    public final String e() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    @Override // x0.v0
    public final void f(Bundle bundle) {
        super.f(bundle);
        this.f22530e = bundle.getInt("android.callType");
        this.j = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.f22531f = m.b(vd.a.e(bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.f22531f = Person.a(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            Icon icon = (Icon) bundle.getParcelable("android.verificationIcon");
            PorterDuff.Mode mode = IconCompat.k;
            this.f22536m = yk.a.i(icon);
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.f22536m = IconCompat.a(bundle.getBundle("android.verificationIconCompat"));
        }
        this.f22537n = bundle.getCharSequence("android.verificationText");
        this.f22532g = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.f22533h = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.f22534i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f22535l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final NotificationCompat$Action g(int i7, int i10, Integer num, int i11, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.f22571a.f1483a.getColor(i11));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f22571a.f1483a.getResources().getString(i10));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = this.f22571a.f1483a;
        PorterDuff.Mode mode = IconCompat.k;
        context.getClass();
        NotificationCompat$Action notificationCompat$ActionA = new u(IconCompat.d(context.getResources(), context.getPackageName(), i7), spannableStringBuilder, pendingIntent).a();
        notificationCompat$ActionA.f1474a.putBoolean("key_action_priority", true);
        return notificationCompat$ActionA;
    }
}
