package com.discord.billing;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u000e\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u0082\u0001\r\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/discord/billing/BillingManagerException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getErrorCode", "ServiceDisconnectedException", "BillingUnavailableException", "ServiceUnavailableException", "FeatureNotSupportedException", "ItemUnavailableException", "DeveloperErrorException", "GenericErrorException", "ItemAlreadyOwnedException", "ItemNotOwnedException", "NetworkErrorException", "BillingClientNotReadyException", "UnknownBillingException", "BillingException", "Companion", "Lcom/discord/billing/BillingManagerException$BillingClientNotReadyException;", "Lcom/discord/billing/BillingManagerException$BillingException;", "Lcom/discord/billing/BillingManagerException$BillingUnavailableException;", "Lcom/discord/billing/BillingManagerException$DeveloperErrorException;", "Lcom/discord/billing/BillingManagerException$FeatureNotSupportedException;", "Lcom/discord/billing/BillingManagerException$GenericErrorException;", "Lcom/discord/billing/BillingManagerException$ItemAlreadyOwnedException;", "Lcom/discord/billing/BillingManagerException$ItemNotOwnedException;", "Lcom/discord/billing/BillingManagerException$ItemUnavailableException;", "Lcom/discord/billing/BillingManagerException$NetworkErrorException;", "Lcom/discord/billing/BillingManagerException$ServiceDisconnectedException;", "Lcom/discord/billing/BillingManagerException$ServiceUnavailableException;", "Lcom/discord/billing/BillingManagerException$UnknownBillingException;", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BillingManagerException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String errorCode;

    @NotNull
    private final String reason;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/discord/billing/BillingManagerException$BillingClientNotReadyException;", "Lcom/discord/billing/BillingManagerException;", "<init>", "()V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BillingClientNotReadyException extends BillingManagerException {
        public BillingClientNotReadyException() {
            super("Billing client is not ready yet", "999", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$BillingException;", "Lcom/discord/billing/BillingManagerException;", "message", "", "<init>", "(Ljava/lang/String;)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BillingException extends BillingManagerException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillingException(@NotNull String message) {
            super(message, "5000", null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$BillingUnavailableException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BillingUnavailableException extends BillingManagerException {
        public BillingUnavailableException(int i7) {
            super(kk.b.h(i7, "Billing service unavailable due to user error, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/discord/billing/BillingManagerException$Companion;", "", "<init>", "()V", "fromBillingResult", "Lcom/discord/billing/BillingManagerException;", "responseCode", "", "wrap", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "context", "", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BillingManagerException fromBillingResult(int responseCode) {
            if (responseCode == -2) {
                return new FeatureNotSupportedException(responseCode);
            }
            if (responseCode == -1) {
                return new ServiceDisconnectedException(responseCode);
            }
            if (responseCode == 12) {
                return new NetworkErrorException(responseCode);
            }
            switch (responseCode) {
                case 2:
                    return new ServiceUnavailableException(responseCode);
                case 3:
                    return new BillingUnavailableException(responseCode);
                case 4:
                    return new ItemUnavailableException(responseCode);
                case 5:
                    return new DeveloperErrorException(responseCode);
                case 6:
                    return new GenericErrorException(responseCode);
                case 7:
                    return new ItemAlreadyOwnedException(responseCode);
                case 8:
                    return new ItemNotOwnedException(responseCode);
                default:
                    return new UnknownBillingException(responseCode);
            }
        }

        @NotNull
        public final BillingManagerException wrap(@NotNull Exception e10, @NotNull String context) {
            Intrinsics.checkNotNullParameter(e10, "e");
            Intrinsics.checkNotNullParameter(context, "context");
            return e10 instanceof BillingManagerException ? (BillingManagerException) e10 : new BillingException(kk.b.k(context, " exception: ", e10.getMessage()));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$DeveloperErrorException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeveloperErrorException extends BillingManagerException {
        public DeveloperErrorException(int i7) {
            super(kk.b.h(i7, "Developer error, the request is not valid, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$FeatureNotSupportedException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeatureNotSupportedException extends BillingManagerException {
        public FeatureNotSupportedException(int i7) {
            super(kk.b.h(i7, "Feature not supported, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$GenericErrorException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GenericErrorException extends BillingManagerException {
        public GenericErrorException(int i7) {
            super(kk.b.h(i7, "An error occurred in the billing process, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$ItemAlreadyOwnedException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemAlreadyOwnedException extends BillingManagerException {
        public ItemAlreadyOwnedException(int i7) {
            super(kk.b.h(i7, "The item is already owned, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$ItemNotOwnedException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemNotOwnedException extends BillingManagerException {
        public ItemNotOwnedException(int i7) {
            super(kk.b.h(i7, "The item is not owned, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$ItemUnavailableException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemUnavailableException extends BillingManagerException {
        public ItemUnavailableException(int i7) {
            super(kk.b.h(i7, "Item is not available for purchase, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$NetworkErrorException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkErrorException extends BillingManagerException {
        public NetworkErrorException(int i7) {
            super(kk.b.h(i7, "Network error, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$ServiceDisconnectedException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServiceDisconnectedException extends BillingManagerException {
        public ServiceDisconnectedException(int i7) {
            super(kk.b.h(i7, "Billing service disconnected, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$ServiceUnavailableException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServiceUnavailableException extends BillingManagerException {
        public ServiceUnavailableException(int i7) {
            super(kk.b.h(i7, "Google Play Billing Service unavailable, Google Error Code: "), String.valueOf(i7), null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/billing/BillingManagerException$UnknownBillingException;", "Lcom/discord/billing/BillingManagerException;", "code", "", "<init>", "(I)V", "billing_androidRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownBillingException extends BillingManagerException {
        public UnknownBillingException(int i7) {
            super(kk.b.h(i7, "Unhandled billing exception. Code: "), String.valueOf(i7), null);
        }
    }

    public /* synthetic */ BillingManagerException(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    private BillingManagerException(String str, String str2) {
        super(str);
        this.reason = str;
        this.errorCode = str2;
    }
}
