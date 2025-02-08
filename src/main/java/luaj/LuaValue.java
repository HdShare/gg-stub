package luaj;

public abstract class LuaValue extends Varargs {
    private static final int MAXSTACK = 250;
    private static final int MAXTAGLOOP = 100;
    public static final int TBOOLEAN = 1;
    public static final int TFUNCTION = 6;
    public static final int TINT = -2;
    public static final int TNIL = 0;
    public static final int TNONE = -1;
    public static final int TNUMBER = 3;
    public static final int TSTRING = 4;
    public static final int TTABLE = 5;
    public static final int TTHREAD = 8;
    public static final int TUSERDATA = 7;
    public static final int TVALUE = 9;
    public static final String[] TYPE_NAMES = {"nil", "boolean", "lightuserdata", "number", "string", "table", "function", "userdata", "thread", "value"};
    public static final LuaValue NIL = new LuaNil();
    public static final LuaBoolean TRUE = new LuaBoolean(true);
    public static final LuaBoolean FALSE = new LuaBoolean(false);
    public static final LuaValue NONE = new None(null);
    public static final LuaNumber ZERO = LuaLong.valueOf(0L);
    public static final LuaNumber ONE = LuaLong.valueOf(1L);
    public static final LuaNumber MINUSONE = LuaLong.valueOf(-1L);
    public static final LuaValue[] NOVALS = new LuaValue[0];
    public static final LuaString ENV = LuaString.rawValueOf("_ENV");
    public static final LuaString INDEX = LuaString.rawValueOf("__index");
    public static final LuaString NEWINDEX = LuaString.rawValueOf("__newindex");
    public static final LuaString CALL = LuaString.rawValueOf("__call");
    public static final LuaString MODE = LuaString.rawValueOf("__mode");
    public static final LuaString METATABLE = LuaString.rawValueOf("__metatable");
    public static final LuaString ADD = LuaString.rawValueOf("__add");
    public static final LuaString SUB = LuaString.rawValueOf("__sub");
    public static final LuaString DIV = LuaString.rawValueOf("__div");
    public static final LuaString MUL = LuaString.rawValueOf("__mul");
    public static final LuaString POW = LuaString.rawValueOf("__pow");
    public static final LuaString MOD = LuaString.rawValueOf("__mod");
    public static final LuaString UNM = LuaString.rawValueOf("__unm");
    public static final LuaString LEN = LuaString.rawValueOf("__len");
    public static final LuaString EQ = LuaString.rawValueOf("__eq");
    public static final LuaString LT = LuaString.rawValueOf("__lt");
    public static final LuaString LE = LuaString.rawValueOf("__le");
    public static final LuaString TOSTRING = LuaString.rawValueOf("__tostring");
    public static final LuaString CONCAT = LuaString.rawValueOf("__concat");
    public static final LuaString IDIV = LuaString.rawValueOf("__idiv");
    public static final LuaString BNOT = LuaString.rawValueOf("__bnot");
    public static final LuaString BAND = LuaString.rawValueOf("__band");
    public static final LuaString BOR = LuaString.rawValueOf("__bor");
    public static final LuaString BXOR = LuaString.rawValueOf("__bxor");
    public static final LuaString SHL = LuaString.rawValueOf("__shl");
    public static final LuaString SHR = LuaString.rawValueOf("__shr");
    public static final LuaString NAME = LuaString.rawValueOf("__name");
    public static final LuaString EMPTYSTRING = LuaString.rawValueOf("");
    public static final LuaString ZEROSTRING = LuaString.rawValueOf("0");
    public static final LuaString ONESTRING = LuaString.rawValueOf("1");
    public static final LuaValue[] NILS = new LuaValue[250];

    public abstract int type();

    public abstract String typename();

    static {
        for (int i = 0; i < 250; i++) {
            NILS[i] = NIL;
        }
    }

    public boolean isboolean() {
        throw new RuntimeException("Stub!");
    }

    public boolean isclosure() {
        throw new RuntimeException("Stub!");
    }

    public boolean isfunction() {
        throw new RuntimeException("Stub!");
    }

    public boolean isint() {
        throw new RuntimeException("Stub!");
    }

    public boolean isinttype() {
        throw new RuntimeException("Stub!");
    }

    public boolean isintnumber() {
        throw new RuntimeException("Stub!");
    }

    public boolean islongnumber() {
        throw new RuntimeException("Stub!");
    }

    public boolean islong() {
        throw new RuntimeException("Stub!");
    }

    public boolean isnil() {
        throw new RuntimeException("Stub!");
    }

    public boolean isnumber() {
        throw new RuntimeException("Stub!");
    }

    public boolean isstring() {
        throw new RuntimeException("Stub!");
    }

    public boolean isthread() {
        throw new RuntimeException("Stub!");
    }

    public boolean istable() {
        throw new RuntimeException("Stub!");
    }

    public boolean toboolean() {
        throw new RuntimeException("Stub!");
    }

    public byte tobyte() {
        throw new RuntimeException("Stub!");
    }

