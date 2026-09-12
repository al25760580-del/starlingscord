package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface j3 {
    void captureReplay(Boolean bool);

    i3 getBreadcrumbConverter();

    boolean isDebugMaskingOverlayEnabled();

    void pause();

    void resume();

    void setBreadcrumbConverter(i3 i3Var);

    void start();

    void stop();
}
