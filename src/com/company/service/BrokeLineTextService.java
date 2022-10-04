package com.company.service;

import java.util.ArrayList;
import java.util.List;

public class BrokeLineTextService {
    public void brokeLines(final String text, final int quantity) {
        final String[] split = text.split(" ");
        int length = 0;
        String line = "";
        List<String> result = new ArrayList<>();

        for(int i = 0; i < split.length; i++) {

            // get word plus space item lost in split
            var word = split[i].concat(" ");

            if ((length + word.length()) > quantity) {
                // add line to result list
                result.add(line);
                // reset variables
                length = 0;
                line = "";
            }

            // get length of word plus space item lost in split
            length += word.length();
            line += word;

            // last item
            if (i == (split.length - 1) && !line.isEmpty()) {
                result.add(line);
            }
        }
        result.forEach(l -> System.out.println(l));
    }
}
