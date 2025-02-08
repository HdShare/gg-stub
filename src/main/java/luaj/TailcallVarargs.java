package luaj;

public class TailcallVarargs extends Varargs {
    private Varargs args;
    private LuaValue func;
    private final Globals globals;
    private Varargs result;

    public TailcallVarargs(Globals globals, LuaValue f, Varargs args) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isTailcall() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Varargs eval() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue arg(int i) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue arg1() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int narg() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Varargs subargs(int start) {
        throw new RuntimeException("Stub!");
    }
}