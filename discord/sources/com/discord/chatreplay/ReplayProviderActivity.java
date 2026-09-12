package com.discord.chatreplay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.discord.browser_manager.c;
import com.discord.chat.input.views.a;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import pr.b;
import y0.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0015J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0002¨\u0006\u0014"}, d2 = {"Lcom/discord/chatreplay/ReplayProviderActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getReplayFile", "Ljava/io/File;", "replayName", "", "getReplaysList", "", "Lcom/discord/chatreplay/Replay;", "grantAccessToFile", "Landroid/net/Uri;", "toPackage", "file", "Companion", "chat_replay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReplayProviderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n113#2:117\n1#3:118\n1563#4:119\n1634#4,3:120\n*S KotlinDebug\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity\n*L\n32#1:117\n63#1:119\n63#1:120,3\n*E\n"})
public final class ReplayProviderActivity extends Activity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String INTENT_EXTRA_GRANTED_URI = "INTENT_EXTRA_GRANTED_URI";

    @NotNull
    private static final String INTENT_EXTRA_REPLAYS_LIST = "INTENT_EXTRA_REPLAYS_LIST";

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/chatreplay/ReplayProviderActivity$Companion;", "", "<init>", "()V", ReplayProviderActivity.INTENT_EXTRA_REPLAYS_LIST, "", ReplayProviderActivity.INTENT_EXTRA_GRANTED_URI, "getReplaysListFromIntent", "", "Lcom/discord/chatreplay/Replay;", "intent", "Landroid/content/Intent;", "getGrantedUri", "Landroid/net/Uri;", "requestReplayList", "", "activity", "Landroid/app/Activity;", "requestCode", "", "requestUriPermission", "replayFilename", "chat_replay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReplayProviderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity$Companion\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,116:1\n147#2:117\n29#3:118\n*S KotlinDebug\n*F\n+ 1 ReplayProviderActivity.kt\ncom/discord/chatreplay/ReplayProviderActivity$Companion\n*L\n84#1:117\n111#1:118\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit requestReplayList$lambda$0(Activity activity, Unit unit, Throwable th2) {
            if (th2 == null) {
                return Unit.f14616a;
            }
            Toast.makeText(activity, "Unable to fetch replay list, activity not available.", 1).show();
            return Unit.f14616a;
        }

        @NotNull
        public final Uri getGrantedUri(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Object objB = d.b(intent, ReplayProviderActivity.INTENT_EXTRA_GRANTED_URI, Uri.class);
            Intrinsics.checkNotNull(objB);
            return (Uri) objB;
        }

        @NotNull
        public final List<Replay> getReplaysListFromIntent(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra(ReplayProviderActivity.INTENT_EXTRA_REPLAYS_LIST);
            Intrinsics.checkNotNull(stringExtra);
            b bVar = Json.f14760d;
            bVar.getClass();
            return (List) bVar.b(new or.d(Replay.INSTANCE.serializer(), 0), stringExtra);
        }

        public final void requestReplayList(@NotNull Activity activity, int requestCode) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = new Intent();
            intent.setAction("com.discord.GET_REPLAY_LIST");
            ActivityUtilities.startActivityForResultAsyncWithFuture$default(ActivityUtilities.INSTANCE, activity, intent, requestCode, null, 8, null).whenCompleteAsync((BiConsumer) new c(1, new a(10, activity)), ThreadUtilsKt.getUiExecutor());
        }

        public final void requestUriPermission(@NotNull Activity activity, @NotNull String replayFilename, int requestCode) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(replayFilename, "replayFilename");
            Intent intent = new Intent();
            intent.setAction("com.discord.REQUEST_REPLAY_ACCESS");
            intent.setData(Uri.parse("discord://request_replay?target=" + replayFilename + "&toPackage=" + activity.getPackageName()));
            ActivityUtilities.startActivityForResultAsync$default(ActivityUtilities.INSTANCE, activity, intent, requestCode, null, 8, null);
        }

        private Companion() {
        }
    }

    private final File getReplayFile(String replayName) {
        return new File(Paths.get(kk.b.j(getFilesDir().getPath(), "/rows"), new String[0]).toString(), replayName);
    }

    private final List<Replay> getReplaysList() {
        Path path = Paths.get(kk.b.j(getFilesDir().getPath(), "/rows"), new String[0]);
        Intrinsics.checkNotNull(path);
        File[] fileArrListFiles = new File(path.toAbsolutePath().toString()).listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        Intrinsics.checkNotNullParameter(fileArrListFiles, "<this>");
        Intrinsics.checkNotNullParameter(fileArrListFiles, "<this>");
        IntRange intRange = new IntRange(0, fileArrListFiles.length - 1, 1);
        ArrayList<File> arrayList = new ArrayList(e0.l(intRange, 10));
        Iterator it = intRange.iterator();
        while (((lo.b) it).f15156i) {
            arrayList.add(fileArrListFiles[((s0) it).nextInt()]);
        }
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        for (File file : arrayList) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            arrayList2.add(new Replay(name, file.lastModified()));
        }
        return arrayList2;
    }

    private final Uri grantAccessToFile(String toPackage, File file) {
        Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".replays", file);
        grantUriPermission(toPackage, uriForFile, 1);
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Intrinsics.areEqual(getIntent().getAction(), "com.discord.GET_REPLAY_LIST")) {
            List<Replay> replaysList = getReplaysList();
            Intent intent = new Intent();
            b bVar = Json.f14760d;
            bVar.getClass();
            intent.putExtra(INTENT_EXTRA_REPLAYS_LIST, bVar.c(new or.d(Replay.INSTANCE.serializer(), 0), replaysList));
            setResult(-1, intent);
            finish();
            return;
        }
        if (Intrinsics.areEqual(getIntent().getAction(), "com.discord.REQUEST_REPLAY_ACCESS")) {
            Uri data = getIntent().getData();
            Intrinsics.checkNotNull(data);
            String queryParameter = data.getQueryParameter("target");
            Intrinsics.checkNotNull(queryParameter);
            Uri data2 = getIntent().getData();
            Intrinsics.checkNotNull(data2);
            String queryParameter2 = data2.getQueryParameter("toPackage");
            Intrinsics.checkNotNull(queryParameter2);
            Uri uriGrantAccessToFile = grantAccessToFile(queryParameter2, getReplayFile(queryParameter));
            Intent intent2 = new Intent();
            intent2.putExtra(INTENT_EXTRA_GRANTED_URI, uriGrantAccessToFile);
            Unit unit = Unit.f14616a;
            setResult(-1, intent2);
            finish();
        }
    }
}
