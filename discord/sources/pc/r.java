package pc;

import ag.a1;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import gc.h1;
import he.l0;
import he.m0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import md.p0;
import md.q0;
import md.x0;
import md.y0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import sh.q1;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements l0, p0, ze.i, th.g, m0, vd.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17922d;

    public /* synthetic */ r(Object obj) {
        this.f17922d = obj;
    }

    public static void e(h3.c cVar) {
        cVar.l("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public static a3.n k(h3.c cVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new c3.a("work_spec_id", "TEXT", null, 1, 1, true));
        map.put("prerequisite_id", new c3.a("prerequisite_id", "TEXT", null, 2, 1, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new c3.b(Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY), "WorkSpec", "CASCADE", "CASCADE"));
        hashSet.add(new c3.b(Arrays.asList("prerequisite_id"), Arrays.asList(StackTraceHelper.ID_KEY), "WorkSpec", "CASCADE", "CASCADE"));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new c3.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new c3.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        c3.e eVar = new c3.e("Dependency", map, hashSet, hashSet2);
        c3.e eVarA = c3.e.a(cVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new a3.n(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
        }
        HashMap map2 = new HashMap(30);
        map2.put(StackTraceHelper.ID_KEY, new c3.a(StackTraceHelper.ID_KEY, "TEXT", null, 1, 1, true));
        map2.put("state", new c3.a("state", "INTEGER", null, 0, 1, true));
        map2.put("worker_class_name", new c3.a("worker_class_name", "TEXT", null, 0, 1, true));
        map2.put("input_merger_class_name", new c3.a("input_merger_class_name", "TEXT", null, 0, 1, true));
        map2.put("input", new c3.a("input", "BLOB", null, 0, 1, true));
        map2.put("output", new c3.a("output", "BLOB", null, 0, 1, true));
        map2.put("initial_delay", new c3.a("initial_delay", "INTEGER", null, 0, 1, true));
        map2.put("interval_duration", new c3.a("interval_duration", "INTEGER", null, 0, 1, true));
        map2.put("flex_duration", new c3.a("flex_duration", "INTEGER", null, 0, 1, true));
        map2.put("run_attempt_count", new c3.a("run_attempt_count", "INTEGER", null, 0, 1, true));
        map2.put("backoff_policy", new c3.a("backoff_policy", "INTEGER", null, 0, 1, true));
        map2.put("backoff_delay_duration", new c3.a("backoff_delay_duration", "INTEGER", null, 0, 1, true));
        map2.put("last_enqueue_time", new c3.a("last_enqueue_time", "INTEGER", "-1", 0, 1, true));
        map2.put("minimum_retention_duration", new c3.a("minimum_retention_duration", "INTEGER", null, 0, 1, true));
        map2.put("schedule_requested_at", new c3.a("schedule_requested_at", "INTEGER", null, 0, 1, true));
        map2.put("run_in_foreground", new c3.a("run_in_foreground", "INTEGER", null, 0, 1, true));
        map2.put("out_of_quota_policy", new c3.a("out_of_quota_policy", "INTEGER", null, 0, 1, true));
        map2.put("period_count", new c3.a("period_count", "INTEGER", "0", 0, 1, true));
        map2.put("generation", new c3.a("generation", "INTEGER", "0", 0, 1, true));
        map2.put("next_schedule_time_override", new c3.a("next_schedule_time_override", "INTEGER", "9223372036854775807", 0, 1, true));
        map2.put("next_schedule_time_override_generation", new c3.a("next_schedule_time_override_generation", "INTEGER", "0", 0, 1, true));
        map2.put("stop_reason", new c3.a("stop_reason", "INTEGER", "-256", 0, 1, true));
        map2.put("required_network_type", new c3.a("required_network_type", "INTEGER", null, 0, 1, true));
        map2.put("requires_charging", new c3.a("requires_charging", "INTEGER", null, 0, 1, true));
        map2.put("requires_device_idle", new c3.a("requires_device_idle", "INTEGER", null, 0, 1, true));
        map2.put("requires_battery_not_low", new c3.a("requires_battery_not_low", "INTEGER", null, 0, 1, true));
        map2.put("requires_storage_not_low", new c3.a("requires_storage_not_low", "INTEGER", null, 0, 1, true));
        map2.put("trigger_content_update_delay", new c3.a("trigger_content_update_delay", "INTEGER", null, 0, 1, true));
        map2.put("trigger_max_content_delay", new c3.a("trigger_max_content_delay", "INTEGER", null, 0, 1, true));
        map2.put("content_uri_triggers", new c3.a("content_uri_triggers", "BLOB", null, 0, 1, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new c3.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new c3.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        c3.e eVar2 = new c3.e("WorkSpec", map2, hashSet3, hashSet4);
        c3.e eVarA2 = c3.e.a(cVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new a3.n(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new c3.a("tag", "TEXT", null, 1, 1, true));
        map3.put("work_spec_id", new c3.a("work_spec_id", "TEXT", null, 2, 1, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new c3.b(Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY), "WorkSpec", "CASCADE", "CASCADE"));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new c3.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        c3.e eVar3 = new c3.e("WorkTag", map3, hashSet5, hashSet6);
        c3.e eVarA3 = c3.e.a(cVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new a3.n(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new c3.a("work_spec_id", "TEXT", null, 1, 1, true));
        map4.put("generation", new c3.a("generation", "INTEGER", "0", 2, 1, true));
        map4.put("system_id", new c3.a("system_id", "INTEGER", null, 0, 1, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new c3.b(Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY), "WorkSpec", "CASCADE", "CASCADE"));
        c3.e eVar4 = new c3.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        c3.e eVarA4 = c3.e.a(cVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new a3.n(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put(StackTraceHelper.NAME_KEY, new c3.a(StackTraceHelper.NAME_KEY, "TEXT", null, 1, 1, true));
        map5.put("work_spec_id", new c3.a("work_spec_id", "TEXT", null, 2, 1, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new c3.b(Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY), "WorkSpec", "CASCADE", "CASCADE"));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new c3.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        c3.e eVar5 = new c3.e("WorkName", map5, hashSet8, hashSet9);
        c3.e eVarA5 = c3.e.a(cVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new a3.n(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new c3.a("work_spec_id", "TEXT", null, 1, 1, true));
        map6.put(ReactProgressBarViewManager.PROP_PROGRESS, new c3.a(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", null, 0, 1, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new c3.b(Arrays.asList("work_spec_id"), Arrays.asList(StackTraceHelper.ID_KEY), "WorkSpec", "CASCADE", "CASCADE"));
        c3.e eVar6 = new c3.e("WorkProgress", map6, hashSet10, new HashSet(0));
        c3.e eVarA6 = c3.e.a(cVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new a3.n(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new c3.a("key", "TEXT", null, 1, 1, true));
        map7.put("long_value", new c3.a("long_value", "INTEGER", null, 0, 1, false));
        c3.e eVar7 = new c3.e("Preference", map7, new HashSet(0), new HashSet(0));
        c3.e eVarA7 = c3.e.a(cVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new a3.n(true, (String) null);
        }
        return new a3.n(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7);
    }

    @Override // th.g
    public /* bridge */ /* synthetic */ Object a() {
        return new q1((sh.s) ((th.f) this.f17922d).a());
    }

    @Override // ze.i
    public void accept(Object obj, Object obj2) {
        rf.r rVar = (rf.r) this.f17922d;
        sf.f fVar = new sf.f((ig.g) obj2, 2);
        sf.d dVar = (sf.d) ((sf.e) obj).o();
        ye.f fVarA = bg.c.a();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i7 = bg.b.f3229a;
        parcelObtain.writeStrongBinder(fVar);
        bg.b.b(parcelObtain, rVar);
        bg.b.b(parcelObtain, fVarA);
        ((sf.b) dVar).j(10, parcelObtain);
    }

    @Override // he.l0
    public void b() throws a1 {
        pd.g gVar = (pd.g) this.f17922d;
        gVar.Y.b();
        a1 a1Var = gVar.a0;
        if (a1Var != null) {
            throw a1Var;
        }
    }

    @Override // md.p0
    public void c(q0 q0Var) {
        rd.n nVar = (rd.n) this.f17922d;
        nVar.N.c(nVar);
    }

    @Override // vd.f
    public int f(long j) {
        return -1;
    }

    public void g(vp.d dVar) {
        if (!dVar.i()) {
            if (!(dVar instanceof vp.x)) {
                String strValueOf = String.valueOf(dVar.getClass());
                throw new IllegalArgumentException(com.discord.chat.presentation.list.a.k(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            vp.x xVar = (vp.x) dVar;
            g(xVar.f21925i);
            g(xVar.f21926v);
            return;
        }
        int size = dVar.size();
        int[] iArr = vp.x.E;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i7 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f17922d;
        if (stack.isEmpty() || ((vp.d) stack.peek()).size() >= i7) {
            stack.push(dVar);
            return;
        }
        int i10 = iArr[iBinarySearch];
        vp.d xVar2 = (vp.d) stack.pop();
        while (!stack.isEmpty() && ((vp.d) stack.peek()).size() < i10) {
            xVar2 = new vp.x((vp.d) stack.pop(), xVar2);
        }
        vp.x xVar3 = new vp.x(xVar2, dVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = vp.x.E;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, xVar3.f21924e);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((vp.d) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                xVar3 = new vp.x((vp.d) stack.pop(), xVar3);
            }
        }
        stack.push(xVar3);
    }

    @Override // vd.f
    public long h(int i7) {
        return 0L;
    }

    public void i() {
        rd.n nVar = (rd.n) this.f17922d;
        int i7 = nVar.O - 1;
        nVar.O = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (rd.t tVar : nVar.Q) {
            tVar.f();
            i10 += tVar.f19322f0.f15737d;
        }
        x0[] x0VarArr = new x0[i10];
        int i11 = 0;
        for (rd.t tVar2 : nVar.Q) {
            tVar2.f();
            int i12 = tVar2.f19322f0.f15737d;
            int i13 = 0;
            while (i13 < i12) {
                tVar2.f();
                x0VarArr[i11] = tVar2.f19322f0.a(i13);
                i13++;
                i11++;
            }
        }
        nVar.P = new y0(x0VarArr);
        nVar.N.d(nVar);
    }

    @Override // he.m0
    public Object j(Uri uri, he.n nVar) throws h1 {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.f17922d).newPullParser();
            xmlPullParserNewPullParser.setInput(nVar, null);
            return (ud.c) new ud.g(uri.toString()).e(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            throw h1.b(null, e10);
        }
    }

    @Override // vd.f
    public List l(long j) {
        return (List) this.f17922d;
    }

    public void m() {
        qr.i iVar = (qr.i) this.f17922d;
        iVar.getClass();
        qr.d dVar = qr.d.f19002c;
        byte[] array = iVar.f19018c.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        dVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (dVar) {
            try {
                int i7 = dVar.f19011b;
                if (array.length + i7 < qr.c.f18999a) {
                    dVar.f19011b = i7 + (array.length / 2);
                    dVar.f19010a.addLast(array);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // vd.f
    public int o() {
        return 1;
    }

    public r(Context context) {
        ci.q qVar = new ci.q(context);
        ci.o oVarB = ci.o.b(new e4.l(qVar, ci.o.b(wh.j.f22286b), new i8.c(qVar, wh.j.f22287c)));
        this.f17922d = ci.o.b(new e4.e(25, oVarB, ci.o.b(new pf.b(13, oVarB))));
    }

    public r(int i7) {
        switch (i7) {
            case 9:
                try {
                    this.f17922d = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e10) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
                }
            case 10:
                this.f17922d = new Stack();
                return;
            default:
                this.f17922d = new je.w(10);
                return;
        }
    }
}
