package com.company;

import com.company.service.BrokeLineTextService;

public class Main {

    public static void main(String[] args) {
        BrokeLineTextService service = new BrokeLineTextService();
        final String text = "In 1991, while studying computer science at University of Helsinki, Linus Torvalds began a project that later became the Linux kernel. He wrote "
            + "the program specifically for the hardware he was using and independent of an operating system because he wanted to use the functions of his "
            + "new PC with an 80386 processor. Development was done on MINIX using the GNU C Compiler.";

        service.brokeLines(text, 40);
    }
}
