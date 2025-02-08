package luaj;

public class LuaClosure extends LuaFunction {
    private static final UpValue[] NOUPVALUES = new UpValue[0];
    private static int deep = 0;
    final Globals globals;
    public final Prototype p;
    public volatile int pc;
    public UpValue[] upValues;
    public String sourceFile = null;
    private Varargs varargs = NONE;

    public LuaClosure(Prototype p, LuaValue env, boolean fillUpValues) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isclosure() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaClosure optclosure(LuaClosure defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaClosure checkclosure() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    private LuaValue[] getNewStack() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final LuaValue call() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final LuaValue call(LuaValue arg) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final LuaValue call(LuaValue arg1, LuaValue arg2) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final Varargs invoke(Varargs varargs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public final Varargs onInvoke(Varargs varargs, boolean tailcall) {
        throw new RuntimeException("Stub!");
    }

    private static LuaError upValueOutOfRange(int type, int index, int len) {
        throw new RuntimeException("Stub!");
    }

    public Varargs getVarargs() {
        throw new RuntimeException("Stub!");
    }

    public void setVarargs(Varargs varargs) {
        throw new RuntimeException("Stub!");
    }

    protected Varargs execute(LuaValue[] stack, Varargs varargs_, boolean tailcall) {
        throw new RuntimeException("Stub!");
    }

    private void setCaller(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    private LuaValue checkRet(LuaValue ret) {
        throw new RuntimeException("Stub!");
    }

    private Varargs checkRet(Varargs ret) {
        throw new RuntimeException("Stub!");
    }

    private static void errorHook(Globals globals, LuaError le, StringBuilder msg) {
        throw new RuntimeException("Stub!");
    }

    private static void processErrorHooks(Globals globals, LuaError le, Prototype p, int pc, String name) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs protectedCall(Globals globals, LuaFunction caller, LuaValue func, Varargs args) {
        throw new RuntimeException("Stub!");
    }

    private UpValue findupval(LuaValue[] stack, short idx, UpValue[] openups) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String name() {
        throw new RuntimeException("Stub!");
    }

    public static void main(String[] args) throws Throwable {
        throw new RuntimeException("Stub!");
    }
}