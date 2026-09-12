package hp;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import bp.c0;
import com.discord.R;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import e4.i;
import e4.m;
import e4.p;
import fk.n;
import i1.g;
import ic.n0;
import ip.g0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import je.b0;
import je.h;
import je.v;
import je.w;
import kotlin.jvm.internal.Intrinsics;
import kq.j;
import kq.l;
import vo.r0;
import x0.a0;
import x0.i0;
import x0.k;
import x0.v0;
import x0.w0;
import x0.x0;
import zc.d0;
import zc.e0;
import zc.z;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f, z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10988e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f10989i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f10990v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f10991w;

    public e(kk.c cVar, p pVar, m mVar, n nVar) {
        this.f10991w = new HashSet();
        this.f10988e = cVar;
        this.f10990v = mVar;
        this.f10989i = pVar;
    }

    public static void e(int i7, int i10, String str) throws h {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        je.b.i(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i7, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        je.b.h();
    }

    @Override // hp.f
    public r0 a(c0 javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        g0 g0Var = (g0) ((j) this.f10991w).invoke(javaTypeParameter);
        return g0Var != null ? g0Var : ((f) ((i) this.f10988e).f7981i).a(javaTypeParameter);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    @Override // zc.z
    public void c(w wVar) {
        b0 b0Var;
        SparseArray sparseArray;
        b0 b0Var2;
        int i7;
        int i10;
        char c8;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f10989i;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f10990v;
        v vVar = (v) this.f10988e;
        zc.b0 b0Var3 = (zc.b0) this.f10991w;
        SparseArray sparseArray4 = b0Var3.f23663f;
        SparseBooleanArray sparseBooleanArray = b0Var3.f23664g;
        g gVar = b0Var3.f23662e;
        List list = b0Var3.f23659b;
        int i11 = b0Var3.f23658a;
        if (wVar.u() != 2) {
            return;
        }
        if (i11 == 1 || i11 == 2 || b0Var3.f23667l == 1) {
            b0Var = (b0) list.get(0);
        } else {
            b0Var = new b0(((b0) list.get(0)).c());
            list.add(b0Var);
        }
        if ((wVar.u() & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            return;
        }
        wVar.G(1);
        int iZ = wVar.z();
        wVar.G(3);
        wVar.e(vVar.f13853b, 0, 2);
        vVar.p(0);
        vVar.s(3);
        b0Var3.f23673r = vVar.i(13);
        wVar.e(vVar.f13853b, 0, 2);
        vVar.p(0);
        vVar.s(4);
        wVar.G(vVar.i(12));
        if (i11 == 2 && b0Var3.f23671p == null) {
            e0 e0VarA = gVar.a(21, new n8.f(21, (String) null, (ArrayList) null, je.e0.f13793f));
            b0Var3.f23671p = e0VarA;
            if (e0VarA != null) {
                e0VarA.b(b0Var, b0Var3.k, new d0(iZ, 21, 8192));
            }
        }
        sparseArray3.clear();
        sparseIntArray.clear();
        int iA = wVar.a();
        while (iA > 0) {
            wVar.e(vVar.f13853b, 0, 5);
            vVar.p(0);
            int i12 = vVar.i(8);
            vVar.s(3);
            int i13 = vVar.i(13);
            vVar.s(4);
            int i14 = vVar.i(12);
            int i15 = wVar.f13861b;
            int i16 = i15 + i14;
            int i17 = iA;
            SparseArray sparseArray5 = sparseArray4;
            b0 b0Var4 = b0Var;
            int i18 = -1;
            ArrayList arrayList = null;
            v vVar2 = vVar;
            String strTrim = null;
            while (true) {
                if (wVar.f13861b >= i16) {
                    i10 = iZ;
                    break;
                }
                int iU = wVar.u();
                i10 = iZ;
                int iU2 = wVar.f13861b + wVar.u();
                if (iU2 > i16) {
                    break;
                }
                SparseArray sparseArray6 = sparseArray3;
                if (iU == 5) {
                    long jV = wVar.v();
                    if (jV == 1094921523) {
                        i18 = 129;
                    } else if (jV == 1161904947) {
                        i18 = 135;
                    } else if (jV == 1094921524) {
                        i18 = 172;
                    } else if (jV == 1212503619) {
                        i18 = 36;
                    }
                } else if (iU == 106) {
                    i18 = 129;
                } else if (iU == 122) {
                    i18 = 135;
                } else if (iU == 127) {
                    if (wVar.u() == 21) {
                        i18 = 172;
                    }
                } else if (iU == 123) {
                    i18 = 138;
                } else if (iU == 10) {
                    iU2 = iU2;
                    strTrim = wVar.s(3, di.d.f7631c).trim();
                } else if (iU == 89) {
                    arrayList = new ArrayList();
                    while (wVar.f13861b < iU2) {
                        String strTrim2 = wVar.s(3, di.d.f7631c).trim();
                        wVar.u();
                        byte[] bArr = new byte[4];
                        wVar.e(bArr, 0, 4);
                        arrayList.add(new zc.c0(bArr, strTrim2));
                        iU2 = iU2;
                    }
                    iU2 = iU2;
                    i18 = 89;
                } else {
                    iU2 = iU2;
                    if (iU == 111) {
                        i18 = 257;
                    }
                }
                wVar.G(iU2 - wVar.f13861b);
                iZ = i10;
                sparseArray3 = sparseArray6;
            }
            SparseArray sparseArray7 = sparseArray3;
            wVar.F(i16);
            n8.f fVar = new n8.f(i18, strTrim, arrayList, Arrays.copyOfRange(wVar.f13860a, i15, i16));
            if (i12 == 6 || i12 == 5) {
                i12 = i18;
            }
            iA = i17 - (i14 + 5);
            int i19 = i11 == 2 ? i12 : i13;
            if (sparseBooleanArray.get(i19)) {
                sparseArray2 = sparseArray7;
                c8 = 21;
            } else {
                c8 = 21;
                e0 e0VarA2 = (i11 == 2 && i12 == 21) ? b0Var3.f23671p : gVar.a(i12, fVar);
                if (i11 != 2 || i13 < sparseIntArray.get(i19, 8192)) {
                    sparseIntArray.put(i19, i13);
                    sparseArray2 = sparseArray7;
                    sparseArray2.put(i19, e0VarA2);
                } else {
                    sparseArray2 = sparseArray7;
                }
            }
            sparseArray3 = sparseArray2;
            vVar = vVar2;
            sparseArray4 = sparseArray5;
            b0Var = b0Var4;
            iZ = i10;
        }
        SparseArray sparseArray8 = sparseArray4;
        int i20 = iZ;
        b0 b0Var5 = b0Var;
        SparseArray sparseArray9 = sparseArray3;
        int size = sparseIntArray.size();
        int i21 = 0;
        while (i21 < size) {
            int iKeyAt = sparseIntArray.keyAt(i21);
            int iValueAt = sparseIntArray.valueAt(i21);
            sparseBooleanArray.put(iKeyAt, true);
            b0Var3.f23665h.put(iValueAt, true);
            e0 e0Var = (e0) sparseArray9.valueAt(i21);
            if (e0Var != null) {
                if (e0Var != b0Var3.f23671p) {
                    i7 = i20;
                    b0Var2 = b0Var5;
                    e0Var.b(b0Var2, b0Var3.k, new d0(i7, iKeyAt, 8192));
                } else {
                    b0Var2 = b0Var5;
                    i7 = i20;
                }
                sparseArray = sparseArray8;
                sparseArray.put(iValueAt, e0Var);
            } else {
                sparseArray = sparseArray8;
                b0Var2 = b0Var5;
                i7 = i20;
            }
            i21++;
            sparseArray8 = sparseArray;
            i20 = i7;
            b0Var5 = b0Var2;
        }
        SparseArray sparseArray10 = sparseArray8;
        if (i11 == 2) {
            if (b0Var3.f23668m) {
                return;
            }
            b0Var3.k.q();
            b0Var3.f23667l = 0;
            b0Var3.f23668m = true;
            return;
        }
        sparseArray10.remove(this.f10987d);
        int i22 = i11 == 1 ? 0 : b0Var3.f23667l - 1;
        b0Var3.f23667l = i22;
        if (i22 == 0) {
            b0Var3.k.q();
            b0Var3.f23668m = true;
        }
    }

    public void d(NotificationCompat$Action notificationCompat$Action) {
        IconCompat iconCompatA = notificationCompat$Action.a();
        int i7 = notificationCompat$Action.f1479f;
        boolean z5 = notificationCompat$Action.f1477d;
        Bundle bundle = notificationCompat$Action.f1474a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.i(null) : null, notificationCompat$Action.f1482i, notificationCompat$Action.j);
        RemoteInput[] remoteInputArr = notificationCompat$Action.f1476c;
        if (remoteInputArr != null) {
            android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
            for (int i10 = 0; i10 < remoteInputArr.length; i10++) {
                RemoteInput remoteInput = remoteInputArr[i10];
                android.app.RemoteInput.Builder builderAddExtras = new android.app.RemoteInput.Builder(remoteInput.f1531a).setLabel(remoteInput.f1532b).setChoices(remoteInput.f1533c).setAllowFreeFormInput(remoteInput.f1534d).addExtras(remoteInput.f1536f);
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator it = remoteInput.f1537g.iterator();
                    while (it.hasNext()) {
                        k.B(builderAddExtras, (String) it.next());
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    x0.g.j(builderAddExtras, remoteInput.f1535e);
                }
                remoteInputArr2[i10] = builderAddExtras.build();
            }
            for (android.app.RemoteInput remoteInput2 : remoteInputArr2) {
                builder.addRemoteInput(remoteInput2);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z5);
        int i11 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(z5);
        bundle2.putInt("android.support.action.semanticAction", i7);
        if (i11 >= 28) {
            x0.m.g(builder, i7);
        }
        if (i11 >= 29) {
            x0.g.i(builder, notificationCompat$Action.f1480g);
        }
        if (i11 >= 31) {
            w0.a(builder, notificationCompat$Action.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action.f1478e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.f10989i).addAction(builder.build());
    }

    public boolean f(int i7, int i10) {
        v.d dVar = (v.d) this.f10989i;
        int i11 = this.f10987d;
        z.d a10 = (z.d) dVar.f21322d[i7 + i11];
        z.d b10 = (z.d) ((v.d) this.f10990v).f21322d[i11 + i10];
        i0.d0 d0Var = i0.e0.f11300a;
        Intrinsics.checkNotNullParameter(a10, "prev");
        Intrinsics.checkNotNullParameter(b10, "next");
        if (Intrinsics.areEqual(a10, b10)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return a10.getClass() == b10.getClass();
    }

    public int g(String str) throws h {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f10987d, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        je.b.h();
        return iGlGetAttribLocation;
    }

    public SimpleDateFormat h() {
        String strA;
        TimeZone timeZoneL = ((p) this.f10989i).l();
        m mVar = (m) this.f10990v;
        mVar.getClass();
        kk.c cVar = (kk.c) mVar.f7994i;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayListC = cVar.c();
        if (cVar.f14557a.g() == hk.b.f10922d) {
            strA = ((mk.e) arrayListC.get(0)).a() + " " + ((mk.e) arrayListC.get(1)).a() + " " + ((mk.e) arrayListC.get(2)).a();
        } else {
            strA = cVar.f14559c.a();
        }
        sb2.append(strA);
        sb2.append(" ");
        sb2.append(cVar.f14558b.a());
        sb2.append(" mm");
        cVar.f14560d.getClass();
        sb2.append(cVar.f14561e.a());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sb2.toString(), ((p) mVar.f7993e).f());
        simpleDateFormat.setTimeZone(timeZoneL);
        return simpleDateFormat;
    }

    public e(i c8, vo.m containingDeclaration, lp.e typeParameterOwner, int i7) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f10988e = c8;
        this.f10989i = containingDeclaration;
        this.f10987d = i7;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        Intrinsics.checkNotNullParameter(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        this.f10990v = linkedHashMap;
        this.f10991w = ((l) ((a) ((i) this.f10988e).f7980e).f10957a).d(new bp.i(5, this));
    }

    /* JADX WARN: Code duplicated, block: B:155:0x048e  */
    public e(NotificationCompat$Builder notificationCompat$Builder) {
        ArrayList<Person> arrayList;
        Notification.BubbleMetadata bubbleMetadataB;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        NotificationCompat$Action notificationCompat$ActionG;
        NotificationCompat$Action notificationCompat$ActionG2;
        int i7;
        new ArrayList();
        this.f10991w = new Bundle();
        this.f10990v = notificationCompat$Builder;
        Context context = notificationCompat$Builder.f1483a;
        ArrayList arrayList3 = notificationCompat$Builder.Q;
        ArrayList<Person> arrayList4 = notificationCompat$Builder.f1485c;
        ArrayList arrayList5 = notificationCompat$Builder.f1486d;
        this.f10988e = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f10989i = k.c(context, notificationCompat$Builder.G);
        } else {
            this.f10989i = new Notification.Builder(context);
        }
        Notification notification = notificationCompat$Builder.N;
        int i10 = 0;
        ((Notification.Builder) this.f10989i).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(notificationCompat$Builder.f1487e).setContentText(notificationCompat$Builder.f1488f).setContentInfo(notificationCompat$Builder.k).setContentIntent(notificationCompat$Builder.f1490h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notificationCompat$Builder.f1491i, (notification.flags & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0).setNumber(notificationCompat$Builder.f1492l).setProgress(notificationCompat$Builder.f1499s, notificationCompat$Builder.f1500t, notificationCompat$Builder.f1501u);
        Notification.Builder builder = (Notification.Builder) this.f10989i;
        IconCompat iconCompat = notificationCompat$Builder.j;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.i(context));
        ((Notification.Builder) this.f10989i).setSubText(notificationCompat$Builder.f1497q).setUsesChronometer(notificationCompat$Builder.f1495o).setPriority(notificationCompat$Builder.f1493m);
        v0 v0Var = notificationCompat$Builder.f1496p;
        if (v0Var instanceof i0) {
            i0 i0Var = (i0) v0Var;
            PendingIntent pendingIntent = i0Var.f22533h;
            if (pendingIntent == null) {
                notificationCompat$ActionG = i0Var.g(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, i0Var.f22535l, R.color.call_notification_decline_color, i0Var.f22534i);
            } else {
                notificationCompat$ActionG = i0Var.g(R.drawable.ic_call_decline, R.string.call_notification_decline_action, i0Var.f22535l, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = i0Var.f22532g;
            if (pendingIntent2 == null) {
                notificationCompat$ActionG2 = null;
            } else {
                boolean z5 = i0Var.j;
                notificationCompat$ActionG2 = i0Var.g(z5 ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z5 ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, i0Var.k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(notificationCompat$ActionG);
            ArrayList<NotificationCompat$Action> arrayList7 = i0Var.f22571a.f1484b;
            if (arrayList7 != null) {
                i7 = 2;
                for (NotificationCompat$Action notificationCompat$Action : arrayList7) {
                    if (notificationCompat$Action.f1480g) {
                        arrayList6.add(notificationCompat$Action);
                    } else if (!notificationCompat$Action.f1474a.getBoolean("key_action_priority")) {
                        arrayList6.add(notificationCompat$Action);
                        i7--;
                    }
                    if (notificationCompat$ActionG2 != null && i7 == 1) {
                        arrayList6.add(notificationCompat$ActionG2);
                        i7--;
                    }
                }
            } else {
                i7 = 2;
            }
            if (notificationCompat$ActionG2 != null && i7 >= 1) {
                arrayList6.add(notificationCompat$ActionG2);
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                d((NotificationCompat$Action) it.next());
            }
        } else {
            Iterator it2 = notificationCompat$Builder.f1484b.iterator();
            while (it2.hasNext()) {
                d((NotificationCompat$Action) it2.next());
            }
        }
        Bundle bundle2 = notificationCompat$Builder.C;
        if (bundle2 != null) {
            ((Bundle) this.f10991w).putAll(bundle2);
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f10989i).setShowWhen(notificationCompat$Builder.f1494n);
        ((Notification.Builder) this.f10989i).setLocalOnly(notificationCompat$Builder.f1505y);
        ((Notification.Builder) this.f10989i).setGroup(notificationCompat$Builder.f1502v);
        ((Notification.Builder) this.f10989i).setSortKey(notificationCompat$Builder.f1504x);
        ((Notification.Builder) this.f10989i).setGroupSummary(notificationCompat$Builder.f1503w);
        this.f10987d = 0;
        ((Notification.Builder) this.f10989i).setCategory(notificationCompat$Builder.B);
        ((Notification.Builder) this.f10989i).setColor(notificationCompat$Builder.D);
        ((Notification.Builder) this.f10989i).setVisibility(notificationCompat$Builder.E);
        ((Notification.Builder) this.f10989i).setPublicVersion(notificationCompat$Builder.F);
        ((Notification.Builder) this.f10989i).setSound(notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                for (Person person : arrayList4) {
                    CharSequence charSequence = person.f1519a;
                    String str = person.f1521c;
                    if (str == null) {
                        str = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    s.f fVar = new s.f(arrayList3.size() + arrayList2.size());
                    fVar.addAll(arrayList2);
                    fVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) this.f10989i).addPerson((String) it3.next());
            }
        }
        if (arrayList5.size() > 0) {
            Bundle bundle3 = notificationCompat$Builder.d().getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList5.size()) {
                String string = Integer.toString(i12);
                NotificationCompat$Action notificationCompat$Action2 = (NotificationCompat$Action) arrayList5.get(i12);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatA = notificationCompat$Action2.a();
                Bundle bundle7 = notificationCompat$Action2.f1474a;
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.f() : i10);
                bundle6.putCharSequence(AlertFragment.ARG_TITLE, notificationCompat$Action2.f1482i);
                bundle6.putParcelable("actionIntent", notificationCompat$Action2.j);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action2.f1477d);
                bundle6.putBundle("extras", bundle);
                RemoteInput[] remoteInputArr = notificationCompat$Action2.f1476c;
                if (remoteInputArr == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[remoteInputArr.length];
                    int i13 = 0;
                    while (i13 < remoteInputArr.length) {
                        RemoteInput remoteInput = remoteInputArr[i13];
                        int i14 = i13;
                        Bundle bundle8 = new Bundle();
                        RemoteInput[] remoteInputArr2 = remoteInputArr;
                        int i15 = i12;
                        bundle8.putString("resultKey", remoteInput.f1531a);
                        bundle8.putCharSequence("label", remoteInput.f1532b);
                        bundle8.putCharSequenceArray("choices", remoteInput.f1533c);
                        bundle8.putBoolean("allowFreeFormInput", remoteInput.f1534d);
                        bundle8.putBundle("extras", remoteInput.f1536f);
                        HashSet hashSet = remoteInput.f1537g;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(hashSet.size());
                            Iterator it4 = hashSet.iterator();
                            while (it4.hasNext()) {
                                arrayList8.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr[i14] = bundle8;
                        i13 = i14 + 1;
                        remoteInputArr = remoteInputArr2;
                        i12 = i15;
                    }
                }
                int i16 = i12;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", notificationCompat$Action2.f1478e);
                bundle6.putInt("semanticAction", notificationCompat$Action2.f1479f);
                bundle5.putBundle(string, bundle6);
                i12 = i16 + 1;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                i10 = 0;
            }
            arrayList = arrayList4;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            notificationCompat$Builder.d().putBundle("android.car.EXTENSIONS", bundle3);
            ((Bundle) this.f10991w).putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList4;
        }
        int i17 = Build.VERSION.SDK_INT;
        Icon icon = notificationCompat$Builder.P;
        if (icon != null) {
            ((Notification.Builder) this.f10989i).setSmallIcon(icon);
        }
        ((Notification.Builder) this.f10989i).setExtras(notificationCompat$Builder.C);
        ((Notification.Builder) this.f10989i).setRemoteInputHistory(null);
        if (i17 >= 26) {
            k.C((Notification.Builder) this.f10989i, notificationCompat$Builder.H);
            k.I((Notification.Builder) this.f10989i, notificationCompat$Builder.f1498r);
            k.J((Notification.Builder) this.f10989i, notificationCompat$Builder.I);
            k.M((Notification.Builder) this.f10989i, notificationCompat$Builder.K);
            k.G((Notification.Builder) this.f10989i, 0);
            if (notificationCompat$Builder.A) {
                k.D((Notification.Builder) this.f10989i, notificationCompat$Builder.f1506z);
            }
            if (!TextUtils.isEmpty(notificationCompat$Builder.G)) {
                ((Notification.Builder) this.f10989i).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i17 >= 28) {
            for (Person person2 : arrayList) {
                Notification.Builder builder2 = (Notification.Builder) this.f10989i;
                person2.getClass();
                x0.m.a(builder2, x0.m.h(person2));
            }
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 29) {
            x0.g.g((Notification.Builder) this.f10989i, notificationCompat$Builder.L);
            Notification.Builder builder3 = (Notification.Builder) this.f10989i;
            x0.b0 b0Var = notificationCompat$Builder.M;
            if (b0Var == null) {
                bubbleMetadataB = null;
            } else if (i18 >= 30) {
                bubbleMetadataB = a0.b(b0Var);
            } else if (i18 == 29) {
                bubbleMetadataB = x0.z.b(b0Var);
            } else {
                bubbleMetadataB = null;
            }
            x0.g.h(builder3, bubbleMetadataB);
            y0.e eVar = notificationCompat$Builder.J;
            if (eVar != null) {
                x0.g.k((Notification.Builder) this.f10989i, eVar.f23128b);
            }
        }
        if (i18 >= 36) {
            x0.a((Notification.Builder) this.f10989i, notificationCompat$Builder.f1489g);
        }
        if (notificationCompat$Builder.O) {
            if (((NotificationCompat$Builder) this.f10990v).f1503w) {
                this.f10987d = 2;
            } else {
                this.f10987d = 1;
            }
            ((Notification.Builder) this.f10989i).setVibrate(null);
            ((Notification.Builder) this.f10989i).setSound(null);
            int i19 = notification.defaults & (-4);
            notification.defaults = i19;
            ((Notification.Builder) this.f10989i).setDefaults(i19);
            if (i18 >= 26) {
                if (TextUtils.isEmpty(((NotificationCompat$Builder) this.f10990v).f1502v)) {
                    ((Notification.Builder) this.f10989i).setGroup("silent");
                }
                k.G((Notification.Builder) this.f10989i, this.f10987d);
            }
        }
    }

    @Override // zc.z
    public void b(b0 b0Var, pc.m mVar, d0 d0Var) {
    }

    public e(String str, String str2) throws h {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f10987d = iGlCreateProgram;
        je.b.h();
        e(iGlCreateProgram, 35633, str);
        e(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        je.b.i("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f10990v = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f10988e = new vi.d[iArr2[0]];
        for (int i7 = 0; i7 < iArr2[0]; i7++) {
            int i10 = this.f10987d;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr3, 0);
            int i11 = iArr3[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveAttrib(i10, i7, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i12 = 0; i12 < i11; i12++) {
                if (bArr[i12] == 0) {
                    i11 = i12;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i11);
            GLES20.glGetAttribLocation(i10, str3);
            vi.d dVar = new vi.d(9, (byte) 0);
            ((vi.d[]) this.f10988e)[i7] = dVar;
            ((HashMap) this.f10990v).put(str3, dVar);
        }
        this.f10991w = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f10987d, 35718, iArr4, 0);
        this.f10989i = new ga.k[iArr4[0]];
        for (int i13 = 0; i13 < iArr4[0]; i13++) {
            int i14 = this.f10987d;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr5, 0);
            int i15 = iArr5[0];
            byte[] bArr2 = new byte[i15];
            GLES20.glGetActiveUniform(i14, i13, i15, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i16 = 0; i16 < i15; i16++) {
                if (bArr2[i16] == 0) {
                    i15 = i16;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i15);
            GLES20.glGetUniformLocation(i14, str4);
            ga.k kVar = new ga.k();
            ((ga.k[]) this.f10989i)[i13] = kVar;
            ((HashMap) this.f10991w).put(str4, kVar);
        }
        je.b.h();
    }

    public e(n0 n0Var, u4.c cVar, byte[] bArr, com.reactnativecommunity.webview.h[] hVarArr, int i7) {
        this.f10988e = n0Var;
        this.f10989i = cVar;
        this.f10990v = bArr;
        this.f10991w = hVarArr;
        this.f10987d = i7;
    }

    public e(i0.c0 c0Var, z.e node, int i7, v.d before, v.d after) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(before, "before");
        Intrinsics.checkNotNullParameter(after, "after");
        this.f10991w = c0Var;
        this.f10988e = node;
        this.f10987d = i7;
        this.f10989i = before;
        this.f10990v = after;
    }

    public e(zc.b0 b0Var, int i7) {
        this.f10991w = b0Var;
        this.f10988e = new v(new byte[5], 5);
        this.f10989i = new SparseArray();
        this.f10990v = new SparseIntArray();
        this.f10987d = i7;
    }
}
