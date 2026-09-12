package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.discord.R;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x0.a0;
import x0.b0;
import x0.c0;
import x0.d0;
import x0.f;
import x0.g;
import x0.m;
import x0.o;
import x0.p;
import x0.q;
import x0.r;
import x0.s;
import x0.t;
import x0.u;
import x0.v0;
import x0.z;
import y0.b;
import y0.e;
import yk.a;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$Builder {
    public final boolean A;
    public String B;
    public Bundle C;
    public int D;
    public int E;
    public final Notification F;
    public String G;
    public final int H;
    public String I;
    public e J;
    public final long K;
    public final boolean L;
    public final b0 M;
    public final Notification N;
    public boolean O;
    public final Icon P;
    public final ArrayList Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f1487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f1488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PendingIntent f1490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PendingIntent f1491i;
    public IconCompat j;
    public final CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v0 f1496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f1498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f1501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f1504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f1506z;

    public NotificationCompat$Builder(Context context, String str) {
        this.f1484b = new ArrayList();
        this.f1485c = new ArrayList();
        this.f1486d = new ArrayList();
        this.f1494n = true;
        this.f1505y = false;
        this.D = 0;
        this.E = 0;
        this.H = 0;
        Notification notification = new Notification();
        this.N = notification;
        this.f1483a = context;
        this.G = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f1493m = 0;
        this.Q = new ArrayList();
        this.L = true;
    }

    public static CharSequence e(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i7, PendingIntent pendingIntent, String str) {
        this.f1484b.add(new NotificationCompat$Action(i7 != 0 ? IconCompat.d(null, "", i7) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = this.C;
            if (bundle2 == null) {
                this.C = new Bundle(bundle);
            } else {
                bundle2.putAll(bundle);
            }
        }
    }

    public final Notification c() {
        Notification notificationBuild;
        Bundle bundle;
        hp.e eVar = new hp.e(this);
        NotificationCompat$Builder notificationCompat$Builder = (NotificationCompat$Builder) eVar.f10990v;
        v0 v0Var = notificationCompat$Builder.f1496p;
        if (v0Var != null) {
            v0Var.b(eVar);
        }
        Notification.Builder builder = (Notification.Builder) eVar.f10989i;
        int i7 = eVar.f10987d;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            if (i7 != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 && i7 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 && i7 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (v0Var != null) {
            notificationCompat$Builder.f1496p.getClass();
        }
        if (v0Var != null && (bundle = notificationBuild.extras) != null) {
            v0Var.a(bundle);
        }
        return notificationBuild;
    }

    public final Bundle d() {
        if (this.C == null) {
            this.C = new Bundle();
        }
        return this.C;
    }

    public final void f(int i7) {
        Notification notification = this.N;
        notification.defaults = i7;
        if ((i7 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void g(int i7, boolean z5) {
        Notification notification = this.N;
        if (z5) {
            notification.flags = i7 | notification.flags;
        } else {
            notification.flags = (~i7) & notification.flags;
        }
    }

    public final void h(Bitmap bitmap) {
        IconCompat iconCompatC;
        if (bitmap == null) {
            iconCompatC = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f1483a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatC = IconCompat.c(bitmap);
        }
        this.j = iconCompatC;
    }

    public final void i(int i7, int i10, int i11) {
        Notification notification = this.N;
        notification.ledARGB = i7;
        notification.ledOnMS = i10;
        notification.ledOffMS = i11;
        notification.flags = ((i10 == 0 || i11 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    public final void j(v0 v0Var) {
        if (this.f1496p != v0Var) {
            this.f1496p = v0Var;
            if (v0Var == null || v0Var.f22571a == this) {
                return;
            }
            v0Var.f22571a = this;
            j(v0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationCompat$Builder(Context context, Notification notification) {
        e eVar;
        b0 b0VarA;
        Bundle bundle;
        String str;
        String str2;
        String str3;
        ArrayList parcelableArrayList;
        Bundle bundle2;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        u uVar;
        Set<String> allowedDataTypes;
        Notification.BubbleMetadata bubbleMetadataC;
        LocusId locusIdE;
        int i7 = Build.VERSION.SDK_INT;
        this(context, i7 >= 26 ? notification.getChannelId() : null);
        Bundle bundle3 = notification.extras;
        v0 v0VarD = v0.d(notification);
        this.f1487e = e(notification.extras.getCharSequence("android.title"));
        this.f1488f = e(notification.extras.getCharSequence("android.text"));
        this.k = e(notification.extras.getCharSequence("android.infoText"));
        this.f1497q = e(notification.extras.getCharSequence("android.subText"));
        this.f1498r = e(i7 >= 26 ? notification.getSettingsText() : null);
        j(v0VarD);
        this.f1502v = notification.getGroup();
        this.f1503w = (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
        if (i7 < 29 || (locusIdE = g.e(notification)) == null) {
            eVar = null;
        } else {
            String strD = b.d(locusIdE);
            if (!TextUtils.isEmpty(strD)) {
                eVar = new e(strD);
            } else {
                throw new IllegalArgumentException("id cannot be empty");
            }
        }
        this.J = eVar;
        this.N.when = notification.when;
        this.f1494n = notification.extras.getBoolean("android.showWhen");
        this.f1495o = notification.extras.getBoolean("android.showChronometer");
        g(16, (notification.flags & 16) != 0);
        g(8, (notification.flags & 8) != 0);
        g(2, (notification.flags & 2) != 0);
        this.f1505y = (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0;
        h(notification.largeIcon);
        this.H = i7 >= 26 ? notification.getBadgeIconType() : 0;
        this.B = notification.category;
        if (i7 < 29 || (bubbleMetadataC = g.c(notification)) == null) {
            b0VarA = null;
        } else if (i7 >= 30) {
            b0VarA = a0.a(bubbleMetadataC);
        } else if (i7 == 29) {
            b0VarA = z.a(bubbleMetadataC);
        } else {
            b0VarA = null;
        }
        this.M = b0VarA;
        this.f1492l = notification.number;
        this.N.tickerText = e(notification.tickerText);
        this.f1490h = notification.contentIntent;
        this.N.deleteIntent = notification.deleteIntent;
        PendingIntent pendingIntent = notification.fullScreenIntent;
        boolean z5 = (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
        this.f1491i = pendingIntent;
        g(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, z5);
        Uri uri = notification.sound;
        int i10 = notification.audioStreamType;
        Notification notification2 = this.N;
        notification2.sound = uri;
        notification2.audioStreamType = i10;
        notification2.audioAttributes = c0.a(c0.d(c0.c(c0.b(), 4), i10));
        this.N.vibrate = notification.vibrate;
        i(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        f(notification.defaults);
        this.f1493m = notification.priority;
        this.D = notification.color;
        this.E = notification.visibility;
        this.F = notification.publicVersion;
        this.f1504x = notification.getSortKey();
        this.K = i7 >= 26 ? notification.getTimeoutAfter() : 0L;
        this.I = i7 >= 26 ? notification.getShortcutId() : null;
        int i11 = bundle3.getInt("android.progressMax");
        int i12 = bundle3.getInt("android.progress");
        boolean z6 = bundle3.getBoolean("android.progressIndeterminate");
        this.f1499s = i11;
        this.f1500t = i12;
        this.f1501u = z6;
        this.L = i7 >= 29 ? g.b(notification) : false;
        int i13 = notification.icon;
        int i14 = notification.iconLevel;
        Notification notification3 = this.N;
        notification3.icon = i13;
        notification3.iconLevel = i14;
        if (notification.extras == null) {
            str2 = "android.car.EXTENSIONS";
            str = "android.people";
            str3 = "invisible_actions";
            bundle = null;
        } else {
            bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            if (i7 >= 36) {
                bundle.remove("android.shortCriticalText");
            }
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            str = "android.people";
            bundle.remove(str);
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            str2 = "android.car.EXTENSIONS";
            Bundle bundle4 = bundle.getBundle(str2);
            if (bundle4 != null) {
                Bundle bundle5 = new Bundle(bundle4);
                str3 = "invisible_actions";
                bundle5.remove(str3);
                bundle.putBundle(str2, bundle5);
            } else {
                str3 = "invisible_actions";
            }
            if (v0VarD != null) {
                v0VarD.c(bundle);
            }
        }
        b(bundle);
        this.P = d0.b(notification);
        Icon iconA = d0.a(notification);
        if (iconA != null) {
            PorterDuff.Mode mode = IconCompat.k;
            this.j = a.i(iconA);
        }
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null && actionArr.length != 0) {
            int length = actionArr.length;
            int i15 = 0;
            while (i15 < length) {
                Notification.Action action = actionArr[i15];
                if (p.a(action) != null) {
                    Icon iconA2 = p.a(action);
                    PorterDuff.Mode mode2 = IconCompat.k;
                    uVar = new u((a.v(iconA2) == 2 && a.s(iconA2) == 0) ? null : a.i(iconA2), action.title, action.actionIntent);
                } else {
                    uVar = new u(action.icon, action.title, action.actionIntent);
                }
                android.app.RemoteInput[] remoteInputArrB = o.b(action);
                if (remoteInputArrB != null && remoteInputArrB.length != 0) {
                    int length2 = remoteInputArrB.length;
                    int i16 = 0;
                    while (i16 < length2) {
                        android.app.RemoteInput remoteInput = remoteInputArrB[i16];
                        String resultKey = remoteInput.getResultKey();
                        android.app.RemoteInput[] remoteInputArr = remoteInputArrB;
                        HashSet hashSet = new HashSet();
                        int i17 = length2;
                        Bundle bundle6 = new Bundle();
                        if (resultKey != null) {
                            CharSequence label = remoteInput.getLabel();
                            CharSequence[] choices = remoteInput.getChoices();
                            boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                            int i18 = length;
                            Bundle extras = remoteInput.getExtras();
                            if (extras != null) {
                                bundle6.putAll(extras);
                            }
                            if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = remoteInput.getAllowedDataTypes()) != null) {
                                Iterator<String> it = allowedDataTypes.iterator();
                                while (it.hasNext()) {
                                    hashSet.add(it.next());
                                }
                            }
                            RemoteInput remoteInput2 = new RemoteInput(resultKey, label, choices, allowFreeFormInput, Build.VERSION.SDK_INT >= 29 ? g.d(remoteInput) : 0, bundle6, hashSet);
                            if (uVar.f22561f == null) {
                                uVar.f22561f = new ArrayList();
                            }
                            uVar.f22561f.add(remoteInput2);
                            i16++;
                            remoteInputArrB = remoteInputArr;
                            length2 = i17;
                            length = i18;
                        } else {
                            throw new IllegalArgumentException("Result key can't be null");
                        }
                    }
                }
                int i19 = length;
                int i20 = Build.VERSION.SDK_INT;
                uVar.f22559d = q.a(action);
                if (i20 >= 28) {
                    uVar.f22562g = r.a(action);
                }
                if (i20 >= 29) {
                    uVar.f22564i = s.a(action);
                }
                if (i20 >= 31) {
                    uVar.j = t.a(action);
                }
                Bundle bundleA = o.a(action);
                if (bundleA != null) {
                    uVar.f22560e.putAll(bundleA);
                }
                this.f1484b.add(uVar.a());
                i15++;
                actionArr = actionArr;
                length = i19;
            }
        }
        ArrayList<NotificationCompat$Action> arrayList = new ArrayList();
        Bundle bundle7 = notification.extras.getBundle(str2);
        if (bundle7 != null && (bundle2 = bundle7.getBundle(str3)) != null) {
            for (int i21 = 0; i21 < bundle2.size(); i21++) {
                Bundle bundle8 = bundle2.getBundle(Integer.toString(i21));
                Bundle bundle9 = bundle8.getBundle("extras");
                boolean z7 = bundle9 != null ? bundle9.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i22 = bundle8.getInt("icon");
                CharSequence charSequence = bundle8.getCharSequence(AlertFragment.ARG_TITLE);
                PendingIntent pendingIntent2 = (PendingIntent) bundle8.getParcelable("actionIntent");
                Bundle bundle10 = bundle8.getBundle("extras");
                Parcelable[] parcelableArray = bundle8.getParcelableArray("remoteInputs");
                if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
                    bundle8.putParcelableArray("remoteInputs", bundleArr);
                } else {
                    bundleArr = (Bundle[]) parcelableArray;
                }
                RemoteInput[] remoteInputArrA = f.a(bundleArr);
                Parcelable[] parcelableArray2 = bundle8.getParcelableArray("dataOnlyRemoteInputs");
                if (!(parcelableArray2 instanceof Bundle[]) && parcelableArray2 != null) {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle8.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                } else {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                }
                arrayList.add(new NotificationCompat$Action(i22 == 0 ? null : IconCompat.d(null, "", i22), charSequence, pendingIntent2, bundle10, remoteInputArrA, f.a(bundleArr2), z7, bundle8.getInt("semanticAction"), bundle8.getBoolean("showsUserInterface"), false, false));
            }
        }
        if (!arrayList.isEmpty()) {
            for (NotificationCompat$Action notificationCompat$Action : arrayList) {
                if (notificationCompat$Action != null) {
                    this.f1486d.add(notificationCompat$Action);
                }
            }
        }
        String[] stringArray = notification.extras.getStringArray(str);
        if (stringArray != null && stringArray.length != 0) {
            for (String str4 : stringArray) {
                if (str4 != null && !str4.isEmpty()) {
                    this.Q.add(str4);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list")) != null && !parcelableArrayList.isEmpty()) {
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                this.f1485c.add(m.b(vd.a.e(it2.next())));
            }
        }
        int i23 = Build.VERSION.SDK_INT;
        if (bundle3.containsKey("android.chronometerCountDown")) {
            d().putBoolean("android.chronometerCountDown", bundle3.getBoolean("android.chronometerCountDown"));
        }
        if (i23 >= 26 && bundle3.containsKey("android.colorized")) {
            this.f1506z = bundle3.getBoolean("android.colorized");
            this.A = true;
        }
        if (i23 < 36 || !bundle3.containsKey("android.shortCriticalText")) {
            return;
        }
        String string = bundle3.getString("android.shortCriticalText");
        this.f1489g = string;
        if (i23 < 36) {
            d().putString("android.shortCriticalText", string);
        }
    }
}
