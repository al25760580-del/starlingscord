package e4;

import a5.l0;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v3.y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a3.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, boolean z5, int i7) {
        super(workDatabase);
        this.f7964e = i7;
    }

    @Override // a3.r
    public final String c() {
        switch (this.f7964e) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void f(h3.j jVar, Object obj) throws Throwable {
        int i7;
        int i10;
        byte[] byteArray;
        int i11 = 3;
        switch (this.f7964e) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f7962a;
                if (str == null) {
                    jVar.R(1);
                } else {
                    jVar.o(1, str);
                }
                String str2 = aVar.f7963b;
                if (str2 == null) {
                    jVar.R(2);
                    return;
                } else {
                    jVar.o(2, str2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                jVar.o(1, dVar.f7968a);
                jVar.x(2, dVar.f7969b.longValue());
                return;
            case 2:
                g gVar = (g) obj;
                String str3 = gVar.f7974a;
                if (str3 == null) {
                    jVar.R(1);
                } else {
                    jVar.o(1, str3);
                }
                jVar.x(2, gVar.f7975b);
                jVar.x(3, gVar.f7976c);
                return;
            case 3:
                k kVar = (k) obj;
                String str4 = kVar.f7986a;
                if (str4 == null) {
                    jVar.R(1);
                } else {
                    jVar.o(1, str4);
                }
                String str5 = kVar.f7987b;
                if (str5 == null) {
                    jVar.R(2);
                    return;
                } else {
                    jVar.o(2, str5);
                    return;
                }
            case 4:
                throw new ClassCastException();
            case 5:
                o oVar = (o) obj;
                String str6 = oVar.f7998a;
                if (str6 == null) {
                    jVar.R(1);
                } else {
                    jVar.o(1, str6);
                }
                jVar.x(2, l0.P(oVar.f7999b));
                String str7 = oVar.f8000c;
                if (str7 == null) {
                    jVar.R(3);
                } else {
                    jVar.o(3, str7);
                }
                String str8 = oVar.f8001d;
                if (str8 == null) {
                    jVar.R(4);
                } else {
                    jVar.o(4, str8);
                }
                byte[] bArrB = v3.g.b(oVar.f8002e);
                if (bArrB == null) {
                    jVar.R(5);
                } else {
                    jVar.F(bArrB, 5);
                }
                byte[] bArrB2 = v3.g.b(oVar.f8003f);
                if (bArrB2 == null) {
                    jVar.R(6);
                } else {
                    jVar.F(bArrB2, 6);
                }
                jVar.x(7, oVar.f8004g);
                jVar.x(8, oVar.f8005h);
                jVar.x(9, oVar.f8006i);
                jVar.x(10, oVar.k);
                v3.a backoffPolicy = oVar.f8007l;
                Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                int iOrdinal = backoffPolicy.ordinal();
                if (iOrdinal == 0) {
                    i7 = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new rn.n();
                    }
                    i7 = 1;
                }
                jVar.x(11, i7);
                jVar.x(12, oVar.f8008m);
                jVar.x(13, oVar.f8009n);
                jVar.x(14, oVar.f8010o);
                jVar.x(15, oVar.f8011p);
                jVar.x(16, oVar.f8012q ? 1L : 0L);
                y policy = oVar.f8013r;
                Intrinsics.checkNotNullParameter(policy, "policy");
                int iOrdinal2 = policy.ordinal();
                if (iOrdinal2 == 0) {
                    i10 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new rn.n();
                    }
                    i10 = 1;
                }
                jVar.x(17, i10);
                jVar.x(18, oVar.f8014s);
                jVar.x(19, oVar.f8015t);
                jVar.x(20, oVar.f8016u);
                jVar.x(21, oVar.f8017v);
                jVar.x(22, oVar.f8018w);
                v3.e eVar = oVar.j;
                if (eVar == null) {
                    jVar.R(23);
                    jVar.R(24);
                    jVar.R(25);
                    jVar.R(26);
                    jVar.R(27);
                    jVar.R(28);
                    jVar.R(29);
                    jVar.R(30);
                    return;
                }
                v3.r networkType = eVar.f21394a;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                int iOrdinal3 = networkType.ordinal();
                if (iOrdinal3 == 0) {
                    i11 = 0;
                } else if (iOrdinal3 == 1) {
                    i11 = 1;
                } else if (iOrdinal3 == 2) {
                    i11 = 2;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 4) {
                        i11 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || networkType != v3.r.f21425x) {
                            throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                        }
                        i11 = 5;
                    }
                }
                jVar.x(23, i11);
                jVar.x(24, eVar.f21395b ? 1L : 0L);
                jVar.x(25, eVar.f21396c ? 1L : 0L);
                jVar.x(26, eVar.f21397d ? 1L : 0L);
                jVar.x(27, eVar.f21398e ? 1L : 0L);
                jVar.x(28, eVar.f21399f);
                jVar.x(29, eVar.f21400g);
                Set<v3.d> triggers = eVar.f21401h;
                Intrinsics.checkNotNullParameter(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (v3.d dVar2 : triggers) {
                                objectOutputStream.writeUTF(dVar2.f21391a.toString());
                                objectOutputStream.writeBoolean(dVar2.f21392b);
                            }
                            Unit unit = Unit.f14616a;
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ls.d.k(objectOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ls.d.k(byteArrayOutputStream, th4);
                            throw th5;
                        }
                    }
                }
                if (byteArray == null) {
                    jVar.R(30);
                    return;
                } else {
                    jVar.F(byteArray, 30);
                    return;
                }
            default:
                q qVar = (q) obj;
                String str9 = qVar.f8031a;
                if (str9 == null) {
                    jVar.R(1);
                } else {
                    jVar.o(1, str9);
                }
                String str10 = qVar.f8032b;
                if (str10 == null) {
                    jVar.R(2);
                    return;
                } else {
                    jVar.o(2, str10);
                    return;
                }
        }
    }

    public final void g(Object obj) {
        h3.j jVarA = a();
        try {
            f(jVarA, obj);
            jVarA.f10324e.executeInsert();
        } finally {
            e(jVarA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WorkDatabase database) {
        super(database);
        this.f7964e = 1;
        Intrinsics.checkNotNullParameter(database, "database");
    }
}
