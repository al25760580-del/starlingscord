package com.discord.crash_reporting;

import a3.e;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.discord.logging.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import rn.n;
import rn.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 L2\u00020\u0001:\u0004IJKLB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000bH\u0002J5\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020\u0019J\u0019\u0010.\u001a\u0004\u0018\u00010\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010/J9\u00100\u001a\u0014\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u00020203012\u0006\u00104\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u00105J'\u00106\u001a\u0002072\u0006\u00104\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\u0019H\u0002J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010A\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010B\u001a\u0002022\u0006\u0010!\u001a\u00020\u001cH\u0002J\u001a\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010E\u001a\u0002022\u0006\u0010F\u001a\u00020\u000bH\u0002J\u0018\u0010G\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u0006\u0010H\u001a\u000202H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/discord/crash_reporting/TelemetryRingSqliteStore;", "", "context", "Landroid/content/Context;", "evictionBudget", "Lcom/discord/crash_reporting/TelemetryRingTypes$Budget;", "<init>", "(Landroid/content/Context;Lcom/discord/crash_reporting/TelemetryRingTypes$Budget;)V", "capacity", "", "byteLimit", "", "Ljava/lang/Long;", "dbHelper", "Lcom/discord/crash_reporting/TelemetryRingSqliteStore$DbHelper;", "slotSeq", "", "slotSize", "", "head", "tail", "count", "totalBytes", "nextSeq", "append", "", "entries", "", "Lcom/discord/crash_reporting/TelemetryRingSqliteStore$EntryPayload;", "appendEntry", "updateSlot", "Landroid/database/sqlite/SQLiteStatement;", "clearSlot", "entry", "evictIfNeeded", "limit", "snapshot", "Lcom/discord/crash_reporting/TelemetryRingTypes$Snapshot;", TelemetryRingSqliteStore.KEY_CHANNEL_MASK, "", "Lcom/discord/crash_reporting/TelemetryRingTypes$Channel;", "beforeOffset", "snapshotBudget", "ackedEndOffset", "(Ljava/util/Set;JLcom/discord/crash_reporting/TelemetryRingTypes$Budget;Ljava/lang/Long;)Lcom/discord/crash_reporting/TelemetryRingTypes$Snapshot;", "clear", "effectiveAckedEndOffset", "(Ljava/lang/Long;)Ljava/lang/Long;", "buildSelection", "Lkotlin/Pair;", "", "", "requestedMask", "(IJLjava/lang/Long;)Lkotlin/Pair;", "hasMore", "", "(IJLjava/lang/Long;)Z", "loadState", "ensureSchema", "db", "Landroid/database/sqlite/SQLiteDatabase;", "resetSchema", "loadSlots", "readMeta", "Lcom/discord/crash_reporting/TelemetryRingSqliteStore$MetaState;", "updateMeta", "buildPayloadJson", "decodePayload", "Lcom/discord/crash_reporting/TelemetryRingTypes$LogEntry;", "payload", "seq", "tableExists", "table", "EntryPayload", "MetaState", "DbHelper", "Companion", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTelemetryRingSqliteStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelemetryRingSqliteStore.kt\ncom/discord/crash_reporting/TelemetryRingSqliteStore\n+ 2 SQLiteDatabase.kt\nandroidx/core/database/sqlite/SQLiteDatabaseKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,628:1\n27#2,11:629\n38#2,4:642\n27#2,15:650\n27#2,15:669\n1869#3,2:640\n1803#3,3:647\n1#4:646\n37#5:665\n36#5,3:666\n*S KotlinDebug\n*F\n+ 1 TelemetryRingSqliteStore.kt\ncom/discord/crash_reporting/TelemetryRingSqliteStore\n*L\n49#1:629,11\n49#1:642,4\n241#1:650,15\n322#1:669,15\n56#1:640,2\n152#1:647,3\n287#1:665\n287#1:666,3\n*E\n"})
public final class TelemetryRingSqliteStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DATABASE_NAME = "telemetry_ring.db";
    private static final int DATABASE_VERSION = 1;
    private static final int DEFAULT_SLOT_CAPACITY = 10000;

    @NotNull
    private static final String KEY_CHANNEL_MASK = "channels";

    @NotNull
    private static final String KEY_DATA = "data";

    @NotNull
    private static final String KEY_KEY = "key";

    @NotNull
    private static final String KEY_MESSAGE = "message";

    @NotNull
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final int META_ROW_ID = 1;

    @NotNull
    private static final String PRAGMA_SYNC_NORMAL = "PRAGMA synchronous=NORMAL";

    @NotNull
    private static final String PRAGMA_WAL = "PRAGMA journal_mode=WAL";

    @NotNull
    private static final String TABLE_META = "telemetry_ring_meta";

    @NotNull
    private static final String TABLE_SLOTS = "telemetry_ring_slots";

    @NotNull
    private static final String TAG = "TelemetryRingSqlite";
    private final Long byteLimit;
    private final int capacity;
    private int count;

    @NotNull
    private final DbHelper dbHelper;
    private int head;
    private long nextSeq;

    @NotNull
    private final long[] slotSeq;

    @NotNull
    private final int[] slotSize;
    private int tail;
    private long totalBytes;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/crash_reporting/TelemetryRingSqliteStore$Companion;", "", "<init>", "()V", "TAG", "", "DATABASE_NAME", "DATABASE_VERSION", "", "DEFAULT_SLOT_CAPACITY", "TABLE_SLOTS", "TABLE_META", "META_ROW_ID", "KEY_KEY", "KEY_TIMESTAMP", "KEY_MESSAGE", "KEY_DATA", "KEY_CHANNEL_MASK", "PRAGMA_WAL", "PRAGMA_SYNC_NORMAL", "createSchema", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "capacity", "prepopulateSlots", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void createSchema(SQLiteDatabase db, int capacity) {
            db.execSQL("CREATE TABLE telemetry_ring_slots (slot_id INTEGER PRIMARY KEY, seq INTEGER NOT NULL, channel_mask INTEGER NOT NULL, payload_json TEXT, payload_size INTEGER NOT NULL)");
            db.execSQL("CREATE TABLE telemetry_ring_meta (id INTEGER PRIMARY KEY CHECK (id=1), head INTEGER NOT NULL, tail INTEGER NOT NULL, count INTEGER NOT NULL, total_bytes INTEGER NOT NULL, next_seq INTEGER NOT NULL, capacity INTEGER NOT NULL)");
            db.execSQL("CREATE INDEX idx_ring_seq ON telemetry_ring_slots(seq)");
            ContentValues contentValues = new ContentValues();
            contentValues.put(StackTraceHelper.ID_KEY, (Integer) 1);
            contentValues.put("head", (Integer) (-1));
            contentValues.put("tail", (Integer) 0);
            contentValues.put("count", (Integer) 0);
            contentValues.put("total_bytes", (Integer) 0);
            contentValues.put("next_seq", (Integer) 1);
            contentValues.put("capacity", Integer.valueOf(capacity));
            db.insert(TelemetryRingSqliteStore.TABLE_META, null, contentValues);
            prepopulateSlots(db, capacity);
        }

        private final void prepopulateSlots(SQLiteDatabase db, int capacity) {
            ContentValues contentValues = new ContentValues();
            for (int i7 = 0; i7 < capacity; i7++) {
                contentValues.clear();
                contentValues.put("slot_id", Integer.valueOf(i7));
                contentValues.put("seq", (Integer) 0);
                contentValues.put("channel_mask", (Integer) 0);
                contentValues.putNull("payload_json");
                contentValues.put("payload_size", (Integer) 0);
                db.insert(TelemetryRingSqliteStore.TABLE_SLOTS, null, contentValues);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/crash_reporting/TelemetryRingSqliteStore$DbHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "capacity", "", "<init>", "(Landroid/content/Context;I)V", "onConfigure", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onOpen", "onCreate", "onUpgrade", "oldVersion", "newVersion", "applyPragma", "pragma", "", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTelemetryRingSqliteStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelemetryRingSqliteStore.kt\ncom/discord/crash_reporting/TelemetryRingSqliteStore$DbHelper\n+ 2 SQLiteDatabase.kt\nandroidx/core/database/sqlite/SQLiteDatabaseKt\n*L\n1#1,628:1\n27#2,15:629\n*S KotlinDebug\n*F\n+ 1 TelemetryRingSqliteStore.kt\ncom/discord/crash_reporting/TelemetryRingSqliteStore$DbHelper\n*L\n508#1:629,15\n*E\n"})
    public static final class DbHelper extends SQLiteOpenHelper {
        private final int capacity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DbHelper(@NotNull Context context, int i7) {
            super(context, TelemetryRingSqliteStore.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
            Intrinsics.checkNotNullParameter(context, "context");
            this.capacity = i7;
        }

        private final void applyPragma(SQLiteDatabase db, String pragma) {
            Cursor cursorRawQuery = db.rawQuery(pragma, null);
            try {
                cursorRawQuery.moveToFirst();
                ls.d.k(cursorRawQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(cursorRawQuery, th2);
                    throw th3;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.enableWriteAheadLogging();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.beginTransaction();
            try {
                TelemetryRingSqliteStore.INSTANCE.createSchema(db, this.capacity);
                Unit unit = Unit.f14616a;
                db.setTransactionSuccessful();
            } finally {
                db.endTransaction();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            super.onOpen(db);
            applyPragma(db, TelemetryRingSqliteStore.PRAGMA_WAL);
            applyPragma(db, TelemetryRingSqliteStore.PRAGMA_SYNC_NORMAL);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("DROP TABLE IF EXISTS telemetry_ring_slots");
            db.execSQL("DROP TABLE IF EXISTS telemetry_ring_meta");
            onCreate(db);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/discord/crash_reporting/TelemetryRingSqliteStore$EntryPayload;", "", TelemetryRingSqliteStore.KEY_KEY, "", "timestampMs", "", "message", TelemetryRingSqliteStore.KEY_DATA, "", "channelMask", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;I)V", "getKey", "()Ljava/lang/String;", "getTimestampMs", "()J", "getMessage", "getData", "()Ljava/util/Map;", "getChannelMask", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EntryPayload {
        private final int channelMask;
        private final Map<String, Object> data;

        @NotNull
        private final String key;
        private final String message;
        private final long timestampMs;

        public EntryPayload(@NotNull String key, long j, String str, Map<String, ? extends Object> map, int i7) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.timestampMs = j;
            this.message = str;
            this.data = map;
            this.channelMask = i7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EntryPayload copy$default(EntryPayload entryPayload, String str, long j, String str2, Map map, int i7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = entryPayload.key;
            }
            if ((i10 & 2) != 0) {
                j = entryPayload.timestampMs;
            }
            if ((i10 & 4) != 0) {
                str2 = entryPayload.message;
            }
            if ((i10 & 8) != 0) {
                map = entryPayload.data;
            }
            if ((i10 & 16) != 0) {
                i7 = entryPayload.channelMask;
            }
            int i11 = i7;
            String str3 = str2;
            return entryPayload.copy(str, j, str3, map, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, Object> component4() {
            return this.data;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getChannelMask() {
            return this.channelMask;
        }

        @NotNull
        public final EntryPayload copy(@NotNull String key, long timestampMs, String message, Map<String, ? extends Object> data, int channelMask) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new EntryPayload(key, timestampMs, message, data, channelMask);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryPayload)) {
                return false;
            }
            EntryPayload entryPayload = (EntryPayload) other;
            return Intrinsics.areEqual(this.key, entryPayload.key) && this.timestampMs == entryPayload.timestampMs && Intrinsics.areEqual(this.message, entryPayload.message) && Intrinsics.areEqual(this.data, entryPayload.data) && this.channelMask == entryPayload.channelMask;
        }

        public final int getChannelMask() {
            return this.channelMask;
        }

        public final Map<String, Object> getData() {
            return this.data;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public final String getMessage() {
            return this.message;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            int iH = com.discord.chat.presentation.list.a.h(this.timestampMs, this.key.hashCode() * 31, 31);
            String str = this.message;
            int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, Object> map = this.data;
            return Integer.hashCode(this.channelMask) + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "EntryPayload(key=" + this.key + ", timestampMs=" + this.timestampMs + ", message=" + this.message + ", data=" + this.data + ", channelMask=" + this.channelMask + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/discord/crash_reporting/TelemetryRingSqliteStore$MetaState;", "", "head", "", "tail", "count", "totalBytes", "", "nextSeq", "<init>", "(IIIJJ)V", "getHead", "()I", "getTail", "getCount", "getTotalBytes", "()J", "getNextSeq", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MetaState {
        private final int count;
        private final int head;
        private final long nextSeq;
        private final int tail;
        private final long totalBytes;

        public MetaState(int i7, int i10, int i11, long j, long j5) {
            this.head = i7;
            this.tail = i10;
            this.count = i11;
            this.totalBytes = j;
            this.nextSeq = j5;
        }

        public static /* synthetic */ MetaState copy$default(MetaState metaState, int i7, int i10, int i11, long j, long j5, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i7 = metaState.head;
            }
            if ((i12 & 2) != 0) {
                i10 = metaState.tail;
            }
            if ((i12 & 4) != 0) {
                i11 = metaState.count;
            }
            if ((i12 & 8) != 0) {
                j = metaState.totalBytes;
            }
            if ((i12 & 16) != 0) {
                j5 = metaState.nextSeq;
            }
            long j7 = j5;
            int i13 = i11;
            return metaState.copy(i7, i10, i13, j, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHead() {
            return this.head;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTail() {
            return this.tail;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTotalBytes() {
            return this.totalBytes;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getNextSeq() {
            return this.nextSeq;
        }

        @NotNull
        public final MetaState copy(int head, int tail, int count, long totalBytes, long nextSeq) {
            return new MetaState(head, tail, count, totalBytes, nextSeq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetaState)) {
                return false;
            }
            MetaState metaState = (MetaState) other;
            return this.head == metaState.head && this.tail == metaState.tail && this.count == metaState.count && this.totalBytes == metaState.totalBytes && this.nextSeq == metaState.nextSeq;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getHead() {
            return this.head;
        }

        public final long getNextSeq() {
            return this.nextSeq;
        }

        public final int getTail() {
            return this.tail;
        }

        public final long getTotalBytes() {
            return this.totalBytes;
        }

        public int hashCode() {
            return Long.hashCode(this.nextSeq) + com.discord.chat.presentation.list.a.h(this.totalBytes, com.discord.chat.presentation.list.a.u(this.count, com.discord.chat.presentation.list.a.u(this.tail, Integer.hashCode(this.head) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.head;
            int i10 = this.tail;
            int i11 = this.count;
            long j = this.totalBytes;
            long j5 = this.nextSeq;
            StringBuilder sbR = e.r(i7, "MetaState(head=", i10, ", tail=", ", count=");
            sbR.append(i11);
            sbR.append(", totalBytes=");
            sbR.append(j);
            sbR.append(", nextSeq=");
            sbR.append(j5);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TelemetryRingTypes.BudgetType.values().length];
            try {
                iArr[TelemetryRingTypes.BudgetType.ROWS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TelemetryRingTypes.BudgetType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TelemetryRingSqliteStore(@NotNull Context context, @NotNull TelemetryRingTypes.Budget evictionBudget) {
        int i7;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(evictionBudget, "evictionBudget");
        int i10 = WhenMappings.$EnumSwitchMapping$0[evictionBudget.getType().ordinal()];
        if (i10 == 1) {
            int limit = (int) evictionBudget.getLimit();
            i7 = limit >= 1 ? limit : 1;
        } else {
            if (i10 != 2) {
                throw new n();
            }
            i7 = DEFAULT_SLOT_CAPACITY;
        }
        this.capacity = i7;
        this.byteLimit = evictionBudget.getType() == TelemetryRingTypes.BudgetType.BYTES ? Long.valueOf(evictionBudget.getLimit()) : null;
        this.dbHelper = new DbHelper(context, i7);
        this.slotSeq = new long[i7];
        this.slotSize = new int[i7];
        this.head = -1;
        this.nextSeq = 1L;
        loadState();
    }

    private final void appendEntry(SQLiteStatement updateSlot, SQLiteStatement clearSlot, EntryPayload entry) throws JSONException {
        String strBuildPayloadJson = buildPayloadJson(entry);
        byte[] bytes = strBuildPayloadJson.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        int i7 = this.head;
        int i10 = i7 < 0 ? 0 : (i7 + 1) % this.capacity;
        long j = this.slotSeq[i10];
        int i11 = this.slotSize[i10];
        updateSlot.clearBindings();
        updateSlot.bindLong(1, this.nextSeq);
        updateSlot.bindLong(2, entry.getChannelMask());
        updateSlot.bindString(3, strBuildPayloadJson);
        long j5 = length;
        updateSlot.bindLong(4, j5);
        updateSlot.bindLong(5, i10);
        updateSlot.executeUpdateDelete();
        long[] jArr = this.slotSeq;
        long j7 = this.nextSeq;
        jArr[i10] = j7;
        this.slotSize[i10] = length;
        this.head = i10;
        this.nextSeq = j7 + 1;
        if (j == 0) {
            this.count++;
            this.totalBytes += j5;
        } else {
            this.totalBytes = (this.totalBytes - ((long) i11)) + j5;
            int i12 = this.count;
            int i13 = this.capacity;
            if (i12 == i13) {
                this.tail = (this.tail + 1) % i13;
            }
        }
        Long l6 = this.byteLimit;
        if (l6 != null) {
            evictIfNeeded(clearSlot, l6.longValue());
        }
    }

    private final String buildPayloadJson(EntryPayload entry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_KEY, entry.getKey());
        jSONObject.put(KEY_TIMESTAMP, entry.getTimestampMs());
        jSONObject.put(KEY_CHANNEL_MASK, entry.getChannelMask());
        String message = entry.getMessage();
        if (message != null) {
            jSONObject.put("message", message);
        }
        Map<String, Object> data = entry.getData();
        if (data != null) {
            jSONObject.put(KEY_DATA, JSONObject.wrap(data));
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final Pair<String, String[]> buildSelection(int requestedMask, long beforeOffset, Long ackedEndOffset) {
        ArrayList arrayListI = d0.i("seq > 0", "(channel_mask & ?) != 0");
        ArrayList arrayListI2 = d0.i(String.valueOf(requestedMask));
        if (beforeOffset >= 0) {
            arrayListI.add("seq < ?");
            arrayListI2.add(String.valueOf(beforeOffset));
        }
        if (ackedEndOffset != null) {
            arrayListI.add("seq > ?");
            arrayListI2.add(ackedEndOffset.toString());
        }
        return new Pair<>(CollectionsKt.O(arrayListI, " AND ", null, null, null, 62), arrayListI2.toArray(new String[0]));
    }

    private final TelemetryRingTypes.LogEntry decodePayload(String payload, long seq) {
        try {
            JSONObject jSONObject = new JSONObject(payload);
            String strOptString = jSONObject.optString(KEY_KEY, "");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() == 0) {
                return null;
            }
            long jOptLong = jSONObject.optLong(KEY_TIMESTAMP, System.currentTimeMillis());
            Object objOpt = jSONObject.opt("message");
            String str = objOpt instanceof String ? (String) objOpt : null;
            Object objOpt2 = jSONObject.opt(KEY_DATA);
            return new TelemetryRingTypes.LogEntry(strOptString, jOptLong, str, objOpt2 instanceof JSONObject ? TelemetryRingSqliteStoreKt.toMap((JSONObject) objOpt2) : null, 0);
        } catch (Throwable th2) {
            Log.INSTANCE.w(TAG, kk.b.i(seq, "Failed to decode payload seq="), th2);
            return null;
        }
    }

    private final Long effectiveAckedEndOffset(Long ackedEndOffset) {
        if (ackedEndOffset == null) {
            return null;
        }
        long j = this.nextSeq - 1;
        if (j > 0 && ackedEndOffset.longValue() <= j) {
            return ackedEndOffset;
        }
        return null;
    }

    private final void ensureSchema(SQLiteDatabase db) {
        if (!tableExists(db, TABLE_META)) {
            INSTANCE.createSchema(db, this.capacity);
            return;
        }
        Cursor cursorQuery = db.query(TABLE_META, new String[]{"capacity"}, "id=1", null, null, null, null, "1");
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        try {
            if (!cursorQuery.moveToFirst()) {
                INSTANCE.createSchema(db, this.capacity);
                ls.d.k(cursorQuery, null);
            } else {
                if (cursorQuery.getInt(0) != this.capacity) {
                    resetSchema(db);
                }
                Unit unit = Unit.f14616a;
                ls.d.k(cursorQuery, null);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final void evictIfNeeded(SQLiteStatement clearSlot, long limit) {
        int i7;
        while (true) {
            i7 = this.count;
            if (i7 <= 0 || this.totalBytes <= limit) {
                break;
            }
            int i10 = this.tail;
            long j = this.slotSeq[i10];
            int i11 = this.slotSize[i10];
            if (j == 0) {
                this.tail = (i10 + 1) % this.capacity;
            } else {
                clearSlot.clearBindings();
                clearSlot.bindLong(1, i10);
                clearSlot.executeUpdateDelete();
                this.slotSeq[i10] = 0;
                this.slotSize[i10] = 0;
                this.totalBytes -= (long) i11;
                this.count--;
                this.tail = (this.tail + 1) % this.capacity;
            }
        }
        if (i7 == 0) {
            this.head = -1;
            this.tail = 0;
        }
    }

    private final boolean hasMore(int requestedMask, long beforeOffset, Long ackedEndOffset) {
        Pair<String, String[]> pairBuildSelection = buildSelection(requestedMask, beforeOffset, ackedEndOffset);
        Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(TABLE_SLOTS, new String[]{"seq"}, (String) pairBuildSelection.f14612d, (String[]) pairBuildSelection.f14613e, null, null, "seq DESC", "1");
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        try {
            boolean zMoveToFirst = cursorQuery.moveToFirst();
            ls.d.k(cursorQuery, null);
            return zMoveToFirst;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final void loadSlots(SQLiteDatabase db) throws IOException {
        w.l(this.slotSeq, 0L);
        int[] iArr = this.slotSize;
        int length = iArr.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, 0, length, 0);
        Cursor cursorQuery = db.query(TABLE_SLOTS, new String[]{"slot_id", "seq", "payload_size"}, null, null, null, null, null);
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        while (cursorQuery.moveToNext()) {
            try {
                int i7 = cursorQuery.getInt(0);
                if (i7 >= 0 && i7 < this.capacity) {
                    this.slotSeq[i7] = cursorQuery.getLong(1);
                    this.slotSize[i7] = cursorQuery.getInt(2);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.f14616a;
        cursorQuery.close();
    }

    private final void loadState() {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        Intrinsics.checkNotNull(writableDatabase);
        writableDatabase.beginTransaction();
        try {
            ensureSchema(writableDatabase);
            MetaState meta = readMeta(writableDatabase);
            this.head = meta.getHead();
            this.tail = meta.getTail();
            this.count = meta.getCount();
            this.totalBytes = meta.getTotalBytes();
            this.nextSeq = meta.getNextSeq();
            loadSlots(writableDatabase);
            Unit unit = Unit.f14616a;
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private final MetaState readMeta(SQLiteDatabase db) {
        Cursor cursorQuery = db.query(TABLE_META, new String[]{"head", "tail", "count", "total_bytes", "next_seq"}, "id=1", null, null, null, null, "1");
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        try {
            if (cursorQuery.moveToFirst()) {
                MetaState metaState = new MetaState(cursorQuery.getInt(0), cursorQuery.getInt(1), cursorQuery.getInt(2), cursorQuery.getLong(3), cursorQuery.getLong(4));
                ls.d.k(cursorQuery, null);
                return metaState;
            }
            MetaState metaState2 = new MetaState(-1, 0, 0, 0L, 1L);
            ls.d.k(cursorQuery, null);
            return metaState2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final void resetSchema(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS telemetry_ring_slots");
        db.execSQL("DROP TABLE IF EXISTS telemetry_ring_meta");
        INSTANCE.createSchema(db, this.capacity);
    }

    private final boolean tableExists(SQLiteDatabase db, String table) {
        Cursor cursorRawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[]{table});
        Intrinsics.checkNotNullExpressionValue(cursorRawQuery, "rawQuery(...)");
        try {
            boolean zMoveToFirst = cursorRawQuery.moveToFirst();
            ls.d.k(cursorRawQuery, null);
            return zMoveToFirst;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(cursorRawQuery, th2);
                throw th3;
            }
        }
    }

    private final void updateMeta(SQLiteDatabase db) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("head", Integer.valueOf(this.head));
        contentValues.put("tail", Integer.valueOf(this.tail));
        contentValues.put("count", Integer.valueOf(this.count));
        contentValues.put("total_bytes", Long.valueOf(this.totalBytes));
        contentValues.put("next_seq", Long.valueOf(this.nextSeq));
        db.update(TABLE_META, contentValues, "id=1", null);
    }

    public final void append(@NotNull List<EntryPayload> entries) throws Throwable {
        Object objO;
        Object objO2;
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (entries.isEmpty()) {
            return;
        }
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        try {
            q qVar = Result.f14614e;
            Intrinsics.checkNotNull(writableDatabase);
            writableDatabase.beginTransaction();
            try {
                SQLiteStatement sQLiteStatementCompileStatement = writableDatabase.compileStatement("UPDATE telemetry_ring_slots SET seq=?, channel_mask=?, payload_json=?, payload_size=? WHERE slot_id=?");
                try {
                    SQLiteStatement sQLiteStatementCompileStatement2 = writableDatabase.compileStatement("UPDATE telemetry_ring_slots SET seq=0, channel_mask=0, payload_json=NULL, payload_size=0 WHERE slot_id=?");
                    try {
                        for (EntryPayload entryPayload : entries) {
                            Intrinsics.checkNotNull(sQLiteStatementCompileStatement);
                            Intrinsics.checkNotNull(sQLiteStatementCompileStatement2);
                            appendEntry(sQLiteStatementCompileStatement, sQLiteStatementCompileStatement2, entryPayload);
                        }
                        Unit unit = Unit.f14616a;
                        ls.d.k(sQLiteStatementCompileStatement2, null);
                        ls.d.k(sQLiteStatementCompileStatement, null);
                        updateMeta(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        objO = Unit.f14616a;
                        Throwable thA = Result.a(objO);
                        if (thA == null) {
                            return;
                        }
                        Log.INSTANCE.w(TAG, "TelemetryRing append rolled back; reloading in-memory state", thA);
                        try {
                            loadState();
                            objO2 = Unit.f14616a;
                        } catch (Throwable th2) {
                            q qVar2 = Result.f14614e;
                            objO2 = ib.a.o(th2);
                        }
                        Throwable thA2 = Result.a(objO2);
                        if (thA2 == null) {
                            throw thA;
                        }
                        Log.INSTANCE.w(TAG, "TelemetryRing state reload failed after append error", thA2);
                        throw thA;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            ls.d.k(sQLiteStatementCompileStatement2, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ls.d.k(sQLiteStatementCompileStatement, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                writableDatabase.endTransaction();
                throw th7;
            }
        } catch (Throwable th8) {
            q qVar3 = Result.f14614e;
            objO = ib.a.o(th8);
        }
    }

    public final void clear() {
        Object objO;
        Object objO2;
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        try {
            q qVar = Result.f14614e;
            Intrinsics.checkNotNull(writableDatabase);
            writableDatabase.beginTransaction();
            try {
                writableDatabase.execSQL("UPDATE telemetry_ring_slots SET seq=0, channel_mask=0, payload_json=NULL, payload_size=0");
                this.head = -1;
                this.tail = 0;
                this.count = 0;
                this.totalBytes = 0L;
                this.nextSeq = 1L;
                w.l(this.slotSeq, 0L);
                int[] iArr = this.slotSize;
                int length = iArr.length;
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                Arrays.fill(iArr, 0, length, 0);
                updateMeta(writableDatabase);
                Unit unit = Unit.f14616a;
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                objO = Unit.f14616a;
                Throwable thA = Result.a(objO);
                if (thA != null) {
                    Log.INSTANCE.w(TAG, "TelemetryRing clear failed; reloading in-memory state", thA);
                    try {
                        loadState();
                        objO2 = Unit.f14616a;
                    } catch (Throwable th2) {
                        q qVar2 = Result.f14614e;
                        objO2 = ib.a.o(th2);
                    }
                    Throwable thA2 = Result.a(objO2);
                    if (thA2 == null) {
                        throw thA;
                    }
                    Log.INSTANCE.w(TAG, "TelemetryRing state reload failed after clear error", thA2);
                    throw thA;
                }
            } catch (Throwable th3) {
                writableDatabase.endTransaction();
                throw th3;
            }
        } catch (Throwable th4) {
            q qVar3 = Result.f14614e;
            objO = ib.a.o(th4);
        }
    }

    @NotNull
    public final TelemetryRingTypes.Snapshot snapshot(@NotNull Set<? extends TelemetryRingTypes.Channel> channels, long beforeOffset, TelemetryRingTypes.Budget snapshotBudget, Long ackedEndOffset) {
        ArrayList arrayList;
        long j;
        long j5;
        Intrinsics.checkNotNullParameter(channels, "channels");
        if (channels.isEmpty() || this.count == 0) {
            return new TelemetryRingTypes.Snapshot(n0.f14659d, beforeOffset, ackedEndOffset != null ? ackedEndOffset.longValue() : -1L, false);
        }
        Iterator<T> it = channels.iterator();
        int i7 = 0;
        int bit = 0;
        while (it.hasNext()) {
            bit |= ((TelemetryRingTypes.Channel) it.next()).getBit();
        }
        Long lEffectiveAckedEndOffset = effectiveAckedEndOffset(ackedEndOffset);
        Pair<String, String[]> pairBuildSelection = buildSelection(bit, beforeOffset, lEffectiveAckedEndOffset);
        Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(TABLE_SLOTS, new String[]{"seq", "payload_json", "payload_size"}, (String) pairBuildSelection.f14612d, (String[]) pairBuildSelection.f14613e, null, null, "seq DESC", (snapshotBudget != null ? snapshotBudget.getType() : null) == TelemetryRingTypes.BudgetType.ROWS ? String.valueOf(snapshotBudget.getLimit()) : null);
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        ArrayList arrayList2 = new ArrayList();
        long j7 = beforeOffset;
        int i10 = 0;
        long j10 = -1;
        long j11 = 0;
        while (true) {
            try {
                if (!cursorQuery.moveToNext()) {
                    arrayList = arrayList2;
                    j = j10;
                    j5 = j7;
                    break;
                }
                long j12 = cursorQuery.getLong(i7);
                String string = cursorQuery.getString(1);
                int i11 = cursorQuery.getInt(2);
                TelemetryRingTypes.LogEntry logEntryDecodePayload = string != null ? decodePayload(string, j12) : null;
                if (logEntryDecodePayload != null) {
                    arrayList2.add(logEntryDecodePayload);
                    if (j10 < 0) {
                        j10 = j12;
                    }
                    i10++;
                    arrayList = arrayList2;
                    j11 += (long) i11;
                    if (snapshotBudget != null) {
                        int i12 = WhenMappings.$EnumSwitchMapping$0[snapshotBudget.getType().ordinal()];
                        if (i12 == 1) {
                            if (i10 >= snapshotBudget.getLimit()) {
                                j = j10;
                                j5 = j12;
                                break;
                            }
                        } else {
                            if (i12 != 2) {
                                throw new n();
                            }
                            if (j11 >= snapshotBudget.getLimit()) {
                                j = j10;
                                j5 = j12;
                                break;
                            }
                        }
                    }
                    j7 = j12;
                    arrayList2 = arrayList;
                }
                i7 = 0;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ls.d.k(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.f14616a;
        ls.d.k(cursorQuery, null);
        if (arrayList.isEmpty()) {
            return new TelemetryRingTypes.Snapshot(n0.f14659d, beforeOffset, lEffectiveAckedEndOffset != null ? lEffectiveAckedEndOffset.longValue() : -1L, false);
        }
        ArrayList arrayList3 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
        Collections.reverse(arrayList3);
        return new TelemetryRingTypes.Snapshot(arrayList3, j5, j, hasMore(bit, j5, lEffectiveAckedEndOffset));
    }
}
