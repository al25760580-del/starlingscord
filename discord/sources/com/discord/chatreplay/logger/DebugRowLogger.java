package com.discord.chatreplay.logger;

import a3.e;
import com.facebook.react.runtime.p;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ls.d;
import ls.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/discord/chatreplay/logger/DebugRowLogger;", "Lcom/discord/chatreplay/logger/RowLogger;", "logsFolderPath", "Ljava/nio/file/Path;", "tag", "", "<init>", "(Ljava/nio/file/Path;I)V", "replayFile", "Ljava/io/File;", "jsonFile", "lastUpdateTimestamp", "", "Ljava/lang/Long;", "logRowsUpdate", "", "rowsJson", "", "logRowsClear", "maybeInsertDelay", "appendLine", "line", "writeJson", "chat_replay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebugRowLogger implements RowLogger {

    @NotNull
    private final File jsonFile;
    private Long lastUpdateTimestamp;

    @NotNull
    private final File replayFile;

    public DebugRowLogger(@NotNull Path logsFolderPath, int i7) {
        Intrinsics.checkNotNullParameter(logsFolderPath, "logsFolderPath");
        new File(logsFolderPath.toString(), i7 + ".replay").delete();
        new File(logsFolderPath.toString(), i7 + ".json").delete();
        this.replayFile = new File(logsFolderPath.toString(), i7 + ".replay");
        this.jsonFile = new File(logsFolderPath.toString(), i7 + ".json");
    }

    private final void appendLine(String line) throws IOException {
        if (StringsKt.K(line)) {
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(DebugRowLoggerKt.outputStream(this.replayFile, true), Charsets.UTF_8);
        try {
            outputStreamWriter.write(line + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            outputStreamWriter.flush();
            Unit unit = Unit.f14616a;
            outputStreamWriter.close();
            writeJson();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    private final void maybeInsertDelay() throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l6 = this.lastUpdateTimestamp;
        if (l6 != null) {
            appendLine(e.h(jCurrentTimeMillis - l6.longValue(), "{\"delayMs\":", "}"));
        }
        this.lastUpdateTimestamp = Long.valueOf(jCurrentTimeMillis);
    }

    private final void writeJson() throws IOException {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        FileOutputStream fileOutputStream = new FileOutputStream(this.jsonFile);
        Charset charset = Charsets.UTF_8;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, charset);
        try {
            outputStreamWriter.write("[\n");
            l.q(new InputStreamReader(new FileInputStream(this.replayFile), charset), new p(10, booleanRef, outputStreamWriter));
            outputStreamWriter.write("\n]");
            outputStreamWriter.flush();
            Unit unit = Unit.f14616a;
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.k(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeJson$lambda$3$lambda$2(Ref.BooleanRef booleanRef, OutputStreamWriter outputStreamWriter, String line) throws IOException {
        Intrinsics.checkNotNullParameter(line, "line");
        if (booleanRef.element) {
            outputStreamWriter.write(",\n");
        }
        outputStreamWriter.write(line);
        booleanRef.element = true;
        return Unit.f14616a;
    }

    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsClear() throws IOException {
        maybeInsertDelay();
        appendLine("{\"type\":\"clear\"}");
    }

    @Override // com.discord.chatreplay.logger.RowLogger
    public void logRowsUpdate(@NotNull String rowsJson) throws IOException {
        Intrinsics.checkNotNullParameter(rowsJson, "rowsJson");
        maybeInsertDelay();
        appendLine(rowsJson);
    }
}
