package mr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f16046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f16048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16051g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f16045a = serialName;
        this.f16046b = n0.f14659d;
        this.f16047c = new ArrayList();
        this.f16048d = new HashSet();
        this.f16049e = new ArrayList();
        this.f16050f = new ArrayList();
        this.f16051g = new ArrayList();
    }

    public static void a(a aVar, String elementName, SerialDescriptor descriptor) {
        n0 annotations = n0.f14659d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!aVar.f16048d.add(elementName)) {
            StringBuilder sbN = com.discord.chat.presentation.list.a.n("Element with name '", elementName, "' is already registered in ");
            sbN.append(aVar.f16045a);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        aVar.f16047c.add(elementName);
        aVar.f16049e.add(descriptor);
        aVar.f16050f.add(annotations);
        aVar.f16051g.add(false);
    }
}
