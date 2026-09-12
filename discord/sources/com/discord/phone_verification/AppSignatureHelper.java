package com.discord.phone_verification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.discord.logging.Log;
import i6.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import ss.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/discord/phone_verification/AppSignatureHelper;", "Landroid/content/ContextWrapper;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appSignatures", "", "", "getAppSignatures", "()Ljava/util/List;", "appSignatures$delegate", "Lkotlin/Lazy;", "Companion", "phone_verification_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"PackageManagerGetSignatures"})
@SourceDebugExtension({"SMAP\nAppSignatureHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSignatureHelper.kt\ncom/discord/phone_verification/AppSignatureHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n11546#2,9:115\n13472#2:124\n13473#2:126\n11555#2:127\n1#3:125\n*S KotlinDebug\n*F\n+ 1 AppSignatureHelper.kt\ncom/discord/phone_verification/AppSignatureHelper\n*L\n74#1:115,9\n74#1:124\n74#1:126\n74#1:127\n74#1:125\n*E\n"})
public final class AppSignatureHelper extends ContextWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String HASH_TYPE = "SHA-256";
    private static final int NUM_BASE64_CHAR = 11;
    private static final int NUM_HASHED_BYTES = 9;

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: appSignatures$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appSignatures;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/phone_verification/AppSignatureHelper$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "HASH_TYPE", "NUM_HASHED_BYTES", "", "NUM_BASE64_CHAR", "hash", "packageName", "signature", "phone_verification_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String hash(String packageName, String signature) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(AppSignatureHelper.HASH_TYPE);
                Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
                messageDigest.update(b.b(packageName + " " + signature));
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                String strEncodeToString = Base64.encodeToString(w.i(bArrDigest, 9), 3);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
                String strSubstring = strEncodeToString.substring(0, 11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                Log.i$default(Log.INSTANCE, getTAG(), "pkg: " + packageName + " -- hash: " + strSubstring, (Throwable) null, 4, (Object) null);
                return strSubstring;
            } catch (NoSuchAlgorithmException e10) {
                Log.INSTANCE.e(getTAG(), "hash:NoSuchAlgorithm", e10);
                return null;
            }
        }

        @NotNull
        public final String getTAG() {
            return AppSignatureHelper.TAG;
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("AppSignatureHelper", "getSimpleName(...)");
        TAG = "AppSignatureHelper";
    }

    public AppSignatureHelper(Context context) {
        super(context);
        this.appSignatures = l.b(new a(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List appSignatures_delegate$lambda$2(AppSignatureHelper appSignatureHelper) {
        ArrayList arrayList = new ArrayList();
        try {
            String packageName = appSignatureHelper.getPackageName();
            PackageManager packageManager = appSignatureHelper.getPackageManager();
            Signature[] apkContentsSigners = null;
            if (Build.VERSION.SDK_INT >= 33) {
                SigningInfo signingInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(134217728)).signingInfo;
                if (signingInfo != null) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                }
            } else {
                SigningInfo signingInfo2 = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                if (signingInfo2 != null) {
                    apkContentsSigners = signingInfo2.getApkContentsSigners();
                }
            }
            if (apkContentsSigners != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Signature signature : apkContentsSigners) {
                    Companion companion = INSTANCE;
                    Intrinsics.checkNotNull(packageName);
                    String charsString = signature.toCharsString();
                    Intrinsics.checkNotNullExpressionValue(charsString, "toCharsString(...)");
                    String strHash = companion.hash(packageName, charsString);
                    Log.i$default(Log.INSTANCE, TAG, "Hash " + strHash, (Throwable) null, 4, (Object) null);
                    if (strHash != null) {
                        arrayList2.add(strHash);
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.INSTANCE.e(TAG, "Unable to find package to obtain hash.", e10);
            return arrayList;
        }
    }

    @NotNull
    public final List<String> getAppSignatures() {
        return (List) this.appSignatures.getValue();
    }
}
