package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import fk.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x9.a0;
import x9.b;
import x9.b0;
import x9.c;
import x9.d;
import x9.d0;
import x9.z;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
@a
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f4742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f4743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f4747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f4748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f4749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pf.b f4750i;

    @a
    public Collator(List<String> list, Map<String, Object> map) throws ag.b {
        this.f4745d = "default";
        pf.b bVar = new pf.b();
        bVar.f18027e = null;
        this.f4750i = bVar;
        this.f4742a = (d) x9.a.l(d.class, (String) x9.a.d(map, "usage", 2, x9.a.f22663d, "sort"));
        HashMap map2 = new HashMap();
        map2.put("localeMatcher", x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit"));
        a0 a0Var = x9.a.f22664e;
        Object objD = x9.a.d(map, "numeric", 1, a0Var, a0Var);
        map2.put("kn", objD instanceof a0 ? objD : String.valueOf(((Boolean) objD).booleanValue()));
        map2.put("kf", x9.a.d(map, "caseFirst", 2, x9.a.f22662c, a0Var));
        HashMap mapK = x9.a.k(list, map2, Arrays.asList("co", "kf", "kn"));
        b0 b0Var = (b0) mapK.get("locale");
        this.f4748g = b0Var;
        this.f4749h = b0Var.a();
        Object objC = x9.a.c(mapK, "co");
        this.f4745d = (String) (objC instanceof z ? "default" : objC);
        Object objC2 = x9.a.c(mapK, "kn");
        if (objC2 instanceof z) {
            this.f4746e = false;
        } else {
            this.f4746e = Boolean.parseBoolean((String) objC2);
        }
        String strC = x9.a.c(mapK, "kf");
        this.f4747f = (b) x9.a.l(b.class, (String) (strC instanceof z ? "false" : strC));
        if (this.f4742a == d.f22682e) {
            b0 b0Var2 = this.f4748g;
            b0Var2.b();
            i iVar = d0.f22684a;
            String str = iVar.containsKey("collation") ? (String) iVar.get("collation") : "collation";
            ArrayList arrayList = new ArrayList();
            String keywordValue = b0Var2.f22667a.getKeywordValue(str);
            if (keywordValue != null && !keywordValue.isEmpty()) {
                Collections.addAll(arrayList, keywordValue.split("-|_"));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(d0.b((String) it.next()));
            }
            arrayList2.add(d0.b("search"));
            this.f4748g.e("co", arrayList2);
        }
        Object objD2 = x9.a.d(map, "sensitivity", 2, x9.a.f22661b, a0Var);
        if (!(objD2 instanceof a0)) {
            this.f4743b = (c) x9.a.l(c.class, (String) objD2);
        } else if (this.f4742a == d.f22681d) {
            this.f4743b = c.f22673v;
        } else {
            this.f4743b = c.f22674w;
        }
        this.f4744c = ((Boolean) x9.a.d(map, "ignorePunctuation", 1, a0Var, Boolean.FALSE)).booleanValue();
        pf.b bVar2 = this.f4750i;
        b0 b0Var3 = this.f4748g;
        b0Var3.b();
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(b0Var3.f22667a);
        bVar2.f18027e = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        if (this.f4746e) {
            ((RuleBasedCollator) bVar2.f18027e).setNumericCollation(true);
        }
        int iOrdinal = this.f4747f.ordinal();
        if (iOrdinal == 0) {
            ((RuleBasedCollator) bVar2.f18027e).setUpperCaseFirst(true);
        } else if (iOrdinal != 1) {
            ((RuleBasedCollator) bVar2.f18027e).setCaseFirstDefault();
        } else {
            ((RuleBasedCollator) bVar2.f18027e).setLowerCaseFirst(true);
        }
        int iOrdinal2 = this.f4743b.ordinal();
        if (iOrdinal2 == 0) {
            ((RuleBasedCollator) bVar2.f18027e).setStrength(0);
        } else if (iOrdinal2 == 1) {
            ((RuleBasedCollator) bVar2.f18027e).setStrength(1);
        } else if (iOrdinal2 == 2) {
            ((RuleBasedCollator) bVar2.f18027e).setStrength(0);
            ((RuleBasedCollator) bVar2.f18027e).setCaseLevel(true);
        } else if (iOrdinal2 == 3) {
            ((RuleBasedCollator) bVar2.f18027e).setStrength(2);
        }
        if (this.f4744c) {
            ((RuleBasedCollator) bVar2.f18027e).setAlternateHandlingShifted(true);
        }
    }

    @a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return ((String) x9.a.d(map, "localeMatcher", 2, x9.a.f22660a, "best fit")).equals("best fit") ? Arrays.asList(x9.a.f((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(x9.a.j((String[]) list.toArray(new String[list.size()])));
    }

    @a
    public double compare(String str, String str2) {
        return ((RuleBasedCollator) this.f4750i.f18027e).compare(str, str2);
    }

    @a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f4749h.f().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f4742a.toString());
        c cVar = this.f4743b;
        c cVar2 = c.f22674w;
        if (cVar == cVar2) {
            pf.b bVar = this.f4750i;
            RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) bVar.f18027e;
            if (ruleBasedCollator != null) {
                int strength = ruleBasedCollator.getStrength();
                if (strength == 0) {
                    cVar2 = ((RuleBasedCollator) bVar.f18027e).isCaseLevel() ? c.f22672i : c.f22670d;
                } else {
                    cVar2 = strength == 1 ? c.f22671e : c.f22673v;
                }
            }
            linkedHashMap.put("sensitivity", cVar2.toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f4744c));
        linkedHashMap.put("collation", this.f4745d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f4746e));
        linkedHashMap.put("caseFirst", this.f4747f.toString());
        return linkedHashMap;
    }
}
