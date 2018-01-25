package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String showIndex()
    {

//        Scanner to accept user input
        Scanner keyboard = new Scanner(System.in);
//        Saving string kitfo to ethiopian food String variable
        String ethiopianfood ="Kitfo and tiresiga!";
//        this line is printing the string variable ethiopian
        System.out.println(ethiopianfood);



        System.out.println("delicious");
//        Saving string user input from whatever user types
        String userinput = keyboard.nextLine();
//        this line is printing breakfast menu plus the string ethiopian food and user input string
        System.out.println("breakfast menu"+ethiopianfood+userinput);
        return userinput;

    }

}


