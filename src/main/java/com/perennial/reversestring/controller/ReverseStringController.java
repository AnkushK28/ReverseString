package com.perennial.reversestring.controller;

import com.perennial.reversestring.service.ReverseStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ReverseStringController
{
 @Autowired
private ReverseStringService reverseStringService;
@GetMapping("/reverse-string")
@ResponseBody

 public String getstringReverse(@RequestParam String str)
 {
    return reverseStringService.reverseString(str);
 }

}