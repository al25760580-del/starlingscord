package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0017J%\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/react/devsupport/StackTraceHelper;", "", "<init>", "()V", "COLUMN_KEY", "", "LINE_NUMBER_KEY", "FILE_KEY", "METHOD_NAME_KEY", "COLLAPSE_KEY", "MESSAGE_KEY", "ORIGINAL_MESSAGE_KEY", "NAME_KEY", "COMPONENT_STACK_KEY", "STACK_KEY", "ID_KEY", "IS_FATAL_KEY", "EXTRA_DATA_KEY", "STACK_FRAME_PATTERN1", "Ljava/util/regex/Pattern;", "STACK_FRAME_PATTERN2", "convertJsStackTrace", "", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", StackTraceHelper.STACK_KEY, "Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "(Ljava/lang/String;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "convertJavaStackTrace", "exception", "", "(Ljava/lang/Throwable;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "formatFrameSource", "frame", "formatStackTrace", AlertFragment.ARG_TITLE, "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)Ljava/lang/String;", "convertProcessedError", "Lcom/facebook/react/bridge/JavaOnlyMap;", "error", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ProcessedError;", "convertProcessedError$ReactAndroid_release", "StackFrameImpl", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStackTraceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceHelper.kt\ncom/facebook/react/devsupport/StackTraceHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n739#2,9:264\n37#3:273\n36#3,3:274\n1#4:277\n*S KotlinDebug\n*F\n+ 1 StackTraceHelper.kt\ncom/facebook/react/devsupport/StackTraceHelper\n*L\n130#1:264,9\n130#1:273\n130#1:274,3\n*E\n"})
public final class StackTraceHelper {

    @NotNull
    public static final String COLLAPSE_KEY = "collapse";

    @NotNull
    public static final String COLUMN_KEY = "column";

    @NotNull
    public static final String COMPONENT_STACK_KEY = "componentStack";

    @NotNull
    public static final String EXTRA_DATA_KEY = "extraData";

    @NotNull
    public static final String FILE_KEY = "file";

    @NotNull
    public static final String ID_KEY = "id";

    @NotNull
    public static final StackTraceHelper INSTANCE = new StackTraceHelper();

    @NotNull
    public static final String IS_FATAL_KEY = "isFatal";

    @NotNull
    public static final String LINE_NUMBER_KEY = "lineNumber";

    @NotNull
    public static final String MESSAGE_KEY = "message";

    @NotNull
    public static final String METHOD_NAME_KEY = "methodName";

    @NotNull
    public static final String NAME_KEY = "name";

    @NotNull
    public static final String ORIGINAL_MESSAGE_KEY = "originalMessage";

    @NotNull
    private static final Pattern STACK_FRAME_PATTERN1;

    @NotNull
    private static final Pattern STACK_FRAME_PATTERN2;

    @NotNull
    public static final String STACK_KEY = "stack";

    static {
        Pattern patternCompile = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        STACK_FRAME_PATTERN1 = patternCompile;
        Pattern patternCompile2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
        STACK_FRAME_PATTERN2 = patternCompile2;
    }

    private StackTraceHelper() {
    }

