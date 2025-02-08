package luaj.compiler;

import luaj.LocVars;
import luaj.Lua;
import luaj.LuaString;
import luaj.LuaValue;
import luaj.Prototype;
import luaj.Upvaldesc;

public class Constants extends Lua {
    static final int LUAI_MAXUPVAL = 255;
    static final int LUAI_MAXVARS = 200;
    public static final int MAXSTACK = 250;
    static final int NO_REG = 255;
    static final int OpArgK = 3;
    static final int OpArgN = 0;
    static final int OpArgR = 2;
    static final int OpArgU = 1;
    static final int iABC = 0;
    static final int iABx = 1;
    static final int iAsBx = 2;

    public static void _assert(boolean b) {
        throw new RuntimeException("Stub!");
    }

    public static void SET_OPCODE(InstructionPtr i, int o) {
        throw new RuntimeException("Stub!");
    }

    public static void SETARG_A(int[] code, int index, int u) {
        throw new RuntimeException("Stub!");
    }

    public static void SETARG_A(InstructionPtr i, int u) {
        throw new RuntimeException("Stub!");
    }

    public static void SETARG_B(InstructionPtr i, int u) {
        throw new RuntimeException("Stub!");
    }

    public static void SETARG_C(InstructionPtr i, int u) {
        throw new RuntimeException("Stub!");
    }

    public static void SETARG_Bx(InstructionPtr i, int u) {
        throw new RuntimeException("Stub!");
    }

    public static void SETARG_sBx(InstructionPtr i, int u) {
        throw new RuntimeException("Stub!");
    }

    public static int CREATE_ABC(int o, int a, int b, int c) {
        throw new RuntimeException("Stub!");
    }

    public static int CREATE_ABx(int o, int a, int bc) {
        throw new RuntimeException("Stub!");
    }

    public static int CREATE_Ax(int o, int a) {
        throw new RuntimeException("Stub!");
    }

    public static LuaValue[] realloc(LuaValue[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static Prototype[] realloc(Prototype[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    static LuaString[] realloc(LuaString[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static LocVars[] realloc(LocVars[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static Upvaldesc[] realloc(Upvaldesc[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static LexState.Vardesc[] realloc(LexState.Vardesc[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static LexState.Labeldesc[] grow(LexState.Labeldesc[] v, int min_n) {
        throw new RuntimeException("Stub!");
    }

    static LexState.Labeldesc[] realloc(LexState.Labeldesc[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static int[] realloc(int[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    static byte[] realloc(byte[] v, int n) {
        throw new RuntimeException("Stub!");
    }

    public static char[] realloc(char[] v, int n) {
        throw new RuntimeException("Stub!");
    }
}