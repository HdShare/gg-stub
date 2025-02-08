package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

public abstract class VarArgFunction extends LibFunction {
    @Override
    public LuaValue call() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue call(LuaValue arg) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue call(LuaValue arg1, LuaValue arg2) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public Varargs invoke(Varargs args) {
        throw new RuntimeException("Stub!");
    }
}