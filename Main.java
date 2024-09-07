package dev.yashodha.playground;

import dev.yashodha.playground.libc.LibC;

public class Main {
    public static void main(String[] args) {
        // System.out.println("\033[31mHello world!\033[0m");z

        LibC.Termios termios = new LibC.Termios();
        int rc = LibC.INSTANCE.tcgetattr(LibC.SYSTEM_OUT_FD, termios);

        if (rc != 0) {
            System.err.println("There was a problem calling tcgetattr");
            System.exit(rc);
        }

    }


}
