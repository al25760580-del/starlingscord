package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import hp.e;
import java.util.ArrayList;
import java.util.Iterator;
import x0.l0;
import x0.m;
import x0.m0;
import x0.n0;
import x0.q0;
import x0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$MessagingStyle extends v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1507e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1508f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Person f1509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f1511i;

    public NotificationCompat$MessagingStyle() {
    }

    @Override // x0.v0
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putCharSequence("android.selfDisplayName", this.f1509g.f1519a);
        bundle.putBundle("android.messagingStyleUser", this.f1509g.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.f1510h);
        if (this.f1510h != null && this.f1511i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.f1510h);
        }
        ArrayList arrayList = this.f1507e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", q0.a(arrayList));
        }
        ArrayList arrayList2 = this.f1508f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", q0.a(arrayList2));
        }
        Boolean bool = this.f1511i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // x0.v0
    public final void b(e eVar) {
        Notification.MessagingStyle messagingStyleB;
        NotificationCompat$Builder notificationCompat$Builder = this.f22571a;
        boolean zBooleanValue = false;
        if (notificationCompat$Builder == null || notificationCompat$Builder.f1483a.getApplicationInfo().targetSdkVersion >= 28 || this.f1511i != null) {
            Boolean bool = this.f1511i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.f1510h != null) {
            zBooleanValue = true;
        }
        this.f1511i = Boolean.valueOf(zBooleanValue);
        if (Build.VERSION.SDK_INT >= 28) {
            Person person = this.f1509g;
            person.getClass();
            messagingStyleB = n0.a(m.h(person));
        } else {
            messagingStyleB = l0.b(this.f1509g.f1519a);
        }
        Iterator it = this.f1507e.iterator();
        while (it.hasNext()) {
            l0.a(messagingStyleB, ((q0) it.next()).c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.f1508f.iterator();
            while (it2.hasNext()) {
                m0.a(messagingStyleB, ((q0) it2.next()).c());
            }
        }
        if (this.f1511i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            l0.c(messagingStyleB, this.f1510h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            n0.b(messagingStyleB, this.f1511i.booleanValue());
        }
        messagingStyleB.setBuilder((Notification.Builder) eVar.f10989i);
    }

    @Override // x0.v0
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    @Override // x0.v0
    public final String e() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // x0.v0
    public final void f(Bundle bundle) {
        super.f(bundle);
        ArrayList arrayList = this.f1507e;
        arrayList.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            this.f1509g = Person.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            Person person = new Person();
            person.f1519a = string;
            person.f1520b = null;
            person.f1521c = null;
            person.f1522d = null;
            person.f1523e = false;
            person.f1524f = false;
            this.f1509g = person;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.f1510h = charSequence;
        if (charSequence == null) {
            this.f1510h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(q0.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f1508f.addAll(q0.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.f1511i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public NotificationCompat$MessagingStyle(Person person) {
        if (!TextUtils.isEmpty(person.f1519a)) {
            this.f1509g = person;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
