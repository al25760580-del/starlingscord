package ol;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17452a;

    public f(LinkedHashMap uriMap) {
        Intrinsics.checkNotNullParameter(uriMap, "uriMap");
        this.f17452a = uriMap;
    }

    public static Serializable a(Cursor cursor, String str, Class cls) {
        Serializable serializableO;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        try {
            q qVar = Result.f14614e;
            if (Intrinsics.areEqual(cls, String.class)) {
                serializableO = cursor.getString(columnIndex);
            } else if (Intrinsics.areEqual(cls, Integer.TYPE)) {
                serializableO = Integer.valueOf(cursor.getInt(columnIndex));
            } else if (Intrinsics.areEqual(cls, Long.TYPE)) {
                serializableO = Long.valueOf(cursor.getLong(columnIndex));
            } else if (Intrinsics.areEqual(cls, Double.TYPE)) {
                serializableO = Double.valueOf(cursor.getDouble(columnIndex));
            } else {
                serializableO = Intrinsics.areEqual(cls, Float.TYPE) ? Float.valueOf(cursor.getFloat(columnIndex)) : null;
            }
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            serializableO = ib.a.o(th2);
        }
        if (serializableO instanceof r) {
            return null;
        }
        return serializableO;
    }

    public static void b(ContentResolver contentResolver, b metadataBuilder, boolean z5) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(metadataBuilder, "metadataBuilder");
        try {
            c(contentResolver, metadataBuilder, z5);
        } catch (Exception e10) {
            Throwable[] suppressed = e10.getSuppressed();
            Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
            String strA = y.A(suppressed, "; ", null, null, new n6.e(4), 30);
            String simpleName = e10.getClass().getSimpleName();
            String message = e10.getMessage();
            if (message == null) {
                message = "no message";
            }
            metadataBuilder.f17437e = com.discord.chat.presentation.list.a.k(a3.e.u("Could not read file metadata: ", simpleName, ": ", message, " (suppressed summary: ["), strA, "])");
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    public static void c(ContentResolver contentResolver, b bVar, boolean z5) throws IOException {
        Uri uri = bVar.f17433a;
        boolean z6 = true;
        boolean z7 = bVar.f17436d != null;
        ArrayList arrayListI = d0.i("_display_name", "_size");
        if (z5) {
            arrayListI.add("flags");
        }
        if (!z7) {
            arrayListI.add("mime_type");
        }
        Cursor cursorQuery = contentResolver.query(uri, (String[]) arrayListI.toArray(new String[0]), null, null, null);
        try {
            if (cursorQuery == null) {
                bVar.f17437e = "Could not read file metadata because cursor was null. This is likely an issue with the underlying ContentProvider.";
                ls.d.k(cursorQuery, null);
                return;
            }
            if (!cursorQuery.moveToFirst()) {
                int count = cursorQuery.getCount();
                String[] columnNames = cursorQuery.getColumnNames();
                Intrinsics.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
                bVar.f17437e = "Could not read file metadata because cursor could not move to the first result row. This is likely an issue with the underlying ContentProvider. Row count: " + count + ", columns: " + y.A(columnNames, ",", null, null, null, 62);
                cursorQuery.close();
                return;
            }
            bVar.f17434b = (String) a(cursorQuery, "_display_name", String.class);
            bVar.f17435c = (Long) a(cursorQuery, "_size", Long.TYPE);
            if (!z7) {
                bVar.f17436d = (String) a(cursorQuery, "mime_type", String.class);
            }
            if (z5) {
                Integer num = (Integer) a(cursorQuery, "flags", Integer.TYPE);
                if (((num != null ? num.intValue() : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            bVar.f17441i = Boolean.valueOf(z6);
            Unit unit = Unit.f14616a;
            cursorQuery.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorQuery, th2);
                throw th3;
            }
        }
    }
}
