package kr;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List missingFields, String str, b bVar) {
        super(str, bVar);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f14797d = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String serialName, ArrayList missingFields) {
        String strL;
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        if (missingFields.size() == 1) {
            strL = com.discord.chat.presentation.list.a.l(new StringBuilder("Field '"), (String) missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing");
        } else {
            strL = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, strL, null);
    }
}
