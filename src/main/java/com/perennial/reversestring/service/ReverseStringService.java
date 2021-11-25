package com.perennial.reversestring.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.logging.Logger;

@Service
public class ReverseStringService
{
    public String reverseString(String str) {
        char ch[] = str.toCharArray();
        char temp;
        for (int i = 0, j = ch.length - 1; i < (ch.length / 2); i++, j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);

    }
}

