package th;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;
import sh.l0;
import sh.t;
import sh.u;
import sh.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f20770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20771e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20772i;

    public e(u uVar, long j, long j5) {
        this.f20770d = uVar;
        long jF = f(j);
        this.f20771e = jF;
        this.f20772i = f(jF + j5);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InputStream c(long j, long j5) {
        long jF = f(this.f20771e);
        long jF2 = f(j5 + jF) - jF;
        u uVar = this.f20770d;
        TreeMap treeMap = uVar.f20201d;
        if (jF < 0 || jF2 < 0) {
            StringBuilder sbM = kk.b.m(jF, "Invalid input parameters ", ", ");
            sbM.append(jF2);
            throw new l0(sbM.toString());
        }
        long j7 = jF + jF2;
        if (j7 > uVar.c()) {
            StringBuilder sbM2 = kk.b.m(uVar.c(), "Trying to access archive out of bounds. Archive ends at: ", ". Tried accessing: ");
            sbM2.append(j7);
            throw new l0(sbM2.toString());
        }
        Long l6 = (Long) treeMap.floorKey(Long.valueOf(jF));
        Long l7 = (Long) treeMap.floorKey(Long.valueOf(j7));
        if (l6.equals(l7)) {
            return new t(uVar.f(jF, l6), jF2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(uVar.f(jF, l6));
        Collection collectionValues = treeMap.subMap(l6, false, l7, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new y0(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new t(new FileInputStream((File) treeMap.get(l7)), jF2 - (l7.longValue() - jF)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public final long f(long j) {
        if (j < 0) {
            return 0L;
        }
        u uVar = this.f20770d;
        return j > uVar.c() ? uVar.c() : j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
