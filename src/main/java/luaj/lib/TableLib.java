package luaj.lib;

import luaj.LuaValue;
import luaj.Varargs;

public class TableLib extends TwoArgFunction {
    @Override
    public LuaValue call(LuaValue modname, LuaValue env) {
        throw new RuntimeException("Stub!");
    }

    static class concat extends TableLibFunction {
        concat() {
        }

        @Override
        public LuaValue call(LuaValue list) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue call(LuaValue list, LuaValue sep) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue call(LuaValue list, LuaValue sep, LuaValue i) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue call(LuaValue list, LuaValue sep, LuaValue i, LuaValue j) {
            throw new RuntimeException("Stub!");
        }
    }

    static class insert extends VarArgFunction {
        insert() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class move extends VarArgFunction {
        move() {
        }

        private static long subtractExact(long x, long y) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class pack extends VarArgFunction {
        pack() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class remove extends VarArgFunction {
        remove() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class sort extends VarArgFunction {
        sort() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    static class unpack extends VarArgFunction {
        unpack() {
        }

        @Override
        public Varargs invoke(Varargs args) {
            throw new RuntimeException("Stub!");
        }
    }

    public static void main(String[] args) throws Throwable {
    }
}