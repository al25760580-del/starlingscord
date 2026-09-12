package e4;

import a5.l0;
import android.database.Cursor;
import androidx.recyclerview.widget.h0;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.devsupport.StackTraceHelper;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import v3.y;
import v3.z;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f8025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f8026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f8027i;
    public final Object j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f8029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f8030n;

    public p() {
        Locale localeD;
        this.f8019a = null;
        this.f8020b = new jk.a(0);
        this.f8021c = new jk.a(8);
        String strReplace = Locale.getDefault().toLanguageTag().replace('-', '_');
        try {
            localeD = ts.a.d(strReplace);
        } catch (Exception unused) {
            localeD = ts.a.d(strReplace.substring(0, strReplace.indexOf("_")));
        }
        jk.b bVar = new jk.b(localeD);
        bVar.f13918b = Locale.getDefault().toLanguageTag().replace('-', '_');
        this.f8022d = bVar;
        jk.a aVar = new jk.a(9);
        this.f8023e = aVar;
        jk.a aVar2 = new jk.a((Serializable) 1);
        this.f8024f = aVar2;
        jk.a aVar3 = new jk.a(6);
        this.f8025g = aVar3;
        jk.a aVar4 = new jk.a(5);
        this.f8026h = aVar4;
        jk.a aVar5 = new jk.a(10);
        this.f8027i = aVar5;
        jk.a aVar6 = new jk.a(2);
        jk.a aVar7 = new jk.a(4);
        this.j = aVar7;
        jk.a aVar8 = new jk.a(3);
        this.k = aVar8;
        jk.a aVar9 = new jk.a(1);
        this.f8028l = aVar9;
        fk.i iVar = new fk.i();
        iVar.put("date", (jk.a) this.f8020b);
        iVar.put("mode", (jk.a) this.f8021c);
        iVar.put("locale", bVar);
        iVar.put("textColor", aVar);
        iVar.put("minuteInterval", aVar2);
        iVar.put("minimumDate", aVar3);
        iVar.put("maximumDate", aVar4);
        iVar.put("timezoneOffsetInMinutes", aVar5);
        iVar.put("height", aVar6);
        iVar.put("is24hourSource", aVar7);
        iVar.put(StackTraceHelper.ID_KEY, aVar8);
        iVar.put("dividerColor", aVar9);
        this.f8029m = iVar;
        this.f8030n = new ga.l(8, this);
    }

    public Calendar a(jk.c cVar) {
        String str = (String) cVar.f13919a;
        TimeZone timeZoneL = l();
        Calendar calendar = null;
        if (str != null) {
            try {
                Calendar calendar2 = Calendar.getInstance(timeZoneL);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                calendar2.setTime(simpleDateFormat.parse(str));
                calendar = calendar2;
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
        if (calendar == null) {
            return calendar;
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public void b(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8021c;
        h3.j jVarA = hVar.a();
        if (str == null) {
            jVarA.R(1);
        } else {
            jVarA.o(1, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public ArrayList c() throws Throwable {
        a3.o oVar;
        a3.o oVarG = a3.o.g(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        oVarG.x(1, h0.DEFAULT_DRAG_ANIMATION_DURATION);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.a.k(cursorM, "state");
            int iK3 = a.a.k(cursorM, "worker_class_name");
            int iK4 = a.a.k(cursorM, "input_merger_class_name");
            int iK5 = a.a.k(cursorM, "input");
            int iK6 = a.a.k(cursorM, "output");
            int iK7 = a.a.k(cursorM, "initial_delay");
            int iK8 = a.a.k(cursorM, "interval_duration");
            int iK9 = a.a.k(cursorM, "flex_duration");
            int iK10 = a.a.k(cursorM, "run_attempt_count");
            int iK11 = a.a.k(cursorM, "backoff_policy");
            int iK12 = a.a.k(cursorM, "backoff_delay_duration");
            int iK13 = a.a.k(cursorM, "last_enqueue_time");
            oVar = oVarG;
            try {
                int iK14 = a.a.k(cursorM, "minimum_retention_duration");
                int iK15 = a.a.k(cursorM, "schedule_requested_at");
                int iK16 = a.a.k(cursorM, "run_in_foreground");
                int iK17 = a.a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.a.k(cursorM, "period_count");
                int iK19 = a.a.k(cursorM, "generation");
                int iK20 = a.a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.a.k(cursorM, "stop_reason");
                int iK23 = a.a.k(cursorM, "required_network_type");
                int iK24 = a.a.k(cursorM, "requires_charging");
                int iK25 = a.a.k(cursorM, "requires_device_idle");
                int iK26 = a.a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.a.k(cursorM, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    v3.g gVarA = v3.g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    v3.g gVarA2 = v3.g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i10 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    int i11 = i7;
                    long j12 = cursorM.getLong(i11);
                    int i12 = iK13;
                    int i13 = iK15;
                    long j13 = cursorM.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z5 = cursorM.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    y yVarH = l0.H(cursorM.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorM.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorM.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j14 = cursorM.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorM.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorM.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    v3.r rVarG = l0.G(cursorM.getInt(i25));
                    iK23 = i25;
                    int i26 = iK24;
                    boolean z6 = cursorM.getInt(i26) != 0;
                    iK24 = i26;
                    int i27 = iK25;
                    boolean z7 = cursorM.getInt(i27) != 0;
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z10 = cursorM.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z11 = cursorM.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    long j15 = cursorM.getLong(i30);
                    iK28 = i30;
                    int i31 = iK29;
                    long j16 = cursorM.getLong(i31);
                    iK29 = i31;
                    int i32 = iK30;
                    if (!cursorM.isNull(i32)) {
                        blob = cursorM.getBlob(i32);
                    }
                    iK30 = i32;
                    arrayList.add(new o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new v3.e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i10, aVarF, j10, j11, j12, j13, z5, yVarH, i17, i19, j14, i22, i24));
                    iK13 = i12;
                    i7 = i11;
                }
                cursorM.close();
                oVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }

    public ArrayList d(int i7) throws Throwable {
        a3.o oVar;
        a3.o oVarG = a3.o.g(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        oVarG.x(1, i7);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.a.k(cursorM, "state");
            int iK3 = a.a.k(cursorM, "worker_class_name");
            int iK4 = a.a.k(cursorM, "input_merger_class_name");
            int iK5 = a.a.k(cursorM, "input");
            int iK6 = a.a.k(cursorM, "output");
            int iK7 = a.a.k(cursorM, "initial_delay");
            int iK8 = a.a.k(cursorM, "interval_duration");
            int iK9 = a.a.k(cursorM, "flex_duration");
            int iK10 = a.a.k(cursorM, "run_attempt_count");
            int iK11 = a.a.k(cursorM, "backoff_policy");
            int iK12 = a.a.k(cursorM, "backoff_delay_duration");
            int iK13 = a.a.k(cursorM, "last_enqueue_time");
            oVar = oVarG;
            try {
                int iK14 = a.a.k(cursorM, "minimum_retention_duration");
                int iK15 = a.a.k(cursorM, "schedule_requested_at");
                int iK16 = a.a.k(cursorM, "run_in_foreground");
                int iK17 = a.a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.a.k(cursorM, "period_count");
                int iK19 = a.a.k(cursorM, "generation");
                int iK20 = a.a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.a.k(cursorM, "stop_reason");
                int iK23 = a.a.k(cursorM, "required_network_type");
                int iK24 = a.a.k(cursorM, "requires_charging");
                int iK25 = a.a.k(cursorM, "requires_device_idle");
                int iK26 = a.a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.a.k(cursorM, "content_uri_triggers");
                int i10 = iK14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    v3.g gVarA = v3.g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    v3.g gVarA2 = v3.g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i11 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    int i12 = i10;
                    long j12 = cursorM.getLong(i12);
                    int i13 = iK13;
                    int i14 = iK15;
                    long j13 = cursorM.getLong(i14);
                    iK15 = i14;
                    int i15 = iK16;
                    boolean z5 = cursorM.getInt(i15) != 0;
                    iK16 = i15;
                    int i16 = iK17;
                    y yVarH = l0.H(cursorM.getInt(i16));
                    iK17 = i16;
                    int i17 = iK18;
                    int i18 = cursorM.getInt(i17);
                    iK18 = i17;
                    int i19 = iK19;
                    int i20 = cursorM.getInt(i19);
                    iK19 = i19;
                    int i21 = iK20;
                    long j14 = cursorM.getLong(i21);
                    iK20 = i21;
                    int i22 = iK21;
                    int i23 = cursorM.getInt(i22);
                    iK21 = i22;
                    int i24 = iK22;
                    int i25 = cursorM.getInt(i24);
                    iK22 = i24;
                    int i26 = iK23;
                    v3.r rVarG = l0.G(cursorM.getInt(i26));
                    iK23 = i26;
                    int i27 = iK24;
                    boolean z6 = cursorM.getInt(i27) != 0;
                    iK24 = i27;
                    int i28 = iK25;
                    boolean z7 = cursorM.getInt(i28) != 0;
                    iK25 = i28;
                    int i29 = iK26;
                    boolean z10 = cursorM.getInt(i29) != 0;
                    iK26 = i29;
                    int i30 = iK27;
                    boolean z11 = cursorM.getInt(i30) != 0;
                    iK27 = i30;
                    int i31 = iK28;
                    long j15 = cursorM.getLong(i31);
                    iK28 = i31;
                    int i32 = iK29;
                    long j16 = cursorM.getLong(i32);
                    iK29 = i32;
                    int i33 = iK30;
                    if (!cursorM.isNull(i33)) {
                        blob = cursorM.getBlob(i33);
                    }
                    iK30 = i33;
                    arrayList.add(new o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new v3.e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i11, aVarF, j10, j11, j12, j13, z5, yVarH, i18, i20, j14, i23, i25));
                    iK13 = i13;
                    i10 = i12;
                }
                cursorM.close();
                oVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }

    public ArrayList e() throws Throwable {
        a3.o oVar;
        a3.o oVarG = a3.o.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.a.k(cursorM, "state");
            int iK3 = a.a.k(cursorM, "worker_class_name");
            int iK4 = a.a.k(cursorM, "input_merger_class_name");
            int iK5 = a.a.k(cursorM, "input");
            int iK6 = a.a.k(cursorM, "output");
            int iK7 = a.a.k(cursorM, "initial_delay");
            int iK8 = a.a.k(cursorM, "interval_duration");
            int iK9 = a.a.k(cursorM, "flex_duration");
            int iK10 = a.a.k(cursorM, "run_attempt_count");
            int iK11 = a.a.k(cursorM, "backoff_policy");
            int iK12 = a.a.k(cursorM, "backoff_delay_duration");
            int iK13 = a.a.k(cursorM, "last_enqueue_time");
            oVar = oVarG;
            try {
                int iK14 = a.a.k(cursorM, "minimum_retention_duration");
                int iK15 = a.a.k(cursorM, "schedule_requested_at");
                int iK16 = a.a.k(cursorM, "run_in_foreground");
                int iK17 = a.a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.a.k(cursorM, "period_count");
                int iK19 = a.a.k(cursorM, "generation");
                int iK20 = a.a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.a.k(cursorM, "stop_reason");
                int iK23 = a.a.k(cursorM, "required_network_type");
                int iK24 = a.a.k(cursorM, "requires_charging");
                int iK25 = a.a.k(cursorM, "requires_device_idle");
                int iK26 = a.a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.a.k(cursorM, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    v3.g gVarA = v3.g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    v3.g gVarA2 = v3.g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i10 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    int i11 = i7;
                    long j12 = cursorM.getLong(i11);
                    int i12 = iK13;
                    int i13 = iK15;
                    long j13 = cursorM.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z5 = cursorM.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    y yVarH = l0.H(cursorM.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorM.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorM.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j14 = cursorM.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorM.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorM.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    v3.r rVarG = l0.G(cursorM.getInt(i25));
                    iK23 = i25;
                    int i26 = iK24;
                    boolean z6 = cursorM.getInt(i26) != 0;
                    iK24 = i26;
                    int i27 = iK25;
                    boolean z7 = cursorM.getInt(i27) != 0;
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z10 = cursorM.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z11 = cursorM.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    long j15 = cursorM.getLong(i30);
                    iK28 = i30;
                    int i31 = iK29;
                    long j16 = cursorM.getLong(i31);
                    iK29 = i31;
                    int i32 = iK30;
                    if (!cursorM.isNull(i32)) {
                        blob = cursorM.getBlob(i32);
                    }
                    iK30 = i32;
                    arrayList.add(new o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new v3.e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i10, aVarF, j10, j11, j12, j13, z5, yVarH, i17, i19, j14, i22, i24));
                    iK13 = i12;
                    i7 = i11;
                }
                cursorM.close();
                oVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }

    public Locale f() {
        return (Locale) ((jk.b) this.f8022d).f13919a;
    }

    public hk.b g() {
        return (hk.b) ((jk.a) this.f8021c).f13919a;
    }

    public Calendar h() {
        String str = (String) ((jk.a) this.f8020b).f13919a;
        TimeZone timeZoneL = l();
        Calendar calendar = null;
        if (str != null) {
            try {
                Calendar calendar2 = Calendar.getInstance(timeZoneL);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                calendar2.setTime(simpleDateFormat.parse(str));
                calendar = calendar2;
            } catch (ParseException e10) {
                e10.printStackTrace();
            }
        }
        int iIntValue = ((Integer) ((jk.a) this.f8024f).f13919a).intValue();
        if (iIntValue <= 1) {
            return calendar;
        }
        calendar.add(12, -(Integer.parseInt(new SimpleDateFormat("mm", f()).format(calendar.getTime())) % iIntValue));
        return (Calendar) calendar.clone();
    }

    public ArrayList i() throws Throwable {
        a3.o oVar;
        a3.o oVarG = a3.o.g(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.a.k(cursorM, "state");
            int iK3 = a.a.k(cursorM, "worker_class_name");
            int iK4 = a.a.k(cursorM, "input_merger_class_name");
            int iK5 = a.a.k(cursorM, "input");
            int iK6 = a.a.k(cursorM, "output");
            int iK7 = a.a.k(cursorM, "initial_delay");
            int iK8 = a.a.k(cursorM, "interval_duration");
            int iK9 = a.a.k(cursorM, "flex_duration");
            int iK10 = a.a.k(cursorM, "run_attempt_count");
            int iK11 = a.a.k(cursorM, "backoff_policy");
            int iK12 = a.a.k(cursorM, "backoff_delay_duration");
            int iK13 = a.a.k(cursorM, "last_enqueue_time");
            oVar = oVarG;
            try {
                int iK14 = a.a.k(cursorM, "minimum_retention_duration");
                int iK15 = a.a.k(cursorM, "schedule_requested_at");
                int iK16 = a.a.k(cursorM, "run_in_foreground");
                int iK17 = a.a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.a.k(cursorM, "period_count");
                int iK19 = a.a.k(cursorM, "generation");
                int iK20 = a.a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.a.k(cursorM, "stop_reason");
                int iK23 = a.a.k(cursorM, "required_network_type");
                int iK24 = a.a.k(cursorM, "requires_charging");
                int iK25 = a.a.k(cursorM, "requires_device_idle");
                int iK26 = a.a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.a.k(cursorM, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    v3.g gVarA = v3.g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    v3.g gVarA2 = v3.g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i10 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    int i11 = i7;
                    long j12 = cursorM.getLong(i11);
                    int i12 = iK13;
                    int i13 = iK15;
                    long j13 = cursorM.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z5 = cursorM.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    y yVarH = l0.H(cursorM.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorM.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorM.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j14 = cursorM.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorM.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorM.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    v3.r rVarG = l0.G(cursorM.getInt(i25));
                    iK23 = i25;
                    int i26 = iK24;
                    boolean z6 = cursorM.getInt(i26) != 0;
                    iK24 = i26;
                    int i27 = iK25;
                    boolean z7 = cursorM.getInt(i27) != 0;
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z10 = cursorM.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z11 = cursorM.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    long j15 = cursorM.getLong(i30);
                    iK28 = i30;
                    int i31 = iK29;
                    long j16 = cursorM.getLong(i31);
                    iK29 = i31;
                    int i32 = iK30;
                    if (!cursorM.isNull(i32)) {
                        blob = cursorM.getBlob(i32);
                    }
                    iK30 = i32;
                    arrayList.add(new o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new v3.e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i10, aVarF, j10, j11, j12, j13, z5, yVarH, i17, i19, j14, i22, i24));
                    iK13 = i12;
                    i7 = i11;
                }
                cursorM.close();
                oVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }

    public ArrayList j() {
        a3.o oVar;
        a3.o oVarG = a3.o.g(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.a.k(cursorM, "state");
            int iK3 = a.a.k(cursorM, "worker_class_name");
            int iK4 = a.a.k(cursorM, "input_merger_class_name");
            int iK5 = a.a.k(cursorM, "input");
            int iK6 = a.a.k(cursorM, "output");
            int iK7 = a.a.k(cursorM, "initial_delay");
            int iK8 = a.a.k(cursorM, "interval_duration");
            int iK9 = a.a.k(cursorM, "flex_duration");
            int iK10 = a.a.k(cursorM, "run_attempt_count");
            int iK11 = a.a.k(cursorM, "backoff_policy");
            int iK12 = a.a.k(cursorM, "backoff_delay_duration");
            int iK13 = a.a.k(cursorM, "last_enqueue_time");
            oVar = oVarG;
            try {
                int iK14 = a.a.k(cursorM, "minimum_retention_duration");
                int iK15 = a.a.k(cursorM, "schedule_requested_at");
                int iK16 = a.a.k(cursorM, "run_in_foreground");
                int iK17 = a.a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.a.k(cursorM, "period_count");
                int iK19 = a.a.k(cursorM, "generation");
                int iK20 = a.a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.a.k(cursorM, "stop_reason");
                int iK23 = a.a.k(cursorM, "required_network_type");
                int iK24 = a.a.k(cursorM, "requires_charging");
                int iK25 = a.a.k(cursorM, "requires_device_idle");
                int iK26 = a.a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.a.k(cursorM, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    v3.g gVarA = v3.g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    v3.g gVarA2 = v3.g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i10 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    int i11 = i7;
                    long j12 = cursorM.getLong(i11);
                    int i12 = iK13;
                    int i13 = iK15;
                    long j13 = cursorM.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z5 = cursorM.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    y yVarH = l0.H(cursorM.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorM.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorM.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j14 = cursorM.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorM.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorM.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    v3.r rVarG = l0.G(cursorM.getInt(i25));
                    iK23 = i25;
                    int i26 = iK24;
                    boolean z6 = cursorM.getInt(i26) != 0;
                    iK24 = i26;
                    int i27 = iK25;
                    boolean z7 = cursorM.getInt(i27) != 0;
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z10 = cursorM.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z11 = cursorM.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    long j15 = cursorM.getLong(i30);
                    iK28 = i30;
                    int i31 = iK29;
                    long j16 = cursorM.getLong(i31);
                    iK29 = i31;
                    int i32 = iK30;
                    if (!cursorM.isNull(i32)) {
                        blob = cursorM.getBlob(i32);
                    }
                    iK30 = i32;
                    arrayList.add(new o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new v3.e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i10, aVarF, j10, j11, j12, j13, z5, yVarH, i17, i19, j14, i22, i24));
                    iK13 = i12;
                    i7 = i11;
                }
                cursorM.close();
                oVar.i();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }

    public z k(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        a3.o oVarG = a3.o.g(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            z zVarI = null;
            if (cursorM.moveToFirst()) {
                Integer numValueOf = cursorM.isNull(0) ? null : Integer.valueOf(cursorM.getInt(0));
                if (numValueOf != null) {
                    zVarI = l0.I(numValueOf.intValue());
                }
            }
            return zVarI;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    public TimeZone l() {
        try {
            String str = (String) ((jk.a) this.f8027i).f13919a;
            if (str != null && !str.equals("")) {
                int i7 = Integer.parseInt(str);
                int iAbs = Math.abs(i7);
                char c8 = i7 < 0 ? '-' : '+';
                int iFloor = (int) Math.floor(iAbs / 60.0f);
                return DesugarTimeZone.getTimeZone("GMT" + c8 + iFloor + ":" + new DecimalFormat("00").format(iAbs - (iFloor * 60)));
            }
            return TimeZone.getDefault();
        } catch (Exception e10) {
            e10.printStackTrace();
            return TimeZone.getDefault();
        }
    }

    public ArrayList m(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        a3.o oVarG = a3.o.g(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                arrayList.add(cursorM.isNull(0) ? null : cursorM.getString(0));
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    public o n(String str) {
        a3.o oVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        a3.o oVarG = a3.o.g(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            int iK = a.a.k(cursorM, StackTraceHelper.ID_KEY);
            int iK2 = a.a.k(cursorM, "state");
            int iK3 = a.a.k(cursorM, "worker_class_name");
            int iK4 = a.a.k(cursorM, "input_merger_class_name");
            int iK5 = a.a.k(cursorM, "input");
            int iK6 = a.a.k(cursorM, "output");
            int iK7 = a.a.k(cursorM, "initial_delay");
            int iK8 = a.a.k(cursorM, "interval_duration");
            int iK9 = a.a.k(cursorM, "flex_duration");
            int iK10 = a.a.k(cursorM, "run_attempt_count");
            int iK11 = a.a.k(cursorM, "backoff_policy");
            int iK12 = a.a.k(cursorM, "backoff_delay_duration");
            int iK13 = a.a.k(cursorM, "last_enqueue_time");
            int iK14 = a.a.k(cursorM, "minimum_retention_duration");
            oVar = oVarG;
            try {
                int iK15 = a.a.k(cursorM, "schedule_requested_at");
                int iK16 = a.a.k(cursorM, "run_in_foreground");
                int iK17 = a.a.k(cursorM, "out_of_quota_policy");
                int iK18 = a.a.k(cursorM, "period_count");
                int iK19 = a.a.k(cursorM, "generation");
                int iK20 = a.a.k(cursorM, "next_schedule_time_override");
                int iK21 = a.a.k(cursorM, "next_schedule_time_override_generation");
                int iK22 = a.a.k(cursorM, "stop_reason");
                int iK23 = a.a.k(cursorM, "required_network_type");
                int iK24 = a.a.k(cursorM, "requires_charging");
                int iK25 = a.a.k(cursorM, "requires_device_idle");
                int iK26 = a.a.k(cursorM, "requires_battery_not_low");
                int iK27 = a.a.k(cursorM, "requires_storage_not_low");
                int iK28 = a.a.k(cursorM, "trigger_content_update_delay");
                int iK29 = a.a.k(cursorM, "trigger_max_content_delay");
                int iK30 = a.a.k(cursorM, "content_uri_triggers");
                o oVar2 = null;
                byte[] blob = null;
                if (cursorM.moveToFirst()) {
                    String string = cursorM.isNull(iK) ? null : cursorM.getString(iK);
                    z zVarI = l0.I(cursorM.getInt(iK2));
                    String string2 = cursorM.isNull(iK3) ? null : cursorM.getString(iK3);
                    String string3 = cursorM.isNull(iK4) ? null : cursorM.getString(iK4);
                    v3.g gVarA = v3.g.a(cursorM.isNull(iK5) ? null : cursorM.getBlob(iK5));
                    v3.g gVarA2 = v3.g.a(cursorM.isNull(iK6) ? null : cursorM.getBlob(iK6));
                    long j = cursorM.getLong(iK7);
                    long j5 = cursorM.getLong(iK8);
                    long j7 = cursorM.getLong(iK9);
                    int i7 = cursorM.getInt(iK10);
                    v3.a aVarF = l0.F(cursorM.getInt(iK11));
                    long j10 = cursorM.getLong(iK12);
                    long j11 = cursorM.getLong(iK13);
                    long j12 = cursorM.getLong(iK14);
                    long j13 = cursorM.getLong(iK15);
                    boolean z5 = cursorM.getInt(iK16) != 0;
                    y yVarH = l0.H(cursorM.getInt(iK17));
                    int i10 = cursorM.getInt(iK18);
                    int i11 = cursorM.getInt(iK19);
                    long j14 = cursorM.getLong(iK20);
                    int i12 = cursorM.getInt(iK21);
                    int i13 = cursorM.getInt(iK22);
                    v3.r rVarG = l0.G(cursorM.getInt(iK23));
                    boolean z6 = cursorM.getInt(iK24) != 0;
                    boolean z7 = cursorM.getInt(iK25) != 0;
                    boolean z10 = cursorM.getInt(iK26) != 0;
                    boolean z11 = cursorM.getInt(iK27) != 0;
                    long j15 = cursorM.getLong(iK28);
                    long j16 = cursorM.getLong(iK29);
                    if (!cursorM.isNull(iK30)) {
                        blob = cursorM.getBlob(iK30);
                    }
                    oVar2 = new o(string, zVarI, string2, string3, gVarA, gVarA2, j, j5, j7, new v3.e(rVarG, z6, z7, z10, z11, j15, j16, l0.j(blob)), i7, aVarF, j10, j11, j12, j13, z5, yVarH, i10, i11, j14, i12, i13);
                }
                cursorM.close();
                oVar.i();
                return oVar2;
            } catch (Throwable th2) {
                th = th2;
                cursorM.close();
                oVar.i();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            oVar = oVarG;
        }
    }

    public ArrayList o(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        a3.o oVarG = a3.o.g(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            oVarG.R(1);
        } else {
            oVarG.o(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
        try {
            ArrayList arrayList = new ArrayList(cursorM.getCount());
            while (cursorM.moveToNext()) {
                String id2 = cursorM.isNull(0) ? null : cursorM.getString(0);
                z state = l0.I(cursorM.getInt(1));
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(state, "state");
                n nVar = new n();
                nVar.f7996a = id2;
                nVar.f7997b = state;
                arrayList.add(nVar);
            }
            return arrayList;
        } finally {
            cursorM.close();
            oVarG.i();
        }
    }

    public void p(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8028l;
        h3.j jVarA = hVar.a();
        jVarA.x(1, j);
        if (str == null) {
            jVarA.R(2);
        } else {
            jVarA.o(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public void q(int i7, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.k;
        h3.j jVarA = hVar.a();
        if (str == null) {
            jVarA.R(1);
        } else {
            jVarA.o(1, str);
        }
        jVarA.x(2, i7);
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public void r(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8026h;
        h3.j jVarA = hVar.a();
        jVarA.x(1, j);
        if (str == null) {
            jVarA.R(2);
        } else {
            jVarA.o(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public void s(String str, v3.g gVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8025g;
        h3.j jVarA = hVar.a();
        byte[] bArrB = v3.g.b(gVar);
        if (bArrB == null) {
            jVarA.R(1);
        } else {
            jVarA.F(bArrB, 1);
        }
        if (str == null) {
            jVarA.R(2);
        } else {
            jVarA.o(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public void t(z zVar, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8022d;
        h3.j jVarA = hVar.a();
        jVarA.x(1, l0.P(zVar));
        if (str == null) {
            jVarA.R(2);
        } else {
            jVarA.o(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public void u(int i7, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8019a;
        workDatabase_Impl.b();
        h hVar = (h) this.f8030n;
        h3.j jVarA = hVar.a();
        jVarA.x(1, i7);
        if (str == null) {
            jVarA.R(2);
        } else {
            jVarA.o(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.c();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.e(jVarA);
        }
    }

    public p(WorkDatabase_Impl database) {
        this.f8019a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f8020b = new b(database, false, 5);
        Intrinsics.checkNotNullParameter(database, "database");
        new h(database, 12);
        this.f8021c = new h(database, 13);
        this.f8022d = new h(database, 14);
        this.f8023e = new h(database, 15);
        this.f8024f = new h(database, 16);
        this.f8025g = new h(database, 17);
        this.f8026h = new h(database, 18);
        this.f8027i = new h(database, 19);
        this.j = new h(database, 4);
        new h(database, 5);
        this.k = new h(database, 6);
        this.f8028l = new h(database, 7);
        this.f8029m = new h(database, 8);
        new h(database, 9);
        new h(database, 10);
        this.f8030n = new h(database, 11);
    }
}
