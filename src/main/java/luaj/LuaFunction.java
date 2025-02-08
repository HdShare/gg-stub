package luaj;

import android.ext.Script;

public abstract class LuaFunction extends LuaValue {
    private static final String GG_LIB = Script.class.getName();
    public static LuaValue s_metatable;

    @Override
    public int type() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String typename() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean isfunction() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaFunction checkfunction() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaFunction optfunction(LuaFunction defval) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaString strvalue() {
        throw new RuntimeException("Stub!");
    }

    public String classnamestub() {
        throw new RuntimeException("Stub!");
    }

    public static String name(String className) {
        throw new RuntimeException("Stub!");
    }

    public String name() {
        throw new RuntimeException("Stub!");
    }

    public static void main(String[] args) throws Throwable {
        throw new RuntimeException("Stub!");
    }
}