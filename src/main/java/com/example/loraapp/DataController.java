package com.example.loraapp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class DataController {

    @GetMapping("/data")
    public String getData(@RequestParam(name = "array", required = false) byte[] array, Model model) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss");
        String date = formatForDateNow.format(dateNow);

        String str1 = getStr(array[0]);
        String str2 = getStr(array[1]);
        int arg = array[2];
        String str3 = " " + arg;
        int on = 0;
        int off = 0;
        char c1 = str1.charAt(0);
        if(c1 == '0'){
            off = off + 1 ;
        }
        else{
            on++;
        }

        char c2 = str1.charAt(1);

        if(c2 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }

        char c3 = str1.charAt(2);
        if(c3 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c4 = str1.charAt(3);
        if(c4 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c5 = str1.charAt(4);
        if(c5 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c6 = str1.charAt(5);
        if(c6 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c7 = str1.charAt(6);
        if(c7 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c8 = str1.charAt(7);
        if(c8 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }

        char c9 = str2.charAt(0);
        if(c9 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c10 = str2.charAt(1);
        if(c10 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c11 = str2.charAt(2);
        if(c11 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c12 = str2.charAt(3);
        if(c12 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c13 = str2.charAt(4);
        if(c13 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c14 = str2.charAt(5);
        if(c14 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c15 = str2.charAt(6);
        if(c15 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
        char c16 = str2.charAt(7);
        if(c16 == '0'){
            off = off + 1;
        }
        else{
            on++;
        }
         double procent1 = off * 6.25;
         double procent2 = on * 6.25;
        System.out.println(procent1 + " " + procent2);
        model.addAttribute("procent1", procent1);
        model.addAttribute("procent2",procent2);
        model.addAttribute("c1", c1);
        model.addAttribute("c2", c2);
        model.addAttribute("c3", c3);
        model.addAttribute("c4", c4);
        model.addAttribute("c5", c5);
        model.addAttribute("c6", c6);
        model.addAttribute("c7", c7);
        model.addAttribute("c8", c8);
        model.addAttribute("c9", c9);
        model.addAttribute("c10", c10);
        model.addAttribute("c11", c11);
        model.addAttribute("c12", c12);
        model.addAttribute("c13", c13);
        model.addAttribute("c14", c14);
        model.addAttribute("c15", c15);
        model.addAttribute("c16", c16);
        model.addAttribute("date", date);
        model.addAttribute("str3", str3);
        return "data";
    }

    public String getStr(byte b) {
        String str = Integer.toBinaryString(b);
        if (str.length() < 8) {
            for (; str.length() != 8; ) {
                str = str + "0";
            }

        }
        return str;
    }



}