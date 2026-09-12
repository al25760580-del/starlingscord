package com.discord.media.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.collections.y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import lo.j;
import ls.d;
import org.jetbrains.annotations.NotNull;
import org.webrtc.MediaStreamTrack;
import rn.n;
import s0.g;
import sn.e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 32\u00020\u0001:\u0005/0123BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003Jg\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u00064"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia;", "", StackTraceHelper.ID_KEY, "", "uri", "Landroid/net/Uri;", "mediaType", "Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "mimeType", "", StackTraceHelper.NAME_KEY, "duration", "", "dateAdded", "width", "height", "<init>", "(JLandroid/net/Uri;Lcom/discord/media/utils/ContentResolverMedia$MediaType;Ljava/lang/String;Ljava/lang/String;IIII)V", "getId", "()J", "getUri", "()Landroid/net/Uri;", "getMediaType", "()Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "getMimeType", "()Ljava/lang/String;", "getName", "getDuration", "()I", "getDateAdded", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "MediaType", "QueryType", "Column", "QueryColumns", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ContentResolverMedia {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int dateAdded;
    private final int duration;
    private final int height;
    private final long id;

    @NotNull
    private final MediaType mediaType;
    private final String mimeType;
    private final String name;

    @NotNull
    private final Uri uri;
    private final int width;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia$Column;", "", "field", "", "<init>", "(Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "columnIndex", "", "getInt", "", "cursor", "Landroid/database/Cursor;", "getLong", "", "getString", "getColumnIndex", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Column {
        private Number columnIndex;

        @NotNull
        private final String field;

        public Column(@NotNull String field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.field = field;
        }

        private final int getColumnIndex(Cursor cursor) {
            if (this.columnIndex == null) {
                this.columnIndex = Integer.valueOf(cursor.getColumnIndexOrThrow(this.field));
            }
            Number number = this.columnIndex;
            if (number == null) {
                Intrinsics.throwUninitializedPropertyAccessException("columnIndex");
                number = null;
            }
            return number.intValue();
        }

        @NotNull
        public final String getField() {
            return this.field;
        }

        public final int getInt(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            return cursor.getInt(getColumnIndex(cursor));
        }

        public final long getLong(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            return cursor.getLong(getColumnIndex(cursor));
        }

        public final String getString(@NotNull Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            return cursor.getString(getColumnIndex(cursor));
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0003JO\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u0014JE\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia$Companion;", "", "<init>", "()V", "isAtLeastQ", "", "queryMedia", "", "Lcom/discord/media/utils/ContentResolverMedia;", "context", "Landroid/content/Context;", "queryType", "Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "queryLimit", "", "queryUri", "Landroid/net/Uri;", "queryOffset", "extensions", "", "(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILandroid/net/Uri;Ljava/lang/Integer;Ljava/util/List;)Ljava/util/List;", "getMedia", "(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILjava/lang/Integer;Ljava/util/List;)Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContentResolverMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentResolverMedia.kt\ncom/discord/media/utils/ContentResolverMedia$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n1563#2:234\n1634#2,3:235\n*S KotlinDebug\n*F\n+ 1 ContentResolverMedia.kt\ncom/discord/media/utils/ContentResolverMedia$Companion\n*L\n190#1:234\n190#1:235,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getMedia$default(Companion companion, Context context, QueryType queryType, int i7, Integer num, List list, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                list = null;
            }
            return companion.getMedia(context, queryType, i7, num, list);
        }

        private static final List getMedia$lambda$2(Context context, QueryType queryType, int i7, Integer num, List list, Uri contentUri) {
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            return ContentResolverMedia.INSTANCE.queryMedia(context, queryType, i7, contentUri, num, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAtLeastQ() {
            return Build.VERSION.SDK_INT >= 29;
        }

        private final List<ContentResolverMedia> queryMedia(Context context, QueryType queryType, int queryLimit, Uri queryUri, Integer queryOffset, List<String> extensions) throws IOException {
            QueryColumns queryColumns;
            QueryColumns queryColumns2;
            if (!isAtLeastQ() || queryType.shouldIncludeVideo()) {
                if (!isAtLeastQ() && !queryUri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, null, 319, null);
                } else if (isAtLeastQ() || !queryUri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    queryColumns = new QueryColumns(null, null, null, null, null, null, null, null, null, 511, null);
                } else {
                    queryColumns2 = new QueryColumns(null, null, null, null, null, null, null, null, null, 447, null);
                }
                queryColumns2 = queryColumns;
            } else {
                queryColumns2 = new QueryColumns(null, null, null, null, null, null, null, null, null, 383, null);
            }
            ContentResolverUtils contentResolverUtils = ContentResolverUtils.INSTANCE;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            Cursor cursorQueryCompat = contentResolverUtils.queryCompat(contentResolver, queryUri, queryColumns2.getProjection(), queryLimit, "date_added DESC", isAtLeastQ() ? queryType.getSelection(extensions) : null, queryOffset);
            if (cursorQueryCompat == null) {
                return n0.f14659d;
            }
            try {
                IntRange intRangeI = j.i(0, cursorQueryCompat.getCount());
                ArrayList arrayList = new ArrayList(e0.l(intRangeI, 10));
                Iterator it = intRangeI.iterator();
                while (it.hasNext()) {
                    cursorQueryCompat.moveToPosition(((s0) it).nextInt());
                    arrayList.add(queryColumns2.getContentResolverMedia(queryUri, cursorQueryCompat));
                }
                cursorQueryCompat.close();
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    d.k(cursorQueryCompat, th2);
                    throw th3;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List queryMedia$default(Companion companion, Context context, QueryType queryType, int i7, Uri uri, Integer num, List list, int i10, Object obj) {
            if ((i10 & 32) != 0) {
                list = null;
            }
            return companion.queryMedia(context, queryType, i7, uri, num, list);
        }

        @NotNull
        public final List<ContentResolverMedia> getMedia(@NotNull Context context, @NotNull QueryType queryType, int queryLimit, Integer queryOffset, List<String> extensions) {
            Collection media$lambda$2;
            Collection media$lambda$3;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryType, "queryType");
            if (isAtLeastQ()) {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(...)");
                return getMedia$lambda$2(context, queryType, queryLimit, queryOffset, extensions, contentUri);
            }
            if (queryType.shouldIncludeImages()) {
                Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                media$lambda$2 = getMedia$lambda$2(context, queryType, queryLimit, queryOffset, extensions, EXTERNAL_CONTENT_URI);
            } else {
                media$lambda$2 = n0.f14659d;
            }
            if (queryType.shouldIncludeVideo()) {
                Uri EXTERNAL_CONTENT_URI2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
                media$lambda$3 = getMedia$lambda$2(context, queryType, queryLimit, queryOffset, extensions, EXTERNAL_CONTENT_URI2);
            } else {
                media$lambda$3 = n0.f14659d;
            }
            e eVarB = c0.b();
            eVarB.addAll(media$lambda$2);
            eVarB.addAll(media$lambda$3);
            return c0.a(eVarB);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia$MediaType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "VIDEO", "toString", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum MediaType {
        IMAGE,
        VIDEO;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaType.values().length];
                try {
                    iArr[MediaType.IMAGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaType.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i7 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i7 == 1) {
                return "ALAssetTypePhoto";
            }
            if (i7 == 2) {
                return "ALAssetTypeVideo";
            }
            throw new n();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryColumns;", "", "queryColumnId", "Lcom/discord/media/utils/ContentResolverMedia$Column;", "queryColumnDisplayName", "queryColumnMimeType", "queryColumnWidth", "queryColumnHeight", "queryColumnDateAdded", "queryMediaType", "queryColumnDuration", "queryColumnOrientation", "<init>", "(Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;Lcom/discord/media/utils/ContentResolverMedia$Column;)V", "getProjection", "", "", "()[Ljava/lang/String;", "getContentResolverMedia", "Lcom/discord/media/utils/ContentResolverMedia;", "queryUri", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContentResolverMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentResolverMedia.kt\ncom/discord/media/utils/ContentResolverMedia$QueryColumns\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,233:1\n37#2:234\n36#2,3:235\n*S KotlinDebug\n*F\n+ 1 ContentResolverMedia.kt\ncom/discord/media/utils/ContentResolverMedia$QueryColumns\n*L\n132#1:234\n132#1:235,3\n*E\n"})
    public static final class QueryColumns {

        @NotNull
        private final Column queryColumnDateAdded;

        @NotNull
        private final Column queryColumnDisplayName;
        private final Column queryColumnDuration;

        @NotNull
        private final Column queryColumnHeight;

        @NotNull
        private final Column queryColumnId;

        @NotNull
        private final Column queryColumnMimeType;
        private final Column queryColumnOrientation;

        @NotNull
        private final Column queryColumnWidth;
        private final Column queryMediaType;

        public QueryColumns() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        @NotNull
        public final ContentResolverMedia getContentResolverMedia(@NotNull Uri queryUri, @NotNull Cursor cursor) {
            List<String> pathSegments;
            Intrinsics.checkNotNullParameter(queryUri, "queryUri");
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Column column = this.queryMediaType;
            boolean z5 = true;
            boolean z6 = (column != null && column.getInt(cursor) == 3) || ((pathSegments = queryUri.getPathSegments()) != null && pathSegments.contains(MediaStreamTrack.VIDEO_TRACK_KIND));
            Column column2 = this.queryColumnOrientation;
            int i7 = column2 != null ? column2.getInt(cursor) : 0;
            if (i7 != 90 && i7 != 270) {
                z5 = false;
            }
            long j = this.queryColumnId.getLong(cursor);
            Uri uriWithAppendedId = ContentUris.withAppendedId(queryUri, this.queryColumnId.getLong(cursor));
            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
            MediaType mediaType = z6 ? MediaType.VIDEO : MediaType.IMAGE;
            String string = this.queryColumnMimeType.getString(cursor);
            String string2 = this.queryColumnDisplayName.getString(cursor);
            Column column3 = this.queryColumnDuration;
            return new ContentResolverMedia(j, uriWithAppendedId, mediaType, string, string2, (column3 != null ? column3.getInt(cursor) : 0) / 1000, this.queryColumnDateAdded.getInt(cursor), (z5 ? this.queryColumnHeight : this.queryColumnWidth).getInt(cursor), (z5 ? this.queryColumnWidth : this.queryColumnHeight).getInt(cursor));
        }

        @NotNull
        public final String[] getProjection() {
            String field = this.queryColumnId.getField();
            String field2 = this.queryColumnDisplayName.getField();
            String field3 = this.queryColumnMimeType.getField();
            String field4 = this.queryColumnWidth.getField();
            String field5 = this.queryColumnHeight.getField();
            String field6 = this.queryColumnDateAdded.getField();
            Column column = this.queryMediaType;
            String field7 = column != null ? column.getField() : null;
            Column column2 = this.queryColumnDuration;
            String field8 = column2 != null ? column2.getField() : null;
            Column column3 = this.queryColumnOrientation;
            String[] elements = {field, field2, field3, field4, field5, field6, field7, field8, column3 != null ? column3.getField() : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return (String[]) y.r(elements).toArray(new String[0]);
        }

        public QueryColumns(@NotNull Column queryColumnId, @NotNull Column queryColumnDisplayName, @NotNull Column queryColumnMimeType, @NotNull Column queryColumnWidth, @NotNull Column queryColumnHeight, @NotNull Column queryColumnDateAdded, Column column, Column column2, Column column3) {
            Intrinsics.checkNotNullParameter(queryColumnId, "queryColumnId");
            Intrinsics.checkNotNullParameter(queryColumnDisplayName, "queryColumnDisplayName");
            Intrinsics.checkNotNullParameter(queryColumnMimeType, "queryColumnMimeType");
            Intrinsics.checkNotNullParameter(queryColumnWidth, "queryColumnWidth");
            Intrinsics.checkNotNullParameter(queryColumnHeight, "queryColumnHeight");
            Intrinsics.checkNotNullParameter(queryColumnDateAdded, "queryColumnDateAdded");
            this.queryColumnId = queryColumnId;
            this.queryColumnDisplayName = queryColumnDisplayName;
            this.queryColumnMimeType = queryColumnMimeType;
            this.queryColumnWidth = queryColumnWidth;
            this.queryColumnHeight = queryColumnHeight;
            this.queryColumnDateAdded = queryColumnDateAdded;
            this.queryMediaType = column;
            this.queryColumnDuration = column2;
            this.queryColumnOrientation = column3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ QueryColumns(Column column, Column column2, Column column3, Column column4, Column column5, Column column6, Column column7, Column column8, Column column9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            Column column10;
            column = (i7 & 1) != 0 ? new Column("_id") : column;
            column2 = (i7 & 2) != 0 ? new Column("_display_name") : column2;
            column3 = (i7 & 4) != 0 ? new Column("mime_type") : column3;
            column4 = (i7 & 8) != 0 ? new Column("width") : column4;
            column5 = (i7 & 16) != 0 ? new Column("height") : column5;
            Column column11 = (i7 & 32) != 0 ? new Column("date_added") : column6;
            Column column12 = (i7 & 64) != 0 ? new Column("media_type") : column7;
            Column column13 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new Column("duration") : column8;
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                column10 = ContentResolverMedia.INSTANCE.isAtLeastQ() ? new Column("orientation") : null;
            } else {
                column10 = column9;
            }
            this(column, column2, column3, column4, column5, column11, column12, column13, column10);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "IMAGE", "VIDEO", "shouldIncludeImages", "", "shouldIncludeVideo", "getSelection", "", "extensions", "", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContentResolverMedia.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentResolverMedia.kt\ncom/discord/media/utils/ContentResolverMedia$QueryType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1617#2,9:234\n1869#2:243\n1870#2:246\n1626#2:247\n1#3:244\n1#3:245\n*S KotlinDebug\n*F\n+ 1 ContentResolverMedia.kt\ncom/discord/media/utils/ContentResolverMedia$QueryType\n*L\n68#1:234,9\n68#1:243\n68#1:246\n68#1:247\n68#1:245\n*E\n"})
    public enum QueryType {
        ALL,
        IMAGE,
        VIDEO;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final List<String> UNSUPPORTED_IMAGE_MIME_TYPES = c0.c("image/x-adobe-dng");

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/discord/media/utils/ContentResolverMedia$QueryType$Companion;", "", "<init>", "()V", "UNSUPPORTED_IMAGE_MIME_TYPES", "", "", "getUnsupportedImageMimeTypes", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final String getUnsupportedImageMimeTypes() {
                return CollectionsKt.O(QueryType.UNSUPPORTED_IMAGE_MIME_TYPES, ",", null, null, new com.discord.emoji.a(9), 30);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence getUnsupportedImageMimeTypes$lambda$0(String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                return "'" + mimeType + "'";
            }

            private Companion() {
            }
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ String getSelection$default(QueryType queryType, List list, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSelection");
            }
            if ((i7 & 1) != 0) {
                list = null;
            }
            return queryType.getSelection(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence getSelection$lambda$2(String ext) {
            Intrinsics.checkNotNullParameter(ext, "ext");
            return "_display_name LIKE '%." + ext + "'";
        }

        @NotNull
        public final String getSelection(List<String> extensions) {
            String[] elements = {shouldIncludeImages() ? g.e("media_type=1 AND mime_type NOT IN (", INSTANCE.getUnsupportedImageMimeTypes(), ")") : null, shouldIncludeVideo() ? "media_type = 3" : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            String strO = CollectionsKt.O(y.r(elements), " OR ", null, null, null, 62);
            if (extensions != null && !extensions.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = extensions.iterator();
                while (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String strReplace = new Regex("[^a-z0-9]").replace(lowerCase, "");
                    if (strReplace.length() == 0) {
                        strReplace = null;
                    }
                    if (strReplace != null) {
                        arrayList.add(strReplace);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return g.f("(", strO, ") AND (", CollectionsKt.O(arrayList, " OR ", null, null, new com.discord.emoji.a(8), 30), ")");
                }
            }
            return strO;
        }

        public final boolean shouldIncludeImages() {
            return this == ALL || this == IMAGE;
        }

        public final boolean shouldIncludeVideo() {
            return this == ALL || this == VIDEO;
        }
    }

    public ContentResolverMedia(long j, @NotNull Uri uri, @NotNull MediaType mediaType, String str, String str2, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        this.id = j;
        this.uri = uri;
        this.mediaType = mediaType;
        this.mimeType = str;
        this.name = str2;
        this.duration = i7;
        this.dateAdded = i10;
        this.width = i11;
        this.height = i12;
    }

    public static /* synthetic */ ContentResolverMedia copy$default(ContentResolverMedia contentResolverMedia, long j, Uri uri, MediaType mediaType, String str, String str2, int i7, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j = contentResolverMedia.id;
        }
        long j5 = j;
        if ((i13 & 2) != 0) {
            uri = contentResolverMedia.uri;
        }
        Uri uri2 = uri;
        if ((i13 & 4) != 0) {
            mediaType = contentResolverMedia.mediaType;
        }
        return contentResolverMedia.copy(j5, uri2, mediaType, (i13 & 8) != 0 ? contentResolverMedia.mimeType : str, (i13 & 16) != 0 ? contentResolverMedia.name : str2, (i13 & 32) != 0 ? contentResolverMedia.duration : i7, (i13 & 64) != 0 ? contentResolverMedia.dateAdded : i10, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? contentResolverMedia.width : i11, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? contentResolverMedia.height : i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDateAdded() {
        return this.dateAdded;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final ContentResolverMedia copy(long id2, @NotNull Uri uri, @NotNull MediaType mediaType, String mimeType, String name, int duration, int dateAdded, int width, int height) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new ContentResolverMedia(id2, uri, mediaType, mimeType, name, duration, dateAdded, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentResolverMedia)) {
            return false;
        }
        ContentResolverMedia contentResolverMedia = (ContentResolverMedia) other;
        return this.id == contentResolverMedia.id && Intrinsics.areEqual(this.uri, contentResolverMedia.uri) && this.mediaType == contentResolverMedia.mediaType && Intrinsics.areEqual(this.mimeType, contentResolverMedia.mimeType) && Intrinsics.areEqual(this.name, contentResolverMedia.name) && this.duration == contentResolverMedia.duration && this.dateAdded == contentResolverMedia.dateAdded && this.width == contentResolverMedia.width && this.height == contentResolverMedia.height;
    }

    public final int getDateAdded() {
        return this.dateAdded;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.mediaType.hashCode() + ((this.uri.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.mimeType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return Integer.hashCode(this.height) + com.discord.chat.presentation.list.a.u(this.width, com.discord.chat.presentation.list.a.u(this.dateAdded, com.discord.chat.presentation.list.a.u(this.duration, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "ContentResolverMedia(id=" + this.id + ", uri=" + this.uri + ", mediaType=" + this.mediaType + ", mimeType=" + this.mimeType + ", name=" + this.name + ", duration=" + this.duration + ", dateAdded=" + this.dateAdded + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