    @NotNull
    public static final StackFrame[] convertJavaStackTrace(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        StackTraceElement[] stackTrace = exception.getStackTrace();
        int length = stackTrace.length;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i7 = 0; i7 < length; i7++) {
            String className = stackTrace[i7].getClassName();
            String fileName = stackTrace[i7].getFileName();
            String methodName = stackTrace[i7].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "getMethodName(...)");
            stackFrameArr[i7] = new StackFrameImpl(className, fileName, methodName, stackTrace[i7].getLineNumber(), -1, false, 32, null);
        }
        return stackFrameArr;
    }

    @NotNull
    public static final StackFrame[] convertJsStackTrace(ReadableArray stack) {
        StackFrameImpl stackFrameImpl;
        int size = stack != null ? stack.size() : 0;
        if (stack == null) {
            return new StackFrame[0];
        }
        StackFrame[] stackFrameArr = new StackFrame[size];
        for (int i7 = 0; i7 < size; i7++) {
            ReadableType type = stack.getType(i7);
            if (type == ReadableType.Map) {
                ReadableMap map = stack.getMap(i7);
                if (map == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string = map.getString("methodName");
                if (string == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string2 = map.getString("file");
                if (string2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean z5 = map.hasKey(COLLAPSE_KEY) && !map.isNull(COLLAPSE_KEY) && map.getBoolean(COLLAPSE_KEY);
                int i10 = -1;
                int i11 = (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber");
                if (map.hasKey("column") && !map.isNull("column")) {
                    i10 = map.getInt("column");
                }
                stackFrameImpl = new StackFrameImpl(string2, null, string, i11, i10, z5, 2, null);
            } else {
                if (type != ReadableType.String) {
                    throw new IllegalStateException(("Cannot parse the stackframe for " + stack).toString());
                }
                String string3 = stack.getString(i7);
                if (string3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                stackFrameImpl = new StackFrameImpl(null, null, string3, -1, -1, false, 34, null);
            }
            stackFrameArr[i7] = stackFrameImpl;
        }
        return stackFrameArr;
    }

    @NotNull
    public static final JavaOnlyMap convertProcessedError$ReactAndroid_release(@NotNull ReactJsExceptionHandler.ProcessedError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : error.getStack()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            Integer column = stackFrame.getColumn();
            if (column != null) {
                javaOnlyMap.putDouble("column", column.intValue());
            }
            Integer lineNumber = stackFrame.getLineNumber();
            if (lineNumber != null) {
                javaOnlyMap.putDouble("lineNumber", lineNumber.intValue());
            }
            javaOnlyMap.putString("file", stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            javaOnlyArray.pushMap(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", error.getMessage());
        String originalMessage = error.getOriginalMessage();
        if (originalMessage != null) {
            javaOnlyMap2.putString(ORIGINAL_MESSAGE_KEY, originalMessage);
        }
        String name = error.getName();
        if (name != null) {
            javaOnlyMap2.putString(NAME_KEY, name);
        }
        String componentStack = error.getComponentStack();
        if (componentStack != null) {
            javaOnlyMap2.putString(COMPONENT_STACK_KEY, componentStack);
        }
        javaOnlyMap2.putArray(STACK_KEY, javaOnlyArray);
        javaOnlyMap2.putInt(ID_KEY, error.getId());
        javaOnlyMap2.putBoolean(IS_FATAL_KEY, error.isFatal());
        javaOnlyMap2.putMap("extraData", error.getExtraData());
        return javaOnlyMap2;
    }

    @NotNull
    public static final String formatStackTrace(String title, @NotNull StackFrame[] stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        StringBuilder sbO = kk.b.o(title, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        for (StackFrame stackFrame : stack) {
            sbO.append(stackFrame.getMethod());
            sbO.append("\n    ");
            sbO.append(INSTANCE.formatFrameSource(stackFrame));
            sbO.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        String string = sbO.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String formatFrameSource(@NotNull StackFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(frame.getFileName());
        int line = frame.getLine();
        if (line > 0) {
            sb2.append(":");
            sb2.append(line);
            int column = frame.getColumn();
            if (column > 0) {
                sb2.append(":");
                sb2.append(column);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl;", "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "file", "", "fileName", "method", "line", "", "column", "isCollapsed", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "getFile", "()Ljava/lang/String;", "getFileName", "getMethod", "getLine", "()I", "getColumn", "()Z", "toJSON", "Lorg/json/JSONObject;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStackTraceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceHelper.kt\ncom/facebook/react/devsupport/StackTraceHelper$StackFrameImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class StackFrameImpl implements StackFrame {
        private final int column;
        private final String file;
        private final String fileName;
        private final boolean isCollapsed;
        private final int line;

        @NotNull
        private final String method;

        public StackFrameImpl(String str, String str2, @NotNull String method, int i7, int i10, boolean z5) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.file = str;
            this.fileName = str2;
            this.method = method;
            this.line = i7;
            this.column = i10;
            this.isCollapsed = z5;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getColumn() {
            return this.column;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFile() {
            return this.file;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getLine() {
            return this.line;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        @NotNull
        public String getMethod() {
            return this.method;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        /* JADX INFO: renamed from: isCollapsed, reason: from getter */
        public boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        @NotNull
        public JSONObject toJSON() {
            String file = getFile();
            if (file == null) {
                file = "";
            }
            return new JSONObject(w0.g(new Pair("file", file), new Pair("methodName", getMethod()), new Pair("lineNumber", Integer.valueOf(getLine())), new Pair("column", Integer.valueOf(getColumn())), new Pair(StackTraceHelper.COLLAPSE_KEY, Boolean.valueOf(getIsCollapsed()))));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ StackFrameImpl(String str, String str2, String str3, int i7, int i10, boolean z5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 2) != 0) {
                str2 = str != null ? new File(str).getName() : null;
            }
            this(str, str2, str3, i7, i10, (i11 & 32) != 0 ? false : z5);
        }
    }

    @NotNull
    public final StackFrame[] convertJsStackTrace(JSONArray stack) {
        if (stack == null) {
            return new StackFrame[0];
        }
        int length = stack.length();
        try {
            StackFrame[] stackFrameArr = new StackFrame[length];
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject jSONObject = stack.getJSONObject(i7);
                String string = jSONObject.getString("methodName");
                String string2 = jSONObject.getString("file");
                int i10 = -1;
                int i11 = (!jSONObject.has("lineNumber") || jSONObject.isNull("lineNumber")) ? -1 : jSONObject.getInt("lineNumber");
                if (jSONObject.has("column") && !jSONObject.isNull("column")) {
                    i10 = jSONObject.getInt("column");
                }
                int i12 = i10;
                boolean z5 = jSONObject.has(COLLAPSE_KEY) && !jSONObject.isNull(COLLAPSE_KEY) && jSONObject.getBoolean(COLLAPSE_KEY);
                Intrinsics.checkNotNull(string);
                stackFrameArr[i7] = new StackFrameImpl(string2, null, string, i11, i12, z5, 2, null);
            }
            return stackFrameArr;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NotNull
    public final StackFrame[] convertJsStackTrace(@NotNull String stack) {
        Collection collectionF0;
        StackFrameImpl stackFrameImpl;
        Intrinsics.checkNotNullParameter(stack, "stack");
        List listF = new Regex(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).f(stack);
        if (!listF.isEmpty()) {
            ListIterator listIterator = listF.listIterator(listF.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionF0 = CollectionsKt.f0(listF, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    collectionF0 = n0.f14659d;
                    break;
                }
            }
        } else {
            collectionF0 = n0.f14659d;
            break;
        }
        String[] strArr = (String[]) collectionF0.toArray(new String[0]);
        int length = strArr.length;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i7 = 0; i7 < length; i7++) {
            Matcher matcher = STACK_FRAME_PATTERN1.matcher(strArr[i7]);
            Matcher matcher2 = STACK_FRAME_PATTERN2.matcher(strArr[i7]);
            if (matcher2.find()) {
                matcher = matcher2;
            } else if (!matcher.find()) {
                matcher = null;
            }
            if (matcher != null) {
                String strGroup = matcher.group(2);
                String strGroup2 = matcher.group(1);
                if (strGroup2 == null) {
                    strGroup2 = "(unknown)";
                }
                String str = strGroup2;
                String strGroup3 = matcher.group(3);
                String strGroup4 = matcher.group(4);
                if (strGroup3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int i10 = Integer.parseInt(strGroup3);
                if (strGroup4 != null) {
                    stackFrameImpl = new StackFrameImpl(strGroup, null, str, i10, Integer.parseInt(strGroup4), false, 34, null);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                stackFrameImpl = new StackFrameImpl(null, null, strArr[i7], -1, -1, false, 34, null);
            }
            stackFrameArr[i7] = stackFrameImpl;
        }
        return stackFrameArr;
    }
}
