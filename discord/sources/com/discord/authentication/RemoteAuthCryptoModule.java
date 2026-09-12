package com.discord.authentication;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.codegen.NativeRemoteAuthCryptoModuleSpec;
import com.discord.logging.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/authentication/RemoteAuthCryptoModule;", "Lcom/discord/codegen/NativeRemoteAuthCryptoModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "keyPair", "Ljava/security/KeyPair;", "generateKeyPair", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getEncodedPublicKey", "getPublicKeyFingerprint", "decrypt", "ciphertext", "", "releaseKeyPair", "Companion", "authentication_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteAuthCryptoModule extends NativeRemoteAuthCryptoModuleSpec {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "RemoteAuthCryptoModule";
    private volatile KeyPair keyPair;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/authentication/RemoteAuthCryptoModule$Companion;", "", "<init>", "()V", "TAG", "", "authentication_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteAuthCryptoModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeRemoteAuthCryptoModuleSpec
    public void decrypt(@NotNull String ciphertext, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        KeyPair keyPair = this.keyPair;
        if (keyPair == null) {
            promise.reject("NO_KEY", "No key pair has been generated");
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(ciphertext, 2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            cipher.init(2, keyPair.getPrivate(), new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            promise.resolve(Base64.encodeToString(cipher.doFinal(bArrDecode), 3));
        } catch (Exception e10) {
            Log.INSTANCE.e(TAG, "Failed to decrypt ciphertext", e10);
            promise.reject("DECRYPT_ERROR", "Failed to decrypt ciphertext", e10);
        }
    }

    @Override // com.discord.codegen.NativeRemoteAuthCryptoModuleSpec
    public void generateKeyPair(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(RecyclerView.ItemAnimator.FLAG_MOVED);
            this.keyPair = keyPairGenerator.generateKeyPair();
            promise.resolve(null);
        } catch (Exception e10) {
            Log.INSTANCE.e(TAG, "Failed to generate key pair", e10);
            promise.reject("KEYGEN_ERROR", "Failed to generate RSA key pair", e10);
        }
    }

    @Override // com.discord.codegen.NativeRemoteAuthCryptoModuleSpec
    public void getEncodedPublicKey(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        KeyPair keyPair = this.keyPair;
        if (keyPair == null) {
            promise.reject("NO_KEY", "No key pair has been generated");
            return;
        }
        try {
            promise.resolve(Base64.encodeToString(keyPair.getPublic().getEncoded(), 3));
        } catch (Exception e10) {
            Log.INSTANCE.e(TAG, "Failed to encode public key", e10);
            promise.reject("ENCODE_ERROR", "Failed to encode public key", e10);
        }
    }

    @Override // com.discord.codegen.NativeRemoteAuthCryptoModuleSpec
    public void getPublicKeyFingerprint(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        KeyPair keyPair = this.keyPair;
        if (keyPair == null) {
            promise.reject("NO_KEY", "No key pair has been generated");
            return;
        }
        try {
            promise.resolve(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(keyPair.getPublic().getEncoded()), 11));
        } catch (Exception e10) {
            Log.INSTANCE.e(TAG, "Failed to compute fingerprint", e10);
            promise.reject("FINGERPRINT_ERROR", "Failed to compute public key fingerprint", e10);
        }
    }

    @Override // com.discord.codegen.NativeRemoteAuthCryptoModuleSpec
    public void releaseKeyPair() {
        this.keyPair = null;
    }
}
