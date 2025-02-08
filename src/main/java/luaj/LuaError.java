package luaj;

public class LuaError extends RuntimeException {
    public static final int MAX_STRING_LEN = 124;
    private static final long serialVersionUID = 1;
    protected Throwable cause;
    protected String detailMessage;
    protected String file;
    protected String fileline;
    protected int level;
    protected int line;
    LuaValue object;
    public String prefix;
    protected String traceback;

    @Override
    public String getMessage() {
        throw new RuntimeException("Stub!");
    }

    private String limitStr(String ret) {
        throw new RuntimeException("Stub!");
    }

    private String getFileLine() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue getMessageObject() {
        throw new RuntimeException("Stub!");
    }

    public LuaError(Throwable cause) {
        throw new RuntimeException("Stub!");
    }

    public LuaError(String message) {
        throw new RuntimeException("Stub!");
    }

    public LuaError(String file, int line, String message) {
        throw new RuntimeException("Stub!");
    }

    public void setFileLine() {
        throw new RuntimeException("Stub!");
    }

    public LuaError(String message, Throwable cause) {
        throw new RuntimeException("Stub!");
    }

    public LuaError(String message, int level) {
        throw new RuntimeException("Stub!");
    }

    public LuaError(LuaValue message_object) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Throwable getCause() {
        throw new RuntimeException("Stub!");
    }

    public static class Internal extends LuaError {
        public Internal(Throwable cause) {
            super(cause);
            throw new RuntimeException("Stub!");
        }
    }

    public static class StackOverflow extends LuaError {
        public StackOverflow(String message, Throwable cause) {
            super(message, cause);
            throw new RuntimeException("Stub!");
        }
    }

    public static void main(String[] args) throws Throwable {
        throw new RuntimeException("Stub!");
    }
}