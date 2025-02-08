package luaj;

import luaj.lib.VarArgFunction;

public abstract class Varargs {
    public static final ThreadLocal<VarArgFunction> curFunc = new ThreadLocal<>();

    public abstract LuaValue arg(int i);

    public abstract LuaValue arg1();

    public abstract int narg();

    public abstract Varargs subargs(int i);

    public Varargs eval() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTailcall() {
        throw new RuntimeException("Stub!");
    }

    public int type(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean isnil(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean isfunction(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean isnumber(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean isstring(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean istable(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean isthread(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean isvalue(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean optboolean(int i, boolean defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaClosure optclosure(int i, LuaClosure defval) {
        throw new RuntimeException("Stub!");
    }

    public double optdouble(int i, double defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaFunction optfunction(int i, LuaFunction defval) {
        throw new RuntimeException("Stub!");
    }

    public int optint(int i, int defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaLong optinteger(int i, LuaLong defval) {
        throw new RuntimeException("Stub!");
    }

    public long optlong(int i, long defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaNumber optnumber(int i, LuaNumber defval) {
        throw new RuntimeException("Stub!");
    }

    public String optjstring(int i, String defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaString optstring(int i, LuaString defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaTable opttable(int i, LuaTable defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaThread optthread(int i, LuaThread defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue optvalue(int i, LuaValue defval) {
        throw new RuntimeException("Stub!");
    }

    private LuaError argerr(int iarg, LuaError source) {
        throw new RuntimeException("Stub!");
    }

    public boolean checkboolean(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaClosure checkclosure(int i) {
        throw new RuntimeException("Stub!");
    }

    public double checkdouble(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaFunction checkfunction(int i) {
        throw new RuntimeException("Stub!");
    }

    public int checkint(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaLong checkinteger(int i) {
        throw new RuntimeException("Stub!");
    }

    public long checklong(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaNumber checknumber(int i) {
        throw new RuntimeException("Stub!");
    }

    public String checkjstring(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaString checkstring(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaTable checktable(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaThread checkthread(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue checkvalue(int i) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue checknotnil(int i) {
        throw new RuntimeException("Stub!");
    }

    public void argcheck(boolean test, int i, String msg) {
        throw new RuntimeException("Stub!");
    }

    public boolean isnoneornil(int i) {
        throw new RuntimeException("Stub!");
    }

    public boolean toboolean(int i) {
        throw new RuntimeException("Stub!");
    }

    public byte tobyte(int i) {
        throw new RuntimeException("Stub!");
    }

    public char tochar(int i) {
        throw new RuntimeException("Stub!");
    }

    public double todouble(int i) {
        throw new RuntimeException("Stub!");
    }

    public float tofloat(int i) {
        throw new RuntimeException("Stub!");
    }

    public int toint(int i) {
        throw new RuntimeException("Stub!");
    }

    public long tolong(int i) {
        throw new RuntimeException("Stub!");
    }

    public String tojstring(int i) {
        throw new RuntimeException("Stub!");
    }

    public short toshort(int i) {
        throw new RuntimeException("Stub!");
    }

    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    static class SubVarargs extends Varargs {
        private final int end;
        private final int start;
        private final Varargs v;

        public SubVarargs(Varargs varargs, int start, int end) {
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

    public static final class PairVarargs extends Varargs {
        private final LuaValue v1;
        private final Varargs v2;

        public PairVarargs(LuaValue v1, Varargs v2) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg(int i) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int narg() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg1() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs subargs(int start) {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class ArrayVarargs extends Varargs {
        private final Varargs r;
        private final LuaValue[] v;

        public ArrayVarargs(LuaValue[] v, Varargs r) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg(int i) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int narg() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg1() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs subargs(int start) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void copyto(LuaValue[] dest, int offset, int length) {
            throw new RuntimeException("Stub!");
        }
    }

    public static final class ArrayPartVarargs extends Varargs {
        private final int length;
        private final Varargs more;
        private final int offset;
        private final LuaValue[] v;

        ArrayPartVarargs(LuaValue[] v, int offset, int length) {
            throw new RuntimeException("Stub!");
        }

        public ArrayPartVarargs(LuaValue[] v, int offset, int length, Varargs more) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg(int i) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public int narg() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public LuaValue arg1() {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Varargs subargs(int start) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void copyto(LuaValue[] dest, int offset, int length) {
            throw new RuntimeException("Stub!");
        }
    }

    public void copyto(LuaValue[] dest, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    public Varargs dealias() {
        throw new RuntimeException("Stub!");
    }

    public static void main(String[] args) throws Throwable {
        throw new RuntimeException("Stub!");
    }
}