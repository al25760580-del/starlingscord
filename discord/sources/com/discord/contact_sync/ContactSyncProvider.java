package com.discord.contact_sync;

import a3.e;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ls.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u0004\u0018\u00010\t*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0002J \u0010\u0012\u001a\u0004\u0018\u00010\t*\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"Lcom/discord/contact_sync/ContactSyncProvider;", "", "<init>", "()V", "getContactName", "Lcom/discord/contact_sync/ContactNameEntry;", "context", "Landroid/content/Context;", "contactId", "", "getContactsMap", "", "Lcom/discord/contact_sync/ContactSyncBlobEntry;", "getImageForContactId", "deviceContactId", "getColumnString", "Landroid/database/Cursor;", "columnName", "asBase64BitmapString", "Landroid/net/Uri;", "quality", "", "contact_sync_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContactSyncProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSyncProvider.kt\ncom/discord/contact_sync/ContactSyncProvider\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,169:1\n29#2:170\n*S KotlinDebug\n*F\n+ 1 ContactSyncProvider.kt\ncom/discord/contact_sync/ContactSyncProvider\n*L\n142#1:170\n*E\n"})
public final class ContactSyncProvider {

    @NotNull
    public static final ContactSyncProvider INSTANCE = new ContactSyncProvider();

    private ContactSyncProvider() {
    }

    private final String asBase64BitmapString(Uri uri, Context context, int i7) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        String strEncodeToString = null;
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            return null;
        }
        try {
            FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
            if (fileDescriptor != null) {
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeFileDescriptor.compress(Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            assetFileDescriptorOpenAssetFileDescriptor.close();
            return strEncodeToString;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(assetFileDescriptorOpenAssetFileDescriptor, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String asBase64BitmapString$default(ContactSyncProvider contactSyncProvider, Uri uri, Context context, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 100;
        }
        return contactSyncProvider.asBase64BitmapString(uri, context, i7);
    }

    private final String getColumnString(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    private final ContactNameEntry getContactName(Context context, String contactId) {
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, e.l("mimetype = ? AND contact_id = ", contactId), new String[]{"vnd.android.cursor.item/name"}, null);
        String columnString = null;
        if (cursorQuery == null) {
            return null;
        }
        String columnString2 = null;
        while (cursorQuery.moveToNext()) {
            try {
                columnString = getColumnString(cursorQuery, "data2");
            } catch (Exception unused) {
            }
            try {
                columnString2 = getColumnString(cursorQuery, "data3");
            } catch (Exception unused2) {
            }
            if ((columnString != null && columnString.length() != 0) || (columnString2 != null && columnString2.length() != 0)) {
                break;
            }
        }
        cursorQuery.close();
        return new ContactNameEntry(columnString, columnString2);
    }

    @NotNull
    public final Map<String, ContactSyncBlobEntry> getContactsMap(@NotNull Context context) {
        String familyName;
        String givenName;
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id", "data4", "display_name", "photo_file_id", "contact_id"}, null, null, null);
        if (cursorQuery == null) {
            return linkedHashMap;
        }
        while (cursorQuery.moveToNext()) {
            String columnString = getColumnString(cursorQuery, "display_name");
            String columnString2 = getColumnString(cursorQuery, "data4");
            String columnString3 = getColumnString(cursorQuery, "_id");
            String columnString4 = getColumnString(cursorQuery, "contact_id");
            if (columnString3 != null && columnString4 != null) {
                ContactNameEntry contactName = getContactName(context, columnString4);
                String str = (contactName == null || (givenName = contactName.getGivenName()) == null) ? "" : givenName;
                String str2 = (contactName == null || (familyName = contactName.getFamilyName()) == null) ? "" : familyName;
                boolean z5 = getColumnString(cursorQuery, "photo_file_id") != null;
                if (columnString2 != null) {
                }
            }
        }
        cursorQuery.close();
        return linkedHashMap;
    }

    public final String getImageForContactId(@NotNull Context context, @NotNull String deviceContactId) throws IOException {
        Uri uri;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceContactId, "deviceContactId");
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id", "photo_thumb_uri"}, "_id = ?", new String[]{deviceContactId}, null);
        String strAsBase64BitmapString$default = null;
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                ContactSyncProvider contactSyncProvider = INSTANCE;
                String columnString = contactSyncProvider.getColumnString(cursorQuery, "photo_thumb_uri");
                if (columnString != null && (uri = Uri.parse(columnString)) != null) {
                    strAsBase64BitmapString$default = asBase64BitmapString$default(contactSyncProvider, uri, context, 0, 2, null);
                }
            }
            cursorQuery.close();
            return strAsBase64BitmapString$default;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(cursorQuery, th2);
                throw th3;
            }
        }
    }
}
