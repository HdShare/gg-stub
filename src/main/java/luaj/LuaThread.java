package luaj;

public class LuaThread extends LuaValue {
    public static final int MAX_CALLSTACK = 256;
    public static final int STATUS_DEAD = 4;
    public static final int STATUS_INITIAL = 0;
    public static final int STATUS_NORMAL = 3;
    public static final int STATUS_RUNNING = 2;
    public static final int STATUS_SUSPENDED = 1;
    public static LuaValue s_metatable = null;
    public static final long thread_orphan_check_interval = 5000;
    public Object callstack;
    public LuaValue errorfunc;
    public final Globals globals;
    public final State state;
    public static int coroutine_count = 0;
    public static final String[] STATUS_NAMES = {"suspended", "suspended", "running", "normal", "dead"};

    public LuaThread(Globals globals) {
        throw new RuntimeException("Stub!");
    }

    public LuaThread(Globals globals, LuaValue func) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int type() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String typename() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isthread() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaThread optthread(LuaThread defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaThread checkthread() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    public String getStatus() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMainThread() {
        throw new RuntimeException("Stub!");
    }

    public static class State implements Runnable {
        public int bytecodes;
        public final LuaValue function;
        private final Globals globals;
        public boolean hookcall;
        public int hookcount;
        public LuaFunction hookfunc;
        public boolean hookline;
        public boolean hookrtrn;
        public int inhook;
        public int lastline;
        public int oldpc;
        Varargs args = LuaValue.NONE;
        Varargs result = LuaValue.NONE;
        String error = null;
        public int status = 0;

        State(Globals globals, LuaThread lua_thread, LuaValue function) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public synchronized void run() {
            throw new RuntimeException("Stub!");
        }
    }
}