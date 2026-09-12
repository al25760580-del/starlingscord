package com.discord.share;

import a3.e;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.content.pm.ShortcutInfoCompat;
import com.discord.share.intent.GetFileNameKt;
import com.discord.shortcuts.ShortcutData;
import com.facebook.react.devsupport.StackTraceHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.c;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006 "}, d2 = {"Lcom/discord/share/ShareProps;", "", "text", "", "attachments", "", "Lcom/discord/share/ShareProps$Attachment;", "targetChannelId", "targetUserId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAttachments", "()Ljava/util/List;", "getTargetChannelId", "getTargetUserId", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Attachment", "Companion", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareProps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,84:1\n1563#2:85\n1634#2,3:86\n37#3:89\n36#3,3:90\n*S KotlinDebug\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps\n*L\n37#1:85\n37#1:86,3\n37#1:89\n37#1:90,3\n*E\n"})
public final /* data */ class ShareProps {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<Attachment> attachments;
    private final String targetChannelId;
    private final String targetUserId;

    @NotNull
    private final String text;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/discord/share/ShareProps$Attachment;", "", StackTraceHelper.NAME_KEY, "", "uri", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUri", "getMimeType", "toBundle", "Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Attachment {
        private final String mimeType;

        @NotNull
        private final String name;

        @NotNull
        private final String uri;

        public Attachment(@NotNull String name, @NotNull String uri, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.name = name;
            this.uri = uri;
            this.mimeType = str;
        }

        public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = attachment.name;
            }
            if ((i7 & 2) != 0) {
                str2 = attachment.uri;
            }
            if ((i7 & 4) != 0) {
                str3 = attachment.mimeType;
            }
            return attachment.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        public final Attachment copy(@NotNull String name, @NotNull String uri, String mimeType) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Attachment(name, uri, mimeType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return Intrinsics.areEqual(this.name, attachment.name) && Intrinsics.areEqual(this.uri, attachment.uri) && Intrinsics.areEqual(this.mimeType, attachment.mimeType);
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iD = e.d(this.name.hashCode() * 31, 31, this.uri);
            String str = this.mimeType;
            return iD + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final Bundle toBundle() {
            return zs.a.f(new Pair(StackTraceHelper.NAME_KEY, this.name), new Pair("uri", this.uri), new Pair("mimeType", this.mimeType));
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.uri;
            return com.discord.chat.presentation.list.a.k(e.u("Attachment(name=", str, ", uri=", str2, ", mimeType="), this.mimeType, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/discord/share/ShareProps$Companion;", "", "<init>", "()V", "createShareProps", "Lcom/discord/share/ShareProps;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getUriExtras", "", "Landroid/net/Uri;", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nShareProps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,84:1\n1#2:85\n1563#3:86\n1634#3,3:87\n17#4:90\n14#4:91\n*S KotlinDebug\n*F\n+ 1 ShareProps.kt\ncom/discord/share/ShareProps$Companion\n*L\n67#1:86\n67#1:87,3\n80#1:90\n81#1:91\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Uri> getUriExtras(Intent intent) {
            ArrayList arrayListA = Build.VERSION.SDK_INT >= 34 ? c.a(intent, "android.intent.extra.STREAM", Uri.class) : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            return arrayListA != null ? arrayListA : d0.h((Parcelable) d.b(intent, "android.intent.extra.STREAM", Uri.class));
        }

        @NotNull
        public final ShareProps createShareProps(@NotNull Intent intent, @NotNull Context context) throws IOException {
            Object next;
            ShortcutData shortcutIntentData;
            Map<String, String> data;
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            String str = null;
            String stringExtra = Build.VERSION.SDK_INT >= 29 ? intent.getStringExtra("android.intent.extra.shortcut.ID") : null;
            if (stringExtra != null) {
                List listF = z0.d.f(context);
                Intrinsics.checkNotNullExpressionValue(listF, "getShortcuts(...)");
                Iterator it = listF.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ShortcutInfoCompat) next).f1544b, stringExtra));
                ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) next;
                if (shortcutInfoCompat != null) {
                    Intent[] intentArr = shortcutInfoCompat.f1545c;
                    Intent intent2 = intentArr[intentArr.length - 1];
                    if (intent2 != null && (shortcutIntentData = ShortcutData.INSTANCE.getShortcutIntentData(intent2)) != null && (data = shortcutIntentData.getData()) != null) {
                        str = data.get("receiving_user_id");
                    }
                }
            }
            String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            List<Uri> uriExtras = getUriExtras(intent);
            ArrayList arrayList = new ArrayList(e0.l(uriExtras, 10));
            for (Uri uri : uriExtras) {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                String fileName = GetFileNameKt.getFileName(contentResolver, uri);
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                arrayList.add(new Attachment(fileName, string, context.getContentResolver().getType(uri)));
            }
            return new ShareProps(stringExtra2, arrayList, stringExtra, str);
        }

        private Companion() {
        }
    }

    public ShareProps(@NotNull String text, @NotNull List<Attachment> attachments, String str, String str2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        this.text = text;
        this.attachments = attachments;
        this.targetChannelId = str;
        this.targetUserId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareProps copy$default(ShareProps shareProps, String str, List list, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = shareProps.text;
        }
        if ((i7 & 2) != 0) {
            list = shareProps.attachments;
        }
        if ((i7 & 4) != 0) {
            str2 = shareProps.targetChannelId;
        }
        if ((i7 & 8) != 0) {
            str3 = shareProps.targetUserId;
        }
        return shareProps.copy(str, list, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<Attachment> component2() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTargetChannelId() {
        return this.targetChannelId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTargetUserId() {
        return this.targetUserId;
    }

    @NotNull
    public final ShareProps copy(@NotNull String text, @NotNull List<Attachment> attachments, String targetChannelId, String targetUserId) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        return new ShareProps(text, attachments, targetChannelId, targetUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareProps)) {
            return false;
        }
        ShareProps shareProps = (ShareProps) other;
        return Intrinsics.areEqual(this.text, shareProps.text) && Intrinsics.areEqual(this.attachments, shareProps.attachments) && Intrinsics.areEqual(this.targetChannelId, shareProps.targetChannelId) && Intrinsics.areEqual(this.targetUserId, shareProps.targetUserId);
    }

    @NotNull
    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getTargetChannelId() {
        return this.targetChannelId;
    }

    public final String getTargetUserId() {
        return this.targetUserId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iF = e.f(this.attachments, this.text.hashCode() * 31, 31);
        String str = this.targetChannelId;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetUserId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final Bundle toBundle() {
        Pair pair = new Pair("text", this.text);
        List<Attachment> list = this.attachments;
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Attachment) it.next()).toBundle());
        }
        return zs.a.f(pair, new Pair("attachments", arrayList.toArray(new Bundle[0])), new Pair("targetChannelId", this.targetChannelId), new Pair("targetUserId", this.targetUserId));
    }

    @NotNull
    public String toString() {
        String str = this.text;
        List<Attachment> list = this.attachments;
        String str2 = this.targetChannelId;
        String str3 = this.targetUserId;
        StringBuilder sb2 = new StringBuilder("ShareProps(text=");
        sb2.append(str);
        sb2.append(", attachments=");
        sb2.append(list);
        sb2.append(", targetChannelId=");
        return com.discord.chat.presentation.list.a.l(sb2, str2, ", targetUserId=", str3, ")");
    }
}
