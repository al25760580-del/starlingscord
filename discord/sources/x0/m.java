package x0;

import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static androidx.core.app.Person b(Person person) {
        IconCompat iconCompatI;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatI = yk.a.i(icon);
        } else {
            iconCompatI = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        androidx.core.app.Person person2 = new androidx.core.app.Person();
        person2.f1519a = name;
        person2.f1520b = iconCompatI;
        person2.f1521c = uri;
        person2.f1522d = key;
        person2.f1523e = zIsBot;
        person2.f1524f = zIsImportant;
        return person2;
    }

    public static String c(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getDescription();
    }

    public static NotificationChannelGroup d(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannelGroup(str);
    }

    public static boolean e(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.isBlocked();
    }

    public static void f(NotificationChannelGroup notificationChannelGroup, String str) {
        notificationChannelGroup.setDescription(str);
    }

    public static void g(Notification.Action.Builder builder, int i7) {
        builder.setSemanticAction(i7);
    }

    public static Person h(androidx.core.app.Person person) {
        Person.Builder name = new Person.Builder().setName(person.f1519a);
        IconCompat iconCompat = person.f1520b;
        return name.setIcon(iconCompat != null ? iconCompat.i(null) : null).setUri(person.f1521c).setKey(person.f1522d).setBot(person.f1523e).setImportant(person.f1524f).build();
    }
}