    public char tochar() {
        throw new RuntimeException("Stub!");
    }

    public double todouble() {
        throw new RuntimeException("Stub!");
    }

    public float tofloat() {
        throw new RuntimeException("Stub!");
    }

    public int toint() {
        throw new RuntimeException("Stub!");
    }

    public long tolong() {
        throw new RuntimeException("Stub!");
    }

    public short toshort() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String tojstring() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue tonumber() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue tostring() {
        throw new RuntimeException("Stub!");
    }

    public boolean optboolean(boolean defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaClosure optclosure(LuaClosure defval) {
        throw new RuntimeException("Stub!");
    }

    public double optdouble(double defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaFunction optfunction(LuaFunction defval) {
        throw new RuntimeException("Stub!");
    }

    public int optint(int defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaLong optinteger(LuaLong defval) {
        throw new RuntimeException("Stub!");
    }

    public long optlong(long defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaNumber optnumber(LuaNumber defval) {
        throw new RuntimeException("Stub!");
    }

    public String optjstring(String defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaString optstring(LuaString defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaTable opttable(LuaTable defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaThread optthread(LuaThread defval) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue optvalue(LuaValue defval) {
        throw new RuntimeException("Stub!");
    }

    public boolean checkboolean() {
        throw new RuntimeException("Stub!");
    }

    public LuaClosure checkclosure() {
        throw new RuntimeException("Stub!");
    }

    public double checkdouble() {
        throw new RuntimeException("Stub!");
    }

    public LuaFunction checkfunction() {
        throw new RuntimeException("Stub!");
    }

    public Globals checkglobals() {
        throw new RuntimeException("Stub!");
    }

    public int checkint() {
        throw new RuntimeException("Stub!");
    }

    public LuaLong checkinteger() {
        throw new RuntimeException("Stub!");
    }

    public long checklong() {
        throw new RuntimeException("Stub!");
    }

    public LuaNumber checknumber() {
        throw new RuntimeException("Stub!");
    }

    public LuaNumber checknumber(String msg) {
        throw new RuntimeException("Stub!");
    }

    public String checkjstring() {
        throw new RuntimeException("Stub!");
    }

    public LuaString checkstring() {
        throw new RuntimeException("Stub!");
    }

    public LuaTable checktable() {
        throw new RuntimeException("Stub!");
    }

    public LuaThread checkthread() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue checknotnil() {
        throw new RuntimeException("Stub!");
    }

    public boolean isvalidkey() {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue error(String message) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue error(String message, Throwable cause) {
        throw new RuntimeException("Stub!");
    }

    public static void assert_(boolean b, String msg) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue argerror(String expected) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue argerror(int iarg, String msg) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue argerror(int iarg, String funcname, String msg) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue typerror(String expected) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue unimplemented(String fun) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue illegal(String op, String typename) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue lenerror() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue aritherror() {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue aritherror(String fun) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue compareerror(String rhs) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue compareerror(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue get(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue get(int key) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue get(String key) {
        throw new RuntimeException("Stub!");
    }

    public void set(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public void set(int key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public void set(int key, String value) {
        throw new RuntimeException("Stub!");
    }

    public void set(String key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public void set(String key, double value) {
        throw new RuntimeException("Stub!");
    }

    public void set(String key, int value) {
        throw new RuntimeException("Stub!");
    }

    public void set(String key, long value) {
        throw new RuntimeException("Stub!");
    }

    public void set(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue rawget(LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue rawget(int key) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue rawget(String key) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(int key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(int key, String value) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(String key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(String key, double value) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(String key, int value) {
        throw new RuntimeException("Stub!");
    }

    public void rawset(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public void rawsetlist(int key0, Varargs values) {
        throw new RuntimeException("Stub!");
    }

    public void presize(int i) {
        throw new RuntimeException("Stub!");
    }

    public Varargs next(LuaValue index) {
        throw new RuntimeException("Stub!");
    }

    public Varargs inext(LuaValue index) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue load(LuaValue library) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public LuaValue arg(int index) {
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

    public LuaValue getmetatable() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue setmetatable(LuaValue metatable) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue call() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue call(LuaValue arg) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue call(String arg) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue call(LuaValue arg1, LuaValue arg2) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue method(String name) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue method(LuaValue name) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue method(String name, LuaValue arg) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue method(LuaValue name, LuaValue arg) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue method(String name, LuaValue arg1, LuaValue arg2) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue method(LuaValue name, LuaValue arg1, LuaValue arg2) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invoke() {
        throw new RuntimeException("Stub!");
    }

    public Varargs invoke(Varargs args) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invoke(LuaValue arg, Varargs varargs) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invoke(LuaValue arg1, LuaValue arg2, Varargs varargs) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invoke(LuaValue[] args) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invoke(LuaValue[] args, Varargs varargs) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invokemethod(String name) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invokemethod(LuaValue name) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invokemethod(String name, Varargs args) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invokemethod(LuaValue name, Varargs args) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invokemethod(String name, LuaValue[] args) {
        throw new RuntimeException("Stub!");
    }

    public Varargs invokemethod(LuaValue name, LuaValue[] args) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue callmt() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue not() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue neg() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue bnot() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue len() {
        throw new RuntimeException("Stub!");
    }

    public int length() {
        throw new RuntimeException("Stub!");
    }

    public int rawlen() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue eq(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public boolean eq_b(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue neq(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public boolean neq_b(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public boolean raweq(LuaValue val) {
        throw new RuntimeException("Stub!");
    }

    public boolean raweq(LuaString val) {
        throw new RuntimeException("Stub!");
    }

    public static final boolean eqmtcall(LuaValue lhs, LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue add(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue sub(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue mul(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue pow(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue div(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue idiv(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue band(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue bor(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue bxor(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue shl(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue shr(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue mod(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public String typenamemt() {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue arithmt(LuaValue tag, LuaValue op1, LuaValue op2) {
        throw new RuntimeException("Stub!");
    }

    public static String tagToOp(LuaValue tag) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue bitwisemt(LuaValue tag, LuaValue op1, LuaValue op2) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue lt(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public boolean lt_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue lteq(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public boolean lteq_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue gt(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public boolean gt_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue gteq(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public boolean gteq_b(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue comparemt(LuaValue tag, LuaValue op1) {
        throw new RuntimeException("Stub!");
    }

    public int strcmp(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public int strcmp(LuaString rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue concat(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue concatTo(LuaValue lhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue concatTo(LuaNumber lhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue concatTo(LuaString lhs) {
        throw new RuntimeException("Stub!");
    }

    public Buffer buffer() {
        throw new RuntimeException("Stub!");
    }

    public Buffer concat(Buffer rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue concatmt(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue and(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue or(LuaValue rhs) {
        throw new RuntimeException("Stub!");
    }

    public boolean testfor_b(LuaValue limit, LuaValue step) {
        throw new RuntimeException("Stub!");
    }

    public LuaString strvalue() {
        throw new RuntimeException("Stub!");
    }

    public LuaValue strongvalue() {
        throw new RuntimeException("Stub!");
    }

    public static LuaBoolean valueOf(boolean b) {
        throw new RuntimeException("Stub!");
    }

    public static LuaLong valueOf(long l) {
        throw new RuntimeException("Stub!");
    }

    public static LuaNumber valueOf(double d) {
        throw new RuntimeException("Stub!");
    }

    public static LuaNumber numberOf(String s) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(String s) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(byte[] bytes) {
        throw new RuntimeException("Stub!");
    }

    public static LuaString valueOf(byte[] bytes, int off, int len) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable tableOf() {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable tableOf(Varargs varargs, int firstarg) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable tableOf(int narray, int nhash) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable listOf(LuaValue[] unnamedValues) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable listOf(LuaValue[] unnamedValues, Varargs lastarg) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable tableOf(LuaValue[] namedValues) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable tableOf(LuaValue[] namedValues, LuaValue[] unnamedValues) {
        throw new RuntimeException("Stub!");
    }

    public static LuaTable tableOf(LuaValue[] namedValues, LuaValue[] unnamedValues, Varargs lastarg) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue gettable(LuaValue t, LuaValue key) {
        throw new RuntimeException("Stub!");
    }

    public static boolean settable(LuaValue t, LuaValue key, LuaValue value) {
        throw new RuntimeException("Stub!");
    }

    public LuaValue metatag(LuaValue tag) {
        throw new RuntimeException("Stub!");
    }

    protected LuaValue checkmetatag(LuaValue tag, String reason) {
        throw new RuntimeException("Stub!");
    }

    public static Metatable metatableOf(LuaValue mt) {
        throw new RuntimeException("Stub!");
    }

    private void indexerror(String key) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs varargsOf(LuaValue[] v) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs varargsOf(LuaValue[] v, Varargs r) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs varargsOf(LuaValue[] v, int offset, int length) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs varargsOf(LuaValue[] v, int offset, int length, Varargs more) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs varargsOf(LuaValue v, Varargs r) {
        throw new RuntimeException("Stub!");
    }

    public static Varargs varargsOf(LuaValue v1, LuaValue v2, Varargs v3) {
        throw new RuntimeException("Stub!");
    }

    public Varargs onInvoke(Varargs args, boolean tailcall) {
        throw new RuntimeException("Stub!");
    }

    public void initupvalue1(LuaValue env) {
        throw new RuntimeException("Stub!");
    }

    private static final class None extends LuaNil {
        private None() {
            throw new RuntimeException("Stub!");
        }

        None(None none) {
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
        public String tojstring() {
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

    @Override
    public Varargs subargs(int start) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue parseHex(CharSequence str) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue parseNumber(String str, LuaValue fallback) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue parseNumber(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeprecated() {
        throw new RuntimeException("Stub!");
    }

    public static void main(String[] args) throws Throwable {
        throw new RuntimeException("Stub!");
    }
}