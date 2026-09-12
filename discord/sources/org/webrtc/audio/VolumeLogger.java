package org.webrtc.audio;

import android.media.AudioManager;
import com.discord.jank_stats.JankRecordStore;
import com.facebook.react.uimanager.ViewProps;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;
import s0.g;

/* JADX INFO: loaded from: classes4.dex */
class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i7, int i10) {
            this.maxRingVolume = i7;
            this.maxVoiceCallVolume = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                Logging.d(VolumeLogger.TAG, g.c(VolumeLogger.this.audioManager.getStreamVolume(2), "STREAM_RING stream volume: ", this.maxRingVolume, " (max=", ")"));
            } else if (mode == 3) {
                Logging.d(VolumeLogger.TAG, g.c(VolumeLogger.this.audioManager.getStreamVolume(0), "VOICE_CALL stream volume: ", this.maxVoiceCallVolume, " (max=", ")"));
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        Logging.d(TAG, ViewProps.START + WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        Logging.d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, JankRecordStore.FLUSH_INTERVAL_MS);
    }

    public void stop() {
        Logging.d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
