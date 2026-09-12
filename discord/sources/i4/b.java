package i4;

import a5.l0;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import e4.g;
import e4.i;
import e4.j;
import e4.l;
import e4.o;
import e4.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11389a;

    static {
        String strF = q.f("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strF, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f11389a = strF;
    }

    public static final String a(l lVar, r rVar, i iVar, ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            j jVarH = a.a.h(oVar);
            String str = oVar.f7998a;
            g gVarO = iVar.o(jVarH);
            Integer numValueOf = gVarO != null ? Integer.valueOf(gVarO.f7976c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f7989e;
            a3.o oVarG = a3.o.g(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                oVarG.R(1);
            } else {
                oVarG.o(1, str);
            }
            workDatabase_Impl.b();
            Cursor cursorM = l0.M(workDatabase_Impl, oVarG);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM.getCount());
                while (cursorM.moveToNext()) {
                    arrayList2.add(cursorM.isNull(0) ? null : cursorM.getString(0));
                }
                cursorM.close();
                oVarG.i();
                String strO = CollectionsKt.O(arrayList2, ",", null, null, null, 62);
                String strO2 = CollectionsKt.O(rVar.I(str), ",", null, null, null, 62);
                StringBuilder sbN = com.discord.chat.presentation.list.a.n(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, str, "\t ");
                com.discord.chat.presentation.list.a.r(numValueOf, oVar.f8000c, "\t ", "\t ", sbN);
                sbN.append(oVar.f7999b.name());
                sbN.append("\t ");
                sbN.append(strO);
                sbN.append("\t ");
                sbN.append(strO2);
                sbN.append('\t');
                sb2.append(sbN.toString());
            } catch (Throwable th2) {
                cursorM.close();
                oVarG.i();
                throw th2;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
