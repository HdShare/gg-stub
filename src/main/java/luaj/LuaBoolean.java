package luaj;

public final class LuaBoolean extends LuaValue {
    public static LuaValue s_metatable;
    public final boolean v;

    public LuaBoolean(boolean b) {
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
    public boolean isboolean() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue not() {
        throw new RuntimeException("Stub!");
    }

    public boolean booleanValue() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean toboolean() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean optboolean(boolean defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean checkboolean() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }
}