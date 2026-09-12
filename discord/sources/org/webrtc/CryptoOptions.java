package org.webrtc;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean requireFrameEncryption;

        public /* synthetic */ Builder(int i7) {
            this();
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption, 0);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z5) {
            this.enableAes128Sha1_32CryptoCipher = z5;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z5) {
            this.enableEncryptedRtpHeaderExtensions = z5;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z5) {
            this.enableGcmCryptoSuites = z5;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z5) {
            this.requireFrameEncryption = z5;
            return this;
        }

        private Builder() {
        }
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        public /* synthetic */ SFrame(CryptoOptions cryptoOptions, boolean z5, int i7) {
            this(z5);
        }

        @CalledByNative("SFrame")
        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        private SFrame(boolean z5) {
            this.requireFrameEncryption = z5;
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;

        public /* synthetic */ Srtp(CryptoOptions cryptoOptions, boolean z5, boolean z6, boolean z7, int i7) {
            this(z5, z6, z7);
        }

        @CalledByNative("Srtp")
        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        @CalledByNative("Srtp")
        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        @CalledByNative("Srtp")
        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        private Srtp(boolean z5, boolean z6, boolean z7) {
            this.enableGcmCryptoSuites = z5;
            this.enableAes128Sha1_32CryptoCipher = z6;
            this.enableEncryptedRtpHeaderExtensions = z7;
        }
    }

    public /* synthetic */ CryptoOptions(boolean z5, boolean z6, boolean z7, boolean z10, int i7) {
        this(z5, z6, z7, z10);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @CalledByNative
    public SFrame getSFrame() {
        return this.sframe;
    }

    @CalledByNative
    public Srtp getSrtp() {
        return this.srtp;
    }

    private CryptoOptions(boolean z5, boolean z6, boolean z7, boolean z10) {
        this.srtp = new Srtp(this, z5, z6, z7, 0);
        this.sframe = new SFrame(this, z10, 0);
    }
}
