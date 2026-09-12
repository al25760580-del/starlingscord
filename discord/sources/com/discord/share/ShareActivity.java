package com.discord.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.discord.react_activities.ReactActivity;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\f\u0010\u0006\u001a\u00060\u0007R\u00020\u0001H\u0016¨\u0006\b"}, d2 = {"Lcom/discord/share/ShareActivity;", "Lcom/discord/react_activities/ReactActivity;", "<init>", "()V", "getNameOfComponent", "", "getActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "share_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareActivity extends ReactActivity {
    @Override // com.discord.react_activities.ReactActivity
    @NotNull
    public ReactActivity.ActivityDelegate getActivityDelegate() {
        return new ReactActivity.ActivityDelegate() { // from class: com.discord.share.ShareActivity.getActivityDelegate.1
            private ShareProps shareProps;

            {
                super(ShareActivity.this, ShareActivity.this);
            }

            private final void updateShareProps(Intent intent) throws IOException {
                if (intent == null) {
                    return;
                }
                ShareProps.Companion companion = ShareProps.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ShareProps sharePropsCreateShareProps = companion.createShareProps(intent, context);
                this.shareProps = sharePropsCreateShareProps;
                if (sharePropsCreateShareProps == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shareProps");
                    sharePropsCreateShareProps = null;
                }
                List<ShareProps.Attachment> attachments = sharePropsCreateShareProps.getAttachments();
                ShareActivity shareActivity = ShareActivity.this;
                Iterator<T> it = attachments.iterator();
                while (it.hasNext()) {
                    shareActivity.grantUriPermission(shareActivity.getPackageName(), Uri.parse(((ShareProps.Attachment) it.next()).getUri()), 1);
                }
            }

            @Override // com.facebook.react.ReactActivityDelegate
            public Bundle getLaunchOptions() {
                ShareProps shareProps = this.shareProps;
                if (shareProps == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shareProps");
                    shareProps = null;
                }
                return shareProps.toBundle();
            }

            @Override // com.facebook.react.ReactActivityDelegate
            public void onCreate(Bundle savedInstanceState) throws IOException {
                updateShareProps(ShareActivity.this.getIntent());
                super.onCreate(savedInstanceState);
            }

            @Override // com.facebook.react.ReactActivityDelegate
            public boolean onNewIntent(Intent intent) throws IOException {
                Intent intent2;
                if (intent != null) {
                    updateShareProps(intent);
                    ShareActivity.this.finish();
                    ActivityUtilities activityUtilities = ActivityUtilities.INSTANCE;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    intent2 = intent;
                    ActivityUtilities.startActivityAsync$default(activityUtilities, context, intent2, null, 4, null);
                } else {
                    intent2 = intent;
                }
                return super.onNewIntent(intent2);
            }
        };
    }

    @Override // com.discord.react_activities.ReactActivity
    @NotNull
    public String getNameOfComponent() {
        return BuildConfig.MAIN_COMPONENT;
    }
}
