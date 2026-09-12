package x0;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static void a(Notification.ProgressStyle progressStyle, int i7) {
        progressStyle.setProgress(i7);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z5) {
        progressStyle.setProgressIndeterminate(z5);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<s0> list) {
        for (s0 s0Var : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(s0Var.f22550a).setColor(s0Var.f22552c).setId(s0Var.f22551b));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<t0> list) {
        for (t0 t0Var : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(t0Var.f22553a).setColor(t0Var.f22555c).setId(t0Var.f22554b));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z5) {
        progressStyle.setStyledByProgress(z5);
    }
}
