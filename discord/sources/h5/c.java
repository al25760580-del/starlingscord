package h5;

import android.hardware.Camera;
import android.os.Process;
import android.view.WindowManager;
import androidx.datastore.preferences.protobuf.d1;
import com.budiyev.android.codescanner.CodeScanner;
import com.google.android.gms.internal.play_billing.u0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10338e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CodeScanner f10339i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CodeScanner codeScanner, int i7, int i10) {
        super("cs-init");
        this.f10339i = codeScanner;
        this.f10337d = i7;
        this.f10338e = i10;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0282  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Camera cameraOpen;
        Camera cameraOpen2;
        int i7;
        char c8;
        Camera.Size previewSize;
        q qVar;
        q qVar2;
        q qVar3;
        List<String> supportedSceneModes;
        int i10;
        Process.setThreadPriority(10);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i11 = this.f10339i.f3911w;
        char c10 = 1;
        if (i11 == -1 || i11 == -2) {
            int numberOfCameras = Camera.getNumberOfCameras();
            int i12 = i11 == -1 ? 0 : 1;
            int i13 = 0;
            while (true) {
                if (i13 >= numberOfCameras) {
                    cameraOpen = null;
                    break;
                }
                Camera.getCameraInfo(i13, cameraInfo);
                if (cameraInfo.facing == i12) {
                    cameraOpen = Camera.open(i13);
                    this.f10339i.f3911w = i13;
                    break;
                }
                i13++;
            }
            cameraOpen2 = cameraOpen;
        } else {
            cameraOpen2 = Camera.open(i11);
            Camera.getCameraInfo(i11, cameraInfo);
        }
        Camera camera = cameraOpen2;
        if (camera == null) {
            throw new d1("Unable to access camera");
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            throw new d1("Unable to configure camera");
        }
        WindowManager windowManager = (WindowManager) this.f10339i.f3892b.getSystemService("window");
        if (windowManager == null) {
            throw new d1("Unable to access window manager");
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            i7 = 0;
        } else if (rotation == 1) {
            i7 = 90;
        } else if (rotation == 2) {
            i7 = 180;
        } else if (rotation == 3) {
            i7 = 270;
        } else {
            if (rotation % 90 != 0) {
                throw new d1("Invalid display rotation");
            }
            i7 = (rotation + 360) % 360;
        }
        int i14 = (((cameraInfo.facing != 1 ? 360 : 180) + cameraInfo.orientation) - i7) % 360;
        boolean z5 = i14 == 90 || i14 == 270;
        int i15 = z5 ? this.f10338e : this.f10337d;
        int i16 = z5 ? this.f10337d : this.f10338e;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null || supportedPreviewSizes.isEmpty()) {
            c8 = c10;
            previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                throw new d1("Unable to configure camera preview size");
            }
            qVar = new q(previewSize.width, previewSize.height);
        } else {
            Collections.sort(supportedPreviewSizes, new ag.t(3));
            float f2 = i15 / i16;
            float f7 = 0.3f;
            while (true) {
                if (f7 <= 3.0f) {
                    Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Camera.Size next = it.next();
                            int i17 = next.width;
                            int i18 = next.height;
                            c8 = c10;
                            if (i17 * i18 < 589824 || Math.abs(f2 - (i17 / i18)) > f7) {
                                c10 = c8;
                            } else {
                                qVar = new q(i17, i18);
                            }
                        } else {
                            f7 += 0.1f;
                        }
                    }
                } else {
                    c8 = c10;
                    previewSize = parameters.getPreviewSize();
                    if (previewSize != null) {
                        throw new d1("Unable to configure camera preview size");
                    }
                    qVar = new q(previewSize.width, previewSize.height);
                }
            }
        }
        int i19 = qVar.f10374a;
        int i20 = qVar.f10375b;
        parameters.setPreviewSize(i19, i20);
        parameters.setPreviewFormat(17);
        int i21 = z5 ? i20 : i19;
        int i22 = z5 ? i19 : i20;
        int i23 = this.f10337d;
        int i24 = this.f10338e;
        if (i21 == i23 && i22 == i24) {
            qVar2 = new q(i23, i24);
        } else {
            int i25 = (i21 * i24) / i22;
            qVar2 = i25 < i23 ? new q(i23, (i22 * i23) / i21) : new q(i25, i24);
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        boolean z6 = (supportedFocusModes == null || !(supportedFocusModes.contains("auto") || supportedFocusModes.contains("continuous-picture"))) ? 0 : c8;
        if (z6 == 0) {
            this.f10339i.f3909u = false;
        }
        q qVar4 = new q(this.f10337d, this.f10338e);
        if (z6 != 0 && this.f10339i.f3909u) {
            android.support.v4.media.session.b.u(parameters, this.f10339i.G);
            s frameRect = this.f10339i.f3894d.getFrameRect();
            if (frameRect != null) {
                char c11 = (i14 == 90 || i14 == 270) ? c8 : (char) 0;
                int i26 = c11 != 0 ? i20 : i19;
                if (c11 == 0) {
                    i19 = i20;
                }
                android.support.v4.media.session.b.e(parameters, android.support.v4.media.session.b.l(i26, i19, frameRect, qVar2, qVar4), i26, i19, i14);
            }
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        boolean z7 = (supportedFlashModes == null || !supportedFlashModes.contains("torch")) ? 0 : c8;
        if (z7 == 0) {
            this.f10339i.f3910v = false;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Collections.sort(supportedPreviewFpsRange, new ag.t(4));
            for (int[] iArr : supportedPreviewFpsRange) {
                int i27 = iArr[0];
                if (i27 >= 10000 && (i10 = iArr[c8]) <= 30000) {
                    parameters.setPreviewFpsRange(i27, i10);
                    break;
                }
            }
        }
        if (!"barcode".equals(parameters.getSceneMode()) && (supportedSceneModes = parameters.getSupportedSceneModes()) != null && supportedSceneModes.contains("barcode")) {
            parameters.setSceneMode("barcode");
        }
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(c8);
        }
        camera.setParameters(parameters);
        camera.setDisplayOrientation(i14);
        synchronized (this.f10339i.f3891a) {
            q qVar5 = qVar;
            CodeScanner codeScanner = this.f10339i;
            n nVar = new n(codeScanner.f3900l, codeScanner.f3901m, codeScanner.f3902n, this.f10339i.f3903o);
            qVar3 = qVar2;
            this.f10339i.f3905q = new o(camera, cameraInfo, nVar, qVar5, qVar3, qVar4, i14, z6, z7);
            if (nVar.f10364h != 1) {
                throw new IllegalStateException("Illegal decoder state");
            }
            nVar.f10358b.start();
            this.f10339i.f3906r = false;
            this.f10339i.f3907s = true;
        }
        CodeScanner codeScanner2 = this.f10339i;
        codeScanner2.f3893c.post(new u0(codeScanner2, qVar3, 10, false));
    }
}
